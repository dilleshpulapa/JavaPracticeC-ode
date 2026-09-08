package javaBasics;

public class TypeCasting {
	// PRIMITIVE DATATYPES

	byte b;
	short s;
	int i;
	long L;
	float F;
	double d;
	char c;
	boolean B;

	// TYPECASTING..explicit

	byte   b1 = (byte) 130;
	short  s1 = (short) 32767;
	int    i1 = (int) 234488088L;
	long   L1 = (long) 437837383;
	int    l2 = (int) 2709.69;
	float  f1 = 5.8F;
	double d1 = 68.88555F;
	char   c1 = 'A';// Ascii value A--Z 65 to 90 a-z 97 to 122
	char   c2 = 69;
	char   c3 = 'C';
	char   c4 =  66;
	char   c5 = '\u0040';// unicode values
	int    i3 = 'D';
	float  f3 = 'E';
	double d2 = 'f';
	boolean B1 = true;
	// implicit

	byte    b2  = b1;
	short   s2  = s1;
	int     i2  = i1;
	long    L2  = L1;
	float   f2  = f1;
	char    c6  = c4;
	boolean B2  = B1;

	public static void main(String[] args) {
		System.out.println("main method started");
		TypeCasting D = new TypeCasting();
		System.out.println("PRIMITIVE DATA TYPES");
		System.out.println(D.b);
		System.out.println(D.s);
		System.out.println(D.i);
		System.out.println(D.L);
		System.out.println(D.F);
		System.out.println(D.d);
		System.out.println(D.c);
		System.out.println(D.B);
//type Casting..explict
		System.out.println("***** EXPLICIT TYPES CASTING*******");

		System.out.println(D.b1);
		System.out.println(D.s1);
		System.out.println(D.i1);
		System.out.println(D.L1);
		System.out.println(D.l2);
		System.out.println(D.f1);
		System.out.println(D.d1);
		System.out.println(D.c1);
		System.out.println(D.c2);
		System.out.println(D.c3);
		System.out.println("C5 assci values :"+D. c5);
		System.out.println(D.c4);
		System.out.println(D.i3);
		System.out.println(D.f3);
		System.out.println(D.d2);
		System.out.println(D.B1);

		// implicit type casting
		System.out.println(" IMPLICIT TYPES CASTING");
		System.out.println(D.b2);
		System.out.println(D.s2);
		System.out.println(D.i2);
		System.out.println(D.f2);
		System.out.println(D.c6);
		System.out.println(D.B2);

		System.out.println("main method ended");

	}

}
