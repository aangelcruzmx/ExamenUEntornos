package es.iesmz.test;

import es.iesmz.test.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void changue1() {
        assertEquals( 28.37F, new Money().changue(TipoMoneda.EUR, TipoMoneda.USD, 23.88F), 0.01);
    }

    @Test
    void changue2() {
        assertEquals( 1165.83F, new Money().changue(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0F), 0.01);
    }
    @Test
    void changue3() {
        assertEquals( 201.21F, new Money().changue(TipoMoneda.EUR, TipoMoneda.GBP, 234.56F), 0.01);
    }
    @Test
    void changue4() {
        assertEquals( 37.51F, new Money().changue(TipoMoneda.USD, TipoMoneda.EUR, 44.56F), 0.01);
    }
    @Test
    void changue5() {
        assertEquals( 138.49F, new Money().changue(TipoMoneda.GBP, TipoMoneda.USD, 100.0F), 0.02);
    }
    @Test
    void changue6() {
        assertEquals( 722.14F, new Money().changue(TipoMoneda.USD, TipoMoneda.GBP, 1000.0F), 0.01);
    }
    @Test
    void changue7() {
        assertEquals( -1F, new Money().changue(TipoMoneda.PTS, TipoMoneda.EUR, 100.0F), 0.01);
    }
    @Test
    void changue8() {
        assertEquals( -1F, new Money().changue(TipoMoneda.EUR, TipoMoneda.PTS, 123.3F), 0.01);
    }
    @Test
    void changue9() {
        assertEquals( -1F, new Money().changue(TipoMoneda.USD, TipoMoneda.EUR, -167.34F), 0.01);
    }




}