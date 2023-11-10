/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import DAO.KhachHang_DAO;
import Model.KhachHang;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QuanLyKhachHang_Panel extends javax.swing.JPanel {

    /**
     * Creates new form TrangChu_Panel
     */
    public QuanLyKhachHang_Panel() {
        initComponents();
        ThemDuLieuVaoTable();
        init();
        
    }
    public void init(){
        
    }
    public void ThemDuLieuVaoTable(){
        KhachHang_DAO KHD = new KhachHang_DAO();
        DefaultTableModel model = (DefaultTableModel)Table_KhachHang.getModel();
        String row[] = new String[6];
        ArrayList<KhachHang> List = KHD.getInstance().selectAll();
        for(KhachHang kh : List){
            int stt = Table_KhachHang.getRowCount() + 1;
            row[0] = (String.valueOf(stt)); 
            row[1] = kh.getMaKH();
            row[2] = kh.getTenKH();
            row[3] = kh.getGioiTinh();
            row[4] = kh.getCCCD();
            row[5] = kh.getSDT();
            model.addRow(row);
        }
        Table_KhachHang.setModel(model);
    }
    public KhachHang returnKhachHang(int Indext){
        String MaKH = (String) Table_KhachHang.getValueAt(Indext, 1);
        String TenKH = (String) Table_KhachHang.getValueAt(Indext, 2);
        String CCCD = (String)Table_KhachHang.getValueAt(Indext, 3);
        String GioiTinh = (String)Table_KhachHang.getValueAt(Indext, 4);
        String SDT = (String)Table_KhachHang.getValueAt(Indext, 5);
        KhachHang KH = new KhachHang(MaKH, TenKH, CCCD, GioiTinh, SDT);
        return KH;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MaKhachHang_Text = new javax.swing.JTextField();
        TenKhachHang_Text = new javax.swing.JTextField();
        GioiTinh_Box = new javax.swing.JComboBox<>();
        CCCD_Text = new javax.swing.JTextField();
        SDT_Text = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Them_Button = new javax.swing.JButton();
        Xoa_Button = new javax.swing.JButton();
        Sua_Button = new javax.swing.JButton();
        LamMoi_Button = new javax.swing.JButton();
        TimKiem_Button = new javax.swing.JButton();
        TaiDanhSach_Button = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        Search_Text1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_KhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(30, 15, 79));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(972, 667));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông tin khách hàng");

        jPanel1.setBackground(new java.awt.Color(140, 198, 243));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã khách hàng");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Họ tên");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Giới tính");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CMND / CCCD");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SDT");

        MaKhachHang_Text.setEditable(false);
        MaKhachHang_Text.setBackground(new java.awt.Color(204, 204, 204));
        MaKhachHang_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaKhachHang_TextActionPerformed(evt);
            }
        });

        GioiTinh_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TenKhachHang_Text)
                    .addComponent(CCCD_Text)
                    .addComponent(SDT_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(MaKhachHang_Text)
                    .addComponent(GioiTinh_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MaKhachHang_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TenKhachHang_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(GioiTinh_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CCCD_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SDT_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(140, 198, 243));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Them_Button.setBackground(new java.awt.Color(153, 255, 255));
        Them_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Them_Button.setForeground(new java.awt.Color(255, 255, 255));
        Them_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/them.png"))); // NOI18N
        Them_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Them_ButtonActionPerformed(evt);
            }
        });

        Xoa_Button.setBackground(new java.awt.Color(153, 255, 255));
        Xoa_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Xoa_Button.setForeground(new java.awt.Color(255, 255, 255));
        Xoa_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancel.png"))); // NOI18N
        Xoa_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa_ButtonActionPerformed(evt);
            }
        });

        Sua_Button.setBackground(new java.awt.Color(153, 255, 255));
        Sua_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Sua_Button.setForeground(new java.awt.Color(255, 255, 255));
        Sua_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sua_1.png"))); // NOI18N

        LamMoi_Button.setBackground(new java.awt.Color(153, 255, 255));
        LamMoi_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LamMoi_Button.setForeground(new java.awt.Color(255, 255, 255));
        LamMoi_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        LamMoi_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoi_ButtonActionPerformed(evt);
            }
        });

        TimKiem_Button.setBackground(new java.awt.Color(0, 153, 255));
        TimKiem_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TimKiem_Button.setForeground(new java.awt.Color(255, 255, 255));
        TimKiem_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Search32.png"))); // NOI18N

        TaiDanhSach_Button.setBackground(new java.awt.Color(0, 153, 255));
        TaiDanhSach_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TaiDanhSach_Button.setForeground(new java.awt.Color(255, 255, 255));
        TaiDanhSach_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/downloading.png"))); // NOI18N
        TaiDanhSach_Button.setText("   Tải danh sách");
        TaiDanhSach_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaiDanhSach_ButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setOpaque(false);

        jSeparator2.setBackground(new java.awt.Color(140, 198, 243));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 51));

        Search_Text1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Search_Text1.setForeground(new java.awt.Color(0, 0, 0));
        Search_Text1.setText("Tìm kiếm");
        Search_Text1.setBorder(null);
        Search_Text1.setOpaque(false);
        Search_Text1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Search_Text1FocusGained(evt);
            }
        });
        Search_Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Text1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search-heart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_Text1)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Search_Text1)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimKiem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LamMoi_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(TaiDanhSach_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TimKiem_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LamMoi_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaiDanhSach_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(153, 51, 255)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        Table_KhachHang.setBackground(new java.awt.Color(204, 255, 255));
        Table_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã khách hàng", "Họ tên", "Giới tính", "CMND / CCCD", "SDT"
            }
        ));
        jScrollPane1.setViewportView(Table_KhachHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Them_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Them_ButtonActionPerformed
        KhachHang_DAO khd = new KhachHang_DAO();
        KhachHang KH = new KhachHang();
        ArrayList<KhachHang> List = khd.getInstance().selectAll();
        
        int stt = Table_KhachHang.getRowCount() + 1;
        KhachHang khachHang = List.get(List.size()-1);
        String Ma = khachHang.getMaKH();
        int chuyendoi = Integer.parseInt(Ma.substring(2)) + 1;
        String MaKH = Ma.substring(0,2) + String.format("%04d", chuyendoi);
        MaKhachHang_Text.setText(MaKH);
        KH.setMaKH(MaKH);
        KH.setTenKH(TenKhachHang_Text.getText());
        KH.setGioiTinh(GioiTinh_Box.getSelectedItem().toString());
        KH.setCCCD(CCCD_Text.getText());
        KH.setSDT(SDT_Text.getText());
        DefaultTableModel model = (DefaultTableModel)Table_KhachHang.getModel();
        String row[] = new String[6];
        
        row[0] = (String.valueOf(stt));
        row[1] = KH.getMaKH();
        row[2] = KH.getTenKH();
        row[3] = KH.getGioiTinh();
        row[4] = KH.getCCCD();
        row[5] = KH.getSDT();
        if(KH.getTenKH().equals("") || KH.getCCCD().equals("")
                || KH.getGioiTinh().equals("")){
            JOptionPane.showConfirmDialog(this, "Thêm dữ liệu thất bại");
        } else{
            model.addRow(row);
            Table_KhachHang.setModel(model);
            khd.getInstance().insert(KH);
            JOptionPane.showConfirmDialog(this, "Thêm dữ liệu thành công");
        }
        
    }//GEN-LAST:event_Them_ButtonActionPerformed

    private void Xoa_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa_ButtonActionPerformed
        KhachHang_DAO KHD = new KhachHang_DAO();
        int indext = Table_KhachHang.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)Table_KhachHang.getModel();
        if(indext < 0 || indext > Table_KhachHang.getRowCount()){
            JOptionPane.showConfirmDialog(this, "Xóa không thành công");
        }
        else{
            KhachHang KH = returnKhachHang(indext);
            KHD.getInstance().delete(KH);
            model.removeRow(indext); 
            JOptionPane.showConfirmDialog(this, "Xóa dữ liệu thành công");
        }
         
    }//GEN-LAST:event_Xoa_ButtonActionPerformed

    private void Search_Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Text1ActionPerformed

    }//GEN-LAST:event_Search_Text1ActionPerformed

    private void TaiDanhSach_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaiDanhSach_ButtonActionPerformed
        
    }//GEN-LAST:event_TaiDanhSach_ButtonActionPerformed

    private void Search_Text1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Search_Text1FocusGained
        if(Search_Text1.getText().equals("Tìm kiếm")){
            Search_Text1.setText("");
        }
    }//GEN-LAST:event_Search_Text1FocusGained

    private void LamMoi_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoi_ButtonActionPerformed
       
    }//GEN-LAST:event_LamMoi_ButtonActionPerformed

    private void MaKhachHang_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaKhachHang_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaKhachHang_TextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCD_Text;
    private javax.swing.JComboBox<String> GioiTinh_Box;
    private javax.swing.JButton LamMoi_Button;
    private javax.swing.JTextField MaKhachHang_Text;
    private javax.swing.JTextField SDT_Text;
    private javax.swing.JTextField Search_Text1;
    private javax.swing.JButton Sua_Button;
    private javax.swing.JTable Table_KhachHang;
    private javax.swing.JButton TaiDanhSach_Button;
    private javax.swing.JTextField TenKhachHang_Text;
    private javax.swing.JButton Them_Button;
    private javax.swing.JButton TimKiem_Button;
    private javax.swing.JButton Xoa_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
