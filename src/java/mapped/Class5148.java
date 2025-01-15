// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class5148 extends Class5147
{
    private static String[] field22155;
    private int[][] field22156;
    private static final int field22157 = Integer.MIN_VALUE;
    
    public Class5148(final String s) {
        super(s);
        this.method16087();
    }
    
    public void method16089(final int n, final int n2) {
        final int[] array = this.field22156[this.method16082()];
        if (array[0] != n || array[1] != n2) {
            array[0] = n;
            array[1] = n2;
            final int method16083 = this.method16083();
            if (method16083 >= 0) {
                ARBShaderObjects.glUniform2iARB(method16083, n, n2);
                this.method16088();
            }
        }
    }
    
    public int[] method16090() {
        return this.field22156[this.method16082()];
    }
    
    @Override
    public void method16080(final int n) {
        if (n >= this.field22156.length) {
            final int[][] field22156 = this.field22156;
            final int[][] field22157 = new int[n + 10][];
            System.arraycopy(field22156, 0, field22157, 0, field22156.length);
            this.field22156 = field22157;
        }
        if (this.field22156[n] == null) {
            this.field22156[n] = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE };
        }
    }
    
    @Override
    public void method16087() {
        this.field22156 = new int[][] { { Integer.MIN_VALUE, Integer.MIN_VALUE } };
    }
}
