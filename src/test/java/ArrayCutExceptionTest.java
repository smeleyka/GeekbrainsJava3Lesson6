import org.junit.Test;

/**
 * Created by smeleyka on 16.06.17.
 */
public class ArrayCutExceptionTest {
    ArrayModificator arrayModificator;

    @Test(expected = RuntimeException.class)
    public void exceptionTest(){
        Integer[] test = {1,2,3,0,5,6,7,8,9,0};
        arrayModificator = new ArrayModificator();
        arrayModificator.arrayCut(test);
    }
}
