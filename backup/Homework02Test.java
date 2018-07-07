import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

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
    public void homework2() {


        Configuration configure = new Configuration().configure();
        //session工厂
        SessionFactory sessionFactory = configure.buildSessionFactory();

        //获取session
        Session session = sessionFactory.openSession();


        //================================================

//        create table student (
//                sno varchar(255) not null auto_increment,
//                sname varchar(255),
//                gender varchar(255),
//                date time,
//                tid integer,
//                primary key (sno)
//    ) engine=InnoDB
//
//        create table teacher (
//                tid integer not null auto_increment,
//                tname varchar(255),
//                title varchar(255),
//                direction varchar(255),
//                primary key (tid)
//    ) engine=InnoDB
//
//        alter table student
//        add constraint FKqv1ecet39llaf59hrt9csojbc
//        foreign key (tid)
//                references teacher (tid)
        //================================================


        session.close();
    }
}
