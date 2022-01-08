package principale;

import methode.Rectangle;
import methode.Simpson;
import methode.Trapeze;
import methode.erreur_rectangle;
import methode.erreur_simpson;
import methode.erreur_trapeze;

public class F_principale extends javax.swing.JFrame {
    
    Rectangle ob=new Rectangle();
    erreur_rectangle er=new erreur_rectangle();
    public F_principale() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rectangle = new javax.swing.JButton();
        trapeze = new javax.swing.JButton();
        simpson = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        partition = new javax.swing.JTextField();
        nouveau = new javax.swing.JButton();
        trapeze_text = new javax.swing.JTextField();
        simpson_text = new javax.swing.JTextField();
        rectangle_text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        erreurT_text = new javax.swing.JTextField();
        erreurS_text = new javax.swing.JTextField();
        erreurR_text = new javax.swing.JTextField();
        err_simpson = new javax.swing.JButton();
        err_trapeze = new javax.swing.JButton();
        err_rectangle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Intégration numérique ");
        setForeground(java.awt.Color.black);
        setMinimumSize(new java.awt.Dimension(100, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Intégrale"));
        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setLayout(null);

        b.setBackground(new java.awt.Color(255, 255, 0));
        b.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        b.setText("  b");
        jPanel1.add(b);
        b.setBounds(220, 140, 30, 30);

        a.setBackground(new java.awt.Color(255, 255, 51));
        a.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        a.setText("  a");
        jPanel1.add(a);
        a.setBounds(210, 210, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principale/integral.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 160, 50, 60);

        fx.setBackground(new java.awt.Color(204, 255, 255));
        fx.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        fx.setText("f(x)");
        jPanel1.add(fx);
        fx.setBounds(260, 170, 200, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("  dx");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 170, 40, 30);

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel3.setText("Nombre des partitions =");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 250, 300, 30);

        rectangle.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        rectangle.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rectangle.setText("Rectangles");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });
        jPanel1.add(rectangle);
        rectangle.setBounds(30, 310, 110, 30);

        trapeze.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        trapeze.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        trapeze.setText("Trapèzes");
        trapeze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trapezeActionPerformed(evt);
            }
        });
        jPanel1.add(trapeze);
        trapeze.setBounds(30, 360, 110, 30);

        simpson.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        simpson.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        simpson.setText("Simpson");
        simpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpsonActionPerformed(evt);
            }
        });
        jPanel1.add(simpson);
        simpson.setBounds(30, 410, 110, 30);

        exit.setBackground(new java.awt.Color(255, 0, 51));
        exit.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(590, 500, 70, 30);

        partition.setBackground(new java.awt.Color(255, 255, 0));
        partition.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        partition.setText("    n");
        jPanel1.add(partition);
        partition.setBounds(450, 250, 50, 30);

        nouveau.setBackground(new java.awt.Color(255, 0, 51));
        nouveau.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        nouveau.setText("Nouveau Intégrale");
        nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauActionPerformed(evt);
            }
        });
        jPanel1.add(nouveau);
        nouveau.setBounds(350, 500, 150, 30);

        trapeze_text.setEditable(false);
        trapeze_text.setBackground(new java.awt.Color(255, 255, 255));
        trapeze_text.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        trapeze_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trapeze_textActionPerformed(evt);
            }
        });
        jPanel1.add(trapeze_text);
        trapeze_text.setBounds(150, 360, 170, 30);

        simpson_text.setEditable(false);
        simpson_text.setBackground(new java.awt.Color(255, 255, 255));
        simpson_text.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        simpson_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpson_textActionPerformed(evt);
            }
        });
        jPanel1.add(simpson_text);
        simpson_text.setBounds(150, 410, 170, 30);

        rectangle_text.setEditable(false);
        rectangle_text.setBackground(new java.awt.Color(255, 255, 255));
        rectangle_text.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        rectangle_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangle_textActionPerformed(evt);
            }
        });
        jPanel1.add(rectangle_text);
        rectangle_text.setBounds(150, 310, 170, 30);

        jLabel4.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Calcule intégrale");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 80, 390, 50);

        erreurT_text.setEditable(false);
        erreurT_text.setBackground(new java.awt.Color(255, 255, 255));
        erreurT_text.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jPanel1.add(erreurT_text);
        erreurT_text.setBounds(460, 360, 200, 30);

        erreurS_text.setEditable(false);
        erreurS_text.setBackground(new java.awt.Color(255, 255, 255));
        erreurS_text.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        erreurS_text.setSelectedTextColor(new java.awt.Color(255, 51, 255));
        erreurS_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erreurS_textActionPerformed(evt);
            }
        });
        jPanel1.add(erreurS_text);
        erreurS_text.setBounds(460, 410, 200, 30);

        erreurR_text.setEditable(false);
        erreurR_text.setBackground(new java.awt.Color(255, 255, 255));
        erreurR_text.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jPanel1.add(erreurR_text);
        erreurR_text.setBounds(460, 310, 200, 30);

        err_simpson.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        err_simpson.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        err_simpson.setText("ErreurS");
        err_simpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                err_simpsonActionPerformed(evt);
            }
        });
        jPanel1.add(err_simpson);
        err_simpson.setBounds(370, 410, 83, 30);

        err_trapeze.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        err_trapeze.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        err_trapeze.setText("ErreurT");
        err_trapeze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                err_trapezeActionPerformed(evt);
            }
        });
        jPanel1.add(err_trapeze);
        err_trapeze.setBounds(370, 360, 83, 30);

        err_rectangle.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        err_rectangle.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        err_rectangle.setText("ErreurR");
        err_rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                err_rectangleActionPerformed(evt);
            }
        });
        jPanel1.add(err_rectangle);
        err_rectangle.setBounds(370, 310, 83, 30);

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText(" (2)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 170, 30, 30);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText(" (3)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 210, 30, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText(" (4)");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 250, 30, 30);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText(" (11)");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 500, 40, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText(" (1)");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(250, 140, 30, 30);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText(" (6)");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 360, 30, 30);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText(" (8)");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(340, 310, 30, 30);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText(" (7)");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 410, 30, 30);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText(" (12)");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(550, 500, 40, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principale/logo_fpo.jpg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(160, 0, 400, 80);

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText(" (9)");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(340, 360, 30, 30);

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText(" (10)");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(330, 410, 40, 30);

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText(" (5)");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, 310, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        String fct=fx.getText();
        String a1=a.getText();
        String b1=b.getText();
        String n=partition.getText();
        Rectangle obj=new Rectangle();
        rectangle_text.setText(obj.MethodeRectangle(a1, b1, fct, n));
        
    }//GEN-LAST:event_rectangleActionPerformed
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauActionPerformed
        trapeze_text.setText("");
        simpson_text.setText("");
        rectangle_text.setText("");
        partition.setText("");
        a.setText("");
        b.setText("");
        fx.setText("");
        erreurR_text.setText("");
        erreurT_text.setText("");
        erreurS_text.setText("");
    }//GEN-LAST:event_nouveauActionPerformed

    private void rectangle_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangle_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rectangle_textActionPerformed

    private void trapeze_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trapeze_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trapeze_textActionPerformed

    private void simpson_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpson_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpson_textActionPerformed

    private void err_rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_err_rectangleActionPerformed
        String fct=fx.getText();
        String a1=a.getText();
        String b1=b.getText();
        String n=partition.getText();
        erreur_rectangle err1=new erreur_rectangle();
        erreurR_text.setText(err1.erreurMethodeRectangle(a1, b1, fct, n));
    }//GEN-LAST:event_err_rectangleActionPerformed

    private void err_trapezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_err_trapezeActionPerformed
        String fct=fx.getText();
        String a1=a.getText();
        String b1=b.getText();
        String n=partition.getText();
        erreur_trapeze err2=new erreur_trapeze();
        erreurT_text.setText(err2.erreurMethodeTrapeze(a1, b1, fct, n));
    }//GEN-LAST:event_err_trapezeActionPerformed

    private void err_simpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_err_simpsonActionPerformed
        String fct=fx.getText();
        String a1=a.getText();
        String b1=b.getText();
        String n=partition.getText();
        erreur_simpson err3=new erreur_simpson();
        //erreurS_text.setText(err3.erreurMethodeSimpson(a1, b1, fct, n));
        
    }//GEN-LAST:event_err_simpsonActionPerformed

    private void erreurS_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erreurS_textActionPerformed
        
    }//GEN-LAST:event_erreurS_textActionPerformed

    private void trapezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trapezeActionPerformed
        String fonction=fx.getText();
        String a1=a.getText();
        String b1=b.getText();
        String n=partition.getText();
        Trapeze obj=new Trapeze();
        trapeze_text.setText(obj.MethodeTrapeze(a1, b1, fonction, n));
    }//GEN-LAST:event_trapezeActionPerformed

    private void simpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpsonActionPerformed
        // TODO add your handling code here:
        String fct=fx.getText();
        String a1=a.getText();
        String b1=b.getText();
        String n=partition.getText();
        Simpson ob=new Simpson();
        Trapeze obl=new Trapeze();
        erreur_trapeze er=new erreur_trapeze();
        float p=Float.parseFloat(er.erreurMethodeTrapeze(a1, b1, fct, n));
        float y=Float.parseFloat(ob.MethodeSimpson(a1, b1, fct, n));
        float u=Float.parseFloat(obl.MethodeTrapeze(a1, b1, fct, n));
        float s=(p+u);
        float t=y-s;
        erreurS_text.setText(""+t);
        simpson_text.setText(ob.MethodeSimpson(a1, b1, fct, n));
        
    }//GEN-LAST:event_simpsonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JButton err_rectangle;
    private javax.swing.JButton err_simpson;
    private javax.swing.JButton err_trapeze;
    private javax.swing.JTextField erreurR_text;
    private javax.swing.JTextField erreurS_text;
    private javax.swing.JTextField erreurT_text;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nouveau;
    private javax.swing.JTextField partition;
    private javax.swing.JButton rectangle;
    private javax.swing.JTextField rectangle_text;
    private javax.swing.JButton simpson;
    private javax.swing.JTextField simpson_text;
    private javax.swing.JButton trapeze;
    private javax.swing.JTextField trapeze_text;
    // End of variables declaration//GEN-END:variables
}
