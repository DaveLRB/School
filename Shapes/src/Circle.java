public class Circle extends Shapes {

    @Override
    public void calculateArea() {

        System.out.println("Radius : ");
        double radius = input.nextDouble();
        double areaCircle = Math.PI * Math.pow(radius,2);

        System.out.println(areaCircle);

    }
}
