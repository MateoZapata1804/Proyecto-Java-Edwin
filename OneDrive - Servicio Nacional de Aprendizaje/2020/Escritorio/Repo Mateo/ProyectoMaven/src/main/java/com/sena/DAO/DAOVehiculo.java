package com.sena.DAO;
import com.sena.conexion.Conexion;
import com.sena.models.Vehiculo;
import java.sql.*;
import java.util.ArrayList;

public class DAOVehiculo extends Conexion {

    public void createVehiculo(Vehiculo v){
        Connection con = this.getConexion();
        String sql = "INSERT INTO Vehiculo (PLACA, MODELO, MARCA, VALORCOMERCIAL) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getMarca());
            ps.setDouble(4,v.getValorComercial());

            System.out.println(ps.toString());
            ps.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public Vehiculo consultarVehiculo(String placa) throws SQLException {
        Connection conn = this.getConexion();
        final String sql = "SELECT * FROM Vehiculo WHERE placa = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, placa);
        ResultSet result = ps.executeQuery();
        Vehiculo vhc = new Vehiculo();
        vhc.setPlaca(placa);
        vhc.setMarca(result.getString(1));
        vhc.setModelo(result.getString(2));
        vhc.setValorComercial(result.getInt(3));
        return vhc;
    }

    public ArrayList<Vehiculo> listVehiculos() throws SQLException{
        Connection conn = this.getConexion();
        final String sql = "SELECT * FROM Vehiculo";
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet result = ps.executeQuery();
        Vehiculo vhc = new Vehiculo();

        while (result.next()) {
            vhc.setId(result.getInt("id"));
            vhc.setPlaca(result.getString("placa"));
            vhc.setModelo(result.getString("modelo"));
            vhc.setMarca(result.getString("id"));
            vehiculos.add(vhc);
        }

        return vehiculos;
    }

    public void updateVehiculo(Vehiculo v){
        Connection con = this.getConexion();
        String sql = "UPDATE Vehiculo SET VALORCOMERCIAL = (?) WHERE PLACA = (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, v.getValorComercial());
            ps.setString(2, v.getPlaca());

            System.out.println(ps.toString());
            ps.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void deleteVehiculo(Vehiculo v){
        Connection con = this.getConexion();
        String sql = "DELETE FROM Vehiculo WHERE PLACA = (?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, v.getPlaca());

            System.out.println(ps.toString());
            ps.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}


