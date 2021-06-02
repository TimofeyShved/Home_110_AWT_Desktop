package com.AWT;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        if (Desktop.isDesktopSupported()){ // проверка, что можно вызывать приложения из вне

            Desktop desktop = Desktop.getDesktop(); // добавляем переменную для работы с внешним миром (программами)

            for (Desktop.Action action:Desktop.Action.values()){ // цикл всех действия с внешним миром (программами)
                System.out.println(action);
            }

            if (desktop.isSupported(Desktop.Action.OPEN)){ // открыть картинку
                desktop.open(new File("enot.jpeg"));
            }

            if (desktop.isSupported(Desktop.Action.BROWSE)){ // открыть ссылку
                desktop.browse(new URI("https://google.com"));
            }
        }
    }
}
