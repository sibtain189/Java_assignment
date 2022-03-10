package Java_assignment.unit_4.week_2.day_3.question_1;

public abstract class Bird {

    public abstract void fly();

}


class Parrot extends Bird{

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    public void sing(){
        System.out.println("I am Singing");
    }
}