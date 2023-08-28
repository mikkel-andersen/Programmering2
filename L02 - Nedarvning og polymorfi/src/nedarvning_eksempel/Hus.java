package nedarvning_eksempel;

public class Hus extends Beboelse {

    private int grundKvm;

    public Hus(String adresse, int kvm, int grundKvm) {
        super(adresse, kvm);
        this.grundKvm = grundKvm;
    }


    public int ejendomsVaerdi() {
        return super.getKvm() * 290 + grundKvm * 40;
    }


}
