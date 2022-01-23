public class Undergraduate extends Student {

	
	public Undergraduate(String name, int age , double gpa ) {
		super(name, age , gpa );
		}
	
	

	
	// Copy Constructor 
	public Undergraduate(Undergraduate p) {
		super(p);
		}
	
	
	
	public double calculateScore() {
		return gpa * 3 + 5;
		}




}