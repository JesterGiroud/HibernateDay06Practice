package bean;

import java.util.Date;

public class Student {

    Integer Sno;//学号，唯一
    String sname;//学生姓名
    String gender;//性别
    Date   date;//入学日期

    Teacher teacher;//导师，一个学生拥有一个导师

    public Student() {
    }

    public Student(Integer sno, String sname, String gender, Date date,
                   Teacher teacher) {
        Sno = sno;
        this.sname = sname;
        this.gender = gender;
        this.date = date;
        this.teacher = teacher;
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno='" + Sno + '\'' +
                ", sname='" + sname + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", teacher=" + teacher +
                '}';
    }
}
