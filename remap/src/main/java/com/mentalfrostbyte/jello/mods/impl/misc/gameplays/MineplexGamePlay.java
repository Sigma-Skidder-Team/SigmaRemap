// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc.gameplays;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.misc.GamePlay;
import mapped.*;

public class MineplexGamePlay extends Module
{
    private GamePlay field15564;
    private boolean field15565;
    private Class7617 field15566;
    
    public MineplexGamePlay() {
        super(Category.MISC, "Mineplex", "Gameplay for Mineplex");
        this.field15566 = new Class7617();
    }
    
    @Override
    public void method9917() {
        this.field15564 = (GamePlay)this.method9914();
    }
    
    @Override
    public void onEnable() {
        this.field15565 = false;
    }
    
    @EventListener
    private void method9975(final Class5723 class5723) {
        if (this.isEnabled() && MineplexGamePlay.mc.player != null) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4378) {
                final String string = ((Class4378)method16998).method13164().getString();
                final String lowerCase = MineplexGamePlay.mc.player.getName().getFormattedText().toLowerCase();
                if (this.field15564.method9883("AutoL")) {
                    if (string.toLowerCase().contains("killed by " + lowerCase + " ")) {
                        this.field15564.method10296(string);
                    }
                }
                final String[] array = { "Green", "Red", "Blue", "Yellow" };
                for (int i = 0; i < array.length; ++i) {
                    if (string.equals(array[i] + " won the game!")) {
                        this.field15566.method23934();
                        this.field15565 = true;
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method9976(final Class5732 class5732) {
        if (this.isEnabled()) {
            this.field15565 = false;
        }
    }
    
    @EventListener
    private void method9977(final Class5743 class5743) {
        if (this.isEnabled()) {
            if (this.method9883("AutoGG")) {
                if (this.field15566.method23935() > 5000L) {
                    if (this.field15565) {
                        this.field15565 = false;
                        this.field15566.method23934();
                        this.field15564.method10295();
                    }
                }
            }
        }
    }
}
