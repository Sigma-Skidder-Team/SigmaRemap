// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7980
{
    private static String[] field32841;
    
    public static boolean method26014(final Class7096 class7096, final Class8802[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].method30711(class7096)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean method26015(final int n, final int n2, final Class8802[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].method30712(n, n2)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean method26016(final int n, final Class8802[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].method30709() == n) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean method26017(final int n, final int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == n) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean method26018(final TextureAtlasSprite class1912, final TextureAtlasSprite[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == class1912) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean method26019(final Class3090 class3090, final Class3090[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == class3090) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
