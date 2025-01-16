// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class3294 extends Class3167
{
    public Class3294() {
        super(Class8013.field32984, "Outline", "Draws a line arround chests");
    }
    
    @Class6753
    private void method10422(final Class5739 class5739) {
        if (!this.method9906()) {
            return;
        }
        if (Class3294.field15514.field4684 != null && Class3294.field15514.field4683 != null) {
            this.method10424();
            Class8154.method26926();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method10423(false);
            Class8154.method26927(Class2225.field13695);
            GL11.glLineWidth(3.0f);
            Class8726.method30000(518, 0.0f);
            Class8726.method29999();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.1f);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            this.method10423(true);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            Class8154.method26928();
            this.method10425();
        }
    }
    
    private void method10423(final boolean b) {
        final int method19118 = Class6430.method19118(this.method9914().method9885("Regular Color"), 0.7f);
        final int method19119 = Class6430.method19118(this.method9914().method9885("Ender Color"), 0.7f);
        final int method19120 = Class6430.method19118(this.method9914().method9885("Trapped Color"), 0.7f);
        for (final TileEntity tileEntity : Class3294.field15514.field4683.loadedTileEntityList) {
            boolean b2 = false;
            Label_0130: {
                if (tileEntity instanceof Class475) {
                    if (!(tileEntity instanceof Class478)) {
                        if (this.method9914().method9883("Show Regular Chests")) {
                            b2 = true;
                            break Label_0130;
                        }
                    }
                }
                b2 = false;
            }
            final boolean b3 = b2;
            final boolean b4 = tileEntity instanceof Class477 && this.method9914().method9883("Show Ender Chests");
            final boolean b5 = tileEntity instanceof Class478 && this.method9914().method9883("Show Trapped Chests");
            if (!b3) {
                if (!b4) {
                    if (!b5) {
                        continue;
                    }
                }
            }
            final double field38854 = Class8591.method29095(tileEntity.getPos()).field38854;
            final double field38855 = Class8591.method29095(tileEntity.getPos()).field38855;
            final double field38856 = Class8591.method29095(tileEntity.getPos()).field38856;
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            int n = method19118;
            if (!(tileEntity instanceof Class477)) {
                if (tileEntity instanceof Class478) {
                    n = method19120;
                }
            }
            else {
                n = method19119;
            }
            final Class7644 class437 = new Class7644(tileEntity.method2194().getShape(Class3294.field15514.field4683, tileEntity.getPos()).method24537().method18499(field38854, field38855, field38856));
            if (b) {
                Class8154.method26912(class437, 3.0f, n);
            }
            else {
                Class8154.method26909(class437, Class265.field1278.field1292);
            }
            GL11.glDisable(3042);
        }
    }
    
    private void method10424() {
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
        Class3294.field15514.field4644.field9396.method1417();
    }
    
    private void method10425() {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        Class8726.method30084(33986, 240.0f, 240.0f);
        Class7777.method24931();
        final Class1663 method5290 = Class3294.field15514.method5290();
        Class3294.field15514.method5290();
        method5290.method5849(Class1663.field9428);
        Class3294.field15514.field4644.field9396.method1418();
    }
}
