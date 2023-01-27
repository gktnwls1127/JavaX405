package day0113;
// 상속(Inheritance)
// 상속 목적 : 코드의 재사용성과 다형성을 위해서
// 상속의 종류 :
// 1. 클래스 상속
//     코드의 재사용성이 주목적
//     부모클래스의 메소드를 자식 클래스가 그대로 사용할 수 있다.
//     extends 라는 키워드를 통해서 이루어진다.
// 2. 인터페이스 상속
//     다형성이 주목적
//     부모 인터페이스의 메소드를 자식 클래스가 반드시 재정의(=오버라이드) 해야 한다.
//     implements 라는 키워드를 통해서 이루어진다.

public class Ex01Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        animal.eat();
        // animal.makeSound()는 불가능 : 자식클래스의 메소드 사용 불가

        Dog dog = new Dog(); // Animal 생성자가 한번 더 출력됨 : 부모 클래스에 자식클래스의 내용을 추가함
        dog.move();
        dog.eat();
        dog.makeSound();

        Animal a = new Dog(); // 부모클래스 객체는 자식클래스의 생성자로 초기화 가능
        a.move();
        a.eat();
        // a.makeSound() 사용 불가 : 부모클래스 객체는 자식 클래스의 독자적 메소드 사용 불가능

        // 다형성 부여
        showSample(animal);
        showSample(dog); // 부모클래스를 파라미터로 작성할 경우 자식클래스도 파라미터로 넣을 수 있다
        showSample(a);

        // IAnimal iAnimal = new IAnimal(); 에러 : 인터페이스는 객체를 실체화 할 수 없음 => 자식클래스로 상속받아 사용
        IAnimal iAnimal = new Rabbit();
        showSample(iAnimal);

        IAnimal cat = new Cat();
        showSample(cat);


    }

    // 클래스 상속의 다형성에서의 사용
    public static void showSample(Animal animal){
        System.out.println("showSample()");
        animal.eat();
    }

    // 인터페이스에서 다형성 사용
    public static void showSample(IAnimal iAnimal){
        iAnimal.makeSound();
        iAnimal.move();
        iAnimal.eat();
    }

}
