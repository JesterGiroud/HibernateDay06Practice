import bean.Student;
import bean.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;


public class Homework02Test {

    private Session session;
    private SessionFactory sessionFactory;
    private Transaction transaction;

    @Before
    public void before() {

        Configuration configure = new Configuration().configure("hibernate.cfg.xml");

        sessionFactory = configure.buildSessionFactory();

        session = sessionFactory.openSession();

        transaction = session.beginTransaction();

    }

    @After
    public void after() {

        transaction.commit();
        session.close();

    }

    @Test
    public void homework002() {


        Configuration configure = new Configuration().configure();
        //session工厂
        SessionFactory sessionFactory = configure.buildSessionFactory();

        //获取session
        Session session = sessionFactory.openSession();
        //================================================


        //================================================
        session.close();
    }

    //增
    @Test
    public void testAdd(){

        //新增一个导师
        Teacher teacher = new Teacher();
        teacher.setTname("wenger");
        teacher.setTitle("professor");
        session.save(teacher);

        //新增此导师的两个学生
        Student student1 = new Student();
        student1.setSname("ozil");
        student1.setTeacher(teacher);

        Student student2 = new Student();
        student2.setSname("giroud");
        student2.setTeacher(teacher);

        session.save(student1);
        session.save(student2);

    }

    //查
    @Test
    public void testquery() {

        Teacher teacher = session.get(Teacher.class,1);
        System.out.println("teacher name:"+teacher.getTname());//teacher name:wenger

        Set<Student> students = teacher.getStudents();
        System.out.println("students:"+students);
        // students:[Student{Sno='1', sname='ozil', gender='null', date=null,
        //                  teacher=Teacher{tid=1, tname='wenger', title='professor', direction='null'}},
        //          Student{Sno='3', sname='ramsey', gender='male', date=null,
        //                  teacher=Teacher{tid=1, tname='wenger', title='professor', direction='null'}},
        //          Student{Sno='2', sname='giroud', gender='null', date=null,
        //                  teacher=Teacher{tid=1, tname='wenger', title='professor', direction='null'}}]

//        Student student2 = session.get(Student.class, 2);
//        System.out.println("student2:"+student2);
    }

    //改
    @Test
    public void testupdate() {


        //由一的一方去更新多的一方 是可以更新的
        //但是不能新建一个order由user去自动插入
//        Teacher teacher = session.get(Teacher.class,1);
//        System.out.println("teacher"+teacher);
//
//        Set<Student> students = teacher.getStudents();
//
//        for (Student s:
//             students) {
//            s.setGender("male");
//        }
//        session.update(teacher);


        //由多方去更改一方 ,也是可以的
        Student student1 = session.get(Student.class, 1);
        student1.getTeacher().setDirection("manager");
        session.update(student1);

    }
}
