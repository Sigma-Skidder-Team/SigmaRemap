package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.network.play.server.SCloseWindowPacket;
import net.minecraft.network.play.server.SOpenWindowPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

public class Auto32k extends Module {
    public BlockPos field23870;
    public int field23871 = -1;
    public int field23872 = -1;
    public int field23873 = 0;
    public int field23874 = -1;
    public short field23875 = 0;
    public SOpenWindowPacket field23876;
    public boolean field23877 = false;

    public Auto32k() {
        super(ModuleCategory.WORLD, "Auto32k", "Automaticly places 32k shulker + hopper in hotbar");
    }

    @Override
    public void onEnable() {
        this.field23870 = null;

        for (BlockPos var4 : BlockUtil.method34545(BlockUtil.method34561(mc.playerController.getBlockReachDistance()))) {
            if (!(BlockUtil.method34550(mc.player, var4) < 2.0F)
                    && BlockUtil.method34535(mc.player, var4)
                    && (double) var4.getY() >= mc.player.getPosY() - 2.0
                    && (double) var4.getY() <= mc.player.getPosY() - 1.0
                    && this.method16717(var4)) {
                this.field23870 = var4;
                break;
            }
        }

        this.field23872 = InvManagerUtils.method25843(
                Items.field37669,
                Items.field37665,
                Items.field37666,
                Items.field37663,
                Items.field37661,
                Items.field37667,
                Items.field37657,
                Items.field37662,
                Items.field37659,
                Items.field37656,
                Items.field37655,
                Items.field37660,
                Items.field37664,
                Items.field37668,
                Items.field37653,
                Items.field37654,
                Items.field37658
        );
        this.field23871 = InvManagerUtils.method25843(Items.field37545);
        if (this.field23871 == -1) {
            this.field23871 = InvManagerUtils.findItemSlot(Items.field37545);
            if (this.field23871 != -1) {
                if (this.field23871 >= 36 && this.field23871 <= 44) {
                    this.field23871 %= 9;
                } else {
                    this.field23871 = InvManagerUtils.swapToolToHotbar(this.field23871);
                }
            }
        }

        if (this.field23872 == -1) {
            this.field23872 = InvManagerUtils.method25823(
                    Items.field37669,
                    Items.field37665,
                    Items.field37666,
                    Items.field37663,
                    Items.field37661,
                    Items.field37667,
                    Items.field37657,
                    Items.field37662,
                    Items.field37659,
                    Items.field37656,
                    Items.field37655,
                    Items.field37660,
                    Items.field37664,
                    Items.field37668,
                    Items.field37653,
                    Items.field37654,
                    Items.field37658
            );
            if (this.field23872 != -1) {
                if (this.field23872 >= 36 && this.field23872 <= 44) {
                    this.field23872 %= 9;
                } else {
                    this.field23872 = InvManagerUtils.swapToolToHotbar(this.field23872);
                }
            }
        }

        this.field23873 = 0;
    }

    public boolean method16717(BlockPos var1) {
        BlockState var4 = mc.world.getBlockState(var1);
        BlockState var5 = mc.world.getBlockState(var1.up());
        BlockState var6 = mc.world.getBlockState(var1.method8339(2));
        return var4.method23410() && var5.isAir() && var6.isAir();
    }

    @Override
    public void onDisable() {
    }

