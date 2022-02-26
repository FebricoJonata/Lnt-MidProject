package Project;

import java.util.Scanner;

public class Motor extends Vehicle{
	


	Scanner scan = new Scanner(System.in);

	public Motor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void input() {
		// TODO Auto-generated method stub
		super.input();
		int wheels; 
		int helm;
		String typeM;
		
		int flag=0;
		// TODO Auto-generated method stub
		
		do {
			System.out.print("Wheel [2 <= Wheel <= 3]: ");
			wheels=scan.nextInt();
			if(wheels>=2 && wheels<=3)flag=1;
		}while(flag!=1);
		setWheels(wheels);
		
		flag=0;
		do {
			System.out.print("Input Type [Automatical | Manual]: ");
			typeM=scan.nextLine();
			if(typeM.equals("Automatical")|| typeM.equals("Manual"))flag=1;
		}while(flag!=1);
		setTypeM(typeM);
		
		flag=0;
		do {
			System.out.print("Input Helm amount [>=1]: ");
			helm=scan.nextInt();
			if(helm>=1) flag=1;
		}while(flag!=1);
		setHelm(helm);
	}
	
	@Override
	public void start() {
		int helm;
		// TODO Auto-generated method stub
		System.out.print("Input Helm Price : ");
		helm=scan.nextInt();
		setPrice(helm);
		System.out.println("Price : " + this.getPrice());
		 
		
	}
}
