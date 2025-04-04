package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {

        // 인터페이스 생성 불가
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("interface");
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    // 변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal) {    // ctrl + alt + M
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
