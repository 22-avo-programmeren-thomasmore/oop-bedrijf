public class Fabriek extends Gebouw {
    public Fabriek(int oppervlakte) {
        super(oppervlakte);
    }

    @Override
    public double getBelasting() {
        double belasting = 0.1 * this.getOppervlakte();
        return belasting;
    }

}
