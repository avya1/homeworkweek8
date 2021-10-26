package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
        //setting values of the variable
        obj.setName("Anchal");
        obj.setAge(30);
        obj.setRollNo(101);
        //Displaying values of the variables
        System.out.println("Prime's name: "+obj.getName());
        System.out.println("Prime's age: "+obj.getAge());
        System.out.println("Prime's rollNo: "+obj.getRollNo());//direct access rollNo not possible due to encapsulation
    }
}
