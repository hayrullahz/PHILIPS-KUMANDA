
public class logging extends javax.swing.JFrame {

public logging() {
initComponents();
}

@SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jScrollPane1 = new javax.swing.JScrollPane();
  logger = new javax.swing.JTextArea();

  setAlwaysOnTop(true);

  logger.setColumns(20);
  logger.setRows(10);
  jScrollPane1.setViewportView(logger);

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
  );

  pack();
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {

try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Metal".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}

java.awt.EventQueue.invokeLater(() -> {
new logging().setVisible(true);
});
}

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JScrollPane jScrollPane1;
 public javax.swing.JTextArea logger;
 // End of variables declaration//GEN-END:variables
}
