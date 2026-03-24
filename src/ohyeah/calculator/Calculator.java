package ohyeah.calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> results = new ArrayList<>();

    //get, set(Setter) Calculator에만 만들고 App에서 구현X
    public ArrayList<Integer> getResults() {
        return results;
    }

    public void setResults() {
        this.results = results;
    }

    //기록 삭제 메서드
    public void removeResult() {
        results.remove(0);
    }

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

        results.add(result); //결과값을 results에 넣기
        return result;
    }
}
