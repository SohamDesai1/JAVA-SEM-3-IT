package com.company;

import java.lang.*;

class employee
{
    String name ,department ;
    int number ;
    double salary ;
    employee(String depa, String nam , int num , double sal )
    {
        department = depa ;
        name = nam ;
        number = num ;
    }
    void display()
    {
        System.out.println(name + " " +department + " " +number +" " + salary );
    }
    void enhancement()
    {
        salary = 1.1 * salary ;
    }
}
class Hod extends employee
{
    int goal ;
    public Hod(String department, String nam, int num, double sal) {
        super(department, nam, num, sal);
    }
    void display()
    {
        System.out.println(name + " " +department + " " +number +" " + salary + " HOD ");
    }
}
public class Assignment3
{
    public static void main(String[] args)
    {
        employee e = new employee("IT","SOHAM",10,100000) {
        };

        e.display();
        e.enhancement();
        e.display();
        Hod h = new Hod("xyz","DESAI",11,2000) ;
        h.display();
        h.enhancement();
        h.display();
    }
}