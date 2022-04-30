package com.mycompany.proyecto_ad08;


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

    public  static DefaultTableModel modeloAlimentos = new DefaultTableModel();
           
    public CargarTablaAlimentos() {
    }

    public static void cargandoTabla() {
        
        //Conectamos la BBDD
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
        EntityManager em = emf.createEntityManager();
        
        //Creamos un nuevo modelo para la tabla alimentos
        modeloAlimentos = new DefaultTableModel();

        modeloAlimentos.addColumn("NOMBRE");
        modeloAlimentos.addColumn("CALORIAS");


        //Seleccionamos los datos y los cargamos en el modelo
        TypedQuery<Alimentos> query = em.createQuery("SELECT a FROM Alimentos a", Alimentos.class);
        List<Alimentos> datos = query.getResultList(); //realización de consulta
        datos.stream().map(dato -> {
            String extraerNombre = dato.getNombre();
            int extraerCalorias = dato.getCalorias();
            Object[] extraccion = new Object[]{extraerNombre,extraerCalorias};
            return extraccion;
        }).forEachOrdered(extraccion -> {
            modeloAlimentos.addRow(extraccion);
        });

        //Cargamos el modelo en la tabla
       PanelAlimentos.tablaAlimentos.setModel(modeloAlimentos);
        
       //Desconectamos la base de datos
        em.close();
        emf.close();

        }
    
    
    }
