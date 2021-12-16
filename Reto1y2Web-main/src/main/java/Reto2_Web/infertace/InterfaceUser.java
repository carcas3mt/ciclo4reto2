package Reto2_Web.infertace;

import Reto2_Web.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author JhonA
 */
public interface InterfaceUser extends MongoRepository<User, Integer>{
    Optional<User> findByEmail (String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
