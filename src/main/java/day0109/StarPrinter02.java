package day0109;

import java.util.Scanner;

public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 찍기 2번");
        System.out.println("출력할 줄 수를 입력해주세요");
        System.out.println("> ");
        int lineNumber = scanner.nextInt();
        for(int i = 1; i <= lineNumber; i++){
            String stars = "";
            for(int j = i; j <= lineNumber; j++){
                stars += "*";
            }
            System.out.println(stars);
        }
        scanner.close();
    }
}
