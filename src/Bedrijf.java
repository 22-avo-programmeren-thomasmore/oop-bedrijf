import java.util.ArrayList;

public class Bedrijf {
    private ArrayList<Voertuig> voertuigen;

    public Bedrijf() {
        this.voertuigen = new ArrayList<>();
    }

    public void add(Voertuig voertuig) {
        this.voertuigen.add(voertuig);
    }

    public double getBelasting() {
        double belasting = 0;
        for (Voertuig voertuig : voertuigen) {
            belasting += voertuig.getBelasting();

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
        Bedrijf b = new Bedrijf();
        b.add(w1);
        b.add(w2);
        b.add(w3);
        b.add(w4);
        b.add(w5);
        b.add(v1);
        b.add(v2);
        // Op 2 cijfers na de komma afronden met de statische methode format van de klasse String
        // %.2f betekent de double b.getBelasting() die volgt na de tekst afronden op 2 cijfers
        System.out.printf(String.format ("Totale belasting: %.2f",b.getBelasting()));
    }

}
