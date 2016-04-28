package cn.edu.qdu.vehicle;

public class Truck extends Vehicle {
	private String load;
	public Truck() {
		setName("大力士");
		setOil(20);
		setLoss(0);
		load =new String("10吨");
	}
	public void show(){
		  System.out.println("显示车辆信息：");
		  System.out.println("车辆名称为： "+getName()+"吨位是"+this.load+"油量是"+getOil()+"车损度为"+getLoss());
	 		  
	  }
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}
	
}
