/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrainzUp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Vali
 */
public class BrainzUp {

    public static void main(String[] args) {

        ArrayList<Member> curPlay = new ArrayList<>();
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        Member currentPlayer = new Member("guest", "");
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
        Main_GUI gui = new Main_GUI();
        gui.setVisible(true);
    }
}