    @EventTarget
    private void method16718(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (this.field23870 != null) {
                GL11.glAlphaFunc(516, 0.0F);
                BlockPos var4 = this.field23870;
                double var5 = (double) var4.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                double var7 = (double) var4.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                double var9 = (double) var4.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                RenderUtil.render3DColoredBox(
                        new Box3D(var5, var7 + 1.625, var9, var5 + 1.0, var7 + 3.0, var9 + 1.0), ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.3F)
                );
                GL11.glColor3f(1.0F, 1.0F, 1.0F);
                GL11.glBlendFunc(770, 771);
                GL11.glEnable(3042);
                GL11.glEnable(2848);
                GL11.glDisable(3553);
                GL11.glEnable(2929);
                GL11.glDisable(2896);
                GL11.glDepthMask(false);
                float var11 = 8.0F;
                boolean var12 = true;
                if (var12) {
                    GL11.glPushMatrix();
                    int var13 = ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.5F);
                    float var14 = (float) (var13 >> 24 & 0xFF) / 255.0F;
                    float var15 = (float) (var13 >> 16 & 0xFF) / 255.0F;
                    float var16 = (float) (var13 >> 8 & 0xFF) / 255.0F;
                    float var17 = (float) (var13 & 0xFF) / 255.0F;
                    GL11.glColor4f(var15, var16, var17, var14);
                    GL11.glTranslated(var5 + 0.5, var7 + 1.01F, var9 + 0.5);
                    GL11.glRotatef(90.0F, 0.0F, 0.0F, 0.0F);
                    GL11.glLineWidth(3.4F);
                    this.method16719(var11);
                    GL11.glPopMatrix();
                }

