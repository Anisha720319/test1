import java.io.*; 
import java.util.Scanner;
class Student 
{ 
long usn; 
String name, branch; 
long ph; 

Student() // Default constructor
{ 
usn=0;
name = "no value"; 
branch ="CSE"; 
ph = 0; 
} 
Student(long u, String n, String b, long p) // Parametarized constructor
{ 
usn = u;
name = n;
branch = b;
ph = p; 
} 
Student(Student obj) // Copy constructor
{ 
this.usn = obj.usn;
this.name = obj.name;
this.branch = obj.branch;
this.ph = obj.ph; 
} 
void display() 
{
System.out.println("Student Details"); 
System.out.println("USN:" + usn + "\t" + "Name:" + name + "\t" + "Branch:" + branch + "\t\t" + "Phone:" + ph); 
} 
} 


class Ex21
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student(22,"Oxford","CSE",123);
Student s3=new Student(s2);
s1.display();
s2.display();
s3.display();
}
}

I:\desktop\OOC second year\OOC LAB>javac Ex21.java

I:\desktop\OOC second year\OOC LAB>java Ex21
Student Details
USN:0   Name:no value   Branch:CSE              Phone:0
Student Details
USN:22  Name:Oxford     Branch:CSE              Phone:123
Student Details
USN:22  Name:Oxford     Branch:CSE              Phone:123
