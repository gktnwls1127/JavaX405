package day0111;

import util.ScannerUtil;

import java.util.Scanner;

public class Ex02Gradebook02 {
    public static Scanner SCANNER = new Scanner(System.in);
    public static int STUDENT_SIZE = 5;
    public static int SCORE_MIN = 0;
    public static int SCORE_MAX = 100;
    public static Student[] students = new Student[STUDENT_SIZE];

    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu(){
        while (true){
            String message;
            message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1){
                insertStudent();
            } else if (userChoice == 2) {
                printStudent();
            } else if (userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void insertStudent(){
        int index = findIndex();
        if(index == -1){
            moveElement();
            index = 4;
        }
        Student s = new Student();
        String message;

        message = "학생의 번호를 입력하시오.";
        s.setId(ScannerUtil.nextInt(SCANNER, message));

        message = "학생의 이름를 입력하시오.";
        s.setName(ScannerUtil.nextLine(SCANNER, message));

        message = "학생의 국어점수를 입력하시오.";
        s.setKorean(ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));

        message = "학생의 영어점수를 입력하시오.";
        s.setEnglish(ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));

        message = "학생의 수학점수를 입력하시오.";
        s.setMath(ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));

        students[index] = s;
    }

    public static void moveElement(){
        for (int i = 0; i < students.length - 1; i++){
            students[i] = students[i+1];
        }

    }

    public static int findIndex(){
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                return i;
            }
        }
        return -1;
    }

    public static void printStudent(){
        if (findIndex() == 0){
            System.out.println("아직 입력된 학생 정보가 없습니다.");
        } else {
            int lastindex = findIndex();
            if (lastindex == -1) {
                lastindex = 5;
            }
            for (int i = 0; i < lastindex; i++){
                Student s = students[i];
                s.print();
            }

        }
    }



}
