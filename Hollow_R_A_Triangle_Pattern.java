import java.util.*;

/*
*
**
* *
*  *
*****
 */

public class Hollow_R_A_Triangle_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the pattern");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        for(i=0;i<n;i++){
         for(j=0;j<=i;j++){
            if(j==0||i==n-1||i==j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
         }
         System.out.println();
        }
        sc.close();
    }
}

