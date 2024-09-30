package org.example.utils;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    @Getter
    private static SessionFactory sessionFactory;

    static {
        Configuration cfg = new Configuration();
        cfg.configure();
        if (sessionFactory == null) {
            sessionFactory = cfg.buildSessionFactory();
        }
    }

}
