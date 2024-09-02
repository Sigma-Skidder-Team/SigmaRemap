package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4400;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.viaversion.ViaVersionLoader;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import mapped.*;
import net.minecraft.network.play.server.SEntityEquipmentPacket;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;

import java.util.ArrayList;
import java.util.Arrays;

public class OldHitting extends Module {
    public static boolean field23408 = false;
    private boolean field23409;

    public OldHitting() {
        super(ModuleCategory.PLAYER, "OldHitting", "Reverts to 1.7/1.8 hitting");
        this.registerSetting(new ModeSetting("Animation", "Animation mode", 0, "Vanilla", "Tap", "Tap2", "Slide", "Slide2", "Scale", "Leaked", "Ninja", "Down"));
        this.method16005(true);
    }

    @EventTarget
    @HigherPriority
    @Class5631
    private void method16020(Class4399 var1) {
        if (this.isEnabled() || Class8005.method27372() == Class5989.field26129) {
            if (var1.method13921()) {
                boolean var4 = mc.player.getHeldItemMainhand() != null && mc.player.getHeldItemMainhand().getItem() instanceof ItemSword;
                boolean var5 = Client.getInstance().getModuleManager().getModuleByClass(KillAura.class).method15988();
                boolean var6 = true;
                if (!mc.player.method3331()
                        && mc.objectMouseOver.getType() == RayTraceResult.Type.BLOCK
                        && !Client.getInstance().getModuleManager().getModuleByClass(KillAura.class).method15988()) {
                    BlockRayTraceResult var7 = (BlockRayTraceResult) mc.objectMouseOver;
                    BlockPos var8 = var7.getPos();
                    Block var9 = mc.world.getBlockState(var8).getBlock();
                    ArrayList var10 = new ArrayList<Block>(
                            Arrays.asList(
                                    Blocks.CHEST,
                                    Blocks.ENDER_CHEST,
                                    Blocks.TRAPPED_CHEST,
                                    Blocks.CRAFTING_TABLE,
                                    Blocks.BEACON,
                                    Blocks.FURNACE,
                                    Blocks.field37057,
                                    Blocks.ENCHANTING_TABLE,
                                    Blocks.ANVIL,
                                    Blocks.field36714,
                                    Blocks.field36715,
                                    Blocks.DISPENSER,
                                    Blocks.NOTE_BLOCK,
                                    Blocks.LEVER,
                                    Blocks.field36723,
                                    Blocks.DROPPER,
                                    Blocks.field36592,
                                    Blocks.field36719
                            )
                    );
                    if (var10.contains(var9)
                            || var9 instanceof Class3204
                            || var9 instanceof Class3203
                            || var9 instanceof Class3199
                            || var9 instanceof Class3461 && var9 != Blocks.IRON_DOOR) {
                        var6 = false;
                    }
                }

                field23408 = mc.gameSettings.keyBindUseItem.isKeyDown() && var4 && var6 && var6 || var5;
                if (!field23408) {
                    if (ViaVersionLoader.field31493.contains(mc.player)) {
                        ViaVersionLoader.field31493.remove(mc.player);
                    }
                } else if (!ViaVersionLoader.field31493.contains(mc.player)) {
                    ViaVersionLoader.field31493.add(mc.player);
                }

                if (field23408 && !this.field23409) {
                    this.field23409 = !this.field23409;
                    if (!var5) {
                        ColorUtils.method17733();
                    }
                } else if (!field23408 && this.field23409) {
                    this.field23409 = !this.field23409;
                }
            }
        }
    }

    @EventTarget
    @LowerPriority
    @Class5631
    private void method16021(RecievePacketEvent var1) {
        if (this.isEnabled() || Class8005.method27372() == Class5989.field26129) {
            if (mc.player != null) {
                if (var1.getPacket() instanceof SEntityEquipmentPacket) {
                    SEntityEquipmentPacket var4 = (SEntityEquipmentPacket) var1.getPacket();

                    var4.method17562().removeIf(var6 -> var4.method17561() == mc.player.getEntityId()
                            && var6.getFirst() == Class2106.field13732
                            && var6.getSecond() != null
                            && var6.getSecond().getItem() == Items.field38119);
                }
            }
        }
    }

