// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4378;
import mapped.Class5723;
import mapped.EventListener;

public class ChatCleaner extends Module
{
    public ChatCleaner() {
        super(Category.MISC, "ChatCleaner", "Cleans chat in atempt to avoid spam on anarchy servers");
    }
    
    @EventListener
    private void method10509(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4378) {
                if (this.method10511(this.method10510(((Class4378)class5723.method16998()).method13164().getString()))) {
                    class5723.method16961(true);
                }
            }
        }
    }
    
    private String method10510(String s) {
        if (!s.startsWith("<")) {
            s = s.replaceAll("^(.*?): ", "");
        }
        else {
            s = s.replaceAll("^(.*?)> ", "");
        }
        return s.toLowerCase();
    }
    
    private boolean method10511(final String s) {
        return s.startsWith("> ") || s.contains("http://") || s.contains("https://") || s.contains("discord.gg") || s.contains("www.") || s.contains("\u02b3\u1d58\u02e2\u02b0\u1d49\u02b3\u02b0\u1d43\u1d9c\u1d4f") || s.contains("\u267f") || s.contains("/ignore") || s.contains("#TeamRusher") || s.contains("Default Message") || s.contains("wwe") || s.contains("future") || s.contains("iknowimez") || s.contains("lol get gud") || s.contains(": [") || s.contains("] [") || s.startsWith("!") || (s.startsWith("TPS: ") && s.endsWith(".")) || (s.startsWith("Hey, ") && s.endsWith(".")) || (s.startsWith("Hello, ") && s.endsWith(".")) || (s.startsWith("Farewell, ") && s.endsWith(".")) || (s.startsWith("Howdy, ") && s.endsWith(".")) || (s.startsWith("Good evening, ") && s.endsWith(".")) || (s.startsWith("Good bye, ") && s.endsWith(".")) || (s.startsWith("Bye, ") && s.endsWith(".")) || (s.startsWith("Later, ") && s.endsWith(".")) || (s.startsWith("See you next time, ") && s.endsWith(".")) || (s.startsWith("See you later, ") && s.endsWith(".")) || (s.startsWith("Welcome to 2b2t.org, ") && s.endsWith(".")) || (s.startsWith("Greetings, ") && s.endsWith(".")) || (s.startsWith("Catch ya later, ") && s.endsWith(".")) || (s.startsWith("Good to see you, ") && s.endsWith(".")) || s.startsWith("Hope you had a good time, ") || (s.startsWith("Aww, it's you ") && s.endsWith(".")) || s.startsWith("Well, It was nice to have you here, ") || s.startsWith("Bye, Bye ") || (s.startsWith("I just ") && s.endsWith("!"));
    }
}
