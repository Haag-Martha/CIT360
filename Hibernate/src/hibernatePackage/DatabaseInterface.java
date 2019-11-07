package hibernatePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
/**
*
* @author martha
*/
//Create the interface for the database
public class DatabaseInterface {

/*Create the session factory and the session used to communicate with
    * the database*/
    SessionFactory factory= null;
    Session session = null;

    private static DatabaseInterface one_instance=null;

    private DatabaseInterface(){
        factory = Utilities.getSessionFactory();

    }

    //re-use the DatabaseInterface
    public static DatabaseInterface getInstance(){
        if (one_instance == null){
            one_instance = new DatabaseInterface();

        }
        return one_instance;

    }
    // get the list of members in the family
    public List<Family> getFamily(){
        try{
            //open database session
            session=factory.openSession();
            //begin
            session.getTransaction().begin();
            // SQL direct path to the Family class
            String MySQL ="from hibernatePackage.Family";
            //return results in a list
            List<Family> famSess= (List<Family>)session.createQuery(MySQL).getResultList();

            session.getTransaction().commit();
            //return the list from the query
            return famSess;

            //catch exceptions that might pop up 
        }catch(Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }finally{
            //close out the session
            session.close();
        }

    }
}
