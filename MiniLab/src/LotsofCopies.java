import java.util.Arrays;
public class LotsofCopies {
	public static void main(String[] args){
		int num=7;
		String strMain= "APCS";
		int[] arrMain={1, 2, 3, 4, 5};
		
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		changeMe(5,"APCS2",5);
		startNewInts();
		
	}
	
	
	public static void changeMe(int x, String str, int[] arr){
		x=5;
		str="APCS2";
		arr[0]=5;
		System.out.println(x);
		System.out.println(str);
		System.out.println(arr[0]);
	}
	
	public static void startNewInts(){
		int startValue=2;
		int newValue=4;
		int a=startValue;
		int b=a;
		a=newValue;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	
	}
}