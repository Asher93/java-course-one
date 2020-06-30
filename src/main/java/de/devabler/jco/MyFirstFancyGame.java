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
                   x = x-1;
                else if (input.getKeyType() == KeyType.ArrowRight && x != spielfeldBreite - 7) 
                    x = x+1;
                else if (input.getKeyType() == KeyType.ArrowUp) {
                    if (raketeSpieler == null){
                        raketeSpieler = new Rakete();
                        raketeSpieler.raketeX = x+3;
                        raketeSpieler.raketeY = y-1;
                    }

                }
                
            
        }

            textGraphics.putString(x,y, " -/|\\- ");
            
            if(raketeSpieler != null){
                textGraphics.putString(raketeSpieler.raketeX, raketeSpieler.raketeY+1, " ");
                textGraphics.putString(raketeSpieler.raketeX,raketeSpieler.raketeY, "I");
                raketeSpieler.raketeY = raketeSpieler.raketeY-1;
                if(raketeSpieler.raketeY < -1){
                    raketeSpieler = null;

                }

            }
            
            
            screen.refresh();
            Thread.sleep(100);
        }
     }
    }
