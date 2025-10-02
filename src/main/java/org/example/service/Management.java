package org.example.service;

import org.example.dao.MaterialDao;
import org.example.dao.SupplierDao;
import org.example.model.Material;
import org.example.model.Supplier;
import org.example.view.Attendent;

import java.sql.SQLException;
import java.util.ArrayList;

public class Management {

    ArrayList <Supplier> suplierList = new ArrayList<>();


    public void manager(Attendent attendent, int decision2) throws SQLException {

        switch (decision2){


            case 1:

                String supplierName = attendent.setName();
                String supplierCnpj = attendent.setCnpj();

                var supplier = new Supplier(supplierName, supplierCnpj);

                if (supplier.getName() == null || supplier.getName().trim().isEmpty()) {

                    attendent.supplierNameEmpty();
                    return;
                }
                if(supplier.getCnpj() == null || supplier.getCnpj().trim().isEmpty()){

                    attendent.supplierCnpjEmpty();
                    return;
                }

                boolean exist = SupplierDao.verifyIfSupplierExist(supplierCnpj);

                if(SupplierDao.verifyIfSupplierExist(supplier.getCnpj())){

                    attendent.errorCnpj();
                    return;
                }
                SupplierDao.registerSupplier(supplier);
                attendent.supplierRegistered();

                break;

            case 2:


                String materialName2 = attendent.setNameMaterial();
                String materialUnit2 = attendent.setUnitMaterial();
                double materialQuantity2 = attendent.setQuantityMaterial();

                var material = new Material(materialName2, materialUnit2, materialQuantity2);

                if(material.getName() == null || material.getName().trim().isEmpty()){

                    attendent.materialNameEmpty();
                    return;
                }

                boolean exists2 = SupplierDao.verifyIfSupplierExist(materialName2);

                if(MaterialDao.verifyIfMaterialExist(material.getName())){

                    attendent.materialAlreadyExist();
                    return;
                }
                if(material.getQuantity() < 0 ){
                    attendent.materialNegativeQuantity();
                    return;
                }
                MaterialDao.registerMaterial(material);
                attendent.materialRegistered();

                break;

            case 3:


                break;

        }

    }
}
