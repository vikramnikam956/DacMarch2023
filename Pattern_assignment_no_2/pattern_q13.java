public class pattern_q13 {
    public static void main(String[] args) {
        int rows = 6;
        

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char)(i+64) + " ");
                
            }
            System.out.println();
        }
    }
}