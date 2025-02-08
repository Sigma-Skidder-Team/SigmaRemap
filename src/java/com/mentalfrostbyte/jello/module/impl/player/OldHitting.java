package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventHandAnimation;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.block.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.SwordItem;
import net.minecraft.network.play.server.SEntityEquipmentPacket;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

import java.util.ArrayList;
import java.util.Arrays;

public class OldHitting extends Module {
    public static boolean field23408 = false;
    private boolean field23409;

    public OldHitting() {
        super(ModuleCategory.PLAYER, "OldHitting", "Reverts to 1.7/1.8 hitting");
        this.registerSetting(new ModeSetting("Animation", "Animation mode", 0, "Vanilla", "Tap", "Tap2", "Slide", "Slide2", "Scale", "Leaked", "Ninja", "Down", "Tomy"));
        this.setAvailableOnClassic(true);
    }

    @EventTarget
    @HigherPriority
    @Class5631
    private void method16020(EventUpdate var1) {
        /* || JelloPortal.getCurrentVersion() == ViaVerList._1_8_x*/
        if (this.isEnabled() || mc.gameSettings.keyBindUseItem.isKeyDown()) {
            if (var1.isPre()) {
                boolean var4 = mc.player.getHeldItemMainhand() != null && mc.player.getHeldItemMainhand().getItem() instanceof SwordItem;
                boolean auraEnabled = Client.getInstance().moduleManager.getModuleByClass(KillAura.class).isEnabled();
                boolean var6 = true;
                if (!mc.player.isSneaking()
                        && mc.objectMouseOver.getType() == RayTraceResult.Type.BLOCK
                        && !auraEnabled) {
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
                                    Blocks.BLAST_FURNACE,
                                    Blocks.ENCHANTING_TABLE,
                                    Blocks.ANVIL,
                                    Blocks.CHIPPED_ANVIL,
                                    Blocks.DAMAGED_ANVIL,
                                    Blocks.DISPENSER,
                                    Blocks.NOTE_BLOCK,
                                    Blocks.LEVER,
                                    Blocks.HOPPER,
                                    Blocks.DROPPER,
                                    Blocks.REPEATER,
                                    Blocks.COMPARATOR
                            )
                    );
                    if (var10.contains(var9)
                            || var9 instanceof WoodButtonBlock
                            || var9 instanceof StoneButtonBlock
                            || var9 instanceof FenceGateBlock
                            || var9 instanceof DoorBlock && var9 != Blocks.IRON_DOOR) {
                        var6 = false;
                    }
                }

                //MY DUMB "FIX" - MARK
                boolean isAutoBlockNone = Client.getInstance().moduleManager.getModuleByClass(KillAura.class).getStringSettingValueByName("Autoblock Mode").equals("None");
                field23408 = mc.gameSettings.keyBindUseItem.isKeyDown() && var4 && var6 && var6 || (auraEnabled && KillAura.target != null && !isAutoBlockNone);
                /*
                if (!field23408) {
                    if (ViaVersionLoader.entites.contains(mc.player)) {
                        ViaVersionLoader.entites.remove(mc.player);
                    }
                } else if (!ViaVersionLoader.entites.contains(mc.player)) {
                    ViaVersionLoader.entites.add(mc.player);
                }
                 */

                if (field23408 && !this.field23409) {
                    this.field23409 = !this.field23409;
                    if (!auraEnabled) {
                        MultiUtilities.block();
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
    private void onPacketReceive(ReceivePacketEvent event) {
        /* || JelloPortal.getCurrentVersion() == ViaVerList._1_8_x*/
        if (this.isEnabled() || mc.gameSettings.keyBindUseItem.isKeyDown()) {
            if (mc.player != null) {
                if (event.getPacket() instanceof SEntityEquipmentPacket) {
                    SEntityEquipmentPacket pack = (SEntityEquipmentPacket) event.getPacket();

                    pack.func_241790_c_().removeIf(pakcie -> pack.getEntityID() == mc.player.getEntityId()
                            && pakcie.getFirst() == EquipmentSlotType.OFFHAND
                            && pakcie.getSecond() != null
                            && pakcie.getSecond().getItem() == Items.field38119);
                }
            }
        }
    }

    @EventTarget
    @LowerPriority
    @Class5631
    private void method16022(EventHandAnimation event) {
        //JelloPortal.getCurrentVersion() == ViaVerList._1_8_x*
        if (this.isEnabled() || mc.gameSettings.keyBindUseItem.isKeyDown()) {
            float var4 = event.method13924();
            if (event.method13926() && event.getHand() == HandSide.LEFT && event.getItemStack().getItem() instanceof ShieldItem) {
                event.renderBlocking(false);
            } else if (event.getHand() != HandSide.LEFT || !field23408) {
                if (field23408 && event.method13926() && this.isEnabled() && event.getItemStack().getItem() instanceof SwordItem) {
                    event.setCancelled(true);
                    switch (this.getStringSettingValueByName("Animation")) {
                        case "Vanilla":
                            this.VanillaAnimation(0.0F, var4, event.getMatrix());
                            break;
                        case "Tap":
                            this.TapAnimation(0.0F, var4, event.getMatrix());
                            break;
                        case "Tap2":
                            this.Tap2Animation(0.0F, var4, event.getMatrix());
                            break;
                        case "Slide":
                            this.SlideAnimation(0.0F, var4, event.getMatrix());
                            break;
                        case "Slide2":
                            this.Slide2Animation(0.0F, var4, event.getMatrix());
                            break;
                        case "Scale":
                            this.ScaleAnimation(0.0F, var4, event.getMatrix());
                            break;
                        case "Leaked":
                            this.LeakedAnimation(0.0F, var4, event.getMatrix());
                            break;
                        case "Ninja":
                            this.NinjaAnimation(0.0F, var4, event.getMatrix());
                            break;
                        case "Tomy":
                            this.TomyAnimation(0.0F, var4, event.getMatrix());
                            break;
                        case "Down":
                            this.DownAnimation(0.0F, var4, event.getMatrix());
                    }
                }
            }
        }
    }

    private void rotate(float var1, float var2, float var3, float var4, MatrixStack var5) {
        var5.rotate(new Vector3f(var2, var3, var4).rotationDegrees(var1));
    }

    private void TomyAnimation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * var2 * (float) Math.PI);
        float var7 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.rotate(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.scale(var8, var8, var8);
    }

    private void NinjaAnimation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.39F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.rotate(100.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-50.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * (float) Math.PI);
        float var7 = MathHelper.sin(var2 * (float) Math.PI);
        this.rotate(var6 * -10.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(var7 * -30.0F, 0.0F, 0.0F, 1.0F, var3);
        this.rotate(var7 * 109.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(-90.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.scale(var8, var8, var8);
    }

    private void VanillaAnimation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * var2 * (float) Math.PI);
        float var7 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.rotate(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.scale(var8, var8, var8);
    }

    private void TapAnimation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.0, -3.5, 0.0);
        var3.translate(0.56F, -0.52F, -0.72F);
        var3.translate(0.56F, -0.22F, -0.71999997F);
        this.rotate(45.0F, 0.0F, 1.0F, 0.0F, var3);
        float var6 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(0.0F, 0.0F, 0.0F, 1.0F, var3);
        this.rotate(var6 * -9.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(-9.0F, 0.0F, 0.0F, 1.0F, var3);
        var3.translate(0.0, 3.2F, 0.0);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        var3.scale(2.7F, 2.7F, 2.7F);
    }

    private void Tap2Animation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.648F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(-var6 * 10.0F, 1.0F, -2.0F, 3.0F, var3);
        float var7 = 1.2F;
        var3.scale(var7, var7, var7);
    }

    private void SlideAnimation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.648F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(-var6 * 20.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F;
        var3.scale(var7, var7, var7);
    }

    private void Slide2Animation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.6F), 0.0);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(var2 * var2 * (float) Math.PI);
        float var7 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
        this.rotate(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var8 = 1.2F;
        var3.scale(var8, var8, var8);
    }

    private void ScaleAnimation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var1 * -0.2F), 0.0);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        float var6 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F - var6 * 0.3F;
        var3.scale(var7, var7, var7);
    }

    private void LeakedAnimation(float var1, float var2, MatrixStack var3) {
        var3.translate(0.56, -0.52, -0.72);
        float var6 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        this.rotate(var6 * 10.0F, -4.0F, -2.0F, 5.0F, var3);
        this.rotate(var6 * 30.0F, 1.0F, -0.0F, -1.0F, var3);
    }

    private void DownAnimation(float var1, float var2, MatrixStack var3) {
        float var6 = MathHelper.sin(MathHelper.sqrt(var2) * (float) Math.PI);
        var3.translate(0.48F, -0.55F, -0.71999997F);
        var3.translate(0.0, (double) (var6 * -0.2F), 0.0);
        this.rotate(77.0F, 0.0F, 1.0F, 0.0F, var3);
        this.rotate(-10.0F, 0.0F, 0.0F, 1.0F, var3);
        this.rotate(-80.0F, 1.0F, 0.0F, 0.0F, var3);
        float var7 = 1.2F;
        var3.scale(var7, var7, var7);
    }
}
