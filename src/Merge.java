import java.util.ArrayList;

public class Merge {
    public static void main(String args[]) {
        ArrayList<Student> stud1 = new ArrayList<>(10);
        ArrayList<Student> stud2 = new ArrayList<>(10);
        ArrayList<Student> stud = new ArrayList<>(20);
        for (int i = 0; i < 10; i++) {
            stud1.add(i, new Student((int) (1 + Math.random() * 1000000), (int) (1 + Math.random() * 300)));
            stud2.add(i, new Student((int) (1 + Math.random() * 1000000), (int) (1 + Math.random() * 300)));
        }
        stud1.sort(new SortMerge());
        stud2.sort(new SortMerge());
        int s1 = 0, s2 = 0, s = 0;
        while (s1 < 10 && s2 < 10) {
            if (stud1.get(s1).getPoints() > stud2.get(s2).getPoints()) {
                stud.add(s, stud2.get(s2));
                s++;
                s2++;
            } else {
                stud.add(s, stud1.get(s1));
                s++;
                s1++;
            }
        }
        if (s1 == 10 || s2 == 10 && !(s1 == 10 && s2 == 9) && !(s1 == 9 && s2 == 10)) {
            if (s1 == 10) {
                while (s2 != 10) {
                    stud.add(s, stud2.get(s2));
                    s++;
                    s2++;
                }
            } else if (s2 == 10) {
                while (s1 != 10) {
                    stud.add(s, stud1.get(s1));
                    s++;
                    s1++;
                }
            }
        }
        for (Student student : stud) {
            System.out.println(student.getPoints());
        }
    }
}
