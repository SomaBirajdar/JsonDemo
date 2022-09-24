package org.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("src/main/resources/OutputFile");
        FileWriter OutputFile=new FileWriter(file.getAbsoluteFile()+".out");

        ObjectMapper mapper=new ObjectMapper();

        EmployeeItem student=mapper.readValue(new File("src/main/resources/dummy.json"),EmployeeItem.class);

        EmployeeItem[] emp = mapper.readValue(new File("src/main/resources/demo.json"), EmployeeItem[].class);
        for(int i=0; i<emp.length;i++){
            EmployeeItem emp1=emp[i];
            if(emp1.equals(student)){
                System.out.println(emp1);
                System.out.println(student);
                System.out.println("Matched"+"\n");
            }
            else{
                System.out.println(emp1);
                System.out.println(student);
                System.out.println("Not matched"+"\n");
            }

            //Arrays.asList(emp).forEach(System.out::println);


           /* String empFirstName=emp1.getFirstName();
            String empLastName= emp1.getLastName();
            String empCity=emp1.getCity();
            String stdFirstName=student.getFirstName();
            String stdLastName= student.getLastName();
            String stdCity=student.getCity();*/



           /* if(empFirstName.equals(stdFirstName) && empLastName.equals(stdLastName) && empCity.equals(stdCity)){
                System.out.println(emp1);
                System.out.println(student);
                System.out.println("Matched");

                OutputFile.write("Both Matches"+"/n"+emp1+"/n"+student);
            }
            else {
                System.out.println(emp1);
                System.out.println(student);
                System.out.println("Not Matched");
            }*/
           /* Employee student1=mapper.readValue(new File("src/main/resources/dummy.json"),Employee.class);

            Employee[] empx = mapper.readValue(new File("src/main/resources/demo.json"), Employee[].class);
        System.out.println(student1);
            for(int i=0; i<empx.length;i++){
                System.out.println(empx[i]);
                Employee emp2=empx[i];
                if(emp2.equals(student1)){
                    System.out.println(empx);
                    System.out.println(student1);
                    System.out.println("Matched"+"\n");
                }
                else{
                    System.out.println(empx);
                    System.out.println(student1);
                    System.out.println("Not matched"+"\n");
                }*/

        }
    }
}