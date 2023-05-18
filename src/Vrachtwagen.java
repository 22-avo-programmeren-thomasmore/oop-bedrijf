public class Vrachtwagen extends Voertuig {
    private double laadVermogen;

    public Vrachtwagen(String nummerplaat, double laadVermogen) {
        super(nummerplaat);
        this.laadVermogen = laadVermogen;
    }

    @Override
    public double getBelasting() {
        double belasting = 69 * this.laadVermogen;
        return belasting;
    }

}
