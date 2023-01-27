package day0113;

import model.UserDTO;

public class Ex05ToString {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(number); // 4

        String str = "abcd";
        System.out.println(str); // abcd

        UserDTO u = new UserDTO();
        u.setId(1);
        u.setUsername("a");
        u.setPassword("a");
        u.setNickname("사용자1");

        System.out.println(u); // UserDTO 객체의 주소값
        // println() 객체의 toString 결과값을 출력하도록 되어있음 => 해당 객체에 toString 메소드를 Override 하기


    }
}
