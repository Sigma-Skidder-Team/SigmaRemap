package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

public class Class5323 extends Module {
    public BlockPos field23870;
    public int field23871 = -1;
    public int field23872 = -1;
    public int field23873 = 0;
    public int field23874 = -1;
    public short field23875 = 0;
    public Class5498 field23876;
    public boolean field23877 = false;

    public Class5323() {
        super(ModuleCategory.WORLD, "Auto32k", "Automaticly places 32k shulker + hopper in hotbar");
    }

    @Override
    public void method15966() {
        this.field23870 = null;

        for (BlockPos var4 : Class9217.method34545(Class9217.method34561(mc.field1337.method23135()))) {
            if (!(Class9217.method34550(mc.field1339, var4) < 2.0F)
                    && Class9217.method34535(mc.field1339, var4)
                    && (double) var4.getY() >= mc.field1339.getPosY() - 2.0
                    && (double) var4.getY() <= mc.field1339.getPosY() - 1.0
                    && this.method16717(var4)) {
                this.field23870 = var4;
                break;
            }
        }

        this.field23872 = Class7789.method25843(
                Class8514.field37669,
                Class8514.field37665,
                Class8514.field37666,
                Class8514.field37663,
                Class8514.field37661,
                Class8514.field37667,
                Class8514.field37657,
                Class8514.field37662,
                Class8514.field37659,
                Class8514.field37656,
                Class8514.field37655,
                Class8514.field37660,
                Class8514.field37664,
                Class8514.field37668,
                Class8514.field37653,
                Class8514.field37654,
                Class8514.field37658
        );
        this.field23871 = Class7789.method25843(Class8514.field37545);
        if (this.field23871 == -1) {
            this.field23871 = Class7789.method25822(Class8514.field37545);
            if (this.field23871 != -1) {
                if (this.field23871 >= 36 && this.field23871 <= 44) {
                    this.field23871 %= 9;
                } else {
                    this.field23871 = Class7789.method25857(this.field23871);
                }
            }
        }

        if (this.field23872 == -1) {
            this.field23872 = Class7789.method25823(
                    Class8514.field37669,
                    Class8514.field37665,
                    Class8514.field37666,
                    Class8514.field37663,
                    Class8514.field37661,
                    Class8514.field37667,
                    Class8514.field37657,
                    Class8514.field37662,
                    Class8514.field37659,
                    Class8514.field37656,
                    Class8514.field37655,
                    Class8514.field37660,
                    Class8514.field37664,
                    Class8514.field37668,
                    Class8514.field37653,
                    Class8514.field37654,
                    Class8514.field37658
            );
            if (this.field23872 != -1) {
                if (this.field23872 >= 36 && this.field23872 <= 44) {
                    this.field23872 %= 9;
                } else {
                    this.field23872 = Class7789.method25857(this.field23872);
                }
            }
        }

        this.field23873 = 0;
    }

    public boolean method16717(BlockPos var1) {
        Class7380 var4 = mc.field1338.method6738(var1);
        Class7380 var5 = mc.field1338.method6738(var1.method8311());
        Class7380 var6 = mc.field1338.method6738(var1.method8339(2));
        return var4.method23410() && var5.method23393() && var6.method23393();
    }

    @Override
    public void method15965() {
    }

