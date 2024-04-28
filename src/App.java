import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int [] resultlist = new int[10];

        int lastindex = 0;

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int firstnum = a.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int secondnum = a.nextInt();
            a.nextLine();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            String z = a.next();

            int result = 0;
            switch (z) {
                case "+" :
                    result = firstnum + secondnum;
                    break;
                case "-" :
                    result = firstnum - secondnum;
                    break;
                case "*" :
                    result = firstnum * secondnum;
                    break;
                case "/" :
                    if(secondnum == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = firstnum / secondnum;
                    break;
                default:
                    System.out.println("제대로 입력하세요...");
                    break;
            }
            System.out.println("결과 : " + result);

            resultlist[lastindex] = result;
            ++lastindex;
            int remain = 10 - lastindex;
            System.out.print("저장 공간이 " + remain + " 남았습니다.");

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String more = a.next();
            if(more.equals("exit")) {
                break;
            }
        }
    }
}
