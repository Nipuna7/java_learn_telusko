class Mobile{
   String brand;  //instance variable(part of the mobile)
   int price;
   static String name;
    
   public void show(){
    System.out.println(brand + " : " + price + " : " + name);
   }

}

public class Demo {
    public static void main(String[] args) {

        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=15000;
        obj1.name="Smart phone";

        Mobile obj2=new Mobile();
        obj2.brand="Nokia";
        obj2.price=1500;
        obj2.name="Smart phone";

        obj2.name="Phone";

        obj1.show();
        obj2.show();
    }
}
