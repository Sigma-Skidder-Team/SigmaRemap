package com.mentalfrostbyte.jello.sound;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

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
            Client.getInstance().getLogger().method20357("Invalid audio file attempted to be played: " + url);
        } else {
            InputStream var4 = ResourcesDecrypter.readInputStream("com/mentalfrostbyte/gui/resources/audio/" + url + fileType);
            if (SOUNDS.containsKey(url) && SOUNDS.get(url).method10520()) {
                SOUNDS.get(url).method10518(var4);
                SOUNDS.get(url).method10521();
            } else {
                if (SOUNDS.containsKey(url)) {
                    SOUNDS.get(url).method10539();
                }

                Sound var5 = new Sound(var4);
                SOUNDS.put(url, var5);
                var5.method10521();
            }
        }
    }

    public void init() {
    }
}
