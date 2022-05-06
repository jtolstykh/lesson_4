public class Tree extends Plant {
    public Tree(double height, double width) {
        super(height, width);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public void grow() {
        height += 0.9;
    }
}
