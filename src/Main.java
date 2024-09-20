import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//       1. first pattern is given by
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         *
         */
        Input obj = new Input();
        System.out.println("Enter the size of the pattern for square :");
        int var = obj.var1();
        System.out.println(var);

        for (int i = 0; i < var; i++) {
            for (int j = 0; j < var; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        2. triangle type 1

        *
        * *
        * * *
        * * * *
         */
        System.out.println("Enter value for triangle type 1:");
        int var1 = obj.var1();
        System.out.println(var1);
        for (int i = 0; i < var1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
        3. triangle type 2
        * * * * *
        * * * *
        * * *
        * *
        *
        * */
        System.out.println("Enter size of triangle type 2:");
        int var2 = obj.var1();
        for (int i = var2; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        4. triangle type 3
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
        *
        * */
        System.out.println("Enter the size of pattern triangle type 3:");
 int var4=obj.var1();
        for(int i=0; i<var4;i++){

            for(int j=var4-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
/*
*
* *
* * *
* *
*
*/
        System.out.println("Enter size of triangle type 4:");
        int var3 = obj.var1();
        for(int i=0;i<var3;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<var3;i++){
            for(int j=var3;j>=i+1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

/*
* this is type 5 pattern
                     *
                   * *
                 * * *
               * * * *
             * * * * *
           * * * * * *
* */
        System.out.println("Enter the size of pattern triangle type 5:");
        int var5=obj.var1();
        for(int i=0; i<var5;i++){

            for(int j=var4-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        this is sixth type of pattern
        * * * * * *
          * * * * *
            * * * *
              * * *
                * *
                  *

        * */
        System.out.println("Enter ther sixth type of pattern triangle type 6:");
        int var6=obj.var1();
        for(int i=0;i<var6;i++){

            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=var6;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        * * * * * * *
          * * * * *
            * * *
              *
        *
        * */
        System.out.println("Enter the value for triangle type 7:");
        int var7= obj.var1();
        for(int i=0;i<var7/2;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=var7/2;k>i;k--){
                System.out.print("*");
            }
            for(int l=(var7-1)/2;l>i;l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}