
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

}

