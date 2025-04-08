package learning;

public class NoOfNumariclesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg ="23hhs42";
		int count =0;
		char[] carr = msg.toCharArray();
		for(int i =0; i<carr.length; i++) {
			if((int)carr[i] >48 &&(int)carr[i]<57) {
				count++;
			}
		}
		System.out.println(count);
	}

}
