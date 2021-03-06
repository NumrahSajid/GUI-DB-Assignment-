/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimra Sajid
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Left = new javax.swing.JPanel();
        Manager = new javax.swing.JLabel();
        Add_User = new javax.swing.JButton();
        Remove_User = new javax.swing.JButton();
        Existing_Users = new javax.swing.JButton();
        Add_Bike = new javax.swing.JButton();
        Remove_Bike = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Existing_Bikes = new javax.swing.JButton();
        P_Head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Exit_Button = new javax.swing.JButton();
        P_Right = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        Search_Bikes = new javax.swing.JButton();
        Existing_Bikes_User = new javax.swing.JButton();
        Loan_Bike = new javax.swing.JButton();
        Return_Bike = new javax.swing.JButton();
        UserProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P_Left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Manager.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Manager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Manager.setText("Manager");

        Add_User.setText("Add User");
        Add_User.setToolTipText("");
        Add_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_UserActionPerformed(evt);
            }
        });

        Remove_User.setText("Remove User");
        Remove_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_UserActionPerformed(evt);
            }
        });

        Existing_Users.setText("View Existing Users");
        Existing_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Existing_UsersActionPerformed(evt);
            }
        });

        Add_Bike.setText("Add Bike");
        Add_Bike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_BikeActionPerformed(evt);
            }
        });

        Remove_Bike.setText("Remove Bike");
        Remove_Bike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_BikeActionPerformed(evt);
            }
        });

        jLabel2.setText("Bike Rental Information:");

        jLabel3.setText("User Information:");

        Existing_Bikes.setText("View Existing Bikes");
        Existing_Bikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Existing_BikesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_LeftLayout = new javax.swing.GroupLayout(P_Left);
        P_Left.setLayout(P_LeftLayout);
        P_LeftLayout.setHorizontalGroup(
            P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Manager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Remove_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Existing_Users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_Bike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Remove_Bike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(P_LeftLayout.createSequentialGroup()
                        .addGroup(P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Existing_Bikes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_LeftLayout.setVerticalGroup(
            P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manager, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Add_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remove_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Existing_Users)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Add_Bike)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remove_Bike)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Existing_Bikes)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        P_Head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bike Rental System");

        javax.swing.GroupLayout P_HeadLayout = new javax.swing.GroupLayout(P_Head);
        P_Head.setLayout(P_HeadLayout);
        P_HeadLayout.setHorizontalGroup(
            P_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_HeadLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );
        P_HeadLayout.setVerticalGroup(
            P_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_HeadLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        P_Right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        User.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        User.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User.setText("User");

        Search_Bikes.setText("Search Bikes");
        Search_Bikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BikesActionPerformed(evt);
            }
        });

        Existing_Bikes_User.setText("View Existing Bikes");
        Existing_Bikes_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Existing_Bikes_UserActionPerformed(evt);
            }
        });

        Loan_Bike.setText("Loan a Bike");
        Loan_Bike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Loan_BikeActionPerformed(evt);
            }
        });

        Return_Bike.setText("Return a Bike");
        Return_Bike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_BikeActionPerformed(evt);
            }
        });

        UserProfile.setText("UserProfile");
        UserProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_RightLayout = new javax.swing.GroupLayout(P_Right);
        P_Right.setLayout(P_RightLayout);
        P_RightLayout.setHorizontalGroup(
            P_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_Bikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Existing_Bikes_User, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(Loan_Bike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Return_Bike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_RightLayout.setVerticalGroup(
            P_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(UserProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search_Bikes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Existing_Bikes_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Loan_Bike)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Return_Bike)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exit_Button))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Existing_BikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Existing_BikesActionPerformed
        ExistingBikes Obj = new ExistingBikes();
        Obj.setVisible(true);
    }//GEN-LAST:event_Existing_BikesActionPerformed

    private void Remove_BikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_BikeActionPerformed
        DeleteBike Obj = new DeleteBike();
        Obj.setVisible(true);
    }//GEN-LAST:event_Remove_BikeActionPerformed

    private void Existing_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Existing_UsersActionPerformed

        ExistingUsers Obj = new ExistingUsers();
        Obj.setVisible(true);
        
    }//GEN-LAST:event_Existing_UsersActionPerformed

    private void Remove_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_UserActionPerformed
        DeleteUser Obj = new DeleteUser();
        Obj.setVisible(true);
    }//GEN-LAST:event_Remove_UserActionPerformed

    private void Add_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_UserActionPerformed
        AddUser Obj = new AddUser();
        Obj.setVisible(true);
    }//GEN-LAST:event_Add_UserActionPerformed

    private void Existing_Bikes_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Existing_Bikes_UserActionPerformed
        ExistingBikes Obj = new ExistingBikes();
        Obj.setVisible(true);
    }//GEN-LAST:event_Existing_Bikes_UserActionPerformed

    private void Search_BikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BikesActionPerformed
        SearchBike Obj = new SearchBike();
        Obj.setVisible(true);
    }//GEN-LAST:event_Search_BikesActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Add_BikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_BikeActionPerformed
       
      AddBike Obj = new AddBike();
      Obj.setVisible(true);
        
        
    }//GEN-LAST:event_Add_BikeActionPerformed

    private void Loan_BikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Loan_BikeActionPerformed
      
        LoanBike Obj = new LoanBike();
      Obj.setVisible(true);
        
    }//GEN-LAST:event_Loan_BikeActionPerformed

    private void Return_BikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_BikeActionPerformed
        
      ReturnBike Obj = new ReturnBike();
      Obj.setVisible(true);
        
        
    }//GEN-LAST:event_Return_BikeActionPerformed

    private void UserProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserProfileActionPerformed
        
       UserProfile Obj = new UserProfile();
       Obj.setVisible(true);
        
        
    }//GEN-LAST:event_UserProfileActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Bike;
    private javax.swing.JButton Add_User;
    private javax.swing.JButton Existing_Bikes;
    private javax.swing.JButton Existing_Bikes_User;
    private javax.swing.JButton Existing_Users;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton Loan_Bike;
    private javax.swing.JLabel Manager;
    private javax.swing.JPanel P_Head;
    private javax.swing.JPanel P_Left;
    private javax.swing.JPanel P_Right;
    private javax.swing.JButton Remove_Bike;
    private javax.swing.JButton Remove_User;
    private javax.swing.JButton Return_Bike;
    private javax.swing.JButton Search_Bikes;
    private javax.swing.JLabel User;
    private javax.swing.JButton UserProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
