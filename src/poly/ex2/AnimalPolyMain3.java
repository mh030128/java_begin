package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};     // ctrl + alt + N
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) {    // ctrl + alt + M
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }

    /*
    새로운 기능이 추가되었을 때 변하는 부분울 최소화하는 것이 잘 작성된 코드.
    이렇게 하기 위해서는 코드에서 변하는 부분과 변하지 않는 부분을 명확하기 헤는 것이 좋음.
     */
}
