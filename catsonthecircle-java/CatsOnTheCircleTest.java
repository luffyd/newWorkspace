import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatsOnTheCircleTest {

    protected CatsOnTheCircle solution;

    @Before
    public void setUp() {
        solution = new CatsOnTheCircle();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 3;
        int K = 1;
        int p = 300000000;

        double expected = 0.6999999999999985;
        double actual = solution.getProb(N, K, p);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 6;
        int K = 2;
        int p = 500000000;

        double expected = 0.2;
        double actual = solution.getProb(N, K, p);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 6;
        int K = 5;
        int p = 500000000;

        double expected = 0.2;
        double actual = solution.getProb(N, K, p);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 10;
        int K = 2;
        int p = 666666666;

        double expected = 0.00391389439551009;
        double actual = solution.getProb(N, K, p);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 999999999;
        int K = 999999996;
        int p = 777777777;

        double expected = 0.05830903870125612;
        double actual = solution.getProb(N, K, p);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int N = 1000000000;
        int K = 4;
        int p = 300000000;

        double expected = 0.044981259448371;
        double actual = solution.getProb(N, K, p);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int N = 534428790;
        int K = 459947197;
        int p = 500000000;

        double expected = 1.871156682766205E-9;
        double actual = solution.getProb(N, K, p);

        assertEquals(expected, actual);
    }

}
