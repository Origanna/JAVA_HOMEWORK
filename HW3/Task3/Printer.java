package HW3.Task3;

import java.util.ArrayList;
import java.util.Arrays;

class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
            if (s.length() > 3) {
                result.add(s);
            }
        }
        // Преобразуем ArrayList в массив
        String[] resultArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}

public class Printer {
    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
            arr = new String[] { "cat", "elephant", "dog", "giraffe" };
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}