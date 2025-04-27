// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class AutoLog extends Module
{
    public AutoLog() {
        super(Category.COMBAT, "AutoLog", "Automatically logs out");
        this.addSetting(new NumberSetting("Min Health", "Minimum health before it logs you out", 2.5f, Float.class, 0.0f, 10.0f, 0.01f));
        this.addSetting(new BooleanSetting("No Totems", "Logs out when you have no totems in inventory", false));
        this.addSetting(new BooleanSetting("One Time Use", "Disables the mod every time it saves you.", true));
    }
    
    @EventListener
    public void method10769(final EventPlayerTick eventPlayerTick) {
        if (this.isEnabled()) {
            if (AutoLog.mc.player.ticksExisted > 10) {
                if (AutoLog.mc.method5285() == null) {
                    if (AutoLog.mc.method5282() != null) {
                        if (AutoLog.mc.player.method2664() / AutoLog.mc.player.method2701() * 10.0f < this.getNumberSettingValueByName("Min Health") || InvManagerUtil.method29375(Items.field31590) == 0) {
                            final boolean method9883 = this.getBooleanValueFromSettingName("One Time Use");
                            AutoLog.mc.world.method6751();
                            AutoLog.mc.method5264();
                            AutoLog.mc.displayGuiScreen(new Class735(new Class720(new MainMenu()), "disconnect.lost", new StringTextComponent("AutoLog disconnected you. " + (method9883 ? "The mod now disabled for you to reconnect." : "Disable it in a singleplayer world to reconnect."))));
                        }
                    }
                }
            }
        }
    }
}
