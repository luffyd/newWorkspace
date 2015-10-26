import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WalkingToSchoolTest {

    protected WalkingToSchool solution;

    @Before
    public void setUp() {
        solution = new WalkingToSchool();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 2;
        int[] from = new int[]{0, 1};
        int[] to = new int[]{1, 0};

        String expected = "Chores";
        String actual = solution.canWalkExactly(N, from, to);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 3;
        int[] from = new int[]{0, 1, 1, 2};
        int[] to = new int[]{1, 0, 2, 0};

        String expected = "Freedom";
        String actual = solution.canWalkExactly(N, from, to);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 4;
        int[] from = new int[]{0, 2, 2, 3, 0};
        int[] to = new int[]{2, 0, 3, 0, 1};

        String expected = "Chores";
        String actual = solution.canWalkExactly(N, from, to);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 10;
        int[] from = new int[]{0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 9, 9};
        int[] to = new int[]{4, 5, 6, 7, 9, 4, 6, 0, 1, 3, 8, 4, 6, 1, 4, 8, 1, 7, 8, 1, 4, 2, 5, 6, 8};

        String expected = "Chores";
        String actual = solution.canWalkExactly(N, from, to);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 8;
        int[] from = new int[]{0, 1, 4, 6, 7, 5, 2, 3, 0};
        int[] to = new int[]{1, 4, 6, 7, 5, 2, 3, 0, 7};

        String expected = "Freedom";
        String actual = solution.canWalkExactly(N, from, to);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int N = 2000;
        int[] from = new int[]{};
        int[] to = new int[]{};

        String expected = "Chores";
        String actual = solution.canWalkExactly(N, from, to);

        Assert.assertEquals(expected, actual);
    }

}
