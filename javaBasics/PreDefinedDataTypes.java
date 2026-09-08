package javaBasics;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog {
	String name;
}

public class PreDefinedDataTypes {
	BigInteger BI = new BigInteger("59534996167675676157056766");
	BigDecimal BD = new BigDecimal("59534996777716.76075676157056766");
	BigInteger BI1 = new BigInteger("5953499616767675676157056766");
	BigDecimal BD1 = new BigDecimal("45646453499616.76075676157056766");
	String S = "Dillesh";
	String S1 = new String("java is too easy");
	// Wrapper object datatypes in this we use AutoBoxing and AutoUnboxing
	Byte B = 126;
	Short SH = 123;
	Integer I = 120;
	Long L = 5045888889957L;
	Character C = 'M';
	Double D = 99.56;
	//auto unboxing
	int i=I;
	// Wrapper caching
	Integer I1 = 120;
	Integer I2 = 120;

	Integer W1 = 150;
	Integer W2 = 150;


	public static void main(String[] args) {
		PreDefinedDataTypes P = new PreDefinedDataTypes();
		System.out.println("****Normal Object DataTypes****");
		System.out.println("BigInteger value of BI:" + P.BI);
		System.out.println("BigDecimal value of BD:" + P.BD);
		System.out.println("BigIntegers Additon value of BI and BI1:" + P.BI.add(P.BI1));
		System.out.println("BigIntegers Additon value of BD and BD1:" + P.BD.add(P.BD1));
		System.out.println("BigInteger Multiply value of BI and BI1:" + P.BI.multiply(P.BI1));
		System.out.println("BigIntegers Multiply value of BD and BD1:" + P.BD.multiply(P.BD1));
		System.out.println(P.S);
		System.out.println(P.S1);
		System.out.println("Wrapper object datatypes in this we use AutoBoxing and AutoUnboxing");
		System.out.println(P.B);
		System.out.println(P.SH);
		System.out.println(P.I);
		System.out.println(P.L);
		System.out.println(P.C);
		System.out.println(P.D);
		System.out.println("auto unboxing from Integer I to int i :"+P.i);
		System.out.println("******Wrapper caching*****");
		System.out.println(P.I1 == P.I2);
		System.out.println(P.W1 == P.W2);

	}

}
