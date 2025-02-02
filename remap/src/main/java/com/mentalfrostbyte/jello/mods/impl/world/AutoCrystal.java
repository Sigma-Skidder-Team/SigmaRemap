// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.List;
import java.util.HashMap;

public class AutoCrystal extends PremiumModule
{
    public Class2089 field16009;
    public HashMap<Class858, Integer> field16010;
    public Class7014 field16011;
    public BlockRayTraceResult field16012;
    
    public AutoCrystal() {
        super("AutoCrystal", "Automatically detonates crystals", Category.WORLD);
        this.field16010 = new HashMap<Class858, Integer>();
        this.addSetting(new NumberSetting("Reach", "Max distance to detonate crystals at", 4.5f, Float.class, 1.0f, 8.0f, 0.01f));
        this.addSetting(new BooleanSetting("Rotations", "Looks at the crystal to destroy it", true));
        this.addSetting(new BooleanSetting("Near Players", "Only activates when close to players", true));
    }
    
    @EventListener
    private void method10650(final Class5744 class5744) {
        if (!this.isEnabled() || AutoCrystal.mc.world == null) {
            return;
        }
        if (class5744.method17046()) {
            this.field16009 = this.method10651();
        }
        switch (this.field16009.ordinal()) {
            case 1: {
                if (class5744.method17046()) {
                    this.method10659(class5744);
                    break;
                }
                this.method10660();
                break;
            }
            case 2: {
                if (class5744.method17046()) {
                    this.method10661(class5744);
                    break;
                }
                this.method10662();
                break;
            }
        }
    }
    
    public Class2089 method10651() {
        if (!this.method9883("Near Players")) {
            if (this.method10658().size() > 0) {
                return Class2089.field12079;
            }
        }
        else {
            if (!this.method10652()) {
                return Class2089.field12078;
            }
            if (this.method10658().size() > 0) {
                return Class2089.field12079;
            }
        }
        return Class2089.field12078;
    }
    
    private boolean method10652() {
        return this.method10653().size() > 0;
    }
    
    private List<Entity> method10653() {
        return AutoCrystal.mc.world.method6737(AutoCrystal.mc.player, AutoCrystal.mc.player.boundingBox.grow(9.0, 9.0, 9.0), Class9170.field38850.and((Predicate<? super Entity>)new Class167(this)));
    }
    
    private List<Class7014> method10654(final Entity class399) {
        final TreeMap treeMap = new TreeMap();
        for (final BlockPos value : this.method10656(class399)) {
            treeMap.put(this.method10655(class399, value), value);
            ColorUtils.method19106("Dmg: " + this.method10655(class399, value));
        }
        if (!treeMap.isEmpty()) {
            ColorUtils.method19106("Dmgs: " + treeMap.toString());
            final BlockPos class400 = treeMap.lastEntry().getValue();
            final ArrayList list = new ArrayList();
            for (final Map.Entry entry : treeMap.entrySet()) {
                list.add(new Class7014(class400, treeMap.lastKey(), this.method10655(AutoCrystal.mc.player, class400)));
            }
            Collections.reverse(list);
            return list;
        }
        return null;
    }
    
    private float method10655(final Entity class399, final BlockPos class400) {
        final float n = 6.0f;
        final float n2 = class400.getX() + 0.5f;
        final float n3 = class400.getY() + 1.0f;
        final float n4 = class400.getZ() + 0.5f;
        final float n5 = n * 2.0f;
        final Vec3d class401 = new Vec3d(n2, n3, n4);
        if (!class399.method1899()) {
            final double n6 = MathHelper.sqrt(class399.method1735(class401)) / n5;
            if (n6 <= 1.0) {
                final double n7 = class399.getPosX() - n2;
                final double n8 = class399.method1944() - n3;
                final double n9 = class399.getPosZ() - n4;
                if (MathHelper.sqrt(n7 * n7 + n8 * n8 + n9 * n9) != 0.0) {
                    final double n10 = (1.0 - n6) * Explosion.getBlockDensity(class401, class399);
                    return (float)(int)((n10 * n10 + n10) / 2.0 * 7.0 * n5 + 1.0);
                }
            }
        }
        return 0.0f;
    }
    
