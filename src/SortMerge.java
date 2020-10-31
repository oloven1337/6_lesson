import java.util.Comparator;

public class SortMerge implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getPoints() > s2.getPoints()) {
            return 1;
        } else if (s1.getPoints() < s2.getPoints()) {
            return -1;
        } else return 0;
    }
}
