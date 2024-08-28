package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.Class4429;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.timer.Timer;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class5236 extends Module {
    private final List<Class8472> field23589 = new ArrayList<Class8472>();
    private final Timer field23590 = new Timer();

    public Class5236() {
        super(ModuleCategory.MOVEMENT, "Basic", "Basic click tp");
    }

    @Override
    public void method15966() {
        this.field23589.clear();
    }

    @Override
    public void method15965() {
        this.field23589.clear();
    }

    @EventTarget
    private void method16324(Class4429 var1) {
        if (this.method15996() && (field23386.field1339.method3331() || !this.method16004().method15974("Sneak"))) {
            if (var1.method13976() == Class2116.field13791) {
                Class8711 var4 = Class9217.method34567(
                        field23386.field1339.field5031, field23386.field1339.field5032, this.method16004().method15977("Maximum range")
                );
                BlockPos var5 = null;
                if (var4 != null) {
                    var5 = var4.method31423();
                }

                if (var5 == null) {
                    return;
                }

                double var6 = (double) var5.method8304() + 0.5;
                double var8 = var5.getY() + 1;
                double var10 = (double) var5.method8306() + 0.5;
                double var12 = field23386.field1339.getPosX() - var6;
                double var14 = field23386.field1339.getPosZ() - var10;
                double var16 = field23386.field1339.getPosY() - var8;
                double var18 = var12 * var12 + var14 * var14;
                double var20 = Math.sqrt(var18) + Math.abs(var16);
                double var22 = var20 / 8.0;
                double var24 = var12 / var22;
                double var26 = var14 / var22;
                double var28 = var16 / var22;
                double var30 = field23386.field1339.getPosX();
                double var32 = field23386.field1339.getPosZ();
                double var34 = field23386.field1339.getPosY();
                this.field23589.clear();
                this.field23589.add(new Class8472(var30, var34, var32));

                for (int var36 = 0; (double) var36 < var22 - 1.0; var36++) {
                    var30 -= var24;
                    var32 -= var26;
                    var34 -= var28;
                    double var37 = 0.3;
                    Class6488 var39 = new Class6488(var30 - var37, var34, var32 - var37, var30 + var37, var34 + 1.9, var32 + var37);
                    if (field23386.field1338.method7055(field23386.field1339, var39).count() == 0L) {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5605(var30, var34, var32, true));
                    }

                    this.field23589.add(new Class8472(var30, var34, var32));
                }

                this.field23589.add(new Class8472(var6, var8, var10));
                field23386.field1339.method3215(var6, var8, var10);
                this.field23590.method27120();
                this.field23590.method27118();
                if (this.method16004().method15974("Auto Disable")) {
                    this.method16004().method16000();
                }
            }
        }
    }

    @EventTarget
    public void method16325(Class4420 var1) {
        if (this.method15996() && this.field23589 != null && this.field23589.size() != 0) {
            if (this.field23590.method27121() > 4000L) {
                this.field23590.method27119();
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
                        var5.method29876() - field23386.field1295.method768().method37504().method11320(),
                        var5.method29877() - field23386.field1295.method768().method37504().method11321(),
                        var5.method29878() - field23386.field1295.method768().method37504().method11322()
                );
            }

            GL11.glEnd();

            for (Class8472 var12 : this.field23589) {
                double var6 = var12.method29876() - field23386.field1295.method768().method37504().method11320();
                double var8 = var12.method29878() - field23386.field1295.method768().method37504().method11322();
                Class9388 var10 = new Class9388(
                        var6 - 0.3F,
                        var12.method29877() - field23386.field1295.method768().method37504().method11321(),
                        var8 - 0.3F,
                        var6 + 0.3F,
                        var12.method29877() - field23386.field1295.method768().method37504().method11321() + 1.6F,
                        var8 + 0.3F
                );
                Class3192.method11459(var10, Class5628.method17688(Class1979.field12903.field12910, 0.2F));
            }

            GL11.glPushMatrix();
            GL11.glTranslated(
                    field23386.field1295.method768().method37504().method11320(),
                    field23386.field1295.method768().method37504().method11321(),
                    field23386.field1295.method768().method37504().method11322()
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
