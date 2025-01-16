// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Class5717;
import mapped.Class7482;
import mapped.EventListener;

public class InvadedSpeed extends Module
{
    private int field15617;
    
    public InvadedSpeed() {
        super(Category.MOVEMENT, "Invaded", "Speed for Invadedlands");
        this.addSetting(new NumberSetting("Speed", "Speed value", 3.0f, Float.class, 0.5f, 9.5f, 0.1f));
    }
    
    @Override
    public void method9879() {
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(0.2800000011920929);
        InvadedSpeed.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    public void method10041(final Class5717 class5717) {
        if (this.method9906()) {
            ++this.field15617;
            if (this.field15617 != 1) {
                if (this.field15617 != 2) {
                    if (this.field15617 >= 3) {
                        this.field15617 = 0;
                        InvadedSpeed.mc.timer.timerSpeed = 0.25f;
                        Class7482.method23149(class5717, this.getNumberSettingValueByName("Speed"));
                    }
                }
                else {
                    InvadedSpeed.mc.timer.timerSpeed = 2.0f;
                    Class7482.method23149(class5717, Class7482.method23136() + 0.05);
                }
            }
            else {
                InvadedSpeed.mc.timer.timerSpeed = 2.0f;
                Class7482.method23149(class5717, Class7482.method23136() + 0.05);
            }
        }
    }
}
