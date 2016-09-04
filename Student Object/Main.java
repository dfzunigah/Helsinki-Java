
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String name;
        String number;
        String search;
        while(true){
            System.out.println("name: ");
            name=reader.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("studentnumber: ");
            number=reader.nextLine();
            Student newStudent= new Student(name,number);
            list.add(newStudent);
        }
        System.out.println("\n");
        for(Student student : list)
        System.out.println(student);
        System.out.println("\nGive search term: ");
        search=reader.nextLine();
        System.out.println("Result:");
        for(Student student : list){
            if(student.getName().contains(search)){
                System.out.println(student);
            }
        }
            
    }
}