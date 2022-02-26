package Project;

import java.util.Scanner;

public class Car extends Vehicle{
	Scanner scan = new Scanner(System.in);
	
	public Car() {
		// TODO Auto-generated constructor stub

	}


	@Override
	void input() {
		int wheels; 
		int enter;
		String typeC;
		int flag=0;
		// TODO Auto-generated method stub
		super.input();
		
		do {
			System.out.print("Wheel [4 <= Wheel <= 6]: ");
			wheels=scan.nextInt();
			if(wheels>=4 && wheels<=6)flag=1;
		}while(flag!=1);
		setWheels(wheels);
		
		flag=0;
		do {
			System.out.print("Input Type [SUV | Supercar | Minivan]: ");
			typeC=scan.nextLine();
			if(typeC.equals("SUV")|| typeC.equals("Supercar")||typeC.equals("Minivan"))flag=1;
		}while(flag!=1);
		setTypeC(typeC);
		
		flag=0;
		do {
			System.out.print("Input Entertaiment system amount [>=1]: ");
			enter=scan.nextInt();
			if(enter>=1) flag=1;
		}while(flag!=1);
		setEntertaiment(enter);
		
		
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub

		
	}



	


}
