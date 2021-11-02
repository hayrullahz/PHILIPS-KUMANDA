
import java.awt.Color;
import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSLUCENT;
import java.awt.GraphicsEnvironment;

public class remote1 extends javax.swing.JFrame {

private int x1;
private int x2;
private kumanda K;

public remote1() {

initComponents();
setBackground(new Color(0, 0, 0, 0));

// Determine what the GraphicsDevice can support.
GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
GraphicsDevice gd = ge.getDefaultScreenDevice();
boolean isPerPixelTranslucencySupported = gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);
//If translucent windows aren't supported, exit.
if (!isPerPixelTranslucencySupported) {
System.out.println("Per-pixel translucency is not supported");
System.exit(0);
}
K = new kumanda(jComboBox1, jComboBox2,slVolume);
}

@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {

lblPower = new javax.swing.JLabel();
lblRecord = new javax.swing.JLabel();
lblPause = new javax.swing.JLabel();
lblStop = new javax.swing.JLabel();
lblFF = new javax.swing.JLabel();
lblPL = new javax.swing.JLabel();
lblRW = new javax.swing.JLabel();
lblLight = new javax.swing.JLabel();
lbl3D = new javax.swing.JLabel();
lblGuide = new javax.swing.JLabel();
lblFormat = new javax.swing.JLabel();
lblTv = new javax.swing.JLabel();
lblSource = new javax.swing.JLabel();
lblHome = new javax.swing.JLabel();
lblSmartTv = new javax.swing.JLabel();
lblFind = new javax.swing.JLabel();
lblInfo = new javax.swing.JLabel();
lblOptions = new javax.swing.JLabel();
lblExit = new javax.swing.JLabel();
lblConfirm = new javax.swing.JLabel();
lblBack = new javax.swing.JLabel();
lblCursorUp = new javax.swing.JLabel();
lblCursorDown = new javax.swing.JLabel();
lblCursorLeft = new javax.swing.JLabel();
lblCursorRight = new javax.swing.JLabel();
lblChPlus = new javax.swing.JLabel();
lblChMinus = new javax.swing.JLabel();
lblVolPlus = new javax.swing.JLabel();
lblVolMinus = new javax.swing.JLabel();
lblMute = new javax.swing.JLabel();
lblBlue = new javax.swing.JLabel();
lblYellow = new javax.swing.JLabel();
lblGreen = new javax.swing.JLabel();
lblRed = new javax.swing.JLabel();
lbl1 = new javax.swing.JLabel();
lbl2 = new javax.swing.JLabel();
lbl3 = new javax.swing.JLabel();
lbl4 = new javax.swing.JLabel();
lbl5 = new javax.swing.JLabel();
lbl6 = new javax.swing.JLabel();
lbl7 = new javax.swing.JLabel();
lbl8 = new javax.swing.JLabel();
lbl9 = new javax.swing.JLabel();
lblAltYazı = new javax.swing.JLabel();
lbl0 = new javax.swing.JLabel();
lblText = new javax.swing.JLabel();
lblAdjust = new javax.swing.JLabel();
slVolume = new javax.swing.JSlider();
btnIp = new javax.swing.JButton();
bntExit = new javax.swing.JButton();
lblNext = new javax.swing.JLabel();
lblPrev = new javax.swing.JLabel();
lblBackground = new javax.swing.JLabel();
jComboBox1 = new javax.swing.JComboBox<>();
jComboBox2 = new javax.swing.JComboBox<>();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setAlwaysOnTop(true);
setUndecorated(true);
setOpacity(0.9F);
setResizable(false);
setSize(new java.awt.Dimension(257, 721));
setType(java.awt.Window.Type.POPUP);
getContentPane().setLayout(null);

lblPower.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblPower.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblPowerMouseClicked(evt);
}
});
getContentPane().add(lblPower);
lblPower.setBounds(110, 30, 40, 30);

