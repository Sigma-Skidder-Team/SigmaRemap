// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8193 implements Class8191
{
    private static String[] field33707;
    
    @Override
    public Class8087 method27127(final Class8087 class8087, final Integer[] array) {
        final int intValue = array[0];
        class8087.method26550().add(new Class9348(Class5260.field22312, Class7559.method23731((intValue & 0xFFF) << 4 | (intValue >> 12 & 0xF))));
        return class8087;
    }
}
