package train;

import java.util.*;
import java.util.List;

public class Parentheses {


    public static void main(String[] args) {
        Parentheses p = new Parentheses();
        String s = "(())()()()((()))";
        System.out.println(p.checker(s));
    }

    public boolean checker(String s) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') stack.push(s.charAt(i));
            else if(s.charAt(i) == ')'){
                Character last = stack.pop();
                if(last == null) return false;
            }
        }

        return stack.empty();
        /*
            boolean b = false;
            int l = s.length();
            int i, counti = 0, countj = 0;

            while(!b){
                for (i = 0; i < l-1; i++) {
                    if (s.charAt(i) == '(') {
                        for (int j = 1; j < l - 1; j++) {
                            if (s.charAt(j) == ')') {
                                countj = j;
                                break;
                            }
                            else if (s.charAt(j) == '(') counti++;
                        }
                    }
                    if (counti > 0) {
                        for (int n = counti +1; n <= countj-counti; n++)
                            if (s.charAt(n) == ')') {
                                b = true;
                            } else b = false;
                    }


                            /*& s.charAt(j) == ')') b = true;
                        else if (s.charAt(i) == ')' & s.charAt(j) == '(') b = true;
                        else b = false;
                    }
                }*/

    }


}


