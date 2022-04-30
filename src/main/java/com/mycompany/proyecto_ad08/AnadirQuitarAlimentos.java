package com.mycompany.proyecto_ad08;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * En esta clase podemos añadir y quitar alimentos desde el panel platos
 * 
 * @author i_rom
 */
public class AnadirQuitarAlimentos {

    public AnadirQuitarAlimentos() {
    }

    public static void insertarAli() {
                //Comprobamos que los campos de nombre y calorias tengan datos
                if (PanelAnadirAlimento.nombreAnadirAlimentoIn.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo NOMBRE es obligatorio");
                } else if (PanelAnadirAlimento.caloriasAnadirAlimentoIn.equals(0)) {
                    JOptionPane.showMessageDialog(null, "El campo CALORIAS es obligatorio");
                } else {
                    
                    //Leemos el nombre y las calorias
                    String nombreNuevo = PanelAnadirAlimento.nombreAnadirAlimentoIn.getText().toUpperCase();
                    int caloriasNuevas = (int) PanelAnadirAlimento.caloriasAnadirAlimentoIn.getValue();
                    
                    
                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
                    EntityManager em = emf.createEntityManager();
                    
                    //Comprobamos que el alimento no existe
                    TypedQuery<Alimentos> querybis = em.createQuery("SELECT d FROM Alimentos d WHERE d.nombre = '" + PanelAnadirAlimento.nombreAnadirAlimentoIn.getText().toUpperCase() + "'", Alimentos.class);
                    List<Alimentos> comprobarNombre = querybis.getResultList();
                    System.out.println(comprobarNombre);

                    if (!comprobarNombre.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El plato introducido ya existe");

                    } else {
                        
                        //Cargamos el nuevo alimento en la BBDD
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

        int reply = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminar el plato seleccionado?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/database.inakiRomanos");
            EntityManager em = emf.createEntityManager();

            Alimentos a = em.find(Alimentos.class, alimentoSeleccionado);

            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();

            em.close();
            emf.close();

            CargarTablaAlimentos.cargandoTabla();
        }
    }

}
