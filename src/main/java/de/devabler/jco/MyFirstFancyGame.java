package de.devabler.jco;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

/**
 * Mein erstes krasses Spiel!
 */
public class MyFirstFancyGame {

    void runGame(Screen screen, TextGraphics textGraphics) throws Exception {
        var terminalSize = screen.getTerminalSize();
        var spielfeldBreite = terminalSize.getColumns();
        var x = terminalSize.getColumns() / 2;
        var y = terminalSize.getRows() -1;
        Rakete raketeSpieler = null;
        Rakete raketeGegner = null;
        while(true){
            var input = screen.pollInput();
            if (input != null){
                if (input.getKeyType() == KeyType.ArrowLeft && x != -1)
                   --x;
                else if (input.getKeyType() == KeyType.ArrowRight && x != spielfeldBreite - 7) 
                    ++x;
                else if (input.getKeyType() == KeyType.ArrowUp) {
                    raketeSpieler = new Rakete();
                    raketeSpieler.raketeX = x;
                    raketeSpieler.raketeY = y;
                }
                
            
        }

            textGraphics.putString(x,y, " -/|\\- ");
            
            textGraphics.putString(raketeSpieler.raketeX,raketeSpieler.raketeY, "I");
            screen.refresh();
            Thread.sleep(10);
        }
     }
    }
