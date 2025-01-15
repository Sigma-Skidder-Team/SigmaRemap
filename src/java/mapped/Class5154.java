// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class5154 extends Class5147
{
    private static String[] field22173;
    private float[] field22174;
    private static final float field22175 = -3.4028235E38f;
    
    public Class5154(final String s) {
        super(s);
        this.method16087();
    }
    
    public void method16101(final float n) {
        final int method16082 = this.method16082();
        if (n != this.field22174[method16082]) {
            this.field22174[method16082] = n;
            final int method16083 = this.method16083();
            if (method16083 >= 0) {
                ARBShaderObjects.glUniform1fARB(method16083, n);
                this.method16088();
            }
        }
    }
    
    public float method16102() {
        return this.field22174[this.method16082()];
    }
    
    @Override
    public void method16080(final int n) {
        if (n >= this.field22174.length) {
            final float[] field22174 = this.field22174;
            final float[] field22175 = new float[n + 10];
            System.arraycopy(field22174, 0, field22175, 0, field22174.length);
            for (int i = field22174.length; i < field22175.length; ++i) {
                field22175[i] = -3.4028235E38f;
            }
            this.field22174 = field22175;
        }
    }
    
    @Override
    public void method16087() {
        this.field22174 = new float[] { -3.4028235E38f };
    }
}
