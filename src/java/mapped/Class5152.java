// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class5152 extends Class5147
{
    private static String[] field22167;
    private int[][] field22168;
    private static final int field22169 = Integer.MIN_VALUE;
    
    public Class5152(final String s) {
        super(s);
        this.method16087();
    }
    
    public void method16097(final int n, final int n2, final int n3, final int n4) {
        final int[] array = this.field22168[this.method16082()];
        if (array[0] == n) {
            if (array[1] == n2) {
                if (array[2] == n3) {
                    if (array[3] == n4) {
                        return;
                    }
                }
            }
        }
        array[0] = n;
        array[1] = n2;
        array[2] = n3;
        array[3] = n4;
        final int method16083 = this.method16083();
        if (method16083 >= 0) {
            ARBShaderObjects.glUniform4iARB(method16083, n, n2, n3, n4);
            this.method16088();
        }
    }
    
    public int[] method16098() {
        return this.field22168[this.method16082()];
    }
    
    @Override
    public void method16080(final int n) {
        if (n >= this.field22168.length) {
            final int[][] field22168 = this.field22168;
            final int[][] field22169 = new int[n + 10][];
            System.arraycopy(field22168, 0, field22169, 0, field22168.length);
            this.field22168 = field22169;
        }
        if (this.field22168[n] == null) {
            this.field22168[n] = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        }
    }
    
    @Override
    public void method16087() {
        this.field22168 = new int[][] { { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE } };
    }
}
