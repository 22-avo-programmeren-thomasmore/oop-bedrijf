abstract public class Voertuig implements IBelasting {
    private String nummerplaat;

    public Voertuig(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    abstract public double getBelasting();

}
