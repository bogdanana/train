package train;

public class fromInterface {
    public static void main(String[] args) {
        Borya1 q = new Borya1();
        Borya2 w = new Borya2();
        Borya3 e = new Borya3();
        print(q);
        print(w);
        print(e);

    }
    static void print(Borya b){
        b.Hello("Hello");
    }

}

class Borya1 implements Borya {

    @Override
    public void Hello(String s) {
        System.out.println(Borya1.class.getName()+" " + s);
    }
}

class Borya2 implements Borya {

    @Override
    public void Hello(String s) {
        System.out.println(Borya2.class.getName()+" " + s);
    }
}

class Borya3 implements Borya {

    @Override
    public void Hello(String s) {
        System.out.println(Borya3.class.getName()+" " + s);
    }
}