package javaBasics;

public class DigitalWatch {
	String brandName;
	String watchName;
	int hours;
	int minutes;
	int seconds;
	double price;

	void displayTime() {
		System.out.println("Time :" + hours + ":" + minutes + ":" + seconds);
	}

	void displayWatchDestails() {
		System.out.println("Watch Name :" + watchName);
		System.out.println("Brand Name :" + brandName);
		
		System.out.println("WatchPrice :" + price);
	}

void updateHour() {
		hours=hours+1;
		
	}
void updateMinutes() {
	minutes=minutes+1;
	
}

	public static void main(String[] args) {
		DigitalWatch D=new DigitalWatch();
		System.out.println("***** Watch details ROLEX");
		D.brandName="ROLEX";
		D.watchName="SKY-DWELLER";
		D.hours=20;
		D.minutes=65;
		D.seconds=45;
		D.price=600000;
		D.displayWatchDestails();
		D.displayTime();
		D.updateHour();
		D.updateMinutes(); 
		D.displayTime();
		System.out.println();
		System.out.println("***** Watch details FAST TRACK");
		D.brandName="FAST TRACK";
		D.watchName="SKY-BIRD";
		D.hours=22;
		D.minutes=30;
		D.seconds=23;
		D.price=4000;
		D.displayWatchDestails();
		D.displayTime();
		D.updateHour();
		D.updateMinutes();
		D.displayTime();
	}

}
