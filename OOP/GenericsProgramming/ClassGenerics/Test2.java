public class Test2 {
    public int year, month, day;

    public Test2(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public void copy(Test2 d) {
        d.year = year;
        d.month = month;
        d.day = day;
    }

    public Test2 copy() {
        return new Test2(day, month, year);
    }

    public static void main(String[] args) {
        int thisYear = 20;
        Test2 d1 = new Test2(thisYear, 2, 3);
        System.err.println(d1.year + " " + d1.month + " " + d1.day + "\n");
        Test2 d2 = new Test2(3, 4, 5);
        // d1.copy(d2);
        // System.err.println(d2.year + " " + d2.month + " " + d2.day + "\n");
        Test2 d3 = d2.copy();
        System.err.println(d3.year + " " + d3.month + " " + d3.day + "\n");

    }
}
