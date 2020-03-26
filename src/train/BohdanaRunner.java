package train;

import java.util.Stack;

public class BohdanaRunner {
    public static void main(String[] args) {
        Bogdana bogdana = new GoodBogdana();
        runBogdana(bogdana);
    }
    static void runBogdana(Bogdana b){
        while(b.next()){
            b.say();
        }
    }
}
interface Bogdana{
    boolean next();
    void say();
}

class GoodBogdana implements Bogdana{

    Stack<String> worlds = new Stack<>();

    public GoodBogdana() {
        this.worlds.push("Hello");
        this.worlds.push("Everyone!");
        this.worlds.push("Love!");
    }

    @Override
    public boolean next() {
        return !worlds.empty();
    }

    @Override
    public void say() {
        System.out.println(this.worlds.pop());
    }
}
