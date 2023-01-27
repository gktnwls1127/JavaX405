package day0109;

import java.util.Scanner;

public class StarPrinter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 찍기 4번");
        System.out.println("출력할 줄 수를 입력해주세요");
        System.out.println("> ");
        int lineNumber = scanner.nextInt();
        for(int i = lineNumber; i >= 1; i--){
            String stars = "";
            for(int j = 1; j <= lineNumber; j++){
                if (j <= lineNumber - i) {
                    stars += " ";
                }
                else {
                    stars += "*";
                }
            }
            System.out.println(stars);
        }
        scanner.close();
    }
}
