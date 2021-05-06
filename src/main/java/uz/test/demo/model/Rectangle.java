package uz.test.demo.model;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Rectangle extends Figure {
    double a;
    double b;
      public double Area (){
        return a*b;
    }
    public double Perimeter(){
        return 2*(a+b);
    }
}
