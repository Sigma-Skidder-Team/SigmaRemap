package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.glfw.GLFW;

public class AutoWalk extends Module {
    public AutoWalk() {
        super(ModuleCategory.PLAYER, "AutoWalk", "Automatically walks forward");
    }

    @EventTarget
    private void method16336(TickEvent var1) {
        if (this.isEnabled()) {
            mc.gameSettings.keyBindForward.pressed = true;
        }
    }

    @Override
    public void onDisable() {
        int var3 = GLFW.glfwGetKey(mc.mainWindow.getHandle(), mc.gameSettings.keyBindForward.keycode.keyCode);
        mc.gameSettings.keyBindForward.pressed = var3 == 1;
    }
}
