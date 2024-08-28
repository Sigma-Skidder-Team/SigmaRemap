package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

public class Class5232 extends Module {
    public Class5232() {
        super(ModuleCategory.RENDER, "Box", "Draws a box where chests are");
    }

    @EventTarget
    private void method16297(Class4420 var1) {
        if (this.method15996()) {
            if (mc.player != null && mc.world != null) {
                this.method16299();
                this.method16298();
                this.method16300();
            }
        }
    }

    private void method16298() {
        int var3 = Class5628.method17688(this.method16004().method15976("Regular Color"), 0.14F);
        int var4 = Class5628.method17688(this.method16004().method15976("Ender Color"), 0.14F);
        int var5 = Class5628.method17688(this.method16004().method15976("Trapped Color"), 0.14F);

        for (Class944 var7 : mc.world.field9003) {
            boolean var8 = var7 instanceof Class941 && !(var7 instanceof Class970) && this.method16004().method15974("Show Regular Chests");
            boolean var9 = var7 instanceof Class943 && this.method16004().method15974("Show Ender Chests");
            boolean var10 = var7 instanceof Class970 && this.method16004().method15974("Show Trapped Chests");
            if (var8 || var9 || var10) {
                double var11 = Class9647.method37624(var7.method3774()).field43722;
                double var13 = Class9647.method37624(var7.method3774()).field43723;
                double var15 = Class9647.method37624(var7.method3774()).field43724;
                GL11.glDisable(2929);
                GL11.glEnable(3042);
                int var17 = var3;
                if (!(var7 instanceof Class943)) {
                    if (var7 instanceof Class970) {
                        var17 = var5;
                    }
                } else {
                    var17 = var4;
                }

                Class9388 var18 = new Class9388(
                        var7.method3775().method23412(mc.world, var7.method3774()).method19514().method19667(var11, var13, var15)
                );
                GL11.glAlphaFunc(519, 0.0F);
                Class3192.method11459(var18, var17);
                Class3192.method11462(var18, 2.0F, var17);
                GL11.glDisable(3042);
            }
        }
    }

    private void method16299() {
        GL11.glLineWidth(3.0F);
        GL11.glPointSize(3.0F);
        GL11.glEnable(2832);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2903);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.gameRenderer.field818.method7316();
    }

    private void method16300() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method27905(33986, 240.0F, 240.0F);
        TextureImpl.method36180();
        TextureManager var10000 = mc.getTextureManager();
        mc.getTextureManager();
        var10000.bindTexture(TextureManager.field1094);
        mc.gameRenderer.field818.method7317();
    }
}
