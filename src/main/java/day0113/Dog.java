package day0113;

public class Dog extends Animal {
    public Dog(){
        System.out.println("Dog() 호출");
    }

    public void makeSound(){
        System.out.println("멍멍");
    }

    public void eat(){ // Override : 자식클래스가 부모클래스의 메소드를 재정의
        System.out.println("강아지는 잡식동물입니다.");
    }

}
