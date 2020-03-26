package train;

import java.util.Random;

public class fromBint {


    public static void main(String[] args) {
        //GoodBohdana g = new GoodBohdana();
        BadBohdana y = new BadBohdana();
        //print(g);
        for(int i=0; i < 10; i++){
            y.Say();
        }

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
    Random r = new Random();
    @Override
    public boolean Next() {

        return r.nextBoolean();
    }

    @Override
    public void Say() {
        if (Next()) {
            System.out.println("No.");
        } else System.out.println(".");
    }


}