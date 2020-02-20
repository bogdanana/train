package train;

public class LessonSimpleVery {
    public static void main(String[] args) {
        DefaultConstructorOnly a = new DefaultConstructorOnly();
        a.setByaka(5);
        System.out.println(a.getByaka());
        NotSoEasyClass b = new NotSoEasyClass(5);
        System.out.println(b.getNoByaka());

    }
}

class DefaultConstructorOnly{
    private int byaka;

    public int getByaka() {
        return byaka;
    }

    public void setByaka(int byaka) {
        this.byaka = byaka;
    }
}
class NotSoEasyClass{
   private int noByaka;

    public NotSoEasyClass(int noByaka) {
        this.noByaka = noByaka;
    }

    public int getNoByaka() {
        return noByaka;
    }
}