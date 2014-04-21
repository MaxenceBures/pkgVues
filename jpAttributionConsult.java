/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVues;

import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Transaction;
import pkgEntites.Attribution;
import pkgEntites.Etablissement;
import pkgEntites.Groupe;
import pkgEntites.Offre;
import pkgEntites.Typechambre;

/**
 *
 * @author Chloé
 */
public class jpAttributionConsult extends javax.swing.JPanel {

    private boolean bCharge = false;
    private boolean bCharge2 = false;
    private String sEtablissementId = "";
    private String sGroupeId = "";
    private String sTypeChambre = "";
    private String sOffre = "" ;

    /**
     * Creates new form jpAttributionConsult
     */
    public jpAttributionConsult() {
        initComponents();
        jtxtEtabRecap.disable();
        jtxtGroupeRecap.disable();
        jtxtTypeChambreRecap.disable();
        jtxtQuantiteLibre.disable();
        jlblAttribution.setText("<html>Sélectionner en premier un établissement,<br/> puis un groupe</html>");
    }

     public void viderChamps() {
        jtxtEtabRecap.setText("");
        jtxtGroupeRecap.setText("");
        jtxtTypeChambreRecap.setText("");
        jtxtQuantiteLibre.setText("");
        jtxtQuantite.setText("");
    }
    
    public void chargeListeEtablissement() {
        String sReq = "FROM Etablissement ORDER BY Eta_id ASC";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        jcmbEtablissement.removeAllItems();
        Iterator eta = q.iterate();
        while (eta.hasNext()) {
            Etablissement unEtablissement = (Etablissement) eta.next();
            jcmbEtablissement.addItem(unEtablissement.getEtaNom());
        }
        bCharge = true;
    }

    public void chargeListeGroupe() {
        String sReq2 = "FROM Groupe ORDER BY Gp_id ASC ";
        Query q2 = jfPrincipal.getSession().createQuery(sReq2);
        jcmbGroupe.removeAllItems();
        Iterator grp = q2.iterate();
        while (grp.hasNext()) {
            Groupe unGroupe = (Groupe) grp.next();
            jcmbGroupe.addItem(unGroupe.getGpNom());
        }
        bCharge2 = true;
    }

   
           
   
    
    private void chargerEtablissement(String sEtablissement){
        String sReq = "From Etablissement Where Eta_Nom = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, sEtablissement);
        Etablissement unEtablissement = (Etablissement) q.uniqueResult();
        jtxtEtabRecap.setText(unEtablissement.getEtaNom());
    }
    
    private void chargerGroupe(String sGroupe){
        String sReq = "From Groupe Where Gp_Nom = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, sGroupe);
        Groupe unGroupe = (Groupe) q.uniqueResult();
        jtxtGroupeRecap.setText(unGroupe.getGpNom());
    }
    
    private void chargerChambre(String sChambre){
        String sReq = "From Typechambre Where Tch_Id = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, sChambre);
        Typechambre unTypechambre = (Typechambre) q.uniqueResult();
        jtxtTypeChambreRecap.setText(unTypechambre.getTchLibelle());
    }
    
