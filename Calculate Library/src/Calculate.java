/**
 * 
 */

/**
 * @Conan Lee APCS2 
 * 2nd period
 * 
 * This Calculate class creates methods of several calculations which you can call by 
 * linking this class to another class such as DoMath.java to execute the method 
 * without actually having to write out the whole code.
 * EX: Calculate.cube(5) instead of creating another whole method and writing out code.
 */
public class Calculate {
	public static int square(int number){
		return(number*number);									//returning square, which is number times number
		
	}
	public static int cube(int number){
		return(number*number*number);							//returning cubed, which is number multiplied 3 times
	}

	public static double average(double number1, double number2){
		return((number1+number2)/2);							//adding two doubles and dividing it by 2
		
	}
	
	public static double average(double number1, double number2, double number3){			//overload of average
		return((number1+number2+number3)/3);					//adding three doubles and dividing by 3
	}

	public static double toDegrees(double radians){
		return(radians*(180/3.14159));							//converting to degrees, you must multiply by 180/pi
		
	}
	
	public static double toRadians(double degrees){
		return(degrees*(3.14159/180));							//converting to radians, you must multiply by pi/180
		
	}

	public static double discriminant(double a, double b, double c){
		return(b*b-4*a*c);										//b^2-4ac
		
		
	}
	
	public static String toImproperFrac(int num1, int num2, int num3){
		return(num1*num3+num2+"/"+num3);
		
	}
	
//pre:denominator cannot be 0
	public static String toMixedNum(int numerator, int denominator){
		if(denominator==0){															//checks if denominator is 0. if true, then throw exception
			throw new IllegalArgumentException("Denominator cannot be zero.");
		} else if(numerator%denominator==0){
			return(numerator/denominator+"");	
		} else {
		return(numerator/denominator+"_"+numerator%denominator+"/"+denominator);
	    } 
	}

	
	public static String foil(int a, int b, int c, int d, String x){
		return((a*c)+"x^2 + "+((a*d)+(b*c))+"x "+ (b*d));
	}

//pre:num2!=0 because cannot divide a number by 0
	public static boolean isDivisibleBy(int num1, int num2){
		if(num2==0){
			throw new IllegalArgumentException("Denominator cannot be 0.");			//if number on bottom(or denominator) is 0 then throw exception
		} else if(num1%num2==0){
			return true;
			
		} else {
			return false;
		}
		
	}

	public static double absValue(double number){
		if(number<0){
			return(number*-1);									//if negative, returns positive
		} else {
			return(number);										//if positive, returns itself
																//therefore all results will be positive and 0 will be 0
		}
	}
	
	public static int max(int num1, int num2){
		if(num1>num2){											//compares values of num1 and num2. if num1 is greater than num2 
			return(num1);
		} else {
			return(num2);
		}
	}

	public static double max(double num1, double num2, double num3){
		double max1=Calculate.max((int)num1,(int)num2);
		double max2=Calculate.max((int)max1,(int)num3);
		if(max1>max2){                                       //take max of first and second sets
			return(max1);                                    //comparing both max
		} else {
			return(max2);
		}
	}
		
		
		
	public static int min(int num1, int num2){
		if(num1<num2){										//compares values of num1 and num2. if statement for if num1 is less than num2
			return(num1);
		} else {
			return(num2);
		}
	}

	public static double round2(double number){
        number = number * 100;								
        number+=.5;
        number = (int)number;
        return (number/100);
    }
		
	
	
		
//pre:power>=0
	public static double exponent(double number, int power){
		if (power < 0){
			throw new IllegalArgumentException("Power cannot be less than zero");
		}
		
		double answer=1;
		for(int i=1;i<=power;i++){
			answer*=number;
		}
		return(answer);
		
	}

//pre:number>0
	public static int factorial(int number){
		if (number<0){
			throw new IllegalArgumentException("Number for factorial must be zero or positive.");
		}
		int answer=1;
		for(int i=1;i<=number;i++){
			answer*=i;
			
		}
		return(answer);
	}

//pre:prime numbers >1
	public static boolean isPrime(int number){
        if(number < 2){
            throw new IllegalArgumentException("Prime numbers are greater than 1.");		//prime numbers start from 2
        }
            for (int i = 2;i<number-1;i++){
                if(Calculate.isDivisibleBy(number, i)==true){
                    return(false);
                }
            }
            return(true);
        }			
			

			
	public static int gcf(int a, int b){
		int gcf=1;
		for(int i=1;i<=a;i++){
			if(isDivisibleBy(a,i) && isDivisibleBy(b,i)){				//checks if both a and b are divisibly by i
				gcf=i;
			}
		}
		return(gcf);
	}
	

//pre:Square root cannot be negative	
	public static double sqrt(double number){
        if (number<0){
            throw new IllegalArgumentException("Cannot take the square root of a negative number");   //cant square root negative number
        }
        double x;
        double sqrt = number / 2;
        do {
            x = sqrt;
            sqrt = (x + number/x)/2;
        } while ((x-sqrt) != 0);
        return Calculate.round2(sqrt);
	}	
	
	public static double round2ForQuad(double number){     //Mrs. Dreyer I made a new round2 specifically for 
        number = number * 100;							   // QuadForm because the other round2 rounds up.
        number = (int)number;
        return (number/100);
    }
		
	public static String quadForm(int a, int b, int c){
        double root1;
        double root2;
        if(Calculate.discriminant(a, b, c)<0){                    //roots with i are imaginary (doesn't exist)
            return("no real roots");
        } else if(Calculate.discriminant(a, b, c)==0){
            root1=-b/2*a;
            root1=Calculate.round2ForQuad(root1);
            return(""+root1);
        } else {
            root1=((-b+Calculate.sqrt(Calculate.discriminant(a, b, c)))/2*a);
            root1=Calculate.round2ForQuad(root1);
            root2=((-b-Calculate.sqrt(Calculate.discriminant(a, b, c)))/2*a);
            root2=Calculate.round2ForQuad(root2);
            double smallerroot=Calculate.min((int)root1, (int)root2);
            double largerroot=Calculate.max((int)root1, (int)root2);
            return(smallerroot+" and "+largerroot);
            }
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


