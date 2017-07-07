package com.spring.runner;

import com.spring.service.PersonServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonServiceImpl service = new PersonServiceImpl();
        System.out.println(service.getAllPersonInService().get(0).getfName());
    }
}
