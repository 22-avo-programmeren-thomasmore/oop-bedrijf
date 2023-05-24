abstract public class Gebouw implements IBelasting {
    private int oppervlakte;

    public Gebouw(int oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    public int getOppervlakte() {
        return oppervlakte;
    }

}
