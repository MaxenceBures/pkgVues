/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVues;

import org.hibernate.Transaction;
import pkgEntites.Etablissement;



/**
 *
 * @author Maxence
 */
public class jpEtablissementAjout extends javax.swing.JPanel {

    Byte bType = 3;
    String session;
   
            //Chargement des listes deroulantes
    public jpEtablissementAjout() {
        initComponents();
        jcbccivil.removeAllItems();
        jcbctype.removeAllItems();
        jcbccivil.addItem("Monsieur");
        jcbccivil.addItem("Madame");
        jcbctype.addItem("Ecole Publique");
        jcbctype.addItem("Ecole Privée");
        jcbctype.addItem("Autres");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblid = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        lbladresse = new javax.swing.JLabel();
        jtxtadresse = new javax.swing.JTextField();
        lblcp = new javax.swing.JLabel();
        jtxtcp = new javax.swing.JTextField();
        lblville = new javax.swing.JLabel();
        jtxtville = new javax.swing.JTextField();
        lbltelephone = new javax.swing.JLabel();
        jtxttelephone = new javax.swing.JTextField();
        lblmail = new javax.swing.JLabel();
        jtxtmail = new javax.swing.JTextField();
        lbltype = new javax.swing.JLabel();
        lblresponsable = new javax.swing.JLabel();
        jbtAjout = new javax.swing.JButton();
        lblrespnom = new javax.swing.JLabel();
        jtxtrespnom = new javax.swing.JTextField();
        lblrespprenom = new javax.swing.JLabel();
        jtxtrespprenom = new javax.swing.JTextField();
        lblnom = new javax.swing.JLabel();
        jtxtnom = new javax.swing.JTextField();
        jcbccivil = new javax.swing.JComboBox();
        lblrespnom1 = new javax.swing.JLabel();
        jcbctype = new javax.swing.JComboBox();
        lbletablissement = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 600));

        lblid.setText("Id");

        lbladresse.setText("Adresse");

        lblcp.setText("Code Postal");

        lblville.setText("Ville");

        lbltelephone.setText("Telephone");

        lblmail.setText("Mail");

        lbltype.setText("Type");

        lblresponsable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblresponsable.setText("Responsable");

        jbtAjout.setText("Ajouter");
        jbtAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAjoutActionPerformed(evt);
            }
        });

        lblrespnom.setText("Nom");

        lblrespprenom.setText("Prenom");

        lblnom.setText("Nom");

        jcbccivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblrespnom1.setText("Civilité");

        jcbctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbletablissement.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbletablissement.setText("Etablissement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblid)
                                    .addComponent(lbladresse))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(lblnom)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtxtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbltelephone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblcp)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtcp, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addComponent(lblville)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtville, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbletablissement, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbltype)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblmail)
                                    .addComponent(jcbctype, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jtxtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblresponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblrespnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblrespnom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtrespnom, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblrespprenom)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtxtrespprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbtAjout)
                                                .addGap(78, 78, 78))))
                                    .addComponent(jcbccivil, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(79, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbletablissement, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblnom))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblid)
                        .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladresse)
                    .addComponent(jtxtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcp)
                    .addComponent(jtxtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblville)
                    .addComponent(jtxtville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelephone)
                    .addComponent(jtxttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmail)
                    .addComponent(jtxtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltype))
                .addGap(18, 18, 18)
                .addComponent(lblresponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbccivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrespnom1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrespnom)
                    .addComponent(jtxtrespnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrespprenom)
                    .addComponent(jtxtrespprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtAjout)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        //Recuperation des inputs dans l'objet unNouveauetablissement de type Etalissement / Ajout de cette objet dans la bdd.
    private void jbtAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAjoutActionPerformed
    Etablissement unNouveauEtablissement = new Etablissement();
    unNouveauEtablissement.setEtaId(jtxtid.getText());
    unNouveauEtablissement.setEtaNom(jtxtnom.getText());
    unNouveauEtablissement.setEtaRue(jtxtadresse.getText());
    unNouveauEtablissement.setEtaCp(jtxtcp.getText());
    unNouveauEtablissement.setEtaVille(jtxtville.getText());
    unNouveauEtablissement.setEtaTel(jtxttelephone.getText());
    unNouveauEtablissement.setEtaMail(jtxtmail.getText());
   
   if(jcbctype.getSelectedItem().toString() == "Ecole Publique")
    {
        bType = 0;
    }
   else if(jcbctype.getSelectedItem().toString() == "Ecole Privée")
    {
        bType = 1;
    }
   else if(jcbctype.getSelectedItem().toString() == "Autres")
    {
        bType = 2;
    }
   unNouveauEtablissement.setEtaType(bType);
   unNouveauEtablissement.setEtaNomresp(jtxtrespnom.getText());
   unNouveauEtablissement.setEtaPrenomresp(jtxtrespprenom.getText());
   unNouveauEtablissement.setEtaCivilresp(jcbccivil.getSelectedItem().toString());
   Transaction tx = jfPrincipal.getSession().beginTransaction();
   jfPrincipal.getSession().save(unNouveauEtablissement);
   tx.commit();
  
      
    }//GEN-LAST:event_jbtAjoutActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAjout;
    private javax.swing.JComboBox jcbccivil;
    private javax.swing.JComboBox jcbctype;
    private javax.swing.JTextField jtxtadresse;
    private javax.swing.JTextField jtxtcp;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtmail;
    private javax.swing.JTextField jtxtnom;
    private javax.swing.JTextField jtxtrespnom;
    private javax.swing.JTextField jtxtrespprenom;
    private javax.swing.JTextField jtxttelephone;
    private javax.swing.JTextField jtxtville;
    private javax.swing.JLabel lbladresse;
    private javax.swing.JLabel lblcp;
    private javax.swing.JLabel lbletablissement;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmail;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lblrespnom;
    private javax.swing.JLabel lblrespnom1;
    private javax.swing.JLabel lblresponsable;
    private javax.swing.JLabel lblrespprenom;
    private javax.swing.JLabel lbltelephone;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblville;
    // End of variables declaration//GEN-END:variables
}
