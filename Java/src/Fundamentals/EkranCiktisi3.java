package Fundamentals;

public class EkranCiktisi3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        for (int i = 8; i >= 1; i--) {
            for (int j = i; j <= 9; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
