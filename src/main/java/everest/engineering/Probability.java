package everest.engineering;

public class Probability {
    private final double value;

    public Probability(double value) throws InvalidProbabilityException {
        validate(value);
        this.value = value;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        return Double.compare(this.value, ((Probability) that).value) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private void validate(double value) throws InvalidProbabilityException {
        if (value > 1 || value < 0) {
            throw new InvalidProbabilityException();
        }
    }
}
