/**
 * Created by admin on 13.06.2017.
 */
import org.junit.*;

import java.util.ArrayList;

public class ArrayModTest {
    ArrayModificator arrayModificator;
    ArrayList<Integer[]> testArr = new ArrayList<Integer[]>();
    @Before
    public void setTestArr(){

    }
    @Test (expected = RuntimeException.class)
    public void test2 (){
        Integer[] test = {1,2,3,0,5,6,7,8,9,0};
        arrayModificator.arrayMod(test);
    }

    @Test
    public void test1(){
        Integer[] test = {1,2,3,4,5,6,7,8,9,0};
        arrayModificator = new ArrayModificator();
        Assert.assertArrayEquals(new Integer[]{5,6,7,8,9,0},arrayModificator.arrayMod(test));
    }


}
