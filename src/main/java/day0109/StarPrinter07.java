package day0109;

import java.util.Scanner;

public class StarPrinter07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 찍기 7번");
        System.out.println("출력할 줄 수를 입력해주세요");
        System.out.println("> ");
        int lineNumber = scanner.nextInt();

        int totalHeight = 2 * lineNumber - 1;

        for (int i = 1; i <= totalHeight; i++) {
            String stars = "";
            if (i<lineNumber) {
                for (int j = 1; j <= i; j++) {
                    stars += '*';
                }

            }
            else {
                for(int j = 1; j <= i-lineNumber; j++){
                    stars += " ";
                }

                // -2 * i + (2 * lineNumber + 1)
                // = 2 * (lineNumber - i) + 1
                for(int j = 1; j <= 2 * lineNumber - i; j++){
                    stars += "*";
                }

            }
            System.out.println(stars);
        }


        scanner.close();
    }

}
