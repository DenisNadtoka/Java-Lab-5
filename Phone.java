public abstract class Phone {

    public Phone(String model) {
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    private String model;

    public abstract void Call();
}
