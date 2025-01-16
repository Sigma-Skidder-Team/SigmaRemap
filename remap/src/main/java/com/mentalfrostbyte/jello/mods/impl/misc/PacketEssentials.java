// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.util.InDevelopment;
import mapped.*;
import net.minecraft.entity.EntityType;

@InDevelopment
public class PacketEssentials extends Module
{
    public PacketEssentials() {
        super(Category.MISC, "PacketEssentials", "Ignores all types of junk cosmetic packets to improve fps");
    }
    
    @EventListener
    private void method10718(final Class5723 class5723) {
        if (this.method9906()) {
            if (!(class5723.method16998() instanceof Class4339)) {
                if (!(class5723.method16998() instanceof Class4276)) {
                    if (!(class5723.method16998() instanceof Class4278)) {
                        if (!(class5723.method16998() instanceof Class4301)) {
                            if (!(class5723.method16998() instanceof Class4400)) {
                                if (class5723.method16998() instanceof Class4268) {
                                    class5723.method16961(true);
                                }
                            }
                            else {
                                class5723.method16961(true);
                            }
                        }
                        else {
                            class5723.method16961(true);
                        }
                    }
                    else {
                        final Class4278 class5724 = (Class4278)class5723.method16998();
                        class5723.method16961(true);
                    }
                }
                else if (((Class4276)class5723.method16998()).method12831() == 1) {
                    class5723.method16961(true);
                }
            }
            else {
                final Class4339 class5725 = (Class4339)class5723.method16998();
                if (class5725.method13033() == EntityType.field28958) {
                    class5723.method16961(true);
                }
                if (class5725.method13033() == EntityType.field28987) {
                    class5723.method16961(true);
                }
            }
        }
    }
}
