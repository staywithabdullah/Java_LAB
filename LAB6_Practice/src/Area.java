public class Area extends Shape{

    @Override
    public double RectangleArea(double len, double width) {
        return len*width;
    }

    @Override
    public double SquareArea(double side) {
        return side*side;
    }

    @Override
    public double CircleArea(double red) {
        return Pi*red*red;
    }
}