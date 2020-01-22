package train;

public class ObjectClass {

    public static void main(String[] args) {
        ObjectClass main = new ObjectClass();
        CustomObject obj1 = new CustomObject(3, "tt", 55.6);
        CustomObject obj2 = obj1;
        System.out.println(main.getClass().getName());
        System.out.println(main.hashCode());
        System.out.println(obj1.equals(obj2));

    }

    public static class CustomObject {
        private int id;
        private String name;
        private double length;

        public CustomObject(int id, String name, double length){
            this.id = id;
            this.name = name;
            this.length = length;
        }


    }
}
