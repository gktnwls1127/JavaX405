package day0116;

public class Test {
    public static void main(String[] args) {

        // 두자리 카프리카수 구하기
        for (int i = 10; i<=99; i++){
            int num1 = i / 10;
            int num2 = i % 10;
            int sum = num1+ num2;
            if ((sum*sum) == i) {
                System.out.println(i);
            }
        }

        // 네자리 카프리카수 구하기
        for (int i = 1000; i<=9999; i++){
            int num1 = i / 100;
            int num2 = i % 100;
            int sum = num1 + num2;
            if ((sum*sum) == i) {
                System.out.println(i);
            }
        }

        // 1~1000까지 소수값 구하기
        for (int i = 1; i<=1000; i++){
            int count = 0;
            for (int j = 1; j<= i; j++){
                if ((i % j) == 0){
                    count++;

                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }

    }
}
