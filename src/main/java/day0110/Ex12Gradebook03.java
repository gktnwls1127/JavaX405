package day0110;
// 1. 5명의 학생 성적을 관리하는 프로그램을 작성하시오.
//     단, 5명을 모두 입력한 후에는 더이상 입력할 수 없도록 코드를 작성하시오.
// 2. 5명의 학생 성적을 관리하는 프로그램을 작성하시오.
//     단, 5명 모두 입력한 후에 새로운 학생 정보를 입력할 시에는
//     가장 오래된 기록을 제거하고 새로운 학생 정보를 입력되도록 코드를 작성하시오.

import util.ScannerUtil;

import java.util.Scanner;

public class Ex12Gradebook03 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int ARRAY_SIZE = 5;
    public static final int SUBJECT_SIZE = 3;
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static Student[] student = new Student[ARRAY_SIZE];

    public static void main(String[] args) {
        while(true) {
            String message = " 1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                if (student[ARRAY_SIZE-1] != null){
                    printInfo();
                    break;
                }
                insertInfo();
            } else if (userChoice == 2) {
                if (student != null) {
                    printInfo();
                } else {
                    System.out.println("아직 입력된 학생의 정보가 존재하지 않습니다.");
                }
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        SCANNER.close();
    }

    public static void insertInfo(){
        for (int i =0; i < ARRAY_SIZE; i++){
            student[i] = new Student();
            String message;
            message = "학생의 번호를 입력하시오.";
            student[i].id = ScannerUtil.nextInt(SCANNER, message);

            message = "학생의 이름을 입력하시오.";
            student[i].name = ScannerUtil.nextLine(SCANNER, message);

            message = "학생의 국어 점수를 입력하시오.";
            student[i].korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN , SCORE_MAX);

            message = "학생의 영어 점수를 입력하시오.";
            student[i].english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN , SCORE_MAX);

            message = "학생의 수학 점수를 입력하시오.";
            student[i].math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        }


    }

    public static void printInfo(){
        for(int i = 0; i < ARRAY_SIZE; i++){
            System.out.println((i+1)+"번째 학생 : ");
            System.out.printf("번호 : %d번 이름: %s\n", student[i].id, student[i].name);
            System.out.printf("국어 : %d점 영어 : %d점 수학 : %d점\n", student[i].korean, student[i].english, student[i].math);
            System.out.printf("총점: %d점 평균: %.2f점\n", calculateSum()[i], calculateAverage()[i]);
        }
    }

    public static int[] calculateSum() {
        int[] total = new int[ARRAY_SIZE];
        for(int i = 0; i<ARRAY_SIZE; i++){
            total[i] = student[i].korean + student[i].english + student[i].math;
        }
        return total;

    }

    public static double[] calculateAverage() {
        double[] average = new double[ARRAY_SIZE];
        for (int i =0; i<ARRAY_SIZE; i++){
            average[i] = (double) calculateSum()[i] / SUBJECT_SIZE;
        }
        return average;
    }


}