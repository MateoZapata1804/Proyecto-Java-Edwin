package com.sena.DAO;
import com.sena.conexion.Conexion;
import com.sena.models.Conductor;
import java.sql.*;
import java.util.*;

public class DAOConductor extends Conexion {

    public void createConductor(Conductor c) {
        try {
            Connection conn = this.getConexion();
            String sql = "INSERT INTO tblconductor(nombre_completo,telefono,direccion,fecha_creacion) VALUES (?,?,?,now())";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getNombreComp());
            ps.setString(2, c.getTelefono());
            ps.setString(3, c.getDireccion());
            ps.execute();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Conductor searchConductorById(int id) {
        Conductor cond = new Conductor();
        try {
            Connection conn = this.getConexion();
            String sql = "SELECT * FROM tblconductor WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                cond.setNombreComp(result.getString("nombre_completo"));
                cond.setTelefono(result.getString("telefono"));
                cond.setDireccion(result.getString("direccion"));
                cond.setFechaCreacion(result.getString("fecha_creacion"));
            } else {
                System.out.println("Conductor no encontrado en la base de datos");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return cond;
    }

    public ArrayList<Conductor> listConductors(){
        ArrayList<Conductor> conductores = new ArrayList<Conductor>();

        try {
            Connection conn = this.getConexion();
            String sql = "SELECT * FROM tblconductor";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                Conductor cond = new Conductor();
                cond.setId(result.getInt("id"));
                cond.setNombreComp(result.getString("nombre_completo"));
                cond.setTelefono(result.getString("telefono"));
                cond.setDireccion(result.getString("direccion"));
                cond.setFechaCreacion(result.getString("fecha_creacion"));
                conductores.add(cond);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return conductores;
    }

    public void deleteConductor(int id) {
        try {
            Connection conn = this.getConexion();
            String sql = "DELETE FROM tblconductor WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
