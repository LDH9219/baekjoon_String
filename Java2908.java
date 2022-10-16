import java.util.Scanner;

public class Java2908 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringBuffer r_a = new StringBuffer(a);
        StringBuffer r_b = new StringBuffer(b);

        a = r_a.reverse().toString();
        b = r_b.reverse().toString();

        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        if(A > B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }
    }
}