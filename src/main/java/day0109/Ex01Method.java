package day0109;

public class Ex01Method {
    public static void main(String[] args) {
        printIntro();
        printIntro();
        printIntro();
        printIntro();

        int a = 3;
        int b = 4;
        printBigger(a, b);
        a = 4;
        b = 3;
        printBigger(a, b);
        printBigger(4, 4);

        a = 5;
        b = 3;
        int result = calculatePower(a, b);
        System.out.println("a의 b승 : " + result);

        a = 4;
        b = 4;
        result = calculatePower(a, b);
        System.out.println("a의 b승 : " + result);

        System.out.println("a의 b승 : " + calculatePower(1, 7));

    }

    public static void printIntro(){
        // static 객체를 사용하지 않더라도 사용 가능, 외부에서 끌어오는 메소드롤 사용되서 권장되지 않음
        System.out.println("Ex01Method");
        System.out.println("작성자 : 하수진");
        System.out.println("작성일 : 2023년 01월 09일");
        System.out.println("내용 : 메소드에 대한 설명 및 예제");
    }

    public static void printBigger(int num1, int num2){
        if (num1 > num2){
            System.out.println("a가 b보다 더 큽니다.");
        }
        else {
            System.out.println("b가 a보다 더 크거나 같습니다.");
        }
    }

    public static int calculatePower(int a, int b){
        int result = 1;
        for(int i=1; i<=b; i++){
            result *= a;
        }

        return result;
    }

}
