package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        System.out.println();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }

    /*
    새로운 차가 추가될 때마다 매번 코드를 변경해야 하는 불편함이 있음. (Drive 코드)
    역할과 구현은 분리하지 않았기 때문.
     */
}
