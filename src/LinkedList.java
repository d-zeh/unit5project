import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList{

    public static int linkedList(LinkedList<Integer> first, LinkedList<Integer> second) {
        List<Integer> array = new ArrayList<>();

        for(Integer inter : first) {
            for (Integer outer : second) {
                int intValue = (inter+outer);
                array.add(intValue);
                break;

            }
        }
        System.out.println(array);

    }
}

