// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;
import java.util.Arrays;

public abstract class Class5147
{
    private String field22150;
    private int field22151;
    private int[] field22152;
    private static final int field22153 = -1;
    private static final int field22154 = Integer.MIN_VALUE;
    
    public Class5147(final String field22150) {
        this.field22151 = 0;
        this.field22152 = new int[] { -1 };
        this.field22150 = field22150;
    }
    
    public void method16078(final int field22151) {
        if (this.field22151 != field22151) {
            this.field22151 = field22151;
            this.method16079();
            this.method16080(field22151);
        }
    }
    
    private void method16079() {
        if (this.field22151 >= this.field22152.length) {
            final int[] array = new int[this.field22151 * 2];
            Arrays.fill(array, Integer.MIN_VALUE);
            System.arraycopy(this.field22152, 0, array, 0, this.field22152.length);
            this.field22152 = array;
        }
    }
    
    public abstract void method16080(final int p0);
    
    public String method16081() {
        return this.field22150;
    }
    
    public int method16082() {
        return this.field22151;
    }
    
    public int method16083() {
        if (this.field22151 > 0) {
            int glGetUniformLocationARB = this.field22152[this.field22151];
            if (glGetUniformLocationARB == Integer.MIN_VALUE) {
                glGetUniformLocationARB = ARBShaderObjects.glGetUniformLocationARB(this.field22151, (CharSequence)this.field22150);
                this.field22152[this.field22151] = glGetUniformLocationARB;
            }
            return glGetUniformLocationARB;
        }
        return -1;
    }
    
    public boolean method16084() {
        return this.method16083() >= 0;
    }
    
    public void method16085() {
        this.field22152[this.field22151] = -1;
    }
    
    public void method16086() {
        this.field22151 = 0;
        this.field22152 = new int[] { -1 };
        this.method16087();
    }
    
    public abstract void method16087();
    
    public void method16088() {
        if (Class9216.method33739(this.field22150) != 0) {
            this.method16085();
        }
    }
    
    @Override
    public String toString() {
        return this.field22150;
    }
}
