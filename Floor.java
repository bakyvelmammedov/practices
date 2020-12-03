package day34_constructors_passing_object_method;

import review_week5.methods;

public class Floor {
	
	double width;
	double length;
	
	public Floor(double width, double length) {
		if(width<0) {
			this.width=0;
		}else {
		this.width = width;
		}
		if(length<0) {
			this.length = 0;
		}else {
		this.length = length;
		}
	}
	
	
	
	public double getArea() {
		
		double area = width*length;
		
		return area;
		
	}
	
	

}