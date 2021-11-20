public class ReverseOfaNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;
            System.out.println(rem);
            num = num / 10;
        }
    }
}
