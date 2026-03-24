package ohyeah.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0; //결과값 변수

        //반복문 사용
        for (;;) {

            //첫 번째 정수 입력 받기
            System.out.println("첫 번째 숫자를 입력해주세요: ");
            int first = sc.nextInt();
            if (first < 0) {
                System.out.println("양의 정수만 입력 가능합니다.");
                continue;
            }

            //사칙연산 기호 입력 받기
            System.out.println("사칙연산 기호를 입력해주세요.");
            char operator = sc.next().charAt(0);
            if(!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("사칙연산 기호만 입력 가능합니다. 처음부터 다시 입력해주세요.");
                continue;
            }


            //두 번째 정수 입력 받기
            System.out.println("두 번째 숫자를 입력해주세요: ");
            int second = sc.nextInt();
            if (second < 0) {
                System.out.println("양의 정수만 입력 가능합니다.");
                continue;
            }

            //계산하기

            switch (operator) {
                case '+' : result = first + second;
                break;

                case '-' : result = first - second;
                break;

                case '*' : result = first * second;
                break;

                case '/' : //나눗셈 연산일 때 두 번째 정수가 0이면 거르기
                    if (second == 0) {
                        System.out.println("나눗셈 연산일 때 두 번째 숫자에 0이 올 수 없습니다.");
                        continue;
                    }
                    else {
                        result = first / second;
                        break;
                    }
            }

            //결과값 출력
            System.out.println("결과: " + result);

            //exit 입력시 종료
            System.out.println("계산기 종료하시겠습니까? (종료하려면 exit 입력, 이어서 하려면 아무거나 입력): ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }







        }
    }
}