lblRecord.setText("  ");
lblRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblRecord.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblRecordMouseClicked(evt);
}
});
getContentPane().add(lblRecord);
lblRecord.setBounds(190, 80, 30, 16);

lblPause.setText("  ");
lblPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblPause.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblPauseMouseClicked(evt);
}
});
getContentPane().add(lblPause);
lblPause.setBounds(120, 80, 20, 16);

lblStop.setText("  ");
lblStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblStop.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblStopMouseClicked(evt);
}
});
getContentPane().add(lblStop);
lblStop.setBounds(50, 70, 20, 30);

lblFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblFF.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblFFMouseClicked(evt);
}
});
getContentPane().add(lblFF);
lblFF.setBounds(190, 100, 20, 20);

lblPL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblPL.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblPLMouseClicked(evt);
}
});
getContentPane().add(lblPL);
lblPL.setBounds(120, 110, 20, 10);

lblRW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblRW.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblRWMouseClicked(evt);
}
});
getContentPane().add(lblRW);
lblRW.setBounds(50, 110, 20, 20);

lblLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblLight.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblLightMouseClicked(evt);
}
});
getContentPane().add(lblLight);
lblLight.setBounds(180, 140, 60, 20);

lbl3D.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl3D.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl3DMouseClicked(evt);
}
});
getContentPane().add(lbl3D);
lbl3D.setBounds(120, 140, 30, 20);

lblGuide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblGuide.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblGuideMouseClicked(evt);
}
});
getContentPane().add(lblGuide);
lblGuide.setBounds(40, 140, 40, 20);

lblFormat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblFormat.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblFormatMouseClicked(evt);
}
});
getContentPane().add(lblFormat);
lblFormat.setBounds(180, 160, 40, 20);

lblTv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblTv.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblTvMouseClicked(evt);
}
});
getContentPane().add(lblTv);
lblTv.setBounds(110, 170, 40, 20);

lblSource.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblSource.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblSourceMouseClicked(evt);
}
});
getContentPane().add(lblSource);
lblSource.setBounds(30, 160, 50, 20);

lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblHomeMouseClicked(evt);
}
});
getContentPane().add(lblHome);
lblHome.setBounds(80, 200, 20, 20);

lblSmartTv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
getContentPane().add(lblSmartTv);
lblSmartTv.setBounds(150, 200, 40, 30);

lblFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblFind.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblFindMouseClicked(evt);
}
});
getContentPane().add(lblFind);
lblFind.setBounds(50, 250, 30, 30);

lblInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblInfoMouseClicked(evt);
}
});
getContentPane().add(lblInfo);
lblInfo.setBounds(180, 250, 40, 20);

lblOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblOptions.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblOptionsMouseClicked(evt);
}
});
getContentPane().add(lblOptions);
lblOptions.setBounds(190, 340, 30, 30);

lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblExitMouseClicked(evt);
}
});
getContentPane().add(lblExit);
lblExit.setBounds(50, 340, 40, 30);

lblConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblConfirmMouseClicked(evt);
}
});
getContentPane().add(lblConfirm);
lblConfirm.setBounds(110, 290, 40, 30);

lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblBackMouseClicked(evt);
}
});
getContentPane().add(lblBack);
lblBack.setBounds(110, 390, 50, 20);

lblCursorUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblCursorUp.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblCursorUpMouseClicked(evt);
}
});
getContentPane().add(lblCursorUp);
lblCursorUp.setBounds(110, 260, 40, 20);

lblCursorDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblCursorDown.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblCursorDownMouseClicked(evt);
}
});
getContentPane().add(lblCursorDown);
lblCursorDown.setBounds(120, 340, 20, 20);

lblCursorLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblCursorLeft.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblCursorLeftMouseClicked(evt);
}
});
getContentPane().add(lblCursorLeft);
lblCursorLeft.setBounds(70, 300, 20, 20);

