public class App {
    public static void main(String[] args) throws Exception {
        StackOverflow stackOverflow = new StackOverflow();
        long n = 200000;
        boolean run = true;
        while(run == true) {
            try { 
                System.out.println("iteration: " + stackOverflow.iteration(n));
                System.out.println("recursion: " + stackOverflow.recursion(n));
                n++;
            } catch (StackOverflowError e) {
                run = false;
                System.out.println("final stack capacity" + n);
                break;
            }
        }
    }
}
