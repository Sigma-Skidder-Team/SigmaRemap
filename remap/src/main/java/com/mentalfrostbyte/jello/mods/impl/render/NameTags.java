// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import java.util.List;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import java.util.Map;
import java.util.HashMap;

public class NameTags extends Module
{
    private final HashMap<PlayerEntity, Vec2f> field15776;
    public static NameTags field15777;
    
    public NameTags() {
        super(Category.RENDER, "NameTags", "Render better name tags");
        this.field15776 = new HashMap<PlayerEntity, Vec2f>();
        NameTags.field15777 = this;
    }
    
    @EventListener
    public void method10324(final Custom2DRenderEvent custom2DRenderEvent) {
        if (this.isEnabled()) {
            final int n = 20;
            final int n2 = 32;
        }
    }
    
    @EventListener
    public void method10325(final Custom3DRenderEvent custom3DRenderEvent) {
        if (this.isEnabled()) {
            this.field15776.clear();
            for (final Entity class5740 : NameTags.mc.world.method6806()) {
                if (!(class5740 instanceof PlayerEntity)) {
                    continue;
                }
                if (class5740 instanceof ClientPlayerEntity) {
                    continue;
                }
                final PlayerEntity key = (PlayerEntity)class5740;
                final Class9172 method29094 = Class8591.method29094(key);
                final double[] method29095 = RenderUtil.method26931(method29094.field38854, method29094.field38855 + key.method1931() + 0.30000001192092896, method29094.field38856);
                if (method29095 == null) {
                    continue;
                }
                if (method29095[2] < 0.0) {
                    continue;
                }
                if (method29095[2] >= 1.0) {
                    continue;
                }
                this.field15776.put(key, new Vec2f((float)method29095[0], (float)method29095[1]));
            }
        }
    }
    
    @EventListener
    public void method10326(final Class5749 class5749) {
        if (this.isEnabled()) {
            if (class5749.method17056() instanceof PlayerEntity) {
                class5749.setCancelled(true);
            }
        }
    }
}
