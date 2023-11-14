class Square extends Shapes {

private double heigth;
private double width;

    public Square(double heigth, double width) {
        this.heigth = heigth;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return heigth*width;
    }
}

