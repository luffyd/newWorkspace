import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaintTheRoomTest {

    protected PaintTheRoom solution;

    @Before
    public void setUp() {
        solution = new PaintTheRoom();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int R = 1;
        int C = 1;
        int K = 1;

        String expected = "Paint";
        String actual = solution.canPaintEvenly(R, C, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int R = 1;
        int C = 1;
        int K = 2;

        String expected = "Cannot paint";
        String actual = solution.canPaintEvenly(R, C, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int R = 1;
        int C = 2;
        int K = 2;

        String expected = "Paint";
        String actual = solution.canPaintEvenly(R, C, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int R = 2;
        int C = 2;
        int K = 3;

        String expected = "Paint";
        String actual = solution.canPaintEvenly(R, C, K);

        Assert.assertEquals(expected, actual);
    }

}
