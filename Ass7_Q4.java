
public class Ass7_Q4 {


    public static long reverseBits(long n) {
        long result = 0;
        
        for (int i = 0; i < 64; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        long num = 0b1010101010101010101010101010101010101010101010101010101010101010L;
        System.out.println("Original number: " + num);
        System.out.println("Binary representation of original number: " + Long.toBinaryString(num));
        
        long reversed = reverseBits(num);
        System.out.println("Reversed number: " + reversed);
        System.out.println("Binary representation of reversed number: " + Long.toBinaryString(reversed));
    }
}
