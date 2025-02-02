// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.mods.impl.movement.flys.MineplexFly;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class CakeEater extends Module
{
    public static BlockPos field15674;
    
    public CakeEater() {
        super(Category.WORLD, "CakeEater", "Automatically eats cake");
        this.addSetting(new BooleanSetting("No Swing", "Removes the swing animation.", true));
        this.addSetting(new BooleanSetting("Mineplex", "Mineplex mode.", true));
    }
    
    @Override
    public void onDisable() {
        CakeEater.field15674 = null;
    }
    
    @EventListener
    private void method10145(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4378) {
                if (((Class4378)class5723.method16998()).method13164().getFormattedText().equals("§9Game> §r§7You cannot eat your own cake!§r")) {
                    class5723.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    @Class6757
    private void method10146(final Class5744 class5744) {
        if (!this.isEnabled()) {
            return;
        }
        final ModuleWithSettings class5745 = (ModuleWithSettings) Client.getInstance().method35189().method21551(Fly.class);
        if (class5745.method10260() instanceof MineplexFly && ((MineplexFly)class5745.method10260()).method10632()) {
            return;
        }
        if (!class5744.method17046()) {
            if (CakeEater.field15674 != null) {
                if (this.method9883("No Swing") && !this.method9883("Mineplex")) {
                    CakeEater.mc.method5269().method17292(new Class4380(Class316.field1877));
                }
                else if (!this.method9883("No Swing")) {
                    CakeEater.mc.player.method2707(Class316.field1877);
                }
                CakeEater.mc.method5269().method17292(new Class4329(Class316.field1877, new BlockRayTraceResult(new Vec3d(CakeEater.field15674.getX() + 0.4 + Math.random() * 0.2, CakeEater.field15674.getY() + 0.5, CakeEater.field15674.getZ() + 0.4 + Math.random() * 0.2), Direction.UP, CakeEater.field15674, false)));
            }
        }
        else {
            final List<BlockPos> method10147 = this.method10147(this.method9883("Mineplex") ? 6.0f : CakeEater.mc.playerController.method27315());
            if (method10147.isEmpty()) {
                CakeEater.field15674 = null;
            }
            else {
                Collections.sort((List<Object>)method10147, (Comparator<? super Object>)new Class4468(this));
                CakeEater.field15674 = method10147.get(0);
                if (!this.method9883("Mineplex")) {
                    final float[] method10148 = Class8845.method30919(CakeEater.field15674.getX() + 0.5, CakeEater.field15674.getZ() + 0.5, CakeEater.field15674.getY());
                    class5744.method17043(method10148[0]);
                    class5744.method17041(method10148[1]);
                }
            }
        }
    }
    
    private List<BlockPos> method10147(final float n) {
        final ArrayList list = new ArrayList();
        for (float n2 = n + 2.0f; n2 >= -n + 1.0f; --n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    final BlockPos class354 = new BlockPos(CakeEater.mc.player.posX + n3, CakeEater.mc.player.posY + n2, CakeEater.mc.player.posZ + n4);
                    if (CakeEater.mc.world.getBlockState(class354).method21696() instanceof Class3963) {
                        if (Math.sqrt(CakeEater.mc.player.method1733(class354.getX() + 0.5, class354.getY() + 0.5, class354.getZ() + 0.5)) < n) {
                            list.add(class354);
                        }
                    }
                }
            }
        }
        return list;
    }
}
