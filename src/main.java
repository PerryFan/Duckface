/**
 * Created by perry on 9/14/15.
 */

public class main {
    public static void main(String[] args)
    {
        Sort_array m = new Sort_array();
        int[] inputArr = {45,23,11,89,77,98,4};
        m.sort(inputArr);
        for (int i = 0; i<inputArr.length; i++)
            System.out.println(inputArr[i]);
        System.out.println(inputArr.toString());
    }

}
