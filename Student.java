import java.util.*;

public abstract class Student implements Person {
	
	
	private String name;
	protected double gpa;
	protected int age; 

	
	
	public Student(String name, int age, double gpa ) {
	this.name = name;
    this.age = age ; 
	this.gpa = gpa;

	}
	

	
	
	// Copy Constructor : it will ensure the composition relationship between the objects 
	public Student(Student s) {
	name = s.name;
    age = s.age ; 
	gpa = s.gpa; 
	}
	
	
	
	public String getName() {
	return name;
	}
	
	
	public int getAge() {
		return age;
		}
	
	



}