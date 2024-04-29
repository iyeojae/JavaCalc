import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        //int [] resultList = new int[3];

        int lastIndex = 0;
        Calculator Calc = new Calculator();

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int firstNum = a.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int secondNum = a.nextInt();

            a.nextLine();
            try{
                System.out.print("사칙연산 기호를 입력하세요 : ");
                char math = a.next().charAt(0);
                Calc.calculate(firstNum, secondNum, math);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            //resultList[lastIndex] = result;
            //++lastIndex;
            //int remain = 10 - lastIndex;

            //System.out.println("저장 공간이 " + remain + " 남았습니다.");
            /*
            if(lastIndex > resultList.length-1){
                System.out.println("저장 공간이 만땅이 되서 첫번째 결과값을 지우고 이번 결과 값을 넣었습니다.");
                for(int i = 0; i < resultList.length-1; i++){
                    resultList[i] = resultList[i+1];
                }
                resultList[resultList.length-1] = result;
            }
            */
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = a.next();

            if(remove.equals("remove")){
                Calc.getCalc().remove(0);
            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = a.next();
            String str = Calc.getCalc().toString();
            if(inquiry.equals("inquiry")){
                for(int i = 0; i < Calc.getCalc().size(); i++){
                    System.out.println(Calc.getCalc().get(i));
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");

            String more = a.next();

            if(more.equals("exit")) {
                break;
            }

        }
    }
}
