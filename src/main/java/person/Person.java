package person;

public class Person {

    private static final int MAX_BMI = 24;
    private static final double MIN_BMI = 18;
    static final String FATTER = "fatter";
    static final String HEALTHY = "healthy";
    static final String THINNER = "thinner";
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public String getBMI() {
        if (weight / height / height >= MAX_BMI) {
            return FATTER;
        }
        if (weight / height / height < MIN_BMI) {
            return THINNER;
        }
        return HEALTHY;
    }
}
