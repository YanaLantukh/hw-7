public class Square extends Shape implements NameShape {
   private static String name = "Square";

    public Square() {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
