package Java_assignment.unit_4.week_3.evalution.question_1.q1;

public class Checked {

    void show(){
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("showing all data");
        }
    }

    void display() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {
        Checked ob = new Checked();
        ob.show();

        try {
            ob.display();
        }catch (Exception e){
            System.out.println("Showing only essential data");
        }
    }
}
