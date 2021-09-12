import java.util.Scanner;

public class backjun1330 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        if(A==B){
            System.out.println("==");
        }else{
            System.out.println(A>B?">":"<");
        }
    }
}
