package builderDesign;

public class Shop {
    public static void main(String[] args) {
        PhoneBuilder builder = new PhoneBuilder();
        Phone p = builder.getPhone();
        System.out.println(p);
    }
}
