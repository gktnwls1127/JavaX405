package day0110;
// 배열 참조형 데이터 타입
// 배열이란, 똑같은 데이터 타입의 공간 여러개를 하나로 묶어서
// 저장할 수 있는 데이터타입이다.
// 배열 공간을 만들기 위해서 :
// 우리가 해당 공간이 어떤 데이터 타입이 모여있는지를 적고
// []를 통해서 배열이다라는 것을 등록하게 된다.
// 단, 배열을 소개할 때에는 반드시
// 해당 배열이 몇개의 공간으로 이루어져있는지를 반드시 지정해야한다.
public class Ex06Array {
    public static void main(String[] args) {
        //기본형 데이터타입의 배열은 각 칸이 0으로 초기화가 된다.
        int[] inArray = new int[3];
        // 배열의 각 칸의 번호는 우리가 '인덱스'라고 지칭하며
        // 0부터 배열의 길이 -1까지이다.
        for(int i = 0; i < inArray.length; i++){
            System.out.printf("inArray[%d] : %d\n", i , inArray[i]);
        }

        //참조형 데이터타입의 배열은 각 항이 null로 초기화가 된다.
        String[] stringArray = new String[4];
        for(int i = 0; i < stringArray.length; i++){
            System.out.printf("stringArray[%d] : %s\n", i , stringArray[i]);
        }
    }
}
