package day34_constructors_passing_object_method;

public class Calculator {
	
	Floor floor = new Floor(0, 0);
	Carpet carpet = new Carpet(0);
	
	
	
	public Calculator(Floor floor, Carpet carpet) {
	
		this.floor = floor;
		this.carpet = carpet;
	}



	public double getTotalCost() {
		
		double totalCost = floor.getArea()*carpet.getCost();
		return totalCost;
	} 

}
