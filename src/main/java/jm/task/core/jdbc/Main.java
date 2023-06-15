package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        SessionFactory sessionFactory = Util.getSessionFactory();
        System.out.println("SessionFactory 1 : " + sessionFactory.hashCode());
        SessionFactory sessionFactory2 = Util.getSessionFactory();
        System.out.println("SessionFactory 2 : " + sessionFactory2.hashCode());
        SessionFactory sessionFactory3 = Util.getSessionFactory();
        System.out.println("SessionFactory 3 : " + sessionFactory3.hashCode());
    }
}