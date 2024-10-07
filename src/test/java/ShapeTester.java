import org.junit.jupiter.api.Test;
import org.example.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTester {
    @Test
    public void testSquare() {
        Shape shape = new Circle(1, 2, 3);
        assertEquals(28.26, shape.area(), 0.01);
    }
    @Test
    public void testCircle() {
        Shape shape = new Square(1, 2, 3);
        assertEquals(9, shape.area(), 0.01);
    }
    @Test
    public void testRectangle() {
        Shape shape = new Rectangle(1, 2, 3, 4);
        assertEquals(12, shape.area(), 0.01);
    }
    @Test
    public void testShapeFactory() {
        Shape shape = ShapeFactory.createShape("circle", 1, 2, 3);
        assertEquals(28.26, shape.area(), 0.01);
    }

    @Test
    public void testShapeFactory2() {
        Shape shape = ShapeFactory.createShape("rectangle", 1, 2, 3, 4);
        assertEquals(12, shape.area(), 0.01);
    }
    @Test
    public void testShapeFactory3() {
        Shape shape = ShapeFactory.createShape("square", 1, 2, 3);
        assertEquals(9, shape.area(), 0.01);
    }
    @Test
    public void testShapeFactory4() {
        Shape shape = ShapeFactory.createShape("triangle", 1, 2, 3, 4);
        assertEquals(null, shape);
    }
    @Test
    public void orderPrinter(){
        Shape circle = new Circle(0,0,10);
        assertEquals("Circle", circle.getClass().getSimpleName());
    }

    @Test
    public void orderPrinter2(){
        Shape circle = new Circle(0,0,10);
        assertEquals(314.0, circle.area());
    }

    @Test
    public void testSortShapesByArea() {
        Shape circle = new Circle(1, 2, 3);
        Shape square = new Square(3, 4, 5);
        Shape rectangle = new Rectangle(2, 3, 6, 4);

        List<Shape> shapeList = Arrays.asList(circle, square, rectangle);
        ShapeSorter sorter = new ShapeSorter();
        List<Shape> sortedShapes = sorter.printOrderShapes(shapeList);

        assertEquals(rectangle, sortedShapes.get(0));
        assertEquals(square, sortedShapes.get(1));
        assertEquals(circle, sortedShapes.get(2));
    }



}
