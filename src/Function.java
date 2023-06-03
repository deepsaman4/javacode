
class Student{
    String firstname;
    String lastname;
    int age;
    String address;
    int b=9;





    void printInfo(int b) {
        b = 8;

        System.out.println(this.firstname);
        System.out.println(this.lastname);
        System.out.println(this.age);
        System.out.println(this.address);
        System.out.println(this.b);
    }
    Student(String firstname,String lastname,int age ){
        this(firstname,age);

    }
    Student(){


    }
    Student( String firstname,int age){
        this.firstname=firstname;
this .age=21;
    }












}







public class Function {


    public static void main(String[] args) {
        Student sam=new Student ();
        Student peter=new Student( "peter",21);
        Student harry =new Student( "harry","potter",34);



        harry.printInfo(8);



















    }
}
