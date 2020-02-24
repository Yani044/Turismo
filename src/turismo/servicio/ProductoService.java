
package turismo.servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import turismo.entidades.Producto;

class ProductoService {
    public List<Producto> obtenerProductos() {
        EntityManager em = Persistence.createEntityManagerFactory("TurismoORIGINALPU").createEntityManager();
        
       List<Producto> productos= em.createQuery( "SELECT  s  FROM Producto s ").getResultList();
      
        return productos ;
        
    }
}
