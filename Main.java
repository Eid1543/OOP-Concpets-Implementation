import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		
		/*
	       The main here is used to test the program 
	
		 */
		
		Institute institute = new Institute ("Riyadh University");
		
		Person ahmed = new Graduate("Ahmed" , 23 , 2.23 , 12 ) ;
		Person sarah = new Graduate("Sarah" , 32, 3.5 , 8  ) ; 
		Person nawal = new Graduate("Nawal" , 41, 4.72 , 14 ) ; 
		Person loay = new Undergraduate ("Loay" , 24, 4.32) ;	
		Person mohammed = new Undergraduate ("Mohammed " , 30, 4.1) ;	
		Person mahdi = new Undergraduate ("Mahdi" , 27 , 3.12) ;
		
		
		institute.addPerson(ahmed); 
		institute.addPerson(sarah); 
		institute.addPerson(loay); 
		institute.addPerson(mohammed); 
		institute.addPerson(nawal); 
		institute.addPerson(mahdi);
		
		institute.displayAllStudentsInfo();
		
		institute.removePerson(sarah);
		
		institute.displayAllStudentsInfo();
		
		
//		System.out.println(institute.averageScore());
		
// ----------------- 
		
		System.out.println("-------------------------------------------");
		System.out.println(" The list of educational institues exist in the league : ");
		System.out.println("-------------------------------------------");
		
		
		Institute institute2 = new Institute ("XYZ University");
		Institute institute3 = new Institute ("Dammam University");
		Institute institute4 = new Institute ("King Saud University");
		
		League league = new League("The West side") ; 
		
		league.addInstitue(institute);
		league.addInstitue(institute2);
		league.addInstitue(institute3);
		league.addInstitue(institute4);
		
		league.displayInfo();
		
		league.RemoveInstitue(institute);
		
		league.displayInfo();
		
		
		
		
		
	}
	
	
	
}
