// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

import java.util.Random;

public class AutoClicker extends Module
{
    private int field15940;
    
    public AutoClicker() {
        super(Category.COMBAT, "AutoClicker", "Longpress your attack keybind to hit entities automaticly");
    }
    
    @EventListener
    private void method10568(final Class5743 class5743) {
        if (this.method9906()) {
            ++this.field15940;
            final Random random = new Random();
            final int n = 2;
            final int n2 = random.nextInt(4 - n) + n;
            if (AutoClicker.mc.gameSettings.field23446.method1056()) {
                if (this.field15940 >= n2) {
                    AutoClicker.mc.player.method2707(Class316.field1877);
                    this.field15940 = 0;
                    if (Class6430.method19141(AutoClicker.mc.player.rotationYaw, AutoClicker.mc.player.rotationPitch, 4.6f, 0.0) != null) {
                        AutoClicker.mc.method5269().method17292(new Class4381(Class6430.method19141(AutoClicker.mc.player.rotationYaw, AutoClicker.mc.player.rotationPitch, 4.6f, 0.0)));
                        AutoClicker.mc.player.method2707(Class316.field1877);
                    }
                }
            }
        }
    }
}
