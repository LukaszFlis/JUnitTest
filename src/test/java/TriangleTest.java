import com.github.junittest.triangle.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void analyzeGetType_throwsIllegalArgumentsException() {
        //given
        Integer a = 0;
        Integer b = 0;
        Integer c = -1;
        Triangle triangle = new Triangle(a, b, c);
        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Triangle.getType(a, b, c));
    }

    @Test
    public void testGetType_equilateral() {
        //given
        Triangle triangle = new Triangle(1, 1, 2);
        Integer a = 1;
        Integer b = 1;
        Integer c = 1;

        //when
        String result = triangle.getType(a, b, c);

        //then
        Assertions.assertEquals("equilateral", result);
    }

    @Test
    public void testGetType_scalene() {
        //given
        Triangle triangle = new Triangle(1, 1, 2);
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;

        //when
        String result = triangle.getType(a, b, c);

        //then
        Assertions.assertEquals("scalene", result);
    }
}
