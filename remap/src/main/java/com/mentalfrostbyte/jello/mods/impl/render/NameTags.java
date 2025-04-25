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
    private HashMap<PlayerEntity, Vec2f> field15776;
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
            for (final Map.Entry<PlayerEntity, V> entry : this.field15776.entrySet()) {
                final PlayerEntity class5735 = entry.getKey();
                if (!class5735.method1823()) {
                    final Vec2f class5736 = (Vec2f)entry.getValue();
                    final String method8459 = class5735.getName().getUnformattedComponentText();
                    final int n3 = ClassicAssets.field40813.getWidth(method8459) + 8;
                    final int round = Math.round(class5736.x);
                    final int round2 = Math.round(class5736.y);
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)(-n3 / 2), (float)(-n), 0.0f);
                    RenderUtil.method26874((float)round, (float)round2, (float)n3, 20.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f));
                    RenderUtil.drawString(ClassicAssets.field40813, (float)(round + 3), (float)round2, method8459, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f));
                    RenderUtil.drawString(ClassicAssets.field40813, (float)(round + 3), (float)(round2 - 1), method8459, ClientColors.LIGHT_GREYISH_BLUE.color);
                    GL11.glPopMatrix();
                    final List<ItemStack> method8460 = InvManagerUtil.method29374(class5735);
                    if (method8460.size() == 0) {
                        continue;
                    }
                    final int n4 = n2 * method8460.size();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)(-n4 / 2), (float)(-n - n2 - 2), 0.0f);
                    for (int i = 0; i < method8460.size(); ++i) {
                        final ItemStack class5737 = method8460.get(i);
                        final ListNBT method8461 = class5737.method27662();
                        final int n5 = round2 - Math.max(0, method8461.size() - 4) * 8 - 2;
                        for (int j = 0; j < method8461.size(); ++j) {
                            Registry.field209.method506(ResourceLocation.method7795(method8461.method346(j).getString("id"))).ifPresent(class5739 -> {
                                class5739.method18599(1).getUnformattedComponentText();
                                final String s;
                                new StringBuilder().append("§f").append(s.substring(0, Math.min(2, s.length()))).toString();
                                int method8462 = 0;
                                if (!(!class5738.method315("lvl"))) {
                                    method8462 = class5738.method319("lvl");
                                }
                                String str = null;
                                if (method8462 <= 3) {
                                    if (method8462 > 2) {
                                        str = "§6";
                                    }
                                }
                                else {
                                    str = "§c";
                                }
                                final String str2;
                                new StringBuilder().append(str2).append(str).append(method8462).toString();
                                return;
                            });
                        }
                        final int n6 = class5737.method27631() ? (class5737.method27634() - class5737.method27632()) : class5737.method27634();
                        if (n6 / (float)class5737.method27634() >= 0.2f) {
                            if (n6 / (float)class5737.method27634() >= 0.5f) {}
                        }
                    }
                    GL11.glPopMatrix();
                }
            }
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
