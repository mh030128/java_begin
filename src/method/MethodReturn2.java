package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(16);
        checkAge(20);
    }
    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // 반환타입이 void이므로 반환값없이 return만 작성.
        }

        System.out.println(age + "살, 입장하세요.");

        // 반환타입이 void이므로 return 생략 가능한 것임.
    }
}
