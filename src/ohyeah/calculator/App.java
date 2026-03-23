package ohyeah.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //스캐너 사용 선언
        Scanner sc = new Scanner(System.in);
        //결과값 변수 지정
        int result = 0;

        //반복문

        for (;;) {

            //첫 번째 정수 입력 받기
            System.out.println("첫 번째 정수를 입력해주세요: ");
            int first = sc.nextInt();
            //양의 정수만 입력 받기
            if (first < 0) {
                System.out.println("양의 정수만 입력해주세요.");
                continue;
            }

            //사칙연산 기호 입력 받기
            System.out.println("사칙연산 기호를 입력해주세요: ");
            char operator = sc.next().charAt(0); //문자 하나 + 첫 번째 입력 값만 가져오기
            //사칙연산 기호만 입력할 수 있게
            if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println(" 사칙연산 기호만 입력해주세요.");
                continue;
            }

            //두 번째 정수 입력 받기
            System.out.println("두 번째 정수를 입력해주세요: ");
            int second = sc.nextInt();
            //양의 정수만 입력 받기
            if (second <0) {
                System.out.println("양의 정수만 입력해주세요.");
                continue;
            }

            //결과
            System.out.println("결과: " + result );
            //결과 출력 후 exit 하면 종료할 수 있게끔 표시
            System.out.println("계산기를 종료하시려면 exit를 입력해주세요.");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}
