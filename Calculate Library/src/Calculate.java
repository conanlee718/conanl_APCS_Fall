/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	public static int square(int number){
		return(number*number);
		
	}
	public static int cube(int number){
		return(number*number*number);
	}

	public static double average(double number1, double number2){
		return((number1+number2)/2);
		
	}
	
	public static double average(double number1, double number2, double number3){
		return((number1+number2+number3)/3);
	}

	public static double toDegrees(double number){
		return(number*(3.14159/180));
		
	}
	
	public static double toRadians(double degrees){
		return(degrees*(180/3.14159));
		
	}

	public static double discriminant(int a, int b, int c){
		return(b*b-4*a*c);
		
		
	}
	
	public static String toImproperFrac(int num1, int num2, int num3){
		return(num1*num3+num2+"/"+num3);
		
	}
	
	public static String toMixedNum(int num1, int num2){
		return(num1/num2+" "+num1%num2+"/"+num2);
	}
	
	public static String foil(int a, int b, int c, int d, String n){
		return((a*c)+"n^2+"+((a*d)+(b*c))+"n"+(b*d));
		
	}

//pre:num2!=0
	public static boolean isDivisibleBy(int num1, int num2){
		if(num2==0){
			throw new IllegalArgumentException("Denominator cannot be 0.");
		} else if(num1%num2==0){
			return true;
			
		} else {
			return false;
		}
		
	}

	public static double absValue(double number){
		if(number<0){
			return(number*-1);
		} else {
			return(number);
			
		}
	}
	
	public static int max(int num1, int num2){
		if(num1>num2){
			return(num1);
		} else {
			return(num2);
		}
	}
	
	public static double max(double num1, double num2, double num3){
		double minimum= Math.max(num1, num2);
		double minimum2= Math.max(minimum, num3);
		
		return(minimum2);
		}
		
	public static int min(int num1, int num2){
		if(num1<num2){
			return(num1);
		} else {
			return(num2);
		}
	}
/*
	public static double round2(double number){
	
	
*/		
		
		
		
		
				


//pre:power>=0
	public static double exponent(double number, int power){
		if (power < 0){
			throw new IllegalArgumentException("Power must be positive");
		}
		
		double answer=1;
		for(int i=1;i<=power;i++){
			answer*=number;
		}
		return(answer);
		
	}

//pre:number>0
	public static int factorial(int number){
		if (number<1){
			throw new IllegalArgumentException("Number for factorial must be positive.");
		}
		int answer=1;
		for(int i=1;i<=number;i++){
			answer*=number;
			
		}
		return(answer);
	}
	
/*	
	public static boolean isPrime(int number){
		
	}
*/	
	
	
	public static int gcf(int a, int b){
		int gcf=1;
		for(int i=1;i<=a;i++){
			if(isDivisibleBy(a,i) && isDivisibleBy(b,i)){
				gcf=i;
			}
		}
		return(gcf);
	}
/*	
	public static double sqrt(double number){
		
	}
*/	
	
	
	
	
	
	
	
}	






	
