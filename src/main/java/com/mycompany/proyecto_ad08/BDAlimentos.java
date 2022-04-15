package com.mycompany.proyecto_ad08;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author i_rom
 *
 * Creamos la base de dato y la rellenamos
 *
 */
public class BDAlimentos {

    public static DefaultTableModel modelo = null;

    public BDAlimentos() {
    }

    public static void cargarBD() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos;user=acda;password=acda;drop");
        EntityManager em = emf.createEntityManager();

        //Aquí se realizan todas las acciones con la base de datos
        //se crean  objetos tipo Pelicula
        try { 
        Alimentos a1 = new Alimentos("Paella", 1500);
        Alimentos a2 = new Alimentos("Macaroones", 1200);
        Alimentos a3 = new Alimentos("Alcachofas", 500);
        Alimentos a4 = new Alimentos("Lubina", 600);
        Alimentos a5 = new Alimentos("Pollo", 750);
        Alimentos a6 = new Alimentos("Cuajada", 125);
        Alimentos a7 = new Alimentos("Garbanzos", 1600);
        Alimentos a8 = new Alimentos("Hamburguesa", 1800);
        Alimentos a9 = new Alimentos("Sopa", 300);
        Alimentos a10 = new Alimentos("Ensalda", 250);
        
        

        //Se almacena los objetos en la base de datos utilizando una transacción
        //Hemos utilizado la propiedad CascadeType.PERSIST, por lo que los ponentes también se guardarán
        em.getTransaction().begin();
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(a4);
        em.persist(a5);
        em.persist(a6);
        em.persist(a7);
        em.persist(a8);
        em.persist(a9);
        em.persist(a10);
        
        em.getTransaction().commit();
        
        } catch (Exception e) {
        }

        //PanelPrincipal.tablaPeliculas.setModel (modelo);
        // Cerrar la conexión a la base de datos
        em.close();
        emf.close();
    }
    
}
