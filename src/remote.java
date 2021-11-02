
import java.awt.Color;
import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSLUCENT;
import java.awt.GraphicsEnvironment;
import java.awt.KeyboardFocusManager;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;

public class remote extends javax.swing.JFrame {

    private int x1;
    private int x2;
    kumanda K;

    public remote() {

        initComponents();
        setBackground(new Color(0, 0, 0, 0));

// Determine what the GraphicsDevice can support.
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        boolean isPerPixelTranslucencySupported = gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);
//If translucent windows aren't supported, exit.
        if (!isPerPixelTranslucencySupported) {
            K.LOGGER.logger.append("\n Per-pixel translucency is not supported");
            System.exit(0);
        }
        K.LOGGER.logger.append("\n Creating Runnable...");
        Runnable runnable = () -> {
            K.LOGGER.logger.append("\n Inside : " + Thread.currentThread().getName());
            K = new kumanda(cmbSources, cmbChannels, slider);
            K.bağlantıBul();
        };

        K.LOGGER.logger.append("\nCreating Thread...");
        Thread thread = new Thread(runnable);

        K.LOGGER.logger.append("\nStarting Thread...");
        thread.start();

        slider.addChangeListener((ChangeEvent evt) -> {
            JSlider slider1 = (JSlider) evt.getSource();
            if (!slider1.getValueIsAdjusting()) {
                int value = slider1.getValue();
                K.LOGGER.logger.append("\n Volume Set:" + value);
                K.volumeSet(value, false);
            }
        });
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher((KeyEvent e) -> {
                    if (e.getKeyCode() == 112 && e.getID() == KeyEvent.KEY_RELEASED) {
                        K.LOGGER.setVisible(true);
                    }
                    return false;
                });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPower = new javax.swing.JLabel();
        lblRecord = new javax.swing.JLabel();
        lblPause = new javax.swing.JLabel();
        lblStop = new javax.swing.JLabel();
        lblFF = new javax.swing.JLabel();
        lblPlayPause = new javax.swing.JLabel();
        lblRW = new javax.swing.JLabel();
        lblBlue = new javax.swing.JLabel();
        lblYellow = new javax.swing.JLabel();
        lblGreen = new javax.swing.JLabel();
        lblRed = new javax.swing.JLabel();
        lblAdjust = new javax.swing.JLabel();
        lblFind = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblCursorUp = new javax.swing.JLabel();
        lblCursorDown = new javax.swing.JLabel();
        lblCursorLeft = new javax.swing.JLabel();
        lblCursorRight = new javax.swing.JLabel();
        lblChPlus = new javax.swing.JLabel();
        lblChMinus = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblOptions = new javax.swing.JLabel();
        lblSource = new javax.swing.JLabel();
        lblVolPlus = new javax.swing.JLabel();
        lblMute = new javax.swing.JLabel();
        lblVolMinus = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        lblAltYazı = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        btnCikis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbSources = new javax.swing.JComboBox<>();
        cmbChannels = new javax.swing.JComboBox<>();
        lblInfo = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblPrev = new javax.swing.JLabel();
        lblOnline = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lbl3d = new javax.swing.JLabel();
        lblLight = new javax.swing.JLabel();
        lblGuide = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(346, 638));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(346, 638));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        lblPower.setText("          ");
        lblPower.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPowerMouseClicked(evt);
            }
        });
        getContentPane().add(lblPower);
        lblPower.setBounds(120, 30, 20, 20);

        lblRecord.setText("  ");
        lblRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecordMouseClicked(evt);
            }
        });
        getContentPane().add(lblRecord);
        lblRecord.setBounds(180, 60, 20, 14);

        lblPause.setText("  ");
        lblPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPauseMouseClicked(evt);
            }
        });
        getContentPane().add(lblPause);
        lblPause.setBounds(120, 60, 20, 14);

        lblStop.setText("  ");
        lblStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStopMouseClicked(evt);
            }
        });
        getContentPane().add(lblStop);
        lblStop.setBounds(60, 60, 20, 20);

        lblFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFFMouseClicked(evt);
            }
        });
        getContentPane().add(lblFF);
        lblFF.setBounds(180, 90, 20, 20);

        lblPlayPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlayPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayPauseMouseClicked(evt);
            }
        });
        getContentPane().add(lblPlayPause);
        lblPlayPause.setBounds(120, 90, 20, 10);

        lblRW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRWMouseClicked(evt);
            }
        });
        getContentPane().add(lblRW);
        lblRW.setBounds(60, 90, 20, 20);

        lblBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBlue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlueMouseClicked(evt);
            }
        });
        getContentPane().add(lblBlue);
        lblBlue.setBounds(170, 130, 40, 20);

        lblYellow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblYellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYellowMouseClicked(evt);
            }
        });
        getContentPane().add(lblYellow);
        lblYellow.setBounds(130, 130, 40, 20);

        lblGreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGreenMouseClicked(evt);
            }
        });
        getContentPane().add(lblGreen);
        lblGreen.setBounds(90, 130, 40, 20);

        lblRed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRedMouseClicked(evt);
            }
        });
        getContentPane().add(lblRed);
        lblRed.setBounds(40, 130, 40, 20);

        lblAdjust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdjust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdjustMouseClicked(evt);
            }
        });
        getContentPane().add(lblAdjust);
        lblAdjust.setBounds(190, 160, 30, 30);

        lblFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFindMouseClicked(evt);
            }
        });
        getContentPane().add(lblFind);
        lblFind.setBounds(40, 160, 30, 30);

        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        getContentPane().add(lblHome);
        lblHome.setBounds(120, 170, 20, 20);

        lblCursorUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCursorUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursorUpMouseClicked(evt);
            }
        });
        getContentPane().add(lblCursorUp);
        lblCursorUp.setBounds(110, 200, 40, 20);

        lblCursorDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCursorDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursorDownMouseClicked(evt);
            }
        });
        getContentPane().add(lblCursorDown);
        lblCursorDown.setBounds(120, 270, 20, 20);

        lblCursorLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCursorLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursorLeftMouseClicked(evt);
            }
        });
        getContentPane().add(lblCursorLeft);
        lblCursorLeft.setBounds(80, 240, 20, 20);

        lblCursorRight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCursorRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCursorRightMouseClicked(evt);
            }
        });
        getContentPane().add(lblCursorRight);
        lblCursorRight.setBounds(160, 240, 20, 20);

        lblChPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChPlusMouseClicked(evt);
            }
        });
        getContentPane().add(lblChPlus);
        lblChPlus.setBounds(190, 230, 20, 30);

        lblChMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChMinusMouseClicked(evt);
            }
        });
        getContentPane().add(lblChMinus);
        lblChMinus.setBounds(40, 240, 30, 20);

        lblConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmMouseClicked(evt);
            }
        });
        getContentPane().add(lblConfirm);
        lblConfirm.setBounds(110, 230, 40, 30);

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(100, 310, 50, 20);

        lblOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOptionsMouseClicked(evt);
            }
        });
        getContentPane().add(lblOptions);
        lblOptions.setBounds(190, 300, 30, 30);

        lblSource.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSource.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSourceMouseClicked(evt);
            }
        });
        getContentPane().add(lblSource);
        lblSource.setBounds(40, 300, 30, 30);

        lblVolPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolPlusMouseClicked(evt);
            }
        });
        getContentPane().add(lblVolPlus);
        lblVolPlus.setBounds(180, 370, 40, 20);

        lblMute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMuteMouseClicked(evt);
            }
        });
        getContentPane().add(lblMute);
        lblMute.setBounds(110, 370, 40, 20);

        lblVolMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolMinusMouseClicked(evt);
            }
        });
        getContentPane().add(lblVolMinus);
        lblVolMinus.setBounds(40, 370, 30, 20);

        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });
        getContentPane().add(lbl1);
        lbl1.setBounds(40, 400, 50, 20);

        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });
        getContentPane().add(lbl2);
        lbl2.setBounds(110, 410, 40, 20);

        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });
        getContentPane().add(lbl3);
        lbl3.setBounds(180, 400, 40, 20);

        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });
        getContentPane().add(lbl4);
        lbl4.setBounds(40, 440, 40, 20);

        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });
        getContentPane().add(lbl5);
        lbl5.setBounds(110, 440, 40, 20);

        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });
        getContentPane().add(lbl6);
        lbl6.setBounds(180, 440, 40, 20);

        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });
        getContentPane().add(lbl7);
        lbl7.setBounds(50, 480, 40, 20);

        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });
        getContentPane().add(lbl8);
        lbl8.setBounds(110, 480, 40, 20);

        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });
        getContentPane().add(lbl9);
        lbl9.setBounds(170, 480, 40, 20);

        lblText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTextMouseClicked(evt);
            }
        });
        getContentPane().add(lblText);
        lblText.setBounds(170, 520, 30, 20);

        lbl0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl0MouseClicked(evt);
            }
        });
        getContentPane().add(lbl0);
        lbl0.setBounds(110, 520, 30, 20);

        lblAltYazı.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAltYazı.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAltYazıMouseClicked(evt);
            }
        });
        getContentPane().add(lblAltYazı);
        lblAltYazı.setBounds(50, 520, 40, 20);

        slider.setBackground(new java.awt.Color(0, 0, 0));
        slider.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        slider.setForeground(new java.awt.Color(255, 255, 255));
        slider.setMajorTickSpacing(10);
        slider.setMaximum(60);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setValue(10);
        slider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        slider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(slider);
        slider.setBounds(13, 330, 230, 40);

        btnCikis.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnCikis.setText("Çıkış");
        btnCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });
        getContentPane().add(btnCikis);
        btnCikis.setBounds(110, 600, 60, 20);

        jLabel1.setText("Aygıtlar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 550, 50, 14);

        jLabel2.setText("Kanallar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 550, 50, 14);

        cmbSources.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSourcesİtemStateChanged(evt);
            }
        });
        getContentPane().add(cmbSources);
        cmbSources.setBounds(20, 570, 110, 20);

        cmbChannels.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbChannelsİtemStateChanged(evt);
            }
        });
        getContentPane().add(cmbChannels);
        cmbChannels.setBounds(140, 570, 110, 20);

        lblInfo.setBackground(new java.awt.Color(0, 255, 0));
        lblInfo.setText("İ");
        lblInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfo.setOpaque(true);
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });
        getContentPane().add(lblInfo);
        lblInfo.setBounds(80, 160, 8, 20);

        lblNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });
        getContentPane().add(lblNext);
        lblNext.setBounds(220, 240, 20, 20);

        lblPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrevMouseClicked(evt);
            }
        });
        getContentPane().add(lblPrev);
        lblPrev.setBounds(10, 240, 30, 20);

        lblOnline.setBackground(new java.awt.Color(153, 255, 255));
        lblOnline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOnline.setText("16:9");
        lblOnline.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblOnline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOnline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOnline.setOpaque(true);
        lblOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOnlineMouseClicked(evt);
            }
        });
        getContentPane().add(lblOnline);
        lblOnline.setBounds(30, 200, 30, 20);

        lblInfo1.setBackground(new java.awt.Color(255, 204, 0));
        lblInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo1.setText(".");
        lblInfo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblInfo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfo1.setOpaque(true);
        lblInfo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfo1MouseClicked(evt);
            }
        });
        getContentPane().add(lblInfo1);
        lblInfo1.setBounds(30, 260, 8, 20);

        lblInfo2.setBackground(new java.awt.Color(255, 204, 0));
        lblInfo2.setText("view");
        lblInfo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblInfo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfo2.setOpaque(true);
        lblInfo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfo2MouseClicked(evt);
            }
        });
        getContentPane().add(lblInfo2);
        lblInfo2.setBounds(160, 30, 30, 18);

        lblExit.setBackground(new java.awt.Color(255, 0, 51));
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("TV");
        lblExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit);
        lblExit.setBounds(160, 160, 20, 20);

        lbl3d.setBackground(new java.awt.Color(255, 0, 51));
        lbl3d.setForeground(new java.awt.Color(255, 255, 255));
        lbl3d.setText("3D");
        lbl3d.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl3d.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl3d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl3d.setOpaque(true);
        lbl3d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3dMouseClicked(evt);
            }
        });
        getContentPane().add(lbl3d);
        lbl3d.setBounds(200, 190, 30, 18);

        lblLight.setBackground(new java.awt.Color(255, 0, 51));
        lblLight.setForeground(new java.awt.Color(255, 255, 255));
        lblLight.setText("Amblight");
        lblLight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLight.setOpaque(true);
        lblLight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLightMouseClicked(evt);
            }
        });
        getContentPane().add(lblLight);
        lblLight.setBounds(180, 260, 60, 20);

        lblGuide.setBackground(new java.awt.Color(255, 0, 51));
        lblGuide.setForeground(new java.awt.Color(255, 255, 255));
        lblGuide.setText("Guide");
        lblGuide.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblGuide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblGuide.setOpaque(true);
        lblGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuideMouseClicked(evt);
            }
        });
        getContentPane().add(lblGuide);
        lblGuide.setBounds(60, 30, 40, 20);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remote.png"))); // NOI18N
        lbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblMouseDragged(evt);
            }
        });
        lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMousePressed(evt);
            }
        });
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 255, 551);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void lblPowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPowerMouseClicked
    K.komutGönder("Standby");
}//GEN-LAST:event_lblPowerMouseClicked

