// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.player.autogapples.*;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.List;

public class AutoGapple extends ModuleWithSettings
{
    public AutoGapple() {
        super(Category.ITEM, "AutoGapple", "Automatically eat golden apples", new Module[] { new BaicAutoGapple(), new HypixelAutoGapple() });
        this.addSetting(new NumberSetting("Health", "Maximum health before eating gapple.", 7.0f, Float.class, 0.5f, 10.0f, 0.5f));
    }
    
    public int method10292(final boolean b) {
        for (int i = 36; i < 45; ++i) {
            if (AutoGapple.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = AutoGapple.mc.player.container.getSlot(i).method20053();
                if (method20053 != null) {
                    if (!b) {
                        if (method20053.getItem() == Items.field31341 || method20053.getItem() == Items.field31342) {
                            return i - 36;
                        }
                    }
                    else {
                        final List<Class1948> method20054 = InvManagerUtil.method29355(method20053);
                        if (method20054 != null) {
                            final Iterator<Class1948> iterator = method20054.iterator();
                            while (iterator.hasNext()) {
                                if (iterator.next().method7906() != Class9439.field40485) {
                                    continue;
                                }
                                return i - 36;
                            }
                        }
                    }
                }
            }
        }
        for (int j = 9; j < 36; ++j) {
            if (AutoGapple.mc.player.container.getSlot(j).method20054()) {
                final ItemStack method20055 = AutoGapple.mc.player.container.getSlot(j).method20053();
                if (!b) {
                    if (method20055.getItem() == Items.field31341 || method20055.getItem() == Items.field31342) {
                        InvManagerUtil.method29370(j, 4);
                        return -1;
                    }
                }
                else {
                    final List<Class1948> method20056 = InvManagerUtil.method29355(method20055);
                    if (method20056 != null) {
                        final Iterator<Class1948> iterator2 = method20056.iterator();
                        while (iterator2.hasNext()) {
                            if (iterator2.next().method7906() != Class9439.field40485) {
                                continue;
                            }
                            InvManagerUtil.method29370(j, 4);
                            return -1;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
