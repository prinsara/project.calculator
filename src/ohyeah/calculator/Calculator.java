package ohyeah.calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> results = new ArrayList<>();

    //getter
    public ArrayList<Integer> getResults() {
        return results;
    }

    //Setter App에서 구현X
    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

    //기록 삭제 메서드
    public void removeResult() {
        results.remove(0);
    }

    //계산하기 calculate 메서드
    public int calculate (int first, int second, char operator) {
        int result = 0;

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
