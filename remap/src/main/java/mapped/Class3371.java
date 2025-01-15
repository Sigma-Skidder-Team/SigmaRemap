// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class Class3371 extends Class3167
{
    public static Class2092 field16038;
    public Class7808 field16039;
    
    public Class3371() {
        super(Class8013.field32984, "Shadow", "Draws a line arround entities");
        this.field16039 = Class7807.method25213(Class3371.field15514.method5333().field16262, new Class4148(256));
        this.method9881(new Class5003("Color", "The tracers color", Class265.field1278.field1292));
    }
    
    @Class6753
    private void method10719(final Class5739 class5739) {
        if (!this.method9906()) {
            return;
        }
        if (Class3371.field15514.field4684 != null && Class3371.field15514.field4683 != null) {
            this.method10726();
            Class8154.method26926();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method10721(Class2092.field12099);
            Class8154.method26927(Class2225.field13695);
            GL11.glLineWidth(1.0f);
            this.method10720();
            this.method10721(Class2092.field12100);
            Class8726.method30000(518, 0.0f);
            Class8726.method29999();
            GL11.glColor4f(1.0f, 0.0f, 1.0f, 0.1f);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            Class8154.method26928();
            this.method10727();
            this.field16039.method25216();
        }
    }
    
    private void method10720() {
        Class3371.field15514.field4683.field10072.forEach((p1, class399) -> {
            Class6430.method19118(Class265.field1278.field1292, 0.8f);
            if (!(!this.method10725(class399))) {
                final double field38854 = Class8591.method29094(class399).field38854;
                final double field38855 = Class8591.method29094(class399).field38855;
                final double field38856 = Class8591.method29094(class399).field38856;
                GL11.glPushMatrix();
                GL11.glAlphaFunc(519, 0.0f);
                GL11.glTranslated(field38854, field38855, field38856);
                GL11.glTranslatef(0.0f, class399.method1931(), 0.0f);
                GL11.glTranslatef(0.0f, 0.1f, 0.0f);
                GL11.glRotatef(Class3371.field15514.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
                GL11.glScalef(-0.11f, -0.11f, -0.11f);
                Class8154.method26900(-class399.method1930() * 22.0f, -class399.method1931() * 5.5f, class399.method1930() * 44.0f, class399.method1931() * 21.0f, Class7853.field32200, n, false);
                Class7853.field32188.method24916();
                GL11.glPopMatrix();
            }
        });
    }
    
    private void method10721(final Class2092 field16038) {
        GL11.glDepthFunc(519);
        Class3371.field16038 = field16038;
        final int method9885 = this.method9885("Color");
        final float n = (method9885 >> 24 & 0xFF) / 255.0f;
        final float n2 = (method9885 >> 16 & 0xFF) / 255.0f;
        final float n3 = (method9885 >> 8 & 0xFF) / 255.0f;
        final float n4 = (method9885 & 0xFF) / 255.0f;
        GL11.glEnable(2896);
        GL11.glLightModelfv(2899, new float[] { n2, n3, n4, n });
        Class8726.method30001();
        if (Class3371.field16038 == Class2092.field12100) {
            GL11.glEnable(10754);
            GL11.glLineWidth(2.0f);
            GL11.glPolygonMode(1032, 6913);
            GL11.glDisable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2896);
        }
        for (final Entity class399 : Class3371.field15514.field4683.method6806()) {
            if (!this.method10725(class399)) {
                continue;
            }
            GL11.glPushMatrix();
            final Vec3d method9886 = Class3371.field15514.field4644.method5833().method18161();
            final double method9887 = method9886.getX();
            final double method9888 = method9886.getY();
            final double method9889 = method9886.getZ();
            final Class7351 class400 = new Class7351();
            final boolean field16039 = Class3371.field15514.field4648.field23420;
            Class8726.method30002();
            Class8726.method30068(0.0f, 0.0f, 1.0f, 0.5f);
            Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
            Class8726.method30011();
            Class3371.field15514.field4648.field23420 = false;
            final int method9890 = class399.method1666();
            final boolean method9891 = class399.method1829(0);
            class399.method1665(0);
            class399.method1830(0, false);
            this.method10722(class399, method9887, method9888, method9889, Class3371.field15514.field4633.field26528, class400, this.field16039);
            class399.method1665(method9890);
            class399.method1830(0, method9891);
            Class3371.field15514.field4648.field23420 = field16039;
            GL11.glPopMatrix();
        }
        this.field16039.method25217(Class6332.method18767(Class1774.field9853));
        this.field16039.method25217(Class6332.method18768(Class1774.field9853));
        this.field16039.method25217(Class6332.method18770(Class1774.field9853));
        this.field16039.method25217(Class6332.method18774(Class1774.field9853));
        this.field16039.method25217(Class6332.method18791());
        this.field16039.method25216();
        if (Class3371.field16038 == Class2092.field12100) {
            GL11.glPolygonMode(1032, 6914);
            GL11.glDisable(10754);
        }
        Class3371.field16038 = Class2092.field12098;
        GL11.glDepthFunc(515);
    }
    
    public void method10722(final Entity class399, final double n, final double n2, final double n3, final float n4, final Class7351 class400, final Class7807 class401) {
        Class3371.field15514.field4636.field9290.method28706(class399, MathHelper.method35701(n4, class399.field2417, class399.getPosX()) - n, MathHelper.method35701(n4, class399.field2418, class399.getPosY()) - n2, MathHelper.method35701(n4, class399.field2419, class399.getPosZ()) - n3, MathHelper.method35700(n4, class399.field2401, class399.field2399), n4, class400, class401, 255);
    }
    
    @Class6753
    public void method10723(final Class5729 class5729) {
        if (this.method9906()) {
            if (Class3371.field16038 != Class2092.field12098) {
                class5729.method17020(false);
            }
        }
    }
    
    @Class6753
    public void method10724(final Class5749 class5749) {
        if (this.method9906()) {
            if (Class3371.field16038 != Class2092.field12098) {
                if (class5749.method17056() instanceof Class512) {
                    class5749.method16961(true);
                }
            }
        }
    }
    
    private boolean method10725(final Entity class399) {
        return class399 instanceof Class511 && class399 instanceof Class512 && !(class399 instanceof Class756) && !class399.method1823() && !Class9463.method35173().method35191().method31751(class399);
    }
    
    private void method10726() {
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
        Class3371.field15514.field4644.field9396.method1417();
    }
    
    private void method10727() {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        Class8726.method30084(33986, 240.0f, 240.0f);
        Class7777.method24931();
        final Class1663 method5290 = Class3371.field15514.method5290();
        Class3371.field15514.method5290();
        method5290.method5849(Class1663.field9428);
        Class3371.field15514.field4644.field9396.method1418();
        GL11.glLightModelfv(2899, new float[] { 0.4f, 0.4f, 0.4f, 1.0f });
        Class3371.field16038 = Class2092.field12098;
    }
    
    static {
        Class3371.field16038 = Class2092.field12098;
    }
}