lblCursorRight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblCursorRight.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblCursorRightMouseClicked(evt);
}
});
getContentPane().add(lblCursorRight);
lblCursorRight.setBounds(170, 300, 20, 20);

lblChPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblChPlus.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblChPlusMouseClicked(evt);
}
});
getContentPane().add(lblChPlus);
lblChPlus.setBounds(40, 410, 30, 20);

lblChMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblChMinus.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblChMinusMouseClicked(evt);
}
});
getContentPane().add(lblChMinus);
lblChMinus.setBounds(40, 450, 30, 20);

lblVolPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblVolPlus.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblVolPlusMouseClicked(evt);
}
});
getContentPane().add(lblVolPlus);
lblVolPlus.setBounds(180, 410, 40, 20);

lblVolMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblVolMinus.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblVolMinusMouseClicked(evt);
}
});
getContentPane().add(lblVolMinus);
lblVolMinus.setBounds(190, 450, 30, 20);

lblMute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblMute.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblMuteMouseClicked(evt);
}
});
getContentPane().add(lblMute);
lblMute.setBounds(110, 450, 40, 20);

lblBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblBlue.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblBlueMouseClicked(evt);
}
});
getContentPane().add(lblBlue);
lblBlue.setBounds(190, 490, 40, 20);

lblYellow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblYellow.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblYellowMouseClicked(evt);
}
});
getContentPane().add(lblYellow);
lblYellow.setBounds(130, 490, 40, 20);

lblGreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblGreen.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblGreenMouseClicked(evt);
}
});
getContentPane().add(lblGreen);
lblGreen.setBounds(80, 490, 40, 20);

lblRed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblRed.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblRedMouseClicked(evt);
}
});
getContentPane().add(lblRed);
lblRed.setBounds(30, 490, 40, 20);

lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl1MouseClicked(evt);
}
});
getContentPane().add(lbl1);
lbl1.setBounds(30, 520, 50, 30);

lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl2MouseClicked(evt);
}
});
getContentPane().add(lbl2);
lbl2.setBounds(110, 520, 40, 30);

lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl3MouseClicked(evt);
}
});
getContentPane().add(lbl3);
lbl3.setBounds(180, 520, 40, 30);

lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl4MouseClicked(evt);
}
});
getContentPane().add(lbl4);
lbl4.setBounds(40, 560, 40, 20);

lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl5MouseClicked(evt);
}
});
getContentPane().add(lbl5);
lbl5.setBounds(110, 560, 40, 20);

lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl6MouseClicked(evt);
}
});
getContentPane().add(lbl6);
lbl6.setBounds(180, 560, 40, 20);

lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl7MouseClicked(evt);
}
});
getContentPane().add(lbl7);
lbl7.setBounds(40, 590, 40, 20);

lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl8MouseClicked(evt);
}
});
getContentPane().add(lbl8);
lbl8.setBounds(110, 590, 40, 20);

lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl9MouseClicked(evt);
}
});
getContentPane().add(lbl9);
lbl9.setBounds(180, 590, 40, 20);

lblAltYazı.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblAltYazı.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblAltYazıMouseClicked(evt);
}
});
getContentPane().add(lblAltYazı);
lblAltYazı.setBounds(40, 620, 40, 20);

lbl0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lbl0.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lbl0MouseClicked(evt);
}
});
getContentPane().add(lbl0);
lbl0.setBounds(110, 620, 40, 20);

lblText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblText.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblTextMouseClicked(evt);
}
});
getContentPane().add(lblText);
lblText.setBounds(180, 620, 30, 20);

lblAdjust.setBackground(new java.awt.Color(51, 51, 51));
lblAdjust.setForeground(new java.awt.Color(255, 255, 255));
lblAdjust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblAdjust.setText("Adjust");
lblAdjust.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
lblAdjust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblAdjust.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
lblAdjust.setOpaque(true);
lblAdjust.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblAdjustMouseClicked(evt);
}
});
getContentPane().add(lblAdjust);
lblAdjust.setBounds(100, 420, 60, 20);

