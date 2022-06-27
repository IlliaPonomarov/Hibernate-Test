package org.example;


import org.example.model.Director;
import org.example.model.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Director.class)
                .addAnnotatedClass(Film.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            // Получите любой фильм, а затем получите его режиссера
//            Film film = session.get(Film.class, 1);
//            System.out.println("1) " + film.getTitle() + ": " + film.getDirector().getName());

            // Добавьте еще один фильм для любого режиссера.
//            Director director = session.get(Director.class, 3);
//            Film newFilm = new Film("Jhon Wick", director);
//
//            director.getFilmList().add(newFilm);
//            System.out.println(director.getName() + " : ");
//
//
//            for (Film fil : director.getFilmList())
//                System.out.println(fil.getTitle());



// Создайте нового режиссера и новый фильм и свяжите эти сущности.

//            Director director = new Director("Illia Ponomarov");
//            Film film = new Film("Harry Potter", director);

//            session.save(director);
//            session.save(film);
//
//            Director test = session.get(Director.class, 4);
//
//            for (Film f: test.getFilmList()) {
//                System.out.println(f.getTitle());
//            }

            //Смените режиссера у существующего фильма.

//            Director changeToNew = session.get(Director.class, 4);
//
//            Film film = session.get(Film.class, 3);
//
//            film.setDirector(changeToNew);
//
//            changeToNew.getFilmList().add(film);
//
//            System.out.println(changeToNew.getName());
//            changeToNew.getFilmList().forEach(f -> System.out.println(f.getTitle()));


            //Удалите фильм у любого режиссера.
            Director director = session.get(Director.class, 4);
            Film film = session.get(Film.class, 5);


            session.remove(film);

            director.getFilmList().remove(film);


            session.getTransaction().commit();
        }
        finally {
            session.close();
        }



    }
}
