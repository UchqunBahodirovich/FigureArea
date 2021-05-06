package uz.test.demo.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.test.demo.model.DAO;
import uz.test.demo.service.FigureDAO;


import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
public class FigureController {
    FigureDAO dao;

    @PostMapping(value = "/figureArea")
    public String getArea(@Valid @RequestBody DAO params){
            return "Ploshad = "+dao.getArea(params.getFigureId(),params.getParams());
    }
    @PostMapping(value = "/figurePerimeter")
    public String getPerimeter(@Valid @RequestBody DAO params){
        return "Perimetr = "+dao.getPerimeter(params.getFigureId(),params.getParams());
    }

}
