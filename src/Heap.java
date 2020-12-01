public class Heap {
    public Knoten first;



    public boolean insert(Buch pBuch){
        Knoten tmp=first;
        if(first==null) {
            first=new Knoten(pBuch);
            return true;
        }
        boolean h=true;
        while (h=true) {
            if (pBuch.getIsbn() >= tmp.getaE().getIsbn()) {
                if (tmp.getLarger() != null) {
                    tmp=tmp.getLarger();
                }else{
                    tmp.setLarger(new Knoten(pBuch));
                    h=false;
                    break;
                }
            }
            if (pBuch.getIsbn() < tmp.getaE().getIsbn()) {
                if (tmp.getSmaller() != null) {
                    tmp=tmp.getSmaller();
                }else{
                    tmp.setSmaller(new Knoten(pBuch));
                    h=false;
                    break;
                }
            }
        }
        return true;

    }

    public Buch get(int pN){
        boolean h=true
        while(h){

        }
    }
    public void ausgabe(){
        first.ausgabe();
    }


    public Knoten getFirst() {
        return first;
    }




    public void setFirst(Knoten pFirst) {
        first = pFirst;
    }


}
