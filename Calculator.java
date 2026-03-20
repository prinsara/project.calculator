package ohyeah.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        for (; ; ) {

            System.out.println("첫 번재 숫자를 입력하세요: ");
            int apple = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char melon = sc.next().charAt(0);
            if (!(melon == '+' || melon == '-' || melon == '*' || melon == '/')) {
                System.out.println("사칙연산 기호만 입력 처음으로 돌아가기 고고");
                continue;
            }


            System.out.println("두 번째 숫자를 입력하세요: ");
            int banana = sc.nextInt();

            if (banana == 0 && melon == '/') {
                System.out.println(" 나눗셈일 때 두 번째 숫자가 0이면 안돼용");
                continue;
            }

            if ( melon == '+'){
                result = apple + banana;
            }

            if ( melon == '-'){
                result = apple - banana;
            }

            if ( melon == '*'){
                result = apple * banana;
            }

            if ( melon == '/'){
                result = apple / banana;
            }

            System.out.println("결과: " + result );

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exit = sc.next();
            if (exit.equals("exit")) { //.equals 활용 : 문자열 내용이 같은지
                break;
            }
        }
    }
}