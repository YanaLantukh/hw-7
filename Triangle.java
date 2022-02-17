class Triangle extends Shape implements NameShape {
   private static String name = "Triangle";

    public Triangle() {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
