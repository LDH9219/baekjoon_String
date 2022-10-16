import java.util.Scanner;

public class Java1152 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] num_cnt = line.split(" ");

        if(num_cnt.length == 0){
            System.out.println(0);
            System.exit(0);
        }

        if(num_cnt[0] ==""){
            System.out.println(num_cnt.length - 1);
        } else{
            System.out.println(num_cnt.length);
        }
    }
}