package Statement;

public class elsestatement2and3 {
    public static void main(String[] args) {
        int age=16;

        if(age>17) {
            System.out.println("Age is more than 17 so allowed to drive with valid driving licence");
            // Positive
        }
        else if(age==17) {
            System.out.println("Age is exact 17 so allowed to drive with valid driving licence");
            // Positive
        }
        else {
            System.out.println("Age is less than 17 so not allowed to drive");

            // Negative
        }



    }
}
