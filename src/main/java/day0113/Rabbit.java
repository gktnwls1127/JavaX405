package day0113;

public class Rabbit implements IAnimal {
    // 인터페이스에서는 반드시 상속받는 인터페이스에 있는 메소드를 자식클래스에서 정의해주어야함

    @Override
    public void makeSound() {
        System.out.println("토끼 토끼");
    }

    @Override
    public void move() {
        System.out.println("깡총 깡총");
    }

    @Override
    public void eat() {
        System.out.println("풀을 뜯어먹습니다.");
    }

    // 상속 받는 클래스가 고유 메소드를 갖는 것을 선호하진 않음
    public void swim(){
        System.out.println("용궁에 갑니다.");
    }
}
