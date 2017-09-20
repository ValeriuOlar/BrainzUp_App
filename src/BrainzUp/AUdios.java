/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrainzUp;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class AUdios 
{

    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    public long songTotalLength;
    public long pauseLocation;
    public String fileLocation;

    
    public void Stop()
    {
        if (player != null)
        {
            player.close();
            
            songTotalLength = 0;
            pauseLocation = 0;
            
            MP3PlayerGU1.Display.setText("");
        }
    }
    public void Pause()
    {
        if (player != null)
        {
            try
            {
               pauseLocation = FIS.available();
               player.close();
            }
            catch (IOException ex) 
            {
                
            }
        }
    }
    public void Resume()
    {
        try
        {
        FIS = new FileInputStream(fileLocation);
        BIS = new BufferedInputStream(FIS);
        
        player = new Player (BIS);
        
        FIS.skip(songTotalLength - pauseLocation);
    }
    catch (FileNotFoundException | JavaLayerException ex)
    {
        
    }   
        catch (IOException ex) {
            Logger.getLogger(AUdios.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread()
        {
    @Override
    public void run()
    {
        try {
            player.play();
        } catch (JavaLayerException ex) 
        {
            
        }
    }
}.start();
    }
     
    public void Play(String path)
    {
        try
        {
        FIS = new FileInputStream(path);
        BIS = new BufferedInputStream(FIS);
        
        player = new Player (BIS);
        
        songTotalLength = FIS.available();
        
        fileLocation = path + "";
    }
    catch (FileNotFoundException | JavaLayerException ex)
    {
        
    }  
        catch (IOException ex) {
            Logger.getLogger(AUdios.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread()
        {
    @Override
    public void run()
    {
        try {
            player.play();
            
            if(player.isComplete()&& MP3PlayerGU1.count == 1)
            {
                Play(fileLocation);
            }
            if(player.isComplete());
            {
                MP3PlayerGU1.Display.setText("");
            }
        } 
        catch (JavaLayerException ex) 
        {
            
        }
    }
}.start();
    }
}


