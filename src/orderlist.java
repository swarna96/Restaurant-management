
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class orderlist extends javax.swing.JFrame {
   String option;
   String uname;
    /**
     * Creates new form orderlist
     */
    public orderlist() {
        initComponents();
    }
     public orderlist(String uname,String s1) {
        initComponents();
        this.option=s1;
        this.uname=uname;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        update = new javax.swing.JButton();
        order_si_no = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        item_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Customer_ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Waiter_ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Chef_ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1850, 1050));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order_SI_NO", "Item_Name", "Quantity", "Customer_ID", "Waiter_ID", "Chef_ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        update.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        order_si_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_si_noActionPerformed(evt);
            }
        });

        jLabel1.setText("Order-SI_NO");

        jLabel2.setText("Item_Name");

        jLabel3.setText("Quantity");

        jLabel4.setText("Status");

        Customer_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_IDActionPerformed(evt);
            }
        });

        jLabel5.setText("Customer_ID");

        jLabel6.setText("Waiter_ID");

        jLabel7.setText("Chef_ID");

        show.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        show.setText("SHOW");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1850, 100));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_377642.png"))); // NOI18N
        jLabel8.setText("Order List");

        back.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        back.setText("HOME");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 781, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(606, 606, 606))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(order_si_no, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(item_name)
                            .addComponent(quantity)
                            .addComponent(Customer_ID)
                            .addComponent(Waiter_ID)
                            .addComponent(Chef_ID)
                            .addComponent(status))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(update)
                                .addGap(263, 263, 263)
                                .addComponent(show))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(order_si_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(item_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Customer_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Waiter_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Chef_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(update)
                    .addComponent(show))
                .addContainerGap(433, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manager","manager");
             int row=jTable1.getSelectedRow();
             String value=(jTable1.getModel().getValueAt(row,0).toString());
             PreparedStatement ps=conn.prepareStatement("update orders set order_SI_No=?,Item_Name=?,Quantity=?,Customer_ID=?,Waiter_ID=?,Chef_ID=?,status=? where Order_SI_No="+value);
             String s1=order_si_no.getText();
       String s2=item_name.getText();
       String s3=quantity.getText();
       String s4=Customer_ID.getText();
        String s5=Waiter_ID.getText();
         String s6=Chef_ID.getText();
          String s7=status.getText();
        ps.setString(1,s1);
        ps.setString(2,s2);
        ps.setString(3,s3);
        ps.setString(4,s4);
        ps.setString(5,s5);
        ps.setString(6,s6);
        ps.setString(7,s7);
        ps.executeUpdate();
        Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select Order_SI_No,Item_Name,Quantity,Customer_ID,Waiter_ID,Chef_ID,Status from Orders");
            while(jTable1.getRowCount()>0)
            {
                ((DefaultTableModel)jTable1.getModel()).removeRow(0);
                
            }
            int col=rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                Object [] rows=new Object[col];
                for(int i=1;i<=col;i++)
                {
                    rows[i-1]=rs.getObject(i);
                }
                ((DefaultTableModel)jTable1.getModel()).insertRow(rs.getRow()-1,rows);
            }
        conn.close();
        ps.close();
          }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void Customer_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Customer_IDActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manager","manager");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select*from orders ");
            while(jTable1.getRowCount()>0)
            {
                ((DefaultTableModel)jTable1.getModel()).removeRow(0);
                
            }
            int col=rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                Object [] rows=new Object[col];
                for(int i=1;i<=col;i++)
                {
                    rows[i-1]=rs.getObject(i);
                }
                ((DefaultTableModel)jTable1.getModel()).insertRow(rs.getRow()-1,rows);
            }
            rs.close();
            st.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
                                    

                                            
        
    }//GEN-LAST:event_showActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manager","manager");
              int i=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
       String value=(model.getValueAt(i,0).toString());
         PreparedStatement ps=conn.prepareStatement("select * from orders where Order_SI_No="+value);
        
         ResultSet rs=ps.executeQuery();
         if(rs.next())
         {
             String setid=rs.getString("Order_SI_No");
             order_si_no.setText(setid);
             String setname=rs.getString("Item_Name");
            
             item_name.setText(setname);
             String setquantity=rs.getString("Quantity");
            quantity.setText(setquantity);
             String setcustomerid=rs.getString("Customer_ID");
             Customer_ID.setText(setcustomerid);
              String setwaiterid=rs.getString("Waiter_ID");
             Waiter_ID.setText(setwaiterid);
              String setchefid=rs.getString("Chef_ID");
             Chef_ID.setText(setchefid);
              String stat=rs.getString("status");
             status.setText(stat);
         }
          }
          
          catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void order_si_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_si_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_si_noActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if (option=="Manager")
         
        { Manager_homepage mh=new Manager_homepage(uname,option);
         mh.setVisible(true);
         System.out.println(""+option);
       orderlist or=new orderlist(uname,option);
       or.setVisible(false);
        dispose();
        }
        else if(option=="Chef"){
        Chef_homepage mh=new Chef_homepage(uname,option);
         mh.setVisible(true);
         System.out.println(""+option);
       orderlist or=new orderlist(uname,option);
       or.setVisible(false);
        dispose();
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Chef_ID;
    private javax.swing.JTextField Customer_ID;
    private javax.swing.JTextField Waiter_ID;
    private javax.swing.JButton back;
    private javax.swing.JTextField item_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField order_si_no;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton show;
    private javax.swing.JTextField status;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
