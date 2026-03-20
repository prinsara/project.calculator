package ohyeah.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // sc 변수, System.in = 키보드 입력 ㅇㅋ
       Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int apple = sc.nextInt(); //첫 번째 정수 입력 받는 칸
        System.out.print("두 번째 숫자를 입력하세요: ");
        int banana = sc.nextInt(); //두 번째 정수 입력 받는 칸


        System.out.print("사칙연산 기호를 입력하세요: ");
        char melon = sc.next() .charAt(0); //문자열로 받고 맨 앞글자 꺼내기, Scanner는 글자 하나를 못 꺼낸다.




    }
}
