// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5740;
import mapped.EventListener;
import mapped.Minecraft;
import org.lwjgl.glfw.GLFW;

public class GameIdler extends Module
{
    public GameIdler() {
        super(Category.MISC, "GameIdler", "Lowers your fps when the game is idle to increase performance");
    }
    
    @EventListener
    private void method10090(final Class5740 class5740) {
        if (this.isEnabled()) {
            if (GLFW.glfwGetWindowAttrib(GameIdler.mc.window.getHandle(), 131073) == 1) {
                Minecraft.method5277().window.method7678(GameIdler.mc.gameSettings.field23383);
            }
            else {
                Minecraft.method5277().window.method7678(5);
            }
        }
    }
    
    @Override
    public void onDisable() {
        Minecraft.method5277().window.method7678(GameIdler.mc.gameSettings.field23383);
    }
}
