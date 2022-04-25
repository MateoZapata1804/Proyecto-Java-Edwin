package com.sena;
import java.sql.SQLOutput;
import java.util.*;
import com.sena.DAO.*;
import com.sena.models.*;

public class Main {

    public static void main(String[] args) {

        DAOVehiculo daoV = new DAOVehiculo();
        DAOConductor daoC = new DAOConductor();
        Scanner sc = new Scanner(System.in);
        Conductor c = new Conductor();

        //ingresando un conductor
        System.out.print("Nombre completo del conductor: ");
        c.setNombreComp(sc.nextLine());
        System.out.println("Teléfono del conductor: ");
        c.setTelefono(sc.nextLine());
        System.out.println("Dirección del conductor: ");
        c.setDireccion(sc.nextLine());

        System.out.println("Datos del conductor: ");
        System.out.print(c.getNombreComp()+" "+c.getTelefono()+" "+c.getDireccion());

        daoC.createConductor(c);
        System.out.println("\nConductor creado");

        //buscando un conductor por su ID
        System.out.println("\n<<Buscar conductor>>");
        System.out.print("Ingrese el ID del conductor: ");
        c = daoC.searchConductorById(sc.nextInt());
        System.out.println("Nombre: "+c.getNombreComp());
        System.out.println("Telefono: "+c.getTelefono());
        System.out.println("Dirección: "+c.getDireccion());
        System.out.println("Fecha de creación: "+c.getFechaCreacion());

        //listando los conductores
        ArrayList<Conductor> conductores = daoC.listConductors();
        System.out.println("\n<<<Lista de los conductores>>>");
        for (Conductor conds : conductores) {
            System.out.println("\n--ID: "+conds.getId()+"--");
            System.out.println("NOMBRE COMPLETO: "+conds.getNombreComp());
            System.out.println("TELÉFONO: "+conds.getTelefono());
            System.out.println("DIRECCIÓN: "+conds.getDireccion());
            System.out.println("FECHA DE CREACIÓN: "+conds.getFechaCreacion());
        }

        //eliminando un conductor por su ID
        System.out.print("Ingrese el ID del conductor a eliminar: ");
        daoC.deleteConductor(sc.nextInt());
    }
}











