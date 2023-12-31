/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Currency_Converter;

import javax.swing.JOptionPane;

/**
 *
 * @author zee
 */
public class CurrencyConverter extends javax.swing.JFrame {
    
    String[] currencyUnits = {
        "currency",
        "$",
        "¥",
        "R",
        "£",
        "₣",
        "€"
    };
        double US_Dollar = 0.14;
        double Japanese_Yen = 20.45;
        double South_African_Rands = 2.58;
        double Great_British_Pounds = 0.11;
        double Swiss_Franc = 0.12;
        double Euro = 0.13;
    
    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromCurrency = new javax.swing.JComboBox<>();
        toCurrency = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        toCurrencyUnits = new javax.swing.JLabel();
        fromCurrencyUnits = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Currency Converter");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("by Zee");

        fromCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a currency...", "US Dollar", "Japanese Yen", "South African Rand", "Great British Pound", "Swiss Franc", "Euro", " " }));
        fromCurrency.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fromCurrencyItemStateChanged(evt);
            }
        });

        toCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a currency...", "US Dollar", "Japanese Yen", "South African Rand", "Great British Pound", "Swiss Franc", "Euro", " " }));
        toCurrency.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toCurrencyItemStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("From");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("To");

        toCurrencyUnits.setForeground(new java.awt.Color(0, 0, 0));
        toCurrencyUnits.setText("Currency");

        fromCurrencyUnits.setForeground(new java.awt.Color(0, 0, 0));
        fromCurrencyUnits.setText("Currency");

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fromCurrency, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel3))
                                .addComponent(toCurrency, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fromCurrencyUnits, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(toCurrencyUnits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)))
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromCurrencyUnits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toCurrencyUnits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void fromCurrencyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fromCurrencyItemStateChanged
        // TODO add your handling code here:
        int position = fromCurrency.getSelectedIndex();
        fromCurrencyUnits.setText(currencyUnits[position]);
    }//GEN-LAST:event_fromCurrencyItemStateChanged

    private void toCurrencyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toCurrencyItemStateChanged
        // TODO add your handling code here:
        int position = toCurrency.getSelectedIndex();
        toCurrencyUnits.setText(currencyUnits[position]);
    }//GEN-LAST:event_toCurrencyItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (fromCurrency.getSelectedIndex() == 0 || toCurrency.getSelectedIndex() == 0 ||
                t1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Select one from each menu and enter the amount to convert!", 
                    "Error!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        double amountToChange = Double.parseDouble(t1.getText());
        double amountInYuan = 0.0;
        
        switch(fromCurrency.getSelectedItem().toString())
        {
            case "US Dollar":
                amountInYuan = amountToChange / US_Dollar;
            break;
            
            case "Japanese Yen":
                amountInYuan = amountToChange / Japanese_Yen;
            break;
            
            case "South African Rand":
                amountInYuan = amountToChange / South_African_Rands;
            break;
            
            case "Great British Pound":
                amountInYuan = amountToChange / Great_British_Pounds;
            break;
            
            case "Swiss Franc":
                amountInYuan = amountToChange / Swiss_Franc;
            break;
            
            case "Euro":
                amountInYuan = amountToChange / Euro;
            break;
            
            default:
                amountInYuan = 0.0;
            
        }
        
        double amountChanged = 0.0;
        
        switch(toCurrency.getSelectedItem().toString())
        {
            case "Euro":
                amountChanged = amountInYuan * Euro;
            break;
            
            case "Swiss Franc":
                amountChanged = amountInYuan * Swiss_Franc;
            break;
            
            case "Great British Pound":
                amountChanged = amountInYuan * Great_British_Pounds;
            break;
            
            case "South African Rand":
                amountChanged = amountInYuan * South_African_Rands;
            break;
            
            case "Japanese Yen":
                amountChanged = amountInYuan * Japanese_Yen;
            break;
            
            case "US Dollar":
                amountChanged = amountInYuan * US_Dollar;
            break;
            
            default: amountChanged = amountInYuan * 0.0;
            
            
            
            
        }
        
        String value = String.format("%.2f", amountChanged);
        t2.setText(value);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fromCurrency.setSelectedIndex(0);
        toCurrency.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fromCurrency;
    private javax.swing.JLabel fromCurrencyUnits;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JComboBox<String> toCurrency;
    private javax.swing.JLabel toCurrencyUnits;
    // End of variables declaration//GEN-END:variables
}
