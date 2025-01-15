// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8190 implements Class8191
{
    private static String[] field33705;
    
    @Override
    public Class8087 method27127(final Class8087 class8087, final Integer[] array) {
        Class7562 class8088;
        if (array.length != 1) {
            if (array.length != 2) {
                return class8087;
            }
            class8088 = new Class7562(array[0].shortValue(), (byte)1, array[1].shortValue(), null);
        }
        else {
            class8088 = new Class7562(array[0].shortValue(), (byte)1, (short)0, null);
        }
        Class8748.method30243(class8088);
        class8087.method26550().add(new Class9348(Class5260.field22333, class8088));
        return class8087;
    }
}
