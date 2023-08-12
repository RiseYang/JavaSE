package algorithm.Test;

public class AddOneToHandred {
	public static void main(String[] args) {
		int total=0;
		int end=100;
		
		for(int i=1;i<=end;i++) {
			total+=i;
		}

//		total=(1+end)*end/2;

		System.out.println(total);
		
	}
}
