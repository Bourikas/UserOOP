import model.User;
import model.UserCredentials;

public class Main {

    /**
     * Creates an instance of User and UserCredentials using overloaded constructors
     * prints all the fields of both instances.
     * @param args no arguments
     */
    public static void main(String[] args) {
        User user = new User(1,"Giorgos","Bourikas");
        UserCredentials userCredentials = new UserCredentials(1,"GeoBour", "Superstr0ngp@$$word");

        System.out.println(user);
        System.out.println(userCredentials);
    }
}
