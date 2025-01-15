// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class5149 extends Class5147
{
    private static String[] field22158;
    private float[][] field22159;
    private static final float field22160 = -3.4028235E38f;
    
    public Class5149(final String s) {
        super(s);
        this.method16087();
    }
    
    public void method16091(final float n, final float n2) {
        final float[] array = this.field22159[this.method16082()];
        if (array[0] != n || array[1] != n2) {
            array[0] = n;
            array[1] = n2;
            final int method16083 = this.method16083();
            if (method16083 >= 0) {
                ARBShaderObjects.glUniform2fARB(method16083, n, n2);
                this.method16088();
            }
        }
    }
    
    public float[] method16092() {
        return this.field22159[this.method16082()];
    }
    
    @Override
    public void method16080(final int n) {
        if (n >= this.field22159.length) {
            final float[][] field22159 = this.field22159;
            final float[][] field22160 = new float[n + 10][];
            System.arraycopy(field22159, 0, field22160, 0, field22159.length);
            this.field22159 = field22160;
        }
        if (this.field22159[n] == null) {
            this.field22159[n] = new float[] { -3.4028235E38f, -3.4028235E38f };
        }
    }
    
    @Override
    public void method16087() {
        this.field22159 = new float[][] { { -3.4028235E38f, -3.4028235E38f } };
    }
}
