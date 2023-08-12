package java.interview;


//完成下面方法将一个int转成小端字节序的byte[]
public class Test21 {


    public static byte[] toLittleEndian(int i) {
        byte[] b = new byte[4];
        b[0] = (byte) (i & 0xff);
        b[1] = (byte) (i >> 8 & 0xff);
        b[2] = (byte) (i >> 16 & 0xff);
        b[3] = (byte) (i >> 24 & 0xff);
        return b;


    }

    public static void main(String[] args) {

    }
}
