// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChestStealer extends Module
{
    public boolean field15737;
    private ConcurrentHashMap<Class475, Boolean> field15738;
    private Class7617 field15739;
    private Class7617 field15740;
    private Class475 field15741;
    
    public ChestStealer() {
        super(Category.ITEM, "ChestStealer", "Steals items from chest");
        this.field15739 = new Class7617();
        this.field15740 = new Class7617();
        this.addSetting(new BooleanSetting("Aura", "Automatically open chests near you.", false));
        this.addSetting(new BooleanSetting("Ignore Junk", "Ignores useless items.", true));
        this.addSetting(new BooleanSetting("Fix ViaVersion", "Fixes ViaVersion delay.", true));
        this.addSetting(new BooleanSetting("Close", "Automatically closes the chest when done", true));
        this.addSetting(new NumberSetting("Delay", "Click delay", 0.2f, Float.class, 0.0f, 1.0f, 0.01f));
        this.addSetting(new NumberSetting("First Item", "Tick delay before grabbing first item", 0.2f, Float.class, 0.0f, 1.0f, 0.01f));
        this.field15738 = new ConcurrentHashMap<Class475, Boolean>();
    }
    
    @Override
    public void onEnable() {
        this.field15741 = null;
        this.field15737 = false;
        if (!this.field15738.isEmpty()) {
            this.field15738.clear();
        }
    }
    
    @EventListener
    public void method10251(final Class5744 class5744) {
        if (!this.isEnabled() || !class5744.method17046()) {
            return;
        }
        if (this.method9883("Aura")) {
            if (this.field15740.method23935() > 2000L) {
                if (this.field15737) {
                    this.field15740.method23934();
                    this.field15737 = false;
                }
            }
            if (!this.field15740.method23937()) {
                this.field15740.method23932();
            }
            this.method10256();
            if (this.field15741 != null) {
                if (ChestStealer.mc.currentScreen == null) {
                    if (this.field15740.method23935() > 1000L) {
                        final BlockRayTraceResult class5745 = (BlockRayTraceResult)Class4609.method13700(this.field15741.getPos());
                        if (class5745.getPos().getX() == this.field15741.getPos().getX()) {
                            if (class5745.getPos().getY() == this.field15741.getPos().getY()) {
                                if (class5745.getPos().getZ() == this.field15741.getPos().getZ()) {
                                    this.field15737 = true;
                                    ChestStealer.mc.method5269().method17292(new Class4329(Class316.field1877, class5745));
                                    ChestStealer.mc.method5269().method17292(new Class4380(Class316.field1877));
                                    this.field15740.method23934();
                                }
                            }
                        }
                    }
                }
            }
            int n = 0;
            for (final Map.Entry<Class475, V> entry : this.field15738.entrySet()) {
                final Class475 field15741 = entry.getKey();
                final boolean booleanValue = (boolean)entry.getValue();
                final float n2 = (float)field15741.getPos().getX();
                final float n3 = field15741.getPos().getY() + 0.1f;
                final float n4 = (float)field15741.getPos().getZ();
                if (this.field15737) {
                    continue;
                }
                if (this.field15741 != null && ChestStealer.mc.player.method1733(n2, n3, n4) <= ChestStealer.mc.player.method1733(n2, n3, n4)) {
                    continue;
                }
                if (booleanValue) {
                    continue;
                }
                if (Math.sqrt(ChestStealer.mc.player.method1733(n2, n3, n4)) >= 5.0) {
                    continue;
                }
                if (this.field15740.method23935() <= 1000L) {
                    continue;
                }
                if (ChestStealer.mc.currentScreen != null) {
                    continue;
                }
                final BlockRayTraceResult class5746 = (BlockRayTraceResult)Class4609.method13700(field15741.getPos());
                if (class5746.getPos().getX() != field15741.getPos().getX()) {
                    continue;
                }
                if (class5746.getPos().getY() != field15741.getPos().getY()) {
                    continue;
                }
                if (class5746.getPos().getZ() != field15741.getPos().getZ()) {
                    continue;
                }
                this.field15741 = field15741;
                final float[] method30919 = Class8845.method30919(n2 + 0.5, n4 + 0.5, n3 + 0.35);
                class5744.method17043(method30919[0]);
                class5744.method17041(method30919[1]);
                n = 1;
            }
            if (n == 0) {
                if (ChestStealer.mc.currentScreen == null) {
                    if (this.field15741 != null) {
                        this.field15738.put(this.field15741, true);
                        this.field15741 = null;
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10252(final Class5732 class5732) {
        if (!this.field15738.isEmpty()) {
            this.field15738.clear();
        }
    }
    
    @EventListener
    public void method10253(final Class5740 class5740) {
        if (!this.isEnabled()) {
            return;
        }
        if (!(ChestStealer.mc.currentScreen instanceof Class726)) {
            this.field15737 = false;
            this.field15739.method23933();
            this.field15739.method23934();
            if (ChestStealer.mc.currentScreen == null) {
                if (InvManagerUtil.method29372()) {
                    this.field15740.method23934();
                }
            }
            return;
        }
        if (!this.field15739.method23937()) {
            this.field15739.method23932();
        }
        if (this.field15739.method23935() < this.getNumberSettingValueByName("Delay") * 1000.0f) {
            return;
        }
        if (InvManagerUtil.method29372()) {
            if (this.method9883("Close")) {
                ChestStealer.mc.player.method2814();
            }
            return;
        }
        final Class726 class5741 = (Class726) ChestStealer.mc.currentScreen;
        if (this.method10254(class5741)) {
            int n = 1;
            for (final Class6601 class5742 : ((Class3438)class5741.field3077).field16151) {
                if (!class5742.method20054()) {
                    continue;
                }
                if (class5742.field26174 >= ((Class3438)class5741.field3077).method10973() * 9) {
                    continue;
                }
                if (this.method10255(class5742.method20053())) {
                    continue;
                }
                if (!this.field15737) {
                    if (this.field15739.method23935() < this.getNumberSettingValueByName("First Item") * 1000.0f) {
                        return;
                    }
                    this.field15737 = !this.field15737;
                }
                if (!this.method9883("Fix ViaVersion")) {
                    InvManagerUtil.method29366(((Class3438)class5741.field3077).field16154, class5742.field26174, 0, Class2133.field12438, ChestStealer.mc.player);
                }
                else {
                    InvManagerUtil.method29367(((Class3438)class5741.field3077).field16154, class5742.field26174, 0, Class2133.field12438, ChestStealer.mc.player, true);
                }
                this.field15739.method23934();
                n = 0;
                if (this.getNumberSettingValueByName("Delay") <= 0.0f) {
                    continue;
                }
                break;
            }
            if (n != 0) {
                if (this.field15737) {
                    this.field15737 = !this.field15737;
                }
                if (this.method9883("Close")) {
                    ChestStealer.mc.player.method2814();
                }
                for (final Class475 key : this.field15738.keySet()) {
                    if (key != this.field15741) {
                        continue;
                    }
                    this.field15741 = null;
                    this.field15738.put(key, true);
                }
            }
            return;
        }
        if (this.field15741 != null) {
            this.field15738.put(this.field15741, true);
        }
    }
    
    private boolean method10254(final Class726 class726) {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList("menu", "selector", "game", "gui", "server", "inventory", "play", "teleporter", "shop", "melee", "armor", "block", "castle", "mini", "warp", "teleport", "user", "team", "tool", "sure", "trade", "cancel", "accept", "soul", "book", "recipe", "profile", "tele", "port", "map", "kit", "select", "lobby", "vault", "lock", "anticheat", "travel", "settings", "user", "preference", "compass", "cake", "wars", "buy", "upgrade", "ranged", "potions", "utility", "choose", "modalidades"));
        final List<BlockPos> method13691 = Class4609.method13691(8.0f);
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!class726.getNarrationMessage().toLowerCase().contains((CharSequence)iterator.next())) {
                continue;
            }
            return false;
        }
        for (final BlockPos class727 : method13691) {
            if (!(Class4609.method13666(class727) instanceof Class3865) && !(Class4609.method13666(class727) instanceof Class3973)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    private boolean method10255(final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        if (!this.method9883("Ignore Junk")) {
            return false;
        }
        if (method27622 instanceof Class4077) {
            return !InvManager.method10667(class8321);
        }
        if (method27622 instanceof Class4073) {
            return !InvManager.method10678(class8321);
        }
        if (method27622 instanceof Class4075) {
            return !InvManager.method10680(class8321);
        }
        if (method27622 instanceof Class4074) {
            return !InvManager.method10679(class8321);
        }
        if (method27622 instanceof Class4089) {
            return InvManagerUtil.method29371(class8321);
        }
        if (method27622 instanceof Class4036) {
            return !BlockFly.method10279(method27622);
        }
        if (method27622 instanceof Class3824 || (method27622 instanceof Class4087 && Client.getInstance().method35189().method21551(InvManager.class).method9883("Archery"))) {
            return true;
        }
        if (method27622 == Items.field31350 && Client.getInstance().method35189().method21551(AutoMLG.class).isEnabled()) {
            return false;
        }
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(Items.field31375, Items.field31307, Items.field31337, Items.field31374, Items.field31306, Items.field31299, Items.field30896, Items.field31349, Items.field31351, Items.field31350, Items.field30929, Items.field31534, Items.field31510, Items.field31426, Items.field31019, Items.field30900, Items.field31576, Items.field31430, Items.field31429, Items.field31314, Items.field31357, Items.field31442, Items.field30835, Items.field31355, Items.field31376));
        if (class8321 != null) {
            if (!list.contains(method27622)) {
                if (!method27622.method11715().getFormattedText().toLowerCase().contains("seed")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private void method10256() {
        final List<TileEntity> field10050 = ChestStealer.mc.world.loadedTileEntityList;
        field10050.removeIf(class437 -> !(class437 instanceof Class475));
        for (final TileEntity tileEntity : field10050) {
            if (this.field15738.containsKey(tileEntity)) {
                continue;
            }
            this.field15738.put((Class475) tileEntity, false);
        }
        for (final Class475 key : this.field15738.keySet()) {
            if (field10050.contains(key)) {
                continue;
            }
            this.field15738.remove(key);
        }
    }
}
