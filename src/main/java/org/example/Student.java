package org.example;

public class Student
{
    //fields
    private String name;
    private int id;
    private double avg;



    public Student(String name, int id,double avg){
        this.name = name;
        this.id = id;
        this.avg = avg;
    }



    //cehck status
    public double check(){
        if(avg >= 12){
            String  status = "ghabool";
            System.out.println(status);
        }
        else {
           String status = "mardood";
            System.out.println(status);
        }
            return avg;
    }


//retutns

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getAvg(){
        return  avg;
    }



}
