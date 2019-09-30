/*


Then create a test application which queries the user for the needed data to create two Circle objects 
and two RightTriangle objects.
It will then display all information about the four objects. 
It should then display which Circle object has the largest area and which RightTriangle object has the largest area.
*/

 import java.util.Scanner;

 public class Lab5{
 	public static void main(String[] args){

 		//Circle constructor
 		//Circle circle1 = new Circle();
 		//Circle circle2 = new Circle();

 		//circle1.setRadius(2.66);

 		Circle circle1 = new Circle(2.66);
 		System.out.println("circle1 radius: " + circle1.getRadius());
 		System.out.println("circle1 area: " + circle1.getArea());
 		System.out.println("circle1 perimeter: " + circle1.getPerimeter());

 		System.out.println("//////////////////////////********************");

 		//circle2.setRadius(3.99);
 		Circle circle2 = new Circle(3.99);
 		System.out.println("circle2 radius: " + circle2.getRadius());
 		System.out.println("circle2 area: " + circle2.getArea());
 		System.out.println("circle2 perimeter: " + circle2.getPerimeter());

		System.out.println("//////////////////////////********************");

 		RightTriangle rt1 = new RightTriangle(22,31);
 		//System.out.println(rt1.getBase());
 		//System.out.println(rt1.getHeight());
 		//System.out.println(rt1.getHypotenuse());

 		System.out.println("//////////////////////////********************");

 		rt1.setValues(34.0,50.0);
 		//System.out.println(rt1.getBase());
 		//System.out.println(rt1.getHeight());
 		//System.out.println(rt1.getHypotenuse());
 	}
 }

 /*
Create a class Circle with one instance variable of type double called radius. 
Then define an appropriate constructor that takes an initial value for the radius, get and set methods for the radius, 
and methods getArea and getPerimeter.(done)
 */

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

 	//constructor
 	public Circle(double radius){
 		this.radius = radius;
 	}

 	

 }

 
/*
Create a class RightTriangle with three instance variables of type double called base, height, 
and hypotenuse. 
Then define an appropriate constructor that takes initial values for the base and height and calculates the hypotenuse, 
a single set method which takes new values for base and height and calculates the hypotenuse, get methods for all three instance variables, 
and methods getArea and getPerimeter.
*/

 class RightTriangle{
 	private double base, height, hypotenuse;

 	//getBase
 	public double getBase(){
 		return base;
 	}

 	//getHeight
 	public double getHeight(){
 		return height;
 	}

 	//getHypotenuse
 	public double getHypotenuse(){
 		hypotenuse = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getHeight(), 2));
 		return hypotenuse;
 	}

 	//setValues
 	public void setValues(double newBase, double newHeight){
 		this.base = newBase;
 		this.height = newHeight;
 		this.hypotenuse = getHypotenuse();
 		System.out.println("Hypotenuse: " + getHypotenuse());

 	}

 	//constructor
 	public RightTriangle(double base, double height){
 		this.base = base;
 		this.height = height;
 		System.out.println("Hypotenuse: " + getHypotenuse());
 		
 	}



 }























