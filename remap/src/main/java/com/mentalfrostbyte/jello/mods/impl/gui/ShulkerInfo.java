// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Iterator;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import org.lwjgl.opengl.GL11;
import slick2d.TrueTypeFont;

public class ShulkerInfo extends Module
{
    public int field15530;
    public double field15531;
    
    public ShulkerInfo() {
        super(Category.GUI, "ShulkerInfo", "Shows shulker information");
        this.field15530 = -1;
        this.method9915(false);
    }
    
    @EventListener
    private void method9922(final Class5720 class5720) {
        this.field15531 -= class5720.method16989();
    }
    
    private int method9923() {
        final int n = (this.field15531 <= 0.0) ? ((int)Math.floor(this.field15531 / 5.0)) : ((int)Math.ceil(this.field15531 / 5.0));
        this.field15531 = 0.0;
        return n;
    }
    
    @EventListener
    public void method9924(final Class5739 class5739) {
        if (this.method9906()) {
            RenderSystem.method30084(33986, 240.0f, 240.0f);
            for (final Entity class5740 : Class6430.method19138()) {
                if (class5740 instanceof Class427) {
                    final Class427 class5741 = (Class427)class5740;
                    if (!(class5741.method2107().getItem() instanceof Class4036) || !(((Class4036)class5741.method2107().getItem()).method12240() instanceof Class3942)) {
                        return;
                    }
                    this.method9927(Class8591.method29093(class5740).field38854, Class8591.method29093(class5740).field38855 + class5740.method1931(), Class8591.method29093(class5740).field38856, class5740, 0.8f);
                    if (this.method9925(class5741)) {
                        final double n = Class8591.method29093(class5740).field38854 - ShulkerInfo.mc.field4644.method5833().method18161().getX();
                        final double n2 = Class8591.method29093(class5740).field38855 - ShulkerInfo.mc.field4644.method5833().method18161().getY();
                        final double n3 = Class8591.method29093(class5740).field38856 - ShulkerInfo.mc.field4644.method5833().method18161().getZ();
                        final float n4 = 0.3f;
                        GL11.glEnable(3042);
                        GL11.glAlphaFunc(516, 0.0f);
                        GL11.glEnable(2848);
                        Class8154.method26909(new Class7644(n - n4, n2 + 0.009999999776482582, n3 - n4, n + n4, n2 + n4 * 2.0f, n3 + n4), Class6430.method19118(Class265.field1273.field1292, 0.1f));
                        Class8154.method26912(new Class7644(n - n4, n2 + 0.009999999776482582, n3 - n4, n + n4, n2 + n4 * 2.0f, n3 + n4), 3.0f, Class6430.method19118(Class265.field1273.field1292, 0.3f));
                        GL11.glDisable(3042);
                        if (ShulkerInfo.mc.gameSettings.field23445.method1056()) {
                            ShulkerInfo.mc.gameSettings.field23445.field2162 = false;
                            Class6697.method20353(class5741.method2107());
                        }
                    }
                    GL11.glColor3f(1.0f, 1.0f, 1.0f);
                }
            }
            RenderSystem.method30084(33986, 240.0f, 240.0f);
            Class7777.method24931();
            final Class1663 method5290 = ShulkerInfo.mc.method5290();
            ShulkerInfo.mc.method5290();
            method5290.method5849(Class1663.field9428);
        }
    }
    
    public boolean method9925(final Class427 class427) {
        if (ShulkerInfo.mc.player.method1732(class427) <= 5.0f) {
            final float n = 10.0f * (float)Math.sqrt(6.0 / Class8591.method29091(class427));
            final double x = class427.posX - ShulkerInfo.mc.player.posX;
            final double y = class427.posY - ShulkerInfo.mc.player.posY - ShulkerInfo.mc.player.method1931() + 0.4000000059604645;
            final double y2 = class427.posZ - ShulkerInfo.mc.player.posZ;
            final double x2 = MathHelper.sqrt(x * x + y2 * y2);
            final float method30910 = Class8845.method30910(ShulkerInfo.mc.player.rotationYaw, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f);
            final float method30911 = Class8845.method30910(ShulkerInfo.mc.player.rotationPitch, (float)(-(Math.atan2(y, x2) * 180.0 / 3.141592653589793)), 360.0f);
            return this.method9926(ShulkerInfo.mc.player.rotationYaw, method30910) <= n && this.method9926(ShulkerInfo.mc.player.rotationPitch, method30911) <= n;
        }
        return false;
    }
    
    public float method9926(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % 360.0f;
        return (n3 <= 180.0f) ? n3 : (360.0f - n3);
    }
    
