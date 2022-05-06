public class Bush extends Plant{
    public Bush(double height, double width) {
        super(height, width);
    }

    @Override
    public String toString() {
        return "Bush{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public void grow() {
        width += 0.05;
    }
}
