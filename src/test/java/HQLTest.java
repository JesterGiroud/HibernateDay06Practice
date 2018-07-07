import bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class HQLTest {

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
    public void test1(){
        //使用HQL操作数据库

        //1.
//        Query query = session.createQuery("from bean.Student");
//        List<Student> list = query.list();
//
//        System.out.println("list:"+list);

        //2.
//        Query query1 = session.createQuery("select sname from bean.Student as s");
////        List list1 = query1.list();
////        System.out.println("list1:"+list1);

        //3.

    }

}
