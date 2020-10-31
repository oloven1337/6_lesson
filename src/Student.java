public class Student {
    private int id;
    private int points;
    public int getPoints() {
        return points;
    }
    public void setPoints(int ball) {
        this.points = points;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Student(int id){
        this.id=id;
    }
    public Student(int id, int points){
        this.id=id;
        this.points=points;
    }
    public int getId() {
        return id;
    }
}
