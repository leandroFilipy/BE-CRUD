package org.example.model;

public class Supplier {

    private int id;
    private String name;
    private String cnpj;

    public Supplier(int id, String name, String cnpj){

        this.id=id;
        this.name=name;
        this.cnpj=cnpj;
    }
    public Supplier(String name, String cnpj){


        this.name=name;
        this.cnpj=cnpj;
    }
    public Supplier(){

        this.name="";
        this.cnpj="";
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }


}
