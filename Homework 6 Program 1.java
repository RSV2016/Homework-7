import java.util.*;

public class lesson1  {
	static Scanner scn=new Scanner(System.in);
	static int i;
	static int array[];
	
	
	public static void main(String args[]){
		System.out.println("Ââåäèòå èíäåêñ");
		i=scn.nextInt();
		int array[]=new int[i];
		inputArray(array);
		outputArray(array);
	}
	 
		
	public static void inputArray(int array[]){
		System.out.println("Ââåäèòå ÷èñëî");
		for(int i=0;i<array.length;i++){
			array[i]=scn.nextInt();
		}
		
	}
	
	public static void outputArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.println("Ðåçóëüòàò="+array[i]);
		}
		
	}


}
