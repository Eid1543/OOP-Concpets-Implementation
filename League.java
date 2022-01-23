import java.util.*;

// the main idea of this class is to implement the aggregation concept  

public class League {

	
	private String name;
	private ArrayList <Institute> listOfInstitute;
	
	
	public League (String name) {
		this.name = name;
		listOfInstitute = new ArrayList<>();
		
		}
	

	
	// this method is used to add institues to the league , the maximum size must be under or equal to 20 
	public void addInstitue (Institute in ) {
		if ( listOfInstitute.size() == 20 ) {
			System.out.println("The league is full ( Maximum size is 20 ");
			return ; 
		}
		listOfInstitute.add( in );
	}
	
	
	
	public void removeInstitue (Institute in ) {
		
		if ( listOfInstitute.isEmpty() ) {
			System.out.println("The league list is empty ");
			return ; 
		}
		
		listOfInstitute.remove( in );
	}
	
	
	
	
	// show all the institue that exist in the league 
    public void displayInfo() {
    	
		if ( listOfInstitute.isEmpty() ) {
			System.out.println("The league list is empty ");
			return ; 
		}
    	
		
		System.out.println("The institue that exist in the league  :");
		
		ListIterator<Institute> listIterator = listOfInstitute.listIterator();
		
	    while (listIterator.hasNext()) {
	    	Institute in = listIterator.next(); 
	    	System.out.println("Name: "+ in.getName() );
		
	    }
		
	
	
	}
	
	
	
	
	
}
