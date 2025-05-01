// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import java.util.ArrayList;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Iterator;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;
import java.util.List;

public class PathFinder extends Module
{
    public int field15878;
    private List<Class8733> field15879;
    private Class8797 field15880;
    public int field15881;
    public int field15882;
    public int field15883;
    
    public PathFinder() {
        super(Category.RENDER, "PathFinder", "You know what it is");
    }
    
    public void method10466() {
        final int method19118 = AllUtils.applyAlpha(ClientColors.PALE_YELLOW.color, 0.14f);
        GL11.glPushMatrix();
        GL11.glDisable(2929);
        final Iterator<Class8733> iterator = this.field15879.iterator();
        while (iterator.hasNext()) {
            final Iterator<Long> iterator2 = iterator.next().field36693.iterator();
            while (iterator2.hasNext()) {
                final BlockPos method19119 = BlockPos.fromLong(iterator2.next());
                final double n = method19119.getX() - PathFinder.mc.field4644.method5833().method18161().getX();
                final double n2 = method19119.getY() - PathFinder.mc.field4644.method5833().method18161().getY();
                final double n3 = method19119.getZ() - PathFinder.mc.field4644.method5833().method18161().getZ();
                RenderUtil.method26909(new Class7644(n, n2, n3, n + 1.0, n2 + 1.0, n3 + 1.0), method19118);
            }
        }
        GL11.glEnable(2929);
        GL11.glPopMatrix();
    }
    
    @EventListener
    public void method10467(final Class5748 class5748) {
        if (!this.isEnabled()) {
            return;
        }
        AllUtils.method19106("calc");
        if (Client.getInstance().getMovementManager().method26559()) {
            Client.getInstance().getMovementManager().method26555();
            return;
        }
        try {
            final Class9416 class5749 = new Class9416();
            final Class8733 class5750 = new Class8733(new Class8797(PathFinder.mc.player.method1894()));
            final ArrayList arrayList = Lists.newArrayList((Iterable) PathFinder.mc.world.method6806());
            arrayList.remove(PathFinder.mc.player);
            final Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                final Entity class5751 = (Entity)iterator.next();
                if (!(class5751 instanceof PlayerEntity) || Client.getInstance().getBotManager().isBot(class5751)) {
                    iterator.remove();
                }
            }
            List<Entity> list = Class4609.method13678(arrayList);
            Collections.reverse(list);
            System.out.println(list);
            if (list.size() > 1) {
                list = list.subList(0, Math.min(3, list.size() - 1));
            }
            if (list.size() == 0) {
                return;
            }
            final Class6973 class5752 = new Class6973(class5750, new Class7800(list));
            class5752.field27266 = true;
            class5752.field27269 = 60;
            class5752.field27263 = 20000;
            class5752.field27267 = true;
            class5752.field27268 = true;
            this.field15879 = class5749.method35017(class5752);
            Client.getInstance().getMovementManager().method26556(this.field15879);
            AllUtils.method19106("calc" + this.field15879.size());
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}
