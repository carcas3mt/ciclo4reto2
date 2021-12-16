package Reto2_Web.controller;

import Reto2_Web.model.Cosmetic;
import Reto2_Web.service.CosmeticService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JhonA
 */
@RestController
@RequestMapping("/api/cosmetics")
@CrossOrigin("*")
public class CosmeticController {
    @Autowired
    private CosmeticService cosmeticService;
    
    @GetMapping("/all")
    public List<Cosmetic> getAll(){
        return cosmeticService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional <Cosmetic> getClothe(@PathVariable("reference") String reference){
        return cosmeticService.getClothe(reference);
    }
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Cosmetic save (@RequestBody Cosmetic gadget){
        return cosmeticService.save(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cosmetic update(@RequestBody Cosmetic gadget){
        return cosmeticService.update(gadget);
    }
    
    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference){
        return cosmeticService.delete(reference);
    }
}
