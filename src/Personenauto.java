public class Personenauto extends Voertuig {
    private String merk;
    private int vermogen;
    private int aankoopprijs;

    public Personenauto(String nummerplaat, String merk, int vermogen, int aankoopprijs) {
        super(nummerplaat);
        this.merk = merk;
        this.vermogen = vermogen;
        this.aankoopprijs = aankoopprijs;
    }

    @Override
    public double getBelasting() {
        double belasting = 1.1 * this.vermogen;
        if (this.aankoopprijs > 20000) {
            belasting += 400;
        }
        return belasting;
    }
}

