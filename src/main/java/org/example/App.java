package org.example;


import org.example.model.Actor;
import org.example.model.Movie;
import org.example.model.homework.Director;
import org.example.model.homework.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Director.class)
                .addAnnotatedClass(School.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            // Your code ... 0_o

            // TASK 1
//            Director d1 = session.get(Director.class, 1);
//
//            System.out.printf("%s - %s" , d1.getDirector_name(),
//                    d1.getSchool().getSchool_name());


            // TASK 2

//            School school = new School("The Guild of Wolf");
//            Director director = new Director("Henry");
//
//            school.setDirector(director);
//
//            session.save(school);

            //Task 3

            // ???
            //Delete director from exist school





            session.getTransaction().commit();
        }
        finally {
            session.close();
        }



    }
}
