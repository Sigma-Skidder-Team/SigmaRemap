package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class5236 extends Module {
    private final List<Class8472> field23589 = new ArrayList<Class8472>();
    private final TimerUtil field23590 = new TimerUtil();

    public Class5236() {
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
        if (this.isEnabled() && (mc.player.method3331() || !this.method16004().getBooleanValueFromSetttingName("Sneak"))) {
            if (var1.method13976() == ClickEvent.Button.RIGHT) {
                BlockRayTraceResult var4 = Class9217.method34567(
                        mc.player.rotationYaw, mc.player.rotationPitch, this.method16004().getNumberValueBySettingName("Maximum range")
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
                this.field23589.add(new Class8472(var30, var34, var32));

                for (int var36 = 0; (double) var36 < var22 - 1.0; var36++) {
                    var30 -= var24;
                    var32 -= var26;
                    var34 -= var28;
                    double var37 = 0.3;
                    AxisAlignedBB var39 = new AxisAlignedBB(var30 - var37, var34, var32 - var37, var30 + var37, var34 + 1.9, var32 + var37);
                    if (mc.world.method7055(mc.player, var39).count() == 0L) {
                        mc.getConnection().sendPacket(new Class5605(var30, var34, var32, true));
                    }

                    this.field23589.add(new Class8472(var30, var34, var32));
                }

                this.field23589.add(new Class8472(var6, var8, var10));
                mc.player.setPosition(var6, var8, var10);
                this.field23590.method27120();
                this.field23590.start();
                if (this.method16004().getBooleanValueFromSetttingName("Auto Disable")) {
                    this.method16004().method16000();
                }
            }
        }
    }

    @EventTarget
    public void method16325(Render3DEvent var1) {
        if (this.isEnabled() && this.field23589 != null && this.field23589.size() != 0) {
            if (this.field23590.method27121() > 4000L) {
                this.field23590.stop();
                this.field23590.method27120();
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

            for (Class8472 var5 : this.field23589) {
                GL11.glVertex3d(
                        var5.method29876() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320(),
                        var5.method29877() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321(),
                        var5.method29878() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322()
                );
            }

            GL11.glEnd();

            for (Class8472 var12 : this.field23589) {
                double var6 = var12.method29876() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320();
                double var8 = var12.method29878() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322();
                Class9388 var10 = new Class9388(
                        var6 - 0.3F,
                        var12.method29877() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321(),
                        var8 - 0.3F,
                        var6 + 0.3F,
                        var12.method29877() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321() + 1.6F,
                        var8 + 0.3F
                );
                RenderUtil.method11459(var10, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.2F));
            }

            GL11.glPushMatrix();
            GL11.glTranslated(
                    mc.gameRenderer.getActiveRenderInfo().method37504().method11320(),
                    mc.gameRenderer.getActiveRenderInfo().method37504().method11321(),
                    mc.gameRenderer.getActiveRenderInfo().method37504().method11322()
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
