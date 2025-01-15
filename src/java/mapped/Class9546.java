// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.IntPredicate;
import java.util.UUID;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;

public class Class9546
{
    public static final float field41094;
    private static final int field41095 = 12;
    private static final int field41096 = 4095;
    private static final int field41097 = 4096;
    private static final int field41098 = 1024;
    public static final float field41099;
    public static final float field41100;
    public static final float field41101;
    private static final float field41102;
    public static final float field41103;
    private static final float[] field41104;
    public static boolean field41105;
    private static final float[] field41106;
    private static final Random field41107;
    private static final int[] field41108;
    private static final double field41109;
    private static final double[] field41110;
    private static final double[] field41111;
    
    public static float method35638(final float n) {
        return Class9546.field41105 ? Class9546.field41104[(int)(n * Class9546.field41102) & 0xFFF] : Class9546.field41106[(int)(n * 10430.378f) & 0xFFFF];
    }
    
    public static float method35639(final float n) {
        return Class9546.field41105 ? Class9546.field41104[(int)(n * Class9546.field41102 + 1024.0f) & 0xFFF] : Class9546.field41106[(int)(n * 10430.378f + 16384.0f) & 0xFFFF];
    }
    
    public static float method35640(final float n) {
        return (float)Math.sqrt(n);
    }
    
    public static float method35641(final double a) {
        return (float)Math.sqrt(a);
    }
    
    public static int method35642(final float n) {
        final int n2 = (int)n;
        return (n >= n2) ? n2 : (n2 - 1);
    }
    
    public static int method35643(final double n) {
        return (int)(n + 1024.0) - 1024;
    }
    
    public static int method35644(final double n) {
        final int n2 = (int)n;
        return (n >= n2) ? n2 : (n2 - 1);
    }
    
    public static long method35645(final double n) {
        final long n2 = (long)n;
        return (n >= n2) ? n2 : (n2 - 1L);
    }
    
    public static int method35646(final double n) {
        return (int)((n < 0.0) ? (-n + 1.0) : n);
    }
    
    public static float method35647(final float a) {
        return Math.abs(a);
    }
    
    public static int method35648(final int a) {
        return Math.abs(a);
    }
    
    public static int method35649(final float n) {
        final int n2 = (int)n;
        return (n <= n2) ? n2 : (n2 + 1);
    }
    
    public static int method35650(final double n) {
        final int n2 = (int)n;
        return (n <= n2) ? n2 : (n2 + 1);
    }
    
