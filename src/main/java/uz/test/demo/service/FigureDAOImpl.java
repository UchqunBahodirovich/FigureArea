package uz.test.demo.service;

import org.springframework.stereotype.Service;
import uz.test.demo.model.*;

import java.util.List;

@Service
public class FigureDAOImpl implements FigureDAO {

    @Override
    public double getArea(int id, List<Double> params) {
        define(id, params);
        Figure f;
        return define(id, params).Area();
    }

    private Figure define(int id, List<Double> params) {
        Figure f ;
        System.out.println(id);
        switch (id){
            //Circle
            case (1):{
                f=new Circle(params.get(0));

                break;
            }
            //Rectangle
            case (2):{
                f= new Rectangle(params.get(0),params.get(1));
                break;
            }
            //Triangle
            case (3):{
                f=new Triangle(params.get(0),params.get(1),params.get(2));
                break;
            }
            //Trapeze
            default:{
                f=new Trapeze(params.get(0),params.get(1),params.get(2),params.get(3),params.get(4));
                break;
            }
        }
        return  f;
    }

    @Override
    public double getPerimeter(int id, List<Double> params) {

        return define(id, params).Perimeter();
    }
}