    @EventTarget
    private void method16718(Class4420 var1) {
        if (this.method15996()) {
            if (this.field23870 != null) {
                GL11.glAlphaFunc(516, 0.0F);
                BlockPos var4 = this.field23870;
                double var5 = (double) var4.method8304() - mc.field1295.method768().method37504().method11320();
                double var7 = (double) var4.getY() - mc.field1295.method768().method37504().method11321();
                double var9 = (double) var4.method8306() - mc.field1295.method768().method37504().method11322();
                Class3192.method11459(
                        new Class9388(var5, var7 + 1.625, var9, var5 + 1.0, var7 + 3.0, var9 + 1.0), Class5628.method17688(Class1979.field12903.field12910, 0.3F)
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
                    int var13 = Class5628.method17688(Class1979.field12903.field12910, 0.5F);
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

                int var22 = Class5628.method17688(Class1979.field12896.field12910, 0.5F);
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
    private void method16720(Class4399 var1) {
        if (this.method15996()) {
            if (this.field23871 != -1) {
                if (this.field23872 != -1) {
                    if (this.field23870 != null) {
                        if (this.field23873 != 0) {
                            if (this.field23873 == 1) {
                                float var4 = Class9217.method34543(this.field23870.method8311(), Direction.field673)[0];
                                float var5 = Class9217.method34543(this.field23870.method8311(), Direction.field673)[1];
                                var1.method13918(var4);
                                var1.method13916(var5);
                                int var6 = mc.field1339.field4902.field5443;
                                mc.field1339.field4902.field5443 = this.field23871;
                                Vector3d var7 = Class9217.method34572(Direction.field673, this.field23870);
                                Class8711 var8 = new Class8711(var7, Direction.field673, this.field23870, false);
                                Class2274 var9 = mc.field1337.method23139(mc.field1339, mc.field1338, Class79.field182, var8);
                                mc.field1339.method2820(Class79.field182);
                                if (var9 == Class2274.field14818) {
                                    this.field23873++;
                                    mc.getClientPlayNetHandler().sendPacket(new Class5583(mc.field1339, Class1865.field10040));
                                    mc.field1339.field6131.field43914 = true;
                                    mc.field1339.field4902.field5443 = this.field23872;
                                    Vector3d var10 = Class9217.method34572(Direction.field673, this.field23870.method8311());
                                    Class8711 var11 = new Class8711(var10, Direction.field673, this.field23870.method8311(), false);
                                    mc.field1337.method23139(mc.field1339, mc.field1338, Class79.field182, var11);
                                    mc.field1339.method2820(Class79.field182);
                                    mc.field1339.field6131.field43914 = false;
                                    mc.getClientPlayNetHandler().sendPacket(new Class5583(mc.field1339, Class1865.field10041));
                                    mc.field1337.method23139(mc.field1339, mc.field1338, Class79.field182, var11);
                                }
                            }
                        } else {
                            float var12 = Class9217.method34543(this.field23870, Direction.field673)[0];
                            float var13 = Class9217.method34543(this.field23870, Direction.field673)[1];
                            var1.method13918(var12);
                            var1.method13916(var13);
                            this.field23873++;
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16721(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5498) {
                this.field23876 = (Class5498) var1.method13898();
                if (this.method15996() && this.field23876.method17285() == Class8298.field35663) {
                    var1.method13900(true);
                }

                this.field23874 = this.field23876.method17284();
                this.field23877 = false;
            }

            if (var1.method13898() instanceof Class5501) {
                Class5501 var4 = (Class5501) var1.method13898();
                int var5 = var4.method17304();
                Class8848 var6 = var4.method17305();
                int var7 = var4.method17303();
                if (this.field23874 == var7 && var5 == 0 && var6.method32107() != Class8514.field37222 && !this.field23877) {
                    var1.method13900(true);
                    mc.getClientPlayNetHandler().sendPacket(new Class5594(var7, var5, 1, Class2259.field14695, var6, this.field23875++));
                    int var8 = -1;

                    for (int var9 = 44; var9 > 9; var9--) {
                        Class8848 var10 = mc.field1339.field4904.method18131(var9).method18265();
                        if (var10.method32105()) {
                            var8 = var9;
                            break;
                        }
                    }

                    if (var8 != -1) {
                        mc.field1339.field4904.method18131(var8).method18267(var6);
                        if (var8 >= 36) {
                            mc.field1339.field4902.field5443 = var8 % 9;
                        }
                    }

                    this.field23877 = true;
                }
            }

            if (var1.method13898() instanceof Class5586) {
                this.method15999(false);
            }
        }
    }

    @EventTarget
    private void method16722(Class4402 var1) {
        if (this.method15996()) {
            if (var1.method13932() instanceof Class5482) {
                var1.method13900(true);
            }

            if (var1.method13932() instanceof Class5505) {
                float var4 = Class9217.method34543(this.field23870.method8311(), Direction.field673)[0];
                float var5 = Class9217.method34543(this.field23870.method8311(), Direction.field673)[1];
            }

            if (var1.method13932() instanceof Class5603) {
                Class5603 var6 = (Class5603) var1.method13932();
                var6.field24883 = false;
            }
        }
    }
}
