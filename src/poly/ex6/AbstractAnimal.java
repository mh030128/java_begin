package poly.ex6;

// 추상클래스
public abstract class AbstractAnimal {

    public abstract void sound();  // 추상
    public void move() {    // 상속목적
        System.out.println("동물이 이동합니다.");
    }
}
