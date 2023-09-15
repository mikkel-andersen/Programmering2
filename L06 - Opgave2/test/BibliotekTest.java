import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {

    @org.junit.jupiter.api.Test
    void beregnBøde_1dag_barn() {
        //Arrange
        LocalDate beregnetDato = LocalDate.of(2023,10,28);
        LocalDate faktiskDato = LocalDate.of(2023,10,29);
        boolean voksen = false;
        Bibliotek bibliotek = new Bibliotek();
        int forventetBøde = 10;

        //Act
        int bøde = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);



        //Assert

        assertEquals(forventetBøde, bøde);
    }


    @org.junit.jupiter.api.Test
    void beregnBøde_1dag_voksen() {
        //Arrange
        LocalDate beregnetDato = LocalDate.of(2023,10,28);
        LocalDate faktiskDato = LocalDate.of(2023,10,29);
        boolean voksen = true;
        Bibliotek bibliotek = new Bibliotek();
        int forventetBøde = 20;

        //Act
        int bøde = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);



        //Assert

        assertEquals(forventetBøde, bøde);
    }


}