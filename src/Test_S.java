public class Test_S {
    public static void main(String args[]){
        Student[] IDNumber=new Student[10];
        for (int i=0;i<IDNumber.length;i++){
            IDNumber[i]=new Student((int)(1+Math.random()*1000000));
        }
        for (int i=1;i<IDNumber.length;i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (IDNumber[i].getId() < IDNumber[j].getId()) {
                    Student pr = IDNumber[j];
                    IDNumber[j] = IDNumber[i];
                    IDNumber[i] = pr;
                    i--;
                }
            }
        }
        for (int i=0;i<IDNumber.length;i++){
            System.out.println(IDNumber[i].getId());
        }
    }
}
