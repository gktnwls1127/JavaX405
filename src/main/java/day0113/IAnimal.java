package day0113;

public interface IAnimal {
    // 필드, 생성자 선언 불가능 : 실제로 생성이 될 수 있는 것은 만들지 못함
    public void makeSound();
        // 메소드는 생성 가능 : 메소드를 정의하는 공간을 만들면 에러
    public void move();
    public void eat();

    // 부모클래스에서 메소드를 정의하는 것이 아니라 자식 클래스에서 메소드를 Override 해야함



}
