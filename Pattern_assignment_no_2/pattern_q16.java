public class pattern_q16{
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((rows - j + 1) + " ");
            }
            System.out.println();
        }
    }
}
