package cn.edu.qdu.vehicle;

public class Truck extends Vehicle {
	private String load;
	public Truck() {
		setName("����ʿ");
		setOil(20);
		setLoss(0);
		load =new String("10��");
	}
	public void show(){
		  System.out.println("��ʾ������Ϣ��");
		  System.out.println("��������Ϊ�� "+getName()+"��λ��"+this.load+"������"+getOil()+"�����Ϊ"+getLoss());
	 		  
	  }
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}
	
}
