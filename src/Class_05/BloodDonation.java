package Class_05;

public class BloodDonation {

	public static void main(String[] args) {
	
	int age, weight;
	
	if (age < 18 && weight < 50)
	    System.out.println("not eligble");
	else if (age < 18 && weight > 50)
		System.out.println("too young");
		else if (age > 18 && weight < 50)
	    System.out.println("underweingt");
	    
		else if (age > 18 && weight > 50)
	    	System.out.println("eligible");
	
		else 
			System.out.println("");
	
	}
	
}
