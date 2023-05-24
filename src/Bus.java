public class Bus extends Voertuig {
    private int zitPlaatsen;
    private double laadRuimte;

    public Bus(String nummerplaat, int zitPlaatsen, double laadRuimte) {
        super(nummerplaat);
        this.zitPlaatsen = zitPlaatsen;
        this.laadRuimte = laadRuimte;
    }

    @Override
    public double getBelasting() {
        double belasting = 33 * this.zitPlaatsen + 11 * this.laadRuimte;
        return belasting;
    }
}
