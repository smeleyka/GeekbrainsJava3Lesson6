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
public class ArrayModTests {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1,1,1,1,1,1,4,4,1,1},true},
                {new Integer[]{4,4,1,1,1,1,1,1,4,1},true},
                {new Integer[]{1,1,1,1,1,1,1,1,1,1},false},
                {new Integer[]{4,4,4,4,4,4,4,4,4,4},false},
                {new Integer[]{1,1,1,4,2,4,1,4,1,4},false}

        });
    }
    private Integer[]a;
    private boolean b;

    public ArrayModTests(Integer[] a, boolean b) {
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
        Assert.assertEquals(b,arrayModificator.arrayCheck(a));
    }
}