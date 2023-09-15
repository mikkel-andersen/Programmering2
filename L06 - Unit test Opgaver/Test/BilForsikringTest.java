import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @org.junit.jupiter.api.Test
    void beregnPraemie() {
        //Arrange

        BilForsikring bilforsikring = new BilForsikring();
        bilforsikring.setGrundpaemie(1000);

        int alder = 18;
        boolean isKvinde = true;
        int skadeFrieAar = 0;

        //Act
        double praemie = bilforsikring.beregnPraemie(alder, isKvinde, skadeFrieAar);

        //Assert
        assertEquals(1187.5, praemie);
    }
}