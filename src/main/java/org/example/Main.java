package org.example;

import org.example.service.Management;
import org.example.view.Attendent;

import java.sql.SQLException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        var management = new Management();
        var attendent = new Attendent();

        while(true){


            try{

                int decision2 = attendent.menu();
                management.manager(attendent, decision2);

            }catch (InputMismatchException e){
                main(args);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }


    }
}