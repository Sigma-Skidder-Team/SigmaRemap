package com.mentalfrostbyte.jello.sound;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.InputStream;
import java.util.*;

public class SoundManager {
    public static final Map<String, Sound> SOUNDS = new HashMap<>();
    private static final String fileType = ".mp3";
    private static final List<String> VALID_SOUNDS = new ArrayList<>(
            Arrays.asList("activate", "deactivate", "click", "error", "pop", "connect", "switch", "clicksound")
    );

    public void play(String url) {
        if (!VALID_SOUNDS.contains(url)) {
            Client.getInstance().getLogger().warn("Invalid audio file attempted to be played: " + url);
        } else {
            try {
                InputStream audioStream = ResourceList.readInputStream("com/mentalfrostbyte/gui/resources/audio/" + url + fileType);

                AdvancedPlayer player = new AdvancedPlayer(audioStream);
                new Thread(() -> {
                    try {
                        player.play();
                    } catch (JavaLayerException e) {
                        Client.getInstance().getLogger().error("Error playing audio file: " + url + " : " + e.getMessage());
                    }
                }).start();

                Sound sound = new Sound(audioStream);
                SOUNDS.put(url, sound);
            } catch (JavaLayerException e) {
                Client.getInstance().getLogger().error("Unsupported audio file: " + url + " : " + e.getMessage());
            }
        }
    }

    public void init() {
    }
}
