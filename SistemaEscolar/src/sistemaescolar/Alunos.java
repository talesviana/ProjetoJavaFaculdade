package sistemaescolar;

import javax.swing.JOptionPane;

public class Alunos extends javax.swing.JFrame {

    private Home home;
    
    public Alunos() {
        initComponents();
    }
    
    public Alunos(Home home) {
        this.home = home;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextoNome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        TextoSala = new javax.swing.JLabel();
        sala = new javax.swing.JTextField();
        TextoNota1 = new javax.swing.JLabel();
        nota1 = new javax.swing.JTextField();
        TextoNota2 = new javax.swing.JLabel();
        nota2 = new javax.swing.JTextField();
        TextoNota3 = new javax.swing.JLabel();
        nota3 = new javax.swing.JTextField();
        TextoNota4 = new javax.swing.JLabel();
        nota4 = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("← Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 34, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconecadastropequeno.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 84, -1, 156));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 1020, 10));

        TextoNome.setBackground(new java.awt.Color(255, 255, 255));
        TextoNome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        TextoNome.setForeground(new java.awt.Color(255, 255, 255));
        TextoNome.setText("Nome do Aluno: ");
        getContentPane().add(TextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 154, -1));

        TextoSala.setBackground(new java.awt.Color(255, 255, 255));
        TextoSala.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        TextoSala.setForeground(new java.awt.Color(255, 255, 255));
        TextoSala.setText("Sala do Aluno:");
        getContentPane().add(TextoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));
        getContentPane().add(sala, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 154, -1));

        TextoNota1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        TextoNota1.setForeground(new java.awt.Color(255, 255, 255));
        TextoNota1.setText("1º Nota:");
        getContentPane().add(TextoNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1ActionPerformed(evt);
            }
        });
        getContentPane().add(nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 154, -1));

        TextoNota2.setBackground(new java.awt.Color(255, 255, 255));
        TextoNota2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        TextoNota2.setForeground(new java.awt.Color(255, 255, 255));
        TextoNota2.setText("2º Nota:");
        getContentPane().add(TextoNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        nota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota2ActionPerformed(evt);
            }
        });
        getContentPane().add(nota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 413, 154, -1));

        TextoNota3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        TextoNota3.setForeground(new java.awt.Color(255, 255, 255));
        TextoNota3.setText("3º Nota:");
        getContentPane().add(TextoNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        nota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota3ActionPerformed(evt);
            }
        });
        getContentPane().add(nota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 453, 154, -1));

        TextoNota4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        TextoNota4.setForeground(new java.awt.Color(255, 255, 255));
        TextoNota4.setText("4º Nota:");
        getContentPane().add(TextoNota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        nota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota4ActionPerformed(evt);
            }
        });
        getContentPane().add(nota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 493, 154, -1));

        botaoCalcular.setText("Enviar");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 568, 97, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrar aluno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 200, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backgroundimagecadastro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Home home = new Home(); 
        home.show(); 
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1ActionPerformed

    private void nota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota3ActionPerformed

    private void nota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota4ActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
        String nomeprograma = nome.getText();
        String salaprograma = sala.getText();
        float nota1programa = Float.parseFloat(nota1.getText());
        float nota2programa = Float.parseFloat(nota2.getText());
        float nota3programa = Float.parseFloat(nota3.getText());
        float nota4programa = Float.parseFloat(nota4.getText());
        
        GuardaAluno aluno = new GuardaAluno();
        aluno.setNome(nomeprograma);
        aluno.setSala(salaprograma);
        aluno.setNota1(nota1programa);
        aluno.setNota2(nota2programa);
        aluno.setNota3(nota3programa);
        aluno.setNota4(nota4programa);
        
        home.setGa(aluno);
        
        home.setVisible(true); 
        this.dispose(); 
        
        
      
        JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso");
        
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void nota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota2ActionPerformed

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
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoNome;
    private javax.swing.JLabel TextoNota1;
    private javax.swing.JLabel TextoNota2;
    private javax.swing.JLabel TextoNota3;
    private javax.swing.JLabel TextoNota4;
    private javax.swing.JLabel TextoSala;
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JTextField nota4;
    private javax.swing.JTextField sala;
    // End of variables declaration//GEN-END:variables
}
