import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class idComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCountry().compareTo(o2.getCountry());
    }
}
class Student{
    private int id;
    private String name;
    private String country;
    private int fees;

    public Student(int id, String name, String country, int fees) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
public class Comp {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"scooby","india",345));
        students.add(new Student(3,"Rohan","USA",345));
        students.add(new Student(4,"Keshav","USA",345));
        students.add(new Student(2,"Sameer","UK",345));

        // sorting by id;
//        Collections.sort(students,new idComparator());

        // using lambda
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getCountry().compareTo(o2.getCountry());
//            }
//        });

        Collections.sort(students, (o1, o2) -> o1.getCountry().compareTo(o2.getCountry()));
        for (Student student:students){
            System.out.println("id is "+student.getId()+" name is "+student.getName()+
                    " country is "+student.getCountry()+" fee is "+student.getFees());
        }

    }
}x
