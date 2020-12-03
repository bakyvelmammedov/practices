package day34_constructors_passing_object_method;

public class Capet_Test {

	public static void main(String[] args) {
		
		Floor f = new Floor(2,13);
		Carpet c = new Carpet(2.0);
		
		Calculator cal = new Calculator(f,c); 
		
		System.out.println(cal.getTotalCost());	}

}
