package java.interview;

public class Test24 {
    public static void main(String[] args) {
    	Test24 test24 = new Test24();
    	long i = 0;
    	System.out.println(test24.isTwoPower(i));
    	
    }

    public static boolean isTwoPower(long i) {
        if ((i & (i - 1)) == 0) {
            return false;
        } else {
            return true;
        }
    }
}
