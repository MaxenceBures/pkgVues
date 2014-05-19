/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVues;

import java.util.Iterator;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Transaction;
import pkgEntites.Attribution;
import pkgEntites.AttributionId;
import pkgEntites.Etablissement;
import pkgEntites.Groupe;
import pkgEntites.Offre;
import pkgEntites.Typechambre;

/**
 *
 * @author Maxence
 */
public class jpAttributionAjout extends javax.swing.JPanel {
    
   static Boolean bCharge = false;
   static Boolean bCharge2 = false;
    private String sEtablissementId = "";
    private String sGroupeId = "";
    private String sTypeChambreId = "";
    private String sEtablissement = "";
    private String sGroupe = "";
    private String sTypeChambre = "";
    
    /**
     * Creates new form jpAttributionAjout
     */
    public jpAttributionAjout() {
        initComponents();
        jtxtEtabRecap.disable();
        jtxtGroupeRecap.disable();
        jtxtTypeChambreRecap.disable();
        jtxtQuantiteLibre.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcmbEtablissement = new javax.swing.JComboBox();
        jLblEtablissement = new javax.swing.JLabel();
        jcmbTypeChambre = new javax.swing.JComboBox();
        jLblTypeChambre = new javax.swing.JLabel();
        jLblGroupe = new javax.swing.JLabel();
        jcmbGroupe = new javax.swing.JComboBox();
        jlblQuantiteLibre = new javax.swing.JLabel();
        jtxtGroupeRecap = new javax.swing.JTextField();
        jlblQuantite = new javax.swing.JLabel();
        jtxtTypeChambreRecap = new javax.swing.JTextField();
        jtxtQuantite = new javax.swing.JTextField();
        jbtAjouter = new javax.swing.JButton();
        jtxtQuantiteLibre = new javax.swing.JTextField();
        jlblRecap = new javax.swing.JLabel();
        jlblEtabRecap = new javax.swing.JLabel();
        jlblGroupeRecap = new javax.swing.JLabel();
        jtxtEtabRecap = new javax.swing.JTextField();
        jlblTypeChambreRecap = new javax.swing.JLabel();

        jcmbEtablissement.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbEtablissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEtablissementActionPerformed(evt);
            }
        });

        jLblEtablissement.setText("Etablissement");

        jcmbTypeChambre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbTypeChambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbTypeChambreActionPerformed(evt);
            }
        });

        jLblTypeChambre.setText("Type de Chambre");

        jLblGroupe.setText("Groupe");

        jcmbGroupe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbGroupeActionPerformed(evt);
            }
        });

        jlblQuantiteLibre.setText("Quantité Libre");

        jlblQuantite.setText("Quantité Demandée");

        jbtAjouter.setText("Ajouter");
        jbtAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAjouterActionPerformed(evt);
            }
        });

        jlblRecap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblRecap.setText("Récapitulatif");

        jlblEtabRecap.setText("Etablissement");

        jlblGroupeRecap.setText("Groupe");

        jlblTypeChambreRecap.setText("Type Chambre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblGroupe)
                        .addGap(30, 30, 30)
                        .addComponent(jcmbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblTypeChambre)
                        .addGap(30, 30, 30)
                        .addComponent(jcmbTypeChambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblEtablissement)
                        .addGap(30, 30, 30)
                        .addComponent(jcmbEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlblQuantite)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlblTypeChambreRecap)
                                        .addGap(33, 33, 33)
                                        .addComponent(jtxtTypeChambreRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jtxtGroupeRecap, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(jbtAjouter))
                    .addComponent(jlblRecap))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbEtablissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEtablissement))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbTypeChambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblTypeChambre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblGroupe))
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
                .addComponent(jbtAjouter)
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbEtablissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEtablissementActionPerformed
        if (bCharge) {
           sEtablissement = jcmbEtablissement.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jcmbEtablissementActionPerformed

    private void jcmbTypeChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbTypeChambreActionPerformed
        if (bCharge) {
            sTypeChambre = jcmbTypeChambre.getSelectedItem().toString();
            jtxtQuantiteLibre.setText("9");
            chargeId();
            
            chargerQuantite();
            if (bCharge2) {
                chargeChamps();
            }
            }
    }//GEN-LAST:event_jcmbTypeChambreActionPerformed

    private void jcmbGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbGroupeActionPerformed
        if (bCharge) {
            sGroupe = jcmbGroupe.getSelectedItem().toString();
            chargeChamps();
            bCharge2 = true;
            
        }
    }//GEN-LAST:event_jcmbGroupeActionPerformed

    private void jbtAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAjouterActionPerformed
        
         String sReqGroupe = "From Groupe Where GP_NOM = '"+sGroupe+"'";
        Query qGroupe = jfPrincipal.getSession().createQuery(sReqGroupe);
        
        
        Groupe unGroupe = (Groupe) qGroupe.uniqueResult();
        sGroupeId = unGroupe.getGpId();
        
        AttributionId unAttributionId = new AttributionId(sEtablissementId, sTypeChambreId, sGroupeId);
       /* unAttributionId.setAttEtablissement(sEtablissementId);
        unAttributionId.setAttTypechambre(sTypeChambreId);
        unAttributionId.setAttGroupe(sGroupeId); */
        
      //  String sReq = "FROM Attribution ";//WHERE Att_Etablissement = '"+sEtablissementId+"' AND Att_Groupe = '"+sGroupeId+"' AND Att_Typechambre = '"+sTypeChambreId+"'
      //  Query q = jfPrincipal.getSession().createQuery(sReq);
       // Attribution unAttribution = (Attribution) q.uniqueResult();
        Attribution unAttribution = new Attribution();
        unAttribution.setId(unAttributionId);
        unAttribution.setAttNbchambres(Byte.parseByte(jtxtQuantite.getText()));
        Transaction tx = jfPrincipal.getSession().beginTransaction();
        jfPrincipal.getSession().saveOrUpdate(unAttribution);
        tx.commit();
        //orupdate
        //chargerQuantite(sEtablissementId, sTypeChambre);
    }//GEN-LAST:event_jbtAjouterActionPerformed
     
    private void chargeChamps(){
        jtxtEtabRecap.setText(sEtablissement);
        jtxtGroupeRecap.setText(sGroupe);
        jtxtTypeChambreRecap.setText(sTypeChambre);
    }
    public void chargeListes() {
        jcmbEtablissement.removeAllItems();
        String sReqEtablissement = "FROM Etablissement ORDER BY Eta_id ASC";
        Query qEtablissement = jfPrincipal.getSession().createQuery(sReqEtablissement);
        Iterator eta = qEtablissement.iterate();
        while (eta.hasNext()) {
            Etablissement unEtablissement = (Etablissement) eta.next();
            jcmbEtablissement.addItem(unEtablissement.getEtaNom());
        }
        jcmbTypeChambre.removeAllItems();
        String sReqTypeChambre = "FROM Typechambre ORDER BY Tch_id ASC";
        Query qTypeChambre = jfPrincipal.getSession().createQuery(sReqTypeChambre);
        Iterator tpc = qTypeChambre.iterate();
        while (tpc.hasNext()) {
            Typechambre unTypechambre = (Typechambre) tpc.next();
            jcmbTypeChambre.addItem(unTypechambre.getTchLibelle());
        }
        jcmbGroupe.removeAllItems();
        String sReqGroupe = "FROM Groupe ORDER BY Gp_id ASC";
        Query qGroupe = jfPrincipal.getSession().createQuery(sReqGroupe);
        
        Iterator grp = qGroupe.iterate();
        while (grp.hasNext()) {
            Groupe unGroupe = (Groupe) grp.next();
            jcmbGroupe.addItem(unGroupe.getGpNom());
        }
        bCharge = true;
    }
    
    private void chargeId(){

        String sReqEtablissement = "From Etablissement Where ETA_NOM = ?";
        Query qEtablissement = jfPrincipal.getSession().createQuery(sReqEtablissement);
        qEtablissement.setParameter(0, sEtablissement);

        Etablissement unEtablissement = (Etablissement) qEtablissement.uniqueResult();
        sEtablissementId = unEtablissement.getEtaId();
        
        String sReqTypeChambre = "From Typechambre Where TCH_LIBELLE = ?";
        Query qTypeChambre = jfPrincipal.getSession().createQuery(sReqTypeChambre);
        qTypeChambre.setParameter(0, sTypeChambre);
        
        Typechambre unTypechambre = (Typechambre) qTypeChambre.uniqueResult();
        sTypeChambreId = unTypechambre.getTchId();
        
        String sReqGroupe = "From Groupe Where GP_NOM = ?";
        Query qGroupe = jfPrincipal.getSession().createQuery(sReqGroupe);
        qGroupe.setParameter(0, sGroupe);
        if (qGroupe.list().size() == 0) {
            System.out.println("Test ");
        }
         else{
        
        Groupe unGroupe = (Groupe) qGroupe.uniqueResult();
        sGroupeId = unGroupe.getGpId();
        }
    }
    
    private void chargerQuantite(){
        int iValue = 0;
        
         JOptionPane.showMessageDialog(null, "'"+sEtablissementId+"' \n'"+sTypeChambreId+"'");
        
        String sReq = "From Offre Where OFF_ETABLISSEMENT = '"+sEtablissementId+"' AND OFF_TYPECHAMBRE = '"+sTypeChambreId+"'";
        Query q = jfPrincipal.getSession().createQuery(sReq);
        if (q.list().size() == 0) {
            System.out.println("Test ");
        }
         else{
        String sReq2 = "From Attribution Where ATT_ETABLISSEMENT = '"+sEtablissementId+"' AND ATT_TYPECHAMBRE = '"+sTypeChambreId+"'";
        Query q2 = jfPrincipal.getSession().createQuery(sReq2);
        Offre unOffre = (Offre) q.uniqueResult();
      
         Iterator att = q2.iterate();
        while(att.hasNext()) {
                Attribution unAttribution2 = (Attribution) att.next();
               iValue += unAttribution2.getAttNbchambres();
                }   
        
        int iResult = unOffre.getOffNbchambres() - iValue;
        jtxtQuantiteLibre.setText(String.valueOf(iResult));
    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblEtablissement;
    private javax.swing.JLabel jLblGroupe;
    private javax.swing.JLabel jLblTypeChambre;
    private javax.swing.JButton jbtAjouter;
    private javax.swing.JComboBox jcmbEtablissement;
    private javax.swing.JComboBox jcmbGroupe;
    private javax.swing.JComboBox jcmbTypeChambre;
    private javax.swing.JLabel jlblEtabRecap;
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
