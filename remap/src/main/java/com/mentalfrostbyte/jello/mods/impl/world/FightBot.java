// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import java.util.Iterator;
import com.google.common.collect.Lists;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import mapped.Class4609;
import mapped.EventPlayerTickI;
import mapped.EventListener;
import mapped.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import java.util.List;
import java.util.ArrayList;

public class FightBot extends PremiumModule
{
    public ArrayList<Thread> field16000;
    public Entity field16001;
    public Vec3d field16002;
    
    public FightBot(final String s, final String s2, final Category class8013) {
        super("FightBot", "Jello AI Fight Bot", Category.WORLD);
        this.field16000 = new ArrayList<Thread>();
    }
    
    @EventListener
    public void method10639(final EventPlayerTickI eventPlayerTick) {
        if (this.isEnabled()) {
        }
    }
    
    public List<Entity> method10640() {
        final ArrayList arrayList = Lists.newArrayList((Iterable) FightBot.mc.world.method6806());
        arrayList.remove(FightBot.mc.player);
        final Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            final Entity class399 = (Entity)iterator.next();
            if (class399 instanceof PlayerEntity && !Client.getInstance().getBotManager().method31751(class399)) {
                continue;
            }
            iterator.remove();
        }
        final List<Entity> method13678 = Class4609.method13678(arrayList);
        if (method13678.size() <= 1) {
            return method13678;
        }
        return method13678.subList(0, Math.min(3, method13678.size() - 1));
    }
}
