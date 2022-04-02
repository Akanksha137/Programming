import java.io.*;
import java.util.*;

public class ArrangeBuilding{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n  = scn.nextInt();
    int oczeroes = 1;
    int ocones=1;
    for(int i=2;i<=n;i++){
        int nczeroes = ocones;
        int ncones = oczeroes+ ocones;
        ocones =ncones;
        oczeroes =nczeroes;
    }
    long val = oczeroes+ocones;
    val = val *val;
    System.out.println(val);
 }

}