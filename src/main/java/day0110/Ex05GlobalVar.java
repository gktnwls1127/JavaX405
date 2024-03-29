package day0110;

import util.ScannerUtil;

import java.util.Scanner;

// 전역 변수(Global Variable)
// 전역 상수는 사용 권장이 되고 있음
public class Ex05GlobalVar {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int SUBJECT_SIZE = 3;
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;

    public static Student student = null;
    // 출력시 student가 null과 같을 경우 입력이 한번도 되지 않은 상태
    // 참조형 데이터타입에서만 발생하는 null
    // "" 의 형태와 다른 형태 null 은 String에 대한 정보가 아예 없는 상태
    // null : 힙 영역안에 주소값 부여되어 공간이 존재하지만 값이 없는 상태

    public static void main(String[] args) {
        while(true) {
            String message = " 1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
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
        student = new Student();
        String message;

        message = "학생의 번호를 입력하시오.";
        student.id = ScannerUtil.nextInt(SCANNER, message);

        message = "학생의 이름을 입력하시오.";
        student.name = ScannerUtil.nextLine(SCANNER, message);

        message = "학생의 국어 점수를 입력하시오.";
        student.korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN , SCORE_MAX);

        message = "학생의 영어 점수를 입력하시오.";
        student.english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN , SCORE_MAX);

        message = "학생의 수학 점수를 입력하시오.";
        student.math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
    }

    public static void printInfo(){
        System.out.printf("번호 : %d번 이름: %s\n", student.id, student.name);
        System.out.printf("국어 : %d점 영어 : %d점 수학 : %d점\n", student.korean, student.english, student.math);
        System.out.printf("총점 : %d점 평균 : %.2f점\n", calculateSum(), caculateAverage());
    }

    public static int calculateSum(){
        return student.korean + student.english + student.math;

    }

    public static double caculateAverage(){
        return (double) calculateSum() / SUBJECT_SIZE;
    }
}
