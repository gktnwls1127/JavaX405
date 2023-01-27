package day0109;

import java.util.Scanner;

public class StarPrinter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 찍기 8번");
        System.out.println("출력할 줄 수를 입력해주세요");
        System.out.println("> ");
        int lineNumber = scanner.nextInt();

        int totalHeight = 2 * lineNumber - 1;

        for (int i = 1; i <= totalHeight; i++) {
            String stars = "";
            int spaceWidth = 0;
            int starWidth = 0;

            if (i < lineNumber) {
                for(int j = 1; j <= lineNumber; j++){
                    if (j <= lineNumber - i) {
                        stars += " ";
                    }
                    else {
                        stars += "*";
                    }
                }

            }
            else {
                int lowerI = i - lineNumber + 1;
                //아랫부분
                spaceWidth = lowerI - 1;
                starWidth = lineNumber - lowerI + 1;
                for(int j = 1; j <= spaceWidth; j++){
                    stars += " ";
                }

                // -2 * i + (2 * lineNumber + 1)
                // = 2 * (lineNumber - i) + 1
                for(int j = 1; j <= starWidth; j++){
                    stars += "*";
                }
            }
            System.out.println(stars);
        }


        scanner.close();
    }
}
