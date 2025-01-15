// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1777 extends Class1776<int[]>
{
    private static final Class1932 field9877;
    
    public int[] method6373(final Class6582 class6582, final Class5028 class6583) {
        try {
            return Class9281.method34263(class6582, Class1777.field9877);
        }
        catch (final IOException cause) {
            throw new IllegalStateException("Failed to load foliage color texture", cause);
        }
    }
    
    public void method6374(final int[] array, final Class6582 class6582, final Class5028 class6583) {
        Class8861.method31024(array);
    }
    
    static {
        field9877 = new Class1932("textures/colormap/foliage.png");
    }
}
