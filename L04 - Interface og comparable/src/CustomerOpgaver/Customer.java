package CustomerOpgaver;

public class Customer implements Comparable<Customer> {

    private String fornavn;
    private String efternavn;
    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer o) {
        if (this.efternavn.compareTo(o.efternavn) != 0) {
            return this.efternavn.compareTo(o.efternavn);
        } else if (this.fornavn.compareTo(o.fornavn) != 0) {
            return this.fornavn.compareTo(o.fornavn);
        } else if (this.alder > o.alder) {
            return 1;
        } else if (this.alder < o.alder) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return fornavn + " " + efternavn + " " + alder;
    }
}
