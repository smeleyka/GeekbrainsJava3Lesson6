import com.sun.deploy.util.ArrayUtil;

import java.awt.image.AreaAveragingScaleFilter;
import java.awt.print.PrinterGraphics;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by smeleyka on 13.06.17.
 */
public class Main {
    public static void main(String[] args) {

        Integer[] integerArr = {1, 2, 3, 1, 1, 1, 1, 1};
        Integer[] integerArr2 = {1, 1, 4, 1, 1, 1, 1, 1};
        ArrayModificator a = new ArrayModificator();
        System.out.println(Arrays.toString(a.arrayMod(integerArr)));
        System.out.println(a.arrayCheck(integerArr2));

    }
}
