package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import org.lwjgl.opengl.GL11;

public class Class5276 extends Module {
    public int field23719 = Class5628.method17688(Class1979.field12896.field12910, 0.8F);

    public Class5276() {
        super(ModuleCategory.RENDER, "Box Outline", "Draws a line arround players");
        this.method15972(new Class6010("Color", "The tracers color", Class1979.field12896.field12910));
    }

    @EventTarget
    private void method16506(Class4420 var1) {
        if (this.method15996()) {
            if (field23386.field1339 != null && field23386.field1338 != null) {
                this.method16509();
                Class3192.method11476();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.method16508(false);
                Class3192.method11477(Class2329.field15941);
                GL11.glLineWidth(3.0F);
                RenderSystem.method27819(518, 0.0F);
                RenderSystem.disableAlphaTest();
                this.method16507();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.1F);
                GL11.glEnable(3042);
                GL11.glDisable(2896);
                this.method16508(true);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                Class3192.method11478();
                this.method16510();
            }
        }
    }

    private void method16507() {
        if (Client.getInstance().method19954() == ClientMode.JELLO) {
            field23386.field1338
                    .field9025
                    .forEach(
                            (var1, var2) -> {
                                boolean var5 = Class5628.method17744(var2) == Class2258.field14690 && this.method16004().method15974("Show Players");
                                boolean var6 = !var2.method3342() || this.method16004().method15974("Show Invisibles");
                                if (!Client.getInstance().getCombatManager().method29346(var2) && var5 && var6 && var2 != field23386.field1339) {
                                    double var7 = Class9647.method37623(var2).field43722;
                                    double var9 = Class9647.method37623(var2).field43723;
                                    double var11 = Class9647.method37623(var2).field43724;
                                    GL11.glPushMatrix();
                                    GL11.glAlphaFunc(519, 0.0F);
                                    GL11.glTranslated(var7, var9, var11);
                                    GL11.glTranslatef(0.0F, var2.method3430(), 0.0F);
                                    GL11.glTranslatef(0.0F, 0.1F, 0.0F);
                                    GL11.glRotatef(field23386.field1295.method768().method37507(), 0.0F, -1.0F, 0.0F);
                                    GL11.glScalef(-0.11F, -0.11F, -0.11F);
                                    Class3192.method11450(
                                            -var2.method3429() * 22.0F,
                                            -var2.method3430() * 5.5F,
                                            var2.method3429() * 44.0F,
                                            var2.method3430() * 21.0F,
                                            ResourcesDecrypter.shadowPNG,
                                            this.field23719,
                                            false
                                    );
                                    ResourcesDecrypter.shoutIconPNG.bind();
                                    GL11.glPopMatrix();
                                }
                            }
                    );
        }
    }

    private void method16508(boolean var1) {
        for (Entity var5 : field23386.field1338.method6835()) {
            if (!Client.getInstance().getCombatManager().method29346(var5)) {
                boolean var6 = Class5628.method17744(var5) == Class2258.field14690 && this.method16004().method15974("Show Players");
                boolean var7 = Class5628.method17744(var5) == Class2258.field14689 && this.method16004().method15974("Show Mobs");
                boolean var8 = Class5628.method17744(var5) == Class2258.field14691 && this.method16004().method15974("Show Passives");
                boolean var9 = !var5.method3342() || this.method16004().method15974("Show Invisibles");
                if ((var7 || var6 || var8) && var9 && var5 != field23386.field1339) {
                    GL11.glPushMatrix();
                    GL11.glTranslated(
                            -field23386.field1295.method768().method37504().method11320(),
                            -field23386.field1295.method768().method37504().method11321(),
                            -field23386.field1295.method768().method37504().method11322()
                    );
                    GL11.glDisable(2929);
                    GL11.glEnable(3042);
                    int var10 = this.method15976("Color");
                    double var11 = (var5.getPosX() - var5.field5048) * (double) field23386.field1284.field40356 - (var5.getPosX() - var5.field5048);
                    double var13 = (var5.getPosY() - var5.field5049) * (double) field23386.field1284.field40356 - (var5.getPosY() - var5.field5049);
                    double var15 = (var5.getPosZ() - var5.field5050) * (double) field23386.field1284.field40356 - (var5.getPosZ() - var5.field5050);
                    Class9388 var17 = new Class9388(var5.method3389().method19667(var11, var13, var15)).method35648(0.1F);
                    if (var1) {
                        Class3192.method11462(var17, 3.0F, Class5628.method17688(var10, Client.getInstance().method19954() != ClientMode.JELLO ? 0.8F : 0.35F));
                    } else {
                        Class3192.method11459(var17, Class1979.field12896.field12910);
                    }

                    GL11.glDisable(3042);
                    GL11.glPopMatrix();
                }
            }
        }
    }

    private void method16509() {
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
        field23386.field1295.field818.method7316();
    }

    private void method16510() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method27905(33986, 240.0F, 240.0F);
        TextureImpl.method36180();
        TextureManager var10000 = field23386.getTextureManager();
        field23386.getTextureManager();
        var10000.bindTexture(TextureManager.field1094);
        field23386.field1295.field818.method7317();
    }
}
