import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Created by admin on 13.06.2017.
 */
public class ArrayModificator {

    public Integer[] arrayMod(Integer[] inArr){

        Integer[] outArr;
        Integer integer = 4;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(inArr));
        try {
            if (!arrayList.contains(4)) throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println(e.fillInStackTrace());
            System.out.println("No number");
        }

        ListIterator<Integer> arrayListIt = arrayList.listIterator();
        while (arrayListIt.hasNext() & arrayList.contains(integer)) {
            arrayListIt.next();
            arrayListIt.remove();
        }
        outArr = arrayList.toArray(new Integer[arrayList.size()]);
        return outArr;
    }

    public boolean arrayCheck(Integer[] inArr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(inArr));
        if (arrayList.contains(1) & arrayList.contains(4)) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != 1 & arrayList.get(i) != 4) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
