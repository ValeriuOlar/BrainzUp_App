/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrainzUp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.CardLayout;
import java.awt.LayoutManager;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Vali
 */
public class BrainzUp_login extends javax.swing.JPanel {

    private ArrayList<Member> players;
    private ArrayList<Member> playersReg;
    private ArrayList<Member> playersLog;
    private ArrayList<Member> curPlay;
    private ArrayList<BadgeInfo> badgeInfo;
    private ArrayList<BadgeInfo> badgeInfoNew;
    File inFile;
    FileInputStream finStream;
    ObjectInputStream oinStream;
    File outFile;
    FileOutputStream fStream;
    ObjectOutputStream oStream;
    int checker;
    
     AUdios MC = new AUdios();
     public static int count;
    int xMouse;
    int yMouse;
    /**
     * Creates new form BrainzUp_login
     */
    public BrainzUp_login() {
        initComponents();
        players = new ArrayList<>();
        playersReg = new ArrayList<>();
        playersLog = new ArrayList<>();
        curPlay = new ArrayList<>();
        ArrayList<Member> current;
        badgeInfo = new ArrayList<>();
        badgeInfoNew = new ArrayList<>();
        checker = 0;
        String userName = "";
        try {
            inFile = new File("./src/SaveFiles/current.dat");
            finStream = new FileInputStream(inFile);
            oinStream = new ObjectInputStream(finStream);
            current = (ArrayList<Member>) oinStream.readObject();

            for (Member r : current) {
                userName = r.getName();
                oinStream.close();
            }
            current.clear();
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println(e);
        }
        curPlayer.setText(userName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        curPlayer = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hand_wallpaper.jpg"))); // NOI18N

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setDoubleBuffered(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 100, 100));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 100, 100));

        Logo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 153, 0));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("BrainzUp");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 40));

        curPlayer.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        curPlayer.setForeground(new java.awt.Color(0, 0, 204));
        curPlayer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(curPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, 70));

        ExitBtn.setBackground(new java.awt.Color(255, 255, 255));
        ExitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitBtn.setContentAreaFilled(false);
        ExitBtn.setOpaque(true);
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 100, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hand_wallpaper.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
//"./src/Sounds/cartoon003.wav"
        try {
            inFile = new File("./src/SaveFiles/players.dat");
            finStream = new FileInputStream(inFile);
            oinStream = new ObjectInputStream(finStream);
            players = (ArrayList<Member>) oinStream.readObject();
            oinStream.close();
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println(e);
        }

        //code found on http://www.experts-exchange.com/questions/20966351/JOptionPane-showInputDialog-password-field.html
        //and http://stackoverflow.com/questions/6555040/multiple-input-in-joptionpane-showinputdialog
        JTextField newName = new JTextField();
        JPasswordField newPassword = new JPasswordField(15);
        JPanel loginPanel = new JPanel();
        loginPanel.add(new JLabel("Name:"));
        loginPanel.add(newName);
        loginPanel.add(Box.createHorizontalStrut(15));
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(newPassword);
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
        loginPanel.add(newPassword);

        int result = JOptionPane.showConfirmDialog(null, loginPanel, "Please enter your Name and a Password", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if (newName.getText().equals("") || newPassword.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "Please enter both a user name and a password to register.");
            } else {
                //code found on http://www.coderanch.com/t/339016/GUI/java/JPasswordField-convert-String
                char[] pass = newPassword.getPassword();
                String passString = new String(pass) + newName.getText();
                if (players.isEmpty()) {
                    Member newMember = new Member(newName.getText(), passString);
                    players.add(newMember);
                    try {
                        outFile = new File("./src/SaveFiles/players.dat");
                        fStream = new FileOutputStream(outFile);
                        oStream = new ObjectOutputStream(fStream);
                        oStream.writeObject(players);
                        oStream.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    curPlayer.setText(newName.getText());
                    JOptionPane.showMessageDialog(null, "Welcome " + newName.getText());
                } else {
                    checker = 0;
                    for (Member n : players) {
                        if (n.getName().equals(newName.getText())) {
                            checker++;
                        }
                    }
                    if (checker > 0) {
                        JOptionPane.showMessageDialog(null, "The name " + newName.getText() + " is already taken - please enter a different name.");
                    } else {
                        Member newMember = new Member(newName.getText(), passString);
                        playersReg.add(newMember);
                        ArrayList<Member> combined = new ArrayList<>();
                        combined.addAll(players);
                        combined.addAll(playersReg);
                        curPlayer.setText(newName.getText());
                        JOptionPane.showMessageDialog(null, "Welcome " + newName.getText());
                        try {
                            outFile = new File("./src/SaveFiles/players.dat");
                            fStream = new FileOutputStream(outFile);
                            oStream = new ObjectOutputStream(fStream);
                            oStream.writeObject(combined);
                            oStream.close();
                        } catch (IOException e) {
                            System.out.println(e);
                        }
                        combined.clear();
                    }
                }
                if (checker == 0) {
                    //Add player to the current.dat file for application to be able to check active player's stats
                    Member currentPlayer = new Member(newName.getText(), passString);
                    curPlay.add(currentPlayer);
                    try {
                        outFile = new File("./src/SaveFiles/current.dat");
                        fStream = new FileOutputStream(outFile);
                        oStream = new ObjectOutputStream(fStream);
                        oStream.writeObject(curPlay);
                        oStream.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    curPlay.clear();

                    //Add player to the badges.dat file for application to be able to check active player's badges info
                    try {
                        inFile = new File("./src/SaveFiles/badgeInfo.dat");
                        finStream = new FileInputStream(inFile);
                        oinStream = new ObjectInputStream(finStream);
                        badgeInfo = (ArrayList<BadgeInfo>) oinStream.readObject();
                        oinStream.close();
                    } catch (IOException | ClassNotFoundException | NullPointerException e) {
                        System.out.println(e);
                    }
                    BadgeInfo badgez = new BadgeInfo(newName.getText(), "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no", "no");
                    badgeInfoNew.add(badgez);
                    ArrayList<BadgeInfo> combinedBadges = new ArrayList<>();
                    combinedBadges.addAll(badgeInfo);
                    combinedBadges.addAll(badgeInfoNew);
                    try {
                        outFile = new File("./src/SaveFiles/badgeInfo.dat");
                        fStream = new FileOutputStream(outFile);
                        oStream = new ObjectOutputStream(fStream);
                        oStream.writeObject(combinedBadges);
                        oStream.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    combinedBadges.clear();

                    LayoutManager layout = getParent().getLayout();
                    if (layout instanceof CardLayout) {
                        CardLayout cl = (CardLayout) layout;
                        cl.show(getParent(), "MAIN PANEL");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        int check = 0;
        try {
            inFile = new File("./src/SaveFiles/players.dat");
            finStream = new FileInputStream(inFile);
            oinStream = new ObjectInputStream(finStream);
            playersLog = (ArrayList<Member>) oinStream.readObject();
            oinStream.close();
        } catch (IOException | ClassNotFoundException e) {
            check = 1;
            JOptionPane.showMessageDialog(null, "There are currently no players registered.");

            //when selecting SEARCH option and no file is present
        } catch (NullPointerException e) {
            //when selecting CANCEL in search screen - with or without value in textfield - players.dat file exists
        }

        if (check == 0) {
            //code found on http://www.experts-exchange.com/questions/20966351/JOptionPane-showInputDialog-password-field.html
            //and http://stackoverflow.com/questions/6555040/multiple-input-in-joptionpane-showinputdialog
            JTextField loginName = new JTextField();
            JPasswordField loginPassword = new JPasswordField(15);
            JPanel loginPanel = new JPanel();
            loginPanel.add(new JLabel("Name:"));
            loginPanel.add(loginName);
            loginPanel.add(Box.createHorizontalStrut(15));
            loginPanel.add(new JLabel("Password:"));
            loginPanel.add(loginPassword);
            loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
            loginPanel.add(loginPassword);

            int response = JOptionPane.showConfirmDialog(null, loginPanel, "Please enter your Name and Password", JOptionPane.OK_CANCEL_OPTION);

            if (response == JOptionPane.OK_OPTION) {
                if (loginName.getText().equals("") || loginPassword.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(null, "Please enter both your user name and password.");
                } else {
                    //code found on http://www.coderanch.com/t/339016/GUI/java/JPasswordField-convert-String
                    char[] pass = loginPassword.getPassword();
                    String passString = new String(pass) + loginName.getText();

                    for (Member m : playersLog) {
                        if (m.getPassword().equals(passString)) {
                            checker++;
                            curPlayer.setText(m.getName());
                            JOptionPane.showMessageDialog(null, "Welcome " + m.getName());
                            Member currentPlayer = new Member(m.getName(), m.getPassword());
                            curPlay.add(currentPlayer);

                            try {
                                outFile = new File("./src/SaveFiles/current.dat");
                                fStream = new FileOutputStream(outFile);
                                oStream = new ObjectOutputStream(fStream);
                                oStream.writeObject(curPlay);
                                oStream.close();
                            } catch (IOException e) {
                                System.out.println(e);
                            }
                            curPlay.clear();
                            LayoutManager layout = getParent().getLayout();
                            if (layout instanceof CardLayout) {
                                CardLayout cl = (CardLayout) layout;
                                cl.show(getParent(), "MAIN PANEL");
                            }
                        }
                    }
                    if (checker == 0) {
                        JOptionPane.showMessageDialog(null, "Player details not found - please check user name & password entered are correct");
                    }
                }
            }
            playersLog.clear();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "MAIN PANEL");
        }
    }//GEN-LAST:event_HomeActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel curPlayer;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
