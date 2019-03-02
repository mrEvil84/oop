import oop.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator sut;

    @BeforeEach
    void setUp() {
        this.sut = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {

        sut.add(10).add(10).add(10);


        assertEquals(30, sut.getAddResult());
    }
}