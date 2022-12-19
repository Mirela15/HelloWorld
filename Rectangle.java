package Lab9_Ex;

public class Rectangle implements FiguresGeometriques{
    int l=8,L=6;
    @Override
    public double CalculateSurface() {
        int a=L*l;
        return a;
    }

    @Override
    public double CalculatePerimeter() {
        int p=(l+L)*2;
        return p;
    }
}
