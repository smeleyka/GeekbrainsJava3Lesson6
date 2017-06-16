import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by smeleyka on 16.06.17.
 */

@RunWith(Parameterized.class)
public class ArrayCutTests {
    @Parameterized.Parameters
    public static Collection<Integer[][]> data() {
        return Arrays.asList(new Integer[][][]{
                {{1,2,3,4,5,6,7,8,9,0},{5,6,7,8,9,0}},
                {{4,2,3,4,5,6,7,4,9,0},{9,0}},
                {{4,2,3,3,5,6,7,8,9,0},{2,3,3,5,6,7,8,9,0}},
                {{4,2,3,3,5,6,7,8,9,4},{}}
        });
    }
    private Integer[]a;
    private Integer[]b;

    public ArrayCutTests(Integer[] a, Integer[] b) {
        this.a = a;
        this.b = b;
    }
    ArrayModificator arrayModificator;

    @Before
    public void init() {
        arrayModificator = new ArrayModificator();
    }
    @Test
    public void massTestAdd() {
        Assert.assertArrayEquals(b,arrayModificator.arrayCut(a));
    }
}