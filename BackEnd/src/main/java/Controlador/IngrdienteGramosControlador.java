package Controlador;

import Repository.IngredienteGramosRepository;
import com.example.crudrapido.model.Ingrediente;
import com.example.crudrapido.model.IngredienteGramos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins = "http://localhost:4200")
public class IngrdienteGramosControlador {
    @Autowired
    private IngredienteGramosRepository repositorioIngredientesGramos;
    @GetMapping("/ingredientesGramos")
    public List<IngredienteGramos> ListarIngredientes(){
        return repositorioIngredientesGramos.findAll();
    }
    @GetMapping("/crearGramos")
    public void guardarIngrediente(){
        IngredienteGramos ingredienteGramos = new IngredienteGramos("queso",10);
            repositorioIngredientesGramos.save(ingredienteGramos);
    }
}
