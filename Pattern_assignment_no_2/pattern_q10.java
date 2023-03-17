public class pattern_q10 {

    public static void main(String[] args) {
        int rows = 8;
        int num;

        for (int i = 1; i <= rows; i++) {
            num = rows;
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char)(num+64) + " ");
                num--;
            }
            System.out.println();
        }
    }
}