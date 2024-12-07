import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

//The main GUI frame
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Content Alayzer and Locker Inventory System");
        
       
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        LockerManagerButton = new javax.swing.JButton();
        SpaceCheckerButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        ManualButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        LockerManagerPanel = new javax.swing.JPanel();
        SpaceCheckerPanel = new javax.swing.JPanel();
        HistoryPanel = new javax.swing.JPanel();
        ManualPanel = new javax.swing.JPanel();
        AboutPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 21, 38));
        setFont(new java.awt.Font("JetBrainsMono NF Medium", 0, 24)); // NOI18N

        Sidebar.setBackground(new java.awt.Color(42, 51, 53));

        jLabel1.setFont(new java.awt.Font("JetBrainsMono NFP Medium", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("C.A.L.I.S.");

        HomeButton.setBackground(new java.awt.Color(10, 94, 176));
        HomeButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("HOME");
        HomeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 94, 176), 1, true));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        LockerManagerButton.setBackground(new java.awt.Color(10, 94, 176));
        LockerManagerButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        LockerManagerButton.setForeground(new java.awt.Color(255, 255, 255));
        LockerManagerButton.setText("Locker Manager");
        LockerManagerButton.setDoubleBuffered(true);
        LockerManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockerManagerButtonActionPerformed(evt);
            }
        });

        SpaceCheckerButton.setBackground(new java.awt.Color(10, 94, 176));
        SpaceCheckerButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        SpaceCheckerButton.setForeground(new java.awt.Color(255, 255, 255));
        SpaceCheckerButton.setText("Space Checker");
        SpaceCheckerButton.setActionCommand("Space Checker");
        SpaceCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceCheckerButtonActionPerformed(evt);
            }
        });

        HistoryButton.setBackground(new java.awt.Color(10, 94, 176));
        HistoryButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        HistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        HistoryButton.setText("History");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        ManualButton.setBackground(new java.awt.Color(10, 94, 176));
        ManualButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        ManualButton.setForeground(new java.awt.Color(255, 255, 255));
        ManualButton.setText("Manual");
        ManualButton.setActionCommand("");
        ManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualButtonActionPerformed(evt);
            }
        });

        AboutButton.setBackground(new java.awt.Color(10, 94, 176));
        AboutButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        AboutButton.setForeground(new java.awt.Color(255, 255, 255));
        AboutButton.setText("About");
        AboutButton.setActionCommand("");
        AboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LockerManagerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SpaceCheckerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LockerManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SpaceCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomeButton.getAccessibleContext().setAccessibleDescription("");

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(HomePanel, "card2");

        LockerManagerPanel.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout LockerManagerPanelLayout = new javax.swing.GroupLayout(LockerManagerPanel);
        LockerManagerPanel.setLayout(LockerManagerPanelLayout);
        LockerManagerPanelLayout.setHorizontalGroup(
            LockerManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        LockerManagerPanelLayout.setVerticalGroup(
            LockerManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(LockerManagerPanel, "card3");

        SpaceCheckerPanel.setBackground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout SpaceCheckerPanelLayout = new javax.swing.GroupLayout(SpaceCheckerPanel);
        SpaceCheckerPanel.setLayout(SpaceCheckerPanelLayout);
        SpaceCheckerPanelLayout.setHorizontalGroup(
            SpaceCheckerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        SpaceCheckerPanelLayout.setVerticalGroup(
            SpaceCheckerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(SpaceCheckerPanel, "card4");

        HistoryPanel.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout HistoryPanelLayout = new javax.swing.GroupLayout(HistoryPanel);
        HistoryPanel.setLayout(HistoryPanelLayout);
        HistoryPanelLayout.setHorizontalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        HistoryPanelLayout.setVerticalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(HistoryPanel, "card5");

        ManualPanel.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout ManualPanelLayout = new javax.swing.GroupLayout(ManualPanel);
        ManualPanel.setLayout(ManualPanelLayout);
        ManualPanelLayout.setHorizontalGroup(
            ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        ManualPanelLayout.setVerticalGroup(
            ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(ManualPanel, "card6");

        AboutPanel.setBackground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout AboutPanelLayout = new javax.swing.GroupLayout(AboutPanel);
        AboutPanel.setLayout(AboutPanelLayout);
        AboutPanelLayout.setHorizontalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        AboutPanelLayout.setVerticalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(AboutPanel, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
          
       ContentPanel.removeAll();
       ContentPanel.add(HomePanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
  
    }//GEN-LAST:event_HomeButtonActionPerformed
    
    private void LockerManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockerManagerButtonActionPerformed
        
       ContentPanel.removeAll();
       ContentPanel.add(LockerManagerPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();

    }//GEN-LAST:event_LockerManagerButtonActionPerformed

    private void SpaceCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceCheckerButtonActionPerformed
        ContentPanel.removeAll();
       ContentPanel.add(SpaceCheckerPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
    }//GEN-LAST:event_SpaceCheckerButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
        ContentPanel.removeAll();
       ContentPanel.add(HistoryPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
    }//GEN-LAST:event_HistoryButtonActionPerformed

    private void ManualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualButtonActionPerformed
       ContentPanel.removeAll();
       ContentPanel.add(ManualPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
    }//GEN-LAST:event_ManualButtonActionPerformed

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        ContentPanel.removeAll();
       ContentPanel.add(AboutPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
    }//GEN-LAST:event_AboutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JPanel AboutPanel;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JPanel HistoryPanel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JButton LockerManagerButton;
    private javax.swing.JPanel LockerManagerPanel;
    private javax.swing.JButton ManualButton;
    private javax.swing.JPanel ManualPanel;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton SpaceCheckerButton;
    private javax.swing.JPanel SpaceCheckerPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}