package Reto2_Web.repository;

import Reto2_Web.infertace.InterfaceCosmetic;
import Reto2_Web.model.Cosmetic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JhonA
 */
@Repository
public class CosmeticRepository {
    @Autowired
    private InterfaceCosmetic repository;
    
    public List<Cosmetic> getAll(){
        return repository.findAll();
    }
    
    public Optional<Cosmetic> getClothe(String reference){
        return repository.findById(reference);
    }
    
    public Cosmetic save(Cosmetic clothe){
        return repository.save(clothe);
    }
    
    public void update(Cosmetic clothe){
        repository.save(clothe);
    }
    
    public void delete(Cosmetic clothe){
        repository.delete(clothe);
    }
}
