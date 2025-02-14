package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class GameIdler extends Module {
    public GameIdler() {
        super(ModuleCategory.MISC, "GameIdler", "Lowers your fps when the game is idle to increase performance");
    }

    @EventTarget
    private void method16941(EventRender var1) {
        if (this.isEnabled()) {
            boolean var4 = GLFW.glfwGetWindowAttrib(mc.mainWindow.getHandle(), 131073) == 1;
            if (var4) {
                Minecraft.getInstance().mainWindow.setFramerateLimit(mc.gameSettings.framerateLimit);
            } else {
                Minecraft.getInstance().mainWindow.setFramerateLimit(5);
            }
        }
    }

    @Override
    public void onDisable() {
        Minecraft.getInstance().mainWindow.setFramerateLimit(mc.gameSettings.framerateLimit);
    }
}
