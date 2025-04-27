// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class Blink extends Module
{
    public static Class755 field15771;
    private final List<IPacket<?>> field15772;
    private Vec3d field15773;
    public float field15774;
    public float field15775;
    
    public Blink() {
        super(Category.PLAYER, "Blink", "Stops your packets to blink");
        this.field15772 = new ArrayList<IPacket<?>>();
    }
    
    @Override
    public void onEnable() {
        this.field15773 = new Vec3d(Blink.mc.player.posX, Blink.mc.player.posY, Blink.mc.player.posZ);
        this.field15774 = Blink.mc.player.rotationYaw;
        this.field15775 = Blink.mc.player.rotationPitch;
        Blink.field15771 = new Class755(Blink.mc.world, Blink.mc.player.method2844());
        Blink.field15771.inventory = Blink.mc.player.inventory;
        Blink.field15771.method1728(this.field15773.x, this.field15773.y, this.field15773.z, this.field15774, this.field15775);
        Blink.field15771.field2953 = Blink.mc.player.field2953;
        Blink.mc.world.method6819(-1, Blink.field15771);
    }
    
    @Override
    public void onDisable() {
        for (int size = this.field15772.size(), i = 0; i < size; ++i) {
            Blink.mc.method5269().method17292(this.field15772.get(i));
        }
        this.field15772.clear();
        Blink.mc.world.method6821(-1);
    }
    
    @EventListener
    private void method10323(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (Blink.mc.player == null || !(class5721.method16990() instanceof Class4336)) {
                if (!(class5721.method16990() instanceof Class4353)) {
                    if (!(class5721.method16990() instanceof Class4381)) {
                        if (!(class5721.method16990() instanceof Class4380)) {
                            if (!(class5721.method16990() instanceof Class4307)) {
                                return;
                            }
                        }
                    }
                }
            }
            this.field15772.add(class5721.method16990());
            class5721.setCancelled(true);
        }
    }
}
