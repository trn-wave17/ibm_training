package org.ibm.training;

/*interface Mobile{
	public String APPLE = "Apple";
	public String SAMSUNG = "Samsung";
}*/
/*public class MobilePhone extends Enum{
	public static final MobilePhone APPLE = new MobilePhone(100);
	public static final MobilePhone SAMSUNG = new MobilePhone();
	public static final MobilePhone REDMI = new MobilePhone();
	
}*/
public enum MobilePhone{
	APPLE(100),SAMSUNG(90),REDMI;
	
	MobilePhone(){
	}
	
	 MobilePhone(int price) {
		this.price = price;
	}
	
	int price = 10;
	public int getPrice() {
		return price;
	}

}

