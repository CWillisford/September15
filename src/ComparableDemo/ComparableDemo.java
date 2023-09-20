package ComparableDemo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ComparableDemo extends Object{
    public static void main(String[] args) {
//        System.out.println("Compare the result from two numbers: " + new Integer(3).compareTo(3));
//
//        System.out.println("Compare: " + Integer.valueOf(3).compareTo(3));
//
//        String[] city = {"Atlanta", "Lawrenceville","Tucker"};
//        java.util.Arrays.sort(city);
//
//        System.out.println(Arrays.toString(city));
//
        System.out.println("compares big integer values");
        List<BigInteger> list = new ArrayList<BigInteger>();

        //list.add("98989898989898989898989898989898");
        list.add(new BigInteger("9898989898989898989898989898989898989"));
        list.add(new BigInteger("87"));
        list.add(new BigInteger("4567890"));

        Collections.sort(list);

        System.out.println("After sorting");
    }
}