    public static int method35651(final int n, final int n2, final int n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static long method35652(final long n, final long n2, final long n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static float method35653(final float n, final float n2, final float n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static double method35654(final double n, final double n2, final double n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static double method35655(final double n, final double n2, final double n3) {
        if (n3 >= 0.0) {
            return (n3 <= 1.0) ? method35701(n3, n, n2) : n2;
        }
        return n;
    }
    
    public static double method35656(double n, double n2) {
        if (n < 0.0) {
            n = -n;
        }
        if (n2 < 0.0) {
            n2 = -n2;
        }
        return (n <= n2) ? n2 : n;
    }
    
    public static int method35657(final int x, final int y) {
        return Math.floorDiv(x, y);
    }
    
    public static int method35658(final Random random, final int n, final int n2) {
        return (n < n2) ? (random.nextInt(n2 - n + 1) + n) : n;
    }
    
    public static float method35659(final Random random, final float n, final float n2) {
        return (n < n2) ? (random.nextFloat() * (n2 - n) + n) : n;
    }
    
    public static double method35660(final Random random, final double n, final double n2) {
        return (n < n2) ? (random.nextDouble() * (n2 - n) + n) : n;
    }
    
    public static double method35661(final long[] array) {
        long n = 0L;
        for (int length = array.length, i = 0; i < length; ++i) {
            n += array[i];
        }
        return n / (double)array.length;
    }
    
    public static boolean method35662(final float n, final float n2) {
        return Math.abs(n2 - n) < 1.0E-5f;
    }
    
    public static boolean method35663(final double n, final double n2) {
        return Math.abs(n2 - n) < 9.999999747378752E-6;
    }
    
    public static int method35664(final int x, final int y) {
        return Math.floorMod(x, y);
    }
    
    public static float method35665(final float n, final float n2) {
        return (n % n2 + n2) % n2;
    }
    
    public static double method35666(final double n, final double n2) {
        return (n % n2 + n2) % n2;
    }
    
    public static int method35667(final int n) {
        int n2 = n % 360;
        if (n2 >= 180) {
            n2 -= 360;
        }
        if (n2 < -180) {
            n2 += 360;
        }
        return n2;
    }
    
    public static float method35668(final float n) {
        float n2 = n % 360.0f;
        if (n2 >= 180.0f) {
            n2 -= 360.0f;
        }
        if (n2 < -180.0f) {
            n2 += 360.0f;
        }
        return n2;
    }
    
    public static double method35669(final double n) {
        double n2 = n % 360.0;
        if (n2 >= 180.0) {
            n2 -= 360.0;
        }
        if (n2 < -180.0) {
            n2 += 360.0;
        }
        return n2;
    }
    
    public static float method35670(final float n, final float n2) {
        return method35668(n2 - n);
    }
    
    public static float method35671(final float n, final float n2) {
        return method35647(method35670(n, n2));
    }
    
    public static float method35672(final float n, final float n2, final float n3) {
        return n2 - method35653(method35670(n, n2), -n3, n3);
    }
    
    public static float method35673(final float n, final float n2, float method35647) {
        method35647 = method35647(method35647);
        return (n >= n2) ? method35653(n - method35647, n2, n) : method35653(n + method35647, n, n2);
    }
    
    public static float method35674(final float n, final float n2, final float n3) {
        return method35673(n, n + method35670(n, n2), n3);
    }
    
    public static int method35675(final String s, final int n) {
        return NumberUtils.toInt(s, n);
    }
    
    public static int method35676(final String s, final int n, final int a) {
        return Math.max(a, method35675(s, n));
    }
    
    public static double method35677(final String s, final double n) {
        try {
            return Double.parseDouble(s);
        }
        catch (final Throwable t) {
            return n;
        }
    }
    
    public static double method35678(final String s, final double n, final double a) {
        return Math.max(a, method35677(s, n));
    }
    
    public static int method35679(final int n) {
        final int n2 = n - 1;
        final int n3 = n2 | n2 >> 1;
        final int n4 = n3 | n3 >> 2;
        final int n5 = n4 | n4 >> 4;
        final int n6 = n5 | n5 >> 8;
        return (n6 | n6 >> 16) + 1;
    }
    
    private static boolean method35680(final int n) {
        return n != 0 && (n & n - 1) == 0x0;
    }
    
    public static int method35681(int n) {
        n = (method35680(n) ? n : method35679(n));
        return Class9546.field41108[(int)(n * 125613361L >> 27) & 0x1F];
    }
    
    public static int method35682(final int n) {
        return method35681(n) - (method35680(n) ? 0 : 1);
    }
    
    public static int method35683(final int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (n != 0) {
            if (n < 0) {
                n2 *= -1;
            }
            final int n3 = n % n2;
            return (n3 != 0) ? (n + n2 - n3) : n;
        }
        return n2;
    }
    
    public static int method35684(final float n, final float n2, final float n3) {
        return method35685(method35642(n * 255.0f), method35642(n2 * 255.0f), method35642(n3 * 255.0f));
    }
    
    public static int method35685(final int n, final int n2, final int n3) {
        return ((n << 8) + n2 << 8) + n3;
    }
    
    public static float method35686(final float n) {
        return n - method35642(n);
    }
    
    public static double method35687(final double n) {
        return n - method35645(n);
    }
    
    public static long method35688(final Class352 class352) {
        return method35689(class352.method1074(), class352.method1075(), class352.method1076());
    }
    
    public static long method35689(final int n, final int n2, final int n3) {
        final long n4 = (long)(n * 3129871) ^ n3 * 116129781L ^ (long)n2;
        return n4 * n4 * 42317861L + n4 * 11L >> 16;
    }
    
    public static UUID method35690(final Random random) {
        return new UUID((random.nextLong() & 0xFFFFFFFFFFFF0FFFL) | 0x4000L, (random.nextLong() & 0x3FFFFFFFFFFFFFFFL) | Long.MIN_VALUE);
    }
    
    public static UUID method35691() {
        return method35690(Class9546.field41107);
    }
    
    public static double method35692(final double n, final double n2, final double n3) {
        return (n - n2) / (n3 - n2);
    }
    
    public static double method35693(double n, double n2) {
        final double v = n2 * n2 + n * n;
        if (!Double.isNaN(v)) {
            final boolean b = n < 0.0;
            if (b) {
                n = -n;
            }
            final boolean b2 = n2 < 0.0;
            if (b2) {
                n2 = -n2;
            }
            final boolean b3 = n > n2;
            if (b3) {
                final double n3 = n2;
                n2 = n;
                n = n3;
            }
            final double method35695 = method35695(v);
            n2 *= method35695;
            n *= method35695;
            final double n4 = Class9546.field41109 + n;
            final int n5 = (int)Double.doubleToRawLongBits(n4);
            final double n6 = Class9546.field41110[n5];
            final double n7 = n * Class9546.field41111[n5] - n2 * (n4 - Class9546.field41109);
            double n8 = n6 + (6.0 + n7 * n7) * n7 * 0.16666666666666666;
            if (b3) {
                n8 = 1.5707963267948966 - n8;
            }
            if (b2) {
                n8 = 3.141592653589793 - n8;
            }
            if (b) {
                n8 = -n8;
            }
            return n8;
        }
        return Double.NaN;
    }
    
    public static float method35694(float intBitsToFloat) {
        final float n = 0.5f * intBitsToFloat;
        intBitsToFloat = Float.intBitsToFloat(1597463007 - (Float.floatToIntBits(intBitsToFloat) >> 1));
        intBitsToFloat *= 1.5f - n * intBitsToFloat * intBitsToFloat;
        return intBitsToFloat;
    }
    
    public static double method35695(double longBitsToDouble) {
        final double n = 0.5 * longBitsToDouble;
        longBitsToDouble = Double.longBitsToDouble(6910469410427058090L - (Double.doubleToRawLongBits(longBitsToDouble) >> 1));
        longBitsToDouble *= 1.5 - n * longBitsToDouble * longBitsToDouble;
        return longBitsToDouble;
    }
    
    public static float method35696(final float value) {
        final float intBitsToFloat = Float.intBitsToFloat(1419967116 - Float.floatToIntBits(value) / 3);
        final float n = 0.6666667f * intBitsToFloat + 1.0f / (3.0f * intBitsToFloat * intBitsToFloat * value);
        return 0.6666667f * n + 1.0f / (3.0f * n * n * value);
    }
    
    public static int method35697(final float f, final float f2, final float f3) {
        final int n = (int)(f * 6.0f) % 6;
        final float n2 = f * 6.0f - n;
        final float n3 = f3 * (1.0f - f2);
        final float n4 = f3 * (1.0f - n2 * f2);
        final float n5 = f3 * (1.0f - (1.0f - n2) * f2);
        float n6 = 0.0f;
        float n7 = 0.0f;
        float n8 = 0.0f;
        switch (n) {
            case 0: {
                n6 = f3;
                n7 = n5;
                n8 = n3;
                break;
            }
            case 1: {
                n6 = n4;
                n7 = f3;
                n8 = n3;
                break;
            }
            case 2: {
                n6 = n3;
                n7 = f3;
                n8 = n5;
                break;
            }
            case 3: {
                n6 = n3;
                n7 = n4;
                n8 = f3;
                break;
            }
            case 4: {
                n6 = n5;
                n7 = n3;
                n8 = f3;
                break;
            }
            case 5: {
                n6 = f3;
                n7 = n3;
                n8 = n4;
                break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + f + ", " + f2 + ", " + f3);
            }
        }
        return method35651((int)(n6 * 255.0f), 0, 255) << 16 | method35651((int)(n7 * 255.0f), 0, 255) << 8 | method35651((int)(n8 * 255.0f), 0, 255);
    }
    
    public static int method35698(int n) {
        n ^= n >>> 16;
        n *= -2048144789;
        n ^= n >>> 13;
        n *= -1028477387;
        n ^= n >>> 16;
        return n;
    }
    
    public static int method35699(int n, final int n2, final IntPredicate intPredicate) {
        int i = n2 - n;
        while (i > 0) {
            final int n3 = i / 2;
            final int n4 = n + n3;
            if (!intPredicate.test(n4)) {
                n = n4 + 1;
                i -= n3 + 1;
            }
            else {
                i = n3;
            }
        }
        return n;
    }
    
    public static float method35700(final float n, final float n2, final float n3) {
        return n2 + n * (n3 - n2);
    }
    
    public static double method35701(final double n, final double n2, final double n3) {
        return n2 + n * (n3 - n2);
    }
    
    public static double method35702(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return method35701(n2, method35701(n, n3, n4), method35701(n, n5, n6));
    }
    
    public static double method35703(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9, final double n10, final double n11) {
        return method35701(n3, method35702(n, n2, n4, n5, n6, n7), method35702(n, n2, n8, n9, n10, n11));
    }
    
    public static double method35704(final double n) {
        return n * n * n * (n * (n * 6.0 - 15.0) + 10.0);
    }
    
    public static int method35705(final double n) {
        if (n != 0.0) {
            return (n <= 0.0) ? -1 : 1;
        }
        return 0;
    }
    
    public static float method35706(final float n, final float n2, final float n3) {
        return n2 + n * method35668(n3 - n2);
    }
    
    @Deprecated
    public static float method35707(final float n, final float n2, final float n3) {
        float n4;
        for (n4 = n2 - n; n4 < -180.0f; n4 += 360.0f) {}
        while (n4 >= 180.0f) {
            n4 -= 360.0f;
        }
        return n + n3 * n4;
    }
    
    @Deprecated
    public static float method35708(double n) {
        while (n >= 180.0) {
            n -= 360.0;
        }
        while (n < -180.0) {
            n += 360.0;
        }
        return (float)n;
    }
    
    static {
        field41094 = method35640(2.0f);
        field41099 = Class8500.method28409(3.141592653589793);
        field41100 = Class8500.method28409(6.283185307179586);
        field41101 = Class8500.method28409(1.5707963267948966);
        field41102 = Class8500.method28409(651.8986469044033);
        field41103 = Class8500.method28409(0.017453292519943295);
        field41104 = new float[4096];
        Class9546.field41105 = false;
        field41106 = Class8349.method27851(new float[65536], array -> {
            int k = 0;
            while (k < array.length) {
                array[k] = (float)Math.sin(k * 3.141592653589793 * 2.0 / 65536.0);
                ++k;
            }
            return;
        });
        field41107 = new Random();
        field41108 = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
        field41109 = Double.longBitsToDouble(4805340802404319232L);
        field41110 = new double[257];
        field41111 = new double[257];
        for (int i = 0; i < 257; ++i) {
            final double asin = Math.asin(i / 256.0);
            Class9546.field41111[i] = Math.cos(asin);
            Class9546.field41110[i] = asin;
        }
        for (int j = 0; j < Class9546.field41104.length; ++j) {
            Class9546.field41104[j] = Class8500.method28409(Math.sin(j * 3.141592653589793 * 2.0 / 4096.0));
        }
    }
}
