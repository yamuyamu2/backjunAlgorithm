import java.util.Scanner;

public class backjun2588 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        String B = in.next();
        int c = B.length();
        for(int i = c-1; 0<=i; i--) {
            int b = Integer.parseInt(String.valueOf(B.charAt(i)));
            System.out.println(A*b);
        }
        System.out.print(A*Integer.parseInt(B));
    }
}
