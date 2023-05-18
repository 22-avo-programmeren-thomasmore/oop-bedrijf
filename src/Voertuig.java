abstract public class Voertuig {
    private String nummerplaat;

    public Voertuig(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    abstract public double getBelasting();

}