    private List<BlockPos> method10656(final Entity class399) {
        this.getNumberSettingValueByName("Reach");
        final List<Entity> method10657 = this.method10657();
        final ArrayList list = new ArrayList();
    Label_0068:
        for (final BlockPos class400 : Class4609.method13676(Class4609.method13691(4.0f), new Vec3d(class399.getPosX(), class399.getPosY() - 1.0, class399.getPosZ()))) {
            final Block method10658 = AutoCrystal.mc.world.getBlockState(class400).method21696();
            if (method10658 != Blocks.OBSIDIAN && method10658 != Blocks.field29172) {
                continue;
            }
            if (AutoCrystal.mc.world.getBlockState(class400.method1137()).method21696() != Blocks.AIR) {
                continue;
            }
            final AxisAlignedBB method10659 = new AxisAlignedBB(class400).grow(0.5, 0.5, 0.5).offset(0.0, 1.5, 0.0);
            for (final Entity class401 : method10657) {
                final AxisAlignedBB method10660 = class401.getBoundingBox();
                final AxisAlignedBB class402 = new AxisAlignedBB(class400.method1137());
                if (class401 instanceof Class858 && method10660.intersects(method10659)) {
                    continue Label_0068;
                }
                if (!method10660.intersects(class402)) {
                    continue;
                }
                continue Label_0068;
            }
            list.add(class400);
        }
        return list;
    }
    
    public List<Entity> method10657() {
        final float method9886 = this.getNumberSettingValueByName("Reach");
        return AutoCrystal.mc.world.method6737(AutoCrystal.mc.player, AutoCrystal.mc.player.boundingBox.grow(method9886, method9886, method9886), Class9170.field38850.and((Predicate<? super Entity>)new Class164(this, method9886)));
    }
    
    private List<Entity> method10658() {
        final float n = this.getNumberSettingValueByName("Reach") + 1.0f;
        return AutoCrystal.mc.world.method6737(AutoCrystal.mc.player, AutoCrystal.mc.player.boundingBox.grow(n, n, n), Class9170.field38850.and((Predicate<? super Entity>)new Class165(this, n)));
    }
    
    private void method10659(final Class5744 class5744) {
        final List<Entity> method10658 = this.method10658();
        if (method10658.size() != 0) {
            if (!this.field16010.containsKey(method10658.get(0))) {
                this.field16010.put((Class858)method10658.get(0), 4);
                if (!this.method9883("Rotations")) {
                    this.method10660();
                    this.field16010.remove(method10658.get(0));
                }
                else {
                    final float[] method10659 = Class8845.method30912(method10658.get(0));
                    final EntityRayTraceResult method10660 = ColorUtils.rayTraceFromPlayer(class5744.method17042(), class5744.method17040(), 5.0f, 0.0);
                    if (method10660 == null || !method10658.get(0).equals(method10660.getEntity())) {
                        class5744.method17043(method10659[0]);
                        class5744.method17041(method10659[1]);
                    }
                }
            }
        }
    }
    
    private void method10660() {
        final Iterator<Map.Entry<Class858, Integer>> iterator = this.field16010.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, Integer> entry = (Map.Entry<K, Integer>)iterator.next();
            if (entry.getValue() == 2) {
                ColorUtils.method19165((Entity)entry.getKey(), true);
            }
            entry.setValue(entry.getValue() - 1);
            if (entry.getValue() != 0) {
                continue;
            }
            iterator.remove();
        }
    }
    
    private void method10661(final Class5744 class5744) {
        this.field16011 = null;
        this.field16012 = null;
        final List<Entity> method10653 = this.method10653();
        if (method10653.isEmpty()) {
            return;
        }
        final List<Class7014> method10654 = this.method10654(method10653.get(0));
        if (method10654 != null && !method10654.isEmpty()) {
            for (final Class7014 field16011 : method10654) {
                final float[] method10655 = Class4609.method13672(field16011.field27346, Direction.UP);
                final BlockRayTraceResult method10656 = Class4609.method13697(method10655[0], method10655[1], 5.0f);
                if (!field16011.field27346.equals(method10656.getPos())) {
                    continue;
                }
                this.field16012 = method10656;
                this.field16011 = field16011;
                class5744.method17043(method10655[0]);
                class5744.method17041(method10655[1]);
            }
        }
    }
    
    private void method10662() {
        if (this.field16011 != null && this.field16012 != null) {
            final int method29340 = InvManagerUtil.method29340(Items.field31572);
            if (method29340 >= 0) {
                AutoCrystal.mc.player.inventory.field2743 = method29340;
                AutoCrystal.mc.playerController.method27318();
                AutoCrystal.mc.playerController.method27319(AutoCrystal.mc.player, AutoCrystal.mc.world, Class316.field1877, this.field16012);
            }
        }
    }
}
