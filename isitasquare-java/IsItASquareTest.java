import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsItASquareTest {

    protected IsItASquare solution;

    @Before
    public void setUp() {
        solution = new IsItASquare();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] x = new int[]{6427, 2708, 4387, 4748};
        int[] y = new int[]{6427, 2708, 4387, 4748};
        

        String expected = "It's a square";
        String actual = solution.isSquare(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{0, 1, 5, 6};
        int[] y = new int[]{1, 6, 0, 5};

        String expected = "It's a square";
        String actual = solution.isSquare(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{0, 0, 7, 7};
        int[] y = new int[]{0, 3, 0, 3};

        String expected = "Not a square";
        String actual = solution.isSquare(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{0, 5000, 5000, 10000};
        int[] y = new int[]{5000, 0, 10000, 5000};

        String expected = "It's a square";
        String actual = solution.isSquare(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] x = new int[]{1, 2, 3, 4};
        int[] y = new int[]{4, 3, 2, 1};

        String expected = "Not a square";
        String actual = solution.isSquare(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] x = new int[]{0, 5, 3, 8};
        int[] y = new int[]{0, 0, 4, 4};

        String expected = "Not a square";
        String actual = solution.isSquare(x, y);

        Assert.assertEquals(expected, actual);
    }

}
