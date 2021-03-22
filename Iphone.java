public class Iphone extends Phone{
    private String model;

    public Iphone(String model){
        super(model);
    }

    @Override
    public void Call() {
        System.out.println("Iphone");
    }
}