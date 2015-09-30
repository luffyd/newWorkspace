import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnArrayTest {

    protected AnArray solution;

    @Before
    public void setUp() {
        solution = new AnArray();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] A = new int[]{31, 1, 3, 7, 2, 5};
        int K = 30;

        int expected = 1;
        int actual = solution.solveProblem(A, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] A = new int[]{4, 5, 2, 25};
        int K = 100;

        int expected = 2;
        int actual = solution.solveProblem(A, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] A = new int[]{100000000, 100000000, 100000000};
        int K = 1000000;

        int expected = 1;
        int actual = solution.solveProblem(A, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] A = new int[]{269, 154, 94, 221, 171, 154, 50, 210, 258, 358, 121, 159, 8, 47, 290, 125, 291, 293, 338, 248, 295, 160, 268, 227, 99, 4, 273};
        int K = 360;

        int expected = 114;
        int actual = solution.solveProblem(A, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] A = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int K = 1;

        int expected = 220;
        int actual = solution.solveProblem(A, K);

        Assert.assertEquals(expected, actual);
    }

}
