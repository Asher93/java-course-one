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
        var x = terminalSize.getColumns() / 2;
        var y = terminalSize.getRows() -1;
        while(true){
            var input = screen.pollInput();
            if (input.getKeyType() == KeyType.ArrowLeft)
                textGraphics
            else if (input.getKeyType() == KeyType.ArrowRight)

            textGraphics.putString(x,y, "-/|\\-");
            screen.refresh();
            Thread.sleep(2000);
        }
     }
}