slVolume.setOpaque(false);
getContentPane().add(slVolume);
slVolume.setBounds(260, 30, 150, 20);

btnIp.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
btnIp.setText("IP");
btnIp.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnIpActionPerformed(evt);
}
});
getContentPane().add(btnIp);
btnIp.setBounds(70, 670, 60, 20);

bntExit.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
bntExit.setText("Çıkış");
bntExit.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
bntExitActionPerformed(evt);
}
});
getContentPane().add(bntExit);
bntExit.setBounds(130, 670, 60, 20);

lblNext.setBackground(new java.awt.Color(51, 51, 51));
lblNext.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
lblNext.setForeground(new java.awt.Color(255, 255, 255));
lblNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblNext.setText(">");
lblNext.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
lblNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblNext.setOpaque(true);
lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblNextMouseClicked(evt);
}
});
getContentPane().add(lblNext);
lblNext.setBounds(180, 50, 40, 20);

lblPrev.setBackground(new java.awt.Color(51, 51, 51));
lblPrev.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
lblPrev.setForeground(new java.awt.Color(255, 255, 255));
lblPrev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblPrev.setText("<");
lblPrev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
lblPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
lblPrev.setOpaque(true);
lblPrev.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
lblPrevMouseClicked(evt);
}
});
getContentPane().add(lblPrev);
lblPrev.setBounds(30, 50, 40, 20);

lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remote1.png"))); // NOI18N
lblBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
public void mouseDragged(java.awt.event.MouseEvent evt) {
lblBackgroundMouseDragged(evt);
}
});
lblBackground.addMouseListener(new java.awt.event.MouseAdapter() {
public void mousePressed(java.awt.event.MouseEvent evt) {
lblBackgroundMousePressed(evt);
}
});
getContentPane().add(lblBackground);
lblBackground.setBounds(0, 0, 260, 720);

jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
getContentPane().add(jComboBox1);
jComboBox1.setBounds(270, 60, 130, 25);

jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
getContentPane().add(jComboBox2);
jComboBox2.setBounds(270, 100, 130, 25);

pack();
setLocationRelativeTo(null);
}// </editor-fold>//GEN-END:initComponents

private void lblPowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPowerMouseClicked

K.komutGönder("Standby");
}//GEN-LAST:event_lblPowerMouseClicked

private void lblBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackgroundMouseDragged
int x = evt.getXOnScreen();
int y = evt.getYOnScreen();
this.setLocation(x - x1, y - x2);
}//GEN-LAST:event_lblBackgroundMouseDragged

private void lblBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackgroundMousePressed
x1 = evt.getX();
x2 = evt.getY();
}//GEN-LAST:event_lblBackgroundMousePressed

private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
System.exit(0);
}//GEN-LAST:event_bntExitActionPerformed

private void lblRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecordMouseClicked
K.komutGönder("Record");
}//GEN-LAST:event_lblRecordMouseClicked

private void lblPauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPauseMouseClicked
K.komutGönder("Pause");
}//GEN-LAST:event_lblPauseMouseClicked

private void lblStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStopMouseClicked
K.komutGönder("Stop");
}//GEN-LAST:event_lblStopMouseClicked

private void lblVolPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolPlusMouseClicked
K.komutGönder("VolumeUp");
}//GEN-LAST:event_lblVolPlusMouseClicked

private void lblMuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMuteMouseClicked
K.komutGönder("Mute");
}//GEN-LAST:event_lblMuteMouseClicked

private void lblVolMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolMinusMouseClicked
K.komutGönder("VolumeDown");
}//GEN-LAST:event_lblVolMinusMouseClicked

private void lblRWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRWMouseClicked
K.komutGönder("Rewind");
}//GEN-LAST:event_lblRWMouseClicked

private void lblPLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPLMouseClicked
K.komutGönder("Play");
}//GEN-LAST:event_lblPLMouseClicked

