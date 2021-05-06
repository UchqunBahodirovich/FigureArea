package uz.test.demo.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Trapeze extends Figure{
    double a;
    double b;
    double c;
    double d;
    double h;

    public double Area(){
        return (a+b)*h/2;
    }
    public double Perimeter(){
        return a+b+c+d;
    }
}
