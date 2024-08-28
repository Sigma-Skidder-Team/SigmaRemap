package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4410;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.Class4433;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

public class Class5183 extends Module {
    public boolean field23481 = false;
    public Class7735 field23482 = Class7733.method25596(mc.method1581().field33890, new Class5425(256));

    public Class5183() {
        super(ModuleCategory.RENDER, "Fill", "Fill ESP");
        this.method15972(new Class6010("Color", "The tracers color", Class1979.field12896.field12910));
    }

    @EventTarget
    private void method16133(Class4420 var1) {
        if (this.method15996()) {
            if (mc.player != null && mc.world != null) {
                this.method16139();
                this.method16134();
                this.method16140();
                this.field23482.method25602();
            }
        }
    }

    private void method16134() {
        this.field23481 = true;
        int var3 = this.method15976("Color");
        float var4 = (float) (var3 >> 24 & 0xFF) / 255.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        GL11.glEnable(2896);
        GL11.glLightModelfv(2899, new float[]{var5, var6, var7, var4});
        RenderSystem.method27820();
        GL11.glDepthFunc(519);
        GL11.glEnable(2929);
        GL11.glEnable(32823);
        GL11.glLineWidth(2.0F);
        GL11.glPolygonMode(1032, 6914);
        GL11.glDisable(3553);
        GL11.glEnable(3008);
        GL11.glEnable(2896);
        GL11.glPolygonOffset(-30000.0F, 1.0F);

        for (Entity var9 : mc.world.method6835()) {
            if (this.method16138(var9)) {
                GL11.glPushMatrix();
                Vector3d var10 = mc.gameRenderer.getActiveRenderInfo().method37504();
                double var11 = var10.method11320();
                double var13 = var10.method11321();
                double var15 = var10.method11322();
                MatrixStack var17 = new MatrixStack();
                boolean var18 = mc.gameSettings.field44616;
                RenderSystem.method27821();
                RenderSystem.method27889(0.0F, 0.0F, 1.0F, 0.5F);
                RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12936);
                RenderSystem.enableBlend();
                mc.gameSettings.field44616 = false;
                this.method16136(var9, var11, var13, var15, mc.timer.renderPartialTicks, var17, this.field23482);
                mc.gameSettings.field44616 = var18;
                GL11.glPopMatrix();
            }
        }

        this.field23482.method25603(Class4520.method14309(Class289.field1102));
        this.field23482.method25603(Class4520.method14310(Class289.field1102));
        this.field23482.method25603(Class4520.method14312(Class289.field1102));
        this.field23482.method25603(Class4520.method14319(Class289.field1102));
        this.field23482.method25603(Class4520.method14345());
        this.field23482.method25602();
        GL11.glDepthFunc(515);
        GL11.glPolygonMode(1032, 6914);
        GL11.glDisable(32823);
        this.field23481 = false;
    }

    @EventTarget
    public void method16135(Class4433 var1) {
        if (this.method15996() && this.field23481 && var1.method13987() instanceof PlayerEntity) {
            var1.method13900(true);
        }
    }

    public void method16136(Entity var1, double var2, double var4, double var6, float var8, MatrixStack var9, Class7733 var10) {
        double var13 = MathHelper.method37822(var8, var1.field5048, var1.getPosX());
        double var15 = MathHelper.method37822(var8, var1.field5049, var1.getPosY());
        double var17 = MathHelper.method37822(var8, var1.field5050, var1.getPosZ());
        float var19 = MathHelper.method37821(var8, var1.field5033, var1.field5031);
        mc.worldRenderer.field941.method32219(var1, var13 - var2, var15 - var4, var17 - var6, var19, var8, var9, var10, 255);
    }

    @EventTarget
    public void method16137(Class4410 var1) {
        if (this.method15996()) {
            if (this.field23481) {
                var1.method13957(false);
            }
        }
    }

    private boolean method16138(Entity var1) {
        if (var1 instanceof Class880) {
            if (var1 instanceof PlayerEntity) {
                return !(var1 instanceof ClientPlayerEntity) && !Client.getInstance().getCombatManager().method29346(var1);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void method16139() {
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

    private void method16140() {
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
        GL11.glLightModelfv(2899, new float[]{0.4F, 0.4F, 0.4F, 1.0F});
    }
}