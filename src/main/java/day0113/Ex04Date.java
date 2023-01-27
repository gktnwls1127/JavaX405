package day0113;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ex04Date {
    public abstract int showName();
    public static void main(String[] args) {
        Date d = new Date();
        d.setHours(16);
        d.setMonth(1);
        System.out.println(d);

        DateFormat df = new SimpleDateFormat("yy/MM/dd hh:mm:ss");
        // y : 연도
        // M : 월 (0~11)
        // d : 해당 월의 일자
        // E : 요일

        // h : 오전/오후 체계의 현재시간
        // H : 24시간 체계의 현재 시간
        // m : 현재 분
        // s : 현재 초
        // S : 현재 밀리초

        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyMMdd");
        df.setLenient(false); // 유저가 잘못입력했을시 관대하게 시스템에서 계산하지 않도록
        String temp = "230193"; // 설정된 패턴길이까지 date로 변환 121212ddddd 변환가능

        try { // try-catch 메소드를 만들때 어떤 예외가 발생할수 있다는 것을 미리 등록 , 문제를 처리할 코드를 작성하기
            d = df.parse(temp); // parse() 예외를 어떻게 처리하겠다고 말하지 않고 이런 예외가 발생한다고 등록만 한다
        } catch (Exception e){ // date 에서 바꿔야할 String 의 값이 지정한 패턴과 맞지 않는 경우 에러 발생
            System.out.println("해당 스트링은 date로 변환할수 없어서 현재 날짜로 date를 설정하겠습니다.");
            d = new Date();
        }
        System.out.println(d);
    }
}
