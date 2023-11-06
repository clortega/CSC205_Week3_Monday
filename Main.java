/**
 * Main
 */

// enum Seasons {SPRING, SUMMER, FALL, WINTER}
// enum Cart {SHOPPING, TAG, RETURN, SAVEDFORLATER}

public class Main {

    public static void main(String[] args) {
        SeasonsLogic();

        Student student1 = new Student(); //student1 refers to a specific instance or version of the Student class
        student1.FirstName = "Eric";
        student1.LastName = "Student";
        student1.GPA = 3.0f;
        student1.Major = Major.ART;
        Student student2 = new Student();
        Student student3 = student1;
        student3.FirstName = "Melissa"; //because student3 points to the same location as student1, it overrides "Eric" as the first name.
        
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


        System.out.println(student1.FirstName);
        System.out.println(student2.FirstName);
        System.out.println(student3.FirstName);

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
}