import java.util.Scanner;

public class ProcessingNumbers {
	
	public static void main(String[] args){
	Scanner userInput= new Scanner(System.in);
	System.out.println("Input 10 integers!");
	int min=userInput.nextInt();
	int max=min;
	int inputNumber=min;
	int evenSum=0;
	int largestEven=0;
	
	for(int i=1;i<10;i++){
		inputNumber=userInput.nextInt();
		if(inputNumber%2==0){
			if(inputNumber<min){
				inputNumber=min;
			} else { 
				inputNumber=largestEven;
				
			}
			evenSum+=inputNumber;
		} else {
			if(inputNumber<min){
				inputNumber=min;
			} else {
				inputNumber=max;
			}
		}
	}
	
	System.out.println("Smallest number is "+min+"and largest number is "+max);
	System.out.println("Sum of even numbers is "+evenSum+"and largest even is "+largestEven);
	
}