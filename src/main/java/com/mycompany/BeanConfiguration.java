package com.mycompany;

import com.mycompany.jukebox.Song;
import com.mycompany.jukebox.implementation.Jukebox;
import com.mycompany.jukebox.implementation.PlaylistEditor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan (basePackages = {"com.mycompany.jukebox"}, lazyInit = true)
public class BeanConfiguration {
}
