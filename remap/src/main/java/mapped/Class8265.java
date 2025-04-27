// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.dimension.DimensionType;

public class Class8265
{
    private static String[] field33933;
    private final Class9432 field33934;
    private final Class9432 field33935;
    private final Class9432 field33936;
    private int[] field33937;
    private int[] field33938;
    private int[] field33939;
    
    public Class8265(final Class9432 field33934, Class9432 field33935, Class9432 field33936) {
        this.field33937 = new int[0];
        this.field33938 = new int[0];
        this.field33939 = new int[0];
        if (field33935 != null || field33936 != null) {
            if (field33935 == null) {
                field33935 = field33934;
            }
            if (field33936 == null) {
                field33936 = field33935;
            }
        }
        this.field33934 = field33934;
        this.field33935 = field33935;
        this.field33936 = field33936;
    }
    
    public boolean method27449(final ClientWorld clientWorld, final float n, final Class1846 class1849, final boolean b, final float n2) {
        final int n3 = class1849.method6644() * class1849.method6645();
        if (this.field33939.length != n3) {
            this.field33939 = new int[n3];
        }
        class1849.method6674().get(this.field33939);
        final boolean method27450 = this.method27450(clientWorld, n, this.field33939, b, n2);
        if (method27450) {
            class1849.method6674().put(this.field33939);
        }
        return method27450;
    }
    
    public boolean method27450(final ClientWorld clientWorld, final float n, final int[] array, final boolean b, final float n2) {
        if (this.field33935 == null && this.field33936 == null) {
            return this.field33934.method35053(clientWorld, n, array, b);
        }
        final DimensionType method20487 = clientWorld.dimension.getType();
        if (method20487 == DimensionType.field2225 || method20487 == DimensionType.field2224) {
            return this.field33934.method35053(clientWorld, n, array, b);
        }
        final float method20488 = clientWorld.method6768(n2);
        float method20489 = clientWorld.method6766(n2);
        final float n3 = 1.0E-4f;
        final boolean b2 = method20488 > n3;
        final boolean b3 = method20489 > n3;
        if (!b2 && !b3) {
            return this.field33934.method35053(clientWorld, n, array, b);
        }
        if (method20488 > 0.0f) {
            method20489 /= method20488;
        }
        final float n4 = 1.0f - method20488;
        final float n5 = method20488 - method20489;
        if (this.field33937.length != array.length) {
            this.field33937 = new int[array.length];
            this.field33938 = new int[array.length];
        }
        int n6 = 0;
        final int[][] array2 = { array, this.field33937, this.field33938 };
        final float[] array3 = new float[3];
        if (n4 > n3) {
            if (this.field33934.method35053(clientWorld, n, array2[n6], b)) {
                array3[n6] = n4;
                ++n6;
            }
        }
        if (n5 > n3) {
            if (this.field33935 != null) {
                if (this.field33935.method35053(clientWorld, n, array2[n6], b)) {
                    array3[n6] = n5;
                    ++n6;
                }
            }
        }
        if (method20489 > n3) {
            if (this.field33936 != null) {
                if (this.field33936.method35053(clientWorld, n, array2[n6], b)) {
                    array3[n6] = method20489;
                    ++n6;
                }
            }
        }
        if (n6 != 2) {
            return n6 != 3 || this.method27452(array2[0], array3[0], array2[1], array3[1], array2[2], array3[2]);
        }
        return this.method27451(array2[0], array3[0], array2[1], array3[1]);
    }
    
    private boolean method27451(final int[] array, final float n, final int[] array2, final float n2) {
        if (array2.length == array.length) {
            for (int i = 0; i < array.length; ++i) {
                final int n3 = array[i];
                final int n4 = n3 >> 16 & 0xFF;
                final int n5 = n3 >> 8 & 0xFF;
                final int n6 = n3 & 0xFF;
                final int n7 = array2[i];
                array[i] = (0xFF000000 | (int)(n4 * n + (n7 >> 16 & 0xFF) * n2) << 16 | (int)(n5 * n + (n7 >> 8 & 0xFF) * n2) << 8 | (int)(n6 * n + (n7 & 0xFF) * n2));
            }
            return true;
        }
        return false;
    }
    
    private boolean method27452(final int[] array, final float n, final int[] array2, final float n2, final int[] array3, final float n3) {
        if (array2.length == array.length && array3.length == array.length) {
            for (int i = 0; i < array.length; ++i) {
                final int n4 = array[i];
                final int n5 = n4 >> 16 & 0xFF;
                final int n6 = n4 >> 8 & 0xFF;
                final int n7 = n4 & 0xFF;
                final int n8 = array2[i];
                final int n9 = n8 >> 16 & 0xFF;
                final int n10 = n8 >> 8 & 0xFF;
                final int n11 = n8 & 0xFF;
                final int n12 = array3[i];
                array[i] = (0xFF000000 | (int)(n5 * n + n9 * n2 + (n12 >> 16 & 0xFF) * n3) << 16 | (int)(n6 * n + n10 * n2 + (n12 >> 8 & 0xFF) * n3) << 8 | (int)(n7 * n + n11 * n2 + (n12 & 0xFF) * n3));
            }
            return true;
        }
        return false;
    }
}
