package train;

public class StringMet {

    public static void main(String[] args) {
        Example myEx = new Example();
        System.out.println(myEx.str1.length());
        System.out.println(myEx.str1.charAt(3));
        System.out.println(myEx.str1.substring(4));
        System.out.println(myEx.str1.substring(4, 8));
        System.out.println(myEx.str1.concat(myEx.str2));
        System.out.println(myEx.str1.indexOf("is"));
        System.out.println(myEx.str1.indexOf("th", 3));
        System.out.println(myEx.str1.lastIndexOf("s"));

    }

    public static class Example {
        public String str1 = "This is the first string";
        public String str2 = "adn this is the second string";
    }
}
