public class StudentManagement {
    public static Student[] students = new Student[100];
    public static int numberStudents = 0;
    static String[] groups = new String[100];
    static int numberGroups = 0;

    /**
     * Check if two students are in the same group.
     * 
     * @param s1 11
     * @param s2 11
     * @return
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Check if a student exists in the list.
     * 
     * @param s 11
     * @return
     */
    public static boolean existStudent(Student s) {
        for (int i = 0; i < numberStudents; i++) {
            if (students[i].getId().equals(s.getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Add a student to the list.
     * 
     * @param newStudent 11
     */
    public static void addStudent(Student newStudent) {
        if (existStudent(newStudent) == false && numberStudents < students.length) {
            students[numberStudents] = new Student(newStudent);
            numberStudents++;

            for (int i = 0; i < numberGroups; i++) {
                if (groups[i].equals(newStudent.getGroup())) {
                    return;
                }
            }
            groups[numberGroups] = newStudent.getGroup();
            numberGroups++;
        }
    }

    /**
     * Get the list of students by group.
     * 
     * @return
     */
    public static String studentsByGroup() {
        String res = "";
        for (int i = 0; i < numberGroups; i++) {
            res += groups[i] + "\n";
            for (int j = 0; j < numberStudents; j++) {
                if (students[j].getGroup().equals(groups[i])) {
                    res += students[j].getInfo() + "\n";
                }
            }
        }
        return res;
    }

    /**
     * Remove a student from the list.
     * 
     * @param id 11
     */
    public void removeStudent(String id) {
        for (int i = 0; i < numberStudents; i++) {
            if (students[i].getId().equals(id)) {
                if (numberStudents - i - 1 >= 0) {
                    System.arraycopy(students, i + 1, students, i, numberStudents - i - 1);
                }
                numberStudents--;
                return;
            }
        }
    }

    /**
     * Main function.
     * 
     * @param args 11
     */
    public static void main(String[] args) {
        Student a = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        a.setGroup("K62CC");
        addStudent(a);
        Student b = new Student("Nguyen Van B", "17020002", "1702002@vnu.edu.vn");
        b.setGroup("K62CC");
        addStudent(b);
        Student c = new Student("Nguyen Van C", "17020003", "1702003@vnu.edu.vn");
        addStudent(c);
        Student d = new Student("Nguyen Van D", "17020004", "1702004@vnu.edu.vn");
        addStudent(d);

        System.out.println(studentsByGroup());
    }
}
