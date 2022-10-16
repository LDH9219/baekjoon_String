/*
 * 10809
 * 문제 : 알파벳 소문자만으로 이루어진 단어 S가 주어진다.
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를
 * 포함되어 있지 않은 경우엔 -1을 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 단어 S 가 주어진다.
 * 출력 : 각각의 알바펫 위치를 공백으로 구분해서 출력한다.
 * 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
 * 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 * 
 * 입력받기 위해 import java.util.Scanner;
 * 알파벳의 개수크기만큼 배열길이 지정하고 생성
 * 단어에 포함되지 않았다면 -1을 출력하므로 기본을 -1로 초기화
 * Scanner .length; charAt(i)를 통해 입력된 문자열을 분해
 * 
 * 
 */

import java.util.Scanner;

public class findAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        for(int i = 0; i< arr.length; i ++){
            arr[i] = -1;
        }

        String s = sc.nextLine();

        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr){
            System.out.print(val+" ");
        }

    }
}