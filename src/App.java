import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 : ");
        int x = a.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int y = a.nextInt();
        a.nextLine();
        System.out.print("사칙연산 기호를 입력하세요 : ");
        String z = a.next();
    }
}
