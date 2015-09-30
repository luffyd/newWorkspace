import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VerySecureEncryptionTest {

    protected VerySecureEncryption solution;

    @Before
    public void setUp() {
        solution = new VerySecureEncryption();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String message = "abc";
        int[] key = new int[]{1, 2, 0};
        int K = 1;

        String expected = "cab";
        String actual = solution.encrypt(message, key, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String message = "abcde";
        int[] key = new int[]{4, 3, 2, 1, 0};
        int K = 1;

        String expected = "edcba";
        String actual = solution.encrypt(message, key, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String message = "abcde";
        int[] key = new int[]{4, 3, 2, 1, 0};
        int K = 2;

        String expected = "abcde";
        String actual = solution.encrypt(message, key, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String message = "uogcodlk";
        int[] key = new int[]{4, 3, 6, 2, 5, 1, 0, 7};
        int K = 44;

        String expected = "goodluck";
        String actual = solution.encrypt(message, key, K);

        Assert.assertEquals(expected, actual);
    }

}
