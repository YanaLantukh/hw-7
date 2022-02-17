public class Circle extends Shape implements NameShape {
   private static String name = "Circle";

    public Circle() {
        super(name);
    }


    @Override
    public String getName() {
        return name;
    }
}
