package com.mentalfrostbyte.jello.module.impl.render.classic;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender2D;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.EventRenderNameTag;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Nametags extends Module {
    public static Nametags field23494;
    private final HashMap<PlayerEntity, Vector2f> field23493 = new HashMap<PlayerEntity, Vector2f>();

    public Nametags() {
        super(ModuleCategory.RENDER, "NameTags", "Render better name tags");
        field23494 = this;
    }

    @EventTarget
    public void method16147(EventRender2D var1) {
        if (this.isEnabled()) {
            byte var4 = 20;
            byte var5 = 32;

            for (Entry var7 : this.field23493.entrySet()) {
                PlayerEntity var8 = (PlayerEntity) var7.getKey();
                if (!var8.isInvisible()) {
                    Vector2f var9 = (Vector2f) var7.getValue();
                    String var10 = var8.getName().getUnformattedComponentText();
                    int var11 = ClassicDecryption.bold16.method23942(var10) + 8;
                    int var12 = Math.round(var9.field37220);
                    int var13 = Math.round(var9.field37221);
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float) (-var11 / 2), (float) (-var4), 0.0F);
                    RenderUtil.method11424((float) var12, (float) var13, (float) var11, 20.0F, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.5F));
                    RenderUtil.drawString(
                            ClassicDecryption.bold16, (float) (var12 + 3), (float) var13, var10, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.5F)
                    );
                    RenderUtil.drawString(ClassicDecryption.bold16, (float) (var12 + 3), (float) (var13 - 1), var10, ClientColors.LIGHT_GREYISH_BLUE.getColor);
                    GL11.glPopMatrix();
                    List var14 = InvManagerUtils.method25877(var8);
                    if (var14.size() != 0) {
                        int var15 = var5 * var14.size();
                        GL11.glPushMatrix();
                        GL11.glTranslatef((float) (-var15 / 2), (float) (-var4 - var5 - 2), 0.0F);

                        for (int var16 = 0; var16 < var14.size(); var16++) {
                            int var17 = var12 + var16 * var5;
                            ItemStack var18 = (ItemStack) var14.get(var16);
                            int var19 = var17 + 6;
                            ListNBT var20 = var18.method32147();
                            int var21 = var13 - Math.max(0, var20.size() - 4) * 8 - 2;

                            for (int var22 = 0; var22 < var20.size(); var22++) {
                                CompoundNBT var23 = var20.method153(var22);
                                int var24 = var22 * 8 + 10;
                                Registry.ENCHANTMENT.method9187(ResourceLocation.method8289(var23.getString("id"))).ifPresent(var1x -> {
                                    String var4x = var1x.method18820(1).getUnformattedComponentText();
                                    String var5x = "§f" + var4x.substring(0, Math.min(2, var4x.length()));
                                    int var6 = 0;
                                    if (var23.contains("lvl")) {
                                        var6 = var23.getInt("lvl");
                                    }

                                    String var7x = "§a";
                                    if (var6 <= 3) {
                                        if (var6 > 2) {
                                            var7x = "§6";
                                        }
                                    } else {
                                        var7x = "§c";
                                    }

                                    String var8x = var5x + var7x + var6;
                                });
                            }

                            int var25 = !var18.method32116() ? var18.method32119() : var18.method32119() - var18.method32117();
                            String var26 = "§a";
                            if (!((float) var25 / (float) var18.method32119() < 0.2F)) {
                                if ((float) var25 / (float) var18.method32119() < 0.5F) {
                                    var26 = "§6";
                                }
                            } else {
                                var26 = "§c";
                            }
                        }

                        GL11.glPopMatrix();
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16148(Render3DEvent var1) {
        if (this.isEnabled()) {
            this.field23493.clear();

            for (Entity var5 : mc.world.getEntities()) {
                if (var5 instanceof PlayerEntity && !(var5 instanceof ClientPlayerEntity)) {
                    PlayerEntity var6 = (PlayerEntity) var5;
                    Class9425 var7 = Class9647.method37623(var6);
                    double[] var8 = RenderUtil.method11482(var7.field43722, var7.field43723 + (double) var6.getHeight() + 0.3F, var7.field43724);
                    if (var8 != null && var8[2] >= 0.0 && var8[2] < 1.0) {
                        this.field23493.put(var6, new Vector2f((float) var8[0], (float) var8[1]));
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16149(EventRenderNameTag var1) {
        if (this.isEnabled() && var1.method13987() instanceof PlayerEntity) {
            var1.setCancelled(true);
        }
    }
}
