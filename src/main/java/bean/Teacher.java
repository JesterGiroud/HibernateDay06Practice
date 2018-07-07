package bean;

import java.util.Set;

public class Teacher {

    Integer tid;//职工编号，唯一
    String tname;//姓名
    String title;//职称
    String direction;//研究方向

    Set<Student> students;//一个导师拥有多个学生

    public Teacher() {
    }

    public Teacher(Integer tid, String tname, String title,
                   String direction,
                   Set<Student> students) {
        this.tid = tid;
        this.tname = tname;
        this.title = title;
        this.direction = direction;
        this.students = students;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", title='" + title + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
