package com.mycompany;

import com.mycompany.jukebox.PlaylistEditorInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Aleksandr_Bobryshev
 */
public class Main {

    public final static ApplicationContext APPLICATION_CONTEXT =
            new AnnotationConfigApplicationContext(BeanConfiguration.class);

    public static void main(String... args) {
        PlaylistEditorInterface editor = APPLICATION_CONTEXT.getBean(PlaylistEditorInterface.class);

        System.out.println("Insert a coin!");
        editor.setPlaylist(1, 4, 3, 6);
        editor.printPlaylist();
    }

}
