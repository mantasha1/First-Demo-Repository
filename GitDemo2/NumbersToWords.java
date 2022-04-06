import java.util.Scanner;

public class NumbersToWords {
	
	
	public static String numname(int val) {

		switch (val) {
		  case 0:
			return("Zero");
		  case 1:
		    return("One");
		  case 2:
		    return("Two");
		  case 3:
		    return("Three");
		  case 4:
		    return("Four");
		  case 5:
		    return("Five");
		  case 6:
		    return("Six");
		  case 7:
		    return("Seven");
		  case 8:
			return("Eight");
		  case 9:
			    return("Nine");
		  case 10:
			    return("Ten");
		  case 11:
			    return("Eleven");
		  case 12:
			    return("Twelve");
		  case 13:
			    return("Thirteen");
		  case 14:
			    return("Fourteen");
		  case 15:
			    return("Fifteen");
		  case 16:
			    return("Sixteen");
		  case 17:
			    return("Seventeen");
		  case 18:
			    return("Eighteen");
		  case 19:
			    return("Nineteen");
		  case 20:
			    return("Twenty");
		  case 30:
			    return("Thirty");
		  case 40:
			    return("Forty");
		  case 50:
			    return("Fifty");
		  case 60:
			    return("Sixty");
		  case 70:
			    return("Seventy");
		  case 80:
			    return("Eighty");
		  case 90:
			    return("Ninety");
		  case 100:
			    return("Hundred");
		  case 1000:
			    return("Thousand");
		}		
		return("and"); 
	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter your Number:");
        Scanner in = new Scanner(System.in);		
        int num = in.nextInt();
        in.close();
 
        if (numname(num) != "and") {
        	System.out.println(numname(num));
        	return;
        }
        
        String number = "";
                
        if (num/1000 > 0) {
        	number += numname(num/1000) + " " + numname(1000) + " ";
        	num = num - (num/1000)*1000;
        	if(numname(num) != "and") {
        		number += numname(num);
                System.out.println(number);
        		return;
        	}
        }
        
        if (num/100 > 0) {
        	number += numname(num/100) + " " + numname(100) + " ";
        	num = num - (num/100)*100;        	
        	if(numname(num) != "and") {
        		number += numname(num);
                System.out.println(number);
        		return;
        	}	
        	else {
        		number += "and ";
        	}
        }
        
        if (num/10 > 0) {
        	int unit = num%10;
        	number += numname(num-unit) + " ";
        	num = num - (num/10)*10;        	
        }
     
        if (num%10 > 0) {
        	number += numname(num%10);
        }
        
        System.out.println(number);
        
        
	}      
 }
