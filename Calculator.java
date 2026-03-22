package ohyeah.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;     // result = 0으로 초기화했음

        for (;;) { //반복을 위해 for 사용

            //첫 번째 정수 입력 받기
            System.out.println("첫 번째 숫자를 입력해주세요: ");
            int first = sc.nextInt();
            if ( first < 0 ) {
                System.out.println("양의 정수만 입력 가능합니다. 처음부터 다시 입력해주세요.");
                continue;
            }

            //사칙연산 기호 입력 받기
            System.out.println("사칙연산 기호를 입력해주세요.");
            char operator = sc.next().charAt(0);
            if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("사칙연산 기호만 입력 가능합니다. 처음부터 다시 입력해주세요.");
                continue;
            }

            //두번째 기호 입력 받기
            System.out.println("두 번째 숫자를 입력해주세요: ");
            int second = sc.nextInt();
            if (second < 0) {
                System.out.println("양의 정수만 입력 가능합니다. 처음부터 다시 입력해주세요.");
                continue;
            }

            //계산 부분

            switch (operator) {
                case '+': result = first + second;
                    break;

                case '-': result = first - second;
                    break;

                case '*': result = first * second;
                    break;

                case '/':
                    if (second == 0) {
                        System.out.println("나눗셈 연산에서 두번째 숫자에 0이 입력될 수 없습니다. 처음부터 다시 입력해주세요.");
                        continue;
                    }
                    result = first / second;
            }

            //결과, exit 입력하면 종료 되는 부분
            System.out.println("결과: " + result);

            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료)");

            String exit = sc.next(); //
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}