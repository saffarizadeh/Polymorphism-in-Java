package cis3300;

public class Square extends Shape {
	
	@Override
	public void setID(int idValue) {
		id = idValue;
	} 
	
	@Override
	public String drawYourself() {
		return "I'm a Square";
	}

}
