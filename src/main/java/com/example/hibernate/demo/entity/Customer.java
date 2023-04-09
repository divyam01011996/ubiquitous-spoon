package com.example.hibernate.demo.entity;

import javax.persistence.*;

@Entity
public class Customer {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idp;

 @Column
 private String firstName;
 @Column
 private String lastName;
 @Column
 private String email;


 @ManyToOne
 @JoinColumn(name = "data_id")
 public Data data;

 public Data getData() {
  return data;
 }

 public void setData(Data data) {
  this.data = data;
 }

 public Customer() {
 }

 public Long getIdp() {
  return idp;
 }

 public void setIdp(Long idp) {
  this.idp = idp;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 //get & set methods
}