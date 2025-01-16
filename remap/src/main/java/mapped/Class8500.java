// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class8500
{
    private static String[] field34896;
    public static final float field34897 = 3.1415927f;
    public static final float field34898 = 6.2831855f;
    public static final float field34899 = 1.5707964f;
    private static final float[] field34900;
    
    public static float method28401(final float n) {
        return Class8500.field34900[(int)((n + 1.0f) * 32767.5) & 0xFFFF];
    }
    
    public static float method28402(final float n) {
        return 1.5707964f - Class8500.field34900[(int)((n + 1.0f) * 32767.5) & 0xFFFF];
    }
    
    public static int method28403(final int[] array) {
        if (array.length > 0) {
            return method28404(array) / array.length;
        }
        return 0;
    }
    
    public static int method28404(final int[] array) {
        if (array.length > 0) {
            int n = 0;
            for (int i = 0; i < array.length; ++i) {
                n += array[i];
            }
            return n;
        }
        return 0;
    }
    
    public static int method28405(final int n) {
        final int method35679 = MathHelper.smallestEncompassingPowerOfTwo(n);
        return (n != method35679) ? (method35679 / 2) : method35679;
    }
    
    public static boolean method28406(final float n, final float n2, final float n3) {
        return Math.abs(n - n2) <= n3;
    }
    
    public static float method28407(final float n) {
        return n * 180.0f / MathHelper.field41099;
    }
    
    public static float method28408(final float n) {
        return n / 180.0f * MathHelper.field41099;
    }
    
    public static float method28409(final double n) {
        return (float)(Math.round(n * 1.0E8) / 1.0E8);
    }
    
    public static double method28410(final BlockPos class354, final double n, final double n2, final double n3) {
        return method28412(class354.getX(), class354.getY(), class354.getZ(), n, n2, n3);
    }
    
    public static float method28411(final BlockPos class354, final float n, final float n2, final float n3) {
        return method28413((float)class354.getX(), (float)class354.getY(), (float)class354.getZ(), n, n2, n3);
    }
    
    public static double method28412(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final double n7 = n - n4;
        final double n8 = n2 - n5;
        final double n9 = n3 - n6;
        return n7 * n7 + n8 * n8 + n9 * n9;
    }
    
    public static float method28413(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float n7 = n - n4;
        final float n8 = n2 - n5;
        final float n9 = n3 - n6;
        return n7 * n7 + n8 * n8 + n9 * n9;
    }
    
    static {
        field34900 = new float[65536];
        for (int i = 0; i < 65536; ++i) {
            Class8500.field34900[i] = (float)Math.asin(i / 32767.5 - 1.0);
        }
        for (int j = -1; j < 2; ++j) {
            Class8500.field34900[(int)((j + 1.0) * 32767.5) & 0xFFFF] = (float)Math.asin(j);
        }
    }
}
