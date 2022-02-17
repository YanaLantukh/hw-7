public class Star extends Shape implements NameShape{
    public static String name = "Star";

    public Star() {
        super(name);
    }


    @Override
    public String getName() {
        return name;
    }
}
