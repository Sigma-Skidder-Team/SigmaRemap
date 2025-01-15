// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class Class3195 extends Class3167
{
    public Class3195() {
        super(Class8013.field32984, "Tracers", "Shows players");
        this.method9881(new Class5003("Color", "The tracers color", Class265.field1278.field1292));
    }
    
    @Class6753
    public void method10023(final Class5739 class5739) {
        if (this.method9906()) {
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(519, 0.0f);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glLineWidth(2.0f * Class9000.field37993);
            GL11.glDepthMask(false);
            GL11.glShadeModel(7425);
            for (final Class399 class5740 : Class6430.method19108()) {
                if (class5740 == Class3195.field15514.field4684) {
                    continue;
                }
                if (!class5740.method1768()) {
                    continue;
                }
                if (class5740.field2403.method18507() <= 0.8) {
                    continue;
                }
                if (class5740.field2424 <= 30) {
                    continue;
                }
                if (Class9463.method35173().method35191().method31751(class5740)) {
                    continue;
                }
                this.method10024(class5740);
            }
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
        }
    }
    
    public void method10024(final Class399 class399) {
        final double field38854 = Class8591.method29094(class399).field38854;
        final double n = Class8591.method29094(class399).field38855 + class399.method1931() / 2.0f;
        final double field38855 = Class8591.method29094(class399).field38856;
        final Class5487 method16755 = new Class5487(0.0, 0.0, 10.0).method16754(-(float)Math.toRadians(Class869.method5277().field4684.field2400)).method16755(-(float)Math.toRadians(Class869.method5277().field4684.field2399));
        final int method16756 = this.method9885("Color");
        GL11.glBegin(1);
        GL11.glColor4fv(Class6430.method19139(Class6430.method19118(method16756, 0.45f)));
        GL11.glVertex3d(method16755.field22770, method16755.field22771, method16755.field22772);
        GL11.glColor4fv(Class6430.method19139(Class6430.method19118(method16756, 0.0f)));
        GL11.glVertex3d(field38854, n, field38855);
        GL11.glEnd();
    }
}
