
enum Major {ART, MATHEMATICS, BUSINESS, ENGINEERING, EDUCATION, IT}

public class Student {
    private String FirstName, LastName;

    public String getFirstName() { //A Getter(accessor)
        return FirstName;
    }
    public void setFirstName(String newName) { //A Setter(mutator)
        FirstName = newName.toLowerCase();
    }

    public String getLastName() {
        return LastName;
    }
    public void setLastName(String newName) {
        LastName = newName.toUpperCase();
    }

    float GPA;
    Major Major; 
    //The first Major refers to the type (enum)
    //the second Major refers to the property name 

    public void PrintNames() { //print names is considered an instance method
        // System.out.println(getFirstName() + " " + getLastName()); //because we are within the class we no longer need the getter and setter
        System.out.println(FirstName + " " + LastName);
    }
    public String toString() { // the () is empty because we aren't entering parameters
        return "First Name: " + FirstName + " Last Name: " + LastName;
    }

    public void changeLastNameandMajor(String LastName, Major Major){
        this.LastName = LastName; //this instance last name should equal the incoming...
        this.Major = Major;
    }

    public void changeNameandMajor(String FirstName, String LastName, Major Major){ //method overloading...
        this.FirstName = FirstName;
        this.LastName = LastName; //this instance last name should equal the incoming...
        this.Major = Major;
    }
    
}

