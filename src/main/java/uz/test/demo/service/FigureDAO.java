package uz.test.demo.service;

import java.util.List;

public interface FigureDAO {
    double getArea(int id, List<Double> params);
    double getPerimeter(int id, List<Double> params);
}
