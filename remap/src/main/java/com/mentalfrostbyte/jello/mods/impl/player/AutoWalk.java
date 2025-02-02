// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.EventListener;
import org.lwjgl.glfw.GLFW;

public class AutoWalk extends Module
{
    public AutoWalk() {
        super(Category.PLAYER, "AutoWalk", "Automatically walks forward");
    }
    
    @EventListener
    private void method10462(final Class5743 class5743) {
        if (this.isEnabled()) {
            AutoWalk.mc.gameSettings.field23435.field2162 = true;
        }
    }
    
    @Override
    public void onDisable() {
        AutoWalk.mc.gameSettings.field23435.field2162 = (GLFW.glfwGetKey(AutoWalk.mc.field4632.method7690(), AutoWalk.mc.gameSettings.field23435.field2161.field32860) == 1);
    }
}
