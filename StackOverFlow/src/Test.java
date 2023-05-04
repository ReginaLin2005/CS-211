public class Test {
    public static void main(String[] args) {
        long n = 11800;
        System.out.println("iteration: " + iteration(n));
        System.out.println("recursion: " + recursion(n));
    }

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}
