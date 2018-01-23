
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IceCreamTruckSim extends javax.swing.JFrame {

    int money; //set up a money variable
    //set images
    ImageIcon image = new ImageIcon(getClass().getResource("Cone.png"));
    ImageIcon cho = new ImageIcon(getClass().getResource("Chocolate.png"));
    ImageIcon van = new ImageIcon(getClass().getResource("Vinilla.png"));
    ImageIcon str = new ImageIcon(getClass().getResource("Strawberry.png"));
    Customer c; //declare a customer
    LinkedQueue line; //have a queue to set up a line of customers
    int scp1, scp2, scp3; //have ints to keep track of labels for icecream
    int ord; //catch number assigned to the order

    public IceCreamTruckSim() {
        initComponents();
        lblcone.setIcon(image); //cone image will always stay the same
        //generate(); //make a customer
        //c = new NormalC(); //make a customer
        //ord = c.setOrder();
        line = new LinkedQueue(); //create the lineup
        //line.enqueue(c); //start with one customer
        lblcustomer.setIcon(null); //set the customer's image
        money = 50; //start with $50
        lblmoney.setText("" + money);
        btnserve.setEnabled(false); //can't serve anyone yet
    }

    //create a method to generate customers
    public void generate() {
        int r = (int) (Math.random() * 7) + 1; //random number to generate between normal customers and robbers
        if (r < 6) {
            c = new NormalC();
            c.setPay(4); //set pay to $4
            c.setTip(); //generate a random tip amount
        } else {
            c = new Robber();
            c.setPay();
        }
        ord = c.setOrder(); //give the customer a random order
        c.setComment();
        line.enqueue(c); //put customer in line
        lblcustomer.setIcon(c.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoop2 = new javax.swing.JLabel();
        scoop1 = new javax.swing.JLabel();
        scoop3 = new javax.swing.JLabel();
        lblcone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmsg = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnstr = new javax.swing.JButton();
        btncho = new javax.swing.JButton();
        btnvan = new javax.swing.JButton();
        btnserve = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        lbltitle = new javax.swing.JLabel();
        lblcustomer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scoop2.setBackground(new java.awt.Color(255, 255, 255));
        scoop2.setOpaque(true);

        scoop1.setBackground(new java.awt.Color(255, 255, 255));
        scoop1.setOpaque(true);

        scoop3.setBackground(new java.awt.Color(255, 255, 255));
        scoop3.setOpaque(true);

        txtmsg.setEditable(false);
        txtmsg.setColumns(20);
        txtmsg.setRows(5);
        jScrollPane1.setViewportView(txtmsg);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnstr.setText("Strawberry");
        btnstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstrActionPerformed(evt);
            }
        });

        btncho.setText("Chocolate");
        btncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchoActionPerformed(evt);
            }
        });

        btnvan.setText("Vanilla");
        btnvan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnstr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstr)
                    .addComponent(btncho)
                    .addComponent(btnvan))
                .addContainerGap())
        );

        btnserve.setText("Serve Customer");
        btnserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserveActionPerformed(evt);
            }
        });

        btnnext.setText("Next Customer");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Ice Cream Truck Simulator (Don't Serve Robbers!)");
        lbltitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblcustomer.setBackground(new java.awt.Color(255, 255, 255));
        lblcustomer.setOpaque(true);

        jLabel1.setText("Money: ");

        jMenu1.setText("File");

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scoop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scoop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblcone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scoop3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnserve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnnext))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoop3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoop2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoop1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnserve)
                            .addComponent(btnnext))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblmoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        generate();
        txtmsg.setText(c.getOrder());
        scoop1.setIcon(null);
        scoop2.setIcon(null);
        scoop3.setIcon(null);
        btnserve.setEnabled(true);
        c = (Customer) line.dequeue();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserveActionPerformed
        int served = scp3 + scp2*10 + scp1*100; //use this variable to see what was served
        if(served == ord){
            int p = c.getPay();
            int t = c.getTip();
            money += p + t;
            txtmsg.setText(c.getComment());
        }
        else{
            txtmsg.setText("You messed up the order.");
        }
        lblcustomer.setIcon(null);
        scoop1.setIcon(null);
        scoop2.setIcon(null);
        scoop3.setIcon(null);
        lblmoney.setText("" + money);
        //reset scp values for the next customer
        scp1 = 0;
        scp2 = 0;
        scp3 = 0;
        //create a lose condition
        if(money<0){
            JOptionPane.showMessageDialog(this, "You fell into debt and was forced to declare bankruptcy");
            System.exit(0);
        }
    }//GEN-LAST:event_btnserveActionPerformed

    private void btnvanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvanActionPerformed
        if (scoop1.getIcon() == null) {
            scoop1.setIcon(van);
            scp1 = 2;
        } else if (scoop2.getIcon() == null) {
            scoop2.setIcon(van);
            scp2 = 2;
        } else if (scoop3.getIcon() == null) {
            scoop3.setIcon(van);
            scp3 = 2;
        } else {
            JOptionPane.showMessageDialog(this, "Error - no more scoops available.");
        }
    }//GEN-LAST:event_btnvanActionPerformed

    private void btnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchoActionPerformed
        if (scoop1.getIcon() == null) {
            scoop1.setIcon(cho);
            scp1 = 1;
        } else if (scoop2.getIcon() == null) {
            scoop2.setIcon(cho);
            scp2 = 1;
        } else if (scoop3.getIcon() == null) {
            scoop3.setIcon(cho);
            scp3 = 1;
        } else {
            JOptionPane.showMessageDialog(this, "Error - no more scoops available.");
        }
    }//GEN-LAST:event_btnchoActionPerformed

    private void btnstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstrActionPerformed
        if (scoop1.getIcon() == null) {
            scoop1.setIcon(str);
            scp1 = 3;
        } else if (scoop2.getIcon() == null) {
            scoop2.setIcon(str);
            scp2 = 3;
        } else if (scoop3.getIcon() == null) {
            scoop3.setIcon(str);
            scp3 = 3;
        } else {
            JOptionPane.showMessageDialog(this, "Error - no more scoops available.");
        }
    }//GEN-LAST:event_btnstrActionPerformed

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
            java.util.logging.Logger.getLogger(IceCreamTruckSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IceCreamTruckSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IceCreamTruckSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IceCreamTruckSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IceCreamTruckSim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncho;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnserve;
    private javax.swing.JButton btnstr;
    private javax.swing.JButton btnvan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcone;
    private javax.swing.JLabel lblcustomer;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JLabel scoop1;
    private javax.swing.JLabel scoop2;
    private javax.swing.JLabel scoop3;
    private javax.swing.JTextArea txtmsg;
    // End of variables declaration//GEN-END:variables
}