                int var22 = ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F);
                float var23 = (float) (var22 >> 24 & 0xFF) / 255.0F;
                float var24 = (float) (var22 >> 16 & 0xFF) / 255.0F;
                float var25 = (float) (var22 >> 8 & 0xFF) / 255.0F;
                float var26 = (float) (var22 & 0xFF) / 255.0F;

                for (int var18 = 0; (float) var18 < var11 - 1.0F; var18++) {
                    float var19 = (float) var18 / var11;
                    double var20 = Math.cos((double) var19 * Math.PI / 2.0);
                    GL11.glPushMatrix();
                    GL11.glColor4f(var24, var25, var26, var23 * (1.0F - var19) * 0.25F);
                    GL11.glTranslated(var5 + 0.5, var7 + 2.01F + (double) var18, var9 + 0.5);
                    GL11.glRotatef(90.0F, 0.0F, 0.0F, 0.0F);
                    GL11.glLineWidth(3.4F);
                    this.method16719((float) ((double) var11 * var20));
                    GL11.glPopMatrix();
                }

                for (int var27 = 0; (float) var27 < var11 - 1.0F; var27++) {
                    float var28 = (float) var27 / var11;
                    double var29 = Math.cos((double) var28 * Math.PI / 2.0);
                    GL11.glPushMatrix();
                    GL11.glColor4f(var24, var25, var26, var23 * (1.0F - var28) * 0.25F);
                    GL11.glTranslated(var5 + 0.5, var7 - (double) var27 + 0.01F, var9 + 0.45);
                    GL11.glRotatef(90.0F, 0.0F, 0.0F, 0.0F);
                    GL11.glLineWidth(3.4F);
                    this.method16719((float) ((double) var11 * var29));
                    GL11.glPopMatrix();
                }

                GL11.glEnable(3553);
                GL11.glDisable(2848);
                GL11.glDepthMask(true);
                GL11.glEnable(2896);
                GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }
        }
    }

    private void method16719(float var1) {
        GL11.glBegin(2);

        for (int var4 = 0; var4 < 360; var4++) {
            double var5 = (double) var4 * Math.PI / 180.0;
            GL11.glVertex2d(Math.cos(var5) * (double) var1, Math.sin(var5) * (double) var1);
        }

        GL11.glEnd();
    }

    @EventTarget
    private void method16720(EventUpdate var1) {
        if (this.isEnabled()) {
            if (this.field23871 != -1) {
                if (this.field23872 != -1) {
                    if (this.field23870 != null) {
                        if (this.field23873 != 0) {
                            if (this.field23873 == 1) {
                                float var4 = BlockUtil.method34543(this.field23870.up(), Direction.field673)[0];
                                float var5 = BlockUtil.method34543(this.field23870.up(), Direction.field673)[1];
                                var1.setPitch(var4);
                                var1.setYaw(var5);
                                int var6 = mc.player.inventory.currentItem;
                                mc.player.inventory.currentItem = this.field23871;
                                Vector3d var7 = BlockUtil.method34572(Direction.field673, this.field23870);
                                BlockRayTraceResult var8 = new BlockRayTraceResult(var7, Direction.field673, this.field23870, false);
                                ActionResultType var9 = mc.playerController.func_217292_a(mc.player, mc.world, Hand.MAIN_HAND, var8);
                                mc.player.swingArm(Hand.MAIN_HAND);
                                if (var9 == ActionResultType.SUCCESS) {
                                    this.field23873++;
                                    mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.PRESS_SHIFT_KEY));
                                    mc.player.field6131.field43914 = true;
                                    mc.player.inventory.currentItem = this.field23872;
                                    Vector3d var10 = BlockUtil.method34572(Direction.field673, this.field23870.up());
                                    BlockRayTraceResult var11 = new BlockRayTraceResult(var10, Direction.field673, this.field23870.up(), false);
                                    mc.playerController.func_217292_a(mc.player, mc.world, Hand.MAIN_HAND, var11);
                                    mc.player.swingArm(Hand.MAIN_HAND);
                                    mc.player.field6131.field43914 = false;
                                    mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, CEntityActionPacket.Action.RELEASE_SHIFT_KEY));
                                    mc.playerController.func_217292_a(mc.player, mc.world, Hand.MAIN_HAND, var11);
                                }
                            }
                        } else {
                            float var12 = BlockUtil.method34543(this.field23870, Direction.field673)[0];
                            float var13 = BlockUtil.method34543(this.field23870, Direction.field673)[1];
                            var1.setPitch(var12);
                            var1.setYaw(var13);
                            this.field23873++;
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16721(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SOpenWindowPacket) {
                this.field23876 = (SOpenWindowPacket) var1.getPacket();
                if (this.isEnabled() && this.field23876.method17285() == ContainerType.field35663) {
                    var1.setCancelled(true);
                }

                this.field23874 = this.field23876.method17284();
                this.field23877 = false;
            }

            if (var1.getPacket() instanceof SSetSlotPacket) {
                SSetSlotPacket var4 = (SSetSlotPacket) var1.getPacket();
                int var5 = var4.method17304();
                ItemStack var6 = var4.method17305();
                int var7 = var4.method17303();
                if (this.field23874 == var7 && var5 == 0 && var6.getItem() != Items.field37222 && !this.field23877) {
                    var1.setCancelled(true);
                    mc.getConnection().sendPacket(new CClickWindowPacket(var7, var5, 1, ClickType.field14695, var6, this.field23875++));
                    int var8 = -1;

                    for (int var9 = 44; var9 > 9; var9--) {
                        ItemStack var10 = mc.player.container.getSlot(var9).getStack();
                        if (var10.isEmpty()) {
                            var8 = var9;
                            break;
                        }
                    }

                    if (var8 != -1) {
                        mc.player.container.getSlot(var8).putStack(var6);
                        if (var8 >= 36) {
                            mc.player.inventory.currentItem = var8 % 9;
                        }
                    }

                    this.field23877 = true;
                }
            }

            if (var1.getPacket() instanceof SCloseWindowPacket) {
                this.setEnabled(false);
            }
        }
    }

    @EventTarget
    private void method16722(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof CCloseWindowPacket) {
                var1.setCancelled(true);
            }

            if (var1.getPacket() instanceof CUseEntityPacket) {
                float var4 = BlockUtil.method34543(this.field23870.up(), Direction.field673)[0];
                float var5 = BlockUtil.method34543(this.field23870.up(), Direction.field673)[1];
            }

            if (var1.getPacket() instanceof CPlayerPacket) {
                CPlayerPacket var6 = (CPlayerPacket) var1.getPacket();
                var6.onGround = false;
            }
        }
    }
}
