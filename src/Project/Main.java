package Project;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Vehicle> data = new ArrayList<>();
	Boolean cek = true;
	int idx=0;
	int menu;
	String type;
	
	void view() {
		
		if(data.isEmpty()) {
			System.out.println("Currently no Vechicle Data");
		}else {
			System.out.println("======================================");
			System.out.println("|               Vehicle              |");
			System.out.println("======================================");
			System.out.println("--------------------------------------");
			System.out.println("| No   | Type       | Name           |");
			System.out.println("--------------------------------------");
			for (int i = 0; i < data.size(); i++) {

				System.out.println("| " + (i+1) + "    |" + data.get(i).getType()+ "         |" + " " +data.get(i).getName()+ "           |");
				System.out.println("--------------------------------------");
				
			}
			System.out.print("Pick a Vehicle number to test drive [1 - " + data.size() + "]: ");
				
				search();

				System.out.println("Press enter to continue...");
				scan.nextLine();
				
			
			
		}
	}
	
	void cls() {
		for(int i=1;i<=100;i++)
			System.out.println();
	}
	
	void search() {
		Motor mtr = new Motor();
		do {
			idx=scan.nextInt();
			scan.nextLine();
		}while(idx<1 || idx>data.size());
		
		for(int i=0; i<data.size(); i++) {
			if(idx==i+1) {

				if(data.get(i).getType().equals("Car")) {
					System.out.println();
					System.out.println("Brand               : " + data.get(i).getBrand());
					System.out.println("Name                : " + data.get(i).getName());
					System.out.println("Licence Plate       : " + data.get(i).getLisence());
					System.out.println("Type                : " + data.get(i).getTypeC());
					System.out.println("Gas capacity        : " + data.get(i).getGc());
					System.out.println("Wheel(s)            : " + data.get(i).getWheels());
					System.out.println("Entertaiment System : " + data.get(i).getEntertaiment());
					System.out.println("Turning on entertaiment system......");
					if(data.get(i).getTypeC().equals("Supercar")) {
						System.out.println(data.get(i).getName() + " Boosting!");
					}
				}else {
					System.out.println();
					System.out.println("Brand         : " + data.get(i).getBrand());
					System.out.println("Name          : " + data.get(i).getName());
					System.out.println("Licence Plate : " + data.get(i).getLisence());
					System.out.println("Type          : " + data.get(i).getTypeM());
					System.out.println("Gas capacity  : " + data.get(i).getGc());
					System.out.println("Wheel(s)      : " + data.get(i).getWheels());
					System.out.println("Helm          : " + data.get(i).getHelm());
					System.out.println(data.get(i).getName() + " is standing!");
					mtr.start();
				}
			}
		 }
		
	}


	public Main() {
		boolean cek=true;
		do {
			System.out.println("SHOWROOM R");
			System.out.println("=================");
			System.out.println("1. Add new Vehicle");
			System.out.println("2. View Vechicle");
			System.out.println("3. Exit");
			System.out.print(">>");
			
			try {
				menu=scan.nextInt();
				
				if(menu==1) {
					cek=true;
					Car mb = new Car();
					Motor mtr = new Motor();
					
					int flag=0;
					do {
						System.out.print("Input Type [Car | Motorcycle] : ");
						type = scan.nextLine();
						if(type.equals("Car") || type.equals("Motorcycle")) flag=1;
					}while(flag!=1);
					
					if(type.equals("Car")) {
						mb.input();
						data.add(mb);
						mb.setType(type);
					}else {
						mtr.input();
						data.add(mtr);
						mtr.setType(type);
					}
					System.out.println("Press enter to continue...");
					scan.nextLine();
					cls();
					
				}else if(menu==2) {
					cek=true;
					view();
					cls();
				}else if(menu==3) {
					cek=false;
				}
				
				
			}catch(Exception e){
				scan = new Scanner (System.in);
				System.out.println(e);
				System.out.println("Input invalid!");
			}
			
		}while(cek);		
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
