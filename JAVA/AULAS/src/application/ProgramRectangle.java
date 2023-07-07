package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth: ");
		

		rectangle.setHeight(sc.nextDouble());
		rectangle.setWidth(sc.nextDouble());
		
		System.out.println("Rectangle area: "+rectangle.area());	
		System.out.println("Perimeter: "+rectangle.perimeter());	
		System.out.println("Diagonal: "+rectangle.diagonal());
		
	
		sc.close();
	}

}
