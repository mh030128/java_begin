package poly.car01;

public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        // 차량 선택 (K3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        System.out.println();

        // 차량 변경 (model3 → newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
