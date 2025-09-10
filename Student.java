//Eisha mehmood
//Sp25-bcs-031


public class Student{
  private String name;
  private String Email;
  private double cgpa;

public Student(String name,String Email,double cgpa,){
this.name=name;
this.email=email;
this.cgpa=cgpa;

public String getname(){
return name;
}
public String getemail(){
return email;
}
public double getcgpa(){
return cgpa;
}


public void setname(String name){
this.name=name
}

public void setemail(String email){
this.email=email
}

public void setcgpa(double cgpa){
this.cgpa=cgpa
}


public void display(){
System.out.println("Student name"+name);
System.out.println("Student email"+email);
System.out.println("Student cgpa"+cgpa);
}
}

