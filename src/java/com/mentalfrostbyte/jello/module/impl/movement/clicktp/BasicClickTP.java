package com.mentalfrostbyte.jello.module.impl.movement.clicktp;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class BasicClickTP extends Module {
    private final List<Vector3d> field23589 = new ArrayList<Vector3d>();
    private final TimerUtil field23590 = new TimerUtil();

    public BasicClickTP() {
        super(ModuleCategory.MOVEMENT, "Basic", "Basic click tp");
    }

    @Override
    public void onEnable() {
        this.field23589.clear();
    }

    @Override
    public void onDisable() {
        this.field23589.clear();
    }

    @EventTarget
    private void method16324(ClickEvent var1) {
        if (this.isEnabled() && (mc.player.isSneaking() || !this.access().getBooleanValueFromSetttingName("Sneak"))) {
            if (var1.getButton() == ClickEvent.Button.RIGHT) {
                BlockRayTraceResult var4 = BlockUtil.rayTrace(
                        mc.player.rotationYaw, mc.player.rotationPitch, this.access().getNumberValueBySettingName("Maximum range")
                );
                BlockPos var5 = null;
                if (var4 != null) {
                    var5 = var4.getPos();
                }

                if (var5 == null) {
                    return;
                }

                double var6 = (double) var5.getX() + 0.5;
                double var8 = var5.getY() + 1;
                double var10 = (double) var5.getZ() + 0.5;
                double var12 = mc.player.getPosX() - var6;
                double var14 = mc.player.getPosZ() - var10;
                double var16 = mc.player.getPosY() - var8;
                double var18 = var12 * var12 + var14 * var14;
                double var20 = Math.sqrt(var18) + Math.abs(var16);
                double var22 = var20 / 8.0;
                double var24 = var12 / var22;
                double var26 = var14 / var22;
                double var28 = var16 / var22;
                double var30 = mc.player.getPosX();
                double var32 = mc.player.getPosZ();
                double var34 = mc.player.getPosY();
                this.field23589.clear();
                this.field23589.add(new Vector3d(var30, var34, var32));

                for (int var36 = 0; (double) var36 < var22 - 1.0; var36++) {
                    var30 -= var24;
                    var32 -= var26;
                    var34 -= var28;
                    double var37 = 0.3;
                    AxisAlignedBB var39 = new AxisAlignedBB(var30 - var37, var34, var32 - var37, var30 + var37, var34 + 1.9, var32 + var37);
                    if (mc.world.getCollisionShapes(mc.player, var39).count() == 0L) {
                        mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var30, var34, var32, true));
                    }

                    this.field23589.add(new Vector3d(var30, var34, var32));
                }

                this.field23589.add(new Vector3d(var6, var8, var10));
                mc.player.setPosition(var6, var8, var10);
                this.field23590.reset();
                this.field23590.start();
                if (this.access().getBooleanValueFromSetttingName("Auto Disable")) {
                    this.access().toggle();
                }
            }
        }
    }

    @EventTarget
    public void method16325(Render3DEvent var1) {
        if (this.isEnabled() && this.field23589 != null && this.field23589.size() != 0) {
            if (this.field23590.getElapsedTime() > 4000L) {
                this.field23590.stop();
                this.field23590.reset();
                this.field23589.clear();
            }

            GL11.glPushMatrix();
            GL11.glEnable(2848);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glEnable(32925);
            GL11.glLineWidth(1.4F);
            GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
            GL11.glBegin(3);

            for (Vector3d var5 : this.field23589) {
                GL11.glVertex3d(
                        var5.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
                        var5.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                        var5.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ()
                );
            }

            GL11.glEnd();

            for (Vector3d var12 : this.field23589) {
                double var6 = var12.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                double var8 = var12.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                Box3D var10 = new Box3D(
                        var6 - 0.3F,
                        var12.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                        var8 - 0.3F,
                        var6 + 0.3F,
                        var12.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY() + 1.6F,
                        var8 + 0.3F
                );
                RenderUtil.render3DColoredBox(var10, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.2F));
            }

            GL11.glPushMatrix();
            GL11.glTranslated(
                    mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
                    mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                    mc.gameRenderer.getActiveRenderInfo().getPos().getZ()
            );
            GL11.glPopMatrix();
            GL11.glDisable(3042);
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(32925);
            GL11.glDisable(2848);
            GL11.glPopMatrix();
        }
    }
}
