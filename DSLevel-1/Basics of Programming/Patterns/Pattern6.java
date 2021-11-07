import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 1, st = (n + 1) / 2;

        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }

            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            st--;
            sp += 2;

            System.out.println();
        }
        st++;
        sp -= 2;

        for (int i = (n / 2) + 1; i < n; i++) {
            st++;
            sp -= 2;
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }

            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}