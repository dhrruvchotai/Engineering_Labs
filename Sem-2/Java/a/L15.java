//Taking user input through Scanner class.

package Lab.a;

import java.util.Scanner;

public class L15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}
