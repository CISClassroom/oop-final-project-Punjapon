
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chatc
 */
public class Check extends javax.swing.JFrame {

    /**
     * Creates new form Check
     */
    public Check() {
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

        cb_day = new javax.swing.JComboBox<>();
        cb_month = new javax.swing.JComboBox<>();
        cb_year = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtp_numroom = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtp_powerunit = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtp_waterunit = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtp_poweruse = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtp_wateruse = new javax.swing.JTextPane();
        btn_poweruse = new javax.swing.JButton();
        btn_wateruse = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtp_rent = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtp_other = new javax.swing.JTextPane();
        btn_total = new javax.swing.JButton();
        btn_all = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);

        cb_day.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        cb_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cb_month.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        cb_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "มกราคม ", "กุมภาพันธ์", "มีนาคม ", "เมษายน ", "พฤษภาคม ", "มิถุนายน ", "กรกฎาคม ", "สิงหาคม ", "กันยายน ", "ตุลาคม ", "พฤศจิกายน ", "ธันวาคม ", " " }));
        cb_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_monthActionPerformed(evt);
            }
        });

        cb_year.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        cb_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2563", "2564", "2565", "2566", "2567", "2568", "2569", "2570", "2571", "2572", "2573", "2574", "2575", "2576", "2577", "2578", "2579", "2580", "2581", "2582", "2583", "2584", "2585", "2586", "2587", "2588", "2589", "2590", "2591", "2592", "2593", "2594", "2595", "2596", "2597", "2598", "2599", "2600", "2601", "2602", "2603", "2604", "2605", "2606", "2607", "2608", "2609", "2610", "2611", "2612", "2613", "2614", "2615", "2616", "2617", "2618", "2619", "2620", "2621", "2622", "2623", "2624", "2625", "2626", "2627", "2628", "2629", "2630", "2631", "2632", "2633", "2634", "2635", "2636", "2637", "2638", "2639", "2640", "2641", "2642", "2643", "2644", "2645", "2646", "2647", "2648", "2649", "2650" }));

        jScrollPane1.setViewportView(txtp_numroom);

        txtp_powerunit.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(txtp_powerunit);

        txtp_waterunit.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(txtp_waterunit);

        txtp_poweruse.setFont(new java.awt.Font("Angsana New", 0, 11)); // NOI18N
        jScrollPane4.setViewportView(txtp_poweruse);

        txtp_wateruse.setFont(new java.awt.Font("Angsana New", 0, 11)); // NOI18N
        jScrollPane5.setViewportView(txtp_wateruse);

        btn_poweruse.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        btn_poweruse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_poweruseActionPerformed(evt);
            }
        });

        btn_wateruse.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N

        txtp_rent.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jScrollPane6.setViewportView(txtp_rent);

        txtp_other.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jScrollPane7.setViewportView(txtp_other);

        btn_total.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N

        btn_all.setBackground(java.awt.Color.gray);
        btn_all.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        btn_all.setText("รวม");
        btn_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_allActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel1.setText("วันที่");

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel2.setText("เดือน");

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel3.setText("พ.ศ");

        jLabel4.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel4.setText("ห้องเลขที่");

        jLabel5.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel5.setText("ไฟหน่วยละ");

        jLabel6.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel6.setText("น้ำหน่วยละ");

        jLabel7.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel7.setText("ใช้ไฟฟ้า");

        jLabel8.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel8.setText("ใช้น้ำ");

        jLabel9.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel9.setText("ค่าเช่าห้องพัก");

        jLabel10.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel10.setText("อื่นๆ");

        jLabel11.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel11.setText("รวมจำนวนเงินที่ต้องชำระ");

        jLabel12.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel12.setText("หน่วย");

        jLabel13.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel13.setText("หน่วย");

        jLabel14.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel14.setText("บาท");

        jLabel15.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel15.setText("บาท");

        jLabel16.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel16.setText("บาท");

        jLabel17.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel17.setText("บาท");

        jLabel18.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel18.setText("บาท");

        jLabel19.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel19.setText("บาท");

        jLabel20.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel20.setText("บาท");

        jLabel21.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel21.setText("ใบเสร็จหอพัก");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(60, 60, 60)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(btn_total, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(58, 58, 58)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(77, 77, 77))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(42, 42, 42)
                                                        .addComponent(cb_day, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(65, 65, 65)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(cb_month, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)))
                                        .addGap(30, 30, 30)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(32, 32, 32)
                                    .addComponent(cb_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_wateruse, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_poweruse, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_all, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_save)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cb_day, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cb_month, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cb_year, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel14))
                                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_poweruse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_wateruse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_save)
                                .addComponent(btn_all, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_poweruseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_poweruseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_poweruseActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
 String path = "E:\\work\\Bill.txt";

        File file = new File(path);
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);  //True = Append to file, false = Overwrite
            writer.write("                                                              "+jLabel3.getText());
            writer.write("\r\n");
            writer.write("                                            "+jLabel2.getText()+" "+cb_day.getSelectedItem().toString()+" "+jLabel15 .getText()+" "+cb_month.getSelectedItem().toString()+" "+jLabel16 .getText()+" "+cb_year.getSelectedItem().toString()+" "+jLabel17.getText()+" "+txtp_numroom.getText()) ;
            writer.write("\r\n");
            writer.write("                                                   "+jLabel19.getText()+" "+txtp_powerunit.getText()+" "+jLabel14.getText()+"   "+jLabel20.getText()+" "+txtp_waterunit.getText()+" "+jLabel8.getText());
            writer.write("\r\n");
            writer.write("                                                   "+jLabel1.getText()+" "+txtp_poweruse.getText()+"  "+jLabel6.getText()+" "+btn_poweruse.getText()+" "+jLabel18.getText());
            writer.write("\r\n");
            writer.write("                                                   "+jLabel2.getText()+" "+txtp_wateruse.getText()+"  "+jLabel7.getText()+" "+btn_wateruse.getText()+" "+jLabel9.getText());
            writer.write("\r\n");
            writer.write("                                                   "+jLabel4.getText()+" "+txtp_rent.getText()+" "+jLabel10.getText());
            writer.write("\r\n");
            writer.write("                                                   "+jLabel5.getText()+" "+txtp_other.getText()+" "+jLabel11.getText());
            writer.write("\r\n");
            writer.write("                                                   "+jLabel12.getText()+" "+btn_total.getText()+" "+jLabel13.getText());
            writer.close();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "เซฟเรียบร้อย");
        txtp_numroom.setText("");
        txtp_powerunit.setText("");
        txtp_waterunit.setText("");
        txtp_poweruse.setText("");
        btn_poweruse.setText("");
        txtp_wateruse.setText("");
        btn_wateruse.setText("");
        txtp_rent.setText("");
        txtp_other.setText("");
        btn_total.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_allActionPerformed
 try {

            total tt = new total();
            tt.check1(txtp_powerunit.getText());
            tt.check1(txtp_waterunit.getText());
            tt.check1(txtp_poweruse.getText());
            tt.check1(txtp_wateruse.getText());
            tt.check1(txtp_other.getText());
            tt.check1(txtp_rent.getText());
            tt.check1(txtp_numroom.getText());
        }
        catch(exceptionclass e) {
            JOptionPane.showMessageDialog(null, "กรุณาใส่ข้อมูลให้ครบถ้วน");
        }
        try {

            total tt = new total();
            tt.check2(txtp_powerunit.getText());
            tt.check2(txtp_waterunit.getText());
            tt.check2(txtp_poweruse.getText());
            tt.check2(txtp_wateruse.getText());
            tt.check2(txtp_other.getText());
            tt.check2(txtp_rent.getText());
        }
        catch(exceptionclass e) {
            JOptionPane.showMessageDialog(null, "กรุณาใส่ข้อมูลเป็นตัวเลข");
        }

        bill _bill = new bill();
        _bill.setunit_p(Integer.parseInt(txtp_powerunit.getText()));  //เซตค่าจากguiลงไปในคลาสบิลไฟและแปลงจากตัวหนังสือไปเป็นตัวเลข
        _bill.setunitbill_p(Integer.parseInt(txtp_poweruse.getText()));
        this.btn_poweruse.setText(Integer.toString(_bill.sum_p()));

        _bill.setunit_w(Integer.parseInt(txtp_waterunit.getText()));
        _bill.setunitbill_w(Integer.parseInt(txtp_wateruse.getText()));
        this.btn_wateruse.setText(Integer.toString(_bill.sum_w()));

        total _total = new total();
        _total.setpower(Integer.parseInt(btn_poweruse.getText()));
        _total.setwater(Integer.parseInt(btn_wateruse.getText()));//
        _total.setrent(Integer.parseInt(txtp_rent.getText()));//
        _total.setrent_1(Integer.parseInt(txtp_other.getText()));
        this.btn_total.setText(Integer.toString(_total.sumtotal()));  //เป้าหมาย เม็ดธอรที่คำนวน **แสดงข้อมูล        // TODO add your handling code here:
    }//GEN-LAST:event_btn_allActionPerformed

    private void cb_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_monthActionPerformed

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
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_all;
    private javax.swing.JButton btn_poweruse;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_total;
    private javax.swing.JButton btn_wateruse;
    private javax.swing.JComboBox<String> cb_day;
    private javax.swing.JComboBox<String> cb_month;
    private javax.swing.JComboBox<String> cb_year;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane txtp_numroom;
    private javax.swing.JTextPane txtp_other;
    private javax.swing.JTextPane txtp_powerunit;
    private javax.swing.JTextPane txtp_poweruse;
    private javax.swing.JTextPane txtp_rent;
    private javax.swing.JTextPane txtp_waterunit;
    private javax.swing.JTextPane txtp_wateruse;
    // End of variables declaration//GEN-END:variables
}
