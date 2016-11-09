
public class DrumKitTestDrive {
	public static void main(String[] arsg){
		DrumKit d=new Drumkit();
		d.playSnare();
		d.Snare=false;
		d.playTopHat();
		if(d.Snare==true){
			d.playSnare();
		}
	}	
	public class DrumKit{
		boolean topHat=true;
		
		
	}
}
