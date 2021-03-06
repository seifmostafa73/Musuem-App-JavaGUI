/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JButton;

/**
 *
 * @author bethoveen
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    public Category(int Tag) {
        initComponents();
        GUIManager.Instance().setDynamicSize(this,jPanel1);
        Backend.ArtPiecePage.Instance().setAllMonuments(Tag,ButtonParent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SUbTitle = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ButtonParent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 920));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1100, 1300));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SUbTitle.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 36)); // NOI18N
        SUbTitle.setForeground(new java.awt.Color(153, 153, 153));
        SUbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/pharaoh (1).png"))); // NOI18N
        SUbTitle.setText("Category Title");
        SUbTitle.setIconTextGap(15);
        jPanel1.add(SUbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 330, 50));

        Back.setBackground(new java.awt.Color(0, 0, 0));
        Back.setForeground(new java.awt.Color(0, 0, 0));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder/BackButton.png"))); // NOI18N
        Back.setBorder(null);
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 50, 60));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setOpaque(false);

        ButtonParent.setBackground(new java.awt.Color(204, 204, 204));
        ButtonParent.setForeground(new java.awt.Color(241, 255, 255));
        ButtonParent.setDoubleBuffered(false);
        ButtonParent.setLayout(new java.awt.GridLayout(0, 2, 15, 5));
        jScrollPane1.setViewportView(ButtonParent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 840, 680));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Signing/Rectangle 3 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 940, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        Backend.ArtPiecePage.Instance().backButtom(this, new Explore());
    }//GEN-LAST:event_BackMouseClicked


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel ButtonParent;
    private javax.swing.JLabel SUbTitle;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
