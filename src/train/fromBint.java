package train;

import java.util.Random;

public class fromBint {
    private static boolean b;

    public static void main(String[] args) {
        //GoodBohdana g = new GoodBohdana();
        BadBohdana y = new BadBohdana();
        //print(g);
        y.Say(b);
        print(y);

    }

    static void print(Bohdana y){
    }
}


/*class GoodBohdana implements Bohdana {

    @Override
    public boolean Next(boolean b)

    @Override
    public void Say() {
        System.out.println();
    }
}
*/
class BadBohdana implements Bohdana {

    @Override
    public boolean Next() {
        Random r = new Random();
        return r.nextBoolean();
    }

    @Override
    public void Say(boolean Next) {
        if (Next=true) {
            System.out.println("No.");
        } else System.out.println(".");
    }


}