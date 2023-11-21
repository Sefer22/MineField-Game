package mineField;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.println("Welcome to MineField");
		System.out.println("Oynamaq istediyiniz olculeri daxil edin");
		System.out.print("Count of row ");
		row = scan.nextInt();
		System.out.print("Count of column");
		column=scan.nextInt();
		
		mineField mine = new mineField(row,column);
		mine.run();
	}

}
