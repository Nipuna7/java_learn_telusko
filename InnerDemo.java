 class Student{
    String name;
    int age;
    String city;

    Student(String name,int age,String city){
       this.name=name;
       this.age=age;
       this.city=city;
    }

 }


public class InnerDemo {
    public static void main(String[] args) {
        Student obj=new Student("kamal",25,"matale");
        System.out.println(obj.name+" : "+obj.age+" : "+obj.city);
        
    }
}
