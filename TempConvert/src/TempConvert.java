//Author: Conan Lee APCS, 2nd period
//converting fahrenheit to celsius, given fahrenheit is -32 degrees.


public class TempConvert {
	public static void main(String[] args){
		int fahrenheit=-32;
		double celsius=((0.555555556)*(fahrenheit-32));     // (5/9)(F-32)=C
		System.out.println(celsius);						// .555555556 is used instead of 5/9 because 5/9 in code will give you an integer of 0
		}
}
