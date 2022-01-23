import java.util.ArrayList;

public class Graduate extends Student {
	
private int nbPapers;

public Graduate(String name,int age, double gpa, int nbPapers  ) {

	super(name, age , gpa );
    this.nbPapers = nbPapers;

}



// Copy Constructor 
public Graduate(Graduate g) {
super(g);
nbPapers = g.nbPapers;
}


public double calculateScore() {
return nbPapers * gpa;
}


public int getNbPapers() {
return nbPapers;
}




}