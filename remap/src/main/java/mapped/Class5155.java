// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class5155 extends Class5147
{
    private static String[] field22176;
    private float[][] field22177;
    private static final float field22178 = -3.4028235E38f;
    
    public Class5155(final String s) {
        super(s);
        this.method16087();
    }
    
    public void method16103(final float n, final float n2, final float n3, final float n4) {
        final float[] array = this.field22177[this.method16082()];
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
            ARBShaderObjects.glUniform4fARB(method16083, n, n2, n3, n4);
            this.method16088();
        }
    }
    
    public float[] method16104() {
        return this.field22177[this.method16082()];
    }
    
    @Override
    public void method16080(final int n) {
        if (n >= this.field22177.length) {
            final float[][] field22177 = this.field22177;
            final float[][] field22178 = new float[n + 10][];
            System.arraycopy(field22177, 0, field22178, 0, field22177.length);
            this.field22177 = field22178;
        }
        if (this.field22177[n] == null) {
            this.field22177[n] = new float[] { -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f };
        }
    }
    
    @Override
    public void method16087() {
        this.field22177 = new float[][] { { -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f } };
    }
}
