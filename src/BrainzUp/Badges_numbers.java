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
public class Badges_numbers extends javax.swing.JPanel {

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
     * Creates new form Badges_numbers
     */
    public Badges_numbers() {
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

        btnBadge1N = new javax.swing.JButton();
        btnBadge2N = new javax.swing.JButton();
        btnBadge3N = new javax.swing.JButton();
        btnBadge4N = new javax.swing.JButton();
        btnBadge5N = new javax.swing.JButton();
        btnBadge6N = new javax.swing.JButton();
        lblBadge1N = new javax.swing.JLabel();
        lblBadge2N = new javax.swing.JLabel();
        lblBadge3N = new javax.swing.JLabel();
        lblBadge4N = new javax.swing.JLabel();
        lblBadge5N = new javax.swing.JLabel();
        lblBadge6N = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        ScreenLabel = new javax.swing.JLabel();
        curPlayer = new javax.swing.JLabel();
        Sound = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabelNumbers = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBadge1N.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge1N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge1N.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge1N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge1NActionPerformed(evt);
            }
        });
        add(btnBadge1N, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 90));

        btnBadge2N.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge2N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge2N.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge2N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge2NActionPerformed(evt);
            }
        });
        add(btnBadge2N, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 90));

        btnBadge3N.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge3N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge3N.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge3N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge3NActionPerformed(evt);
            }
        });
        add(btnBadge3N, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, 90));

        btnBadge4N.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge4N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge4N.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge4N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge4NActionPerformed(evt);
            }
        });
        add(btnBadge4N, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 90));

        btnBadge5N.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge5N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge5N.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge5N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge5NActionPerformed(evt);
            }
        });
        add(btnBadge5N, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, 90));

        btnBadge6N.setBackground(new java.awt.Color(255, 255, 255));
        btnBadge6N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-mark.jpg"))); // NOI18N
        btnBadge6N.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        btnBadge6N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadge6NActionPerformed(evt);
            }
        });
        add(btnBadge6N, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, 90));

        lblBadge1N.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge1N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge1N.setText("<Locked>");
        lblBadge1N.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblBadge1N, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 205, 120, 20));

        lblBadge2N.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge2N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge2N.setText("<Locked>");
        lblBadge2N.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblBadge2N, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 205, 120, 20));

        lblBadge3N.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge3N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge3N.setText("<Locked>");
        lblBadge3N.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblBadge3N, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 205, 120, 20));

        lblBadge4N.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge4N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge4N.setText("<Locked>");
        lblBadge4N.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblBadge4N, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 325, 120, 20));

        lblBadge5N.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge5N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge5N.setText("<Locked>");
        lblBadge5N.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblBadge5N, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 325, 120, 20));

        lblBadge6N.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lblBadge6N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge6N.setText("<Locked>");
        lblBadge6N.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblBadge6N, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 325, 120, 20));

        Logo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 153, 0));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("BrainzUp");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 40));

        ScreenLabel.setBackground(new java.awt.Color(153, 255, 255));
        ScreenLabel.setFont(new java.awt.Font("Lucida Grande", 1, 22)); // NOI18N
        ScreenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScreenLabel.setText("Numbers Badges");
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

        jLabelNumbers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hand_wallpaper.jpg"))); // NOI18N
        jLabelNumbers.setMaximumSize(new java.awt.Dimension(530, 420));
        jLabelNumbers.setMinimumSize(new java.awt.Dimension(530, 420));
        jLabelNumbers.setPreferredSize(new java.awt.Dimension(530, 420));
        add(jLabelNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBadge1NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge1NActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/numbers1.jpg");
        if (badges[0].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 1 of the Numbers Mix & Match game 1!", "Numbers Badge 1", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Numbers Mix & Match game to unlock it.", "Numbers Badge 1", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge1NActionPerformed

    private void btnBadge2NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge2NActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/numbers2.jpg");
        if (badges[1].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 2 of the Numbers Mix & Match game!", "Numbers Badge 2", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Numbers Mix & Match game to unlock it.", "Numbers Badge 2", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge2NActionPerformed

    private void btnBadge3NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge3NActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/numbers3.jpg");
        if (badges[2].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 1 of the Numbers Listen Up game 1!", "Numbers Badge 3", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Numbers Listen Up game to unlock it.", "Numbers Badge 3", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge3NActionPerformed

    private void btnBadge4NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge4NActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/numbers4.jpg");
        if (badges[3].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 2 of the Numbers Listen Up game!", "Numbers Badge 4", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Numbers Listen Up game to unlock it.", "Numbers Badge 4", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge4NActionPerformed

    private void btnBadge5NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge5NActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/numbers5.jpg");
        if (badges[4].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 1 of the Numbers Odd One out game!", "Numbers Badge 5", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Numbers Odd One Out game to unlock it.", "Numbers Badge 5", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge5NActionPerformed

    private void btnBadge6NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadge6NActionPerformed
        final ImageIcon icon = new ImageIcon("./src/Badges/numbers6.jpg");
        if (badges[5].equals("yes")) {
            JOptionPane.showMessageDialog(null, "Well done!!\nYou successfully finished round 2 of the Numbers Odd One out game!", "Numbers Badge 6", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "This badge is locked.\nPlay the Numbers Odd One Out game to unlock it.", "Numbers Badge 6", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnBadge6NActionPerformed

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
                    badges[0] = b.getN1();
                    badges[1] = b.getN2();
                    badges[2] = b.getN3();
                    badges[3] = b.getN4();
                    badges[4] = b.getN5();
                    badges[5] = b.getN6();
                }
                oinStream.close();
            }

        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println(e);
        }

        ImageIcon noBadge = new ImageIcon(getClass().getResource("/Images/question-mark.jpg"));

        if (badges[0].equals("yes")) {
            ImageIcon badgeN1 = new ImageIcon(getClass().getResource("/Badges/numbers1.jpg"));
            btnBadge1N.setIcon(badgeN1);
            lblBadge1N.setText("Mix & Match 1");
        } else {
            btnBadge1N.setIcon(noBadge);
            lblBadge1N.setText("<Locked>");
        }
        if (badges[1].equals("yes")) {
            ImageIcon badgeN2 = new ImageIcon(getClass().getResource("/Badges/numbers2.jpg"));
            btnBadge2N.setIcon(badgeN2);
            lblBadge2N.setText("Mix & Match 2");
        } else {
            btnBadge2N.setIcon(noBadge);
            lblBadge2N.setText("<Locked>");
        }
        if (badges[2].equals("yes")) {
            ImageIcon badgeN3 = new ImageIcon(getClass().getResource("/Badges/numbers3.jpg"));
            btnBadge3N.setIcon(badgeN3);
            lblBadge3N.setText("Listen Up 1");
        } else {
            btnBadge3N.setIcon(noBadge);
            lblBadge3N.setText("<Locked>");
        }
        if (badges[3].equals("yes")) {
            ImageIcon badgeN4 = new ImageIcon(getClass().getResource("/Badges/numbers4.jpg"));
            btnBadge4N.setIcon(badgeN4);
            lblBadge4N.setText("Listen Up 2");
        } else {
            btnBadge4N.setIcon(noBadge);
            lblBadge5N.setText("<Locked>");
        }
        if (badges[4].equals("yes")) {
            ImageIcon badgeN5 = new ImageIcon(getClass().getResource("/Badges/numbers5.jpg"));
            btnBadge5N.setIcon(badgeN5);
            lblBadge5N.setText("Odd One Out 1");
        } else {
            btnBadge5N.setIcon(noBadge);
            lblBadge5N.setText("<Locked>");
        }
        if (badges[5].equals("yes")) {
            ImageIcon badgeN6 = new ImageIcon(getClass().getResource("/Badges/numbers6.jpg"));
            btnBadge6N.setIcon(badgeN6);
            lblBadge6N.setText("Odd One Out 2");
        } else {
            btnBadge6N.setIcon(noBadge);
            lblBadge6N.setText("<Locked>");
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
    private javax.swing.JButton btnBadge1N;
    private javax.swing.JButton btnBadge2N;
    private javax.swing.JButton btnBadge3N;
    private javax.swing.JButton btnBadge4N;
    private javax.swing.JButton btnBadge5N;
    private javax.swing.JButton btnBadge6N;
    private javax.swing.JLabel curPlayer;
    private javax.swing.JLabel jLabelNumbers;
    private javax.swing.JLabel lblBadge1N;
    private javax.swing.JLabel lblBadge2N;
    private javax.swing.JLabel lblBadge3N;
    private javax.swing.JLabel lblBadge4N;
    private javax.swing.JLabel lblBadge5N;
    private javax.swing.JLabel lblBadge6N;
    // End of variables declaration//GEN-END:variables
}
