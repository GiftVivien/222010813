public class labeledExample {
    public static void main(String[] args) {

        aa: for (int i = 1; i <= 6; i++) {
            bb: for (int j = 1; j <= 6; j++) {
                if (i == 4 && j == 4) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }

}
