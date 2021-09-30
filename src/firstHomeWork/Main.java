package firstHomeWork;

public class Main {

	public static void main(String[] args) {

		
			int grade =	86;
		 
		 
	        if (grade >= 90) {
	           System.out.println("A");
	        } else if (grade <= 89 && grade >= 80) {
		       System.out.println("B");
	        } else if (grade <= 79 && grade >= 70) {
		       System.out.println("C");
	        } else if (grade <= 69 && grade >= 55) {
		       System.out.println("D");
	        } else {
		       System.out.println("E");
	        }
		
		
	        
	        
		int day = 3;
		
		
		 switch (day) {
         case 1:
             System.out.println("Monday");
             break;
         case 2:
             System.out.println("Tuesday");
             break;
         case 3:
             System.out.println("Wednesday");
             break;
         case 4:
             System.out.println("Thursday");
             break;
         case 5:
             System.out.println("Friday");
             break;
         case 6:
             System.out.println("Saturday");
             break;
         case 7:
             System.out.println("Sunday");
             break;

         default:
             System.out.println("Invalid input");
             break;
     }
		
		
		
		
		
		
		
		
		int num = 18 ;
		 
		if(num % 2 == 0) {
	            if(num >= 2 && num <= 5) {
	                System.out.println("Not Cool");
	            } else if(num >= 6 && num <= 20) {
	                System.out.println("Cool");
	            } else if(num > 20) {
	                System.out.println("Not cool");
	            }
	        
	        } else {
	            System.out.println("Odd  Cool");
	        }   
		
		}
		
		
	

};
