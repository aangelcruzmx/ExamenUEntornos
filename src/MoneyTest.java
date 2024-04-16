import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void changue1() {
        assertEquals( 28.37F, new Money().changue(TipoMoneda.EUR,TipoMoneda.USD, 23.88F), 0.01);
    }



}