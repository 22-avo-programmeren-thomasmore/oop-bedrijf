public class Kantoor extends Gebouw {
    public Kantoor(int oppervlakte) {
        super(oppervlakte);
    }

    @Override
    public double getBelasting() {
        double belasting = 1 * this.getOppervlakte();
        return belasting;
    }

}
