// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class7101
{
    private static String[] field27629;
    public final int field27630;
    
    public Class7101(final Class2008 class2008, final String s) {
        ARBShaderObjects.glShaderSourceARB(this.field27630 = ARBShaderObjects.glCreateShaderObjectARB(class2008.field11407), (CharSequence)s);
        ARBShaderObjects.glCompileShaderARB(this.field27630);
        if (ARBShaderObjects.glGetObjectParameteriARB(this.field27630, 35713) == 0) {
            return;
        }
        throw new RuntimeException(ARBShaderObjects.glGetInfoLogARB(this.field27630));
    }
}
