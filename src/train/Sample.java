package train;

public class Sample {

    public static void main(String[] args) {
        new B().a();
        new BwithDefault().a();
    }
}
interface A{
   default void a(){
       System.out.println("default");
   };
}
class B implements A{
    @Override
    public void a() {
        System.out.println("override");
    }
}
class BwithDefault implements A{

}