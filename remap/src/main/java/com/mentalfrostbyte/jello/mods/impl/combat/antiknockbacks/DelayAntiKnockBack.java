// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.entity.Entity;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class DelayAntiKnockBack extends Module
{
    private List<Class4273> field15922;
    public int field15923;
    
    public DelayAntiKnockBack() {
        super(Category.COMBAT, "Delay", "For anticheats with \"good\" velocity checks");
        this.field15922 = new ArrayList<Class4273>();
        this.field15923 = 0;
        this.addSetting(new NumberSetting("Delay", "Ticks delay", 7.0f, Float.class, 1.0f, 20.0f, 1.0f));
    }
    
    @EventListener
    private void method10518(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (DelayAntiKnockBack.mc.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    final List<Entity> method6739 = DelayAntiKnockBack.mc.world.method6739((Class<? extends Entity>) PlayerEntity.class, DelayAntiKnockBack.mc.player.getBoundingBox().intersect(14.0), class5725 -> {
                        if (class5725.method1732(DelayAntiKnockBack.mc.player) < 6.0f) {
                            if (DelayAntiKnockBack.mc.player != class5725) {
                                if (!Client.getInstance().method35191().method31751(class5725)) {
                                    return;
                                }
                            }
                        }
                        return;
                    });
                    if (class5724.method12822() == DelayAntiKnockBack.mc.player.getEntityId()) {
                        if (method6739.size() > 0) {
                            this.field15922.add(class5724);
                            class5723.setCancelled(true);
                            if (this.field15923 == 0) {
                                this.field15923 = (int)this.getNumberSettingValueByName("Delay");
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method10519(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (class5721.method16990() instanceof Class4381) {
                if (((Class4381)class5721.method16990()).method13171() != Class2029.field11565) {}
            }
        }
    }
    
    @EventListener
    private void method10520(final Class5743 class5743) {
        if (this.field15923 != 0) {
            if (this.field15923 > 0) {
                --this.field15923;
            }
        }
        else {
            this.method10521();
        }
    }
    
    private void method10521() {
        final Iterator<Class4273> iterator = this.field15922.iterator();
        while (iterator.hasNext()) {
            DelayAntiKnockBack.mc.method5269().method17277(iterator.next());
        }
        this.field15922.clear();
    }
}
