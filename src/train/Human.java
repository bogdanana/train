package train;

public class Human {
    private Head head = new Head();
    private Body body = new Body();
    private Limbs limbs = new Limbs();
    private int steps;

    public static void main(String[] args){
       Human human = new Human();
        System.out.println(human.walk(5));
        System.out.println(human.walk(7));
        System.out.println(human.answer("How much have you walked already?"));
        System.out.println(human.answer("Say from what you exist"));
        System.out.println(human.answer("fgfsljkl?"));
    }

    public String walk(int step) {
        steps = steps + step;
        return "I walk " + step;
    }

    public String answer(String question) {
        if("Say from what you exist".equalsIgnoreCase(question)) {
            return head + "," + body + "," + limbs;
        } else if ("How much have you walked already?".equalsIgnoreCase(question)){
            return "I've already walked" + steps;
        } else {
            return "DOn't understand you";
        }
    }

    public static class Head {
        public String toString() {
            return "eyes, nose, mouth...";
        }
    }

    public static class Body {
        public String toString() {
            return "chest, back, stomach...";
        }

    }

    public static class Limbs {
        public String toString() {
            return "arms, legs...";
        }
    }

}
