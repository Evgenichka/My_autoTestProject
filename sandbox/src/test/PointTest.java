package src.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import junit.framework.TestCase;

public class PointTest {

    @Test(description = "Проверка расстояния между одинаковыми точками")
    public void testDistanceSamePoints() {
        Point p1 = new Point(0, 0);
        Assert.assertEquals(p1.distanceTo(new Point(0, 0)), 0.0, "Расстояние должно быть равно нулю");
    }

    @Test(description = "Проверка горизонтального расстояния")
    public void testHorizontalDistance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0); // Расстояние вдоль оси X
        Assert.assertEquals(p1.distanceTo(p2), 3.0, "Горизонтальное расстояние неправильное");
    }

    @Test(description = "Проверка вертикального расстояния")
    public void testVerticalDistance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4); // Расстояние вдоль оси Y
        Assert.assertEquals(p1.distanceTo(p2), 4.0, "Вертикальное расстояние неправильное");
    }

    @Test(description = "Проверка диагонального расстояния")
    public void testDiagonalDistance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4); // Диагональное расстояние
        Assert.assertEquals(p1.distanceTo(p2), 5.0, "Диагональное расстояние неправильное");
    }
}

// TestNG




public class AppTest {

    @Test(description = "Проверка суммы чисел")
    public void testAddNumbers() {
        int result = App.addNumbers(3, 4);
        assertEquals(result, 7);
    }

    @Test(description = "Проверка разницы чисел")
    public void testSubtractNumbers() {
        int result = App.subtractNumbers(10, 5);
        assertEquals(result, 5);
    }
}

// Пример теста с JUnit:


public class AppTest extends TestCase {

    public void testAddNumbers() {
        int result = App.addNumbers(3, 4);
        assertEquals(result, 7);
    }

    public void testSubtractNumbers() {
        int result = App.subtractNumbers(10, 5);
        assertEquals(result, 5);
    }
}