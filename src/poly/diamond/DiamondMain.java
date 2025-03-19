package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {

        /*
        인터페이스는 자기자신을 생성하지 못함
        InterfaceA a = new InterfaceA();
        InterfaceB b = new InterfaceB();
         */

        // 부모는 자식을 품을 수 있음.
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        System.out.println();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
