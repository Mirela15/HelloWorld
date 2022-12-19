package Lab9_Ex;

public class Triangle implements FiguresGeometriques{
    int l=2,height=2,base=5;

    @Override
    public double CalculateSurface() {
        int a=(base*height)/2;
        return a;
    }

    @Override
    public double CalculatePerimeter() {
        int p=l+l+l;
        return p;
    }
}
