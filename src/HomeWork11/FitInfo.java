package HomeWork11;

public class FitInfo {

    private double weight;
    private String pressure;
    private int dailySteps;

    public FitInfo(double weight, String pressure, int dailySteps) {
        this.weight = weight;
        this.pressure = pressure;
        this.dailySteps = dailySteps;
    }

    @Override
    public String toString() {
        return "FitInfo{" +
                "weight=" + weight +
                ", pressure='" + pressure + '\'' +
                ", dailySteps=" + dailySteps +
                '}';
    }
}
