package ohyeah.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

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

            // 나눗셈 연산 두번째 정수 0 거르기
            if (operator == '/' && second == 0) {
                System.out.println("나눗셈 연산일 때 두번째 숫자에 0이 올 수 없습니다. 처음부터 다시 입력해주세요.");
                continue;
            }


            //계산 메서드 가져오기
            int result = calculator.calculate(first, second, operator);


            //결과값 출력
            System.out.println("결과: " + result);

            //기록 보시겠습니까? Getter 사용
            System.out.println("결과 기록을 보시겠습니까? (yes 입력시 기록 출력): ");
            String resultList = sc.next();
            if (resultList.equals("yes")) {
                System.out.println(calculator.getResults());
                //최근 기록 삭제 여부 remove 메서드
                System.out.println("가장 오래된 기록을 삭제하시겠습니까? (yes 입력시 삭제, 삭제를 원하지 않는다면 아무거나 입력해주세요.): ");
                String remove = sc.next();
                if (remove.equals("yes")) {
                    calculator.removeResult();
                    System.out.println("변경된 기록: " + calculator.getResults());
                }
            }



            //exit 입력시 종료
            System.out.println("계산기 종료하시겠습니까? (종료하려면 exit 입력, 이어서 하려면 아무거나 입력): ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }

        }
    }
}
