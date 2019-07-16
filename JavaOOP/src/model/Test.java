package model;
import model.Student;
public class Test {
        public  static void main(String[] args){
            Student stu=new Student("张三",20,"女",0122);
            System.out.println("姓名:"+stu.getName()+"\n"+
                    "年龄:"+stu.getAge()+"\n"+
                    "性别:"+stu.getSex()+"\n"+
                    "学号:"+stu.getNo()
            );
        }

}
