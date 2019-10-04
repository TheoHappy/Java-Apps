public class Main {

    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "A13", 512,"6.1","12","IOS",true, "Black");
        iphone.show();
        System.out.println("------------------------------------------");
        Phone samsungS9= new Phone("Samsung", "Snapdragon895", 64,"5.8","12","Android",true, "Red");
        samsungS9.show();
        samsungS9.setColor("Yellow");
        samsungS9.setCpu("Exynos Mali-G72");
        System.out.println("------------------------------------------");
        samsungS9.show();
    }
}
