package cn.edu.qdu.vehicle;

public class Car extends Vehicle {
  private String brand;
  public Car(String name ,String brand){
	  setName(name);
	  setOil(20);
	  setLoss(0);
	  brand = new String(brand);
  }
  public void show(){
	  System.out.println("显示车辆信息：");
	  System.out.println("车辆名称为： "+getName()+"品牌是"+this.brand+"油量是"+getOil()+"车损都为"+getLoss());
 		  
  }


}
