package poly.ex3;

/*
직접 인스턴스 생성 불가능. abstract가 붙은 추상 클래스이기 때문.
 */
public abstract class AbstractAnimal {

    /*
    abstract가 붙은 추상 메서드이므로 이 메서드는 반드시 자식이 오버라이딩 해야 함.
     */
    public abstract void sound();

    /*
    추상 메서드가 아니므로, 자식 클래스가 오버라이딩 하지 않아도 됨.
     */
    public void move() {
        System.out.println("동물이 움직입니다.");
    }


    /*
    추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언.
        그렇지 않으면 컴파일 오류.
        추상 메서드는 메서드 바디가 없음. 따라서 작동하지 않는 메서드를 가진 불완전한 클래스로 볼 수 있음.
        따라서 직접 생성하지 못하도록 추상클래스로 선언.

    추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩해서 사용해야 함.
        그렇지 않으면 컴파일 오류.
        추상 메서드는 자식 클래스가 반드시 오버라이딩 해야 하기 때문에 메서드 바디 부분이 없음.
        바디부분 생성시 컴파일 오류 발생.
        오버라이딩 하지 않으면 자식도 추상 클래스가 되어야 함.

    추상 메서드는 기존 메서드와 완전히 같음.
    다만 메서드 바디가 없고, 자식 클래스가 해당 메서드를 만드시 오버라이딩 해야 하는 제약이 추가된 것.
     */
}
