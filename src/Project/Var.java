package Project;

import java.util.Scanner;

public class Var {
	private String brand;
	private String name;
	private int ts;
	private int gc;
	private int wheels;
	private String type, typeC, typeM;
	private int entertaiment, helm;
	

	public int getEntertaiment() {
		return entertaiment;
	}

	public void setEntertaiment(int entertaiment) {
		this.entertaiment = entertaiment;
	}

	public int getHelm() {
		return helm;
	}

	public void setHelm(int helm) {
		this.helm = helm;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTs() {
		return ts;
	}

	public void setTs(int ts) {
		this.ts = ts;
	}

	public int getGc() {
		return gc;
	}

	public void setGc(int gc) {
		this.gc = gc;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeC() {
		return typeC;
	}

	public void setTypeC(String typeC) {
		this.typeC = typeC;
	}

	public String getTypeM() {
		return typeM;
	}

	public void setTypeM(String typeM) {
		this.typeM = typeM;
	}

	

	Scanner scan = new Scanner(System.in);
	
	public Var() {
		// TODO Auto-generated constructor stub
		
	}
	
	void input() {
		String brand, name;
		int ts, gc;
		
		int flag=0;
		do {
			System.out.println("Input Brand [>=5]: ");
			brand=scan.nextLine();
			if(brand.length()>=5)flag=1;
		}while(flag!=1);
		setBrand(brand);
		
		flag=0;
		do {
			System.out.println("Input Name [>=5]: ");
			name=scan.nextLine();
			if(name.length()>=5)flag=1;
		}while(flag!=1);
		setName(name);
		
		flag=0;
		do {
			System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
			ts=scan.nextInt();
			if(ts>=100 && ts<=250)flag=1;
		}while(flag!=1);
		setTs(ts);
		
		flag=0;
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			gc=scan.nextInt();
			if(gc>=30 && gc<=60)flag=1;
		}while(flag!=1);
		setGc(gc);
	}
}
