
class Human{
    private int age=24;
    private String name="Nipuna";

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Demo{
    public static void main(String args[]){
        Human obj=new Human();
        // obj.age=12;
        // obj.name="supun";
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}