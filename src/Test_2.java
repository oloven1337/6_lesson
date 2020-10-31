import java.util.ArrayList;

public class Test_2 {
    public static void main(String args[]){
        ArrayList<Student> stud=new ArrayList<>(10);
        for(int i=0;i<10;i++){
            stud.add(i, new Student((int) (1 + Math.random() * 1000000), (int) (1 + Math.random() * 300)));
        }
        stud.sort(new SortingStudentsByGPA());
        for(int i=0;i<stud.size();i++){
            System.out.println(stud.get(i).getPoints());
        }
    }
}
