// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks.AACAntiKnockBack;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class OldAACSpeed extends Module
{
    private double field15765;
    private float field15766;
    private int field15767;
    private int field15768;
    
    public OldAACSpeed() {
        super(Category.MOVEMENT, "OldAAC", "Speed for old version of AAC");
        this.addSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
    }
    
    @Override
    public void onDisable() {
    }
    
    @Override
    public void onEnable() {
        this.field15768 = ((Client.getInstance().getTickManager().method29228() <= 0) ? 1 : 0);
        this.field15765 = Class7482.method23136();
        this.field15766 = Class7482.method23144()[0];
    }
    
    @EventListener
    public void method10316(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (!OldAACSpeed.mc.player.onGround) {
                if (ColorUtils.method19114()) {
                    if (AACAntiKnockBack.field15956 >= 7) {
                        ++this.field15767;
                        if (this.field15767 == 1) {
                            if (this.field15768 != 1) {
                                if (this.field15768 == 2) {
                                    this.field15765 = 0.362;
                                }
                            }
                            else {
                                this.field15765 = 0.306;
                            }
                        }
                        if (OldAACSpeed.mc.player.collidedHorizontally) {
                            this.field15765 = Class7482.method23136();
                        }
                        this.field15766 = Class7482.method23153(class5717, this.field15765, Class7482.method23144()[0], this.field15766, 45.0f);
                    }
                }
            }
            else if (this.method9883("Auto Jump") && ColorUtils.method19114()) {
                this.field15767 = 0;
                OldAACSpeed.mc.player.method2725();
                class5717.method16973(OldAACSpeed.mc.player.getMotion().x);
                class5717.method16975(OldAACSpeed.mc.player.getMotion().y);
                class5717.method16977(OldAACSpeed.mc.player.getMotion().z);
            }
            else if (class5717.method16974() != 0.4 + Class7482.method23140() * 0.1) {
                this.field15768 = 0;
            }
            else {
                Class7482.method23149(class5717, this.field15765);
            }
        }
    }
    
    @EventListener
    public void method10317(final Class5722 class5722) {
        if (this.isEnabled()) {
            if (this.field15768 < 2) {
                ++this.field15768;
            }
            if (this.field15768 != 1) {
                if (this.field15768 == 2) {
                    this.field15765 = 0.6;
                }
            }
            else {
                this.field15765 = 0.5;
            }
            this.field15766 = Class7482.method23144()[0];
            class5722.method16996(this.field15765);
            class5722.method16995(0.4 + Class7482.method23140() * 0.1);
            this.field15767 = 0;
        }
    }
    
    @EventListener
    public void method10318(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15768 = 0;
                this.field15765 = Class7482.method23136();
            }
        }
    }
}
