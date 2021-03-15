public class Student implements Comparable<Student>{
    private String meno;
    private int vek;

    public Student(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
    }

    private int getVek() {
        return vek;
    }

    @Override
    public int compareTo(Student o) {
        //vek daného objektu je VäČŠÍ
        if(this.getVek()>o.getVek()){
            return 1;
        }
        //vek daného objektu je MENŠÍ
        else if(this.getVek()<o.getVek()){
            return -1;
        }
        //vek daného objektu je ROVNÝ
        else{
            return 0;
        }
    }
}
