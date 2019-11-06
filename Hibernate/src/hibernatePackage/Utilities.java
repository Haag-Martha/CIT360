package hibernatePackage;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
/**
*
* @author martha
*/
public class Utilities {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try{

            //tell hibernate where to go to find the config file for the project
            ServiceRegistry servReg = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();

       //set up new metadata source with the specification from the ServiceRegistry
       Metadata metadata = new MetadataSources(servReg).getMetadataBuilder().build();

       return metadata.getSessionFactoryBuilder().build();

       /*If something goes wrong with the creation of the session,
       * catch and display error message.*/
        }catch(Throwable ex){
            System.err.println("Creation Failed." +ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){

        return sessionFactory;
    }

    /*close the connection pool and caches.*/
    public static void shutdown(){
        getSessionFactory().close();
    }
}
