// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class5151 extends Class5147
{
    private static String[] field22164;
    private float[][] field22165;
    private static final float field22166 = -3.4028235E38f;
    
    public Class5151(final String s) {
        super(s);
        this.method16087();
    }
    
    public void method16095(final float n, final float n2, final float n3) {
        final float[] array = this.field22165[this.method16082()];
        if (array[0] == n) {
            if (array[1] == n2) {
                if (array[2] == n3) {
                    return;
                }
            }
        }
        array[0] = n;
        array[1] = n2;
        array[2] = n3;
        final int method16083 = this.method16083();
        if (method16083 >= 0) {
            ARBShaderObjects.glUniform3fARB(method16083, n, n2, n3);
            this.method16088();
        }
    }
    
    public float[] method16096() {
        return this.field22165[this.method16082()];
    }
    
    @Override
    public void method16080(final int n) {
        if (n >= this.field22165.length) {
            final float[][] field22165 = this.field22165;
            final float[][] field22166 = new float[n + 10][];
            System.arraycopy(field22165, 0, field22166, 0, field22165.length);
            this.field22165 = field22166;
        }
        if (this.field22165[n] == null) {
            this.field22165[n] = new float[] { -3.4028235E38f, -3.4028235E38f, -3.4028235E38f };
        }
    }
    
    @Override
    public void method16087() {
        this.field22165 = new float[][] { { -3.4028235E38f, -3.4028235E38f, -3.4028235E38f } };
    }
}
