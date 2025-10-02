package org.example.model;

import java.util.Date;

public class InputNode {

    private int id;
    private int idFornecedor;
    private Date Inputdate;

    public InputNode(int id, int idFornecedor, Date inputdate) {
        this.id = id;
        this.idFornecedor = idFornecedor;
        Inputdate = inputdate;
    }
    public InputNode(){
        this.id=0;
        this.idFornecedor=0;
        this.Inputdate=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Date getInputdate() {
        return Inputdate;
    }

    public void setInputdate(Date inputdate) {
        Inputdate = inputdate;
    }
}
