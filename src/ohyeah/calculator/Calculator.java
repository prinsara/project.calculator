package ohyeah.calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> results = new ArrayList<>();

    public int calculate (int first, int second, char operator) {
        int result = 0;

            //계산하기
        switch (operator) {
            case '+' : result = first + second;
                break;

            case '-' : result = first - second;
                break;

            case '*' : result = first * second;
                break;

            case '/' : result = first / second;
                break;
        }

        results.add(result);
        return result;
    }
}
