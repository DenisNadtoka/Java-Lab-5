public class Demo {
    public static void main(String[] args) {
        Phone phone1 = new Iphone("XR");
        Phone phone2 = new Samsung("S20");

        phone1.Call();
        phone2.Call();

        System.out.println(phone1.getModel());
        System.out.println(phone2.getModel());
    }
}