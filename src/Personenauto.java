public class Personenauto extends Voertuig {
    private String merk;
    private int vermogen;
    private int aankoopprijs;
    private int zitPlaatsen;

    public Personenauto(String nummerplaat, String merk, int vermogen, int aankoopprijs) {
        super(nummerplaat);
        this.merk = merk;
        this.vermogen = vermogen;
        this.aankoopprijs = aankoopprijs;
        this.zitPlaatsen = 5;
    }

    @Override
    public double getBelasting() {
        double belasting = 1.1 * this.vermogen + 33 * this.zitPlaatsen;
        if (this.aankoopprijs > 20000) {
            belasting += 400;
        }
        return belasting;
    }
}

