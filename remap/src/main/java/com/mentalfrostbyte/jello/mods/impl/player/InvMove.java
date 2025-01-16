// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import org.lwjgl.glfw.GLFW;

public class InvMove extends Module
{
    private boolean field15567;
    
    public InvMove() {
        super(Category.PLAYER, "InvMove", "Move freely in the inventory");
        this.addSetting(new BooleanSetting("AACP", "Bypass for AACP", true));
        this.field15567 = false;
    }
    
    @EventListener
    private void method9978(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == InvMove.mc.gameSettings.field23442.field2161.field32860) {
                if (InvMove.mc.player.method1815()) {
                    InvMove.mc.method5269().method17292(new Class4336(InvMove.mc.player, Class287.field1595));
                }
            }
        }
    }
    
    @EventListener
    private void method9979(final Class5721 class5721) {
        if (this.method9906()) {
            if (this.field15567) {
                if (class5721.method16990() instanceof Class4336) {
                    if (this.method9883("AACP")) {
                        if (((Class4336)class5721.method16990()).method13018() == Class287.field1594) {
                            class5721.method16961(true);
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method9980(final Class5743 class5743) {
        if (this.method9906()) {
            if (this.method9883("AACP")) {
                final boolean b = !(InvMove.mc.field4700 instanceof Class518) || !(InvMove.mc.field4700 instanceof Class726);
                if (this.field15567 && !b) {
                    this.field15567 = !this.field15567;
                    if (InvMove.mc.player.method1815()) {
                        InvMove.mc.method5269().method17292(new Class4336(InvMove.mc.player, Class287.field1594));
                    }
                }
                else if (!this.field15567) {
                    if (b) {
                        this.field15567 = !this.field15567;
                        if (InvMove.mc.player.method1815()) {
                            InvMove.mc.method5269().method17292(new Class4336(InvMove.mc.player, Class287.field1595));
                        }
                    }
                }
            }
            if (InvMove.mc.field4700 instanceof Class516 || Client.method35173().method35194().method29231() <= 1) {
                if (InvMove.mc.field4700 instanceof Class535) {
                    return;
                }
                if (InvMove.mc.field4700 instanceof Class515) {
                    return;
                }
                if (InvMove.mc.field4700 instanceof Class531) {
                    return;
                }
                if (InvMove.mc.field4700 instanceof Class525 && ((Class525) InvMove.mc.field4700).method3018() == 5) {
                    return;
                }
                if (Client.method35173().method35193().method32154() != null && Client.method35173().method35193().method32154().method14230()) {
                    final Class350[] field23460 = Minecraft.method5277().gameSettings.field23460;
                    for (int length = field23460.length, i = 0; i < length; ++i) {
                        field23460[i].field2162 = false;
                    }
                    return;
                }
                for (final Class350 class5744 : InvMove.mc.gameSettings.field23460) {
                    if (class5744.field2161.field32860 > 0) {
                        if (InvMove.mc.gameSettings.field23440.field2161.field32860 != class5744.field2161.field32860) {
                            if (class5744.field2161.field32860 > 4) {
                                class5744.field2162 = (GLFW.glfwGetKey(InvMove.mc.field4632.method7690(), class5744.field2161.field32860) == 1);
                            }
                        }
                    }
                }
            }
        }
    }
}
