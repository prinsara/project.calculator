package ohyeah.calculator;
import java.util.ArrayList;

public class Calculator {

    //계산 결과를 저장할 속성 하나 만들기
    //정수만 담는 리스트 여러 결과를 계속 저장할 수 있도록
    //이전 기록을 볼 수 있도록 결과를 담는 바구니가 필요해서 만듦
    // <> -> 이 리스트 안에 어떤 타입을 넣을지 적는 칸 지금은 정수만 넣게 제한해놓은 것
    private ArrayList<Integer> results = new ArrayList<>();


    //Calculator 바깥에서 못 건들게 private 추가
    //Getter, Setter도 추가해야함
    public ArrayList<Integer> getResults() {
        return results;
    }
    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }


    //메서드 생성하기(계산)
    //계산 결과를 정수로 돌려주는 int 사용
    public int calculate (int first, int second, char operator) {
        int result = 0;

        switch (operator) {
            case '+' :
                result = first + second;
                break;

            case '-' :
                result = first - second;
                break;

            case '*' :
                result = first * second;
                break;

            case '/' :
                result = first / second;
                break;
        }

        //results에 저장하기
        results.add(result);

        //결과 돌려받기
        return result;

    }
}




