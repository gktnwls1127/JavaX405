package day0111;
// 생성자 : 기본적인 값으로 초기화 해주고 싶을때 사용
// 1. 클래스의 이름과 생성자의 이름이 동일해야함
// 2. return 타입이 없음
public class Student {
    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // System.out.println은 같은 이름의 메소드가 파라미터만 달리 가지고 있음
    // Overloading : 똑같은 메소드를 같은 이름으로 파라미터만 변경해서 하는 것
    public Student(){
        id = -1;
        name = "아직없음";
    }

    // 메소드에 static 이 빠짐
    public void print(){
        System.out.printf("번호 : %d번 이름 : %s\n", id, name);
        System.out.printf("국어 : %d점 영어: %d점 수학 : %d점\n", korean, english, math);
        System.out.printf("총점 : %d점 평균 : %.2f점\n", calculateSum(), calculateAverage());
        System.out.println("-----------------------------------------------");
    }

    private int calculateSum(){
        return korean + english + math;
    }

    private double calculateAverage(){
        return (double) calculateSum() / 3;
    }

    // java.lang.Object 의 equals()메소드 Override 하기
    public boolean equals(Object object){
        // 객체와 인스턴스의 차이
        // 객체 : 모든 클래스 변수
        // 인스턴스 : 생성자가 불러와서 초기화가 끝낸 객체

        // 파라미터로 들어온 객체가 초기화가 끝낸 인스턴스인지 확인하는 방법
        if(object instanceof Student){
            // 명시적 형변환을 통해 객체 생성 : 파라미터로 들어온 object 를 Student 객체로 형변환
            // 클래스는 자식클래스에 있는 필드를 불러오지 못하기 때문에 형변환이 필요
            Student s = (Student) object;
            return id == s.id;

        }
        return false;
    }
}
