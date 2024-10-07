import org.junit.jupiter.api.Test;
import org.example.*;

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
    public void orderPrinter3(){
        Shape circle = new Circle(0,0,10);
        assertEquals(0.0, circle.getX());
    }


}
