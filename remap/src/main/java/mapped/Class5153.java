// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class5153 extends Class5147
{
    private static String[] field22170;
    private int[] field22171;
    private static final int field22172 = Integer.MIN_VALUE;
    
    public Class5153(final String s) {
        super(s);
        this.method16087();
    }
    
    public void method16099(final int n) {
        final int method16082 = this.method16082();
        if (n != this.field22171[method16082]) {
            this.field22171[method16082] = n;
            final int method16083 = this.method16083();
            if (method16083 >= 0) {
                ARBShaderObjects.glUniform1iARB(method16083, n);
                this.method16088();
            }
        }
    }
    
    public int method16100() {
        return this.field22171[this.method16082()];
    }
    
    @Override
    public void method16080(final int n) {
        if (n >= this.field22171.length) {
            final int[] field22171 = this.field22171;
            final int[] field22172 = new int[n + 10];
            System.arraycopy(field22171, 0, field22172, 0, field22171.length);
            for (int i = field22171.length; i < field22172.length; ++i) {
                field22172[i] = Integer.MIN_VALUE;
            }
            this.field22171 = field22172;
        }
    }
    
    @Override
    public void method16087() {
        this.field22171 = new int[] { Integer.MIN_VALUE };
    }
}
