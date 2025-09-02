package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//input class
        Scanner in = new Scanner(System.in);


        //inputs
        System.out.println("enter your name: ");
        String name = in.nextLine();

        System.out.println("enetr your id:  ");
        int id = in.nextInt();

        System.out.println("enter your Avg: ");
        double avg = in.nextDouble();



Student student1 = new Student(name, id,avg);
        System.out.println("the info of studnet is : ");
        System.out.println("the name is: " + student1.getName() + "   ;" + "the id is: " + student1.getId() +
                "   ;" + "the avg is: " + student1.getAvg());


        

        System.out.println("status: ");
        System.out.println(student1.check());

        }
    }
