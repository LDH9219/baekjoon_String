/*
 * 11720
 * 문제 : N 개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력.
 * 입력 : 첫째 줄에 숫자의 개수 N(1<=N<=100)이 주어진다.
 * 출력 : 둘째 줄에 숫자 N 개가 공백 없이 주어진다.
 * 
 * 
 * 
 */

import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        sc.close();

        int sum = 0;
        for(int i=0;i<a;i++){
            sum += b.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}