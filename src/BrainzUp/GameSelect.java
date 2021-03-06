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

/**
 *
 * @author Dennis
 */
public class GameSelect extends javax.swing.JPanel {

    private ArrayList<GameInfo> gameRound;
    private ArrayList<Member> current;
    File inFile;
    FileInputStream finStream;
    ObjectInputStream oinStream;
    File outFile;
    FileOutputStream fStream;
    ObjectOutputStream oStream;
    int round;
    int score;
    String correct;
    String subject;
    String userName;
    Integer[] corAnswer;
    int game;
    
    /**
     * Creates new form GameSelect
     */
    public GameSelect() {
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

        Sound = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        OddGame = new javax.swing.JButton();
        ListenGame = new javax.swing.JButton();
        MatchGame = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        ScreenLabel = new javax.swing.JLabel();
        curPlayer = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();
        CW_Bkgrd = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        Home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, 70));

        OddGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oddGame.jpeg"))); // NOI18N
        OddGame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));
        OddGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OddGameActionPerformed(evt);
            }
        });
        add(OddGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, 110));

        ListenGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/listenGame.jpeg"))); // NOI18N
        ListenGame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true));
        ListenGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListenGameActionPerformed(evt);
            }
        });
        add(ListenGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 110, 110));

        MatchGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/matchGame.png"))); // NOI18N
        MatchGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchGameActionPerformed(evt);
            }
        });
        add(MatchGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 110, 110));

        Logo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 153, 0));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("BrainzUp");
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 40));

        ScreenLabel.setBackground(new java.awt.Color(102, 153, 255));
        ScreenLabel.setFont(new java.awt.Font("Lucida Grande", 1, 22)); // NOI18N
        ScreenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScreenLabel.setText("Select Game");
        ScreenLabel.setOpaque(true);
        add(ScreenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, -1));

        curPlayer.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        curPlayer.setForeground(new java.awt.Color(0, 0, 204));
        curPlayer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(curPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        ExitBtn.setBackground(new java.awt.Color(255, 255, 255));
        ExitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        CW_Bkgrd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hand_wallpaper.jpg"))); // NOI18N
        CW_Bkgrd.setMaximumSize(new java.awt.Dimension(0, 0));
        CW_Bkgrd.setMinimumSize(new java.awt.Dimension(0, 0));
        CW_Bkgrd.setPreferredSize(new java.awt.Dimension(0, 0));
        add(CW_Bkgrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN PANEL");
        }
    }//GEN-LAST:event_HomeActionPerformed

    private void MatchGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchGameActionPerformed
        game = 1;
        ArrayList<GameInfo> gameRound = new ArrayList<>();
        GameInfo r = new GameInfo(round, score, subject, correct, userName, game);
        gameRound.add(r);
        try {
            outFile = new File("./src/SaveFiles/gameInfo.dat");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(gameRound);
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        gameRound.clear();
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "GAME1");
        }
    }//GEN-LAST:event_MatchGameActionPerformed

    private void OddGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OddGameActionPerformed
        game = 3;
        ArrayList<GameInfo> gameRound = new ArrayList<>();
        GameInfo r = new GameInfo(round, score, subject, correct, userName, game);
        gameRound.add(r);
        try {
            outFile = new File("./src/SaveFiles/gameInfo.dat");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(gameRound);
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        gameRound.clear();
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "GAME3");
        }
    }//GEN-LAST:event_OddGameActionPerformed

    private void ListenGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListenGameActionPerformed
        game = 2;
        ArrayList<GameInfo> gameRound = new ArrayList<>();
        GameInfo r = new GameInfo(round, score, subject, correct, userName, game);
        gameRound.add(r);
        try {
            outFile = new File("./src/SaveFiles/gameInfo.dat");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(gameRound);
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        gameRound.clear();
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "GAME2");
        }
    }//GEN-LAST:event_ListenGameActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //current player info is retrieved from current.dat file
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
        
        try {
            inFile = new File("./src/SaveFiles/gameInfo.dat");
            finStream = new FileInputStream(inFile);
            oinStream = new ObjectInputStream(finStream);
            gameRound = (ArrayList<GameInfo>) oinStream.readObject();
            for (GameInfo r : gameRound) {
                round = r.getRound();
                score = r.getScore();
                subject = r.getSubject();
                game = r.getGame();
                userName = r.getUserName();
                correct = r.getCorrect();
                oinStream.close();
            }
            gameRound.clear();
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formComponentShown

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundActionPerformed
        // TODO add your handling code here:
       LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "SOUND");
        }
    }//GEN-LAST:event_SoundActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CW_Bkgrd;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton Home;
    private javax.swing.JButton ListenGame;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton MatchGame;
    private javax.swing.JButton OddGame;
    private javax.swing.JLabel ScreenLabel;
    private javax.swing.JButton Sound;
    private javax.swing.JLabel curPlayer;
    // End of variables declaration//GEN-END:variables
}
