public class Buch {
    private int isbn;
    private String name;

    Buch(String pName, int pIsbn){
        name=pName;
        isbn=pIsbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public void setIsbn(int pIsbn) {
        isbn = pIsbn;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String toString() {
        return "Buch{" +
                "isbn=" + isbn +
                ", Name='" + name + '\'' +
                '}';
    }
}
