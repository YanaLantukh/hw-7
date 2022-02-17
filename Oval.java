class Oval extends Shape implements NameShape{
   private static String name = "Oval";

    public Oval() {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
