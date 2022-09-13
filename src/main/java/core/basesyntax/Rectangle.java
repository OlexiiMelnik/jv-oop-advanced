package core.basesyntax;

public class Rectangle extends Figure {
    private int leftSide;
    private int rightSide;

    public Rectangle(int leftSide, int rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    @Override
    public double getArea() {
        return leftSide * rightSide;
    }

    @Override
    public String draw() {
        ColorSupplier supplier = new ColorSupplier();
        return "Figure: rectangle, area: " + getArea() + " sq.units, leftSide: "
                + leftSide + " units, rightSide: " + rightSide + " units, color: "
                + supplier.getRandomColor();
    }
}
