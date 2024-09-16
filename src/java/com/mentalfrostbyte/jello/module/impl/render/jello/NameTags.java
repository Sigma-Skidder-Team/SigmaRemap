package com.mentalfrostbyte.jello.module.impl.render.jello;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.player.Blink;
import com.mentalfrostbyte.jello.module.impl.render.Freecam;
import com.mentalfrostbyte.jello.module.impl.render.NameProtect;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class8433;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.server.SWindowPropertyPacket;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.network.play.server.SOpenWindowPacket;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

public class NameTags extends Module {
    public static NameTags field24004;
    private static final Class282 field24002 = new Class282();
    private static final HashMap<String, Texture> field24003 = new HashMap<String, Texture>();

    static {
        field24003.put("Tomygaims", ResourcesDecrypter.tomyPNG);
        field24003.put("Andro24", ResourcesDecrypter.androPNG);
        field24003.put("Gretorm", ResourcesDecrypter.lpPNG);
        field24003.put("Flyinqq", ResourcesDecrypter.codyPNG);
        field24003.put("cxbot", ResourcesDecrypter.cxPNG);
    }

    public int field24008 = ColorUtils.applyAlpha(ColorUtils.method17690(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor, 75.0F), 0.5F);
    private final HashMap<BlockPos, Class7070> field24000 = new HashMap<BlockPos, Class7070>();
    private BlockPos field24001;
    private final List<Entity> field24005 = new ArrayList<Entity>();
    private boolean field24006 = false;
    private final HashMap<UUID, String> field24007 = new HashMap<UUID, String>();

    public NameTags() {
        super(ModuleCategory.RENDER, "NameTags", "Render better name tags");
        this.registerSetting(new BooleanSetting("Magnify", "Scales nametags to keep them readable", true));
        this.registerSetting(new BooleanSetting("Furnaces", "Shows furnaces info once open", true));
        this.registerSetting(new BooleanSetting("Mob Owners", "Shows mob owners", true));
        this.method16005(false);
        field24004 = this;
    }

    // $VF: synthetic method
    public static Minecraft method16936() {
        return mc;
    }

    // $VF: synthetic method
    public static Class282 method16937() {
        return field24002;
    }

    // $VF: synthetic method
    public static Minecraft method16938() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16939() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16940() {
        return mc;
    }

    @EventTarget
    private void method16926(TickEvent var1) {
        if (this.isEnabled()) {
            this.field24006 = this.getBooleanValueFromSetttingName("Furnaces");
            if (!this.field24006) {
                this.field24000.clear();
            } else {
                Iterator var4 = this.field24000.entrySet().iterator();

                while (var4.hasNext()) {
                    Entry var5 = (Entry) var4.next();
                    if (!(mc.world.getBlockState((BlockPos) var5.getKey()).getBlock() instanceof Class3353)) {
                        var4.remove();
                    }

                    ((Class7070) var5.getValue()).method21984();
                }
            }

            this.field24005.clear();

            for (Entity var7 : BlockUtil.method34549(ColorUtils.method17680())) {
                if (var7 != mc.player
                        && var7 != Freecam.field23814
                        && var7 != Blink.field23863
                        && !var7.isInvisible()
                        && !Client.getInstance().getCombatManager().isValidTarget(var7)) {
                    this.field24005.add(var7);
                }
            }
        }
    }

    @EventTarget
    private void method16927(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof CPlayerTryUseItemOnBlockPacket) {
                CPlayerTryUseItemOnBlockPacket var4 = (CPlayerTryUseItemOnBlockPacket) var1.getPacket();
                if (mc.world.getBlockState(var4.func_218794_c().getPos()).getBlock() instanceof Class3353) {
                    this.field24001 = var4.func_218794_c().getPos();
                }
            }