private void lblMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x - x1, y - x2);
}//GEN-LAST:event_lblMouseDragged

private void lblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMousePressed
    x1 = evt.getX();
    x2 = evt.getY();
}//GEN-LAST:event_lblMousePressed

private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
    System.exit(0);
}//GEN-LAST:event_btnCikisActionPerformed

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

private void lblPlayPauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayPauseMouseClicked
    K.komutGönder("PlayPause");
}//GEN-LAST:event_lblPlayPauseMouseClicked

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

private void lblAdjustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdjustMouseClicked
    K.komutGönder("Adjust");
}//GEN-LAST:event_lblAdjustMouseClicked

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

private void lbl3dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3dMouseClicked
    K.komutGönder("3d");
}//GEN-LAST:event_lbl3dMouseClicked

private void lblLightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLightMouseClicked
    K.komutGönder("AmbilightOnOff");
}//GEN-LAST:event_lblLightMouseClicked

private void lblGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuideMouseClicked
    K.komutGönder("Guide");
}//GEN-LAST:event_lblGuideMouseClicked

 private void lblConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseClicked
     K.komutGönder("Confirm");
 }//GEN-LAST:event_lblConfirmMouseClicked

private void cmbSourcesİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSourcesİtemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
        if (cmbSources.getItemCount() > 0) {
            ComboItem M = (ComboItem) cmbSources.getSelectedItem();
            K.sourcesSet(M.getId());
        }
    }
}//GEN-LAST:event_cmbSourcesİtemStateChanged