    @EventTarget
    @LowerPriority
    @Class5631
    private void method16022(Class4400 var1) {
        if (this.isEnabled() || Class8005.method27372() == Class5989.field26129) {
            float var4 = var1.method13924();
            if (var1.method13926() && var1.method13927() == HandSide.field14417 && var1.method13928().getItem() instanceof Class3334) {
                var1.method13931(false);
            } else if (var1.method13927() != HandSide.field14417 || !field23408) {
                if (field23408 && var1.method13926()) {
                    var1.method13900(true);
                    String var5 = this.getStringSettingValueByName("Animation");
                    switch (var5) {
                        case "Vanilla":
                            this.method16026(0.0F, var4, var1.method13929());
                            break;
                        case "Tap":
                            this.method16027(0.0F, var4, var1.method13929());
                            break;
                        case "Tap2":
                            this.method16028(0.0F, var4, var1.method13929());
                            break;
                        case "Slide":
                            this.method16029(0.0F, var4, var1.method13929());
                            break;
                        case "Slide2":
                            this.method16030(0.0F, var4, var1.method13929());
                            break;
                        case "Scale":
                            this.method16031(0.0F, var4, var1.method13929());
                            break;
                        case "Leaked":
                            this.method16032(0.0F, var4, var1.method13929());
                            break;
                        case "Ninja":
                            this.method16025(0.0F, var4, var1.method13929());
                            break;
                        case "Tomy":
                            this.method16024(0.0F, var4, var1.method13929());
                            break;
                        case "Down":
                            this.method16033(0.0F, var4, var1.method13929());
                    }
                }
            }
        }
    }

    private void method16023(float var1, float var2, float var3, float var4, MatrixStack var5) {
        var5.rotate(new Vector3f(var2, var3, var4).rotationDegrees(var1));
    }

    private void method16024(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * var2 * (float) Math.PI);
        float var7 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16025(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.39F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(100.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-50.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * (float) Math.PI);
        float var7 = MathHelper.sin(var2 * (float) Math.PI);
        this.method16023(var6 * -10.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -30.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * 109.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-90.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16026(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * var2 * (float) Math.PI);
        float var7 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16027(float var1, float var2, MatrixStack var3) {
        var3.translate(0.0, -3.5, 0.0);
        var3.translate(0.56F, -0.52F, -0.72F);
        var3.translate(0.56F, -0.22F, -0.71999997F);
        this.method16023(45.0F, 0.0F, 1.0F, 0.0F, var3);
        float var6 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(0.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var6 * -9.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-9.0F, 0.0F, 0.0F, 1.0F, var3);
        var3.translate(0.0, 3.2F, 0.0);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        var3.method35292(2.7F, 2.7F, 2.7F);
    }

    private void method16028(float var1, float var2, MatrixStack var3) {
        var3.translate(0.648F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-var6 * 10.0F, 1.0F, -2.0F, 3.0F, var3);
        float var7 = 1.2F;
        var3.method35292(var7, var7, var7);
    }

    private void method16029(float var1, float var2, MatrixStack var3) {
        var3.translate(0.648F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-var6 * 20.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F;
        var3.method35292(var7, var7, var7);
    }

    private void method16030(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * var2 * (float) Math.PI);
        float var7 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.method35292(var8, var8, var8);
    }

    private void method16031(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.2F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F - var6 * 0.3F;
        var3.method35292(var7, var7, var7);
    }

    private void method16032(float var1, float var2, MatrixStack var3) {
        var3.translate(0.56, -0.52, -0.72);
        float var6 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.method16023(var6 * 10.0F, -4.0F, -2.0F, 5.0F, var3);
        this.method16023(var6 * 30.0F, 1.0F, -0.0F, -1.0F, var3);
    }

    private void method16033(float var1, float var2, MatrixStack var3) {
        float var6 = MathHelper.sin(MathHelper.method37765(var2) * (float) Math.PI);
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var6 * -0.2F), 0.0);
        this.method16023(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.method16023(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        this.method16023(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F;
        var3.method35292(var7, var7, var7);
    }
}
