import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BrainstuckTest {

    protected Brainstuck solution;

    @Before
    public void setUp() {
        solution = new Brainstuck();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 2;
        int M = 1000000000;

        int expected = 5;
        int actual = solution.countPrograms(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 3;
        int M = 1000000000;

        int expected = 12;
        int actual = solution.countPrograms(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 5;
        int M = 1000000000;

        int expected = 92;
        int actual = solution.countPrograms(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 16;
        int M = 1000000000;

        int expected = 55450070;
        int actual = solution.countPrograms(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 13;
        int M = 163;

        int expected = 64;
        int actual = solution.countPrograms(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int N = 100;
        int M = 1000000000;

        int expected = 875563034;
        int actual = solution.countPrograms(N, M);

        Assert.assertEquals(expected, actual);
    }

}
