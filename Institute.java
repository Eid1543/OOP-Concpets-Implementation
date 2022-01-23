import java.util.*;

public class Institute {

	private String name;
	private LinkedList<Person> listOfPersons ;
	private int numberOfStudents ; 
	
	
	public Institute(String name) {
		this.name = name;
		listOfPersons = new LinkedList<>();
		numberOfStudents = 0 ; 
		
		}
	
	
	public void addPerson(Person p) {
		
		if ( listOfPersons.size() == 2000 ) {
			System.out.println("The list is full ( Maximum size is 2000 ");
			return ; 
		}
		
		
		if (p instanceof Graduate) {		 
		listOfPersons.addLast( new Graduate((Graduate) p) );
		}
		else {
		listOfPersons.addLast( new Undergraduate((Undergraduate) p ));
		}
		
		numberOfStudents++; 

	}
	
	
	public void removePerson (Person p ) {
		
		if ( listOfPersons.isEmpty() ) {
			System.out.println("The list is empty ");
			return ; 
		}
		
		listOfPersons.remove( p );
	}
	
	
	
	
	
	
	public void displayAllStudentsInfo() {
	
		
		if ( listOfPersons.isEmpty() ) {
			System.out.println("The list is empty ");
			return ; 
		}
		
		System.out.println("Students Info :");
		
		ListIterator<Person> listIterator = listOfPersons.listIterator();
		
	    while (listIterator.hasNext()) {
	    	Person p = listIterator.next(); 
	    	System.out.println("Name: "+ p.getName() );
	    	System.out.println("Age: "+ p.getAge() );
	    	System.out.println("Score: "+ p.calculateScore() );

		
	    }
		
	
	
	}
	
	
	
	
	// polymorphic method 
    // this method is used to get the average of all the score of the undergrad and the grad students 
	public double averageScore () {

		double sum = 0 ; 
		ListIterator<Person> listIterator = listOfPersons.listIterator();
		
	    while (listIterator.hasNext()) {
		sum += listIterator.next().calculateScore() ; 
		
	    } return sum / numberOfStudents ; 

	    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
	
	
	
	
	
	
	