            if (var1.getPacket() instanceof CClickWindowPacket) {
                CClickWindowPacket var7 = (CClickWindowPacket) var1.getPacket();
                Class7070 var5 = this.method16929(var7.getWindowId());
                if (var5 == null) {
                    return;
                }

                if (mc.currentScreen instanceof Class856) {
                    Class856 var6 = (Class856) mc.currentScreen;
                    var5.field30453 = var6.method2628().getSlot(0).getStack();
                    var5.field30454 = new ItemStack(var6.method2628().getSlot(1).getStack().getItem());
                    var5.field30454.field39976 = var6.method2628().getSlot(1).getStack().field39976;
                    var5.field30455 = var6.method2628().getSlot(2).getStack();
                }
            }
        }
    }

    @EventTarget
    private void method16928(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SOpenWindowPacket) {
                SOpenWindowPacket var4 = (SOpenWindowPacket) var1.getPacket();
                if (var4.method17285() != ContainerType.field35661) {
                    return;
                }

                this.field24000.put(this.field24001, new Class7070(var4.method17284()));
            }

            if (var1.getPacket() instanceof SSetSlotPacket) {
                SSetSlotPacket var6 = (SSetSlotPacket) var1.getPacket();
                Class7070 var5 = this.method16929(var6.method17303());
                if (var5 == null) {
                    return;
                }

                if (var6.method17304() == 0) {
                    var5.field30453 = new ItemStack(var6.method17305().getItem());
                    var5.field30453.field39976 = var6.method17305().field39976;
                } else if (var6.method17304() == 1) {
                    var5.field30454 = new ItemStack(var6.method17305().getItem());
                    var5.field30454.field39976 = var6.method17305().field39976;
                } else if (var6.method17304() == 2) {
                    var5.field30455 = new ItemStack(var6.method17305().getItem());
                    var5.field30455.field39976 = var6.method17305().field39976;
                }
            }

            if (var1.getPacket() instanceof SWindowPropertyPacket) {
                SWindowPropertyPacket var7 = (SWindowPropertyPacket) var1.getPacket();
                Class7070 var8 = this.method16929(var7.method17239());
                if (var8 == null) {
                    return;
                }

                switch (var7.method17240()) {
                    case 0:
                        var8.field30452 = var7.method17241();
                        break;
                    case 1:
                        var8.field30451 = var7.method17241();
                        break;
                    case 2:
                        var8.field30450 = (float) var7.method17241();
                        break;
                    case 3:
                        var8.field30449 = (float) var7.method17241();
                }
            }
        }
    }

    private Class7070 method16929(int var1) {
        for (Entry var5 : this.field24000.entrySet()) {
            if (((Class7070) var5.getValue()).field30448 == var1) {
                return (Class7070) var5.getValue();
            }
        }

        return null;
    }

    @EventTarget
    public void method16930(Render3DEvent var1) {
        if (this.isEnabled()) {
            RenderSystem.method27905(33986, 240.0F, 240.0F);
            boolean var4 = this.getBooleanValueFromSetttingName("Magnify");

            for (Entity var6 : this.field24005) {
                float var7 = 1.0F;
                if (var4) {
                    var7 = (float) Math.max(1.0, Math.sqrt(Class9647.method37620(var6) / 30.0));
                }

                this.method16933(
                        Class9647.method37622(var6).field43722,
                        Class9647.method37622(var6).field43723 + (double) var6.getHeight(),
                        Class9647.method37622(var6).field43724,
                        var6,
                        var7,
                        null
                );
                var6.getDataManager().method35446(Entity.CUSTOM_NAME_VISIBLE, false);
            }

            for (Entry var11 : this.field24000.entrySet()) {
                float var13 = 1.0F;
                if (var4) {
                    var13 = (float) Math.max(0.8F, Math.sqrt(Class9647.method37621((BlockPos) var11.getKey()) / 30.0));
                }

                this.method16932((BlockPos) var11.getKey(), (Class7070) var11.getValue(), var13);
            }

            if (this.getBooleanValueFromSetttingName("Mob Owners")) {
                for (Entity var12 : mc.world.getEntities()) {
                    if (var12 == mc.player && (var12 instanceof TameableEntity || var12 instanceof Class1074)) {
                        UUID var14 = !(var12 instanceof TameableEntity) ? ((Class1074) var12).method4933() : ((TameableEntity) var12).method4397();
                        if (var14 != null) {
                            if (!this.field24007.containsKey(var14)) {
                                this.field24007.put(var14, null);
                                new Thread(() -> {
                                    try {
                                        List var4x = ColorUtils.method17700(var14.toString());
                                        if (var4x == null || var4x.isEmpty()) {
                                            return;
                                        }

                                        this.field24007.put(var14, (String) var4x.get(var4x.size() - 1));
                                    } catch (Exception var5) {
                                        var5.printStackTrace();
                                    }
                                }).start();
                            }

                            if (this.field24007.get(var14) != null) {
                                float var8 = 1.0F;
                                if (this.getBooleanValueFromSetttingName("Magnify")) {
                                    var8 = (float) Math.max(1.0, Math.sqrt(Class9647.method37620(var12) / 30.0));
                                }

                                this.method16933(
                                        Class9647.method37622(var12).field43722,
                                        Class9647.method37622(var12).field43723 + (double) var12.getHeight(),
                                        Class9647.method37622(var12).field43724,
                                        var12,
                                        var8,
                                        this.field24007.get(var14)
                                );
                                var12.getDataManager().method35446(Entity.CUSTOM_NAME_VISIBLE, false);
                            }
                        }
                    }
                }
            }

            GL11.glDisable(2896);
            RenderSystem.method27905(33986, 240.0F, 240.0F);
            TextureImpl.method36180();
            TextureManager var10000 = mc.getTextureManager();
            mc.getTextureManager();
            var10000.bindTexture(TextureManager.field1094);
        }
    }

    private void method16931(float var1, float var2, float var3, float var4) {
        GL11.glColor4f(var1 / 255.0F, var2 / 255.0F, var3 / 255.0F, var4);
        GL11.glTranslatef(0.0F, 0.0F, 0.3F);
        GL11.glNormal3f(0.0F, 0.0F, 1.0F);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0F, 0.0F);
        GL11.glVertex2f(0.0F, 0.5F);
        GL11.glVertex2f(0.5F, 0.5F);
        GL11.glVertex2f(0.5F, 0.0F);
        GL11.glEnd();
    }

    public void method16932(BlockPos var1, Class7070 var2, float var3) {
        ClientResource var6 = ResourceRegistry.JelloLightFont25;
        String var7 = "None";
        if (var2.field30453 != null) {
            var7 = var2.field30453.field39976 + " " + var2.field30453.method32149();
        }

        float var8 = (float) ((double) var1.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX() + 0.5);
        float var9 = (float) ((double) var1.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY() + 1.0);
        float var10 = (float) ((double) var1.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ() + 0.5);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        float var11 = Math.min(var2.field30450 / var2.field30449, 1.0F);
        float var12 = Math.min((float) var2.field30452 / (float) var2.field30451, 1.0F);
        int var13 = 14;
        GL11.glPushMatrix();
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glTranslated(var8, var9 + 0.6F - 0.33333334F * (1.0F - var3), var10);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getYaw(), 0.0F, -1.0F, 0.0F);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getPitch(), 1.0F, 0.0F, 0.0F);
        GL11.glPushMatrix();
        float var14 = 0.008F;
        GL11.glScalef(-var14 * var3, -var14 * var3, -var14 * var3);
        int var15 = 0;
        ItemStack var16 = var2.method21987();
        if (var16 != null) {
            var15 = Math.max(ResourceRegistry.JelloLightFont20.method23942(var16.method32149().getString()), 50);
        } else {
            var15 = 37;
        }

        int var17 = 51 + var15 + var13 * 2;
        int var18 = 85 + var13 * 2;
        GL11.glTranslated(-var17 / 2, -var18 / 2, 0.0);
        byte var19 = 40;
        RenderUtil.drawRect(0.0F, 0.0F, (float) var17, (float) var18, this.field24008);
        RenderUtil.method11463(0.0F, 0.0F, (float) var17, (float) var18, 20.0F, 0.5F);
        RenderUtil.drawString(var6, var13, (float) (var13 - 5), "Furnace", ClientColors.LIGHT_GREYISH_BLUE.getColor);
        if (var16 == null) {
            RenderUtil.drawString(
                    ResourceRegistry.JelloLightFont20, (float) (var13 + 15), (float) (var13 + 40), "Empty", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F)
            );
        }

        ItemStack var20 = var2.method21987();
        if (var20 != null) {
            RenderUtil.method11479(var20, var13, var13 + 27, 45, 45);
            RenderUtil.drawString(ResourceRegistry.JelloLightFont20, (float) (var13 + 51), 40.0F, var20.method32149().getString(), ClientColors.LIGHT_GREYISH_BLUE.getColor);
            RenderUtil.drawString(ResourceRegistry.JelloLightFont14, (float) (var13 + 51), 62.0F, "Count: " + var20.field39976, ClientColors.LIGHT_GREYISH_BLUE.getColor);
        }

        RenderUtil.drawRect(0.0F, (float) var18 - 12.0F, Math.min((float) var17 * var12, (float) var17), (float) var18 - 6.0F, ColorUtils.applyAlpha(-106750, 0.3F));
        RenderUtil.drawRect(
                0.0F, (float) var18 - 6.0F, Math.min((float) var17 * var11, (float) var17), (float) var18, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.75F)
        );
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    public void method16933(double var1, double var3, double var5, Entity var7, float var8, String var9) {
        ClientResource var12 = ResourceRegistry.JelloLightFont25;
        String var13 = var9 == null ? var7.getName().getString().replaceAll("§.", "") : var9;
        if (Client.getInstance().getModuleManager().getModuleByClass(NameProtect.class).isEnabled() && var13.equals(mc.getSession().getUsername())) {
            var13 = Client.getInstance().getModuleManager().getModuleByClass(NameProtect.class).getStringSettingValueByName("Username");
        }

        if (var13.length() != 0) {
            float var14 = (float) (var1 - mc.gameRenderer.getActiveRenderInfo().getPos().getX());
            float var15 = (float) (var3 - mc.gameRenderer.getActiveRenderInfo().getPos().getY());
            float var16 = (float) (var5 - mc.gameRenderer.getActiveRenderInfo().getPos().getZ());
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            String var17 = (float) Math.round(((LivingEntity) var7).getHealth() * 10.0F) / 10.0F + "";
            float var18 = Math.min(((LivingEntity) var7).getHealth() / ((LivingEntity) var7).method3075(), 1.0F);
            GL11.glPushMatrix();
            GL11.glAlphaFunc(519, 0.0F);
            GL11.glTranslated(var14, var15 + 0.6F - 0.33333334F * (1.0F - var8), var16);
            GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getYaw(), 0.0F, -1.0F, 0.0F);
            GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getPitch(), 1.0F, 0.0F, 0.0F);
            GL11.glScalef(-0.009F * var8, -0.009F * var8, -0.009F * var8);
            int var19 = this.field24008;
            if (!Client.getInstance().getFriendManager().method26997(var7)) {
                if (Client.getInstance().getFriendManager().method26999(var7)) {
                    var19 = ColorUtils.applyAlpha(-6750208, 0.5F);
                }
            } else {
                var19 = ColorUtils.applyAlpha(-16171506, 0.5F);
            }

            int var20 = ColorUtils.applyAlpha(
                    !(var7 instanceof PlayerEntity) ? ClientColors.LIGHT_GREYISH_BLUE.getColor : new Color(Class8781.method31663((PlayerEntity) var7)).getRGB(), 0.5F
            );
            int var21 = var12.method23942(var13) / 2;
            if (!field24003.containsKey(var13)) {
                RenderUtil.method11463((float) (-var21 - 10), -25.0F, (float) (var21 * 2 + 20), (float) (var12.method23952() + 27), 20.0F, 0.5F);
            } else {
                int var22 = Color.getHSBColor((float) (System.currentTimeMillis() % 10000L) / 10000.0F, 0.5F, 1.0F).getRGB();
                RenderUtil.method11449(
                        (float) (-var21 - 10 - 31),
                        -25.0F,
                        (float) (var12.method23952() + 27),
                        (float) (var12.method23952() + 27),
                        field24003.get(var13),
                        ColorUtils.applyAlpha(var22, 0.7F)
                );
                RenderUtil.method11449(
                        (float) (-var21 - 10 - 31 + var12.method23952() + 27),
                        -25.0F,
                        14.0F,
                        (float) (var12.method23952() + 27),
                        ResourcesDecrypter.shadowRightPNG,
                        ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F)
                );
                RenderUtil.method11463((float) (-var21 - 10 - 31), -25.0F, (float) (var21 * 2 + 20 + 31 + 27), (float) (var12.method23952() + 27), 20.0F, 0.5F);
                GL11.glTranslatef(27.0F, 0.0F, 0.0F);
            }

            RenderUtil.drawRect((float) (-var21 - 10), -25.0F, (float) (var21 + 10), (float) (var12.method23952() + 2), var19);
            RenderUtil.drawRect(
                    (float) (-var21 - 10),
                    (float) (var12.method23952() - 1) - (float) ((LivingEntity) var7).hurtTime / 3.0F,
                    Math.min((float) (var21 * 2 + 20) * (var18 - 0.5F), (float) (var21 + 10)),
                    (float) (var12.method23952() + 2),
                    var20
            );
            GL11.glPushMatrix();
            GL11.glTranslated(-var12.method23942(var13) / 2, 0.0, 0.0);
            int var26 = ResourceRegistry.JelloLightFont14.method23942("Health: 20.0");
            String var23 = "Health: ";
            int var24 = var12.method23942(var13);
            if (var26 > var24) {
                var23 = "H: ";
            }

            RenderUtil.drawString(var12, 0.0F, -20.0F, var13, ClientColors.LIGHT_GREYISH_BLUE.getColor);
            RenderUtil.drawString(ResourceRegistry.JelloLightFont14, 0.0F, 10.0F, var23 + var17, ClientColors.LIGHT_GREYISH_BLUE.getColor);
            Class8433 var25 = Client.getInstance().getNetworkManager().field38429.method29512(var7);
            if (var25 != null) {
                RenderUtil.drawString(ResourceRegistry.JelloLightFont14, 0.0F, -30.0F, var25.field36141, ClientColors.LIGHT_GREYISH_BLUE.getColor);
            }

            GL11.glPopMatrix();
            GL11.glPopMatrix();
            GL11.glEnable(2929);
            GL11.glEnable(2896);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glDisable(3042);
        }
    }

    @EventTarget
    public void method16934(EventRenderNameTag var1) {
        if (this.isEnabled() && var1.method13987() instanceof PlayerEntity) {
            var1.setCancelled(true);
        }
    }
}
