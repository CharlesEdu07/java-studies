package br.com.charlesedu.entities;

public class Student {
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	public boolean pass;
	
	public double finalGrade() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public double missingPoints() {
		if (finalGrade() >= 60) {
			return 0.0;
		}
		
		return 60 - finalGrade();
	}
}
