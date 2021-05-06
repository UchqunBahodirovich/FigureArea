package uz.test.demo.model;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Triangle extends Figure{
double a;
double b;
double c;

public double Area(){
    double p=0;
    p=(a+b+c)/2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

public double Perimeter() {
        return a+b+c;
    }
}
