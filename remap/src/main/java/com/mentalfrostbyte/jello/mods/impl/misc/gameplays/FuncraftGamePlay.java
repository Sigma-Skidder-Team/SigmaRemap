// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc.gameplays;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.misc.GamePlay;
import mapped.Class4378;
import mapped.EventReceivePacket;
import mapped.EventListener;
import mapped.IPacket;

public class FuncraftGamePlay extends Module
{
    private GamePlay field15661;
    
    public FuncraftGamePlay() {
        super(Category.MISC, "Funcraft", "Gameplay for Funcraft");
    }
    
    @Override
    public void initialize() {
        this.field15661 = (GamePlay)this.method9914();
    }
    
    @EventListener
    private void method10133(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled() && FuncraftGamePlay.mc.player != null) {
            final IPacket method16998 = eventReceivePacket.getPacket();
            if (method16998 instanceof Class4378) {
                final String string = ((Class4378)method16998).method13164().getString();
                final String lowerCase = FuncraftGamePlay.mc.player.getName().getFormattedText().toLowerCase();
                if (this.field15661.getBooleanValueFromSettingName("AutoL")) {
                    if (string.toLowerCase().contains("a \u00e9t\u00e9 tu\u00e9 par " + lowerCase) || string.toLowerCase().contains("a \u00e9t\u00e9 tu\u00e9 par le vide et " + lowerCase)) {
                        this.field15661.method10296(string);
                    }
                }
            }
        }
    }
}
