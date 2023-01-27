package day0111;

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex06Gradebook03 {
    public static Scanner SCANNER = new Scanner(System.in);
    public static int SCORE_MIN = 0;
    public static int SCORE_MAX = 100;
    public static Student[] students = new Student[0];

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
                printStudentList();
            } else if (userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void insertStudent(){
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

        students = ArrayUtil.add(students, s);
    }

    public static void printStudentList() {
        if (ArrayUtil.size(students) == 0) {
            System.out.println("아직 입력된 학생 정보가 없습니다.");
        } else {
            for (int i = 0; i < ArrayUtil.size(students); i++) {
                System.out.println(ArrayUtil.get(students, i).getId() + ".  " + ArrayUtil.get(students, i).getName());
            }

            String message = " 상세보기할 글의 번호나 뒤로가실려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            while (userChoice != 0 && findIndexById(userChoice) == -1) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(SCANNER, message);
            }

            if (userChoice != 0) {
                printOne(userChoice);
            }


        }
    }
    public static void printOne(int id) {
        if (findIndexById(id) == -1) {
            System.out.println("해당 id를 가진 게시글은 존재하지 않습니다.");
        } else {
            students[findIndexById(id)].print();
            String message = "1. 수정 2. 삭제 3. 뒤로가기";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                update(id);
            } else if (userChoice == 2) {
                int index = findIndexById(id);
                students = ArrayUtil.remove(students, index);
            } else if (userChoice == 3) {
                // showMenu()로 가지 않고 printList()로 가는 방법
                printStudentList();
            }
        }
    }
    public static void update(int id) {
        int index = findIndexById(id);
        ArrayUtil.get(students, index).setName(ScannerUtil.nextLine(SCANNER, "새로운 이름을 입력해주세요."));
        ArrayUtil.get(students, index).setKorean(ScannerUtil.nextInt(SCANNER, "새로운 국어 성적을 입력해주세요.", SCORE_MIN, SCORE_MAX));
        ArrayUtil.get(students, index).setEnglish(ScannerUtil.nextInt(SCANNER, "새로운 영어 성적을 입력해주세요.", SCORE_MIN, SCORE_MAX));
        ArrayUtil.get(students, index).setMath(ScannerUtil.nextInt(SCANNER, "새로운 수학 성적을 입력해주세요.", SCORE_MIN, SCORE_MAX));

        printOne(id); // 수정한 내용이 출력됨.

    }

    public static int findIndexById(int id){
        for(int i = 0; i < ArrayUtil.size(students); i++){
            if(ArrayUtil.get(students, i) != null && id == ArrayUtil.get(students, i).getId()){
                return i;
            }
        }
        return -1;
    }





}