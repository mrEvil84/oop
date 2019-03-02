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
    void shouldAddMultipleValues() {

        sut.add(10).add(10).add(10);

        assertEquals(30, sut.getAddResult());
    }

    @Test
    void shouldAddTwoParams() {

        assertEquals(30, Calculator.add(15,15));
    }
}