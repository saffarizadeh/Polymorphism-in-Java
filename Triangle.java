package cis3300;

public class Triangle extends Shape {
	
	@Override
	public void setID(int idValue) {
		id = idValue;
	} 
	
	@Override
	public String drawYourself() {
		return "I'm a Triangle";
	}

}
