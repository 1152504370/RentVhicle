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
	  System.out.println("��ʾ������Ϣ��");
	  System.out.println("��������Ϊ�� "+getName()+"Ʒ����"+this.brand+"������"+getOil()+"����Ϊ"+getLoss());
 		  
  }


}