     private void chargerQuantite(String sEtablissement, String sTypeChambre){
        int value = 0;
        String sReq = "From Offre Where OFF_ETABLISSEMENT = '"+sEtablissement+"' AND OFF_TYPECHAMBRE = '"+sTypeChambre+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        String sReq2 = "From Attribution Where ATT_ETABLISSEMENT = '"+sEtablissement+"' AND ATT_TYPECHAMBRE = '"+sTypeChambre+"'";
        Query q2 = jfPrincipal.getSession().createQuery(sReq2);
        Offre unOffre = (Offre) q.uniqueResult();
      
         Iterator att = q2.iterate();
        while(att.hasNext()) {
                Attribution unAttribution2 = (Attribution) att.next();
               value += unAttribution2.getAttNbchambres();
                }   
        
        int result = unOffre.getOffNbchambres() - value;
        jtxtQuantiteLibre.setText(String.valueOf(result));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblEtablissement = new javax.swing.JLabel();
        jlblGroupe = new javax.swing.JLabel();
        jcmbEtablissement = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblAttribution = new javax.swing.JTable();
        jlblQuantite = new javax.swing.JLabel();
        jtxtQuantite = new javax.swing.JTextField();
        jbtModifier = new javax.swing.JButton();
        jcmbGroupe = new javax.swing.JComboBox();
        jlblRecap = new javax.swing.JLabel();
        jlblEtabRecap = new javax.swing.JLabel();
        jlblGroupeRecap = new javax.swing.JLabel();
        jlblTypeChambreRecap = new javax.swing.JLabel();
        jtxtEtabRecap = new javax.swing.JTextField();
        jtxtGroupeRecap = new javax.swing.JTextField();
        jtxtTypeChambreRecap = new javax.swing.JTextField();
        jlblAttribution = new javax.swing.JLabel();
        jlblQuantiteLibre = new javax.swing.JLabel();
        jtxtQuantiteLibre = new javax.swing.JTextField();
        jlbltest = new javax.swing.JLabel();

        jlblEtablissement.setText("Etablissement");

        jlblGroupe.setText("Groupe");

        jcmbEtablissement.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbEtablissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEtablissementActionPerformed(evt);
            }
        });

        jTblAttribution.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Type Chambre", "Quantité Prise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblAttribution.getTableHeader().setReorderingAllowed(false);
        jTblAttribution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblAttributionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblAttribution);
        if (jTblAttribution.getColumnModel().getColumnCount() > 0) {
            jTblAttribution.getColumnModel().getColumn(0).setResizable(false);
            jTblAttribution.getColumnModel().getColumn(1).setResizable(false);
        }

        jlblQuantite.setText("Quantité Demandée");

        jbtModifier.setText("Modifier");
        jbtModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModifierActionPerformed(evt);
            }
        });

        jcmbGroupe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbGroupeActionPerformed(evt);
            }
        });

        jlblRecap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblRecap.setText("Récapitulatif");

        jlblEtabRecap.setText("Etablissement");

        jlblGroupeRecap.setText("Groupe");

        jlblTypeChambreRecap.setText("Type Chambre");

        jlblAttribution.setText("Selectionner en premier un etablissement, puis un groupe");

        jlblQuantiteLibre.setText("Quantité Libre");

        jlbltest.setText("Groupe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlblAttribution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblEtablissement)
                    .addComponent(jlblGroupe))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcmbEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jlbltest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtModifier)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlblGroupeRecap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblEtabRecap)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtEtabRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jlblTypeChambreRecap))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtGroupeRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jlblQuantite)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtTypeChambreRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblQuantiteLibre)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtQuantiteLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblRecap))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblEtablissement)
                            .addComponent(jcmbEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblGroupe)
                            .addComponent(jcmbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlblAttribution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblRecap)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEtabRecap)
                    .addComponent(jtxtEtabRecap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTypeChambreRecap)
                    .addComponent(jtxtTypeChambreRecap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblQuantiteLibre)
                    .addComponent(jtxtQuantiteLibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtModifier)
                            .addComponent(jlbltest))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblGroupeRecap)
                            .addComponent(jtxtGroupeRecap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblQuantite)
                            .addComponent(jtxtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbEtablissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEtablissementActionPerformed
        if (bCharge) {
            viderChamps();
            String sReq = "FROM Etablissement WHERE Eta_Nom = ?";
            Query q = jfPrincipal.getSession().createQuery(sReq);
            q.setParameter(0, jcmbEtablissement.getSelectedItem().toString());
            Etablissement unEtablissement = (Etablissement) q.uniqueResult();
            sEtablissementId = unEtablissement.getEtaId();
        }
    }//GEN-LAST:event_jcmbEtablissementActionPerformed

    private void jTblAttributionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblAttributionMouseClicked
        int ligne = jTblAttribution.getSelectedRow();
        Object celluleQuantite = jTblAttribution.getValueAt(ligne, 1);
        Object celluleType = jTblAttribution.getValueAt(ligne, 0);
        sTypeChambre = celluleType.toString();
        jtxtQuantite.setText(celluleQuantite.toString());
        chargerEtablissement(jcmbEtablissement.getSelectedItem().toString());
        chargerGroupe(jcmbGroupe.getSelectedItem().toString());
        chargerChambre(celluleType.toString());
        chargerQuantite(sEtablissementId, sTypeChambre);
    }//GEN-LAST:event_jTblAttributionMouseClicked

    private void jcmbGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbGroupeActionPerformed
        if (bCharge2) {
            viderChamps();
            String sReq = "FROM Groupe WHERE Gp_Nom = ?";
            Query q = jfPrincipal.getSession().createQuery(sReq);
            q.setParameter(0, jcmbGroupe.getSelectedItem());
            Groupe unGroupe = (Groupe) q.uniqueResult();
            sGroupeId = unGroupe.getGpId();
            chargeTable();  
            //test();
        }
    }//GEN-LAST:event_jcmbGroupeActionPerformed

    private void jbtModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModifierActionPerformed
        String sReq = "FROM Attribution WHERE Att_Etablissement = '"+sEtablissementId+"' AND Att_Groupe = '"+sGroupeId+"' AND Att_Typechambre = '"+sTypeChambre+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        Attribution unAttribution = (Attribution) q.uniqueResult();
        unAttribution.setAttNbchambres(Byte.parseByte(jtxtQuantite.getText()));
        Transaction tx = jfPrincipal.getSession().beginTransaction();
        tx.commit();
        jfPrincipal.getSession().update (unAttribution);
        chargeTable();
    }//GEN-LAST:event_jbtModifierActionPerformed
 private void chargeTable(){
        int nbligne;
        int i;
        nbligne = jTblAttribution.getRowCount();
        if(nbligne >= 0)
            {
            for(i=0;i <nbligne; i++) {
                ((DefaultTableModel)jTblAttribution.getModel()).removeRow(0);
            }    
        String sReq = "FROM Attribution WHERE ATT_GROUPE = '"+sGroupeId+"' AND ATT_ETABLISSEMENT = '"+sEtablissementId+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
      // Attribution unAttribution = (Attribution) q.uniqueResult();
       if(q.list().size() == 0){
           jlbltest.setText("0");
       }
       else{

           jlbltest.setText("2");
           Iterator att = q.iterate();
           while(att.hasNext()) {
                Attribution unAttribution = (Attribution) att.next();
                ((DefaultTableModel) jTblAttribution.getModel()).addRow(new Object[] {unAttribution.getId().getAttTypechambre(), unAttribution.getAttNbchambres()});
       
                             }
            }
            }
    }
       /* Iterator att = q.iterate();
        while(att.hasNext()) {
                Attribution unAttribution = (Attribution) att.next();
                ((DefaultTableModel) jTblAttribution.getModel()).addRow(new Object[] {unAttribution.getId().getAttTypechambre(), unAttribution.getAttNbchambres()});

        }   */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblAttribution;
    private javax.swing.JButton jbtModifier;
    private javax.swing.JComboBox jcmbEtablissement;
    private javax.swing.JComboBox jcmbGroupe;
    private javax.swing.JLabel jlblAttribution;
    private javax.swing.JLabel jlblEtabRecap;
    private javax.swing.JLabel jlblEtablissement;
    private javax.swing.JLabel jlblGroupe;
    private javax.swing.JLabel jlblGroupeRecap;
    private javax.swing.JLabel jlblQuantite;
    private javax.swing.JLabel jlblQuantiteLibre;
    private javax.swing.JLabel jlblRecap;
    private javax.swing.JLabel jlblTypeChambreRecap;
    private javax.swing.JLabel jlbltest;
    private javax.swing.JTextField jtxtEtabRecap;
    private javax.swing.JTextField jtxtGroupeRecap;
    private javax.swing.JTextField jtxtQuantite;
    private javax.swing.JTextField jtxtQuantiteLibre;
    private javax.swing.JTextField jtxtTypeChambreRecap;
    // End of variables declaration//GEN-END:variables
}
