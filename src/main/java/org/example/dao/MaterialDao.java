package org.example.dao;
import org.example.database.ConnectionClass;
import org.example.model.Material;

import java.sql.*;

public class MaterialDao {

    public static void registerMaterial(Material material) throws SQLException{

        String query = "INSERT INTO Material (nome, unidade, estoque) VALUES (?,?,?);";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, material.getName());
            stmt.setString(2, material.getUnit());
            stmt.setDouble(3, material.getQuantity());
            stmt.executeUpdate();



        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static boolean verifyIfMaterialExist(String name) throws SQLException{

        String query = "SELECT COUNT(*) FROM Material WHERE nome = ?;";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, name);
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
