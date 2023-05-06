package week1.day1;

public class car {

	public void openDoor() {
		System.out.println("openDoor");
	}	
	public void putKey() {
		System.out.println("putKey");
	}	
	public void starEngine() {
		System.out.println("starEngine");

	}
	public void wearSeatbelt() {
		System.out.println("wearSeatbelt");
	}
	public void putGear() {
		System.out.println("putGear");
	}
	public void fillFuel() {
		System.out.println("fillFuel");
	}
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void playMusic() {
		System.out.println("playMusic");
	}
	public static void main(String[] args) {
		car kia=new car();
		kia.openDoor();
		kia.putKey();
		kia.starEngine();
		kia.wearSeatbelt();
		kia.putGear();
		kia.fillFuel();
		kia.switchOnAc();
		kia.playMusic();
	}
}
