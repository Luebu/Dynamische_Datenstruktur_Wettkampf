public class Heap {
    public Heap first;
    private Heap before;
    private Heap larger;
    private Heap smaller;
    private Buch aE;

    Heap(Buch pBuch){
        setaE(pBuch);
    }

    public boolean insert(Buch pBuch){
        Heap tmp=first;
        if(first==null) {
            first.setaE(pBuch);
            return true;
        }
        boolean h=true;
        while (h=true) {
            if (pBuch.getIsbn() >= tmp.getaE().getIsbn()) {
                if (tmp.getLarger() != null) {
                    tmp=tmp.getLarger();
                }else{
                    tmp.setLarger(new Heap(pBuch));
                    h=false;
                }
            }
            if (pBuch.getIsbn() < tmp.getaE().getIsbn()) {
                if (tmp.getSmaller() != null) {
                    tmp=tmp.getSmaller();
                }else{
                    tmp.setSmaller(new Heap(pBuch));
                    h=false;
                }
            }
        }
        return true;

    }

    public Buch getaE() {
        return aE;
    }

    public Heap getBefore() {
        return before;
    }

    public Heap getFirst() {
        return first;
    }

    public Heap getLarger() {
        return larger;
    }

    public Heap getSmaller() {
        return smaller;
    }

    public void setSmaller(Heap pSmaller) {
        smaller = pSmaller;
    }

    public void setLarger(Heap pLarger) {
        larger = pLarger;
    }

    public void setBefore(Heap pBefore) {
        before = pBefore;
    }

    public void setFirst(Heap pFirst) {
        first = pFirst;
    }

    public void setaE(Buch pAE) {
        aE = pAE;
    }
}
