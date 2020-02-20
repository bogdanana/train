package train;

public class Parentheses {

    public static void main(String[] args) {
        Parentheses p = new Parentheses();
        String s = "(())()()()((()";
        System.out.println(p.checker(s));
    }

        public boolean checker(String s) {
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
                        else b = false;*/
                    }
                }
            if (s.charAt(0) == ')' || s.charAt(l - 1) == '(') b = false;
            if (l%2 != 0) b = false;
            return b;
        }

}


