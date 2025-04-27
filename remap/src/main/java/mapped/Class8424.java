// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.IdentityHashMap;
import java.util.Map;

public class Class8424
{
    private static String[] field34575;
    private static final int field34576 = 0;
    private static final int field34577 = 1;
    private static final int field34578 = 2;
    private static final int field34579 = 3;
    private static final int field34580 = 4;
    
    public static Class8754[] method28127(final int n, final Class6779 class6779, final int n2, final Class8754 class6780, final Class9145 class6781) {
        if (class6779.field26624 != null && n >= 0 && n < class6779.field26624.length) {
            final int n3 = class6779.field26624[n];
            if (n3 >= 0 && n3 <= class6779.field26635.length) {
                return method28131(n3, class6779.field26635, class6780, class6781);
            }
        }
        switch (n) {
            case 1: {
                return method28128(0, 3, class6779.field26635, n2, class6780, class6781);
            }
            case 2: {
                return method28131(3, class6779.field26635, class6780, class6781);
            }
            case 3: {
                return method28128(3, 0, class6779.field26635, n2, class6780, class6781);
            }
            case 4: {
                return method28130(0, 3, 2, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 5: {
                return method28130(3, 0, 4, 2, class6779.field26635, n2, class6780, class6781);
            }
            case 6: {
                return method28130(2, 4, 2, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 7: {
                return method28130(3, 3, 4, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 8: {
                return method28130(4, 1, 4, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 9: {
                return method28130(4, 4, 4, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 10: {
                return method28130(1, 4, 1, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 11: {
                return method28130(1, 1, 4, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 12: {
                return method28129(0, 2, class6779.field26635, n2, class6780, class6781);
            }
            case 13: {
                return method28130(0, 3, 2, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 14: {
                return method28129(3, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 15: {
                return method28130(3, 0, 1, 2, class6779.field26635, n2, class6780, class6781);
            }
            case 16: {
                return method28130(2, 4, 0, 3, class6779.field26635, n2, class6780, class6781);
            }
            case 17: {
                return method28130(4, 2, 3, 0, class6779.field26635, n2, class6780, class6781);
            }
            case 18: {
                return method28130(4, 4, 3, 3, class6779.field26635, n2, class6780, class6781);
            }
            case 19: {
                return method28130(4, 2, 4, 2, class6779.field26635, n2, class6780, class6781);
            }
            case 20: {
                return method28130(1, 4, 4, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 21: {
                return method28130(4, 4, 1, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 22: {
                return method28130(4, 4, 1, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 23: {
                return method28130(4, 1, 4, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 24: {
                return method28131(2, class6779.field26635, class6780, class6781);
            }
            case 25: {
                return method28128(2, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 26: {
                return method28131(1, class6779.field26635, class6780, class6781);
            }
            case 27: {
                return method28128(1, 2, class6779.field26635, n2, class6780, class6781);
            }
            case 28: {
                return method28130(2, 4, 2, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 29: {
                return method28130(3, 3, 1, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 30: {
                return method28130(2, 1, 2, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 31: {
                return method28130(3, 3, 4, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 32: {
                return method28130(1, 1, 1, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 33: {
                return method28130(1, 1, 4, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 34: {
                return method28130(4, 1, 1, 4, class6779.field26635, n2, class6780, class6781);
            }
            case 35: {
                return method28130(1, 4, 4, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 36: {
                return method28129(2, 0, class6779.field26635, n2, class6780, class6781);
            }
            case 37: {
                return method28130(2, 1, 0, 3, class6779.field26635, n2, class6780, class6781);
            }
            case 38: {
                return method28129(1, 3, class6779.field26635, n2, class6780, class6781);
            }
            case 39: {
                return method28130(1, 2, 3, 0, class6779.field26635, n2, class6780, class6781);
            }
            case 40: {
                return method28130(4, 1, 3, 3, class6779.field26635, n2, class6780, class6781);
            }
            case 41: {
                return method28130(1, 2, 4, 2, class6779.field26635, n2, class6780, class6781);
            }
            case 42: {
                return method28130(1, 4, 3, 3, class6779.field26635, n2, class6780, class6781);
            }
            case 43: {
                return method28130(4, 2, 1, 2, class6779.field26635, n2, class6780, class6781);
            }
            case 44: {
                return method28130(1, 4, 1, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 45: {
                return method28130(4, 1, 1, 1, class6779.field26635, n2, class6780, class6781);
            }
            case 46: {
                return method28131(4, class6779.field26635, class6780, class6781);
            }
            default: {
                return method28131(0, class6779.field26635, class6780, class6781);
            }
        }
    }
    
    private static Class8754[] method28128(final int n, final int n2, final TextureAtlasSprite[] array, final int n3, final Class8754 class8754, final Class9145 class8755) {
        return method28132(Class1960.field10693, n, Class1960.field10689, n2, array, n3, class8754, class8755);
    }
    
    private static Class8754[] method28129(final int n, final int n2, final TextureAtlasSprite[] array, final int n3, final Class8754 class8754, final Class9145 class8755) {
        return method28132(Class1960.field10687, n, Class1960.field10691, n2, array, n3, class8754, class8755);
    }
    
    private static Class8754[] method28130(final int n, final int n2, final int n3, final int n4, final TextureAtlasSprite[] array, final int n5, final Class8754 class8754, final Class9145 class8755) {
        if (n == n2) {
            return (n3 != n4) ? method28133(Class1960.field10687, n, Class1960.field10692, n3, Class1960.field10690, n4, array, n5, class8754, class8755) : method28132(Class1960.field10687, n, Class1960.field10691, n3, array, n5, class8754, class8755);
        }
        if (n3 == n4) {
            return method28133(Class1960.field10694, n, Class1960.field10688, n2, Class1960.field10691, n3, array, n5, class8754, class8755);
        }
        if (n != n3) {
            return (n2 != n4) ? method28134(Class1960.field10694, n, Class1960.field10688, n2, Class1960.field10692, n3, Class1960.field10690, n4, array, n5, class8754, class8755) : method28133(Class1960.field10694, n, Class1960.field10692, n3, Class1960.field10689, n2, array, n5, class8754, class8755);
        }
        return (n2 != n4) ? method28133(Class1960.field10693, n, Class1960.field10688, n2, Class1960.field10690, n4, array, n5, class8754, class8755) : method28132(Class1960.field10693, n, Class1960.field10689, n2, array, n5, class8754, class8755);
    }
    
    private static Class8754[] method28131(final int n, final TextureAtlasSprite[] array, final Class8754 class8754, final Class9145 class8755) {
        return Class7970.method25833(array[n], class8754, class8755);
    }
    
    private static Class8754[] method28132(final Class1960 class1960, final int n, final Class1960 class1961, final int n2, final TextureAtlasSprite[] array, final int n3, final Class8754 class1962, final Class9145 class1963) {
        return class1963.method33392(method28135(array[n], class1960, n3, class1962, class1963), method28135(array[n2], class1961, n3, class1962, class1963));
    }
    
    private static Class8754[] method28133(final Class1960 class1960, final int n, final Class1960 class1961, final int n2, final Class1960 class1962, final int n3, final TextureAtlasSprite[] array, final int n4, final Class8754 class1963, final Class9145 class1964) {
        return class1964.method33393(method28135(array[n], class1960, n4, class1963, class1964), method28135(array[n2], class1961, n4, class1963, class1964), method28135(array[n3], class1962, n4, class1963, class1964));
    }
    
    private static Class8754[] method28134(final Class1960 class1960, final int n, final Class1960 class1961, final int n2, final Class1960 class1962, final int n3, final Class1960 class1963, final int n4, final TextureAtlasSprite[] array, final int n5, final Class8754 class1964, final Class9145 class1965) {
        return class1965.method33394(method28135(array[n], class1960, n5, class1964, class1965), method28135(array[n2], class1961, n5, class1964, class1965), method28135(array[n3], class1962, n5, class1964, class1965), method28135(array[n4], class1963, n5, class1964, class1965));
    }
    
    private static Class8754 method28135(final TextureAtlasSprite class1912, final Class1960 class1913, final int n, final Class8754 class1914, final Class9145 class1915) {
        switch (Class8658.field36336[class1913.ordinal()]) {
            case 1: {
                return method28136(class1912, class1913, 0, 0, 16, 8, n, class1914, class1915);
            }
            case 2: {
                return method28136(class1912, class1913, 8, 0, 16, 8, n, class1914, class1915);
            }
            case 3: {
                return method28136(class1912, class1913, 8, 0, 16, 16, n, class1914, class1915);
            }
            case 4: {
                return method28136(class1912, class1913, 8, 8, 16, 16, n, class1914, class1915);
            }
            case 5: {
                return method28136(class1912, class1913, 0, 8, 16, 16, n, class1914, class1915);
            }
            case 6: {
                return method28136(class1912, class1913, 0, 8, 8, 16, n, class1914, class1915);
            }
            case 7: {
                return method28136(class1912, class1913, 0, 0, 8, 16, n, class1914, class1915);
            }
            case 8: {
                return method28136(class1912, class1913, 0, 0, 8, 8, n, class1914, class1915);
            }
            default: {
                return class1914;
            }
        }
    }
    
    private static Class8754 method28136(final TextureAtlasSprite class1912, final Class1960 class1913, final int n, final int n2, final int n3, final int n4, final int n5, final Class8754 class1914, final Class9145 class1915) {
        final Map[][] method25857 = Class7970.method25857();
        if (method25857 == null) {
            return class1914;
        }
        final int method25858 = class1912.method7513();
        if (method25858 >= 0 && method25858 < method25857.length) {
            Map[] array = method25857[method25858];
            if (array == null) {
                array = new Map[Class1960.field10695.length];
                method25857[method25858] = array;
            }
            Map map = array[class1913.ordinal()];
            if (map == null) {
                map = new IdentityHashMap(1);
                array[class1913.ordinal()] = map;
            }
            Class8754 method25859 = map.get(class1914);
            if (method25859 == null) {
                method25859 = method28137(class1914, class1912, n5, n, n2, n3, n4);
                map.put(class1914, method25859);
            }
            return method25859;
        }
        return class1914;
    }
    
    private static Class8754 method28137(final Class8754 class8754, final TextureAtlasSprite class8755, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int[] array = class8754.method30291().clone();
        final TextureAtlasSprite method30295 = class8754.method30295();
        for (int i = 0; i < 4; ++i) {
            method28138(array, i, method30295, class8755, n, n2, n3, n4, n5);
        }
        return new Class8754(array, class8754.method30293(), class8754.method30294(), class8755);
    }
    
    private static void method28138(final int[] array, final int n, final TextureAtlasSprite class1912, final TextureAtlasSprite class1913, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final int n7 = array.length / 4 * n;
        final float intBitsToFloat = Float.intBitsToFloat(array[n7 + 4]);
        final float intBitsToFloat2 = Float.intBitsToFloat(array[n7 + 4 + 1]);
        double method7520 = class1912.method7520(intBitsToFloat);
        double method7521 = class1912.method7521(intBitsToFloat2);
        float intBitsToFloat3 = Float.intBitsToFloat(array[n7]);
        float intBitsToFloat4 = Float.intBitsToFloat(array[n7 + 1]);
        float intBitsToFloat5 = Float.intBitsToFloat(array[n7 + 2]);
        float n8 = 0.0f;
        float n9 = 0.0f;
        switch (n2) {
            case 0: {
                n8 = intBitsToFloat3;
                n9 = 1.0f - intBitsToFloat5;
                break;
            }
            case 1: {
                n8 = intBitsToFloat3;
                n9 = intBitsToFloat5;
                break;
            }
            case 2: {
                n8 = 1.0f - intBitsToFloat3;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            case 3: {
                n8 = intBitsToFloat3;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            case 4: {
                n8 = intBitsToFloat5;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            case 5: {
                n8 = 1.0f - intBitsToFloat5;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            default: {
                return;
            }
        }
        final float n10 = 4.0f / Math.max(class1912.method7496() / (class1912.method7501() - class1912.method7500()), class1912.method7495() / (class1912.method7498() - class1912.method7497()));
        final float n11 = 16.0f * (1.0f - n10);
        final float n12 = 16.0f * (1.0f - n10);
        if (method7520 < n3) {
            n8 += (float)((n3 - method7520) / n11);
            method7520 = n3;
        }
        if (method7520 > n5) {
            n8 -= (float)((method7520 - n5) / n11);
            method7520 = n5;
        }
        if (method7521 < n4) {
            n9 += (float)((n4 - method7521) / n12);
            method7521 = n4;
        }
        if (method7521 > n6) {
            n9 -= (float)((method7521 - n6) / n12);
            method7521 = n6;
        }
        switch (n2) {
            case 0: {
                intBitsToFloat3 = n8;
                intBitsToFloat5 = 1.0f - n9;
                break;
            }
            case 1: {
                intBitsToFloat3 = n8;
                intBitsToFloat5 = n9;
                break;
            }
            case 2: {
                intBitsToFloat3 = 1.0f - n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            case 3: {
                intBitsToFloat3 = n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            case 4: {
                intBitsToFloat5 = n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            case 5: {
                intBitsToFloat5 = 1.0f - n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            default: {
                return;
            }
        }
        array[n7 + 4] = Float.floatToRawIntBits(class1913.method7499(method7520));
        array[n7 + 4 + 1] = Float.floatToRawIntBits(class1913.method7502(method7521));
        array[n7] = Float.floatToRawIntBits(intBitsToFloat3);
        array[n7 + 1] = Float.floatToRawIntBits(intBitsToFloat4);
        array[n7 + 2] = Float.floatToRawIntBits(intBitsToFloat5);
    }
}
