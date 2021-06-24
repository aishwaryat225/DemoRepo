package Class_05;

public class Discount {
	public static void main(String[] args) {
		int amount=600;
		
			
		if(amount>100) {
			System.out.println("5% discount");
			amount = 100 +(100*5/100); 
		}
		else if (amount>1000) {
			System.out.println("10% discount");
			amount = 1000 + (1000*10/100); 
		}
		else if (amount>10000) {
			System.out.println("20% discount");
			amount = 10000 + (1000*20/100);
		}
		else {
			
				System.out.println("invalid");
			}
		}
	}
	
	


