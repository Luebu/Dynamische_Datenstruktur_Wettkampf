public class Main {
//Bücher in einem Heap nach der isbn Speichern

    public static void main(String[] args) {
	Heap h = new Heap();
	Buch b1 = new Buch("Mein Kampf",18);
	Buch b2 = new Buch("Harry Potter",8);
	Buch b3 = new Buch("Percy Jackson", 15);
	Buch b4 = new Buch("Herr der Ringe", 1);

	h.insert(b1);
	h.insert(b2);
	h.insert(b3);
	h.insert(b4);
	h.ausgabe();
    }
}