private void cmbChannelsİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChannelsİtemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
        if (cmbChannels.getItemCount() > 0) {
            ComboItem M = (ComboItem) cmbChannels.getSelectedItem();
            K.channelsSet(M.getId());

        }
    }
}//GEN-LAST:event_cmbChannelsİtemStateChanged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        K.komutGönder("WatchTV");
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        K.komutGönder("Info");
    }//GEN-LAST:event_lblInfoMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked

        K.komutGönder("Next");
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrevMouseClicked

        K.komutGönder("Previous");
    }//GEN-LAST:event_lblPrevMouseClicked

    private void lblOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOnlineMouseClicked
        K.komutGönder("Online");
    }//GEN-LAST:event_lblOnlineMouseClicked

    private void lblInfo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfo1MouseClicked
       K.komutGönder("Dot");
    }//GEN-LAST:event_lblInfo1MouseClicked

    private void lblInfo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfo2MouseClicked
        K.komutGönder("Dot");
    }//GEN-LAST:event_lblInfo2MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(remote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new remote().setVisible(true);

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JComboBox<String> cmbChannels;
    private javax.swing.JComboBox<String> cmbSources;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl3d;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblAdjust;
    private javax.swing.JLabel lblAltYazı;
    private javax.swing.JLabel lblBack;
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
    private javax.swing.JLabel lblGreen;
    private javax.swing.JLabel lblGuide;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblLight;
    private javax.swing.JLabel lblMute;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOnline;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JLabel lblPause;
    private javax.swing.JLabel lblPlayPause;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JLabel lblRW;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblRed;
    private javax.swing.JLabel lblSource;
    private javax.swing.JLabel lblStop;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblVolMinus;
    private javax.swing.JLabel lblVolPlus;
    private javax.swing.JLabel lblYellow;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
