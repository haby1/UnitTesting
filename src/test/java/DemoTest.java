import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testIsTriangle() {
        String input = "3\n4\n5\n";

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, baos.toString());
    }
    @Test
    public void testNotTriangle() {
        String input = "1\n2\n3\n";

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, baos.toString());
    }

    @Test
    public void testZero() {
        String input = "0\n3\n6\n";

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, baos.toString());
    }
    //Assert results instead of console output and input
    @Test
    public void test_is_triangle_1() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }
    @Test
    public void test_is_triangle_2() {
        assertTrue(Demo.isTriangle(5, 12, 13));
    }
    @Test
    public void test_is_triangle_3() {
        assertTrue(Demo.isTriangle(5, 13, 12));
    }
    @Test
    public void test_is_triangle_4() {
        assertTrue(Demo.isTriangle(12, 5, 13));
    }
    @Test
    public void test_is_triangle_5() {
        assertTrue(Demo.isTriangle(12, 13, 5));
    }
    @Test
    public void test_is_NOT_triangle_1() {
        assertFalse(Demo.isTriangle(7, 2, 11));
    }
    @Test
    public void test_is_NOT_triangle_2() {
        assertFalse(Demo.isTriangle(2, 11, 7));
    }
    @Test
    public void test_is_NOT_triangle_3() {
        assertFalse(Demo.isTriangle(3, 12, 9));
    }
    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Demo.isTriangle(0,7, 5));
    }
    @Test
    public void test_is_NOT_triangle_5() {
        assertFalse(Demo.isTriangle(-1, 8, 9));
    }
    @Test
    public void test_is_NOT_triangle_6() {
        assertFalse(Demo.isTriangle(8, 9, -1));
    }
    @Test
    public void test_is_NOT_triangle_7() {
        assertFalse(Demo.isTriangle(2, 9, 11));
    }
}
