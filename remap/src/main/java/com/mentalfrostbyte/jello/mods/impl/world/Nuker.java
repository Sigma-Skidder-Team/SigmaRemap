// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import java.util.ArrayList;
import com.google.common.collect.ImmutableMap;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringListSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.List;

public class Nuker extends Module
{
    private BlockPos field15977;
    private List<BlockPos> field15978;
    
    public Nuker() {
        super(Category.WORLD, "Nuker", "Destroys blocks around you");
        this.addSetting(new NumberSetting("Range", "Range value for nuker", 6.0f, Float.class, 2.0f, 10.0f, 1.0f));
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "All", "One hit", "Bed", "Egg" }));
        this.addSetting(new BooleanSetting("NoSwing", "Removes the swing animation.", false));
        this.addSetting(new StringListSetting("Blocks", "Blocks to destroy", true));
    }
    
    @EventListener
    private void method10609(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            this.field15978 = this.method10612(this.getNumberSettingValueByName("Range") / 2.0f);
            if (this.field15978.isEmpty()) {
                this.field15977 = null;
            }
            else if (Nuker.mc.playerController.method27336() != Class101.field299) {
                if (this.field15977 != null) {
                    if (Nuker.mc.world.getBlockState(this.field15977).method21706() || Math.sqrt(Nuker.mc.player.method1733(this.field15977.getX() + 0.5, this.field15977.getY() + 0.5, this.field15977.getZ() + 0.5)) > 6.0) {
                        this.field15977 = this.field15978.get(0);
                    }
                    final float[] method30919 = Class8845.method30919(this.field15977.getX(), this.field15977.getZ(), this.field15977.getY());
                    updateWalkingEvent.method17043(method30919[0]);
                    updateWalkingEvent.method17041(method30919[1]);
                    Client.getInstance().getEventBus().post(new Class5752(0, false, this.field15977));
                    Nuker.mc.playerController.method27314(this.field15977, Class4609.method13710(this.field15977));
                    if (!this.getBooleanValueFromSettingName("NoSwing")) {
                        Nuker.mc.player.method2707(Class316.field1877);
                    }
                    else {
                        Nuker.mc.method5269().method17292(new Class4380(Class316.field1877));
                    }
                }
                else {
                    this.field15977 = this.field15978.get(0);
                    final float[] method30920 = Class8845.method30919(this.field15977.getX(), this.field15977.getZ(), this.field15977.getY());
                    updateWalkingEvent.method17043(method30920[0]);
                    updateWalkingEvent.method17041(method30920[1]);
                    Client.getInstance().getEventBus().post(new Class5752(0, false, this.field15977));
                    Nuker.mc.playerController.method27314(this.field15977, Class4609.method13710(this.field15977));
                    if (!this.getBooleanValueFromSettingName("NoSwing")) {
                        Nuker.mc.player.method2707(Class316.field1877);
                    }
                    else {
                        Nuker.mc.method5269().method17292(new Class4380(Class316.field1877));
                    }
                }
            }
            else {
                for (final BlockPos class5745 : this.field15978) {
                    Nuker.mc.method5269().method17292(new Class4399(Class2003.field11240, class5745, Class4609.method13710(class5745)));
                    if (!this.getBooleanValueFromSettingName("NoSwing")) {
                        Nuker.mc.player.method2707(Class316.field1877);
                    }
                    else {
                        Nuker.mc.method5269().method17292(new Class4380(Class316.field1877));
                    }
                }
            }
        }
    }
    
    public static void method10610(final BlockPos class354) {
        Nuker.mc.method5269().method17292(new Class4399(Class2003.field11240, class354, Direction.UP));
        Nuker.mc.method5269().method17292(new Class4399(Class2003.field11242, class354, Direction.UP));
        Nuker.mc.world.method6692(class354, new BlockState(Blocks.AIR, (ImmutableMap<IProperty<?>, Comparable<?>>)ImmutableMap.builder().build()));
    }
    
    private boolean method10611(final BlockPos class354) {
        final Block method21696 = Nuker.mc.world.getBlockState(class354).method21696();
        return Nuker.mc.world.getBlockState(class354).method21697().method26442() || method21696 instanceof Class3874;
    }
    
    private List<BlockPos> method10612(final float n) {
        final ArrayList list = new ArrayList();
        for (float n2 = n + 2.0f; n2 >= -n + 1.0f; --n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    final BlockPos class354 = new BlockPos(Nuker.mc.player.posX + n3, Nuker.mc.player.posY + n2, Nuker.mc.player.posZ + n4);
                    if (!Nuker.mc.world.getBlockState(class354).method21706() && Nuker.mc.world.getBlockState(class354).method21756().method21781() && Math.sqrt(Nuker.mc.player.method1733(class354.getX() + 0.5, class354.getY() + 0.5, class354.getZ() + 0.5)) < n) {
                        final String method9887 = this.getStringSettingValueByName("Mode");
                        switch (method9887) {
                            case "One hit": {
                                if (!this.method10611(class354)) {
                                    continue;
                                }
                                break;
                            }
                            case "Bed": {
                                if (!(Nuker.mc.world.getBlockState(class354).method21696() instanceof Class3900)) {
                                    continue;
                                }
                                break;
                            }
                            case "Egg": {
                                if (!(Nuker.mc.world.getBlockState(class354).method21696() instanceof Class3987)) {
                                    continue;
                                }
                                break;
                            }
                        }
                        list.add(class354);
                    }
                }
            }
        }
        return list;
    }
}
