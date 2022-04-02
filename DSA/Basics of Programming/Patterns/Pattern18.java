import java.util.*;

public class Pattern18
{
    public static void main(String[] args)
    {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = 0, st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }

            if (i <= n / 2) {
                System.out.print("*\t");
                if (i == 1) {
                    for (int j = 0; j < st - 2; j++) {
                        System.out.print("*\t");
                    }
                } else {
                    for (int j = 0; j < st - 2; j++) {
                        System.out.print("\t");
                    }
                }
                System.out.print("*\t");
                sp++;
                st -= 2;
            } else {

                for (int j = 0; j < st; j++) {
                    System.out.print("*\t");
                }
                sp--;
                st += 2;

            }
            System.out.println();
        }

    }
}