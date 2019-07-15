package code.challenges.LeftJoin;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {

    public static ArrayList<String[]> leftJoin(HashMap<String, String> left, HashMap<String, String> right){
        ArrayList<String[]> list = new ArrayList<>();
        for ( String item : left.keySet()){
            if (right.containsKey(item)){
                list.add( new String[]{item, left.get(item), right.get(item)});
            }else {
                list.add( new String[]{item, left.get(item), "null"});
            }
        }
        return list;
    }
}
