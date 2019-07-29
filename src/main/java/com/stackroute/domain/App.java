package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.sql.rowset.spi.XmlReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie.getActor());
        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1 = context.getBean("movie",Movie.class);
        System.out.println(movie1.getActor());
        System.out.println(movie==movie1);
        Movie movieA = context.getBean("movieA",Movie.class);
        System.out.println(movieA);
        Movie movieB = context.getBean("movieB",Movie.class);
        System.out.println(movieB);
    }
}
