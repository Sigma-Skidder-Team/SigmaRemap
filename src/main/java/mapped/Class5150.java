// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;
import java.nio.FloatBuffer;

public class Class5150 extends Class5147
{
    private static String[] field22161;
    private boolean field22162;
    private FloatBuffer field22163;
    
    public Class5150(final String s) {
        super(s);
    }
    
    public void method16093(final boolean field22162, final FloatBuffer field22163) {
        this.field22162 = field22162;
        this.field22163 = field22163;
        final int method16083 = this.method16083();
        if (method16083 >= 0) {
            ARBShaderObjects.glUniformMatrix4fvARB(method16083, field22162, field22163);
            this.method16088();
        }
    }
    
    public float method16094(final int n, final int n2) {
        if (this.field22163 != null) {
            return this.field22163.get(this.field22162 ? (n2 * 4 + n) : (n * 4 + n2));
        }
        return 0.0f;
    }
    
    @Override
    public void method16080(final int n) {
    }
    
    @Override
    public void method16087() {
        this.field22163 = null;
    }
}
