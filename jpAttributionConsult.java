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

    /**
     * Creates new form jpAttributionConsult
     */
    public jpAttributionConsult() {
        initComponents();

        jlblErreur.setVisible(false);
        jtxtEtabRecap.disable();
        jtxtGroupeRecap.disable();
        jtxtTypeChambreRecap.disable();
        jtxtQuantiteLibre.disable();
        jlblAttribution.setText("<html>Sélectionner en premier un établissement,<br/> puis un groupe</html>");
    }
        //Permet de reinitialiser les champs
     public void viderChamps() {
        jtxtEtabRecap.setText("");
        jtxtGroupeRecap.setText("");
        jtxtTypeChambreRecap.setText("");
        jtxtQuantiteLibre.setText("");
        jtxtQuantite.setText("");
    }
    
    
        //Charge la liste deroulante des etablissements
    public void chargeListeEtablissement() {
        jcmbEtablissement.removeAllItems();
        String sReq = "FROM Etablissement ORDER BY Eta_id ASC";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        Iterator eta = q.iterate();
        while (eta.hasNext()) {
            Etablissement unEtablissement = (Etablissement) eta.next();
            jcmbEtablissement.addItem(unEtablissement.getEtaNom());
        }
        bCharge = true;
    }
        //Charge la liste deroulante des groupes /
    public void chargeListeGroupe() {
        jcmbGroupe.removeAllItems();
        String sReq2 = "FROM Groupe ORDER BY Gp_id ASC ";
        Query q2 = jfPrincipal.getSession().createQuery(sReq2);
        Iterator grp = q2.iterate();
        while (grp.hasNext()) {
            Groupe unGroupe = (Groupe) grp.next();
            jcmbGroupe.addItem(unGroupe.getGpNom());
        }
        bCharge2 = true;
    }
          
        //Permet de recuperer le nom d'un type de chambre à partir de son identifiant
    private void chargerChambre(String sChambre){
        String sReq = "From Typechambre Where Tch_Id = ?";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        q.setParameter(0, sChambre);
        Typechambre unTypechambre = (Typechambre) q.uniqueResult();
        jtxtTypeChambreRecap.setText(unTypechambre.getTchLibelle());
    }
        //Permet d'afficher la quantite de chambre restante dans un label
     private void chargerQuantite(String sEtablissement, String sTypeChambre){
        int iValue = 0;
        String sReq = "From Offre Where OFF_ETABLISSEMENT = '"+sEtablissement+"' AND OFF_TYPECHAMBRE = '"+sTypeChambre+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        String sReq2 = "From Attribution Where ATT_ETABLISSEMENT = '"+sEtablissement+"' AND ATT_TYPECHAMBRE = '"+sTypeChambre+"'";
        Query q2 = jfPrincipal.getSession().createQuery(sReq2);
        Offre unOffre = (Offre) q.uniqueResult();
      
         Iterator att = q2.iterate();
        while(att.hasNext()) {
                Attribution unAttribution2 = (Attribution) att.next();
               iValue += unAttribution2.getAttNbchambres();
                }   
        
        int iResult = unOffre.getOffNbchambres() - iValue;
        jtxtQuantiteLibre.setText(String.valueOf(iResult));
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
        jlblErreur = new javax.swing.JLabel();

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

        jlblErreur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblErreur.setText("Aucune Reservation pour ce groupe dans cette etablissement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblAttribution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEtablissement)
                            .addComponent(jlblGroupe))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmbEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jbtModifier)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblEtabRecap)
                                    .addComponent(jlblGroupeRecap)
                                    .addComponent(jlblQuantiteLibre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtQuantiteLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtEtabRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(73, 73, 73)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblTypeChambreRecap)
                                            .addComponent(jlblQuantite))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtTypeChambreRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtGroupeRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblErreur)
                            .addComponent(jlblRecap))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblEtablissement)
                            .addComponent(jcmbEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblGroupe)
                            .addComponent(jcmbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblAttribution, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(17, 17, 17)
                .addComponent(jlblErreur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblRecap)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEtabRecap)
                    .addComponent(jtxtEtabRecap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTypeChambreRecap)
                    .addComponent(jtxtTypeChambreRecap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblGroupeRecap)
                    .addComponent(jtxtGroupeRecap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblQuantite)
                    .addComponent(jtxtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblQuantiteLibre)
                    .addComponent(jtxtQuantiteLibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jbtModifier)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents
        //Permet de recuperer l'identifiant à partir d'un nom d'etablissement
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
        //Effectue un recapitulatif dans les inputs en bas de pages
    private void jTblAttributionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblAttributionMouseClicked
        int ligne = jTblAttribution.getSelectedRow();
        Object celluleQuantite = jTblAttribution.getValueAt(ligne, 1);
        Object celluleType = jTblAttribution.getValueAt(ligne, 0);
        sTypeChambre = celluleType.toString();
        jtxtQuantite.setText(celluleQuantite.toString());
        jtxtGroupeRecap.setText(jcmbGroupe.getSelectedItem().toString());
        jtxtEtabRecap.setText(jcmbEtablissement.getSelectedItem().toString());
        //chargerEtablissement(jcmbEtablissement.getSelectedItem().toString());
        //chargerGroupe(jcmbGroupe.getSelectedItem().toString());
        chargerChambre(celluleType.toString());
        chargerQuantite(sEtablissementId, sTypeChambre);
    }//GEN-LAST:event_jTblAttributionMouseClicked
        //Permet de recuperer l'identifiant d'un groupe à partir de son nom
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
        //Permet de modifier la quantite de reservée à partir de l'etablissement, du groupe et du type de chambre
    private void jbtModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModifierActionPerformed
        String sReq = "FROM Attribution WHERE Att_Etablissement = '"+sEtablissementId+"' AND Att_Groupe = '"+sGroupeId+"' AND Att_Typechambre = '"+sTypeChambre+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
       /* q.setParameter(0, sEtablissementId);
        q.setParameter(1, sGroupeId);
        q.setParameter(2, sTypeChambre)*/
        Attribution unAttribution = (Attribution) q.uniqueResult();
        unAttribution.setAttNbchambres(Byte.parseByte(jtxtQuantite.getText()));
        Transaction tx = jfPrincipal.getSession().beginTransaction();
        jfPrincipal.getSession().update (unAttribution);
        tx.commit();
        chargeTable();
        chargerQuantite(sEtablissementId, sTypeChambre);
    }//GEN-LAST:event_jbtModifierActionPerformed
        //Permet d'afficher les reservations d'un groupe pour un etablissement dans le tableau
    private void chargeTable(){
        jlblErreur.setVisible(false);
        int iNbligne;
        int i;
        iNbligne = jTblAttribution.getRowCount();
        if(iNbligne >= 0)
            {
            for(i=0;i <iNbligne; i++) {
                ((DefaultTableModel)jTblAttribution.getModel()).removeRow(0);
            }    
        String sReq = "FROM Attribution WHERE ATT_GROUPE = '"+sGroupeId+"' AND ATT_ETABLISSEMENT = '"+sEtablissementId+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
                if (q.list().size() == 0) {
                   
                    jlblErreur.setVisible(true);
                    } 
                else {
                }
           Iterator att = q.iterate();
           while(att.hasNext()) {
                Attribution unAttribution = (Attribution) att.next();
                ((DefaultTableModel) jTblAttribution.getModel()).addRow(new Object[] {unAttribution.getId().getAttTypechambre(), unAttribution.getAttNbchambres()});
       
            }
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblAttribution;
    private javax.swing.JButton jbtModifier;
    private javax.swing.JComboBox jcmbEtablissement;
    private javax.swing.JComboBox jcmbGroupe;
    private javax.swing.JLabel jlblAttribution;
    private javax.swing.JLabel jlblErreur;
    private javax.swing.JLabel jlblEtabRecap;
    private javax.swing.JLabel jlblEtablissement;
    private javax.swing.JLabel jlblGroupe;
    private javax.swing.JLabel jlblGroupeRecap;
    private javax.swing.JLabel jlblQuantite;
    private javax.swing.JLabel jlblQuantiteLibre;
    private javax.swing.JLabel jlblRecap;
    private javax.swing.JLabel jlblTypeChambreRecap;
    private javax.swing.JTextField jtxtEtabRecap;
    private javax.swing.JTextField jtxtGroupeRecap;
    private javax.swing.JTextField jtxtQuantite;
    private javax.swing.JTextField jtxtQuantiteLibre;
    private javax.swing.JTextField jtxtTypeChambreRecap;
    // End of variables declaration//GEN-END:variables
}
