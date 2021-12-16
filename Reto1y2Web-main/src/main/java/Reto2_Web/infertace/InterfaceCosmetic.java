package Reto2_Web.infertace;

import Reto2_Web.model.Cosmetic;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author JhonA
 */
public interface InterfaceCosmetic extends MongoRepository<Cosmetic, String> {
    
}
