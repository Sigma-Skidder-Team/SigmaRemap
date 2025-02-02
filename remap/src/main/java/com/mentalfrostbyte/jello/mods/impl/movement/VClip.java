// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class VClip extends Module
{
    public Category field15535;
    public Module field15536;
    private String field15537;
    
    public VClip() {
        super(Category.MOVEMENT, "VClip", "Climp Walls like spiders!");
        this.field15537 = ">";
    }
    
    @EventListener
    private void method9943(final Class5748 class5748) {
        if (this.isEnabled()) {
            if (VClip.mc.gameSettings.field23440.method1056()) {
                if (class5748.method17055() == Class1958.field10672) {
                    if (VClip.mc.player.rotationPitch >= 0.0f) {
                        this.method9948(this.method9946());
                    }
                    else {
                        this.method9948(this.method9947());
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method9944(final Class5721 class5721) {
        if (class5721.method16990() instanceof Class4317) {
            final String method12973 = ((Class4317)class5721.method16990()).method12973();
            final String s = "hclip";
            if (!method12973.startsWith("/" + s)) {
                return;
            }
            class5721.setCancelled(true);
            int int1 = 0;
            final String replaceAll = method12973.replace("/" + s, "").replaceAll("\\s", "");
            if (method9945(replaceAll)) {
                int1 = Integer.parseInt(replaceAll);
            }
            final float n = (float)Math.toRadians(VClip.mc.player.rotationYaw + 90.0f);
            VClip.mc.player.setPosition(VClip.mc.player.posX + MathHelper.cos(n) * int1, VClip.mc.player.posY, VClip.mc.player.posZ + MathHelper.sin(n) * int1);
        }
    }
    
    public static boolean method9945(final String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
    
    private int method9946() {
        boolean method21723 = false;
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            final BlockPos class354 = new BlockPos(VClip.mc.player.posX, VClip.mc.player.posY - i, VClip.mc.player.posZ);
            if (VClip.mc.world.getBlockState(class354).method21723() && method21723) {
                n = -i;
                break;
            }
            method21723 = VClip.mc.world.getBlockState(class354).method21723();
        }
        return n;
    }
    
    private int method9947() {
        boolean method21723 = false;
        int n = 0;
        for (int i = 10; i > 0; --i) {
            final BlockPos class354 = new BlockPos(VClip.mc.player.posX, VClip.mc.player.posY + i, VClip.mc.player.posZ);
            if (VClip.mc.world.getBlockState(class354).method21723()) {
                if (method21723) {
                    if (!VClip.mc.world.getBlockState(class354.method1139()).method21723()) {
                        n = i;
                        break;
                    }
                }
            }
            method21723 = VClip.mc.world.getBlockState(class354).method21723();
        }
        return n;
    }
    
    private void method9948(final int i) {
        if (i == 0) {
            ColorUtils.method19106("§cCouldn't VClip");
        }
        else {
            VClip.mc.method5269().method17292(new Class4354(VClip.mc.player.posX, VClip.mc.player.posY + i, VClip.mc.player.posZ, false));
            VClip.mc.player.setPosition(VClip.mc.player.posX, VClip.mc.player.posY + i, VClip.mc.player.posZ);
            Client.getInstance().method35197().method25776(new Class6224("Successfuly VCliped", i + " Blocks", 2000, ClientAssets.direction));
        }
    }
}
