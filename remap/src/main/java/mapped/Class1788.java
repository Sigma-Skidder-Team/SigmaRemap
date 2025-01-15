// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1788 extends Class1776<int[]>
{
    private static final Class1932 field9904;
    
    public int[] method6373(final Class6582 class6582, final IProfiler class6583) {
        try {
            return Class9281.method34263(class6582, Class1788.field9904);
        }
        catch (final IOException cause) {
            throw new IllegalStateException("Failed to load grass color texture", cause);
        }
    }
    
    public void method6374(final int[] array, final Class6582 class6582, final IProfiler class6583) {
        Class9010.method32260(array);
    }
    
    static {
        field9904 = new Class1932("textures/colormap/grass.png");
    }
}
