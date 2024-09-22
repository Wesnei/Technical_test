public class Fibonacci {
    public boolean pertence(int num) {
        int a = 0, b = 1;
        while (b <= num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return num == 0 || num == 1;
    }
}
