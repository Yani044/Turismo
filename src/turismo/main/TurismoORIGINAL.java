
package turismo.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class TurismoORIGINAL {

   
    public static void main(String[] args) {
       EntityManager em = Persistence.createEntityManagerFactory("TurismoORIGINALPU").createEntityManager();
    }
    
}
