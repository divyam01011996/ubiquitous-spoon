//package com.example.hibernate.demo.entity;
//
//import javax.persistence.*;
//import java.util.Set;
//
//// Adding the table name
//@Table(name = "Student")
//public class StudentInformation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int rollno;
//    private String name;
//
//    // Mapping to the other table
////    @OneToMany(cascade = CascadeType.ALL)
////    private Set<Address> ob;
////    public int getRollno() { return rollno; }
//
//    public StudentInformation() {}
//
//    public StudentInformation(int rollno, String name)
//    {
//        this.rollno = rollno;
//        this.name = name;
//    }
//
//    public void setRollno(int rollno)
//    {
//
//        this.rollno = rollno;
//    }
//
//    public String getName() { return name; }
//
//    public void setName(String name) { this.name = name; }
//}