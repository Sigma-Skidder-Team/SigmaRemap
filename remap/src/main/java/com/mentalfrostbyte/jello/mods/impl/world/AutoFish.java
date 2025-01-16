// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class AutoFish extends Module
{
    public AutoFish() {
        super(Category.WORLD, "AutoFish", "Automatically catches fish for you");
    }
    
    @EventListener
    public void method10301(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (!(class5723.method16998() instanceof Class4282) && !(class5723.method16998() instanceof Class4342)) {
            return;
        }
        if (AutoFish.mc.player.getHeldItemMainhand() == null) {
            return;
        }
        if (AutoFish.mc.player.getHeldItemMainhand().getItem() instanceof Class4047) {
            if (!(class5723.method16998() instanceof Class4282)) {
                if (class5723.method16998() instanceof Class4342) {
                    if (!((Class4342)class5723.method16998()).field19450.equals("entity.bobber.splash")) {
                        return;
                    }
                }
            }
            else if (!((Class4282)class5723.method16998()).method12863().equals(Class8520.field35037)) {
                return;
            }
            AutoFish.mc.method5269().method17292(new Class4307(Class316.field1877));
            AutoFish.mc.method5269().method17292(new Class4307(Class316.field1877));
            Client.method35173().method35197().method25776(new Class6224("AutoFish", "We catched something!", Class7853.field32192));
        }
    }
}
