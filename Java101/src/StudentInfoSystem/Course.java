//Project: Student Info System

package StudentInfoSystem;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;


    Course(String name, String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else {
            System.out.println("Teacher and course sections do not match.");
        }

    }
    void printTeacher(){
        this.teacher.print();
    }

}
