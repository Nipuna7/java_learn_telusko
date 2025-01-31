
class Human{
    private String name;
    private int age;
    
    public Human(){
        age=25;
        name="Nipuna";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}


public class DemoTwo {
    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
