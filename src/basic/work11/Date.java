package basic.work11;

public class Date {

    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;

    public Date(int birthDay, int birthMonth, int birthYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Date{" +
                "birthDay=" + birthDay +
                ", birthMonth=" + birthMonth +
                ", birthYear=" + birthYear +
                '}';
    }

    public int getBirthYear() {
        return birthYear;
    }
}
