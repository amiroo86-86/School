package org.example;

/**
 * this program show the information of student and
 * check the status of Acceptance and rejection of student
 */

public class Student
{
    //fields

    private String name;
    private int id;
    private double avg;


    //constructor1
    public Student(String name, int id,double avg){
        this.name = name;
        this.id = id;
        this.avg = avg;
    }



    //cehck status

    /**
     *
     * @return  avg from the mark of student
     */
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

    /**
     *
     * @return the name , id and avg
     */

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
