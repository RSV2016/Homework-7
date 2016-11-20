import  java.util.*;
public class Rectangle {
	private double width;
	private double height;
	
	public double getArea(){
		Scanner scn=new Scanner(System.in);
		System.out.println("Ââåäèòå øèðèíó:");
		width=scn.nextDouble();
		System.out.println("Ââåäèòå äëèííó:");
		height=scn.nextDouble();
		double res=width*height;
		return res;
	}
	
	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		System.out.println(rect.getArea());

	}

}
