package everest.engineering;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void shouldEquateProbabilityOneWithAnotherProbabilityOne() throws InvalidProbabilityException {
        Probability probabilityOne = new Probability(1);
        Probability anotherProbabilityOne = new Probability(1);

        assertEquals(probabilityOne, anotherProbabilityOne);
    }

    @Test
    void shouldReturnTrueWhenHashCodeIsSame() throws InvalidProbabilityException {
        Probability probabilityOne = new Probability(1);

        assertEquals(probabilityOne, probabilityOne);
    }

    @Test
    void shouldThrowInvalidProbabilityValueExceptionWhenProbabilityIsMoreThan1() {
        assertThrows(InvalidProbabilityException.class, () -> new Probability(1.1));
    }

    @Test
    void shouldThrowInvalidProbabilityValueExceptionWhenProbabilityIsLessThan0() {
        assertThrows(InvalidProbabilityException.class, () -> new Probability(-1.2));
    }

}