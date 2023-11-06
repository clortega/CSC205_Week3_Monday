/**
 * Main
 */

// enum Seasons {SPRING, SUMMER, FALL, WINTER}
// enum Cart {SHOPPING, TAG, RETURN, SAVEDFORLATER}

public class Main {

    public static void main(String[] args) {
        SeasonsLogic();

        Student student1 = new Student();
        student1.FirstName = "Eric";
        student1.LastName = "Student";
        student1.GPA = 3.0f;
        student1.Major = Major.ART;
        System.out.println(student1.FirstName);

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