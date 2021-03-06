/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrainzUp;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author x14102145
 */
public class Badges_colours extends javax.swing.JPanel {

    private ArrayList<Member> current;
    private ArrayList<BadgeInfo> badgez;
    File inFile;
    FileInputStream finStream;
    ObjectInputStream oinStream;
    File outFile;
    FileOutputStream fStream;
    ObjectOutputStream oStream;
    String[] badges;
    String curPlay;

    /**
     * Creates new form Badges_colours
     */
    public Badges_colours() {
        initComponents();
        ArrayList<Member> current = new ArrayList<>();
        ArrayList<BadgeInfo> badgez = new ArrayList<>();
        badges = new String[6];
        curPlay = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBadge1C = new javax.swing.JButton();
        btnBadge2C = new javax.swing.JButton();
        btnBadge3C = new javax.swing.JButton();
        btnBadge4C = new javax.swing.JButton();
        btnBadge5C = new javax.swing.JButton();
        btnBadge6C = new javax.swing.JButton();
        lblBadge1C = new javax.swing.JLabel();
        lblBadge2C = new javax.swing.JLabel();
        lblBadge3C = new javax.swing.JLabel();
        lblBadge4C = new javax.swing.JLabel();
        lblBadge5C = new javax.swing.JLabel();
        lblBadge6C = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        ScreenLabel = new javax.swing.JLabel();
        curPlayer = new javax.swing.JLabel();
        Sound = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabelColours = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBadge1C.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge1C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge1C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge1CActionPerformed(evt);
            }
        });
        add(btnBadge1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 90));

        btnBadge2C.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge2C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge2C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge2CActionPerformed(evt);
            }
        });
        add(btnBadge2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 90));

        btnBadge3C.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge3C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge3C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge3CActionPerformed(evt);
            }
        });
        add(btnBadge3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, 90));

        btnBadge4C.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge4C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge4C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge4C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge4CActionPerformed(evt);
            }
        });
        add(btnBadge4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 90));

        btnBadge5C.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge5C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge5C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge5C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge5CActionPerformed(evt);
            }
        });
        add(btnBadge5C, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, 90));

        btnBadge6C.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge6C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge6C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge6C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge6CActionPerformed(evt);
            }
        });
        add(btnBadge6C, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, 90));

        lblBadge1C.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge1C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge1C.setText("<Locked>");
        add(lblBadge1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 205, 120, 20));

        lblBadge2C.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge2C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge2C.setText("<Locked>");
        add(lblBadge2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 205, 120, 20));

        lblBadge3C.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge3C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge3C.setText("<Locked>");
        add(lblBadge3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 205, 120, 20));

        lblBadge4C.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge4C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge4C.setText("<Locked>");
        add(lblBadge4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 325, 120, 20));

        lblBadge5C.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge5C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge5C.setText("<Locked>");
        add(lblBadge5C, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 325, 120, 20));

        lblBadge6C.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge6C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge6C.setText("<Locked>");
        add(lblBadge6C, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 325, 120, 20));

        Logo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 153, 0));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("BrainzUp");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 40));

        ScreenLabel.setBackground(new java.awt.Color(153, 255, 255));
        ScreenLabel.setFont(new java.awt.Font("Lucida Grande", 1, 22)); // NOI18N
        ScreenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScreenLabel.setText("Colours Badges");
        ScreenLabel.setOpaque(true);
        add(ScreenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, -1));

        curPlayer.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        curPlayer.setForeground(new java.awt.Color(0, 0, 204));
        curPlayer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(curPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        Sound.setBackground(new java.awt.Color(255, 255, 255));
        Sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.jpg"))); // NOI18N
        Sound.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sound.setContentAreaFilled(false);
        Sound.setOpaque(true);
        Sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundActionPerformed(evt);
            }
        });
        add(Sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 70));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        BackBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackBtn.setContentAreaFilled(false);
        BackBtn.setOpaque(true);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, 70));

        jLabelColours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hand_wallpaper.jpg"))); // NOI18N
        add(jLabelColours, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBadge1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge1CActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/colours1.jpg");
        if (badges[0].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 1 of the Colours Mix & Match game 1!", "Colours Badge 1", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Colours Mix & Match game to unlock it.", "Colours Badge 1", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge1CActionPerformed

    private void btnBadge2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge2CActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/colours2.jpg");
        if (badges[1].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 2 of the Colours Mix & Match game!", "Colours Badge 2", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Colours Mix & Match game to unlock it.", "Colours Badge 2", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge2CActionPerformed

    private void btnBadge3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge3CActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/colours3.jpg");
        if (badges[2].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 1 of the Colours Listen Up game 1!", "Colours Badge 3", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Colours Listen Up game to unlock it.", "Colours Badge 3", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge3CActionPerformed

    private void btnBadge4CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge4CActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/colours4.jpg");
        if (badges[3].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 2 of the Colours Listen Up game!", "Colours Badge 4", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Colours Listen Up game to unlock it.", "Colours Badge 4", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge4CActionPerformed

    private void btnBadge5CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge5CActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/colours5.jpg");
        if (badges[4].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 1 of the Colours Odd One out game!", "Colours Badge 5", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Colours Odd One Out game to unlock it.", "Colours Badge 5", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge5CActionPerformed

    private void btnBadge6CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge6CActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/colours6.jpg");
        if (badges[5].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 2 of the Colours Odd One out game!", "Colours Badge 6", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Colours Odd One Out game to unlock it.", "Colours Badge 6", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge6CActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //current player info is retrieved from current.dat file
        try {
            inFile = new File("./src/SaveFiles/current.dat");
            finStream = new FileInputStream(inFile);
            oinStream = new ObjectInputStream(finStream);
            current = (ArrayList<Member>) oinStream.readObject();

            for (Member r : current) {
                curPlay = r.getName();
                oinStream.close();
            }
            current.clear();
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println(e);
        }
        curPlayer.setText(curPlay);
        //player's badgeinfo is retrieved from badgeInfo.dat file
        try {
            inFile = new File("./src/SaveFiles/badgeInfo.dat");
            finStream = new FileInputStream(inFile);
            oinStream = new ObjectInputStream(finStream);
            badgez = (ArrayList<BadgeInfo>) oinStream.readObject();

            for (BadgeInfo b : badgez) {
                if (b.getUserName().equals(curPlay)) {
                    badges[0] = b.getC1();
                    badges[1] = b.getC2();
                    badges[2] = b.getC3();
                    badges[3] = b.getC4();
                    badges[4] = b.getC5();
                    badges[5] = b.getC6();
                }
                oinStream.close();
            }

        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println(e);
        }

        ImageIcon noBadge = new ImageIcon(getClass().getResource("/Images/question-mark.jpg"));

        if (badges[0].equals("yes")) {
            ImageIcon badgeC1 = new ImageIcon(getClass().getResource("/Badges/colours1.jpg"));
            btnBadge1C.setIcon(badgeC1);
            lblBadge1C.setText("Mix & Match 1");
        } else {
            btnBadge1C.setIcon(noBadge);
            lblBadge1C.setText("<Locked>");
        }
        if (badges[1].equals("yes")) {
            ImageIcon badgeC2 = new ImageIcon(getClass().getResource("/Badges/colours2.jpg"));
            btnBadge2C.setIcon(badgeC2);
            lblBadge2C.setText("Mix & Match 2");
        } else {
            btnBadge2C.setIcon(noBadge);
            lblBadge2C.setText("<Locked>");
        }
        if (badges[2].equals("yes")) {
            ImageIcon badgeC3 = new ImageIcon(getClass().getResource("/Badges/colours3.jpg"));
            btnBadge3C.setIcon(badgeC3);
            lblBadge3C.setText("Listen Up 1");
        } else {
            btnBadge3C.setIcon(noBadge);
            lblBadge3C.setText("<Locked>");
        }
        if (badges[3].equals("yes")) {
            ImageIcon badgeC4 = new ImageIcon(getClass().getResource("/Badges/colours4.jpg"));
            btnBadge4C.setIcon(badgeC4);
            lblBadge4C.setText("Listen Up 2");
        } else {
            btnBadge4C.setIcon(noBadge);
            lblBadge5C.setText("<Locked>");
        }
        if (badges[4].equals("yes")) {
            ImageIcon badgeC5 = new ImageIcon(getClass().getResource("/Badges/colours5.jpg"));
            btnBadge5C.setIcon(badgeC5);
            lblBadge5C.setText("Odd One Out 1");
        } else {
            btnBadge5C.setIcon(noBadge);
            lblBadge5C.setText("<Locked>");
        }
        if (badges[5].equals("yes")) {
            ImageIcon badgeC6 = new ImageIcon(getClass().getResource("/Badges/colours6.jpg"));
            btnBadge6C.setIcon(badgeC6);
            lblBadge6C.setText("Odd One Out 2");
        } else {
            btnBadge6C.setIcon(noBadge);
            lblBadge6C.setText("<Locked>");
        }
    }//GEN-LAST:event_formComponentShown

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "BADGES");
        }
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "SOUND");
        }
    }//GEN-LAST:event_SoundActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel ScreenLabel;
    private javax.swing.JButton Sound;
    private javax.swing.JButton btnBadge1C;
    private javax.swing.JButton btnBadge2C;
    private javax.swing.JButton btnBadge3C;
    private javax.swing.JButton btnBadge4C;
    private javax.swing.JButton btnBadge5C;
    private javax.swing.JButton btnBadge6C;
    private javax.swing.JLabel curPlayer;
    private javax.swing.JLabel jLabelColours;
    private javax.swing.JLabel lblBadge1C;
    private javax.swing.JLabel lblBadge2C;
    private javax.swing.JLabel lblBadge3C;
    private javax.swing.JLabel lblBadge4C;
    private javax.swing.JLabel lblBadge5C;
    private javax.swing.JLabel lblBadge6C;
    // End of variables declaration//GEN-END:variables
}
