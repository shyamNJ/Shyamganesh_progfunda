package Assignment;

public class Ques2 {
	public static int valueOfPower(int a,int b) {
		if(b==0) {
			return 1;		
		}
		return  a*valueOfPower(a,b-1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2,b=10;
		int power=valueOfPower(a,b);
		System.out.println(power);

	}

}
