package edu.sumdu;

abstract public class Human implements WarAble{
       private int age;
       private String name;
       public static final String DEF_ST_OK = "I can do war";
       public static final String DEF_ST_NO = "I can't do war!";
       private String status;


       public void setAge(int age) { this.age = age;}
       public void setName(String name) { this.name = name;}

       public String getStatus() {
              return status;
       }

       public void setStatus(String status) {
              this.status = status;
       }

       public int getAge() { return age;}
       public String getName() { return name;}
}
