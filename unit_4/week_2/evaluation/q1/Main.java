package Java_assignment.unit_4.week_2.evaluation.q1;

public class Main {
    public static void main(String[] args) {

        ClassTwo classTwo = new ClassTwo();

        InterfaceThree interfaceThree= classTwo;

        System.out.println(interfaceThree);

        interfaceThree.methodOne();
        interfaceThree.methodTwo();
        interfaceThree.methodThree();

        System.out.println("================================");


        InterfaceOne interfaceOne = classTwo;

        interfaceOne.methodOne();

        classTwo = new ClassTwo() {
            @Override
            public void methodOne() {

            }
        };

        classTwo.methodTwo();
        classTwo.methodThree();
    }
}
