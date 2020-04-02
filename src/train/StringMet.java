package train;

public class StringMet {

    public static void main(String[] args) {
        Example myEx = new Example();
        String Str = "adn this is the second string";



    }

    public static class Example {
        public String str1 = "This is the first string";
        public String str2 = "adn this is the second string";

        public void calculateString(String value) {
            for ( char e :
                    value.toCharArray()) {
                if (e == 'a') {
                    System.out.println(e);
                }

            }

        }

        public void replaced(String value) {
            char []valueArr = value.toCharArray();
            for (int i = 0; i < valueArr.length; i++) {
                if (valueArr[i] == 'a')
                    valueArr[i] = 'c';
                String replacedV = new String(valueArr);
            }
        }
    }

}
