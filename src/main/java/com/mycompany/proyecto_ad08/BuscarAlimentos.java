package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDAlimentos.modelo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author i_rom
 */
public class BuscarAlimentos {

    public BuscarAlimentos() {
    }

    public static void Buscar() {

        String nombreBuscar = PanelPrincipal.nombreAlimento_in.getText();
        int caloriasBuscar = (int) PanelPrincipal.caloriasAlimento_in.getValue();


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Alimentos> query = cb.createQuery(Alimentos.class);
        //Especifica la clase sobre la que se va a buscar (FROM)
        Root<Alimentos> alimentos = query.from(Alimentos.class);
        //Especifica qué se va a buscar (SELECT)

        if (nombreBuscar.isEmpty() & !PanelPrincipal.caloriasAlimento_in.getValue().equals(0)) {
            query.select(alimentos).distinct(true).where(cb.equal(alimentos.get("calorias"), caloriasBuscar));

        } else if (PanelPrincipal.caloriasAlimento_in.getValue().equals(0) & !nombreBuscar.isEmpty()) {
            query.select(alimentos).distinct(true).where(cb.equal(alimentos.get("nombre"), nombreBuscar));

        } else if(!PanelPrincipal.caloriasAlimento_in.getValue().equals(0) & !nombreBuscar.isEmpty()) {
            Predicate[] predicates = new Predicate[2];
            predicates[0] = cb.equal(alimentos.get("nombre"), nombreBuscar);
            predicates[1] = cb.equal(alimentos.get("calorias"), caloriasBuscar);
            query.select(alimentos).distinct(true).where(predicates);
        } else if (PanelPrincipal.caloriasAlimento_in.getValue().equals(0) & nombreBuscar.isEmpty()){
            query.select(alimentos);
        }

        List<Alimentos> results = em.createQuery(query).getResultList();
        System.out.println(results);

        CargarDatos(results);

        em.close();
        emf.close();

    }

    public static void CargarDatos(List<Alimentos> insertarPeliculas) {

        modelo = new DefaultTableModel();

        modelo.addColumn("NOMBRE");
        modelo.addColumn("CALORIAS");

        List<Alimentos> datos = insertarPeliculas;

        for (Alimentos dato : datos) {
            String extraerNombre = dato.getNombre();
            int extraerCalorias = dato.getCalorias();
            Object[] extraccion = new Object[]{extraerNombre, extraerCalorias};
            modelo.addRow(extraccion);
        }

        PanelPrincipal.tablaAlimentos.setModel(modelo);

    }

}
