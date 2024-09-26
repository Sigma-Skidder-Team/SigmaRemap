package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.command.impl.Peek;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRenderShulker;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.EventMouse;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class ShulkerInfo extends Module {
    public int field23841 = -1;
    public double field23842;

    public ShulkerInfo() {
        super(ModuleCategory.GUI, "ShulkerInfo", "Shows shulker information");
        this.method16005(false);
    }

    @EventTarget
    private void method16669(EventMouse var1) {
        this.field23842 = this.field23842 - var1.method13980();
    }

    private int method16670() {
        int var3 = !(this.field23842 > 0.0) ? (int) Math.floor(this.field23842 / 5.0) : (int) Math.ceil(this.field23842 / 5.0);
        this.field23842 = 0.0;
        return var3;
    }

    @EventTarget
    public void method16671(Render3DEvent var1) {
        if (this.isEnabled()) {
            RenderSystem.method27905(33986, 240.0F, 240.0F);

            for (Entity var5 : MultiUtilities.getEntitesInWorld()) {
                if (var5 instanceof ItemEntity) {
                    ItemEntity var6 = (ItemEntity) var5;
                    if (!(var6.method4124().getItem() instanceof Class3292)
                            || !(((Class3292) var6.method4124().getItem()).method11845() instanceof Class3368)) {
                        return;
                    }

                    this.method16674(
                            Class9647.method37622(var5).field43722,
                            Class9647.method37622(var5).field43723 + (double) var5.getHeight(),
                            Class9647.method37622(var5).field43724,
                            var5,
                            0.8F
                    );
                    if (this.method16672(var6)) {
                        double var7 = Class9647.method37622(var5).field43722 - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                        double var9 = Class9647.method37622(var5).field43723 - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                        double var11 = Class9647.method37622(var5).field43724 - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                        float var13 = 0.3F;
                        GL11.glEnable(3042);
                        GL11.glAlphaFunc(516, 0.0F);
                        GL11.glEnable(2848);
                        RenderUtil.render3DColoredBox(
                                new Box3D(
                                        var7 - (double) var13, var9 + 0.01F, var11 - (double) var13, var7 + (double) var13, var9 + (double) (var13 * 2.0F), var11 + (double) var13
                                ),
                                MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.1F)
                        );
                        RenderUtil.renderWireframeBox(
                                new Box3D(
                                        var7 - (double) var13, var9 + 0.01F, var11 - (double) var13, var7 + (double) var13, var9 + (double) (var13 * 2.0F), var11 + (double) var13
                                ),
                                3.0F,
                                MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.3F)
                        );
                        GL11.glDisable(3042);
                        if (mc.gameSettings.keyBindUseItem.isKeyDown()) {
                            mc.gameSettings.keyBindUseItem.pressed = false;
                            Peek.method18337(var6.method4124());
                        }
                    }

                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
                }
            }

            RenderSystem.method27905(33986, 240.0F, 240.0F);
            TextureImpl.method36180();
            TextureManager var10000 = mc.getTextureManager();
            mc.getTextureManager();
            var10000.bindTexture(TextureManager.field1094);
        }
    }

    public boolean method16672(ItemEntity var1) {
        if (mc.player.getDistance(var1) > 5.0F) {
            return false;
        } else {
            float var4 = (float) Math.sqrt(6.0 / Class9647.method37620(var1));
            float var5 = 10.0F * var4;
            double var6 = var1.getPosX() - mc.player.getPosX();
            double var8 = var1.getPosY() - mc.player.getPosY() - (double) mc.player.getHeight() + 0.4F;
            double var10 = var1.getPosZ() - mc.player.getPosZ();
            double var12 = MathHelper.sqrt(var6 * var6 + var10 * var10);
            float var14 = RotationHelper.calculate(mc.player.rotationYaw, (float) (Math.atan2(var10, var6) * 180.0 / Math.PI) - 90.0F, 360.0F);
            float var15 = RotationHelper.calculate(mc.player.rotationPitch, (float) (-(Math.atan2(var8, var12) * 180.0 / Math.PI)), 360.0F);
            return this.method16673(mc.player.rotationYaw, var14) <= var5 && this.method16673(mc.player.rotationPitch, var15) <= var5;
        }
    }

    public float method16673(float var1, float var2) {
        float var5 = Math.abs(var2 - var1) % 360.0F;
        return !(var5 > 180.0F) ? var5 : 360.0F - var5;
    }

    public void method16674(double var1, double var3, double var5, Entity var7, float var8) {
        ClientResource var11 = ResourceRegistry.JelloLightFont25;
        String var12 = var7.getName().getUnformattedComponentText();
        float var13 = (float) (var1 - mc.gameRenderer.getActiveRenderInfo().getPos().getX());
        float var14 = (float) (var3 - mc.gameRenderer.getActiveRenderInfo().getPos().getY());
        float var15 = (float) (var5 - mc.gameRenderer.getActiveRenderInfo().getPos().getZ());
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glTranslated(var13, var14 + 0.6F - 0.33333334F * (1.0F - var8), var15);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getYaw(), 0.0F, -1.0F, 0.0F);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getPitch(), 1.0F, 0.0F, 0.0F);
        GL11.glScalef(-0.009F * var8, -0.009F * var8, -0.009F * var8);
        GL11.glTranslated(-var11.method23942(var12) / 2, 0.0, 0.0);
        List var16 = this.method16678(((ItemEntity) var7).method4124());
        this.method16676(-87, -70, var16, ((ItemEntity) var7).method4124().method32149().getString(), false);
        GL11.glPopMatrix();
        GL11.glEnable(2929);
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    @EventTarget
    private void method16675(EventRenderShulker var1) {
        if (this.isEnabled()) {
            if (mc.currentScreen instanceof ContainerScreen) {
                ContainerScreen var4 = (ContainerScreen) mc.currentScreen;
                Slot var5 = var4.field4729;
                if (var5 != null
                        && var5.getHasStack()
                        && var5.getStack().getItem() instanceof Class3292
                        && ((Class3292) var5.getStack().getItem()).method11845() instanceof Class3368) {
                    ItemStack var6 = var5.getStack();
                    List var7 = this.method16678(var6);
                    int var8 = Math.max(-1, Math.min(1, this.method16670()));
                    if (var8 != 0 || this.field23841 != -1) {
                        this.field23841 = Math.max(0, Math.min(var7.size() - 1, this.field23841 - var8));
                    }

                    GL11.glPushMatrix();
                    GL11.glTranslatef(0.0F, 0.0F, 1000.0F);
                    GL11.glScalef(1.0F / RenderUtil.method11417(), 1.0F / RenderUtil.method11417(), 0.0F);
                    int var9 = Math.round(16.0F * RenderUtil.method11417());
                    byte var10 = 1;
                    byte var11 = 12;
                    int var12 = ResourceRegistry.JelloLightFont25.method23952();
                    int var13 = (int) (mc.mouseHelper.method36738() * (double) GuiManager.portalScaleFactor - (double) (9 * (var9 + var10)) - (double) (var11 * 3));
                    int var14 = (int) (mc.mouseHelper.method36739() * (double) GuiManager.portalScaleFactor - 33.0);
                    this.method16676(var13, var14, var7, var6.method32149().getString(), true);
                    GL11.glPopMatrix();
                    RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
                    RenderSystem.enableCull();
                    RenderSystem.disableDepthTest();
                    RenderSystem.enableBlend();
                    RenderSystem.method27819(518, 0.1F);
                } else {
                    this.field23841 = -1;
                    this.field23842 = 0.0;
                }
            }
        }
    }

    private void method16676(int var1, int var2, List<ItemStack> var3, String var4, boolean var5) {
        byte var8 = 12;
        int var9 = ResourceRegistry.JelloLightFont25.method23952();
        int var10 = Math.round(16.0F * RenderUtil.method11417());
        byte var11 = 1;
        int var12 = (int) Math.ceil((float) var3.size() / 9.0F) * (var10 + var11) + var8 * 2 + var9;
        int var13 = 9 * (var10 + var11) + var8 * 2;
        RenderSystem.method27821();
        GL11.glAlphaFunc(519, 0.0F);
        if (!var5) {
            RenderUtil.method11424(
                    (float) var1,
                    (float) var2,
                    (float) var13,
                    (float) var12,
                    MultiUtilities.applyAlpha(MultiUtilities.method17690(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor, 75.0F), 0.7F)
            );
            RenderUtil.drawRoundedRect((float) var1, (float) var2, (float) var13, (float) var12, 10.0F, 0.5F);
        } else {
            RenderUtil.method11467(var1, var2, var13, var12, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.94F));
        }

        RenderUtil.drawString(
                ResourceRegistry.JelloLightFont25, (float) (var1 + var8), (float) (var2 + var8 - 3), var4, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F)
        );
        RenderSystem.method27820();

        for (int var14 = 0; var14 < var3.size(); var14++) {
            ItemStack var15 = var3.get(var14);
            int var16 = var2 + var9 + var8 + var14 / 9 * (var10 + var11);
            int var17 = var1 + var8 + var14 % 9 * (var10 + var11);
            RenderSystem.method27821();
            if (var14 == this.field23841 && var5) {
                RenderUtil.method11424((float) var17, (float) var16, (float) var10, (float) var10, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.15F));
            }

            RenderUtil.method11479(var15, var17, var16, var10, var10);
            if (var15.field39976 > 1) {
                int var18 = var10 - ResourceRegistry.JelloLightFont20.method23942("" + var15.field39976);
                int var19 = ResourceRegistry.JelloLightFont20.method23942("" + var15.field39976);
                GL11.glAlphaFunc(519, 0.0F);
                RenderSystem.method27821();
                RenderUtil.method11450(
                        (float) (var17 + var18 - 17 - var19 / 4),
                        (float) (var16 + 7),
                        (float) (40 + var19),
                        40.0F,
                        ResourcesDecrypter.shadowPNG,
                        MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.7F),
                        false
                );
                RenderUtil.drawString(ResourceRegistry.JelloLightFont20, (float) (var17 + var18), (float) (var16 + 13), "" + var15.field39976, ClientColors.LIGHT_GREYISH_BLUE.getColor);
                RenderSystem.method27820();
            }

            RenderSystem.method27820();
        }

        for (int var23 = 0; var23 < var3.size(); var23++) {
            ItemStack var24 = var3.get(var23);
            int var25 = var2 + var9 + var8 + var23 / 9 * (var10 + var11);
            int var27 = var1 + var8 + var23 % 9 * (var10 + var11);
            if (var23 == this.field23841 && var5) {
                RenderSystem.method27821();
                int var29 = mc.fontRenderer.getStringWidth(var24.method32149().getUnformattedComponentText());
                List var32 = this.method16677(var24);

                for (int var20 = 0; var20 < var32.size(); var20++) {
                    var29 = Math.max(var29, mc.fontRenderer.getStringWidth((String) var32.get(var20)));
                }

                var29 = (int) ((float) var29 * RenderUtil.method11417());
                int var33 = var32.size();
                RenderUtil.method11424(
                        (float) var27,
                        (float) (var25 + var10),
                        (float) var29 + 9.0F * RenderUtil.method11417(),
                        10.0F * RenderUtil.method11417() * (float) var33 + 7.0F * RenderUtil.method11417(),
                        MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.8F)
                );
                GL11.glPushMatrix();
                GL11.glScalef(RenderUtil.method11417(), RenderUtil.method11417(), 0.0F);
                var25 = (int) ((float) var25 * (1.0F / RenderUtil.method11417()));
                var27 = (int) ((float) var27 * (1.0F / RenderUtil.method11417()));
                var10 = (int) ((float) var10 * (1.0F / RenderUtil.method11417()));
                var29 = (int) ((float) var29 * (1.0F / RenderUtil.method11417()));

                for (int var21 = 0; var21 < var32.size(); var21++) {
                    String var22 = (String) var32.get(var21);
                    mc.fontRenderer
                            .method38807(
                                    var22,
                                    (float) (var27 + 5),
                                    5.3F + (float) var25 + (float) var10 + (float) (var21 * 10),
                                    ClientColors.LIGHT_GREYISH_BLUE.getColor,
                                    new MatrixStack().getLast().getMatrix(),
                                    false,
                                    false
                            );
                }

                GL11.glPopMatrix();
                RenderSystem.method27820();
            }
        }
    }

    public List<String> method16677(ItemStack var1) {
        List<ITextComponent> var4 = var1.getTooltip(mc.player, !mc.gameSettings.field44588 ? TooltipFlags.NORMAL : TooltipFlags.field14481);
        List var5 = Lists.newArrayList();

        for (ITextComponent var7 : var4) {
            var5.add(var7.getString());
        }

        return var5;
    }

    private List<ItemStack> method16678(ItemStack var1) {
        List<ItemStack> var4 = new ArrayList();
        CompoundNBT var5 = var1.method32142();
        if (var5 != null && var5.contains("BlockEntityTag", 10)) {
            CompoundNBT var6 = var5.getCompound("BlockEntityTag");
            Peek.method18338(var6);
            if (var6.contains("Items", 9)) {
                NonNullList<ItemStack> var7 = NonNullList.method68(27, ItemStack.EMPTY);
                Class7920.method26567(var6, var7);

                for (ItemStack var9 : var7) {
                    if (!var9.isEmpty()) {
                        boolean var10 = true;

                        for (ItemStack var12 : var4) {
                            if (var9.method32132(var12) && ItemStack.method32127(var12, var9)) {
                                var12.method32180(var9.getCount() + var12.getCount());
                                var10 = false;
                            }
                        }

                        if (var10) {
                            var4.add(var9);
                        }
                    }
                }
            }
        }

        return var4;
    }
}
