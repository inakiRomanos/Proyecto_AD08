package com.mycompany.proyecto_ad08;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author i_rom
 */
public class InsertarAlimentos {

    public InsertarAlimentos() {
    }

    public static void insertarAli() {

        if (PanelPrincipal.nombreAlimento_in.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo NOMBRE es obligatorio");
        } else if (PanelPrincipal.caloriasAlimento_in.equals(0)) {
            JOptionPane.showMessageDialog(null, "El campo NACIONALIDAD es obligatorio");
        } else {

            String nombreNuevo = PanelPrincipal.nombreAlimento_in.getText();
            int caloriasNuevas = (int) PanelPrincipal.caloriasAlimento_in.getValue();

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
            EntityManager em = emf.createEntityManager();

            TypedQuery<Alimentos> querybis = em.createQuery("SELECT d FROM Alimentos d WHERE d.nombre = '" + PanelPrincipal.nombreAlimento_in.getText().toUpperCase() + "'", Alimentos.class);
            List<Alimentos> comprobarNombre = querybis.getResultList();
            System.out.println(comprobarNombre);

            if (!comprobarNombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El alimento introducido ya existe");

            } else {


                Alimentos nueva = new Alimentos(nombreNuevo, caloriasNuevas);

                em.getTransaction().begin();
                em.persist(nueva);
                em.getTransaction().commit();

                em.close();
                emf.close();

            }
        }

    }

}
