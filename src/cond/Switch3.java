package cond;

public class Switch3 {
    public static void main(String[] args) {

        int grade = 2;
        int coupon;

        switch(grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 :
            case 3 :
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);

        /*
        case 2에는 break가 없기 때문에 중단하지 않고 다음에 있는 case 3의 코드를 실행.
         */
    }
}
