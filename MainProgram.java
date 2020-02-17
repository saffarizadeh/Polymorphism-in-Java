package cis3300;

public class MainProgram {

	public static void main(String[] args) {
		System.out.println("Static binding, method overloading:");
		// Create one object (instance) of the "class" Circle
		// and keep this object in a variable of Circle "type"
		Circle s1 = new Circle();
		// same for Square and Triangle
		Square s2 = new Square();
		Triangle s3 = new Triangle();
		// The drawYourself method of each of these objects will return a string.
		// This string says, for example, "I'm a Circle" or "I'm a Square".
		// We want to print out this string instead of actually drawing the shape (it's easier!).
		// So we created three methods in the MainProgram, one for each type of shape (Circle, Square, and Triangle).
		// These methods take a specific shape (Circle, Square, and Triangle) as input
		// and call the drawYourself() method of the specific shape to print out the returned string.
		draw(s1); //draw(Circle h): I'm a Circle
		draw(s2); //draw(Square h): I'm a Square
		draw(s3); //draw(Triangle h): I'm a Triangle
		
		
		System.out.println("\nDynamic binding, method overriding, polymorphism:");
		// Note that even though it looks like we are passing s1, s2, and s3 to the same method draw()
		// in reality we have three different versions of this method, each designed to handle a specific
		// type of input. This is called method overloading (remember from Introduction to Programming course!)
		
		// Instead we can have one single method for draw(). A method that takes one input of the type Shape.
		// Shape is the parent class for Circle, Square, and Triangle.
		// So we can create one object for each class (Circle, Square, and Triangle) but
		// keep them in variables of Shape type.
		// This way we can pass all of them to a draw() method that takes a variable of Shape type as input.
		// This way, the draw() method does not know the underlying type of the Shape variable until
		// it actually calls the drawYourself() method of the object.
		// This is polymorphism!
		Shape s4 = new Circle();
		Shape s5 = new Square();
		Shape s6 = new Triangle();
		draw(s4); //draw(Shape h): I'm a Circle
		draw(s5); //draw(Shape h): I'm a Circle
		draw(s6); //draw(Shape h): I'm a Circle
		// Note that this time s4, s5, and s6 are passed to the same method draw().
		// To test this, you can remove the other three draw() methods and see that the program still works.
		
		
		System.out.println("\nDynamic binding, method overriding, polymorphism, with type casting:");
		// In practice, many programmers might create the objects the way we created s1, s2, and s3
		// and take advantage of type casting to achieve polymorphism.
		// For example:
		draw((Shape) s1); //draw(Shape h): I'm a Circle
		draw((Shape) s2); //draw(Shape h): I'm a Square
		draw((Shape) s3); //draw(Shape h): I'm a Triangle
	}
	
	public static void draw(Circle h) {
		System.out.println("draw(Circle h): " + h.drawYourself());
	}
	
	public static void draw(Square h) {
		System.out.println("draw(Square h): " + h.drawYourself());
	}
	
	public static void draw(Triangle h) {
		System.out.println("draw(Triangle h): " + h.drawYourself());
	}
	
	public static void draw(Shape h) {
		System.out.println("draw(Shape h): " + h.drawYourself());
	}

}
