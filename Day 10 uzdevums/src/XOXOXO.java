/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viktorija
 */
public class XOXOXO extends javax.swing.JFrame {
    
    int click = 2;
    int clickUsed[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int winner1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int winner2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    boolean firstClick = true;
    
    int winner1() {
        
        if (winner1[0] == 1 && winner1[1] == 1 && winner1[2] == 1) {
            return 1;
        }
        
        if (winner1[3] == 1 && winner1[4] == 1 && winner1[5] == 1) {
            return 1;
        }
        
        if (winner1[6] == 1 && winner1[7] == 1 && winner1[8] == 1) {
            return 1;
        }
        if (winner1[0] == 1 && winner1[3] == 1 && winner1[6] == 1) {
            return 1;
        }
        if (winner1[1] == 1 && winner1[4] == 1 && winner1[7] == 1) {
            return 1;
        }
        if (winner1[2] == 1 && winner1[5] == 1 && winner1[8] == 1) {
            return 1;
        }
        if (winner1[0] == 1 && winner1[4] == 1 && winner1[8] == 1) {
            return 1;
        }
        if (winner1[2] == 1 && winner1[4] == 1 && winner1[6] == 1) {
            return 1;
        }
        return 0;
    }
    
    int winner2() {
        
        if (winner2[0] == 1 && winner2[1] == 1 && winner2[2] == 1) {
            return 1;
        }
        
        if (winner2[3] == 1 && winner2[4] == 1 && winner2[5] == 1) {
            return 1;
        }
        
        if (winner2[6] == 1 && winner2[7] == 1 && winner2[8] == 1) {
            return 1;
        }
        if (winner2[0] == 1 && winner2[3] == 1 && winner2[6] == 1) {
            return 1;
        }
        if (winner2[1] == 1 && winner2[4] == 1 && winner2[7] == 1) {
            return 1;
        }
        if (winner2[2] == 1 && winner2[5] == 1 && winner2[8] == 1) {
            return 1;
        }
        if (winner2[0] == 1 && winner2[4] == 1 && winner2[8] == 1) {
            return 1;
        }
        if (winner2[2] == 1 && winner2[4] == 1 && winner2[6] == 1) {
            return 1;
        }
        return 0;
    }
    
    public XOXOXO() {
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

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnAgain = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setToolTipText("");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnAgain.setText("Play again!");
        btnAgain.setToolTipText("");
        btnAgain.setActionCommand("");
        btnAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgainActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextField1.setText("Once for X, twice for O");

        txtResult.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgain, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtResult))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnAgain.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn1.setText("X");
            clickUsed[0] = 1;
            winner1[0] = 1;
            
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
            
        } else {
            click++;
            btn1.setText("O");
            clickUsed[0] = 1;
            winner1[0] = 1;
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn3.setText("X");
            clickUsed[2] = 1;
            winner1[2] = 1;
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
        } else {
            click++;
            btn3.setText("O");
            clickUsed[2] = 1;
            winner2[2] = 1;
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn9.setText("X");
            clickUsed[8] = 1;
            winner1[8] = 1;
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
        } else {
            click++;
            btn9.setText("O");
            clickUsed[8] = 1;
            winner2[8] = 1;
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn2.setText("X");
            clickUsed[1] = 1;
            winner1[1] = 1;
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
        } else {
            click++;
            btn2.setText("O");
            clickUsed[1] = 1;
            winner2[1] = 1;
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn4.setText("X");
            clickUsed[3] = 1;
            winner1[3] = 1;
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
        } else {
            click++;
            btn4.setText("O");
            clickUsed[3] = 1;
            winner2[3] = 1;
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn5.setText("X");
            clickUsed[4] = 1;
            winner1[4] = 1;
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
        } else {
            click++;
            btn5.setText("O");
            clickUsed[4] = 1;
            winner2[4] = 1;
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn6.setText("X");
            clickUsed[5] = 1;
            winner1[5] = 1;
        } else {
            click++;
            btn6.setText("O");
            clickUsed[5] = 1;
            winner2[5] = 1;
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (click % 2 == 0) {
            click++;
            btn7.setText("X");
            clickUsed[6] = 1;
            winner1[6] = 1;
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
        } else {
            click++;
            btn7.setText("O");
            clickUsed[6] = 1;
            winner2[6] = 1;
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (click % 2 == 0) {
            
            click++;
            btn8.setText("X");
            clickUsed[7] = 1;
            winner1[7] = 1;
            int win1 = winner1();
            int win2 = winner2();
            
            if (win1 == 1) {
                txtResult.setText("Pirmais speletais uzvareja!");
            } else if (win2 == 1) {
                txtResult.setText("Otrais speletais uzvareja!");
            }
        } else {
            click++;
            btn8.setText("O");
            clickUsed[7] = 1;
            winner2[7] = 1;
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgainActionPerformed
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btnAgainActionPerformed

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
            java.util.logging.Logger.getLogger(XOXOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XOXOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XOXOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XOXOXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XOXOXO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAgain;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
