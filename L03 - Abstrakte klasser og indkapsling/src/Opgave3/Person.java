package Opgave3;

public class Person {
    private String navn;
    private String adresse;

    public Person(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
