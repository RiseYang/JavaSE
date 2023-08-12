package algorithm;

import java.util.Arrays;


public class BubbleSort {
	public static void main(String[] args) {
		int[] num = new int[] {3,7,6,5,4,8};
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) {
				if(num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
				System.out.println(Arrays.toString(num));
			}
		}
	}
	
/*	public static void bubbleSort1(int [] a, int n){
	    int i, j;
	    for(i=0; i<n; i++){
	        for(j=1; j<n-i; j++){
	            if(a[j-1] > a[j]){
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
	    int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};

	    BubbleSort.bubbleSort1(arr, arr.length);

	    for(int i:arr){
	        System.out.print(i+",");
	    }
	}*/
}
