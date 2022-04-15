package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDAlimentos.modelo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author i_rom
 *
 * Cargamos la tabla de el panel principal
 *
 */
public class CargarTablaAlimentos {


    public CargarTablaAlimentos() {
    }

    public static void cargandoTabla() {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
        EntityManager em = emf.createEntityManager();
        
        modelo = new DefaultTableModel();

        modelo.addColumn("NOMBRE");
        modelo.addColumn("CALORIAS");


        TypedQuery<Alimentos> query = em.createQuery("SELECT a FROM Alimentos a", Alimentos.class);
        List<Alimentos> datos = query.getResultList(); //realización de consulta
        datos.stream().map(dato -> {
            String extraerNombre = dato.getNombre();
            int extraerCalorias = dato.getCalorias();
            Object[] extraccion = new Object[]{extraerNombre,extraerCalorias};
            return extraccion;
        }).forEachOrdered(extraccion -> {
            modelo.addRow(extraccion);
        });

        
       PanelPrincipal.tablaAlimentos.setModel(modelo);
        
        em.close();
        emf.close();

        }
    }
