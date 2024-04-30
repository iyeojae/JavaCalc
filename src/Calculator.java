import java.util.ArrayList;

public class Calculator {
    public int result;
    private ArrayList<Integer> resultListMath;

    private ArrayList<Integer> resultListCircle;

    Calculator(){
        result = 0;
        resultListMath = new ArrayList<Integer> ();
        resultListCircle = new ArrayList<Integer> ();
    }

    public double calculateCircleArea(double radius) {
        double area = 0;
        area = radius * radius * 3.14;
        resultListCircle.add((int)area);
        return area;
    }

    public ArrayList getCalcCircle() {
        return resultListCircle;
    }

    public void setCalcCircle(int set) {
        resultListCircle.add(result);
    }

    public void removeResultCircle() {
        resultListCircle.remove(0);
    }

    public void inquiryResultsCircle() {
        for(int i = 0; i < resultListCircle.size(); i++) {
            System.out.println(resultListCircle.get(i));
        }
    }

    public int calculateMath(int firstNum, int secondNum, char math) throws ClacException{
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        switch (math) {
            case '+' :
                result = firstNum + secondNum;
                break;
            case '-' :
                result = firstNum - secondNum;
                break;
            case '*' :
                result = firstNum * secondNum;
                break;
            case '/' :
                if(secondNum == 0) {
                    throw new ClacException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = firstNum / secondNum;
                break;
            default:
                throw new ClacException("+, -, *, / 4개중 하나를 입력해주세요... ㅠㅠ");
        }
        resultListMath.add(result);
        return result;
    }

    public ArrayList getCalcMath() {
        return resultListMath;
    }

    public void setCalcMath(int set) {
        resultListMath.add(result);
    }

    public void removeResultMath() {
        resultListMath.remove(0);
    }

    public void inquiryResultsMath() {
        for(int i = 0; i < resultListMath.size(); i++){
            System.out.println(resultListMath.get(i));
        }
    }
}