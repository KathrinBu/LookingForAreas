import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void findCircleArea() {
        double radius = 5.0;
        double expected = 78.53981633974483;
        assertEquals(expected,Main.findCircleArea(radius));
    }

    @org.junit.jupiter.api.Test
    void findTriangleArea() {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double expected = 6.0;
        assertEquals(expected, Main.findTriangleArea(a,b,c));
    }

    @org.junit.jupiter.api.Test
    void isTriangle() {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        assertTrue(Main.isTriangle(a,b,c));
    }

    @org.junit.jupiter.api.Test
    void isRightTriangle() {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        assertTrue(Main.isRightTriangle(a,b,c));
    }
}