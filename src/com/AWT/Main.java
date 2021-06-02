package com.AWT;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        if (Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            for (Desktop.Action action:Desktop.Action.values()){
                System.out.println(action);
            }
            if (desktop.isSupported(Desktop.Action.OPEN)){
                desktop.open(new File("enot.jpeg"));
            }
            if (desktop.isSupported(Desktop.Action.BROWSE)){
                desktop.browse(new URI("https://google.com"));
            }
        }
    }
}
