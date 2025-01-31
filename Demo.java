class Human{
    String name;
    String gender;
    int age;
    int wight;

    public void displayDitail(){
           System.out.println("I am "+this.name+" and i am  "+this.age+" years old.");
    }

    Human(String name,String gender,int age,int wight){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.wight=wight;
    }
}


public class Demo {
    public static void main(String[] args) {
        Human obj=new Human("saman","male", 25, 55);
        obj.displayDitail();
    }
}
