package day0111;
// 기본 생성자 : 생성자를 만들지 않아도 사용할 수 있다.
// 프로그래밍에서 상속 : 클래스 상속, 인터페이스 상속
// 클래스 상속 : 코드의 재사용성을 부여하기 위해 사용됨 .
// 자식은 부모클래스가 부여한 메소드를 접근제한자가 없으면 모두 사용가능.
// 자바에 존재하는 모든 클래스는 공통된 조상을 가지고 있음 java.lang.object
// java.lang.object 안에 있는 메소드 equals(), toString()
// 상속과 관련된 코드를 적어주지 않아도 부모 클래스는 java.lang.object
// java.lang.object 호출 후 Student 호출
// java.lang.object는 기본형데이터 타입 0 참조형데이터 타입 null 로 초기화됨
public class Ex01Gradebook01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("하수진");
        s.setKorean(80);
        s.setEnglish(80);
        s.setMath(81);

        s.print();

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("하수진2");
        s2.setKorean(90);
        s2.setEnglish(90);
        s2.setMath(91);

        s2.print();

        String a = "Abc";
        String b = new String("Abc");

        System.out.println(a == b);
        // 답은 false
        // 참조형 데이터 타입이기 때문에 스택에 저장된 값만(주소값) 비교되기 떄문에 값이 같은지는 확인하지 않음

        // 객체들간의 값 비교는 해당객체의 equals()라는 메소드를 활용해서 비교
        System.out.println(a.equals(b));

        Student s3 = new Student();
        s3.setId(2);
        s3.setName("하수진2");
        s3.setKorean(90);
        s3.setEnglish(90);
        s3.setMath(91);

        System.out.println(s2.equals(s3));

        // Student 클래스에 equals()메소드를 Override 하기 전
        // 주소값 비교만 하도록 코드를 작성해 놨기때문에 s2와 s3의 주소값이 달라서 false 가 답으로 나온다.
        // s2가 this 이다.
        // equals()를 실행시키는 객체자신을 지칭하는 것
        // Override : 부모클래스의 메소드가 자식클래스에서 사용하기 어려울 경우
        // 자식클래스에서 해당 메소드를 재정의 하는것
        // Override 시 주의 할점 : 부모클래스에 쓰인 메소드의 정의가 완벽하게 동일해야한다.
        // 파라미터도 동일하게 작성해야한다. Object

    }
}
