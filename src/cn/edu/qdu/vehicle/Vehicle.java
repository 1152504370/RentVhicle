package cn.edu.qdu.vehicle;

public abstract class Vehicle {
	private String name;
	private int oil;
	private int loss;
	private String brand;

	public abstract void show();
	public void addOil(){
		if(getOil()>=40){
			setOil(60);
			System.out.println("油箱已满！");
		}else
			setOil(getOil()+20);
		System.out.println("加油完成！");
	}
	public void drive(){
		if(getOil()<10)
			System.out.println("油量不足10升，需要加油！");
		else{
			System.out.println("汽车正在行驶。");
			setOil(getOil()-5);
			setLoss(getLoss()+10);
		}
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

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

}
