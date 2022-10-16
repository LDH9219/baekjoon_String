/*
 * 1157
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 
 * 출력
 * 첫째줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
 * 단 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ? 를 출력한다.
 */

import java.util.Scanner;

public class Java1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toUpperCase();

        int[] arr = new int [26];

        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i)-'A';
            arr[num]++;
        }

        int max = 0;
        char answer = '?';
        for(int i=0; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                answer = (char)(i+'A');
            } else if(max == arr[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}