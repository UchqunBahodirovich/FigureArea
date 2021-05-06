package uz.test.demo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Circle extends Figure{
    Double a;
    public  Circle (Double A)
    {
        a=A;
    }

    public double Area (){
        return Math.PI*a*a;
    }
    public double Perimeter(){
        return 2*Math.PI*a;
    }
}
