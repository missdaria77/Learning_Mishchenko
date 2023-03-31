package home.work6;
//to use as improvement
public class Discount {
    private boolean applying;
    private int discountAmount;

    public Discount() {
        this.applying = false;
    }

    public Discount(boolean applying, int discountAmount) {
        this.applying = applying;
        this.discountAmount = discountAmount;
    }

    public boolean isApplying() {
        return applying;
    }

    public void setApplying(boolean applying) {
        this.applying = applying;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "applying=" + applying +
                ", discountAmount=" + discountAmount +
                '}';
    }
}
