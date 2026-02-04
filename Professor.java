package University_Enrollment_System;

public class Professor extends Person {
    public String department;
    public Professor(String name, String email, String department){
        super(name, email);
        this.department= department;
    }
    @Override
    public void displayRole(){
        System.out.println("Role : Professor  | Dep : " + department);
    }
}
