/**
 * Main
 */

// enum Seasons {SPRING, SUMMER, FALL, WINTER}
// enum Cart {SHOPPING, TAG, RETURN, SAVEDFORLATER}

public class Main {
    public static void main(String[] args) {
        SeasonsLogic();
        CarLogic();
        StudentLogic();
    }

    public static void SeasonsLogic() {
        Seasons seasons = Seasons.SPRING;
        // Cart myCart = Cart.SAVEDFORLATER;

        // if(seasons == "Spring" || seasons == "spring" || seasons == "SPRING") { //WITH ENUM we don't ave to specify
        if(seasons == Seasons.SPRING) {
            System.out.println("This is my favorite season!");
        }
        else if(seasons == Seasons.WINTER) {
            System.out.println("This is my second favorit season");
        }
        else {
            System.err.println("Fall and Summer are both okay");
        }
    }

    public static void CarLogic() {
        Car car1 = new Car();
        car1.Mileage = 50000;
        car1.BodyStyle = BodyStyle.SEDAN;
        car1.CarMake = Make.FORD;
        Car car2 = new Car();
        car2.Mileage = 12000;
        car2.BodyStyle = BodyStyle.COUPE;
        car2.CarMake = Make.TOYOTA;
        Car car3 = new Car();
        car3.Mileage = 60000;
        car3.BodyStyle = BodyStyle.TRUCK;
        car3.CarMake = Make.GMC;
    }
    
    public static void StudentLogic() {
        Student student1 = new Student(); //student1 refers to a specific instance or version of the Student class
        student1.setFirstName("Eric");
        student1.setLastName("Student");
        student1.GPA = 3.0f;
        student1.Major = Major.ART;
        // student1.PrintNames();
        Student student2 = new Student();
        System.out.println(student2);
        student1.changeLastNameandMajor("Hegney", Major.IT); //refer to Student.java
        System.out.println(student1);

        // Student student3 = student1;
        // student3.FirstName = "Melissa"; //because student3 points to the same location as student1, it overrides "Eric" as the first name.
        
        // System.out.println(student1.getFirstName() + " " + student1.getLastName());
        // System.out.println(student2);
        // System.out.println(student3.FirstName);
    }
}