public class Calculator {
    public int result;
    public int calculate(int firstNum, int secondNum, char math) throws ClacException{
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
                throw new ClacException("+, -, *, / 4개중 하나를 입력해주세요.");
        }
        return result;
    }
}