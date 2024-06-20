package SIMPLEPROGRAMS.AreaAndPerimeterOfASquareAndRectangle;

public class AreaAndPerimeterOfASquareAndRectangle{

    Number area = 0;
    Number perimeter = 0;

    public AreaAndPerimeterOfASquareAndRectangle(int squareDetail) {
        this.area = squareDetail * squareDetail;
        this.perimeter = 4 * squareDetail;
    }

    public AreaAndPerimeterOfASquareAndRectangle(int rectangleLength,int rectangleWidth){
        this.area = rectangleLength * rectangleWidth;
        this.perimeter = 2 * ( rectangleLength + rectangleWidth);
    }

    public Number getArea() {
        return area;
    }

    public void setArea(Number area) {
        this.area = area;
    }

    public Number getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Number perimeter) {
        this.perimeter = perimeter;
    }
}