public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Sets the name of the Student.
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the Student.
     * 
     * @param name the value to set as the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the id of the Student.
     * 
     * @param group 123123
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Sets the name of the Student.
     * 
     * @return
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * Sets the id of the Student.
     * 
     * @param id the value to set as the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the id of the Student.
     * 
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the id of the Student.
     * 
     * @param email the value to set as the id
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the id of the Student.
     * 
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Sets the id of the Student.
     * 
     * @param id the value to set as the id
     */
    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Sets the id of the Student.
     * 
     * @param name 1123
     * @param id 123
     * @param email 1232
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Sets the id of the Student.
     * 
     * @param s 123
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Gets the email of the Student.
     * 
     * @return
     */
    String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}
