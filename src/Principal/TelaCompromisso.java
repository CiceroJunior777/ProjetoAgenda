/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author cicer
 */
public class TelaCompromisso extends javax.swing.JFrame {

    /**
     * Creates new form TelaCompromisso
     */
    public TelaCompromisso() {
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
        jTitulo = new javax.swing.JLabel();
        jTipo = new javax.swing.JLabel();
        SelecionaTipo = new javax.swing.JComboBox<>();
        jHora = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jData = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Descricao = new javax.swing.JLabel();
        Janela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jTitulo.setText("Novo Compromisso");
        jPanel1.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jTipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jTipo.setText("Tipo de Compromisso");
        jPanel1.add(jTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        SelecionaTipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        SelecionaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reunião", "Visita a um cliente", "Ligar para representantes de marcas", "Analisar estatísticas da empresa", " " }));
        jPanel1.add(SelecionaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 30));

        jHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jHora.setText("Hora");
        jPanel1.add(jHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, 30));

        jData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jData.setText("Data");
        jPanel1.add(jData, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 110, 30));

        jDescricao.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jDescricao.setText("Descrição");
        jPanel1.add(jDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(209, 209, 209));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Ex: Tenho Reunião Hoje ...\n");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 480, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fechajanela.png"))); // NOI18N
        jButton1.setToolTipText("Cancelar");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 40, 30));

        Descricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/descricao.png"))); // NOI18N
        jPanel1.add(Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 550, 120));

        Janela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CompromissosTela.png"))); // NOI18N
        jPanel1.add(Janela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCompromisso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descricao;
    private javax.swing.JLabel Janela;
    private javax.swing.JComboBox<String> SelecionaTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jDescricao;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jHora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jTipo;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
