// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.blockflys.AACBlockFly;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class AutoSprint extends Module
{
    private double[] field15769;
    private boolean field15770;
    
    public AutoSprint() {
        super(Category.PLAYER, "AutoSprint", "Sprints for you");
        this.field15769 = new double[] { 0.0, 0.0 };
        this.addSetting(new BooleanSetting("Keep Sprint", "Keep Sprinting after hitting a player", true));
    }
    
    @EventListener
    public void method10320(final Class5743 class5743) {
        if (this.isEnabled()) {
            final Module field15743 = ((ModuleWithSettings) Client.getInstance().method35189().method21551(BlockFly.class)).field15743;
            if (field15743 != null) {
                if (field15743.isEnabled()) {
                    if (field15743 instanceof AACBlockFly) {
                        if (!field15743.method9883("Haphe (AACAP)")) {
                            return;
                        }
                    }
                }
            }
            if (AutoSprint.mc.player.field2970 > 0.0f && !((BlockFly) Client.getInstance().method35189().method21551(BlockFly.class)).method10278()) {
                AutoSprint.mc.player.method1816(true);
            }
            else {
                AutoSprint.mc.player.method1816(false);
            }
        }
    }
    
    @EventListener
    public void method10321(final Class5735 class5735) {
        if (this.isEnabled()) {
            if (AutoSprint.mc.player.field2970 > 0.0f) {
                if (!AutoSprint.mc.player.method2756() || AutoSprint.mc.player.method2766().getItem() != Items.field31279) {
                    if (!((BlockFly) Client.getInstance().method35189().method21551(BlockFly.class)).method10278()) {
                        class5735.field23300 = (float)((AutoSprint.mc.player.method2710(Class8107.field33408).method23940() + 0.029999999329447746 + 0.015f * Class7482.method23139()) / AutoSprint.mc.player.field3025.method21427() + 1.0) / 2.0f;
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10322(final Class5750 class5750) {
        if (this.isEnabled() && this.method9883("Keep Sprint")) {
            if (!class5750.method17059()) {
                if (this.field15769.length == 2) {
                    final double n = this.field15769[0] - AutoSprint.mc.player.getMotion().x;
                    final double n2 = this.field15769[1] - AutoSprint.mc.player.getMotion().z;
                    if (n != 0.0 || n2 != 0.0) {
                        AutoSprint.mc.player.setMotion(this.field15769[0], AutoSprint.mc.player.getMotion().y, this.field15769[1]);
                    }
                    if (this.field15770) {
                        if (!AutoSprint.mc.player.method1815()) {
                            AutoSprint.mc.player.method1816(true);
                        }
                    }
                }
            }
            else {
                this.field15769[0] = AutoSprint.mc.player.getMotion().x;
                this.field15769[1] = AutoSprint.mc.player.getMotion().z;
                this.field15770 = AutoSprint.mc.player.method1815();
            }
        }
    }
}
