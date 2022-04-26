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
public class InsertarQuitarAlimentos {

    public InsertarQuitarAlimentos() {
    }

    public static void insertarAli() {

        if (PanelAnadirAlimento.nombreAnadirAlimentoIn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo NOMBRE es obligatorio");
        } else if (PanelAnadirAlimento.caloriasAnadirAlimentoIn.equals(0)) {
            JOptionPane.showMessageDialog(null, "El campo CALORIAS es obligatorio");
        } else {

            String nombreNuevo = PanelAnadirAlimento.nombreAnadirAlimentoIn.getText();
            int caloriasNuevas = (int) PanelAnadirAlimento.caloriasAnadirAlimentoIn.getValue();

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
            EntityManager em = emf.createEntityManager();

            TypedQuery<Alimentos> querybis = em.createQuery("SELECT d FROM Alimentos d WHERE d.nombre = '" + PanelAnadirAlimento.nombreAnadirAlimentoIn.getText().toUpperCase() + "'", Alimentos.class);
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

    public static void QuitarAli() {
        String alimentoSeleccionado = (String) CargarTablaAlimentos.modeloAlimentos.getValueAt(PanelAlimentos.tablaAlimentos.getSelectedRow(), 0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
        EntityManager em = emf.createEntityManager();

        Alimentos a = em.find(Alimentos.class, alimentoSeleccionado);

        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();

        em.close();
        emf.close();
        
        CargarTablaAlimentos.cargandoTabla();;
    }

}
