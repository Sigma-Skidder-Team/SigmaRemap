// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class Class3171 extends Class3167
{
    public int field15532;
    
    public Class3171() {
        super(Class8013.field32984, "Box Outline", "Draws a line arround players");
        this.field15532 = Class6430.method19118(Class265.field1278.field1292, 0.8f);
        this.method9881(new Class5003("Color", "The tracers color", Class265.field1278.field1292));
    }
    
    @Class6753
    private void method9932(final Class5739 class5739) {
        if (!this.method9906()) {
            return;
        }
        if (Class3171.field15514.player != null && Class3171.field15514.world != null) {
            this.method9935();
            Class8154.method26926();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method9934(false);
            Class8154.method26927(Class2225.field13695);
            GL11.glLineWidth(3.0f);
            RenderSystem.method30000(518, 0.0f);
            RenderSystem.enableAlphaTest();
            this.method9933();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.1f);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            this.method9934(true);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            Class8154.method26928();
            this.method9936();
        }
    }
    
    private void method9933() {
        if (Class9463.method35173().method35209() == Class2209.field13464) {
            Class3171.field15514.world.field10072.forEach((p0, class399) -> {
                final boolean b = Class6430.method19174(class399) == Class2068.field11839 && this.method9914().method9883("Show Players");
                final boolean b2 = !class399.method1823() || this.method9914().method9883("Show Invisibles");
                if (!Class9463.method35173().method35191().method31751(class399)) {
                    if (!(!b)) {
                        if (!(!b2)) {
                            if (class399 != Class3171.field15514.player) {
                                final double field38854 = Class8591.method29094(class399).field38854;
                                final double field38855 = Class8591.method29094(class399).field38855;
                                final double field38856 = Class8591.method29094(class399).field38856;
                                GL11.glPushMatrix();
                                GL11.glAlphaFunc(519, 0.0f);
                                GL11.glTranslated(field38854, field38855, field38856);
                                GL11.glTranslatef(0.0f, class399.method1931(), 0.0f);
                                GL11.glTranslatef(0.0f, 0.1f, 0.0f);
                                GL11.glRotatef(Class3171.field15514.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
                                GL11.glScalef(-0.11f, -0.11f, -0.11f);
                                Class8154.method26900(-class399.method1930() * 22.0f, -class399.method1931() * 5.5f, class399.method1930() * 44.0f, class399.method1931() * 21.0f, Class7853.field32200, this.field15532, false);
                                Class7853.field32188.method24916();
                                GL11.glPopMatrix();
                            }
                        }
                    }
                }
            });
        }
    }
    
    private void method9934(final boolean b) {
        for (final Entity class399 : Class3171.field15514.world.method6806()) {
            if (!Class9463.method35173().method35191().method31751(class399)) {
                final boolean b2 = Class6430.method19174(class399) == Class2068.field11839 && this.method9914().method9883("Show Players");
                final boolean b3 = Class6430.method19174(class399) == Class2068.field11838 && this.method9914().method9883("Show Mobs");
                final boolean b4 = Class6430.method19174(class399) == Class2068.field11840 && this.method9914().method9883("Show Passives");
                final boolean b5 = !class399.method1823() || this.method9914().method9883("Show Invisibles");
                if (!b3) {
                    if (!b2) {
                        if (!b4) {
                            continue;
                        }
                    }
                }
                if (!b5) {
                    continue;
                }
                if (class399 == Class3171.field15514.player) {
                    continue;
                }
                GL11.glPushMatrix();
                GL11.glTranslated(-Class3171.field15514.field4644.method5833().method18161().getX(), -Class3171.field15514.field4644.method5833().method18161().getY(), -Class3171.field15514.field4644.method5833().method18161().getZ());
                GL11.glDisable(2929);
                GL11.glEnable(3042);
                final int method9885 = this.method9885("Color");
                final Class7644 method9886 = new Class7644(class399.getBoundingBox().offset((class399.posX - class399.lastTickPosX) * Class3171.field15514.field4633.field26528 - (class399.posX - class399.lastTickPosX), (class399.posY - class399.lastTickPosY) * Class3171.field15514.field4633.field26528 - (class399.posY - class399.lastTickPosY), (class399.posZ - class399.lastTickPosZ) * Class3171.field15514.field4633.field26528 - (class399.posZ - class399.lastTickPosZ))).method24204(0.10000000149011612);
                if (b) {
                    Class8154.method26912(method9886, 3.0f, Class6430.method19118(method9885, (Class9463.method35173().method35209() != Class2209.field13464) ? 0.8f : 0.35f));
                }
                else {
                    Class8154.method26909(method9886, Class265.field1278.field1292);
                }
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }
    }
    
    private void method9935() {
        GL11.glLineWidth(3.0f);
        GL11.glPointSize(3.0f);
        GL11.glEnable(2832);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2903);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Class3171.field15514.field4644.field9396.method1417();
    }
    
    private void method9936() {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method30084(33986, 240.0f, 240.0f);
        Class7777.method24931();
        final Class1663 method5290 = Class3171.field15514.method5290();
        Class3171.field15514.method5290();
        method5290.method5849(Class1663.field9428);
        Class3171.field15514.field4644.field9396.method1418();
    }
}
