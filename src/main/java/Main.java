import java.awt.image.AreaAveragingScaleFilter;
import java.awt.print.PrinterGraphics;
import java.util.*;

/**
 * Created by smeleyka on 13.06.17.
 */
public class Main {
    public static void main(String[] args) {

        Integer[] integerArr = {1, 2, 4, 0, 5, 4, 7, 0};
        arrayMod(integerArr);

    }

    public static Integer[] arrayMod(Integer[] inArr) {
        Integer integer = 4;

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(inArr));
        ListIterator<Integer> arrayListIt = arrayList.listIterator();

        while (arrayListIt.hasNext() & arrayList.contains(integer)) {
            System.out.println(arrayListIt.next());
            arrayListIt.remove();
            System.out.println(arrayList.);

        }
        System.out.println();
        while (arrayListIt.hasNext()) {
            System.out.println(arrayListIt.next());
        }
        System.out.println(arrayList.size());



        return null;
    }
}
