package Lab9_Ex;

public class Circle implements FiguresGeometriques {
    private int raza=5;
    private double pi=3.14;
    @Override
    public double CalculateSurface() {
       double a=(raza*raza)*pi;
        return a;
    }

    @Override
    public double CalculatePerimeter() {
        double p= (raza*pi)*2;
        return p;
    }
}
