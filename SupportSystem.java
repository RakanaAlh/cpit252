
import java.sql.Connection;

public class SupportSystem {

    public static void main(String[] args) throws ClassNotFoundException {

        Connection conn = DBconnection.getInstance();
        System.out.println("Hi");
    }

}
