package org.example.view;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Attendent {

    Scanner read = new Scanner(System.in);


    public int menu(){

        System.out.println("                                                       ");
        System.out.println("                                                       ");
        System.out.println("======================================================");
        System.out.println("             Industrial maintance System              ");
        System.out.println("------------------------------------------------------");
        System.out.println("1 - Register Supplier");
        System.out.println("2 - Register Material");
        System.out.println("3 - Register Input Note");
        System.out.print("- Here: ");
        int decision = read.nextInt();
        read.nextLine();

        return decision;
    }

    public String setName(){

        System.out.println("======================================================");
        System.out.println("               Put Supplier's name here               ");
        System.out.println("------------------------------------------------------");
        System.out.print("- Here: ");
        String supplierName = read.nextLine();

        return supplierName;
    }

    public String setCnpj(){

        System.out.println("======================================================");
        System.out.println("               Put Supplier's CPNJ here               ");
        System.out.println("------------------------------------------------------");
        System.out.print("- Here: ");
        String supplierCnpj = read.nextLine();

        return supplierCnpj;
    }
    public void errorCnpj(){

        System.err.println("======================================================");
        System.err.println("            Supplier's CNPJ already exists            ");
        System.err.println("------------------------------------------------------");
    }
    public void supplierRegistered(){

        System.out.println("======================================================");
        System.out.println("            Supplier's CNPJ Was Registered            ");
        System.out.println("------------------------------------------------------");
    }
    public void supplierCnpjEmpty(){

        System.err.println("======================================================");
        System.err.println("            Supplier's CNPJ is Empty            ");
        System.err.println("------------------------------------------------------");
    }
    public void supplierNameEmpty(){

        System.err.println("======================================================");
        System.err.println("            Supplier's Name is Empty            ");
        System.err.println("------------------------------------------------------");
    }
    public String setNameMaterial(){

        System.out.println("======================================================");
        System.out.println("               Put Material's name here               ");
        System.out.println("------------------------------------------------------");
        System.out.print("- Here: ");
        String materialName = read.nextLine();

        return materialName;
    }
    public String setUnitMaterial(){

        System.out.println("======================================================");
        System.out.println("               Put Material's unit here               ");
        System.out.println("------------------------------------------------------");
        System.out.print("- Here: ");
        String materialUnit = read.nextLine();

        return materialUnit;
    }
    public double setQuantityMaterial(){

        System.out.println("======================================================");
        System.out.println("             Put Material's quantity here             ");
        System.out.println("------------------------------------------------------");
        System.out.print("- Here: ");
        double materialQuantity = read.nextDouble();
        read.nextLine();

        return materialQuantity;
    }
    public void materialNameEmpty(){

        System.err.println("======================================================");
        System.err.println("               Material's Name is Empty               ");
        System.err.println("------------------------------------------------------");
    }
    public void materialAlreadyExist(){

        System.err.println("======================================================");
        System.err.println("            Material's name already exist             ");
        System.err.println("------------------------------------------------------");
    }
    public void materialRegistered(){

        System.out.println("======================================================");
        System.out.println("                Material Registered                   ");
        System.out.println("------------------------------------------------------");
    }
    public void materialNegativeQuantity(){

        System.err.println("======================================================");
        System.err.println("             The quantity is negative                 ");
        System.err.print("------------------------------------------------------");
    }
    public void

}
