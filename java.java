public class Java {laptop   
    String brand;
    String model;
    double price;

    public static void main(String[] args) {
        laptop laptop1 = new laptop();
        laptop1.brand = "Dell";
        laptop1.model = "XPS 13";
        laptop1.price = 999.99;

        laptop laptop2 = new laptop();
        laptop2.brand = "Apple";
        laptop2.model = "MacBook Pro";
        laptop2.price = 1299.99;

        system.out.println("Laptop 1: details");
        system.out.println("Brand: " + laptop1.brand);
        system.out.println("Model: " + laptop1.model);
        system.out.println("Price: $" + laptop1.price);
        system.out.println();

        system.out.println("Laptop 2: details");
        system.out.println("Brand: " + laptop2.brand);
        system.out.println("Model: " + laptop2.model);
        system.out.println("Price: $" + laptop2.price);
        
}