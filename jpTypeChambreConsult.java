/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVues;

import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Transaction;
import pkgEntites.Typechambre;

/**
 *
 * @author Chloé
 */
public class jpTypeChambreConsult extends javax.swing.JPanel {
//Session session = HibernateUtil.getSessionFactory().openSession();
    /**
     * Creates new form jpTypeChambreConsult
     */
    public jpTypeChambreConsult() {
        initComponents();
        jtxtid.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblconsult = new javax.swing.JLabel();
        lbltypechambre = new java.awt.Label();
        lblid = new java.awt.Label();
        lbllibelle = new java.awt.Label();
        jtxtid = new javax.swing.JTextField();
        jtxtlibelle = new javax.swing.JTextField();
        jbtnModif = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblconsult = new javax.swing.JTable();
        jbtnSuppr = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 600));

        lblconsult.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblconsult.setText("Consultation/Modification");

        lbltypechambre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbltypechambre.setText("Type chambre");

        lblid.setText("Id");

        lbllibelle.setText("Libellé");

        jtxtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtidActionPerformed(evt);
            }
        });

        jbtnModif.setText("Modifier");
        jbtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModifActionPerformed(evt);
            }
        });

        tblconsult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblconsult.getTableHeader().setReorderingAllowed(false);
        tblconsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblconsultMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblconsult);
        if (tblconsult.getColumnModel().getColumnCount() > 0) {
            tblconsult.getColumnModel().getColumn(0).setResizable(false);
            tblconsult.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblconsult.getColumnModel().getColumn(1).setResizable(false);
        }

        jbtnSuppr.setText("Supprimer");
        jbtnSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSupprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblconsult)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtlibelle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbltypechambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnModif)
                        .addGap(44, 44, 44)
                        .addComponent(jbtnSuppr)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblconsult, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(lbltypechambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbllibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtlibelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnModif)
                    .addComponent(jbtnSuppr))
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtidActionPerformed

    private void jbtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModifActionPerformed
        // TODO add your handling code here:
        String sReq = "FROM Typechambre WHERE TCh_Id = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, jtxtid.getText());
        
        Typechambre unTypeChambre = (Typechambre) q.uniqueResult();
        unTypeChambre.setTchLibelle(jtxtlibelle.getText());
        
        Transaction tx = jfPrincipal.getSession().beginTransaction();
        tx.commit();
        jfPrincipal.getSession().update(unTypeChambre);       
        //JOptionPane.showMessageDialog(null, "Type chambre modifié avec succès !");      
        chargerTable();
    }//GEN-LAST:event_jbtnModifActionPerformed

    private void tblconsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblconsultMouseClicked
        // TODO add your handling code here:
        int ligne = tblconsult.getSelectedRow();//Si tu veux la ligne selectionnée
        Object cellule = tblconsult.getValueAt(ligne,0);
        //String result = cellule.toString();

        chargerChamps(cellule);
       
    }//GEN-LAST:event_tblconsultMouseClicked

    private void jbtnSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSupprActionPerformed
        // TODO add your handling code here:
        String sReq = "FROM Typechambre WHERE TCh_Id = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, jtxtid.getText());
        
        Typechambre unTypeChambre = (Typechambre) q.uniqueResult();
        jfPrincipal.getSession().delete(unTypeChambre);
        
        Transaction tx = jfPrincipal.getSession().beginTransaction();
        tx.commit();
        jfPrincipal.getSession().update(unTypeChambre);
        //JOptionPane.showMessageDialog(null, "Type chambre supprimé avec succès !");
        chargerTable() ;
    }//GEN-LAST:event_jbtnSupprActionPerformed

    private void chargerChamps(Object cellule){
        String sReq = "FROM Typechambre WHERE TCh_Id = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, cellule);
        Typechambre unTypeChambre = (Typechambre) q.uniqueResult();
        jtxtid.setText(unTypeChambre.getTchId());
        jtxtlibelle.setText(unTypeChambre.getTchLibelle());
    }
    
    public void chargerTable(){
 
        int nbligne;
        int i;
        nbligne = tblconsult.getRowCount();
        if(nbligne > 0){
            for(i=0;i <nbligne; i++){
                ((DefaultTableModel)tblconsult.getModel()).removeRow(0);
            }
        String sReq = "From Typechambre";

        Query q = jfPrincipal.getSession().createQuery(sReq);
        Iterator tch = q.iterate();
        while(tch.hasNext()){
            Typechambre unTypeChambre = (Typechambre) tch.next();
            ((DefaultTableModel) tblconsult.getModel()).addRow(new Object[] {unTypeChambre.getTchId(), unTypeChambre.getTchLibelle()});
        }           
    }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnModif;
    private javax.swing.JButton jbtnSuppr;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtlibelle;
    private javax.swing.JLabel lblconsult;
    private java.awt.Label lblid;
    private java.awt.Label lbllibelle;
    private java.awt.Label lbltypechambre;
    private javax.swing.JTable tblconsult;
    // End of variables declaration//GEN-END:variables
}
