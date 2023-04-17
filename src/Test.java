public class Test {
    public static void main(String[] args) throws Exception {
        NewRandom newRandom = new NewRandom();
        for (int i = 1; i <= 40; i++) {
            System.out.println("trial: " + i + " number: " + newRandom.nextInt(1, 5));
        }
    }
}
