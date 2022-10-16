/*
 * 11654
 * 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때
 * 주어진 글자의 아스키 코드 값을 출력하는 프로그램을 작성하시오.
 * 
 * charAt(0); 으로 아스키 코드를 출력한다.
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ascii {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char a = br.readLine().charAt(0);
        int num = (int)a;

        System.out.println(num);
    }
}