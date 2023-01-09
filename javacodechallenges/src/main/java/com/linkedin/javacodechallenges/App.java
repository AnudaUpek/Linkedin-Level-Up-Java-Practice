package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person("Anuda", "Upek",22);
        Person p2 = new Person("Amal", "Pera", 42);
        Person p3 = new Person("Amila", "Upek", 30);

        p1.intro();
        p2.intro();
        p3.intro();
       
    }
}
