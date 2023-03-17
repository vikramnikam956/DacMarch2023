public class pattern_q8 {

    public static void main(String[] args) {
        int rows = 5;
        int num;

        for (int i = 1; i <= rows; i++) {
            num = 5;
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((num) + " ");
                num--;
            }
            System.out.println();
        }
    }
}



