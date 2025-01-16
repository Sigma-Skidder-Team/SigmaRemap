// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8945 implements Class8946
{
    private static String[] field37636;
    
    @Override
    public int method31737(final String s, final int n) {
        final Class6257 method23717 = Class7552.method23717(new ResourceLocation(s));
        return (method23717 != null) ? Registry.field209.getId(method23717) : n;
    }
}
