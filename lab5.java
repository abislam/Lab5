/*
Create a class Circle with one instance variable of type double called radius. 
Then define an appropriate constructor that takes an initial value for the radius, get and set methods for the radius, 
and methods getArea and getPerimeter.(done)

Create a class RightTriangle with three instance variables of type double called base, height, 
and hypotenuse. 
Then define an appropriate constructor that takes initial values for the base and height and calculates the hypotenuse, 
a single set method which takes new values for base and height and calculates the hypotenuse, get methods for all three instance variables, 
and methods getArea and getPerimeter.

Then create a test application which queries the user for the needed data to create two Circle objects 
and two RightTriangle objects.
It will then display all information about the four objects. 
It should then display which Circle object has the largest area and which RightTriangle object has the largest area.
*/

 import java.util.Scanner;

 public class Lab5{
 	public static void main(String[] args){

 		//Circle constructor
 		Circle circle1 = new Circle();
 		Circle circle2 = new Circle();

 		circle1.setRadius(2.66);
 		System.out.println("circle1 radius: " + circle1.getRadius());
 		System.out.println("circle1 area: " + circle1.getArea());
 		System.out.println("circle1 perimeter: " + circle1.getPerimeter());

 		System.out.println("//////////////////////////********************");

 		circle2.setRadius(3.99);
 		System.out.println("circle2 radius: " + circle2.getRadius());
 		System.out.println("circle2 area: " + circle2.getArea());
 		System.out.println("circle2 perimeter: " + circle2.getPerimeter());



 	}
 }

 class Circle{
 	private double radius, area, perimeter;


 	//radius getter
 	public double getRadius(){
 		return radius;
 	}
 	//radius setter
 	public void setRadius(double newRadius){
 		this.radius = newRadius;
 	}

 	//getArea method
 	public double getArea(){
 		area = 3.14*Math.pow(getRadius(), 2);
 		return area;
 	}

 	//getPerimeter method
 	public double getPerimeter(){
 		perimeter = 2*3.14*getRadius();
 		return perimeter;
 	}

 }

 /*
 class RightTriangle{

 }
 */