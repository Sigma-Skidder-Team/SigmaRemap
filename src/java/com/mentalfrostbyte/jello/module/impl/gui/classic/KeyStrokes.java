package com.mentalfrostbyte.jello.module.impl.gui.classic;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class KeyStrokes extends Module {
    public KeyStrokes() {
        super(ModuleCategory.GUI, "KeyStrokes", "Shows what keybind you are pressing");
    }

    @EventTarget
    private void method16626(EventRender var1) {
        if (!this.isEnabled() || mc.player == null) {
        }
    }

    @EventTarget
    private void method16627(EventKeyPress var1) {
        if (!this.isEnabled() || mc.player == null) {
        }
    }

    @EventTarget
    private void method16628(ClickEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getButton() != ClickEvent.Button.LEFT && var1.getButton() != ClickEvent.Button.RIGHT) {
            }
        }
    }
}
