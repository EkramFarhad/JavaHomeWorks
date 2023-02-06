package Class20HW_SuperKeyword;
/*
 * Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
 * In circle class create a method to calculate the area of circle. Test your code*/

public class Shape {

    double radius;

    Shape(double radius) {
        this.radius = radius;

    }
    void printRadias () {
        System.out.println("Radius " + radius);
    }


}

class Circle extends Shape {

    Circle(double radius){
        super(radius);
    }

    double getArea (){

        double area = Math.PI*super.radius*super.radius;
        return area;

    }
}

class Test{

    public static void main(String[] args) {

        Shape shape = new Shape(4.5);
        shape.printRadias();


        Circle circle = new Circle(5.5);

        circle.getArea();
        System.out.println("Aria of the circle is " + circle.getArea());




    }

}




