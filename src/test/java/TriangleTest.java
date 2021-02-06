import com.github.junittest.triangle.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.github.junittest.triangle.Triangle.getType;

public class TriangleTest {

    @Test
    public void analyzeGetType_throwsIllegalArgumentsException() {
        //given
        int a = 0;
        int b = 0;
        int c = -1;
        new Triangle(a, b, c);
        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> getType(a, b, c));
    }

    @Test
    public void testGetType_equilateral() {
        //given
        new Triangle(1, 1, 2);
        int a = 1;
        int b = 1;
        int c = 1;

        //when
        String result = getType(a, b, c);

        //then
        Assertions.assertEquals("equilateral", result);
    }

    @Test
    public void testGetType_scalene() {
        //given
        new Triangle(1, 1, 2);
        int a = 1;
        int b = 2;
        int c = 3;

        //when
        String result = getType(a, b, c);

        //then
        Assertions.assertEquals("scalene", result);
    }
}