private void lblFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFFMouseClicked
K.komutGönder("FastForward");
}//GEN-LAST:event_lblFFMouseClicked

private void lblBlueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlueMouseClicked
K.komutGönder("BlueColour");
}//GEN-LAST:event_lblBlueMouseClicked

private void lblYellowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYellowMouseClicked
K.komutGönder("YellowColour");
}//GEN-LAST:event_lblYellowMouseClicked

private void lblGreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGreenMouseClicked
K.komutGönder("GreenColour");
}//GEN-LAST:event_lblGreenMouseClicked

private void lblRedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedMouseClicked
K.komutGönder("RedColour");
}//GEN-LAST:event_lblRedMouseClicked

private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
K.komutGönder("Back");
}//GEN-LAST:event_lblBackMouseClicked

private void lblChPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChPlusMouseClicked
K.komutGönder("ChannelStepUp");
}//GEN-LAST:event_lblChPlusMouseClicked

private void lblChMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChMinusMouseClicked
K.komutGönder("ChannelStepDown");
}//GEN-LAST:event_lblChMinusMouseClicked

private void lblCursorDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursorDownMouseClicked
K.komutGönder("CursorDown");
}//GEN-LAST:event_lblCursorDownMouseClicked

private void lblCursorUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursorUpMouseClicked
K.komutGönder("CursorUp");
}//GEN-LAST:event_lblCursorUpMouseClicked

private void lblCursorRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursorRightMouseClicked
K.komutGönder("CursorRight");
}//GEN-LAST:event_lblCursorRightMouseClicked

private void lblCursorLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCursorLeftMouseClicked
K.komutGönder("CursorLeft");
}//GEN-LAST:event_lblCursorLeftMouseClicked

private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
K.komutGönder("Home");
}//GEN-LAST:event_lblHomeMouseClicked

private void lblFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFindMouseClicked
K.komutGönder("Find");
}//GEN-LAST:event_lblFindMouseClicked

private void lblOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOptionsMouseClicked
K.komutGönder("Options");
}//GEN-LAST:event_lblOptionsMouseClicked

private void lblSourceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSourceMouseClicked
K.komutGönder("Source");
}//GEN-LAST:event_lblSourceMouseClicked

private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
K.komutGönder("Digit1");
}//GEN-LAST:event_lbl1MouseClicked

private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
K.komutGönder("Digit2");
}//GEN-LAST:event_lbl2MouseClicked

private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
K.komutGönder("Digit3");
}//GEN-LAST:event_lbl3MouseClicked

private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
K.komutGönder("Digit4");
}//GEN-LAST:event_lbl4MouseClicked

private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
K.komutGönder("Digit5");
}//GEN-LAST:event_lbl5MouseClicked

private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
K.komutGönder("Digit6");
}//GEN-LAST:event_lbl6MouseClicked

private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
K.komutGönder("Digit7");
}//GEN-LAST:event_lbl7MouseClicked

private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
K.komutGönder("Digit8");
}//GEN-LAST:event_lbl8MouseClicked

private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
K.komutGönder("Digit9");
}//GEN-LAST:event_lbl9MouseClicked

private void lblAltYazıMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAltYazıMouseClicked
K.komutGönder("Subtitle");
}//GEN-LAST:event_lblAltYazıMouseClicked

private void lbl0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl0MouseClicked
K.komutGönder("Digit0");
}//GEN-LAST:event_lbl0MouseClicked

private void lblTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTextMouseClicked
K.komutGönder("Teletext");
}//GEN-LAST:event_lblTextMouseClicked

private void lbl3DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3DMouseClicked
K.komutGönder("3d");
}//GEN-LAST:event_lbl3DMouseClicked

private void lblLightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLightMouseClicked
K.komutGönder("AmbilightOnOff");
}//GEN-LAST:event_lblLightMouseClicked

