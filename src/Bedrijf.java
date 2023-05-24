import java.util.ArrayList;

public class Bedrijf implements IBelasting {
    private ArrayList<IBelasting> onderdelen;

    public Bedrijf() {
        this.onderdelen = new ArrayList<>();
    }

    public void add(IBelasting onderdeel) {
        this.onderdelen.add(onderdeel);
    }

    public double getBelasting() {
        double belasting = 0;
        for (IBelasting onderdeel : onderdelen) {
            belasting += onderdeel.getBelasting();
        }
        return belasting;
    }

    public static void main(String[] args) {
        Personenauto w1 = new Personenauto("RET325", "Mercedes", 215, 34000);
        Personenauto w2 = new Personenauto("AVF548", "VW", 167, 24000);
        Personenauto w3 = new Personenauto("RLN841", "Renault", 104, 18500);
        Personenauto w4 = new Personenauto("AFC356", "Renault", 55, 11000);
        Personenauto w5 = new Personenauto("DET485", "Renault", 55, 11000);
        Vrachtwagen v1 = new Vrachtwagen("YER412", 18.5);
        Vrachtwagen v2 = new Vrachtwagen("GTZ652", 8);
        Bus b1 = new Bus("EDF889", 22, 7);
        Bus b2 = new Bus("TRU496", 14, 3);
        Kantoor k1 = new Kantoor(136);
        Magazijn m1 = new Magazijn(520);
        Fabriek f1 = new Fabriek(155);
        Bedrijf b = new Bedrijf();
        b.add(w1);
        b.add(w2);
        b.add(w3);
        b.add(w4);
        b.add(w5);
        b.add(v1);
        b.add(v2);
        b.add(b1);
        b.add(b2);
        b.add(k1);
        b.add(m1);
        b.add(f1);
        // Op 2 cijfers na de komma afronden met de statische methode format van de klasse String
        // %.2f betekent de double b.getBelasting() die volgt na de tekst afronden op 2 cijfers
        System.out.printf(String.format("Totale belasting: %.2f", b.getBelasting()));
    }

}
