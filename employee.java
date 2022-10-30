/*   Write a java program which creates a class named employee and have following member name, date, phone number, address, salary .
It also has a method to print salary which prints the salary which prints the salary of employee.
2 classes offices and manager have data members specialization and department.
Now assign name , age, Phone number, address and salary to an officer and a manager .
by making an object of both of this classes and print the same.*/
class Employee{
    int id;
    String name;
    String dob;
    int phonnum;
    String address;
    double salary; 
    void printsalary(){
        System.out.println(name+" "+salary);
    }
}
class officer extends Employee{
    String department;
    String specialization; 
    void printall(){
        System.out.println("-------------\n"+"ID : "+id+"\nName : "+ name+"\nDOB : "+dob+"\nPhone Number : "+phonnum+"\nAddress : "+address+"\nSalary : "+salary+"\nSpecialization : "+specialization+"\nDepartment : "+department+"\n");
    }
}
class manager extends Employee{
    String department;
    String specialization;  
    void printall(){
        System.out.println("-------------\n"+"ID : "+id+"\nName : "+ name+"\nDOB : "+dob+"\nPhone Number : "+phonnum+"\nAddress : "+address+"\nSalary : "+salary+"\nSpecialization : "+specialization+"\nDepartment : "+department+"\n");
    }  
}
class employee{
    public static void main(String []args){
        officer o = new officer();
        o.id = 69;
        o.name="Arun";
        o.dob = "08.02.2004";
        o.phonnum = 800;
        o.salary = 35394;
        o.address = "India";
        o.specialization = "Artificial inteligence";
        o.department = "Computer Science";
        
        o.printsalary();      
        o.printall();
        manager b = new manager();
        b.id = 55;
        b.name="Tom";
        b.dob = "25.01.2001";
        b.phonnum = 600;
        b.salary = 46734;
        b.address = "Australia";
        b.specialization = "Front end";
        b.department = "Computer Science";
       
        b.printsalary();
        b.printall();
    }
}
