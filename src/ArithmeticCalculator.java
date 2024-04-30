import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{
    private ArrayList<Integer> resultListMath = new ArrayList<Integer> ();
    operater addOperator = new AddOperator();
    operater subtractOperator = new SubtractOperator();
    operater multiplyOperator = new MultiplyOperator();
    operater divideOperator = new DivideOperator();
    operater modOperator = new ModOperator();

    public int calculate(int firstNum, int secondNum, char math) throws ClacException{
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        int result = 0;
        switch (math) {
            case '+' :
                result = addOperator.operate(firstNum, secondNum);
                break;
            case '-' :
                result = subtractOperator.operate(firstNum, secondNum);
                break;
            case '*' :
                result = multiplyOperator.operate(firstNum, secondNum);
                break;
            case '/' :
                if(secondNum == 0) {
                    throw new ClacException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = divideOperator.operate(firstNum, secondNum);
                break;
            case '%' :
                result = modOperator.operate(firstNum, secondNum);
            default:
                throw new ClacException("+, -, *, / 4개중 하나를 입력해주세요... ㅠㅠ");
        }
        resultListMath.add(result);
        return result;
    }

    public ArrayList<Integer> getCalc() {
        return resultListMath;
    }

    public void setCalc(int set) {
        resultListMath.add(set);
    }

    public void removeResult() {
        resultListMath.remove(0);
    }

    public void inquiryResults() {
        for(int i = 0; i < resultListMath.size(); i++){
            System.out.println(resultListMath.get(i));
        }
    }
}


