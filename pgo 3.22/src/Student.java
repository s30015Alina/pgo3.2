
public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public Student(String fname, String lname, String indexNumber, String email, String address, double[] grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public double countAGP() {
        double sum = 0.0;
        try {
            for (double i : grades) {
                sum += i;
            }
            sum /= grades.length;
        } catch (IllegalArgumentException e) {
            System.out.println("No marks found. Invalid student");
            e.printStackTrace();
        }
        if(Math.round(sum*100)/100.0 - Math.round(sum) < 0.75 && Math.round(sum*100)/100.0 - Math.round(sum) > 0.5) {
            return Math.round(sum) - 1;
        } else if(Math.round(sum*100)/100.0 - Math.round(sum) > 0.75 && Math.round(sum*100)/100.0 - Math.round(sum)
                < 0.5) {
            return Math.round(sum) + 1;
        }
        return Math.round(sum);
    }
}