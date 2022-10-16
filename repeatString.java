/*
 * 2675
 * 문제 : 문자열 S 를 받은 후에 각 문자를 R 번 반복해 새 문자열 P를 출력
 * 
 * 입력 :
 * 테스트 케이스의 개수 T(1<=T<=1000)가 주어진다.
 * 각 테스트 케이스는 반복 횟수 R(1<=R<=8)
 * 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1 이며, 20글자를 넘기지 않는다.
 * 
 * 출력 : 각 테스트 케이스에 대해 P를 출력한다.
 * 
 * 테스트 케이스의 개수 caseNum / 문자열 str / 반복 re 
 * 
 * 
 */

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int caseNum = sc.nextInt();

        for(int i = 0; i < caseNum; i++){

            int re = sc.nextInt();
            String str = sc.next();

            for(int j = 0; j < str.length(); j++){

                for(int k=0; k < re ; k++){
                    System.out.print(str.charAt(j));
                }
            }

            System.out.println();
        }


        }
}