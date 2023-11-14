class Triangle extends Shapes {

    private double heigth;
    private double base;

    public Triangle(double heigth, double base) {
        this.base = base;
        this.heigth = heigth;
    }

    @Override
    double calculateArea() {
        return ((0.5 * base) * heigth);
    }
}
