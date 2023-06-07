public class Student {
   private String firstname;
    private String lastname;
    private int age;
  private  int number;

  //setter
    //public void setFirstname(String firstname){
       // this.firstname=firstname;
   // }
Student(String firstname,String lastname,int age,int number){
    this.firstname=firstname;
    this.lastname=lastname;
    this.age=age;
    this.number=number;
}
  public String getFirstname(){
        return firstname;
  }




    void printInfo(){
        System.out.println("student are studing");
    }
}
