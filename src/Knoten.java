public class Knoten {
    private Knoten larger;
    private Knoten smaller;
    private Buch aE;

    public void ausgabe(){
        System.out.println(aE);
        if(smaller!=null)
        this.smaller.ausgabe();
        if (larger!=null)
        this.larger.ausgabe();
    }

    Knoten(Buch pBuch){
        setaE(pBuch);
    }

    public Buch getaE() {
        return aE;
    }
    public Knoten getLarger() {
        return larger;
    }

    public Knoten getSmaller() {
        return smaller;
    }
    public void setSmaller(Knoten pSmaller) {
        smaller = pSmaller;
    }

    public void setLarger(Knoten pLarger) {
        larger = pLarger;
    }
    public void setaE(Buch pAE) {
        aE = pAE;
    }

}
