package code.challenges.LeftJoin;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin() {
        HashMap<String, String> left = new HashMap<>();
        left.put("a", "apple");
        left.put("b", "banana");
        left.put("c", "coconut");
        HashMap<String, String> right = new HashMap<>();
        right.put("a", "avocado");
        right.put("d", "dingo");
        right.put("e", "eggplant");
        right.put("c", "chocolate");
        ArrayList<String[]> output = LeftJoin.leftJoin(left, right);
        assertTrue("[a, apple, avocado]".equals(Arrays.toString(output.get(0))));
        assertTrue("[b, banana, null]".equals(Arrays.toString(output.get(1))));
        assertTrue("[c, coconut, chocolate]".equals(Arrays.toString(output.get(2))));
    }

    @Test
    public void testLeftJoinNoConnections(){
        HashMap<String, String> left = new HashMap<>();
        left.put("a", "apple");
        left.put("b", "banana");
        left.put("c", "coconut");
        HashMap<String, String> right = new HashMap<>();
        right.put("q", "quip");
        right.put("r", "raspberry");
        right.put("s", "sammich");
        right.put("t", "tea");
        ArrayList<String[]> output = LeftJoin.leftJoin(left, right);
        assertTrue("[a, apple, null]".equals(Arrays.toString(output.get(0))));
        assertTrue("[b, banana, null]".equals(Arrays.toString(output.get(1))));
        assertTrue("[c, coconut, null]".equals(Arrays.toString(output.get(2))));
    }

    @Test
    public void testLeftJoinAllConnections(){
        HashMap<String, String> left = new HashMap<>();
        left.put("a", "apple");
        left.put("b", "banana");
        left.put("c", "coconut");
        HashMap<String, String> right = new HashMap<>();
        right.put("a", "avocado");
        right.put("b", "bagel");
        right.put("c", "chocolate");
        ArrayList<String[]> output = LeftJoin.leftJoin(left, right);
        assertTrue("[a, apple, avocado]".equals(Arrays.toString(output.get(0))));
        assertTrue("[b, banana, bagel]".equals(Arrays.toString(output.get(1))));
        assertTrue("[c, coconut, chocolate]".equals(Arrays.toString(output.get(2))));
    }
}