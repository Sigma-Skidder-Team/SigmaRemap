// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class3325 extends Class3167
{
    private int field15924;
    private Class9572 field15925;
    
    public Class3325() {
        super(Class8013.field32991, "Cords", "Displays coordinates");
        this.field15925 = new Class9572(1500, 1500, Class2186.field12965);
    }
    
    @Class6753
    private void method10528(final Class5743 class5743) {
        if (this.method9906()) {
            if (Class6430.method19135() > this.field15924) {
                if (Class3325.field15514.field4684.field2424 % 3 == 0) {
                    ++this.field15924;
                }
            }
            if (Class6430.method19135() < this.field15924) {
                if (Class3325.field15514.field4684.field2424 % 3 == 0) {
                    --this.field15924;
                }
            }
            boolean b = false;
            Label_0141: {
                if (!Class7482.method23148()) {
                    if (!Class3325.field15514.field4684.field2967) {
                        if (!Class3325.field15514.field4684.method1809()) {
                            b = false;
                            break Label_0141;
                        }
                    }
                }
                b = true;
            }
            if (!b) {
                if (this.field15925.method35858() == 1.0f) {
                    if (this.field15925.method35857() == Class2186.field12964) {
                        this.field15925.method35855(Class2186.field12965);
                    }
                }
            }
            else {
                this.field15925.method35855(Class2186.field12964);
            }
        }
    }
    
    @Class6753
    @Class6755
    private void method10529(final Class5740 class5740) {
        if (!this.method9906()) {
            return;
        }
        if (Class3325.field15514.field4684 == null) {
            return;
        }
        if (Class869.method5277().field4648.field23466) {
            return;
        }
        if (!Class869.method5277().field4648.field23464) {
            final float min = Math.min(1.0f, 0.6f + this.field15925.method35858() * 4.0f);
            final String string = Class3325.field15514.field4684.method1894().method1074() + " " + Class3325.field15514.field4684.method1894().method1075() + " " + Class3325.field15514.field4684.method1894().method1076();
            final int n = 85;
            final int method17028 = class5740.method17028();
            final float min2 = Math.min(1.0f, 150 / (float)Class9400.field40312.method23505(string));
            float n2;
            if (this.field15925.method35857() != Class2186.field12964) {
                n2 = min2 * (0.9f + Class7791.method25029(Math.min(1.0f, this.field15925.method35858() * 8.0f), 0.0f, 1.0f, 1.0f) * 0.1f);
            }
            else {
                n2 = min2 * (0.9f + Class7707.method24584(Math.min(1.0f, this.field15925.method35858() * 7.0f), 0.0f, 1.0f, 1.0f) * 0.1f);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)n, (float)(method17028 + 10), 0.0f);
            GL11.glScalef(n2, n2, 1.0f);
            GL11.glTranslatef((float)(-n), (float)(-method17028 - 10), 0.0f);
            Class8154.method26890(Class9400.field40328, (float)n, (float)method17028, string, Class6430.method19118(-16777216, 0.5f * min), Class2056.field11738, Class2056.field11734);
            Class8154.method26890(Class9400.field40312, (float)n, (float)method17028, string, Class6430.method19118(Class265.field1278.field1292, 0.8f * min), Class2056.field11738, Class2056.field11734);
            GL11.glPopMatrix();
        }
    }
}
