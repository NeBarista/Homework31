public class Main {
    private static boolean playerNumber1 = true;
    public static void main(String[] args) {
        doStep(1, "step1");
        doStep(2, "step2");
        doStep(2, "step3");
        doStep(2, "step4");
        doStep(1, "step5");
        }
        public static void doStep( int playerNumber, String step) {
        if(playerNumber ==1 && playerNumber1 ||
        playerNumber == 2 && !playerNumber1) {
            System.out.println(step);
            playerNumber1 = !playerNumber1;
        }
    }
}