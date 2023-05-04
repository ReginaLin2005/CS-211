public class StackOverflow {
    

    public static long iteration (long n) {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    } 

    public static long recursion(long n) {
        long sum = 0;
        try {
            if (n >= 1) {
            sum = n + recursion(n - 1);
            }
        } catch (StackOverflowError e) {
            e.printStackTrace();
            System.out.println(n + "exceeds stack capacity");
        }
        return sum;
    }

}
