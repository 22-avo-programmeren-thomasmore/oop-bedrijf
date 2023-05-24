public class Magazijn extends Gebouw {

    public Magazijn(int oppervlakte) {
        super(oppervlakte);
    }

    @Override
    public double getBelasting() {
        double belasting = 0.35 * this.getOppervlakte();
        return belasting;
    }

}
