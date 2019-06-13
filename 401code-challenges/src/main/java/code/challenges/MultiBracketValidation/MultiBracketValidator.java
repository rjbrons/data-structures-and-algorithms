package code.challenges.MultiBracketValidation;

import code.challenges.stacksandqueues.Stack;

import java.util.HashMap;
import java.util.Map;

public class MultiBracketValidator {
    Stack<String> opens;

    public MultiBracketValidator(){
        opens = new Stack<>();
    }

    public boolean validate(String input){
        Map<String, String> pairs = new HashMap<>();
        pairs.put("(",")");
        pairs.put("[","]");
        pairs.put("{", "}");
        for (int i = 0; i < input.length(); i++){
            String s = Character.toString(input.charAt(i));
            if (pairs.containsKey((s))){
                this.opens.push(s);
            } else if (pairs.containsValue(s)){
                if (opens.empty() || !pairs.get(opens.pop()).equals(s) ){
                    return false;
                }
            }
        }
        if (!opens.empty()){
            return false;
        }
        return true;

    }
}
