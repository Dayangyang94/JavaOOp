package model;

public class Student {
    public String name; // 成员变量
    public int age; // 成员变量
    public String sex;
    public int  no;
    // 构造方法
    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  Student(String name,int age,String sex,int no){
        this.name = name;
        this.age = age;
        this.sex=sex;
        this.no=no;
    }

    // 成员方法
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public int getNo() {
        return no;
    }
    // 成员方法
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
