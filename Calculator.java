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

            //여태 if로 진행해보았으니, 다른 것도 사용해보기
            //시작 -> 첫 번째 숫자 입력 받기 -> 기호 입력 받기 -> 두 번째 숫자 입력 받기 -> 다만 '/' 할 때 두 번째 정수가 0이면 걸러지는 구간은 '/' 계산할 때 만들어보자
            // 계산 구간

            switch (operator) {
                case '+': result = first + second;
                break;

                case '-': result = first - second;
                break;

                case '*': result = first * second;
                break;

                case '/':
                    if (second == 0) {
                        System.out.println("나눗셈 두번째 숫자 0ㄴㄴ");
                        continue;
                    }
                    result = first / second;
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산 하시겠습니까? exit 입력하시면됨");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;

            }
        }
    }
}