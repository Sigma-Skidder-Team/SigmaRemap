// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.speeds.*;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class Speed extends ModuleWithSettings
{
    public static int field15748;
    
    public Speed() {
        super(Category.MOVEMENT, "Speed", "Vroom vroom", new VanillaSpeed(), new HypixelSpeed(), new AACSpeed(), new OldAACSpeed(), new ViperMCSpeed(), new SlowHop(), new NCPSpeed(), new LegitSpeed(), new CubecraftSpeed(), new YPortSpeed(), new AGCSpeed(), new InvadedSpeed(), new MineplexSpeed(), new GommeSpeed(), new TestSpeedSpeed());
        this.addSetting(new BooleanSetting("Lag back checker", "Disable speed when you get lag back", true));
        Speed.field15748 = 0;
    }
    
    @EventListener
    public void method10267(final EventPlayerTick eventPlayerTick) {
        ++Speed.field15748;
    }
    
    @EventListener
    public void method10268(final Class5723 class5723) {
        if (class5723.method16998() instanceof Class4328) {
            if (Speed.mc.player != null) {
                Speed.field15748 = 0;
                if (this.getBooleanValueFromSettingName("Lag back checker")) {
                    if (this.isEnabled()) {
                        if (Speed.mc.player.ticksExisted > 2) {
                            Client.getInstance().getNotificationManager().send(new Notification("Speed", "Disabled speed due to lagback."));
                            this.toggle();
                        }
                    }
                }
            }
        }
    }
    
    public void method10269() {
        if (this.parentModule instanceof HypixelSpeed) {
            ((HypixelSpeed)this.parentModule).method10592();
        }
    }
}
