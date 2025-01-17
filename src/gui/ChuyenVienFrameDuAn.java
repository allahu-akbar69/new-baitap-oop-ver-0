/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author Admin
 */
public class ChuyenVienFrameDuAn extends javax.swing.JFrame {

    /**
     * Creates new form ChuyenVienFrame3
     */
    public ChuyenVienFrameDuAn() {
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

        duAnPanel = new javax.swing.JPanel();
        headerTxt = new javax.swing.JLabel();
        maDALabel = new javax.swing.JLabel();
        maDAField = new javax.swing.JLabel();
        ngayBDField = new javax.swing.JLabel();
        ngayBDLabel = new javax.swing.JLabel();
        tenDALabel = new javax.swing.JLabel();
        tenDAField = new javax.swing.JLabel();
        ngayKTLabel = new javax.swing.JLabel();
        ngayKTField = new javax.swing.JLabel();
        danhSachNVScrollTable = new javax.swing.JScrollPane();
        danhSachNVTable = new javax.swing.JTable();
        danhSachThamGiaTXT = new javax.swing.JLabel();
        tongSoLabel = new javax.swing.JLabel();
        tongSoField = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        duAnPanel.setBackground(new java.awt.Color(228, 238, 244));
        duAnPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerTxt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headerTxt.setForeground(new java.awt.Color(74, 98, 138));
        headerTxt.setText("THÔNG TIN CHI TIẾT DỰ ÁN");
        duAnPanel.add(headerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        maDALabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        maDALabel.setText("Mã Dự án: ");
        duAnPanel.add(maDALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        maDAField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        maDAField.setText("null");
        duAnPanel.add(maDAField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        ngayBDField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ngayBDField.setText("null");
        duAnPanel.add(ngayBDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        ngayBDLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ngayBDLabel.setText("Ngày Bắt đầu: ");
        duAnPanel.add(ngayBDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        tenDALabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tenDALabel.setText("Tên Dự án:");
        duAnPanel.add(tenDALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        tenDAField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tenDAField.setText("null");
        duAnPanel.add(tenDAField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, -1));

        ngayKTLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ngayKTLabel.setText("Ngày Kết thúc: ");
        duAnPanel.add(ngayKTLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        ngayKTField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ngayKTField.setText("null");
        duAnPanel.add(ngayKTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        danhSachNVTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        danhSachNVScrollTable.setViewportView(danhSachNVTable);

        duAnPanel.add(danhSachNVScrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 1010, 290));

        danhSachThamGiaTXT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        danhSachThamGiaTXT.setForeground(new java.awt.Color(125, 148, 161));
        danhSachThamGiaTXT.setText("Danh sách Tham gia");
        duAnPanel.add(danhSachThamGiaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        tongSoLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tongSoLabel.setText("Tổng số:");
        duAnPanel.add(tongSoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        tongSoField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tongSoField.setText("null");
        duAnPanel.add(tongSoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon (4).png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        duAnPanel.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(duAnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(duAnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(ChuyenVienFrameDuAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenVienFrameDuAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenVienFrameDuAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenVienFrameDuAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyenVienFrameDuAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtn;
    private javax.swing.JScrollPane danhSachNVScrollTable;
    private javax.swing.JTable danhSachNVTable;
    private javax.swing.JLabel danhSachThamGiaTXT;
    private javax.swing.JPanel duAnPanel;
    private javax.swing.JLabel headerTxt;
    private javax.swing.JLabel maDAField;
    private javax.swing.JLabel maDALabel;
    private javax.swing.JLabel ngayBDField;
    private javax.swing.JLabel ngayBDLabel;
    private javax.swing.JLabel ngayKTField;
    private javax.swing.JLabel ngayKTLabel;
    private javax.swing.JLabel tenDAField;
    private javax.swing.JLabel tenDALabel;
    private javax.swing.JLabel tongSoField;
    private javax.swing.JLabel tongSoLabel;
    // End of variables declaration//GEN-END:variables
}
