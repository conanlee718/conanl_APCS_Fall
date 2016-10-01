import java.util.Scanner;

public class ProcessingNumbers {
	
	public static int Processnum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10){
	Scanner userInput= new Scanner(System.in);
	System.out.println("Input 10 integers!");
	int min=userInput.nextInt();
	int max=min;
	int inputNumber=min;
	int evenSum=0;
	int largestEven=0;
	
	for(int i=1;i<10;i++){
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