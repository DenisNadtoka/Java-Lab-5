public class Samsung extends Phone{
    private String model;

    public Samsung(String model) {
        super(model);
    }

    @Override
    public void Call() {
        System.out.println("Samsung");
    }

}