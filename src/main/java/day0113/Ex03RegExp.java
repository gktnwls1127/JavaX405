package day0113;
// 정규표현식(Regular Expression)
// 어떤 String 패턴을 표현하는 방법

public class Ex03RegExp {
    public static void main(String[] args) {
        // 1. 숫자 체크
        System.out.println("1. 숫자 체크");
        String pattern = "\\d"; // 해당 String 이 한개의 숫자 하나로만 이뤄졌는지를 체크
        System.out.println("\"1\" : " + "1".matches(pattern)); // true
        System.out.println("\"a\" : " + "a".matches(pattern)); // false
        System.out.println("--------------------------------------------------\n");

        // 2. 글자 체크
        System.out.println("2. 글자 체크");
        pattern = "\\w"; // 해당 String 이 한개의 단어 하나로만 이뤄졌는지를 체크
        System.out.println("\"1\" : " + "1".matches(pattern)); // true
        System.out.println("\"a\" : " + "a".matches(pattern)); // true
        System.out.println("--------------------------------------------------\n");

        // 2-1. 알파벳 체크
        System.out.println("2-1. 알파벳 체크");
        pattern = "[A-Za-z]"; // [] 범위로 묶어줌
        System.out.println("\"1\" : " + "1".matches(pattern)); // false
        System.out.println("\"a\" : " + "a".matches(pattern)); // true
        System.out.println("--------------------------------------------------\n");

        // 3. 여러개의 숫자로만 이루어졌는지 체크
        System.out.println("3. 여러개의 숫자로만 이루어졌는지 체크");
        pattern = "\\d+"; // \\d+ 1개 이상의 숫자, \\d* 0개이상의 숫자
        System.out.println("\"1\" : " + "1".matches(pattern)); // true
        System.out.println("\"123\" : " + "123".matches(pattern)); // true
        System.out.println("--------------------------------------------------\n");

        // 4. 복합접으로 섞어서 사용해보기
        System.out.println("4. 복합접인 사용");
        pattern = "010-\\d{4}-\\d{4}"; // \\d{숫자 갯수}
        System.out.println("\"010-1234-1234\" : " + "010-1234-1234".matches(pattern)); // true
        System.out.println("\"010-9999-8888\" : " + "010-9999-8888".matches(pattern)); // true
        System.out.println("\"02-111-2222\" : " + "02-111-2222".matches(pattern)); // false
        System.out.println("\"서울시 강남구 강남동 강남로\" : " + "서울시 강남구 강남동 강남로".matches(pattern)); // false
        System.out.println("\"admin@gmail.com\" : " + "admin@gmail.com".matches(pattern) ); // false
        System.out.println("--------------------------------------------------\n");

        pattern = "\\d{3,6}"; // \\d{3,6} 3개에서 6개의 숫자
        System.out.println("\"1\" : " + "1".matches(pattern)); // false
        System.out.println("\"135\" : " + "135".matches(pattern)); // true
        System.out.println("\"13579\" : " + "13579".matches(pattern)); // true
        System.out.println("\"123456\" : " + "123456".matches(pattern)); // true
        System.out.println("\"1234567\" : " + "1234567".matches(pattern)); // false
        System.out.println("--------------------------------------------------\n");


    }
}
