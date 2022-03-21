package Java_assignment.unit_4.week_3.evalution.question_2.q1;

public class Unchecked {

    void show() {
        try {
            throw new Error();
        } catch (Error e) {
            System.out.println("showing all data");
        }
    }

    void display() {
        throw new Error();
    }

    public static void main(String[] args) {
        Unchecked ob = new Unchecked();
        ob.show();

        try {
            ob.display();
        } catch (Throwable e) {
            System.out.println("Showing only essential data");
        }
    }
}
