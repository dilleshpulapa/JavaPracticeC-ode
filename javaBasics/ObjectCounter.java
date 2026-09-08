package javaBasics;

public class ObjectCounter {
	static int count=0;
	ObjectCounter(){
		count++;
	}

	public static void main(String[] args) {
		ObjectCounter OCJ=new ObjectCounter();
		ObjectCounter OC1=new ObjectCounter();
		ObjectCounter OC2=new ObjectCounter();
		ObjectCounter OC3=new ObjectCounter();
		ObjectCounter OC4=new ObjectCounter();
		ObjectCounter OC5=new ObjectCounter();
System.out.println("the number of objects created in main method :"+count);
	}

}
