package org.example.dao;
import org.example.database.ConnectionClass;
import org.example.model.Supplier;

import java.sql.*;

public class SupplierDao {

    public static void registerSupplier(Supplier supplier) throws SQLException{

        String query = "INSERT INTO Fornecedor (nome,cnpj) VALUES (?, ?);";

        try( Connection conn = ConnectionClass.connect();
             PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, supplier.getName());
            stmt.setString(2, supplier.getCnpj());
            stmt.executeUpdate();



        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static boolean verifyIfSupplierExist(String cnpj) throws SQLException{

        String query = "SELECT COUNT(*) FROM Fornecedor WHERE cnpj = ?;";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, cnpj);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getInt(1) > 0;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

}
