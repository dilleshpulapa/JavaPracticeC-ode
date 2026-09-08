package javaBasics;

public class StudentMarks {
	static String collegeName = "sitam";

	int studentId;
	String studentName;
	int englishMarks;
	int teluguMarks;
	int hindiMarks;
	int totalMarks;
	double totalPercentage;

	void caluculateTotal() {
		totalMarks = englishMarks + teluguMarks + hindiMarks;
	}

	void caluculatePercentage() {

		totalPercentage = (totalMarks /300.0)*100;
	}

	void displayStudent() {
		System.out.println("----------STUDENT DETAILS----------");
		System.out.println("collegeName   :" + collegeName);
		System.out.println("studentId is   :" + studentId);
		System.out.println("student name   :" + studentName);

		System.out.println("the english marks  :" + englishMarks);
		System.out.println("the telugu marks  :" + teluguMarks);
		System.out.println("the hindi marks  :" + hindiMarks);
		System.out.println("the total marks  :" + totalMarks);
		System.out.println("the subjects percentage is  :" + totalPercentage + "%");

	}

	public static void main(String[] args) {
		StudentMarks s = new StudentMarks();
		s.studentId = 1;
		s.studentName = "dillesh";
		s.englishMarks = 85;
		s.teluguMarks = 90;
		s.hindiMarks = 95;
		s.caluculateTotal();
		s.caluculatePercentage();
		s.displayStudent();
		
		StudentMarks s1 = new StudentMarks();
		s1.studentId = 2;
		s1.studentName = "sai";
		s1.englishMarks = 86;
		s1.teluguMarks = 91;
		s1.hindiMarks = 94;
		s1.caluculateTotal();
		s1.caluculatePercentage();
		s1.displayStudent();

	}

}