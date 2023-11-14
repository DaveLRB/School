public class Square extends Shapes {

    @Override
    public void calculateArea() {

        System.out.println("heigth : ");
        double heigth = input.nextDouble();
        System.out.println("width : ");
        double width = input.nextDouble();
        double area = heigth*width;

        System.out.println(area);


    }
}