    public void method9927(final double n, final double n2, final double n3, final Entity class399, final float n4) {
        final TrueTypeFont field40314 = ClientFonts.JelloLight25;
        final String method8459 = class399.getName().getUnformattedComponentText();
        final float n5 = (float)(n - ShulkerInfo.mc.field4644.method5833().method18161().getX());
        final float n6 = (float)(n2 - ShulkerInfo.mc.field4644.method5833().method18161().getY());
        final float n7 = (float)(n3 - ShulkerInfo.mc.field4644.method5833().method18161().getZ());
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glAlphaFunc(519, 0.0f);
        GL11.glTranslated((double)n5, (double)(n6 + 0.6f - 0.33333334f * (1.0f - n4)), (double)n7);
        GL11.glRotatef(ShulkerInfo.mc.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
        GL11.glRotatef(ShulkerInfo.mc.field4644.method5833().method18163(), 1.0f, 0.0f, 0.0f);
        GL11.glScalef(-0.009f * n4, -0.009f * n4, -0.009f * n4);
        GL11.glTranslated((double)(-field40314.getWidth(method8459) / 2), 0.0, 0.0);
        this.method9929(-87, -70, this.method9931(((Class427)class399).method2107()), ((Class427)class399).method2107().method27664().getUnformattedComponentText(), false);
        GL11.glPopMatrix();
        GL11.glEnable(2929);
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
    
    @EventListener
    private void method9928(final Class5733 class5733) {
        if (!this.method9906()) {
            return;
        }
        if (ShulkerInfo.mc.field4700 instanceof Class516) {
            final Class6601 field3081 = ((Class516) ShulkerInfo.mc.field4700).field3081;
            if (field3081 != null) {
                if (field3081.method20054()) {
                    if (field3081.method20053().getItem() instanceof Class4036) {
                        if (((Class4036)field3081.method20053().getItem()).method12240() instanceof Class3942) {
                            final ItemStack method20053 = field3081.method20053();
                            final List<ItemStack> method20054 = this.method9931(method20053);
                            final int max = Math.max(-1, Math.min(1, this.method9923()));
                            if (max != 0 || this.field15530 != -1) {
                                this.field15530 = Math.max(0, Math.min(method20054.size() - 1, this.field15530 - max));
                            }
                            GL11.glPushMatrix();
                            GL11.glTranslatef(0.0f, 0.0f, 1000.0f);
                            GL11.glScalef(1.0f / Class8154.method26867(), 1.0f / Class8154.method26867(), 0.0f);
                            final int round = Math.round(16.0f * Class8154.method26867());
                            final int n = 1;
                            final int n2 = 12;
                            ClientFonts.JelloLight25.getHeight();
                            this.method9929((int)(ShulkerInfo.mc.field4650.method26959() * Class9000.field37993 - 9 * (round + n) - n2 * 3), (int)(ShulkerInfo.mc.field4650.method26960() * Class9000.field37993 - 33.0), method20054, method20053.method27664().getUnformattedComponentText(), true);
                            GL11.glPopMatrix();
                            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                            RenderSystem.method30028();
                            RenderSystem.disableDepthTest();
                            RenderSystem.enableBlend();
                            RenderSystem.method30000(518, 0.1f);
                            return;
                        }
                    }
                }
            }
            this.field15530 = -1;
            this.field15531 = 0.0;
        }
    }
    
    private void method9929(final int n, final int n2, final List<ItemStack> list, final String s, final boolean b) {
        final int n3 = 12;
        final int method23539 = ClientFonts.JelloLight25.getHeight();
        int round = Math.round(16.0f * Class8154.method26867());
        final int n4 = 1;
        final int n5 = (int)Math.ceil(list.size() / 9.0f) * (round + n4) + n3 * 2 + method23539;
        final int n6 = 9 * (round + n4) + n3 * 2;
        RenderSystem.method30002();
        GL11.glAlphaFunc(519, 0.0f);
        if (!b) {
            Class8154.method26874((float)n, (float)n2, (float)n6, (float)n5, Class6430.method19118(Class6430.method19120(Class265.field1278.field1292, Class265.field1273.field1292, 75.0f), 0.7f));
            Class8154.method26913((float)n, (float)n2, (float)n6, (float)n5, 10.0f, 0.5f);
        }
        else {
            Class8154.method26917(n, n2, n6, n5, Class6430.method19118(Class265.field1273.field1292, 0.94f));
        }
        Class8154.method26889(ClientFonts.JelloLight25, (float)(n + n3), (float)(n2 + n3 - 3), s, Class6430.method19118(Class265.field1278.field1292, 0.8f));
        RenderSystem.method30001();
        for (int i = 0; i < list.size(); ++i) {
            final ItemStack class8321 = list.get(i);
            final int n7 = n2 + method23539 + n3 + i / 9 * (round + n4);
            final int n8 = n + n3 + i % 9 * (round + n4);
            RenderSystem.method30002();
            if (i == this.field15530) {
                if (b) {
                    Class8154.method26874((float)n8, (float)n7, (float)round, (float)round, Class6430.method19118(Class265.field1278.field1292, 0.15f));
                }
            }
            Class8154.method26929(class8321, n8, n7, round, round);
            if (class8321.field34176 > 1) {
                final int n9 = round - ClientFonts.JelloLight20.getWidth("" + class8321.field34176);
                final int method23540 = ClientFonts.JelloLight20.getWidth("" + class8321.field34176);
                GL11.glAlphaFunc(519, 0.0f);
                RenderSystem.method30002();
                Class8154.method26900((float)(n8 + n9 - 17 - method23540 / 4), (float)(n7 + 7), (float)(40 + method23540), 40.0f, ClientAssets.shadow, Class6430.method19118(Class265.field1278.field1292, 0.7f), false);
                Class8154.method26889(ClientFonts.JelloLight20, (float)(n8 + n9), (float)(n7 + 13), "" + class8321.field34176, Class265.field1278.field1292);
                RenderSystem.method30001();
            }
            RenderSystem.method30001();
        }
        for (int j = 0; j < list.size(); ++j) {
            final ItemStack class8322 = list.get(j);
            final int n10 = n2 + method23539 + n3 + j / 9 * (round + n4);
            final int n11 = n + n3 + j % 9 * (round + n4);
            if (j == this.field15530) {
                if (b) {
                    RenderSystem.method30002();
                    int a = ShulkerInfo.mc.fontRenderer.getStringWidth(class8322.method27664().getUnformattedComponentText());
                    final List<String> method23541 = this.method9930(class8322);
                    for (int k = 0; k < method23541.size(); ++k) {
                        a = Math.max(a, ShulkerInfo.mc.fontRenderer.getStringWidth((String)method23541.get(k)));
                    }
                    final int n12 = (int)(a * Class8154.method26867());
                    Class8154.method26874((float)n11, (float)(n10 + round), n12 + 9.0f * Class8154.method26867(), 10.0f * Class8154.method26867() * method23541.size() + 7.0f * Class8154.method26867(), Class6430.method19118(Class265.field1273.field1292, 0.8f));
                    GL11.glPushMatrix();
                    GL11.glScalef(Class8154.method26867(), Class8154.method26867(), 0.0f);
                    final int n13 = (int)(n10 * (1.0f / Class8154.method26867()));
                    final int n14 = (int)(n11 * (1.0f / Class8154.method26867()));
                    round *= (int)(1.0f / Class8154.method26867());
                    final int n15 = (int)(n12 * (1.0f / Class8154.method26867()));
                    for (int l = 0; l < method23541.size(); ++l) {
                        ShulkerInfo.mc.fontRenderer.method6610((String)method23541.get(l), (float)(n14 + 5), 5.3f + n13 + round + l * 10, Class265.field1278.field1292);
                    }
                    GL11.glPopMatrix();
                    RenderSystem.method30001();
                }
            }
        }
    }
    
    public List<String> method9930(final ItemStack class8321) {
        final List<ITextComponent> method27668 = class8321.method27668(ShulkerInfo.mc.player, ShulkerInfo.mc.gameSettings.advancedItemTooltips ? TooltipFlags.ADVANCED : TooltipFlags.NORMAL);
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<ITextComponent> iterator = method27668.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().getFormattedText());
        }
        return arrayList;
    }
    
    private List<ItemStack> method9931(final ItemStack class8321) {
        final ArrayList list = new ArrayList();
        final CompoundNBT method27657 = class8321.method27657();
        if (method27657 != null) {
            if (method27657.contains("BlockEntityTag", 10)) {
                final CompoundNBT method27658 = method27657.getCompound("BlockEntityTag");
                Class6697.method20354(method27658);
                if (method27658.contains("Items", 9)) {
                    final NonNullList<ItemStack> method27659 = NonNullList.withSize(27, ItemStack.EMPTY);
                    Class8508.method28426(method27658, method27659);
                    for (final ItemStack class8322 : method27659) {
                        if (class8322.method27620()) {
                            continue;
                        }
                        int n = 1;
                        for (final ItemStack class8323 : list) {
                            if (!class8322.method27647(class8323)) {
                                continue;
                            }
                            if (!ItemStack.method27642(class8323, class8322)) {
                                continue;
                            }
                            class8323.method27691(class8322.method27690() + class8323.method27690());
                            n = 0;
                        }
                        if (n == 0) {
                            continue;
                        }
                        list.add(class8322);
                    }
                }
            }
        }
        return list;
    }
}
