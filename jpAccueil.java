/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVues;

/**
 *
 * @author Maxence
 */
public class jpAccueil extends javax.swing.JPanel {

    /**
     * Creates new form jpAccueil
     */
    public jpAccueil() {
        initComponents();
        lblPresentation.setText("<html>Cette application web permet de gérer l'hébergement des <br/>groupes de musique durant le festival Folklores du Monde</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAccueil = new javax.swing.JLabel();
        lblPresentation = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(415, 319));

        lblAccueil.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblAccueil.setText("Accueil");

        lblPresentation.setText("Cette application web permet de gérer l'hébergement des groupes de musique durant le festival Folklores du Monde.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lblAccueil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblPresentation)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblPresentation)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAccueil;
    private javax.swing.JLabel lblPresentation;
    // End of variables declaration//GEN-END:variables
}