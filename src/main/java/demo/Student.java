package demo;

public class Student {
    private String name;
    private int rollNo;
    private String mobNo;
    private int age;

    public Student(int age, String name, String mobNo, int rollNo) {
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;

    }
}


