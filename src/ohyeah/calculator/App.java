package ohyeah.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //스캐너 사용 선언
        Scanner sc = new Scanner(System.in);

        //계산 사용하기 위해 Calculator 객체 생성
        Calculator calculator = new Calculator();

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
            if (second < 0) {
                System.out.println("양의 정수만 입력해주세요.");
                continue;
            }

            // 나눗셈 연산일 때 두번째 숫자에 0이 왔을 경우 다시 입력하게 만들기
            if (operator == '/' && second == 0) {
                System.out.println("나눗셈 연산일 때 두 번째 숫자에 0이 입력될 수 없습니다. 처음부터 다시 입력해주세요.");
                continue;
            }


            //계산
            //first 입력 후 operator 입력 받고 second 입력 받은 뒤에 사용할 수 있기 때문에
            //해당 위치에 넣어준다.
            int result = calculator.calculate(first, second, operator);

            //결과
            System.out.println("결과: " + result );

            //계산 기록을 보시겠습니까?
            System.out.println("계산 했던 기록을 보시려면 yes를 입력해주세요.");
            String history = sc.next();
            if (history.equals("yes")) {
                System.out.println("계산 기록: " + calculator.getResults());

                //Setter로 기록 초기화
                System.out.println("기록을 초기화 하시겠습니까? yes or no");
                String reset = sc.next();
                if (reset.equals("yes")) {
                    //계산 기록 휴지통 추가
                    ArrayList<Integer> emptyList = new ArrayList<>();
                    calculator.setResults(emptyList);
                    System.out.println("계산 기록이 초기화 되었습니다.");

                }

            }

            //결과 출력 후 exit 하면 종료할 수 있게끔 표시
            System.out.println("계산기를 종료하시려면 exit를 입력해주세요.");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }


        }
    }
}
