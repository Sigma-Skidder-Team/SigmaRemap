package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import lol.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.Iterator;
import java.util.UUID;

public class TargetHUD extends Module {
    public int field23682;
    public int field23683;
    public int field23684;
    public int field23685 = 100;
    public int field23694 = MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.05F);
    private final float field23686 = 1.0F;
    private float field23687 = 0.0F;
    private float field23688 = 0.0F;
    private final Animation field23689;
    private final Animation field23690;
    private final Animation field23691;
    private final Animation field23692;
    private Entity entity;

    public TargetHUD() {
        super(ModuleCategory.RENDER, "TargetHUD", "Shows target info with killaura");
        this.registerSetting(new ModeSetting("Background", "Background", 0, "Blur", "Color", "None"));
        this.registerSetting(new ModeSetting("Position", "HUD Position", 0, "Center", "Bottom"));
        this.registerSetting(new ModeSetting("HealthBar", "Healthbar color", 0, "Health", "White"));
        this.registerSetting(new BooleanSetting("Armor", "Draw target's armor", false));
        this.registerSetting(new BooleanSetting("Head", "Draw target's head", false));
        this.method16005(false);
        this.field23689 = new Animation(800, 200, Direction.BACKWARDS);
        this.field23691 = new Animation(1500, 200, Direction.BACKWARDS);
        this.field23692 = new Animation(950, 200, Direction.BACKWARDS);
        this.field23690 = new Animation(230, 200, Direction.FORWARDS);
    }

    @Override
    public void onEnable() {
        this.entity = null;
    }

    @EventTarget
    @HigestPriority
    private void method16473(Render2DEvent var1) {
        if (KillAura.target != null && !this.entity.equals(KillAura.target)) {
            MultiUtilities.addChatMessage("Set target as " + KillAura.target.getName().getUnformattedComponentText());
            this.entity = KillAura.target;
        }
        if (this.entity != null) {
            this.field23684 = (this.getBooleanValueFromSettingName("Head") ? 100 : 0)
                    + Math.max(95, ResourceRegistry.JelloLightFont20.getStringWidth(this.entity.getName().getString()))
                    + (this.getBooleanValueFromSettingName("Armor") ? 80 : 0)
                    + 20;
            String var4 = this.getStringSettingValueByName("Position");
            switch (var4) {
                case "Center":
                    this.field23682 = Minecraft.getInstance().mainWindow.getWidth() / 2 - this.field23684 / 2;
                    this.field23683 = Minecraft.getInstance().mainWindow.getHeight() / 2 + 40;
                    break;
                case "Bottom":
                    this.field23682 = Minecraft.getInstance().mainWindow.getWidth() / 2 - this.field23684 / 2;
                    this.field23683 = Minecraft.getInstance().mainWindow.getHeight() - 200;
            }

            this.field23682 -= 100;

            renderTHUd(40);
            float var6 = ((LivingEntity) this.entity).getHealth();
            if (var6 != this.field23688) {
                this.field23687 = this.field23688;
                this.field23688 = var6;
                this.field23690.method25318(0.0F);
            }
        }
    }

    @EventTarget
    @HigestPriority
    public void method16474(EventRender var1) {
        if (this.entity != null) {
            this.field23684 = (this.getBooleanValueFromSettingName("Head") ? 100 : 0)
                    + Math.max(95, ResourceRegistry.JelloLightFont20.getStringWidth(this.entity.getName().getString()))
                    + (this.getBooleanValueFromSettingName("Armor") ? 80 : 0)
                    + 20;
            String var4 = this.getStringSettingValueByName("Position");
            switch (var4) {
                case "Center":
                    this.field23682 = Minecraft.getInstance().mainWindow.getWidth() / 2 - this.field23684 / 2;
                    this.field23683 = Minecraft.getInstance().mainWindow.getHeight() / 2 + 40;
                    break;
                case "Bottom":
                    this.field23682 = Minecraft.getInstance().mainWindow.getWidth() / 2 - this.field23684 / 2;
                    this.field23683 = Minecraft.getInstance().mainWindow.getHeight() - 200;
            }

            this.field23682 -= 100;
            renderTHUd(40);
            float var6 = ((LivingEntity) this.entity).getHealth();
            if (var6 != this.field23688) {
                this.field23687 = this.field23688;
                this.field23688 = var6;
                this.field23690.method25318(0.0F);
            }
        }
    }

    private void renderTHUd(int var1) {
        if (mc.currentScreen == null || mc.currentScreen instanceof ChatScreen) {
            GL11.glPushMatrix();
            RenderUtil.method11421(var1 - 20, this.field23683 - 20, var1 + 200, this.field23683 + 120, true);
            EntityRendererManager var4 = Minecraft.getInstance().getRenderManager();
            Class5743 var5 = new Class5743(var4);
            float var6 = 150;
            UUID uuidForSkin = this.entity.getUniqueID();
            if (!(this.entity instanceof CowEntity)) {
                if (!(this.entity instanceof ZombieEntity)) {
                    if (!(this.entity instanceof EndermanEntity)) {
                        if (!(this.entity instanceof SkeletonEntity)) {
                            if (!(this.entity instanceof SkeletonEntity)) {
                                if (!(this.entity instanceof CreeperEntity)) {
                                    if (!(this.entity instanceof PigEntity)) {
                                        if (!(this.entity instanceof SheepEntity)) {
                                            if (!(this.entity instanceof ChickenEntity)) {
                                                if (!(this.entity instanceof HorseEntity)) {
                                                    if (!(this.entity instanceof CatEntity)) {
                                                        if (!(this.entity instanceof WolfEntity)) {
                                                            if (!(this.entity instanceof SquidEntity)) {
                                                                if (this.entity instanceof SalmonEntity) {
                                                                    uuidForSkin = UUID.fromString("0fd952e4-e895-4bb0-a12b-48f24cac1231");
                                                                    //salmon skin
                                                                }
                                                            } else {
                                                                uuidForSkin = UUID.fromString("655b9804-f385-4e11-8966-d1555bedffc6");
                                                                //squid skin
                                                            }
                                                        } else {
                                                            uuidForSkin = UUID.fromString("14430053-bbf4-4141-9d3d-08ff8ec631a4");
                                                            //doge skin
                                                        }
                                                    } else {
                                                        uuidForSkin = UUID.fromString("241d6e54-d289-4db3-999f-1d51593aca81");
                                                        //mouse skin - probably for silverfish
                                                    }
                                                } else {
                                                    uuidForSkin = UUID.fromString("1b90edcf-393d-4e93-a0d6-cf737dc80999");
                                                    //bat skin???
                                                }
                                            } else {
                                                uuidForSkin = UUID.fromString("6a5b3d5e-07cd-449a-bf1d-c29383d1ae47");
                                            }
                                        } else {
                                            uuidForSkin = UUID.fromString("edd84e70-3a47-4215-b539-c95bf176d2cd");
                                        }
                                    } else {
                                        uuidForSkin = UUID.fromString("5443bbef-0b09-48ea-8b32-744ab646d883");
                                    }
                                } else {
                                    uuidForSkin = UUID.fromString("696581df-4256-4028-b55e-9452b4de40b6");
                                }
                            } else {
                                uuidForSkin = UUID.fromString("6d959fcc-e0ca-44ff-8d49-f4a2ae9f8de8");
                            }
                        } else {
                            uuidForSkin = UUID.fromString("6d959fcc-e0ca-44ff-8d49-f4a2ae9f8de8");
                        }
                    } else {
                        uuidForSkin = UUID.fromString("b36f9117-5454-43d7-ab15-86f303bf49f9");
                    }
                } else {
                    uuidForSkin = UUID.fromString("02b0e86d-c86a-4ae7-bc41-015d21f80c1c");
                }
            } else {
                uuidForSkin = UUID.fromString("b1adf2ec-eed6-46d6-a770-40f409651913");
            }

            GameProfile profile = new GameProfile(uuidForSkin, this.entity.getName().getString());
            Class1117 var9 = new Class1117(this, mc.world, profile);
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float) var1 + 50.0F, (float) this.field23683 + 295.0F, 1000.0F);
            RenderSystem.scalef(1.0F, 1.0F, -1.0F);
            MatrixStack var10 = new MatrixStack();
            var10.translate(0.0, 0.0, 1500.0);
            var10.scale(var6, var6, var6);
            Quaternion var11 = Vector3f.ZP.rotationDegrees(180.0F);
            var10.rotate(var11);
            var4.setRenderShadow(false);
            Class7735 var12 = Minecraft.getInstance().getRenderTypeBuffers().getBufferSource();
            RenderSystem.runAsFancy(
                    () -> var5.method17924(
                            var9, 100.0F, 0.0F, var10, var12, 15728880, Math.min(1.0F, this.field23689.calcPercent() * 4.0F), this.field23691.calcPercent()
                    )
            );

            var12.finish();
            var4.setRenderShadow(true);
            RenderSystem.popMatrix();
            RenderUtil.endScissor();
            GL11.glPopMatrix();
        }
    }

    private Color method16476(int var1, int var2, Color var3) {
        Color var6 = RenderUtil.getColorFromScreen(var1, var2, var3);
        if (var3 != null) {
            var6 = MultiUtilities.method17681(var6, var3, 0.08F * this.field23686);
        }

        return var6;
    }

    private Color method16477(Entity var1) {
        if (var1 instanceof LivingEntity) {
            LivingEntity var4 = (LivingEntity) var1;
            float var5 = var4.getHealth() / var4.method3075() * 20.0F;
            if (var5 > 20.0F) {
                var5 = 20.0F;
            }

            float[] var6 = new float[]{0.0F, 0.5F, 1.0F};
            Color[] var7 = new Color[]{Color.RED, Color.ORANGE, Color.GREEN};
            float var8 = var5 * 5.0F * 0.01F;
            return this.method16478(var6, var7, var8).brighter();
        } else {
            return new Color(0, 255, 0);
        }
    }

    private Color method16478(float[] var1, Color[] var2, float var3) {
        Object var6 = null;
        if (var1 == null) {
            throw new IllegalArgumentException("Fractions can't be null");
        } else if (var2 == null) {
            throw new IllegalArgumentException("Colours can't be null");
        } else if (var1.length != var2.length) {
            throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
        } else {
            int[] var7 = this.method16479(var1, var3);
            if (var7[0] >= 0 && var7[0] < var1.length && var7[1] >= 0 && var7[1] < var1.length) {
                float[] var8 = new float[]{var1[var7[0]], var1[var7[1]]};
                Color[] var9 = new Color[]{var2[var7[0]], var2[var7[1]]};
                float var10 = var8[1] - var8[0];
                float var11 = var3 - var8[0];
                float var12 = var11 / var10;
                return MultiUtilities.method17681(var9[0], var9[1], 1.0F - var12);
            } else {
                return var2[0];
            }
        }
    }

    private int[] method16479(float[] var1, float var2) {
        int[] var5 = new int[2];
        int var6 = 0;

        while (var6 < var1.length && var1[var6] <= var2) {
            var6++;
        }

        if (var6 >= var1.length) {
            var6 = var1.length - 1;
        }

        var5[0] = var6 - 1;
        var5[1] = var6;
        return var5;
    }

    private void method16480(int var1) {
        Iterator var4 = this.entity.getArmorInventoryList().iterator();
        int var5 = 0;

        while (var4.hasNext()) {
            ItemStack var6 = (ItemStack) var4.next();
            RenderUtil.method11480(var6, var1, this.field23683 + this.field23685 / 2 - var5 * 35, 1.0F);
            if (++var5 == 2) {
                var1 -= 35;
                var5 -= 2;
            }
        }
    }

    public static class Class1117 extends AbstractClientPlayerEntity {
        public final TargetHUD targetHUD;

       public Class1117(TargetHUD var1, ClientWorld var2, GameProfile var3) {
          super(var2, var3);
          this.targetHUD = var1;
       }
    }
}
