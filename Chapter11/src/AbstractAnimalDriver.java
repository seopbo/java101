import java.util.ArrayList;

public class AbstractAnimalDriver {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();

        // 익명클래스 (특정 클래스를 위해서 XX.java script)를 만들기 싫고, 대충 한번 만들고 끝낼 때 사용
        AbstractAnimal horse = new AbstractAnimal("말") {
            @Override
            public void cry() {
                System.out.println("히이잉");
            }
        };

        animals.add(new Cat("맥스"));
        animals.add(new Dog("심바"));
        animals.add(new Pig("품바"));
        animals.add(horse);

        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "의 울음 소리: ");
            animal.cry();
        }
    }
}