private void lblGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuideMouseClicked
K.komutGönder("Guide");
}//GEN-LAST:event_lblGuideMouseClicked

 private void btnIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIpActionPerformed
 K.bağlantıBul();
 }//GEN-LAST:event_btnIpActionPerformed

 private void lblConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseClicked
 K.komutGönder("Confirm");
 }//GEN-LAST:event_lblConfirmMouseClicked

 private void lblTvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTvMouseClicked
 K.komutGönder("WatchTV");
 }//GEN-LAST:event_lblTvMouseClicked

 private void lblFormatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFormatMouseClicked
 K.komutGönder("Viewmode");
 }//GEN-LAST:event_lblFormatMouseClicked

 private void lblAdjustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdjustMouseClicked
 K.komutGönder("Adjust");
 }//GEN-LAST:event_lblAdjustMouseClicked

 private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
 K.komutGönder("Info");
 }//GEN-LAST:event_lblInfoMouseClicked

 private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
 K.komutGönder("Exit");
 }//GEN-LAST:event_lblExitMouseClicked

 private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
 K.komutGönder("Next");
 }//GEN-LAST:event_lblNextMouseClicked

 private void lblPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrevMouseClicked
 K.komutGönder("Previous");
 }//GEN-LAST:event_lblPrevMouseClicked

public static void main(String args[]) {

try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Metal".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
}

java.awt.EventQueue.invokeLater(() -> {
new remote1().setVisible(true);
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton bntExit;
private javax.swing.JButton btnIp;
private javax.swing.JComboBox<String> jComboBox1;
private javax.swing.JComboBox<String> jComboBox2;
private javax.swing.JLabel lbl0;
private javax.swing.JLabel lbl1;
private javax.swing.JLabel lbl2;
private javax.swing.JLabel lbl3;
private javax.swing.JLabel lbl3D;
private javax.swing.JLabel lbl4;
private javax.swing.JLabel lbl5;
private javax.swing.JLabel lbl6;
private javax.swing.JLabel lbl7;
private javax.swing.JLabel lbl8;
private javax.swing.JLabel lbl9;
private javax.swing.JLabel lblAdjust;
private javax.swing.JLabel lblAltYazı;
private javax.swing.JLabel lblBack;
private javax.swing.JLabel lblBackground;
private javax.swing.JLabel lblBlue;
private javax.swing.JLabel lblChMinus;
private javax.swing.JLabel lblChPlus;
private javax.swing.JLabel lblConfirm;
private javax.swing.JLabel lblCursorDown;
private javax.swing.JLabel lblCursorLeft;
private javax.swing.JLabel lblCursorRight;
private javax.swing.JLabel lblCursorUp;
private javax.swing.JLabel lblExit;
private javax.swing.JLabel lblFF;
private javax.swing.JLabel lblFind;
private javax.swing.JLabel lblFormat;
private javax.swing.JLabel lblGreen;
private javax.swing.JLabel lblGuide;
private javax.swing.JLabel lblHome;
private javax.swing.JLabel lblInfo;
private javax.swing.JLabel lblLight;
private javax.swing.JLabel lblMute;
private javax.swing.JLabel lblNext;
private javax.swing.JLabel lblOptions;
private javax.swing.JLabel lblPL;
private javax.swing.JLabel lblPause;
private javax.swing.JLabel lblPower;
private javax.swing.JLabel lblPrev;
private javax.swing.JLabel lblRW;
private javax.swing.JLabel lblRecord;
private javax.swing.JLabel lblRed;
private javax.swing.JLabel lblSmartTv;
private javax.swing.JLabel lblSource;
private javax.swing.JLabel lblStop;
private javax.swing.JLabel lblText;
private javax.swing.JLabel lblTv;
private javax.swing.JLabel lblVolMinus;
private javax.swing.JLabel lblVolPlus;
private javax.swing.JLabel lblYellow;
private javax.swing.JSlider slVolume;
// End of variables declaration//GEN-END:variables
}
