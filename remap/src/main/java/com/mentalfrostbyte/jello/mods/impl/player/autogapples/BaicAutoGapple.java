// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player.autogapples;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.item.AutoGapple;
import mapped.*;

import java.util.Iterator;

public class BaicAutoGapple extends Module
{
    private int field15614;
    private int field15615;
    private int field15616;
    
    public BaicAutoGapple() {
        super(Category.PLAYER, "Basic", "Basic AutoGapple");
        this.field15614 = -1;
    }
    
    @Override
    public void onEnable() {
        this.field15614 = -1;
        this.field15616 = 20;
    }
    
    @EventListener
    public void method10036(final EventStopUseItemI eventStopUseItem) {
        if (this.isEnabled()) {
            if (this.field15614 >= 0) {
                eventStopUseItem.setCancelled(true);
            }
        }
    }
    
    @EventListener
    public void method10037(final Class5752 class5752) {
        if (this.isEnabled()) {
            for (int length = BaicAutoGapple.mc.gameSettings.field23457.length, i = 0; i < length; ++i) {
                final Class350 class5753 = BaicAutoGapple.mc.gameSettings.field23457[i];
                final String method1060 = class5753.method1060();
                final int int1 = Integer.parseInt(String.valueOf(method1060.charAt(method1060.length() - 1)));
                if (class5752.method17061() == class5753.field2161.field32860) {
                    if (int1 - 1 != BaicAutoGapple.mc.player.inventory.field2743) {
                        this.field15614 = -1;
                        this.field15616 = 0;
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10038(final EventPlayerTick eventPlayerTick) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.field15616 < 20) {
            ++this.field15616;
        }
        int method10292 = -1;
        if (BaicAutoGapple.mc.player.method2664() <= this.method9914().getNumberSettingValueByName("Health") * 2.0f) {
            method10292 = ((AutoGapple)this.method9914()).method10292(false);
            if (this.field15614 == -1) {
                if (this.field15616 >= 20) {
                    if (method10292 != -1) {
                        this.field15614 = 0;
                        this.field15616 = 0;
                    }
                }
            }
        }
        if (method10292 < 0 && this.field15614 == -1) {
            return;
        }
        if (this.field15614 >= 0) {
            ++this.field15614;
            if (this.field15614 != 1) {
                if (this.field15614 > 1) {
                    if (BaicAutoGapple.mc.player.method2715(Class316.field1877).getItem() != Items.field31341) {
                        if (BaicAutoGapple.mc.player.method2715(Class316.field1877).getItem() != Items.field31342) {
                            BaicAutoGapple.mc.player.inventory.field2743 = this.field15615;
                            this.field15615 = -1;
                            this.field15614 = -1;
                        }
                    }
                }
            }
            else {
                this.field15615 = BaicAutoGapple.mc.player.inventory.field2743;
                BaicAutoGapple.mc.player.inventory.field2743 = method10292;
                BaicAutoGapple.mc.playerController.method27318();
                BaicAutoGapple.mc.playerController.method27320(BaicAutoGapple.mc.player, BaicAutoGapple.mc.world, Class316.field1877);
            }
        }
    }
    
    @EventListener
    public void method10039(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled() && this.field15614 > 1) {
            final IPacket method16998 = eventReceivePacket.getPacket();
            if (method16998 instanceof Class4268) {
                final Class4268 class5724 = (Class4268)method16998;
                if (class5724.method12811() == BaicAutoGapple.mc.player.getEntityId()) {
                    final Iterator<Class9369<?>> iterator = class5724.method12810().iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().method34766().method30737() != 14) {
                            continue;
                        }
                        BaicAutoGapple.mc.player.inventory.field2743 = this.field15615;
                        this.field15615 = -1;
                        this.field15614 = -1;
                    }
                }
            }
        }
    }
}
