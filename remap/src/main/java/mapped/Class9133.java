// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class9133
{
    private static long field38705;
    private static long field38706;
    private static long field38707;
    private static long field38708;
    private static boolean field38709;
    
    public static void method33157(final long n) {
        try {
            Thread.sleep(5000L);
        }
        catch (final InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public static long method33158() {
        return Class9133.field38705;
    }
    
    public static long method33159() {
        return Class9133.field38706;
    }
    
    public static long method33160() {
        return Class9133.field38707;
    }
    
    public static long method33161() {
        return Class9133.field38708;
    }
    
    public static void method33162(final long field38705) {
        if (field38705 >= 1024L) {
            Class9133.field38705 = field38705;
        }
        else {
            Class9133.field38705 = 1024L;
        }
    }
    
    public static void method33163(final long field38706) {
        if (field38706 >= 1024L) {
            Class9133.field38706 = field38706;
        }
        else {
            Class9133.field38706 = 1024L;
        }
    }
    
    public static void method33164(final long field38707) {
        if (field38707 >= 4096L) {
            Class9133.field38707 = field38707;
        }
        else {
            Class9133.field38707 = 4096L;
        }
    }
    
    public static void method33165(final long field38708) {
        Class9133.field38708 = field38708;
    }
    
    public static void method33166() {
        Class9133.field38705 = 8192L;
        Class9133.field38706 = 65536L;
    }
    
    public static void method33167() {
        Class9133.field38707 = 65536L;
        Class9133.field38708 = 65536L;
    }
    
    public static boolean method33168() {
        return Class9133.field38709;
    }
    
    public static void method33169(final boolean field38709) {
        Class9133.field38709 = field38709;
    }
    
    public static int method33170(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("x must be greater or equal 1");
        }
        if ((n & n - 1) != 0x0) {
            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
            return n + 1;
        }
        return n;
    }
    
    public static long method33171(long n) {
        if (n < 1L) {
            throw new IllegalArgumentException("x must be greater or equal 1");
        }
        if ((n & n - 1L) != 0x0L) {
            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
            n |= n >>> 32;
            return n + 1L;
        }
        return n;
    }
    
    public static int method33172(final int n) {
        if (n >= 1) {
            return (int)Class7640.method24094(2.0, Class7640.method24123(Class7640.method24089(n) / Class7640.method24089(2.0)));
        }
        throw new IllegalArgumentException("x must be greater or equal 1");
    }
    
    public static long method33173(final long n) {
        if (n >= 1L) {
            return (long)Class7640.method24094(2.0, Class7640.method24123(Class7640.method24089((double)n) / Class7640.method24089(2.0)));
        }
        throw new IllegalArgumentException("x must be greater or equal 1");
    }
    
    public static boolean method33174(final int n) {
        return n > 0 && (n & n - 1) == 0x0;
    }
    
    public static boolean method33175(final long n) {
        return n > 0L && (n & n - 1L) == 0x0L;
    }
    
    public static long method33176(final long n, final int[] array) {
        long n2 = n;
        if (n > 0L) {
            for (int n3 = 0; n3 < array.length && n2 != 1L; ++n3) {
                for (long n4 = array[n3]; n2 % n4 == 0L; n2 /= n4) {}
            }
            return n2;
        }
        throw new IllegalArgumentException("n must be positive integer");
    }
    
    public static void method33177(final int n, final int[] array) {
        array[2] = 0;
        array[3] = 16;
        int n2 = 2;
        for (int i = n; i > 32; i >>= 2) {
            final int n3 = n2 << 1;
            final int n4 = n3 << 3;
            for (int j = n2; j < n3; ++j) {
                array[n3 + j] = (array[n2 + j] = array[j] << 2) + n4;
            }
            n2 = n3;
        }
    }
    
    public static void method33178(final long n, final Class15 class15) {
        class15.method167(2L, 0L);
        class15.method167(3L, 16L);
        long n2 = 2L;
        for (long n3 = n; n3 > 32L; n3 >>= 2) {
            final long n4 = n2 << 1;
            final long n5 = n4 << 3;
            for (long n6 = n2; n6 < n4; ++n6) {
                final long n7 = class15.method133(n6) << 2;
                class15.method167(n2 + n6, n7);
                class15.method167(n4 + n6, n7 + n5);
            }
            n2 = n4;
        }
    }
    
    public static void method33179(final int n, final int[] array, final double[] array2) {
        array[0] = n;
        array[1] = 1;
        if (n > 2) {
            int i = n >> 1;
            final double n2 = 0.7853981633974483 / i;
            final double n3 = n2 * 2.0;
            final double method24103 = Class7640.method24103(n2 * i);
            array2[0] = 1.0;
            array2[1] = method24103;
            if (i != 4) {
                if (i > 4) {
                    method33177(n, array);
                    array2[2] = 0.5 / Class7640.method24103(n3);
                    array2[3] = 0.5 / Class7640.method24103(n2 * 6.0);
                    for (int j = 4; j < i; j += 4) {
                        final double n4 = n2 * j;
                        final double n5 = 3.0 * n4;
                        array2[j] = Class7640.method24103(n4);
                        array2[j + 1] = Class7640.method24102(n4);
                        array2[j + 2] = Class7640.method24103(n5);
                        array2[j + 3] = -Class7640.method24102(n5);
                    }
                }
            }
            else {
                array2[2] = Class7640.method24103(n3);
                array2[3] = Class7640.method24102(n3);
            }
            int n6 = 0;
            while (i > 2) {
                final int n7 = n6 + i;
                i >>= 1;
                array2[n7] = 1.0;
                array2[n7 + 1] = method24103;
                if (i != 4) {
                    if (i > 4) {
                        final double n8 = array2[n6 + 4];
                        final double n9 = array2[n6 + 6];
                        array2[n7 + 2] = 0.5 / n8;
                        array2[n7 + 3] = 0.5 / n9;
                        for (int k = 4; k < i; k += 4) {
                            final int n10 = n6 + 2 * k;
                            final int n11 = n7 + k;
                            final double n12 = array2[n10];
                            final double n13 = array2[n10 + 1];
                            final double n14 = array2[n10 + 2];
                            final double n15 = array2[n10 + 3];
                            array2[n11] = n12;
                            array2[n11 + 1] = n13;
                            array2[n11 + 2] = n14;
                            array2[n11 + 3] = n15;
                        }
                    }
                }
                else {
                    final double n16 = array2[n6 + 4];
                    final double n17 = array2[n6 + 5];
                    array2[n7 + 2] = n16;
                    array2[n7 + 3] = n17;
                }
                n6 = n7;
            }
        }
    }
    
    public static void method33180(final long n, final Class15 class15, final Class17 class16) {
        class15.method167(0L, n);
        class15.method167(1L, 1L);
        if (n > 2L) {
            long n2 = n >> 1;
            final double n3 = 0.7853981633974483 / n2;
            final double n4 = n3 * 2.0;
            final double method24103 = Class7640.method24103(n3 * n2);
            class16.method171(0L, 1.0);
            class16.method171(1L, method24103);
            if (n2 != 4L) {
                if (n2 > 4L) {
                    method33178(n, class15);
                    class16.method171(2L, 0.5 / Class7640.method24103(n4));
                    class16.method171(3L, 0.5 / Class7640.method24103(n3 * 6.0));
                    for (long n5 = 4L; n5 < n2; n5 += 4L) {
                        final double n6 = n3 * n5;
                        final double n7 = 3.0 * n6;
                        class16.method171(n5, Class7640.method24103(n6));
                        class16.method171(n5 + 1L, Class7640.method24102(n6));
                        class16.method171(n5 + 2L, Class7640.method24103(n7));
                        class16.method171(n5 + 3L, -Class7640.method24102(n7));
                    }
                }
            }
            else {
                class16.method171(2L, Class7640.method24103(n4));
                class16.method171(3L, Class7640.method24102(n4));
            }
            long n8 = 0L;
            while (n2 > 2L) {
                final long n9 = n8 + n2;
                n2 >>= 1;
                class16.method171(n9, 1.0);
                class16.method171(n9 + 1L, method24103);
                if (n2 != 4L) {
                    if (n2 > 4L) {
                        final double method24104 = class16.method137(n8 + 4L);
                        final double method24105 = class16.method137(n8 + 6L);
                        class16.method171(n9 + 2L, 0.5 / method24104);
                        class16.method171(n9 + 3L, 0.5 / method24105);
                        for (long n10 = 4L; n10 < n2; n10 += 4L) {
                            final long n11 = n8 + 2L * n10;
                            final long n12 = n9 + n10;
                            final double method24106 = class16.method137(n11);
                            final double method24107 = class16.method137(n11 + 1L);
                            final double method24108 = class16.method137(n11 + 2L);
                            final double method24109 = class16.method137(n11 + 3L);
                            class16.method171(n12, method24106);
                            class16.method171(n12 + 1L, method24107);
                            class16.method171(n12 + 2L, method24108);
                            class16.method171(n12 + 3L, method24109);
                        }
                    }
                }
                else {
                    final double method24110 = class16.method137(n8 + 4L);
                    final double method24111 = class16.method137(n8 + 5L);
                    class16.method171(n9 + 2L, method24110);
                    class16.method171(n9 + 3L, method24111);
                }
                n8 = n9;
            }
        }
    }
    
    public static void method33181(final int n, final double[] array, final int n2, final int[] array2) {
        array2[1] = n;
        if (n > 1) {
            final int n3 = n >> 1;
            final double n4 = 0.7853981633974483 / n3;
            array[n2] = Class7640.method24103(n4 * n3);
            array[n2 + n3] = 0.5 * array[n2];
            for (int i = 1; i < n3; ++i) {
                final double n5 = n4 * i;
                array[n2 + i] = 0.5 * Class7640.method24103(n5);
                array[n2 + n - i] = 0.5 * Class7640.method24102(n5);
            }
        }
    }
    
    public static void method33182(final long n, final Class17 class17, final long n2, final Class15 class18) {
        class18.method167(1L, n);
        if (n > 1L) {
            final long n3 = n >> 1;
            final double n4 = 0.7853981633974483 / n3;
            class17.method171(n2, Class7640.method24103(n4 * n3));
            class17.method171(n2 + n3, 0.5 * class17.method137(n2));
            for (long n5 = 1L; n5 < n3; ++n5) {
                final double n6 = n4 * n5;
                class17.method171(n2 + n5, 0.5 * Class7640.method24103(n6));
                class17.method171(n2 + n - n5, 0.5 * Class7640.method24102(n6));
            }
        }
    }
    
    public static void method33183(final int n, final float[] array, final int n2, final int[] array2) {
        array2[1] = n;
        if (n > 1) {
            final int n3 = n >> 1;
            final float n4 = 0.7853982f / n3;
            array[n2] = (float)Class7640.method24103(n4 * n3);
            array[n2 + n3] = 0.5f * array[n2];
            for (int i = 1; i < n3; ++i) {
                final float n5 = n4 * i;
                array[n2 + i] = 0.5f * (float)Class7640.method24103(n5);
                array[n2 + n - i] = 0.5f * (float)Class7640.method24102(n5);
            }
        }
    }
    
    public static void method33184(final long n, final Class22 class22, final long n2, final Class15 class23) {
        class23.method167(1L, n);
        if (n > 1L) {
            final long n3 = n >> 1;
            final float n4 = 0.7853982f / n3;
            class22.method169(n2, (float)Class7640.method24103(n4 * n3));
            class22.method169(n2 + n3, 0.5f * class22.method135(n2));
            for (long n5 = 1L; n5 < n3; ++n5) {
                final float n6 = n4 * n5;
                class22.method169(n2 + n5, 0.5f * (float)Class7640.method24103(n6));
                class22.method169(n2 + n - n5, 0.5f * (float)Class7640.method24102(n6));
            }
        }
    }
    
    public static void method33185(final int n, final int[] array, final float[] array2) {
        array[0] = n;
        array[1] = 1;
        if (n > 2) {
            int i = n >> 1;
            final float n2 = 0.7853982f / i;
            final float n3 = n2 * 2.0f;
            final float n4 = (float)Class7640.method24103(n2 * i);
            array2[0] = 1.0f;
            array2[1] = n4;
            if (i != 4) {
                if (i > 4) {
                    method33177(n, array);
                    array2[2] = 0.5f / (float)Class7640.method24103(n3);
                    array2[3] = 0.5f / (float)Class7640.method24103(n2 * 6.0f);
                    for (int j = 4; j < i; j += 4) {
                        final float n5 = n2 * j;
                        final float n6 = 3.0f * n5;
                        array2[j] = (float)Class7640.method24103(n5);
                        array2[j + 1] = (float)Class7640.method24102(n5);
                        array2[j + 2] = (float)Class7640.method24103(n6);
                        array2[j + 3] = -(float)Class7640.method24102(n6);
                    }
                }
            }
            else {
                array2[2] = (float)Class7640.method24103(n3);
                array2[3] = (float)Class7640.method24102(n3);
            }
            int n7 = 0;
            while (i > 2) {
                final int n8 = n7 + i;
                i >>= 1;
                array2[n8] = 1.0f;
                array2[n8 + 1] = n4;
                if (i != 4) {
                    if (i > 4) {
                        final float n9 = array2[n7 + 4];
                        final float n10 = array2[n7 + 6];
                        array2[n8 + 2] = 0.5f / n9;
                        array2[n8 + 3] = 0.5f / n10;
                        for (int k = 4; k < i; k += 4) {
                            final int n11 = n7 + 2 * k;
                            final int n12 = n8 + k;
                            final float n13 = array2[n11];
                            final float n14 = array2[n11 + 1];
                            final float n15 = array2[n11 + 2];
                            final float n16 = array2[n11 + 3];
                            array2[n12] = n13;
                            array2[n12 + 1] = n14;
                            array2[n12 + 2] = n15;
                            array2[n12 + 3] = n16;
                        }
                    }
                }
                else {
                    final float n17 = array2[n7 + 4];
                    final float n18 = array2[n7 + 5];
                    array2[n8 + 2] = n17;
                    array2[n8 + 3] = n18;
                }
                n7 = n8;
            }
        }
    }
    
    public static void method33186(final long n, final Class15 class15, final Class22 class16) {
        class15.method167(0L, n);
        class15.method167(1L, 1L);
        if (n > 2L) {
            long n2 = n >> 1;
            final float n3 = 0.7853982f / n2;
            final float n4 = n3 * 2.0f;
            final float n5 = (float)Class7640.method24103(n3 * n2);
            class16.method169(0L, 1.0f);
            class16.method169(1L, n5);
            if (n2 != 4L) {
                if (n2 > 4L) {
                    method33178(n, class15);
                    class16.method169(2L, 0.5f / (float)Class7640.method24103(n4));
                    class16.method169(3L, 0.5f / (float)Class7640.method24103(n3 * 6.0f));
                    for (long n6 = 4L; n6 < n2; n6 += 4L) {
                        final float n7 = n3 * n6;
                        final float n8 = 3.0f * n7;
                        class16.method169(n6, (float)Class7640.method24103(n7));
                        class16.method169(n6 + 1L, (float)Class7640.method24102(n7));
                        class16.method169(n6 + 2L, (float)Class7640.method24103(n8));
                        class16.method169(n6 + 3L, -(float)Class7640.method24102(n8));
                    }
                }
            }
            else {
                class16.method169(2L, (float)Class7640.method24103(n4));
                class16.method169(3L, (float)Class7640.method24102(n4));
            }
            long n9 = 0L;
            while (n2 > 2L) {
                final long n10 = n9 + n2;
                n2 >>= 1;
                class16.method169(n10, 1.0f);
                class16.method169(n10 + 1L, n5);
                if (n2 != 4L) {
                    if (n2 > 4L) {
                        final float method135 = class16.method135(n9 + 4L);
                        final float method136 = class16.method135(n9 + 6L);
                        class16.method169(n10 + 2L, 0.5f / method135);
                        class16.method169(n10 + 3L, 0.5f / method136);
                        for (long n11 = 4L; n11 < n2; n11 += 4L) {
                            final long n12 = n9 + 2L * n11;
                            final long n13 = n10 + n11;
                            final float method137 = class16.method135(n12);
                            final float method138 = class16.method135(n12 + 1L);
                            final float method139 = class16.method135(n12 + 2L);
                            final float method140 = class16.method135(n12 + 3L);
                            class16.method169(n13, method137);
                            class16.method169(n13 + 1L, method138);
                            class16.method169(n13 + 2L, method139);
                            class16.method169(n13 + 3L, method140);
                        }
                    }
                }
                else {
                    final float method141 = class16.method135(n9 + 4L);
                    final float method142 = class16.method135(n9 + 5L);
                    class16.method169(n10 + 2L, method141);
                    class16.method169(n10 + 3L, method142);
                }
                n9 = n10;
            }
        }
    }
    
    public static void method33187(final int n, final double[] array, final int n2, final int[] array2, final int n3, final double[] array3) {
        if (n <= 8) {
            if (n != 8) {
                if (n == 4) {
                    method33235(array, n2);
                }
            }
            else {
                method33229(array, n2);
            }
        }
        else if (n <= 32) {
            if (n != 32) {
                method33225(array, n2, array3, 0);
                method33199(array, n2);
            }
            else {
                method33221(array, n2, array3, n3 - 8);
                method33195(array, n2);
            }
        }
        else {
            method33203(n, array, n2, array3, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33207(n, array, n2, n3, array3);
            }
            else if (n <= 512) {
                if (n <= 128) {
                    method33219(n, array, n2, n3, array3);
                }
                else {
                    method33213(n, 1, array, n2, n3, array3);
                }
            }
            else {
                method33209(n, array, n2, n3, array3);
            }
            method33191(n, array2, array, n2);
        }
    }
    
    public static void method33188(final long n, final Class17 class17, final long n2, final Class15 class18, final long n3, final Class17 class19) {
        if (n <= 8L) {
            if (n != 8L) {
                if (n == 4L) {
                    method33236(class17, n2);
                }
            }
            else {
                method33230(class17, n2);
            }
        }
        else if (n <= 32L) {
            if (n != 32L) {
                method33226(class17, n2, class19, 0L);
                method33200(class17, n2);
            }
            else {
                method33222(class17, n2, class19, n3 - 8L);
                method33196(class17, n2);
            }
        }
        else {
            method33204(n, class17, n2, class19, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33208(n, class17, n2, n3, class19);
            }
            else if (n <= 512L) {
                if (n <= 128L) {
                    method33220(n, class17, n2, n3, class19);
                }
                else {
                    method33214(n, 1L, class17, n2, n3, class19);
                }
            }
            else {
                method33210(n, class17, n2, n3, class19);
            }
            method33192(n, class18, class17, n2);
        }
    }
    
    public static void method33189(final int n, final double[] array, final int n2, final int[] array2, final int n3, final double[] array3) {
        if (n <= 8) {
            if (n != 8) {
                if (n == 4) {
                    method33235(array, n2);
                }
            }
            else {
                method33231(array, n2);
            }
        }
        else if (n <= 32) {
            if (n != 32) {
                method33225(array, n2, array3, 0);
                method33201(array, n2);
            }
            else {
                method33221(array, n2, array3, n3 - 8);
                method33197(array, n2);
            }
        }
        else {
            method33205(n, array, n2, array3, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33207(n, array, n2, n3, array3);
            }
            else if (n <= 512) {
                if (n <= 128) {
                    method33219(n, array, n2, n3, array3);
                }
                else {
                    method33213(n, 1, array, n2, n3, array3);
                }
            }
            else {
                method33209(n, array, n2, n3, array3);
            }
            method33193(n, array2, array, n2);
        }
    }
    
    public static void method33190(final long n, final Class17 class17, final long n2, final Class15 class18, final long n3, final Class17 class19) {
        if (n <= 8L) {
            if (n != 8L) {
                if (n == 4L) {
                    method33236(class17, n2);
                }
            }
            else {
                method33232(class17, n2);
            }
        }
        else if (n <= 32L) {
            if (n != 32L) {
                method33226(class17, n2, class19, 0L);
                method33202(class17, n2);
            }
            else {
                method33222(class17, n2, class19, n3 - 8L);
                method33198(class17, n2);
            }
        }
        else {
            method33206(n, class17, n2, class19, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33208(n, class17, n2, n3, class19);
            }
            else if (n <= 512L) {
                if (n <= 128L) {
                    method33220(n, class17, n2, n3, class19);
                }
                else {
                    method33214(n, 1L, class17, n2, n3, class19);
                }
            }
            else {
                method33210(n, class17, n2, n3, class19);
            }
            method33194(n, class18, class17, n2);
        }
    }
    
    public static void method33191(final int n, final int[] array, final double[] array2, final int n2) {
        int n3 = 1;
        int i;
        for (i = n >> 2; i > 8; i >>= 2) {
            n3 <<= 1;
        }
        final int n4 = n >> 1;
        final int n5 = 4 * n3;
        if (i != 8) {
            for (int j = 0; j < n3; ++j) {
                final int n6 = 4 * j;
                for (int k = 0; k < j; ++k) {
                    final int n7 = 4 * k + array[n3 + j];
                    final int n8 = n6 + array[n3 + k];
                    final int n9 = n2 + n7;
                    final int n10 = n2 + n8;
                    final double n11 = array2[n9];
                    final double n12 = array2[n9 + 1];
                    final double n13 = array2[n10];
                    final double n14 = array2[n10 + 1];
                    array2[n9] = n13;
                    array2[n9 + 1] = n14;
                    array2[n10] = n11;
                    array2[n10 + 1] = n12;
                    final int n15 = n7 + n5;
                    int n16 = n8 + n5;
                    final int n17 = n2 + n15;
                    final int n18 = n2 + n16;
                    final double n19 = array2[n17];
                    final double n20 = array2[n17 + 1];
                    final double n21 = array2[n18];
                    final double n22 = array2[n18 + 1];
                    array2[n17] = n21;
                    array2[n17 + 1] = n22;
                    array2[n18] = n19;
                    array2[n18 + 1] = n20;
                    final int n23 = n15 + n4;
                    n16 += 2;
                    final int n24 = n2 + n23;
                    final int n25 = n2 + n16;
                    final double n26 = array2[n24];
                    final double n27 = array2[n24 + 1];
                    final double n28 = array2[n25];
                    final double n29 = array2[n25 + 1];
                    array2[n24] = n28;
                    array2[n24 + 1] = n29;
                    array2[n25] = n26;
                    array2[n25 + 1] = n27;
                    int n30 = n23 - n5;
                    final int n31 = n16 - n5;
                    final int n32 = n2 + n30;
                    final int n33 = n2 + n31;
                    final double n34 = array2[n32];
                    final double n35 = array2[n32 + 1];
                    final double n36 = array2[n33];
                    final double n37 = array2[n33 + 1];
                    array2[n32] = n36;
                    array2[n32 + 1] = n37;
                    array2[n33] = n34;
                    array2[n33 + 1] = n35;
                    n30 += 2;
                    final int n38 = n31 + n4;
                    final int n39 = n2 + n30;
                    final int n40 = n2 + n38;
                    final double n41 = array2[n39];
                    final double n42 = array2[n39 + 1];
                    final double n43 = array2[n40];
                    final double n44 = array2[n40 + 1];
                    array2[n39] = n43;
                    array2[n39 + 1] = n44;
                    array2[n40] = n41;
                    array2[n40 + 1] = n42;
                    final int n45 = n30 + n5;
                    int n46 = n38 + n5;
                    final int n47 = n2 + n45;
                    final int n48 = n2 + n46;
                    final double n49 = array2[n47];
                    final double n50 = array2[n47 + 1];
                    final double n51 = array2[n48];
                    final double n52 = array2[n48 + 1];
                    array2[n47] = n51;
                    array2[n47 + 1] = n52;
                    array2[n48] = n49;
                    array2[n48 + 1] = n50;
                    final int n53 = n45 - n4;
                    n46 -= 2;
                    final int n54 = n2 + n53;
                    final int n55 = n2 + n46;
                    final double n56 = array2[n54];
                    final double n57 = array2[n54 + 1];
                    final double n58 = array2[n55];
                    final double n59 = array2[n55 + 1];
                    array2[n54] = n58;
                    array2[n54 + 1] = n59;
                    array2[n55] = n56;
                    array2[n55 + 1] = n57;
                    final int n60 = n53 - n5;
                    final int n61 = n46 - n5;
                    final int n62 = n2 + n60;
                    final int n63 = n2 + n61;
                    final double n64 = array2[n62];
                    final double n65 = array2[n62 + 1];
                    final double n66 = array2[n63];
                    final double n67 = array2[n63 + 1];
                    array2[n62] = n66;
                    array2[n62 + 1] = n67;
                    array2[n63] = n64;
                    array2[n63 + 1] = n65;
                }
                final int n68 = n6 + array[n3 + j];
                final int n69 = n68 + 2;
                final int n70 = n68 + n4;
                final int n71 = n2 + n69;
                final int n72 = n2 + n70;
                final double n73 = array2[n71];
                final double n74 = array2[n71 + 1];
                final double n75 = array2[n72];
                final double n76 = array2[n72 + 1];
                array2[n71] = n75;
                array2[n71 + 1] = n76;
                array2[n72] = n73;
                array2[n72 + 1] = n74;
                final int n77 = n69 + n5;
                final int n78 = n70 + n5;
                final int n79 = n2 + n77;
                final int n80 = n2 + n78;
                final double n81 = array2[n79];
                final double n82 = array2[n79 + 1];
                final double n83 = array2[n80];
                final double n84 = array2[n80 + 1];
                array2[n79] = n83;
                array2[n79 + 1] = n84;
                array2[n80] = n81;
                array2[n80 + 1] = n82;
            }
        }
        else {
            for (int l = 0; l < n3; ++l) {
                final int n85 = 4 * l;
                for (int n86 = 0; n86 < l; ++n86) {
                    final int n87 = 4 * n86 + 2 * array[n3 + l];
                    final int n88 = n85 + 2 * array[n3 + n86];
                    final int n89 = n2 + n87;
                    final int n90 = n2 + n88;
                    final double n91 = array2[n89];
                    final double n92 = array2[n89 + 1];
                    final double n93 = array2[n90];
                    final double n94 = array2[n90 + 1];
                    array2[n89] = n93;
                    array2[n89 + 1] = n94;
                    array2[n90] = n91;
                    array2[n90 + 1] = n92;
                    final int n95 = n87 + n5;
                    final int n96 = n88 + 2 * n5;
                    final int n97 = n2 + n95;
                    final int n98 = n2 + n96;
                    final double n99 = array2[n97];
                    final double n100 = array2[n97 + 1];
                    final double n101 = array2[n98];
                    final double n102 = array2[n98 + 1];
                    array2[n97] = n101;
                    array2[n97 + 1] = n102;
                    array2[n98] = n99;
                    array2[n98 + 1] = n100;
                    final int n103 = n95 + n5;
                    final int n104 = n96 - n5;
                    final int n105 = n2 + n103;
                    final int n106 = n2 + n104;
                    final double n107 = array2[n105];
                    final double n108 = array2[n105 + 1];
                    final double n109 = array2[n106];
                    final double n110 = array2[n106 + 1];
                    array2[n105] = n109;
                    array2[n105 + 1] = n110;
                    array2[n106] = n107;
                    array2[n106 + 1] = n108;
                    final int n111 = n103 + n5;
                    int n112 = n104 + 2 * n5;
                    final int n113 = n2 + n111;
                    final int n114 = n2 + n112;
                    final double n115 = array2[n113];
                    final double n116 = array2[n113 + 1];
                    final double n117 = array2[n114];
                    final double n118 = array2[n114 + 1];
                    array2[n113] = n117;
                    array2[n113 + 1] = n118;
                    array2[n114] = n115;
                    array2[n114 + 1] = n116;
                    final int n119 = n111 + n4;
                    n112 += 2;
                    final int n120 = n2 + n119;
                    final int n121 = n2 + n112;
                    final double n122 = array2[n120];
                    final double n123 = array2[n120 + 1];
                    final double n124 = array2[n121];
                    final double n125 = array2[n121 + 1];
                    array2[n120] = n124;
                    array2[n120 + 1] = n125;
                    array2[n121] = n122;
                    array2[n121 + 1] = n123;
                    final int n126 = n119 - n5;
                    final int n127 = n112 - 2 * n5;
                    final int n128 = n2 + n126;
                    final int n129 = n2 + n127;
                    final double n130 = array2[n128];
                    final double n131 = array2[n128 + 1];
                    final double n132 = array2[n129];
                    final double n133 = array2[n129 + 1];
                    array2[n128] = n132;
                    array2[n128 + 1] = n133;
                    array2[n129] = n130;
                    array2[n129 + 1] = n131;
                    final int n134 = n126 - n5;
                    final int n135 = n127 + n5;
                    final int n136 = n2 + n134;
                    final int n137 = n2 + n135;
                    final double n138 = array2[n136];
                    final double n139 = array2[n136 + 1];
                    final double n140 = array2[n137];
                    final double n141 = array2[n137 + 1];
                    array2[n136] = n140;
                    array2[n136 + 1] = n141;
                    array2[n137] = n138;
                    array2[n137 + 1] = n139;
                    int n142 = n134 - n5;
                    final int n143 = n135 - 2 * n5;
                    final int n144 = n2 + n142;
                    final int n145 = n2 + n143;
                    final double n146 = array2[n144];
                    final double n147 = array2[n144 + 1];
                    final double n148 = array2[n145];
                    final double n149 = array2[n145 + 1];
                    array2[n144] = n148;
                    array2[n144 + 1] = n149;
                    array2[n145] = n146;
                    array2[n145 + 1] = n147;
                    n142 += 2;
                    final int n150 = n143 + n4;
                    final int n151 = n2 + n142;
                    final int n152 = n2 + n150;
                    final double n153 = array2[n151];
                    final double n154 = array2[n151 + 1];
                    final double n155 = array2[n152];
                    final double n156 = array2[n152 + 1];
                    array2[n151] = n155;
                    array2[n151 + 1] = n156;
                    array2[n152] = n153;
                    array2[n152 + 1] = n154;
                    final int n157 = n142 + n5;
                    final int n158 = n150 + 2 * n5;
                    final int n159 = n2 + n157;
                    final int n160 = n2 + n158;
                    final double n161 = array2[n159];
                    final double n162 = array2[n159 + 1];
                    final double n163 = array2[n160];
                    final double n164 = array2[n160 + 1];
                    array2[n159] = n163;
                    array2[n159 + 1] = n164;
                    array2[n160] = n161;
                    array2[n160 + 1] = n162;
                    final int n165 = n157 + n5;
                    final int n166 = n158 - n5;
                    final int n167 = n2 + n165;
                    final int n168 = n2 + n166;
                    final double n169 = array2[n167];
                    final double n170 = array2[n167 + 1];
                    final double n171 = array2[n168];
                    final double n172 = array2[n168 + 1];
                    array2[n167] = n171;
                    array2[n167 + 1] = n172;
                    array2[n168] = n169;
                    array2[n168 + 1] = n170;
                    final int n173 = n165 + n5;
                    int n174 = n166 + 2 * n5;
                    final int n175 = n2 + n173;
                    final int n176 = n2 + n174;
                    final double n177 = array2[n175];
                    final double n178 = array2[n175 + 1];
                    final double n179 = array2[n176];
                    final double n180 = array2[n176 + 1];
                    array2[n175] = n179;
                    array2[n175 + 1] = n180;
                    array2[n176] = n177;
                    array2[n176 + 1] = n178;
                    final int n181 = n173 - n4;
                    n174 -= 2;
                    final int n182 = n2 + n181;
                    final int n183 = n2 + n174;
                    final double n184 = array2[n182];
                    final double n185 = array2[n182 + 1];
                    final double n186 = array2[n183];
                    final double n187 = array2[n183 + 1];
                    array2[n182] = n186;
                    array2[n182 + 1] = n187;
                    array2[n183] = n184;
                    array2[n183 + 1] = n185;
                    final int n188 = n181 - n5;
                    final int n189 = n174 - 2 * n5;
                    final int n190 = n2 + n188;
                    final int n191 = n2 + n189;
                    final double n192 = array2[n190];
                    final double n193 = array2[n190 + 1];
                    final double n194 = array2[n191];
                    final double n195 = array2[n191 + 1];
                    array2[n190] = n194;
                    array2[n190 + 1] = n195;
                    array2[n191] = n192;
                    array2[n191 + 1] = n193;
                    final int n196 = n188 - n5;
                    final int n197 = n189 + n5;
                    final int n198 = n2 + n196;
                    final int n199 = n2 + n197;
                    final double n200 = array2[n198];
                    final double n201 = array2[n198 + 1];
                    final double n202 = array2[n199];
                    final double n203 = array2[n199 + 1];
                    array2[n198] = n202;
                    array2[n198 + 1] = n203;
                    array2[n199] = n200;
                    array2[n199 + 1] = n201;
                    final int n204 = n196 - n5;
                    final int n205 = n197 - 2 * n5;
                    final int n206 = n2 + n204;
                    final int n207 = n2 + n205;
                    final double n208 = array2[n206];
                    final double n209 = array2[n206 + 1];
                    final double n210 = array2[n207];
                    final double n211 = array2[n207 + 1];
                    array2[n206] = n210;
                    array2[n206 + 1] = n211;
                    array2[n207] = n208;
                    array2[n207 + 1] = n209;
                }
                final int n212 = n85 + 2 * array[n3 + l];
                final int n213 = n212 + 2;
                final int n214 = n212 + n4;
                final int n215 = n2 + n213;
                final int n216 = n2 + n214;
                final double n217 = array2[n215];
                final double n218 = array2[n215 + 1];
                final double n219 = array2[n216];
                final double n220 = array2[n216 + 1];
                array2[n215] = n219;
                array2[n215 + 1] = n220;
                array2[n216] = n217;
                array2[n216 + 1] = n218;
                final int n221 = n213 + n5;
                final int n222 = n214 + 2 * n5;
                final int n223 = n2 + n221;
                final int n224 = n2 + n222;
                final double n225 = array2[n223];
                final double n226 = array2[n223 + 1];
                final double n227 = array2[n224];
                final double n228 = array2[n224 + 1];
                array2[n223] = n227;
                array2[n223 + 1] = n228;
                array2[n224] = n225;
                array2[n224 + 1] = n226;
                int n229 = n221 + n5;
                final int n230 = n222 - n5;
                final int n231 = n2 + n229;
                final int n232 = n2 + n230;
                final double n233 = array2[n231];
                final double n234 = array2[n231 + 1];
                final double n235 = array2[n232];
                final double n236 = array2[n232 + 1];
                array2[n231] = n235;
                array2[n231 + 1] = n236;
                array2[n232] = n233;
                array2[n232 + 1] = n234;
                n229 -= 2;
                final int n237 = n230 - n4;
                final int n238 = n2 + n229;
                final int n239 = n2 + n237;
                final double n240 = array2[n238];
                final double n241 = array2[n238 + 1];
                final double n242 = array2[n239];
                final double n243 = array2[n239 + 1];
                array2[n238] = n242;
                array2[n238 + 1] = n243;
                array2[n239] = n240;
                array2[n239 + 1] = n241;
                final int n244 = n229 + (n4 + 2);
                final int n245 = n237 + (n4 + 2);
                final int n246 = n2 + n244;
                final int n247 = n2 + n245;
                final double n248 = array2[n246];
                final double n249 = array2[n246 + 1];
                final double n250 = array2[n247];
                final double n251 = array2[n247 + 1];
                array2[n246] = n250;
                array2[n246 + 1] = n251;
                array2[n247] = n248;
                array2[n247 + 1] = n249;
                final int n252 = n244 - (n4 - n5);
                final int n253 = n245 + (2 * n5 - 2);
                final int n254 = n2 + n252;
                final int n255 = n2 + n253;
                final double n256 = array2[n254];
                final double n257 = array2[n254 + 1];
                final double n258 = array2[n255];
                final double n259 = array2[n255 + 1];
                array2[n254] = n258;
                array2[n254 + 1] = n259;
                array2[n255] = n256;
                array2[n255 + 1] = n257;
            }
        }
    }
    
    public static void method33192(final long n, final Class15 class15, final Class17 class16, final long n2) {
        long n3 = 1L;
        long n4;
        for (n4 = n >> 2; n4 > 8L; n4 >>= 2) {
            n3 <<= 1;
        }
        final long n5 = n >> 1;
        final long n6 = 4L * n3;
        if (n4 != 8L) {
            for (long n7 = 0L; n7 < n3; ++n7) {
                final long n8 = 4L * n7;
                for (long n9 = 0L; n9 < n7; ++n9) {
                    final long n10 = 4L * n9 + class15.method133(n3 + n7);
                    final long n11 = n8 + class15.method133(n3 + n9);
                    final long n12 = n2 + n10;
                    final long n13 = n2 + n11;
                    final double method137 = class16.method137(n12);
                    final double method138 = class16.method137(n12 + 1L);
                    final double method139 = class16.method137(n13);
                    final double method140 = class16.method137(n13 + 1L);
                    class16.method171(n12, method139);
                    class16.method171(n12 + 1L, method140);
                    class16.method171(n13, method137);
                    class16.method171(n13 + 1L, method138);
                    final long n14 = n10 + n6;
                    final long n15 = n11 + n6;
                    final long n16 = n2 + n14;
                    final long n17 = n2 + n15;
                    final double method141 = class16.method137(n16);
                    final double method142 = class16.method137(n16 + 1L);
                    final double method143 = class16.method137(n17);
                    final double method144 = class16.method137(n17 + 1L);
                    class16.method171(n16, method143);
                    class16.method171(n16 + 1L, method144);
                    class16.method171(n17, method141);
                    class16.method171(n17 + 1L, method142);
                    final long n18 = n14 + n5;
                    final long n19 = n15 + 2L;
                    final long n20 = n2 + n18;
                    final long n21 = n2 + n19;
                    final double method145 = class16.method137(n20);
                    final double method146 = class16.method137(n20 + 1L);
                    final double method147 = class16.method137(n21);
                    final double method148 = class16.method137(n21 + 1L);
                    class16.method171(n20, method147);
                    class16.method171(n20 + 1L, method148);
                    class16.method171(n21, method145);
                    class16.method171(n21 + 1L, method146);
                    final long n22 = n18 - n6;
                    final long n23 = n19 - n6;
                    final long n24 = n2 + n22;
                    final long n25 = n2 + n23;
                    final double method149 = class16.method137(n24);
                    final double method150 = class16.method137(n24 + 1L);
                    final double method151 = class16.method137(n25);
                    final double method152 = class16.method137(n25 + 1L);
                    class16.method171(n24, method151);
                    class16.method171(n24 + 1L, method152);
                    class16.method171(n25, method149);
                    class16.method171(n25 + 1L, method150);
                    final long n26 = n22 + 2L;
                    final long n27 = n23 + n5;
                    final long n28 = n2 + n26;
                    final long n29 = n2 + n27;
                    final double method153 = class16.method137(n28);
                    final double method154 = class16.method137(n28 + 1L);
                    final double method155 = class16.method137(n29);
                    final double method156 = class16.method137(n29 + 1L);
                    class16.method171(n28, method155);
                    class16.method171(n28 + 1L, method156);
                    class16.method171(n29, method153);
                    class16.method171(n29 + 1L, method154);
                    final long n30 = n26 + n6;
                    final long n31 = n27 + n6;
                    final long n32 = n2 + n30;
                    final long n33 = n2 + n31;
                    final double method157 = class16.method137(n32);
                    final double method158 = class16.method137(n32 + 1L);
                    final double method159 = class16.method137(n33);
                    final double method160 = class16.method137(n33 + 1L);
                    class16.method171(n32, method159);
                    class16.method171(n32 + 1L, method160);
                    class16.method171(n33, method157);
                    class16.method171(n33 + 1L, method158);
                    final long n34 = n30 - n5;
                    final long n35 = n31 - 2L;
                    final long n36 = n2 + n34;
                    final long n37 = n2 + n35;
                    final double method161 = class16.method137(n36);
                    final double method162 = class16.method137(n36 + 1L);
                    final double method163 = class16.method137(n37);
                    final double method164 = class16.method137(n37 + 1L);
                    class16.method171(n36, method163);
                    class16.method171(n36 + 1L, method164);
                    class16.method171(n37, method161);
                    class16.method171(n37 + 1L, method162);
                    final long n38 = n34 - n6;
                    final long n39 = n35 - n6;
                    final long n40 = n2 + n38;
                    final long n41 = n2 + n39;
                    final double method165 = class16.method137(n40);
                    final double method166 = class16.method137(n40 + 1L);
                    final double method167 = class16.method137(n41);
                    final double method168 = class16.method137(n41 + 1L);
                    class16.method171(n40, method167);
                    class16.method171(n40 + 1L, method168);
                    class16.method171(n41, method165);
                    class16.method171(n41 + 1L, method166);
                }
                final long n42 = n8 + class15.method133(n3 + n7);
                final long n43 = n42 + 2L;
                final long n44 = n42 + n5;
                final long n45 = n2 + n43;
                final long n46 = n2 + n44;
                final double method169 = class16.method137(n45);
                final double method170 = class16.method137(n45 + 1L);
                final double method171 = class16.method137(n46);
                final double method172 = class16.method137(n46 + 1L);
                class16.method171(n45, method171);
                class16.method171(n45 + 1L, method172);
                class16.method171(n46, method169);
                class16.method171(n46 + 1L, method170);
                final long n47 = n43 + n6;
                final long n48 = n44 + n6;
                final long n49 = n2 + n47;
                final long n50 = n2 + n48;
                final double method173 = class16.method137(n49);
                final double method174 = class16.method137(n49 + 1L);
                final double method175 = class16.method137(n50);
                final double method176 = class16.method137(n50 + 1L);
                class16.method171(n49, method175);
                class16.method171(n49 + 1L, method176);
                class16.method171(n50, method173);
                class16.method171(n50 + 1L, method174);
            }
        }
        else {
            for (long n51 = 0L; n51 < n3; ++n51) {
                final long n52 = 4L * n51;
                for (long n53 = 0L; n53 < n51; ++n53) {
                    final long n54 = 4L * n53 + 2L * class15.method133(n3 + n51);
                    final long n55 = n52 + 2L * class15.method133(n3 + n53);
                    final long n56 = n2 + n54;
                    final long n57 = n2 + n55;
                    final double method177 = class16.method137(n56);
                    final double method178 = class16.method137(n56 + 1L);
                    final double method179 = class16.method137(n57);
                    final double method180 = class16.method137(n57 + 1L);
                    class16.method171(n56, method179);
                    class16.method171(n56 + 1L, method180);
                    class16.method171(n57, method177);
                    class16.method171(n57 + 1L, method178);
                    final long n58 = n54 + n6;
                    final long n59 = n55 + 2L * n6;
                    final long n60 = n2 + n58;
                    final long n61 = n2 + n59;
                    final double method181 = class16.method137(n60);
                    final double method182 = class16.method137(n60 + 1L);
                    final double method183 = class16.method137(n61);
                    final double method184 = class16.method137(n61 + 1L);
                    class16.method171(n60, method183);
                    class16.method171(n60 + 1L, method184);
                    class16.method171(n61, method181);
                    class16.method171(n61 + 1L, method182);
                    final long n62 = n58 + n6;
                    final long n63 = n59 - n6;
                    final long n64 = n2 + n62;
                    final long n65 = n2 + n63;
                    final double method185 = class16.method137(n64);
                    final double method186 = class16.method137(n64 + 1L);
                    final double method187 = class16.method137(n65);
                    final double method188 = class16.method137(n65 + 1L);
                    class16.method171(n64, method187);
                    class16.method171(n64 + 1L, method188);
                    class16.method171(n65, method185);
                    class16.method171(n65 + 1L, method186);
                    final long n66 = n62 + n6;
                    final long n67 = n63 + 2L * n6;
                    final long n68 = n2 + n66;
                    final long n69 = n2 + n67;
                    final double method189 = class16.method137(n68);
                    final double method190 = class16.method137(n68 + 1L);
                    final double method191 = class16.method137(n69);
                    final double method192 = class16.method137(n69 + 1L);
                    class16.method171(n68, method191);
                    class16.method171(n68 + 1L, method192);
                    class16.method171(n69, method189);
                    class16.method171(n69 + 1L, method190);
                    final long n70 = n66 + n5;
                    final long n71 = n67 + 2L;
                    final long n72 = n2 + n70;
                    final long n73 = n2 + n71;
                    final double method193 = class16.method137(n72);
                    final double method194 = class16.method137(n72 + 1L);
                    final double method195 = class16.method137(n73);
                    final double method196 = class16.method137(n73 + 1L);
                    class16.method171(n72, method195);
                    class16.method171(n72 + 1L, method196);
                    class16.method171(n73, method193);
                    class16.method171(n73 + 1L, method194);
                    final long n74 = n70 - n6;
                    final long n75 = n71 - 2L * n6;
                    final long n76 = n2 + n74;
                    final long n77 = n2 + n75;
                    final double method197 = class16.method137(n76);
                    final double method198 = class16.method137(n76 + 1L);
                    final double method199 = class16.method137(n77);
                    final double method200 = class16.method137(n77 + 1L);
                    class16.method171(n76, method199);
                    class16.method171(n76 + 1L, method200);
                    class16.method171(n77, method197);
                    class16.method171(n77 + 1L, method198);
                    final long n78 = n74 - n6;
                    final long n79 = n75 + n6;
                    final long n80 = n2 + n78;
                    final long n81 = n2 + n79;
                    final double method201 = class16.method137(n80);
                    final double method202 = class16.method137(n80 + 1L);
                    final double method203 = class16.method137(n81);
                    final double method204 = class16.method137(n81 + 1L);
                    class16.method171(n80, method203);
                    class16.method171(n80 + 1L, method204);
                    class16.method171(n81, method201);
                    class16.method171(n81 + 1L, method202);
                    final long n82 = n78 - n6;
                    final long n83 = n79 - 2L * n6;
                    final long n84 = n2 + n82;
                    final long n85 = n2 + n83;
                    final double method205 = class16.method137(n84);
                    final double method206 = class16.method137(n84 + 1L);
                    final double method207 = class16.method137(n85);
                    final double method208 = class16.method137(n85 + 1L);
                    class16.method171(n84, method207);
                    class16.method171(n84 + 1L, method208);
                    class16.method171(n85, method205);
                    class16.method171(n85 + 1L, method206);
                    final long n86 = n82 + 2L;
                    final long n87 = n83 + n5;
                    final long n88 = n2 + n86;
                    final long n89 = n2 + n87;
                    final double method209 = class16.method137(n88);
                    final double method210 = class16.method137(n88 + 1L);
                    final double method211 = class16.method137(n89);
                    final double method212 = class16.method137(n89 + 1L);
                    class16.method171(n88, method211);
                    class16.method171(n88 + 1L, method212);
                    class16.method171(n89, method209);
                    class16.method171(n89 + 1L, method210);
                    final long n90 = n86 + n6;
                    final long n91 = n87 + 2L * n6;
                    final long n92 = n2 + n90;
                    final long n93 = n2 + n91;
                    final double method213 = class16.method137(n92);
                    final double method214 = class16.method137(n92 + 1L);
                    final double method215 = class16.method137(n93);
                    final double method216 = class16.method137(n93 + 1L);
                    class16.method171(n92, method215);
                    class16.method171(n92 + 1L, method216);
                    class16.method171(n93, method213);
                    class16.method171(n93 + 1L, method214);
                    final long n94 = n90 + n6;
                    final long n95 = n91 - n6;
                    final long n96 = n2 + n94;
                    final long n97 = n2 + n95;
                    final double method217 = class16.method137(n96);
                    final double method218 = class16.method137(n96 + 1L);
                    final double method219 = class16.method137(n97);
                    final double method220 = class16.method137(n97 + 1L);
                    class16.method171(n96, method219);
                    class16.method171(n96 + 1L, method220);
                    class16.method171(n97, method217);
                    class16.method171(n97 + 1L, method218);
                    final long n98 = n94 + n6;
                    final long n99 = n95 + 2L * n6;
                    final long n100 = n2 + n98;
                    final long n101 = n2 + n99;
                    final double method221 = class16.method137(n100);
                    final double method222 = class16.method137(n100 + 1L);
                    final double method223 = class16.method137(n101);
                    final double method224 = class16.method137(n101 + 1L);
                    class16.method171(n100, method223);
                    class16.method171(n100 + 1L, method224);
                    class16.method171(n101, method221);
                    class16.method171(n101 + 1L, method222);
                    final long n102 = n98 - n5;
                    final long n103 = n99 - 2L;
                    final long n104 = n2 + n102;
                    final long n105 = n2 + n103;
                    final double method225 = class16.method137(n104);
                    final double method226 = class16.method137(n104 + 1L);
                    final double method227 = class16.method137(n105);
                    final double method228 = class16.method137(n105 + 1L);
                    class16.method171(n104, method227);
                    class16.method171(n104 + 1L, method228);
                    class16.method171(n105, method225);
                    class16.method171(n105 + 1L, method226);
                    final long n106 = n102 - n6;
                    final long n107 = n103 - 2L * n6;
                    final long n108 = n2 + n106;
                    final long n109 = n2 + n107;
                    final double method229 = class16.method137(n108);
                    final double method230 = class16.method137(n108 + 1L);
                    final double method231 = class16.method137(n109);
                    final double method232 = class16.method137(n109 + 1L);
                    class16.method171(n108, method231);
                    class16.method171(n108 + 1L, method232);
                    class16.method171(n109, method229);
                    class16.method171(n109 + 1L, method230);
                    final long n110 = n106 - n6;
                    final long n111 = n107 + n6;
                    final long n112 = n2 + n110;
                    final long n113 = n2 + n111;
                    final double method233 = class16.method137(n112);
                    final double method234 = class16.method137(n112 + 1L);
                    final double method235 = class16.method137(n113);
                    final double method236 = class16.method137(n113 + 1L);
                    class16.method171(n112, method235);
                    class16.method171(n112 + 1L, method236);
                    class16.method171(n113, method233);
                    class16.method171(n113 + 1L, method234);
                    final long n114 = n110 - n6;
                    final long n115 = n111 - 2L * n6;
                    final long n116 = n2 + n114;
                    final long n117 = n2 + n115;
                    final double method237 = class16.method137(n116);
                    final double method238 = class16.method137(n116 + 1L);
                    final double method239 = class16.method137(n117);
                    final double method240 = class16.method137(n117 + 1L);
                    class16.method171(n116, method239);
                    class16.method171(n116 + 1L, method240);
                    class16.method171(n117, method237);
                    class16.method171(n117 + 1L, method238);
                }
                final long n118 = n52 + 2L * class15.method133(n3 + n51);
                final long n119 = n118 + 2L;
                final long n120 = n118 + n5;
                final long n121 = n2 + n119;
                final long n122 = n2 + n120;
                final double method241 = class16.method137(n121);
                final double method242 = class16.method137(n121 + 1L);
                final double method243 = class16.method137(n122);
                final double method244 = class16.method137(n122 + 1L);
                class16.method171(n121, method243);
                class16.method171(n121 + 1L, method244);
                class16.method171(n122, method241);
                class16.method171(n122 + 1L, method242);
                final long n123 = n119 + n6;
                final long n124 = n120 + 2L * n6;
                final long n125 = n2 + n123;
                final long n126 = n2 + n124;
                final double method245 = class16.method137(n125);
                final double method246 = class16.method137(n125 + 1L);
                final double method247 = class16.method137(n126);
                final double method248 = class16.method137(n126 + 1L);
                class16.method171(n125, method247);
                class16.method171(n125 + 1L, method248);
                class16.method171(n126, method245);
                class16.method171(n126 + 1L, method246);
                final long n127 = n123 + n6;
                final long n128 = n124 - n6;
                final long n129 = n2 + n127;
                final long n130 = n2 + n128;
                final double method249 = class16.method137(n129);
                final double method250 = class16.method137(n129 + 1L);
                final double method251 = class16.method137(n130);
                final double method252 = class16.method137(n130 + 1L);
                class16.method171(n129, method251);
                class16.method171(n129 + 1L, method252);
                class16.method171(n130, method249);
                class16.method171(n130 + 1L, method250);
                final long n131 = n127 - 2L;
                final long n132 = n128 - n5;
                final long n133 = n2 + n131;
                final long n134 = n2 + n132;
                final double method253 = class16.method137(n133);
                final double method254 = class16.method137(n133 + 1L);
                final double method255 = class16.method137(n134);
                final double method256 = class16.method137(n134 + 1L);
                class16.method171(n133, method255);
                class16.method171(n133 + 1L, method256);
                class16.method171(n134, method253);
                class16.method171(n134 + 1L, method254);
                final long n135 = n131 + (n5 + 2L);
                final long n136 = n132 + (n5 + 2L);
                final long n137 = n2 + n135;
                final long n138 = n2 + n136;
                final double method257 = class16.method137(n137);
                final double method258 = class16.method137(n137 + 1L);
                final double method259 = class16.method137(n138);
                final double method260 = class16.method137(n138 + 1L);
                class16.method171(n137, method259);
                class16.method171(n137 + 1L, method260);
                class16.method171(n138, method257);
                class16.method171(n138 + 1L, method258);
                final long n139 = n135 - (n5 - n6);
                final long n140 = n136 + (2L * n6 - 2L);
                final long n141 = n2 + n139;
                final long n142 = n2 + n140;
                final double method261 = class16.method137(n141);
                final double method262 = class16.method137(n141 + 1L);
                final double method263 = class16.method137(n142);
                final double method264 = class16.method137(n142 + 1L);
                class16.method171(n141, method263);
                class16.method171(n141 + 1L, method264);
                class16.method171(n142, method261);
                class16.method171(n142 + 1L, method262);
            }
        }
    }
    
    public static void method33193(final int n, final int[] array, final double[] array2, final int n2) {
        int n3 = 1;
        int i;
        for (i = n >> 2; i > 8; i >>= 2) {
            n3 <<= 1;
        }
        final int n4 = n >> 1;
        final int n5 = 4 * n3;
        if (i != 8) {
            for (int j = 0; j < n3; ++j) {
                final int n6 = 4 * j;
                for (int k = 0; k < j; ++k) {
                    final int n7 = 4 * k + array[n3 + j];
                    final int n8 = n6 + array[n3 + k];
                    final int n9 = n2 + n7;
                    final int n10 = n2 + n8;
                    final double n11 = array2[n9];
                    final double n12 = -array2[n9 + 1];
                    final double n13 = array2[n10];
                    final double n14 = -array2[n10 + 1];
                    array2[n9] = n13;
                    array2[n9 + 1] = n14;
                    array2[n10] = n11;
                    array2[n10 + 1] = n12;
                    final int n15 = n7 + n5;
                    int n16 = n8 + n5;
                    final int n17 = n2 + n15;
                    final int n18 = n2 + n16;
                    final double n19 = array2[n17];
                    final double n20 = -array2[n17 + 1];
                    final double n21 = array2[n18];
                    final double n22 = -array2[n18 + 1];
                    array2[n17] = n21;
                    array2[n17 + 1] = n22;
                    array2[n18] = n19;
                    array2[n18 + 1] = n20;
                    final int n23 = n15 + n4;
                    n16 += 2;
                    final int n24 = n2 + n23;
                    final int n25 = n2 + n16;
                    final double n26 = array2[n24];
                    final double n27 = -array2[n24 + 1];
                    final double n28 = array2[n25];
                    final double n29 = -array2[n25 + 1];
                    array2[n24] = n28;
                    array2[n24 + 1] = n29;
                    array2[n25] = n26;
                    array2[n25 + 1] = n27;
                    int n30 = n23 - n5;
                    final int n31 = n16 - n5;
                    final int n32 = n2 + n30;
                    final int n33 = n2 + n31;
                    final double n34 = array2[n32];
                    final double n35 = -array2[n32 + 1];
                    final double n36 = array2[n33];
                    final double n37 = -array2[n33 + 1];
                    array2[n32] = n36;
                    array2[n32 + 1] = n37;
                    array2[n33] = n34;
                    array2[n33 + 1] = n35;
                    n30 += 2;
                    final int n38 = n31 + n4;
                    final int n39 = n2 + n30;
                    final int n40 = n2 + n38;
                    final double n41 = array2[n39];
                    final double n42 = -array2[n39 + 1];
                    final double n43 = array2[n40];
                    final double n44 = -array2[n40 + 1];
                    array2[n39] = n43;
                    array2[n39 + 1] = n44;
                    array2[n40] = n41;
                    array2[n40 + 1] = n42;
                    final int n45 = n30 + n5;
                    int n46 = n38 + n5;
                    final int n47 = n2 + n45;
                    final int n48 = n2 + n46;
                    final double n49 = array2[n47];
                    final double n50 = -array2[n47 + 1];
                    final double n51 = array2[n48];
                    final double n52 = -array2[n48 + 1];
                    array2[n47] = n51;
                    array2[n47 + 1] = n52;
                    array2[n48] = n49;
                    array2[n48 + 1] = n50;
                    final int n53 = n45 - n4;
                    n46 -= 2;
                    final int n54 = n2 + n53;
                    final int n55 = n2 + n46;
                    final double n56 = array2[n54];
                    final double n57 = -array2[n54 + 1];
                    final double n58 = array2[n55];
                    final double n59 = -array2[n55 + 1];
                    array2[n54] = n58;
                    array2[n54 + 1] = n59;
                    array2[n55] = n56;
                    array2[n55 + 1] = n57;
                    final int n60 = n53 - n5;
                    final int n61 = n46 - n5;
                    final int n62 = n2 + n60;
                    final int n63 = n2 + n61;
                    final double n64 = array2[n62];
                    final double n65 = -array2[n62 + 1];
                    final double n66 = array2[n63];
                    final double n67 = -array2[n63 + 1];
                    array2[n62] = n66;
                    array2[n62 + 1] = n67;
                    array2[n63] = n64;
                    array2[n63 + 1] = n65;
                }
                final int n68 = n6 + array[n3 + j];
                final int n69 = n68 + 2;
                final int n70 = n68 + n4;
                final int n71 = n2 + n69;
                final int n72 = n2 + n70;
                array2[n71 - 1] = -array2[n71 - 1];
                final double n73 = array2[n71];
                final double n74 = -array2[n71 + 1];
                final double n75 = array2[n72];
                final double n76 = -array2[n72 + 1];
                array2[n71] = n75;
                array2[n71 + 1] = n76;
                array2[n72] = n73;
                array2[n72 + 1] = n74;
                array2[n72 + 3] = -array2[n72 + 3];
                final int n77 = n69 + n5;
                final int n78 = n70 + n5;
                final int n79 = n2 + n77;
                final int n80 = n2 + n78;
                array2[n79 - 1] = -array2[n79 - 1];
                final double n81 = array2[n79];
                final double n82 = -array2[n79 + 1];
                final double n83 = array2[n80];
                final double n84 = -array2[n80 + 1];
                array2[n79] = n83;
                array2[n79 + 1] = n84;
                array2[n80] = n81;
                array2[n80 + 1] = n82;
                array2[n80 + 3] = -array2[n80 + 3];
            }
        }
        else {
            for (int l = 0; l < n3; ++l) {
                final int n85 = 4 * l;
                for (int n86 = 0; n86 < l; ++n86) {
                    final int n87 = 4 * n86 + 2 * array[n3 + l];
                    final int n88 = n85 + 2 * array[n3 + n86];
                    final int n89 = n2 + n87;
                    final int n90 = n2 + n88;
                    final double n91 = array2[n89];
                    final double n92 = -array2[n89 + 1];
                    final double n93 = array2[n90];
                    final double n94 = -array2[n90 + 1];
                    array2[n89] = n93;
                    array2[n89 + 1] = n94;
                    array2[n90] = n91;
                    array2[n90 + 1] = n92;
                    final int n95 = n87 + n5;
                    final int n96 = n88 + 2 * n5;
                    final int n97 = n2 + n95;
                    final int n98 = n2 + n96;
                    final double n99 = array2[n97];
                    final double n100 = -array2[n97 + 1];
                    final double n101 = array2[n98];
                    final double n102 = -array2[n98 + 1];
                    array2[n97] = n101;
                    array2[n97 + 1] = n102;
                    array2[n98] = n99;
                    array2[n98 + 1] = n100;
                    final int n103 = n95 + n5;
                    final int n104 = n96 - n5;
                    final int n105 = n2 + n103;
                    final int n106 = n2 + n104;
                    final double n107 = array2[n105];
                    final double n108 = -array2[n105 + 1];
                    final double n109 = array2[n106];
                    final double n110 = -array2[n106 + 1];
                    array2[n105] = n109;
                    array2[n105 + 1] = n110;
                    array2[n106] = n107;
                    array2[n106 + 1] = n108;
                    final int n111 = n103 + n5;
                    int n112 = n104 + 2 * n5;
                    final int n113 = n2 + n111;
                    final int n114 = n2 + n112;
                    final double n115 = array2[n113];
                    final double n116 = -array2[n113 + 1];
                    final double n117 = array2[n114];
                    final double n118 = -array2[n114 + 1];
                    array2[n113] = n117;
                    array2[n113 + 1] = n118;
                    array2[n114] = n115;
                    array2[n114 + 1] = n116;
                    final int n119 = n111 + n4;
                    n112 += 2;
                    final int n120 = n2 + n119;
                    final int n121 = n2 + n112;
                    final double n122 = array2[n120];
                    final double n123 = -array2[n120 + 1];
                    final double n124 = array2[n121];
                    final double n125 = -array2[n121 + 1];
                    array2[n120] = n124;
                    array2[n120 + 1] = n125;
                    array2[n121] = n122;
                    array2[n121 + 1] = n123;
                    final int n126 = n119 - n5;
                    final int n127 = n112 - 2 * n5;
                    final int n128 = n2 + n126;
                    final int n129 = n2 + n127;
                    final double n130 = array2[n128];
                    final double n131 = -array2[n128 + 1];
                    final double n132 = array2[n129];
                    final double n133 = -array2[n129 + 1];
                    array2[n128] = n132;
                    array2[n128 + 1] = n133;
                    array2[n129] = n130;
                    array2[n129 + 1] = n131;
                    final int n134 = n126 - n5;
                    final int n135 = n127 + n5;
                    final int n136 = n2 + n134;
                    final int n137 = n2 + n135;
                    final double n138 = array2[n136];
                    final double n139 = -array2[n136 + 1];
                    final double n140 = array2[n137];
                    final double n141 = -array2[n137 + 1];
                    array2[n136] = n140;
                    array2[n136 + 1] = n141;
                    array2[n137] = n138;
                    array2[n137 + 1] = n139;
                    int n142 = n134 - n5;
                    final int n143 = n135 - 2 * n5;
                    final int n144 = n2 + n142;
                    final int n145 = n2 + n143;
                    final double n146 = array2[n144];
                    final double n147 = -array2[n144 + 1];
                    final double n148 = array2[n145];
                    final double n149 = -array2[n145 + 1];
                    array2[n144] = n148;
                    array2[n144 + 1] = n149;
                    array2[n145] = n146;
                    array2[n145 + 1] = n147;
                    n142 += 2;
                    final int n150 = n143 + n4;
                    final int n151 = n2 + n142;
                    final int n152 = n2 + n150;
                    final double n153 = array2[n151];
                    final double n154 = -array2[n151 + 1];
                    final double n155 = array2[n152];
                    final double n156 = -array2[n152 + 1];
                    array2[n151] = n155;
                    array2[n151 + 1] = n156;
                    array2[n152] = n153;
                    array2[n152 + 1] = n154;
                    final int n157 = n142 + n5;
                    final int n158 = n150 + 2 * n5;
                    final int n159 = n2 + n157;
                    final int n160 = n2 + n158;
                    final double n161 = array2[n159];
                    final double n162 = -array2[n159 + 1];
                    final double n163 = array2[n160];
                    final double n164 = -array2[n160 + 1];
                    array2[n159] = n163;
                    array2[n159 + 1] = n164;
                    array2[n160] = n161;
                    array2[n160 + 1] = n162;
                    final int n165 = n157 + n5;
                    final int n166 = n158 - n5;
                    final int n167 = n2 + n165;
                    final int n168 = n2 + n166;
                    final double n169 = array2[n167];
                    final double n170 = -array2[n167 + 1];
                    final double n171 = array2[n168];
                    final double n172 = -array2[n168 + 1];
                    array2[n167] = n171;
                    array2[n167 + 1] = n172;
                    array2[n168] = n169;
                    array2[n168 + 1] = n170;
                    final int n173 = n165 + n5;
                    int n174 = n166 + 2 * n5;
                    final int n175 = n2 + n173;
                    final int n176 = n2 + n174;
                    final double n177 = array2[n175];
                    final double n178 = -array2[n175 + 1];
                    final double n179 = array2[n176];
                    final double n180 = -array2[n176 + 1];
                    array2[n175] = n179;
                    array2[n175 + 1] = n180;
                    array2[n176] = n177;
                    array2[n176 + 1] = n178;
                    final int n181 = n173 - n4;
                    n174 -= 2;
                    final int n182 = n2 + n181;
                    final int n183 = n2 + n174;
                    final double n184 = array2[n182];
                    final double n185 = -array2[n182 + 1];
                    final double n186 = array2[n183];
                    final double n187 = -array2[n183 + 1];
                    array2[n182] = n186;
                    array2[n182 + 1] = n187;
                    array2[n183] = n184;
                    array2[n183 + 1] = n185;
                    final int n188 = n181 - n5;
                    final int n189 = n174 - 2 * n5;
                    final int n190 = n2 + n188;
                    final int n191 = n2 + n189;
                    final double n192 = array2[n190];
                    final double n193 = -array2[n190 + 1];
                    final double n194 = array2[n191];
                    final double n195 = -array2[n191 + 1];
                    array2[n190] = n194;
                    array2[n190 + 1] = n195;
                    array2[n191] = n192;
                    array2[n191 + 1] = n193;
                    final int n196 = n188 - n5;
                    final int n197 = n189 + n5;
                    final int n198 = n2 + n196;
                    final int n199 = n2 + n197;
                    final double n200 = array2[n198];
                    final double n201 = -array2[n198 + 1];
                    final double n202 = array2[n199];
                    final double n203 = -array2[n199 + 1];
                    array2[n198] = n202;
                    array2[n198 + 1] = n203;
                    array2[n199] = n200;
                    array2[n199 + 1] = n201;
                    final int n204 = n196 - n5;
                    final int n205 = n197 - 2 * n5;
                    final int n206 = n2 + n204;
                    final int n207 = n2 + n205;
                    final double n208 = array2[n206];
                    final double n209 = -array2[n206 + 1];
                    final double n210 = array2[n207];
                    final double n211 = -array2[n207 + 1];
                    array2[n206] = n210;
                    array2[n206 + 1] = n211;
                    array2[n207] = n208;
                    array2[n207 + 1] = n209;
                }
                final int n212 = n85 + 2 * array[n3 + l];
                final int n213 = n212 + 2;
                final int n214 = n212 + n4;
                final int n215 = n2 + n213;
                final int n216 = n2 + n214;
                array2[n215 - 1] = -array2[n215 - 1];
                final double n217 = array2[n215];
                final double n218 = -array2[n215 + 1];
                final double n219 = array2[n216];
                final double n220 = -array2[n216 + 1];
                array2[n215] = n219;
                array2[n215 + 1] = n220;
                array2[n216] = n217;
                array2[n216 + 1] = n218;
                array2[n216 + 3] = -array2[n216 + 3];
                final int n221 = n213 + n5;
                final int n222 = n214 + 2 * n5;
                final int n223 = n2 + n221;
                final int n224 = n2 + n222;
                final double n225 = array2[n223];
                final double n226 = -array2[n223 + 1];
                final double n227 = array2[n224];
                final double n228 = -array2[n224 + 1];
                array2[n223] = n227;
                array2[n223 + 1] = n228;
                array2[n224] = n225;
                array2[n224 + 1] = n226;
                int n229 = n221 + n5;
                final int n230 = n222 - n5;
                final int n231 = n2 + n229;
                final int n232 = n2 + n230;
                final double n233 = array2[n231];
                final double n234 = -array2[n231 + 1];
                final double n235 = array2[n232];
                final double n236 = -array2[n232 + 1];
                array2[n231] = n235;
                array2[n231 + 1] = n236;
                array2[n232] = n233;
                array2[n232 + 1] = n234;
                n229 -= 2;
                final int n237 = n230 - n4;
                final int n238 = n2 + n229;
                final int n239 = n2 + n237;
                final double n240 = array2[n238];
                final double n241 = -array2[n238 + 1];
                final double n242 = array2[n239];
                final double n243 = -array2[n239 + 1];
                array2[n238] = n242;
                array2[n238 + 1] = n243;
                array2[n239] = n240;
                array2[n239 + 1] = n241;
                final int n244 = n229 + (n4 + 2);
                final int n245 = n237 + (n4 + 2);
                final int n246 = n2 + n244;
                final int n247 = n2 + n245;
                final double n248 = array2[n246];
                final double n249 = -array2[n246 + 1];
                final double n250 = array2[n247];
                final double n251 = -array2[n247 + 1];
                array2[n246] = n250;
                array2[n246 + 1] = n251;
                array2[n247] = n248;
                array2[n247 + 1] = n249;
                final int n252 = n244 - (n4 - n5);
                final int n253 = n245 + (2 * n5 - 2);
                final int n254 = n2 + n252;
                final int n255 = n2 + n253;
                array2[n254 - 1] = -array2[n254 - 1];
                final double n256 = array2[n254];
                final double n257 = -array2[n254 + 1];
                final double n258 = array2[n255];
                final double n259 = -array2[n255 + 1];
                array2[n254] = n258;
                array2[n254 + 1] = n259;
                array2[n255] = n256;
                array2[n255 + 1] = n257;
                array2[n255 + 3] = -array2[n255 + 3];
            }
        }
    }
    
    public static void method33194(final long n, final Class15 class15, final Class17 class16, final long n2) {
        long n3 = 1L;
        long n4;
        for (n4 = n >> 2; n4 > 8L; n4 >>= 2) {
            n3 <<= 1;
        }
        final long n5 = n >> 1;
        final long n6 = 4L * n3;
        if (n4 != 8L) {
            for (int n7 = 0; n7 < n3; ++n7) {
                final long n8 = 4L * n7;
                for (int i = 0; i < n7; ++i) {
                    final long n9 = 4L * i + class15.method133(n3 + n7);
                    final long n10 = n8 + class15.method133(n3 + i);
                    final long n11 = n2 + n9;
                    final long n12 = n2 + n10;
                    final double method137 = class16.method137(n11);
                    final double n13 = -class16.method137(n11 + 1L);
                    final double method138 = class16.method137(n12);
                    final double n14 = -class16.method137(n12 + 1L);
                    class16.method171(n11, method138);
                    class16.method171(n11 + 1L, n14);
                    class16.method171(n12, method137);
                    class16.method171(n12 + 1L, n13);
                    final long n15 = n9 + n6;
                    final long n16 = n10 + n6;
                    final long n17 = n2 + n15;
                    final long n18 = n2 + n16;
                    final double method139 = class16.method137(n17);
                    final double n19 = -class16.method137(n17 + 1L);
                    final double method140 = class16.method137(n18);
                    final double n20 = -class16.method137(n18 + 1L);
                    class16.method171(n17, method140);
                    class16.method171(n17 + 1L, n20);
                    class16.method171(n18, method139);
                    class16.method171(n18 + 1L, n19);
                    final long n21 = n15 + n5;
                    final long n22 = n16 + 2L;
                    final long n23 = n2 + n21;
                    final long n24 = n2 + n22;
                    final double method141 = class16.method137(n23);
                    final double n25 = -class16.method137(n23 + 1L);
                    final double method142 = class16.method137(n24);
                    final double n26 = -class16.method137(n24 + 1L);
                    class16.method171(n23, method142);
                    class16.method171(n23 + 1L, n26);
                    class16.method171(n24, method141);
                    class16.method171(n24 + 1L, n25);
                    final long n27 = n21 - n6;
                    final long n28 = n22 - n6;
                    final long n29 = n2 + n27;
                    final long n30 = n2 + n28;
                    final double method143 = class16.method137(n29);
                    final double n31 = -class16.method137(n29 + 1L);
                    final double method144 = class16.method137(n30);
                    final double n32 = -class16.method137(n30 + 1L);
                    class16.method171(n29, method144);
                    class16.method171(n29 + 1L, n32);
                    class16.method171(n30, method143);
                    class16.method171(n30 + 1L, n31);
                    final long n33 = n27 + 2L;
                    final long n34 = n28 + n5;
                    final long n35 = n2 + n33;
                    final long n36 = n2 + n34;
                    final double method145 = class16.method137(n35);
                    final double n37 = -class16.method137(n35 + 1L);
                    final double method146 = class16.method137(n36);
                    final double n38 = -class16.method137(n36 + 1L);
                    class16.method171(n35, method146);
                    class16.method171(n35 + 1L, n38);
                    class16.method171(n36, method145);
                    class16.method171(n36 + 1L, n37);
                    final long n39 = n33 + n6;
                    final long n40 = n34 + n6;
                    final long n41 = n2 + n39;
                    final long n42 = n2 + n40;
                    final double method147 = class16.method137(n41);
                    final double n43 = -class16.method137(n41 + 1L);
                    final double method148 = class16.method137(n42);
                    final double n44 = -class16.method137(n42 + 1L);
                    class16.method171(n41, method148);
                    class16.method171(n41 + 1L, n44);
                    class16.method171(n42, method147);
                    class16.method171(n42 + 1L, n43);
                    final long n45 = n39 - n5;
                    final long n46 = n40 - 2L;
                    final long n47 = n2 + n45;
                    final long n48 = n2 + n46;
                    final double method149 = class16.method137(n47);
                    final double n49 = -class16.method137(n47 + 1L);
                    final double method150 = class16.method137(n48);
                    final double n50 = -class16.method137(n48 + 1L);
                    class16.method171(n47, method150);
                    class16.method171(n47 + 1L, n50);
                    class16.method171(n48, method149);
                    class16.method171(n48 + 1L, n49);
                    final long n51 = n45 - n6;
                    final long n52 = n46 - n6;
                    final long n53 = n2 + n51;
                    final long n54 = n2 + n52;
                    final double method151 = class16.method137(n53);
                    final double n55 = -class16.method137(n53 + 1L);
                    final double method152 = class16.method137(n54);
                    final double n56 = -class16.method137(n54 + 1L);
                    class16.method171(n53, method152);
                    class16.method171(n53 + 1L, n56);
                    class16.method171(n54, method151);
                    class16.method171(n54 + 1L, n55);
                }
                final long n57 = n8 + class15.method133(n3 + n7);
                final long n58 = n57 + 2L;
                final long n59 = n57 + n5;
                final long n60 = n2 + n58;
                final long n61 = n2 + n59;
                class16.method171(n60 - 1L, -class16.method137(n60 - 1L));
                final double method153 = class16.method137(n60);
                final double n62 = -class16.method137(n60 + 1L);
                final double method154 = class16.method137(n61);
                final double n63 = -class16.method137(n61 + 1L);
                class16.method171(n60, method154);
                class16.method171(n60 + 1L, n63);
                class16.method171(n61, method153);
                class16.method171(n61 + 1L, n62);
                class16.method171(n61 + 3L, -class16.method137(n61 + 3L));
                final long n64 = n58 + n6;
                final long n65 = n59 + n6;
                final long n66 = n2 + n64;
                final long n67 = n2 + n65;
                class16.method171(n66 - 1L, -class16.method137(n66 - 1L));
                final double method155 = class16.method137(n66);
                final double n68 = -class16.method137(n66 + 1L);
                final double method156 = class16.method137(n67);
                final double n69 = -class16.method137(n67 + 1L);
                class16.method171(n66, method156);
                class16.method171(n66 + 1L, n69);
                class16.method171(n67, method155);
                class16.method171(n67 + 1L, n68);
                class16.method171(n67 + 3L, -class16.method137(n67 + 3L));
            }
        }
        else {
            for (long n70 = 0L; n70 < n3; ++n70) {
                final long n71 = 4L * n70;
                for (long n72 = 0L; n72 < n70; ++n72) {
                    final long n73 = 4L * n72 + 2L * class15.method133(n3 + n70);
                    final long n74 = n71 + 2L * class15.method133(n3 + n72);
                    final long n75 = n2 + n73;
                    final long n76 = n2 + n74;
                    final double method157 = class16.method137(n75);
                    final double n77 = -class16.method137(n75 + 1L);
                    final double method158 = class16.method137(n76);
                    final double n78 = -class16.method137(n76 + 1L);
                    class16.method171(n75, method158);
                    class16.method171(n75 + 1L, n78);
                    class16.method171(n76, method157);
                    class16.method171(n76 + 1L, n77);
                    final long n79 = n73 + n6;
                    final long n80 = n74 + 2L * n6;
                    final long n81 = n2 + n79;
                    final long n82 = n2 + n80;
                    final double method159 = class16.method137(n81);
                    final double n83 = -class16.method137(n81 + 1L);
                    final double method160 = class16.method137(n82);
                    final double n84 = -class16.method137(n82 + 1L);
                    class16.method171(n81, method160);
                    class16.method171(n81 + 1L, n84);
                    class16.method171(n82, method159);
                    class16.method171(n82 + 1L, n83);
                    final long n85 = n79 + n6;
                    final long n86 = n80 - n6;
                    final long n87 = n2 + n85;
                    final long n88 = n2 + n86;
                    final double method161 = class16.method137(n87);
                    final double n89 = -class16.method137(n87 + 1L);
                    final double method162 = class16.method137(n88);
                    final double n90 = -class16.method137(n88 + 1L);
                    class16.method171(n87, method162);
                    class16.method171(n87 + 1L, n90);
                    class16.method171(n88, method161);
                    class16.method171(n88 + 1L, n89);
                    final long n91 = n85 + n6;
                    final long n92 = n86 + 2L * n6;
                    final long n93 = n2 + n91;
                    final long n94 = n2 + n92;
                    final double method163 = class16.method137(n93);
                    final double n95 = -class16.method137(n93 + 1L);
                    final double method164 = class16.method137(n94);
                    final double n96 = -class16.method137(n94 + 1L);
                    class16.method171(n93, method164);
                    class16.method171(n93 + 1L, n96);
                    class16.method171(n94, method163);
                    class16.method171(n94 + 1L, n95);
                    final long n97 = n91 + n5;
                    final long n98 = n92 + 2L;
                    final long n99 = n2 + n97;
                    final long n100 = n2 + n98;
                    final double method165 = class16.method137(n99);
                    final double n101 = -class16.method137(n99 + 1L);
                    final double method166 = class16.method137(n100);
                    final double n102 = -class16.method137(n100 + 1L);
                    class16.method171(n99, method166);
                    class16.method171(n99 + 1L, n102);
                    class16.method171(n100, method165);
                    class16.method171(n100 + 1L, n101);
                    final long n103 = n97 - n6;
                    final long n104 = n98 - 2L * n6;
                    final long n105 = n2 + n103;
                    final long n106 = n2 + n104;
                    final double method167 = class16.method137(n105);
                    final double n107 = -class16.method137(n105 + 1L);
                    final double method168 = class16.method137(n106);
                    final double n108 = -class16.method137(n106 + 1L);
                    class16.method171(n105, method168);
                    class16.method171(n105 + 1L, n108);
                    class16.method171(n106, method167);
                    class16.method171(n106 + 1L, n107);
                    final long n109 = n103 - n6;
                    final long n110 = n104 + n6;
                    final long n111 = n2 + n109;
                    final long n112 = n2 + n110;
                    final double method169 = class16.method137(n111);
                    final double n113 = -class16.method137(n111 + 1L);
                    final double method170 = class16.method137(n112);
                    final double n114 = -class16.method137(n112 + 1L);
                    class16.method171(n111, method170);
                    class16.method171(n111 + 1L, n114);
                    class16.method171(n112, method169);
                    class16.method171(n112 + 1L, n113);
                    final long n115 = n109 - n6;
                    final long n116 = n110 - 2L * n6;
                    final long n117 = n2 + n115;
                    final long n118 = n2 + n116;
                    final double method171 = class16.method137(n117);
                    final double n119 = -class16.method137(n117 + 1L);
                    final double method172 = class16.method137(n118);
                    final double n120 = -class16.method137(n118 + 1L);
                    class16.method171(n117, method172);
                    class16.method171(n117 + 1L, n120);
                    class16.method171(n118, method171);
                    class16.method171(n118 + 1L, n119);
                    final long n121 = n115 + 2L;
                    final long n122 = n116 + n5;
                    final long n123 = n2 + n121;
                    final long n124 = n2 + n122;
                    final double method173 = class16.method137(n123);
                    final double n125 = -class16.method137(n123 + 1L);
                    final double method174 = class16.method137(n124);
                    final double n126 = -class16.method137(n124 + 1L);
                    class16.method171(n123, method174);
                    class16.method171(n123 + 1L, n126);
                    class16.method171(n124, method173);
                    class16.method171(n124 + 1L, n125);
                    final long n127 = n121 + n6;
                    final long n128 = n122 + 2L * n6;
                    final long n129 = n2 + n127;
                    final long n130 = n2 + n128;
                    final double method175 = class16.method137(n129);
                    final double n131 = -class16.method137(n129 + 1L);
                    final double method176 = class16.method137(n130);
                    final double n132 = -class16.method137(n130 + 1L);
                    class16.method171(n129, method176);
                    class16.method171(n129 + 1L, n132);
                    class16.method171(n130, method175);
                    class16.method171(n130 + 1L, n131);
                    final long n133 = n127 + n6;
                    final long n134 = n128 - n6;
                    final long n135 = n2 + n133;
                    final long n136 = n2 + n134;
                    final double method177 = class16.method137(n135);
                    final double n137 = -class16.method137(n135 + 1L);
                    final double method178 = class16.method137(n136);
                    final double n138 = -class16.method137(n136 + 1L);
                    class16.method171(n135, method178);
                    class16.method171(n135 + 1L, n138);
                    class16.method171(n136, method177);
                    class16.method171(n136 + 1L, n137);
                    final long n139 = n133 + n6;
                    final long n140 = n134 + 2L * n6;
                    final long n141 = n2 + n139;
                    final long n142 = n2 + n140;
                    final double method179 = class16.method137(n141);
                    final double n143 = -class16.method137(n141 + 1L);
                    final double method180 = class16.method137(n142);
                    final double n144 = -class16.method137(n142 + 1L);
                    class16.method171(n141, method180);
                    class16.method171(n141 + 1L, n144);
                    class16.method171(n142, method179);
                    class16.method171(n142 + 1L, n143);
                    final long n145 = n139 - n5;
                    final long n146 = n140 - 2L;
                    final long n147 = n2 + n145;
                    final long n148 = n2 + n146;
                    final double method181 = class16.method137(n147);
                    final double n149 = -class16.method137(n147 + 1L);
                    final double method182 = class16.method137(n148);
                    final double n150 = -class16.method137(n148 + 1L);
                    class16.method171(n147, method182);
                    class16.method171(n147 + 1L, n150);
                    class16.method171(n148, method181);
                    class16.method171(n148 + 1L, n149);
                    final long n151 = n145 - n6;
                    final long n152 = n146 - 2L * n6;
                    final long n153 = n2 + n151;
                    final long n154 = n2 + n152;
                    final double method183 = class16.method137(n153);
                    final double n155 = -class16.method137(n153 + 1L);
                    final double method184 = class16.method137(n154);
                    final double n156 = -class16.method137(n154 + 1L);
                    class16.method171(n153, method184);
                    class16.method171(n153 + 1L, n156);
                    class16.method171(n154, method183);
                    class16.method171(n154 + 1L, n155);
                    final long n157 = n151 - n6;
                    final long n158 = n152 + n6;
                    final long n159 = n2 + n157;
                    final long n160 = n2 + n158;
                    final double method185 = class16.method137(n159);
                    final double n161 = -class16.method137(n159 + 1L);
                    final double method186 = class16.method137(n160);
                    final double n162 = -class16.method137(n160 + 1L);
                    class16.method171(n159, method186);
                    class16.method171(n159 + 1L, n162);
                    class16.method171(n160, method185);
                    class16.method171(n160 + 1L, n161);
                    final long n163 = n157 - n6;
                    final long n164 = n158 - 2L * n6;
                    final long n165 = n2 + n163;
                    final long n166 = n2 + n164;
                    final double method187 = class16.method137(n165);
                    final double n167 = -class16.method137(n165 + 1L);
                    final double method188 = class16.method137(n166);
                    final double n168 = -class16.method137(n166 + 1L);
                    class16.method171(n165, method188);
                    class16.method171(n165 + 1L, n168);
                    class16.method171(n166, method187);
                    class16.method171(n166 + 1L, n167);
                }
                final long n169 = n71 + 2L * class15.method133(n3 + n70);
                final long n170 = n169 + 2L;
                final long n171 = n169 + n5;
                final long n172 = n2 + n170;
                final long n173 = n2 + n171;
                class16.method171(n172 - 1L, -class16.method137(n172 - 1L));
                final double method189 = class16.method137(n172);
                final double n174 = -class16.method137(n172 + 1L);
                final double method190 = class16.method137(n173);
                final double n175 = -class16.method137(n173 + 1L);
                class16.method171(n172, method190);
                class16.method171(n172 + 1L, n175);
                class16.method171(n173, method189);
                class16.method171(n173 + 1L, n174);
                class16.method171(n173 + 3L, -class16.method137(n173 + 3L));
                final long n176 = n170 + n6;
                final long n177 = n171 + 2L * n6;
                final long n178 = n2 + n176;
                final long n179 = n2 + n177;
                final double method191 = class16.method137(n178);
                final double n180 = -class16.method137(n178 + 1L);
                final double method192 = class16.method137(n179);
                final double n181 = -class16.method137(n179 + 1L);
                class16.method171(n178, method192);
                class16.method171(n178 + 1L, n181);
                class16.method171(n179, method191);
                class16.method171(n179 + 1L, n180);
                final long n182 = n176 + n6;
                final long n183 = n177 - n6;
                final long n184 = n2 + n182;
                final long n185 = n2 + n183;
                final double method193 = class16.method137(n184);
                final double n186 = -class16.method137(n184 + 1L);
                final double method194 = class16.method137(n185);
                final double n187 = -class16.method137(n185 + 1L);
                class16.method171(n184, method194);
                class16.method171(n184 + 1L, n187);
                class16.method171(n185, method193);
                class16.method171(n185 + 1L, n186);
                final long n188 = n182 - 2L;
                final long n189 = n183 - n5;
                final long n190 = n2 + n188;
                final long n191 = n2 + n189;
                final double method195 = class16.method137(n190);
                final double n192 = -class16.method137(n190 + 1L);
                final double method196 = class16.method137(n191);
                final double n193 = -class16.method137(n191 + 1L);
                class16.method171(n190, method196);
                class16.method171(n190 + 1L, n193);
                class16.method171(n191, method195);
                class16.method171(n191 + 1L, n192);
                final long n194 = n188 + (n5 + 2L);
                final long n195 = n189 + (n5 + 2L);
                final long n196 = n2 + n194;
                final long n197 = n2 + n195;
                final double method197 = class16.method137(n196);
                final double n198 = -class16.method137(n196 + 1L);
                final double method198 = class16.method137(n197);
                final double n199 = -class16.method137(n197 + 1L);
                class16.method171(n196, method198);
                class16.method171(n196 + 1L, n199);
                class16.method171(n197, method197);
                class16.method171(n197 + 1L, n198);
                final long n200 = n194 - (n5 - n6);
                final long n201 = n195 + (2L * n6 - 2L);
                final long n202 = n2 + n200;
                final long n203 = n2 + n201;
                class16.method171(n202 - 1L, -class16.method137(n202 - 1L));
                final double method199 = class16.method137(n202);
                final double n204 = -class16.method137(n202 + 1L);
                final double method200 = class16.method137(n203);
                final double n205 = -class16.method137(n203 + 1L);
                class16.method171(n202, method200);
                class16.method171(n202 + 1L, n205);
                class16.method171(n203, method199);
                class16.method171(n203 + 1L, n204);
                class16.method171(n203 + 3L, -class16.method137(n203 + 3L));
            }
        }
    }
    
    public static void method33195(final double[] array, final int n) {
        final double n2 = array[n + 2];
        final double n3 = array[n + 3];
        final double n4 = array[n + 4];
        final double n5 = array[n + 5];
        final double n6 = array[n + 6];
        final double n7 = array[n + 7];
        final double n8 = array[n + 8];
        final double n9 = array[n + 9];
        final double n10 = array[n + 10];
        final double n11 = array[n + 11];
        final double n12 = array[n + 14];
        final double n13 = array[n + 15];
        final double n14 = array[n + 16];
        final double n15 = array[n + 17];
        final double n16 = array[n + 20];
        final double n17 = array[n + 21];
        final double n18 = array[n + 22];
        final double n19 = array[n + 23];
        final double n20 = array[n + 24];
        final double n21 = array[n + 25];
        final double n22 = array[n + 26];
        final double n23 = array[n + 27];
        final double n24 = array[n + 28];
        final double n25 = array[n + 29];
        array[n + 2] = n14;
        array[n + 3] = n15;
        array[n + 4] = n8;
        array[n + 5] = n9;
        array[n + 6] = n20;
        array[n + 7] = n21;
        array[n + 8] = n4;
        array[n + 9] = n5;
        array[n + 10] = n16;
        array[n + 11] = n17;
        array[n + 14] = n24;
        array[n + 15] = n25;
        array[n + 16] = n2;
        array[n + 17] = n3;
        array[n + 20] = n10;
        array[n + 21] = n11;
        array[n + 22] = n22;
        array[n + 23] = n23;
        array[n + 24] = n6;
        array[n + 25] = n7;
        array[n + 26] = n18;
        array[n + 27] = n19;
        array[n + 28] = n12;
        array[n + 29] = n13;
    }
    
    public static void method33196(final Class17 class17, final long n) {
        final double method137 = class17.method137(n + 2L);
        final double method138 = class17.method137(n + 3L);
        final double method139 = class17.method137(n + 4L);
        final double method140 = class17.method137(n + 5L);
        final double method141 = class17.method137(n + 6L);
        final double method142 = class17.method137(n + 7L);
        final double method143 = class17.method137(n + 8L);
        final double method144 = class17.method137(n + 9L);
        final double method145 = class17.method137(n + 10L);
        final double method146 = class17.method137(n + 11L);
        final double method147 = class17.method137(n + 14L);
        final double method148 = class17.method137(n + 15L);
        final double method149 = class17.method137(n + 16L);
        final double method150 = class17.method137(n + 17L);
        final double method151 = class17.method137(n + 20L);
        final double method152 = class17.method137(n + 21L);
        final double method153 = class17.method137(n + 22L);
        final double method154 = class17.method137(n + 23L);
        final double method155 = class17.method137(n + 24L);
        final double method156 = class17.method137(n + 25L);
        final double method157 = class17.method137(n + 26L);
        final double method158 = class17.method137(n + 27L);
        final double method159 = class17.method137(n + 28L);
        final double method160 = class17.method137(n + 29L);
        class17.method171(n + 2L, method149);
        class17.method171(n + 3L, method150);
        class17.method171(n + 4L, method143);
        class17.method171(n + 5L, method144);
        class17.method171(n + 6L, method155);
        class17.method171(n + 7L, method156);
        class17.method171(n + 8L, method139);
        class17.method171(n + 9L, method140);
        class17.method171(n + 10L, method151);
        class17.method171(n + 11L, method152);
        class17.method171(n + 14L, method159);
        class17.method171(n + 15L, method160);
        class17.method171(n + 16L, method137);
        class17.method171(n + 17L, method138);
        class17.method171(n + 20L, method145);
        class17.method171(n + 21L, method146);
        class17.method171(n + 22L, method157);
        class17.method171(n + 23L, method158);
        class17.method171(n + 24L, method141);
        class17.method171(n + 25L, method142);
        class17.method171(n + 26L, method153);
        class17.method171(n + 27L, method154);
        class17.method171(n + 28L, method147);
        class17.method171(n + 29L, method148);
    }
    
    public static void method33197(final double[] array, final int n) {
        final double n2 = array[n + 2];
        final double n3 = array[n + 3];
        final double n4 = array[n + 4];
        final double n5 = array[n + 5];
        final double n6 = array[n + 6];
        final double n7 = array[n + 7];
        final double n8 = array[n + 8];
        final double n9 = array[n + 9];
        final double n10 = array[n + 10];
        final double n11 = array[n + 11];
        final double n12 = array[n + 12];
        final double n13 = array[n + 13];
        final double n14 = array[n + 14];
        final double n15 = array[n + 15];
        final double n16 = array[n + 16];
        final double n17 = array[n + 17];
        final double n18 = array[n + 18];
        final double n19 = array[n + 19];
        final double n20 = array[n + 20];
        final double n21 = array[n + 21];
        final double n22 = array[n + 22];
        final double n23 = array[n + 23];
        final double n24 = array[n + 24];
        final double n25 = array[n + 25];
        final double n26 = array[n + 26];
        final double n27 = array[n + 27];
        final double n28 = array[n + 28];
        final double n29 = array[n + 29];
        final double n30 = array[n + 30];
        final double n31 = array[n + 31];
        array[n + 2] = n30;
        array[n + 3] = n31;
        array[n + 4] = n14;
        array[n + 5] = n15;
        array[n + 6] = n22;
        array[n + 7] = n23;
        array[n + 8] = n6;
        array[n + 9] = n7;
        array[n + 10] = n26;
        array[n + 11] = n27;
        array[n + 12] = n10;
        array[n + 13] = n11;
        array[n + 14] = n18;
        array[n + 15] = n19;
        array[n + 16] = n2;
        array[n + 17] = n3;
        array[n + 18] = n28;
        array[n + 19] = n29;
        array[n + 20] = n12;
        array[n + 21] = n13;
        array[n + 22] = n20;
        array[n + 23] = n21;
        array[n + 24] = n4;
        array[n + 25] = n5;
        array[n + 26] = n24;
        array[n + 27] = n25;
        array[n + 28] = n8;
        array[n + 29] = n9;
        array[n + 30] = n16;
        array[n + 31] = n17;
    }
    
    public static void method33198(final Class17 class17, final long n) {
        final double method137 = class17.method137(n + 2L);
        final double method138 = class17.method137(n + 3L);
        final double method139 = class17.method137(n + 4L);
        final double method140 = class17.method137(n + 5L);
        final double method141 = class17.method137(n + 6L);
        final double method142 = class17.method137(n + 7L);
        final double method143 = class17.method137(n + 8L);
        final double method144 = class17.method137(n + 9L);
        final double method145 = class17.method137(n + 10L);
        final double method146 = class17.method137(n + 11L);
        final double method147 = class17.method137(n + 12L);
        final double method148 = class17.method137(n + 13L);
        final double method149 = class17.method137(n + 14L);
        final double method150 = class17.method137(n + 15L);
        final double method151 = class17.method137(n + 16L);
        final double method152 = class17.method137(n + 17L);
        final double method153 = class17.method137(n + 18L);
        final double method154 = class17.method137(n + 19L);
        final double method155 = class17.method137(n + 20L);
        final double method156 = class17.method137(n + 21L);
        final double method157 = class17.method137(n + 22L);
        final double method158 = class17.method137(n + 23L);
        final double method159 = class17.method137(n + 24L);
        final double method160 = class17.method137(n + 25L);
        final double method161 = class17.method137(n + 26L);
        final double method162 = class17.method137(n + 27L);
        final double method163 = class17.method137(n + 28L);
        final double method164 = class17.method137(n + 29L);
        final double method165 = class17.method137(n + 30L);
        final double method166 = class17.method137(n + 31L);
        class17.method171(n + 2L, method165);
        class17.method171(n + 3L, method166);
        class17.method171(n + 4L, method149);
        class17.method171(n + 5L, method150);
        class17.method171(n + 6L, method157);
        class17.method171(n + 7L, method158);
        class17.method171(n + 8L, method141);
        class17.method171(n + 9L, method142);
        class17.method171(n + 10L, method161);
        class17.method171(n + 11L, method162);
        class17.method171(n + 12L, method145);
        class17.method171(n + 13L, method146);
        class17.method171(n + 14L, method153);
        class17.method171(n + 15L, method154);
        class17.method171(n + 16L, method137);
        class17.method171(n + 17L, method138);
        class17.method171(n + 18L, method163);
        class17.method171(n + 19L, method164);
        class17.method171(n + 20L, method147);
        class17.method171(n + 21L, method148);
        class17.method171(n + 22L, method155);
        class17.method171(n + 23L, method156);
        class17.method171(n + 24L, method139);
        class17.method171(n + 25L, method140);
        class17.method171(n + 26L, method159);
        class17.method171(n + 27L, method160);
        class17.method171(n + 28L, method143);
        class17.method171(n + 29L, method144);
        class17.method171(n + 30L, method151);
        class17.method171(n + 31L, method152);
    }
    
    public static void method33199(final double[] array, final int n) {
        final double n2 = array[n + 2];
        final double n3 = array[n + 3];
        final double n4 = array[n + 6];
        final double n5 = array[n + 7];
        final double n6 = array[n + 8];
        final double n7 = array[n + 9];
        final double n8 = array[n + 12];
        final double n9 = array[n + 13];
        array[n + 2] = n6;
        array[n + 3] = n7;
        array[n + 6] = n8;
        array[n + 7] = n9;
        array[n + 8] = n2;
        array[n + 9] = n3;
        array[n + 12] = n4;
        array[n + 13] = n5;
    }
    
    public static void method33200(final Class17 class17, final long n) {
        final double method137 = class17.method137(n + 2L);
        final double method138 = class17.method137(n + 3L);
        final double method139 = class17.method137(n + 6L);
        final double method140 = class17.method137(n + 7L);
        final double method141 = class17.method137(n + 8L);
        final double method142 = class17.method137(n + 9L);
        final double method143 = class17.method137(n + 12L);
        final double method144 = class17.method137(n + 13L);
        class17.method171(n + 2L, method141);
        class17.method171(n + 3L, method142);
        class17.method171(n + 6L, method143);
        class17.method171(n + 7L, method144);
        class17.method171(n + 8L, method137);
        class17.method171(n + 9L, method138);
        class17.method171(n + 12L, method139);
        class17.method171(n + 13L, method140);
    }
    
    public static void method33201(final double[] array, final int n) {
        final double n2 = array[n + 2];
        final double n3 = array[n + 3];
        final double n4 = array[n + 4];
        final double n5 = array[n + 5];
        final double n6 = array[n + 6];
        final double n7 = array[n + 7];
        final double n8 = array[n + 8];
        final double n9 = array[n + 9];
        final double n10 = array[n + 10];
        final double n11 = array[n + 11];
        final double n12 = array[n + 12];
        final double n13 = array[n + 13];
        final double n14 = array[n + 14];
        final double n15 = array[n + 15];
        array[n + 2] = n14;
        array[n + 3] = n15;
        array[n + 4] = n6;
        array[n + 5] = n7;
        array[n + 6] = n10;
        array[n + 7] = n11;
        array[n + 8] = n2;
        array[n + 9] = n3;
        array[n + 10] = n12;
        array[n + 11] = n13;
        array[n + 12] = n4;
        array[n + 13] = n5;
        array[n + 14] = n8;
        array[n + 15] = n9;
    }
    
    public static void method33202(final Class17 class17, final long n) {
        final double method137 = class17.method137(n + 2L);
        final double method138 = class17.method137(n + 3L);
        final double method139 = class17.method137(n + 4L);
        final double method140 = class17.method137(n + 5L);
        final double method141 = class17.method137(n + 6L);
        final double method142 = class17.method137(n + 7L);
        final double method143 = class17.method137(n + 8L);
        final double method144 = class17.method137(n + 9L);
        final double method145 = class17.method137(n + 10L);
        final double method146 = class17.method137(n + 11L);
        final double method147 = class17.method137(n + 12L);
        final double method148 = class17.method137(n + 13L);
        final double method149 = class17.method137(n + 14L);
        final double method150 = class17.method137(n + 15L);
        class17.method171(n + 2L, method149);
        class17.method171(n + 3L, method150);
        class17.method171(n + 4L, method141);
        class17.method171(n + 5L, method142);
        class17.method171(n + 6L, method145);
        class17.method171(n + 7L, method146);
        class17.method171(n + 8L, method137);
        class17.method171(n + 9L, method138);
        class17.method171(n + 10L, method147);
        class17.method171(n + 11L, method148);
        class17.method171(n + 12L, method139);
        class17.method171(n + 13L, method140);
        class17.method171(n + 14L, method143);
        class17.method171(n + 15L, method144);
    }
    
    public static void method33203(final int n, final double[] array, final int n2, final double[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n6;
        final int n5 = n6 = 2 * n4;
        final int n7 = n6 + n5;
        final int n8 = n7 + n5;
        final int n9 = n2 + n6;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final double n12 = array[n2] + array[n10];
        final double n13 = array[n2 + 1] + array[n10 + 1];
        final double n14 = array[n2] - array[n10];
        final double n15 = array[n2 + 1] - array[n10 + 1];
        final double n16 = array[n9] + array[n11];
        final double n17 = array[n9 + 1] + array[n11 + 1];
        final double n18 = array[n9] - array[n11];
        final double n19 = array[n9 + 1] - array[n11 + 1];
        array[n2] = n12 + n16;
        array[n2 + 1] = n13 + n17;
        array[n9] = n12 - n16;
        array[n9 + 1] = n13 - n17;
        array[n10] = n14 - n19;
        array[n10 + 1] = n15 + n18;
        array[n11] = n14 + n19;
        array[n11 + 1] = n15 - n18;
        final double n20 = array2[n3 + 1];
        final double n21 = array2[n3 + 2];
        final double n22 = array2[n3 + 3];
        double n23 = 1.0;
        double n24 = 0.0;
        double n25 = 1.0;
        double n26 = 0.0;
        int n27 = 0;
        for (int i = 2; i < n4 - 2; i += 4) {
            n27 += 4;
            final int n28 = n3 + n27;
            final double n29 = n21 * (n23 + array2[n28]);
            final double n30 = n21 * (n24 + array2[n28 + 1]);
            final double n31 = n22 * (n25 + array2[n28 + 2]);
            final double n32 = n22 * (n26 + array2[n28 + 3]);
            n23 = array2[n28];
            n24 = array2[n28 + 1];
            n25 = array2[n28 + 2];
            n26 = array2[n28 + 3];
            final int n33 = i + n5;
            final int n34 = n33 + n5;
            final int n35 = n34 + n5;
            final int n36 = n2 + n33;
            final int n37 = n2 + n34;
            final int n38 = n2 + n35;
            final int n39 = n2 + i;
            final double n40 = array[n39] + array[n37];
            final double n41 = array[n39 + 1] + array[n37 + 1];
            final double n42 = array[n39] - array[n37];
            final double n43 = array[n39 + 1] - array[n37 + 1];
            final double n44 = array[n39 + 2] + array[n37 + 2];
            final double n45 = array[n39 + 3] + array[n37 + 3];
            final double n46 = array[n39 + 2] - array[n37 + 2];
            final double n47 = array[n39 + 3] - array[n37 + 3];
            final double n48 = array[n36] + array[n38];
            final double n49 = array[n36 + 1] + array[n38 + 1];
            final double n50 = array[n36] - array[n38];
            final double n51 = array[n36 + 1] - array[n38 + 1];
            final double n52 = array[n36 + 2] + array[n38 + 2];
            final double n53 = array[n36 + 3] + array[n38 + 3];
            final double n54 = array[n36 + 2] - array[n38 + 2];
            final double n55 = array[n36 + 3] - array[n38 + 3];
            array[n39] = n40 + n48;
            array[n39 + 1] = n41 + n49;
            array[n39 + 2] = n44 + n52;
            array[n39 + 3] = n45 + n53;
            array[n36] = n40 - n48;
            array[n36 + 1] = n41 - n49;
            array[n36 + 2] = n44 - n52;
            array[n36 + 3] = n45 - n53;
            final double n56 = n42 - n51;
            final double n57 = n43 + n50;
            array[n37] = n29 * n56 - n30 * n57;
            array[n37 + 1] = n29 * n57 + n30 * n56;
            final double n58 = n46 - n55;
            final double n59 = n47 + n54;
            array[n37 + 2] = n23 * n58 - n24 * n59;
            array[n37 + 3] = n23 * n59 + n24 * n58;
            final double n60 = n42 + n51;
            final double n61 = n43 - n50;
            array[n38] = n31 * n60 + n32 * n61;
            array[n38 + 1] = n31 * n61 - n32 * n60;
            final double n62 = n46 + n55;
            final double n63 = n47 - n54;
            array[n38 + 2] = n25 * n62 + n26 * n63;
            array[n38 + 3] = n25 * n63 - n26 * n62;
            final int n64 = n5 - i;
            final int n65 = n64 + n5;
            final int n66 = n65 + n5;
            final int n67 = n66 + n5;
            final int n68 = n2 + n64;
            final int n69 = n2 + n65;
            final int n70 = n2 + n66;
            final int n71 = n2 + n67;
            final double n72 = array[n68] + array[n70];
            final double n73 = array[n68 + 1] + array[n70 + 1];
            final double n74 = array[n68] - array[n70];
            final double n75 = array[n68 + 1] - array[n70 + 1];
            final double n76 = array[n68 - 2] + array[n70 - 2];
            final double n77 = array[n68 - 1] + array[n70 - 1];
            final double n78 = array[n68 - 2] - array[n70 - 2];
            final double n79 = array[n68 - 1] - array[n70 - 1];
            final double n80 = array[n69] + array[n71];
            final double n81 = array[n69 + 1] + array[n71 + 1];
            final double n82 = array[n69] - array[n71];
            final double n83 = array[n69 + 1] - array[n71 + 1];
            final double n84 = array[n69 - 2] + array[n71 - 2];
            final double n85 = array[n69 - 1] + array[n71 - 1];
            final double n86 = array[n69 - 2] - array[n71 - 2];
            final double n87 = array[n69 - 1] - array[n71 - 1];
            array[n68] = n72 + n80;
            array[n68 + 1] = n73 + n81;
            array[n68 - 2] = n76 + n84;
            array[n68 - 1] = n77 + n85;
            array[n69] = n72 - n80;
            array[n69 + 1] = n73 - n81;
            array[n69 - 2] = n76 - n84;
            array[n69 - 1] = n77 - n85;
            final double n88 = n74 - n83;
            final double n89 = n75 + n82;
            array[n70] = n30 * n88 - n29 * n89;
            array[n70 + 1] = n30 * n89 + n29 * n88;
            final double n90 = n78 - n87;
            final double n91 = n79 + n86;
            array[n70 - 2] = n24 * n90 - n23 * n91;
            array[n70 - 1] = n24 * n91 + n23 * n90;
            final double n92 = n74 + n83;
            final double n93 = n75 - n82;
            array[n71] = n32 * n92 + n31 * n93;
            array[n71 + 1] = n32 * n93 - n31 * n92;
            final double n94 = n78 + n87;
            final double n95 = n79 - n86;
            array[n2 + n67 - 2] = n26 * n94 + n25 * n95;
            array[n2 + n67 - 1] = n26 * n95 - n25 * n94;
        }
        final double n96 = n21 * (n23 + n20);
        final double n97 = n21 * (n24 + n20);
        final double n98 = n22 * (n25 - n20);
        final double n99 = n22 * (n26 - n20);
        final int n100 = n4;
        final int n101 = n100 + n5;
        final int n102 = n101 + n5;
        final int n103 = n102 + n5;
        final int n104 = n2 + n100;
        final int n105 = n2 + n101;
        final int n106 = n2 + n102;
        final int n107 = n2 + n103;
        final double n108 = array[n104 - 2] + array[n106 - 2];
        final double n109 = array[n104 - 1] + array[n106 - 1];
        final double n110 = array[n104 - 2] - array[n106 - 2];
        final double n111 = array[n104 - 1] - array[n106 - 1];
        final double n112 = array[n105 - 2] + array[n107 - 2];
        final double n113 = array[n105 - 1] + array[n107 - 1];
        final double n114 = array[n105 - 2] - array[n107 - 2];
        final double n115 = array[n105 - 1] - array[n107 - 1];
        array[n104 - 2] = n108 + n112;
        array[n104 - 1] = n109 + n113;
        array[n105 - 2] = n108 - n112;
        array[n105 - 1] = n109 - n113;
        final double n116 = n110 - n115;
        final double n117 = n111 + n114;
        array[n106 - 2] = n96 * n116 - n97 * n117;
        array[n106 - 1] = n96 * n117 + n97 * n116;
        final double n118 = n110 + n115;
        final double n119 = n111 - n114;
        array[n107 - 2] = n98 * n118 + n99 * n119;
        array[n107 - 1] = n98 * n119 - n99 * n118;
        final double n120 = array[n104] + array[n106];
        final double n121 = array[n104 + 1] + array[n106 + 1];
        final double n122 = array[n104] - array[n106];
        final double n123 = array[n104 + 1] - array[n106 + 1];
        final double n124 = array[n105] + array[n107];
        final double n125 = array[n105 + 1] + array[n107 + 1];
        final double n126 = array[n105] - array[n107];
        final double n127 = array[n105 + 1] - array[n107 + 1];
        array[n104] = n120 + n124;
        array[n104 + 1] = n121 + n125;
        array[n105] = n120 - n124;
        array[n105 + 1] = n121 - n125;
        final double n128 = n122 - n127;
        final double n129 = n123 + n126;
        array[n106] = n20 * (n128 - n129);
        array[n106 + 1] = n20 * (n129 + n128);
        final double n130 = n122 + n127;
        final double n131 = n123 - n126;
        array[n107] = -n20 * (n130 + n131);
        array[n107 + 1] = -n20 * (n131 - n130);
        final double n132 = array[n104 + 2] + array[n106 + 2];
        final double n133 = array[n104 + 3] + array[n106 + 3];
        final double n134 = array[n104 + 2] - array[n106 + 2];
        final double n135 = array[n104 + 3] - array[n106 + 3];
        final double n136 = array[n105 + 2] + array[n107 + 2];
        final double n137 = array[n105 + 3] + array[n107 + 3];
        final double n138 = array[n105 + 2] - array[n107 + 2];
        final double n139 = array[n105 + 3] - array[n107 + 3];
        array[n104 + 2] = n132 + n136;
        array[n104 + 3] = n133 + n137;
        array[n105 + 2] = n132 - n136;
        array[n105 + 3] = n133 - n137;
        final double n140 = n134 - n139;
        final double n141 = n135 + n138;
        array[n106 + 2] = n97 * n140 - n96 * n141;
        array[n106 + 3] = n97 * n141 + n96 * n140;
        final double n142 = n134 + n139;
        final double n143 = n135 - n138;
        array[n107 + 2] = n99 * n142 + n98 * n143;
        array[n107 + 3] = n99 * n143 - n98 * n142;
    }
    
    public static void method33204(final long n, final Class17 class17, final long n2, final Class17 class18, final long n3) {
        final long n4 = n >> 3;
        final long n6;
        final long n5 = n6 = 2L * n4;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final double n12 = class17.method137(n2) + class17.method137(n10);
        final double n13 = class17.method137(n2 + 1L) + class17.method137(n10 + 1L);
        final double n14 = class17.method137(n2) - class17.method137(n10);
        final double n15 = class17.method137(n2 + 1L) - class17.method137(n10 + 1L);
        final double n16 = class17.method137(n9) + class17.method137(n11);
        final double n17 = class17.method137(n9 + 1L) + class17.method137(n11 + 1L);
        final double n18 = class17.method137(n9) - class17.method137(n11);
        final double n19 = class17.method137(n9 + 1L) - class17.method137(n11 + 1L);
        class17.method171(n2, n12 + n16);
        class17.method171(n2 + 1L, n13 + n17);
        class17.method171(n9, n12 - n16);
        class17.method171(n9 + 1L, n13 - n17);
        class17.method171(n10, n14 - n19);
        class17.method171(n10 + 1L, n15 + n18);
        class17.method171(n11, n14 + n19);
        class17.method171(n11 + 1L, n15 - n18);
        final double method137 = class18.method137(n3 + 1L);
        final double method138 = class18.method137(n3 + 2L);
        final double method139 = class18.method137(n3 + 3L);
        double method140 = 1.0;
        double method141 = 0.0;
        double method142 = 1.0;
        double method143 = 0.0;
        long n20 = 0L;
        for (int n21 = 2; n21 < n4 - 2L; n21 += 4) {
            n20 += 4L;
            final long n22 = n3 + n20;
            final double n23 = method138 * (method140 + class18.method137(n22));
            final double n24 = method138 * (method141 + class18.method137(n22 + 1L));
            final double n25 = method139 * (method142 + class18.method137(n22 + 2L));
            final double n26 = method139 * (method143 + class18.method137(n22 + 3L));
            method140 = class18.method137(n22);
            method141 = class18.method137(n22 + 1L);
            method142 = class18.method137(n22 + 2L);
            method143 = class18.method137(n22 + 3L);
            final long n27 = n21 + n5;
            final long n28 = n27 + n5;
            final long n29 = n28 + n5;
            final long n30 = n2 + n27;
            final long n31 = n2 + n28;
            final long n32 = n2 + n29;
            final long n33 = n2 + n21;
            final double n34 = class17.method137(n33) + class17.method137(n31);
            final double n35 = class17.method137(n33 + 1L) + class17.method137(n31 + 1L);
            final double n36 = class17.method137(n33) - class17.method137(n31);
            final double n37 = class17.method137(n33 + 1L) - class17.method137(n31 + 1L);
            final double n38 = class17.method137(n33 + 2L) + class17.method137(n31 + 2L);
            final double n39 = class17.method137(n33 + 3L) + class17.method137(n31 + 3L);
            final double n40 = class17.method137(n33 + 2L) - class17.method137(n31 + 2L);
            final double n41 = class17.method137(n33 + 3L) - class17.method137(n31 + 3L);
            final double n42 = class17.method137(n30) + class17.method137(n32);
            final double n43 = class17.method137(n30 + 1L) + class17.method137(n32 + 1L);
            final double n44 = class17.method137(n30) - class17.method137(n32);
            final double n45 = class17.method137(n30 + 1L) - class17.method137(n32 + 1L);
            final double n46 = class17.method137(n30 + 2L) + class17.method137(n32 + 2L);
            final double n47 = class17.method137(n30 + 3L) + class17.method137(n32 + 3L);
            final double n48 = class17.method137(n30 + 2L) - class17.method137(n32 + 2L);
            final double n49 = class17.method137(n30 + 3L) - class17.method137(n32 + 3L);
            class17.method171(n33, n34 + n42);
            class17.method171(n33 + 1L, n35 + n43);
            class17.method171(n33 + 2L, n38 + n46);
            class17.method171(n33 + 3L, n39 + n47);
            class17.method171(n30, n34 - n42);
            class17.method171(n30 + 1L, n35 - n43);
            class17.method171(n30 + 2L, n38 - n46);
            class17.method171(n30 + 3L, n39 - n47);
            final double n50 = n36 - n45;
            final double n51 = n37 + n44;
            class17.method171(n31, n23 * n50 - n24 * n51);
            class17.method171(n31 + 1L, n23 * n51 + n24 * n50);
            final double n52 = n40 - n49;
            final double n53 = n41 + n48;
            class17.method171(n31 + 2L, method140 * n52 - method141 * n53);
            class17.method171(n31 + 3L, method140 * n53 + method141 * n52);
            final double n54 = n36 + n45;
            final double n55 = n37 - n44;
            class17.method171(n32, n25 * n54 + n26 * n55);
            class17.method171(n32 + 1L, n25 * n55 - n26 * n54);
            final double n56 = n40 + n49;
            final double n57 = n41 - n48;
            class17.method171(n32 + 2L, method142 * n56 + method143 * n57);
            class17.method171(n32 + 3L, method142 * n57 - method143 * n56);
            final long n58 = n5 - n21;
            final long n59 = n58 + n5;
            final long n60 = n59 + n5;
            final long n61 = n60 + n5;
            final long n62 = n2 + n58;
            final long n63 = n2 + n59;
            final long n64 = n2 + n60;
            final long n65 = n2 + n61;
            final double n66 = class17.method137(n62) + class17.method137(n64);
            final double n67 = class17.method137(n62 + 1L) + class17.method137(n64 + 1L);
            final double n68 = class17.method137(n62) - class17.method137(n64);
            final double n69 = class17.method137(n62 + 1L) - class17.method137(n64 + 1L);
            final double n70 = class17.method137(n62 - 2L) + class17.method137(n64 - 2L);
            final double n71 = class17.method137(n62 - 1L) + class17.method137(n64 - 1L);
            final double n72 = class17.method137(n62 - 2L) - class17.method137(n64 - 2L);
            final double n73 = class17.method137(n62 - 1L) - class17.method137(n64 - 1L);
            final double n74 = class17.method137(n63) + class17.method137(n65);
            final double n75 = class17.method137(n63 + 1L) + class17.method137(n65 + 1L);
            final double n76 = class17.method137(n63) - class17.method137(n65);
            final double n77 = class17.method137(n63 + 1L) - class17.method137(n65 + 1L);
            final double n78 = class17.method137(n63 - 2L) + class17.method137(n65 - 2L);
            final double n79 = class17.method137(n63 - 1L) + class17.method137(n65 - 1L);
            final double n80 = class17.method137(n63 - 2L) - class17.method137(n65 - 2L);
            final double n81 = class17.method137(n63 - 1L) - class17.method137(n65 - 1L);
            class17.method171(n62, n66 + n74);
            class17.method171(n62 + 1L, n67 + n75);
            class17.method171(n62 - 2L, n70 + n78);
            class17.method171(n62 - 1L, n71 + n79);
            class17.method171(n63, n66 - n74);
            class17.method171(n63 + 1L, n67 - n75);
            class17.method171(n63 - 2L, n70 - n78);
            class17.method171(n63 - 1L, n71 - n79);
            final double n82 = n68 - n77;
            final double n83 = n69 + n76;
            class17.method171(n64, n24 * n82 - n23 * n83);
            class17.method171(n64 + 1L, n24 * n83 + n23 * n82);
            final double n84 = n72 - n81;
            final double n85 = n73 + n80;
            class17.method171(n64 - 2L, method141 * n84 - method140 * n85);
            class17.method171(n64 - 1L, method141 * n85 + method140 * n84);
            final double n86 = n68 + n77;
            final double n87 = n69 - n76;
            class17.method171(n65, n26 * n86 + n25 * n87);
            class17.method171(n65 + 1L, n26 * n87 - n25 * n86);
            final double n88 = n72 + n81;
            final double n89 = n73 - n80;
            class17.method171(n2 + n61 - 2L, method143 * n88 + method142 * n89);
            class17.method171(n2 + n61 - 1L, method143 * n89 - method142 * n88);
        }
        final double n90 = method138 * (method140 + method137);
        final double n91 = method138 * (method141 + method137);
        final double n92 = method139 * (method142 - method137);
        final double n93 = method139 * (method143 - method137);
        final long n94 = n4;
        final long n95 = n94 + n5;
        final long n96 = n95 + n5;
        final long n97 = n96 + n5;
        final long n98 = n2 + n94;
        final long n99 = n2 + n95;
        final long n100 = n2 + n96;
        final long n101 = n2 + n97;
        final double n102 = class17.method137(n98 - 2L) + class17.method137(n100 - 2L);
        final double n103 = class17.method137(n98 - 1L) + class17.method137(n100 - 1L);
        final double n104 = class17.method137(n98 - 2L) - class17.method137(n100 - 2L);
        final double n105 = class17.method137(n98 - 1L) - class17.method137(n100 - 1L);
        final double n106 = class17.method137(n99 - 2L) + class17.method137(n101 - 2L);
        final double n107 = class17.method137(n99 - 1L) + class17.method137(n101 - 1L);
        final double n108 = class17.method137(n99 - 2L) - class17.method137(n101 - 2L);
        final double n109 = class17.method137(n99 - 1L) - class17.method137(n101 - 1L);
        class17.method171(n98 - 2L, n102 + n106);
        class17.method171(n98 - 1L, n103 + n107);
        class17.method171(n99 - 2L, n102 - n106);
        class17.method171(n99 - 1L, n103 - n107);
        final double n110 = n104 - n109;
        final double n111 = n105 + n108;
        class17.method171(n100 - 2L, n90 * n110 - n91 * n111);
        class17.method171(n100 - 1L, n90 * n111 + n91 * n110);
        final double n112 = n104 + n109;
        final double n113 = n105 - n108;
        class17.method171(n101 - 2L, n92 * n112 + n93 * n113);
        class17.method171(n101 - 1L, n92 * n113 - n93 * n112);
        final double n114 = class17.method137(n98) + class17.method137(n100);
        final double n115 = class17.method137(n98 + 1L) + class17.method137(n100 + 1L);
        final double n116 = class17.method137(n98) - class17.method137(n100);
        final double n117 = class17.method137(n98 + 1L) - class17.method137(n100 + 1L);
        final double n118 = class17.method137(n99) + class17.method137(n101);
        final double n119 = class17.method137(n99 + 1L) + class17.method137(n101 + 1L);
        final double n120 = class17.method137(n99) - class17.method137(n101);
        final double n121 = class17.method137(n99 + 1L) - class17.method137(n101 + 1L);
        class17.method171(n98, n114 + n118);
        class17.method171(n98 + 1L, n115 + n119);
        class17.method171(n99, n114 - n118);
        class17.method171(n99 + 1L, n115 - n119);
        final double n122 = n116 - n121;
        final double n123 = n117 + n120;
        class17.method171(n100, method137 * (n122 - n123));
        class17.method171(n100 + 1L, method137 * (n123 + n122));
        final double n124 = n116 + n121;
        final double n125 = n117 - n120;
        class17.method171(n101, -method137 * (n124 + n125));
        class17.method171(n101 + 1L, -method137 * (n125 - n124));
        final double n126 = class17.method137(n98 + 2L) + class17.method137(n100 + 2L);
        final double n127 = class17.method137(n98 + 3L) + class17.method137(n100 + 3L);
        final double n128 = class17.method137(n98 + 2L) - class17.method137(n100 + 2L);
        final double n129 = class17.method137(n98 + 3L) - class17.method137(n100 + 3L);
        final double n130 = class17.method137(n99 + 2L) + class17.method137(n101 + 2L);
        final double n131 = class17.method137(n99 + 3L) + class17.method137(n101 + 3L);
        final double n132 = class17.method137(n99 + 2L) - class17.method137(n101 + 2L);
        final double n133 = class17.method137(n99 + 3L) - class17.method137(n101 + 3L);
        class17.method171(n98 + 2L, n126 + n130);
        class17.method171(n98 + 3L, n127 + n131);
        class17.method171(n99 + 2L, n126 - n130);
        class17.method171(n99 + 3L, n127 - n131);
        final double n134 = n128 - n133;
        final double n135 = n129 + n132;
        class17.method171(n100 + 2L, n91 * n134 - n90 * n135);
        class17.method171(n100 + 3L, n91 * n135 + n90 * n134);
        final double n136 = n128 + n133;
        final double n137 = n129 - n132;
        class17.method171(n101 + 2L, n93 * n136 + n92 * n137);
        class17.method171(n101 + 3L, n93 * n137 - n92 * n136);
    }
    
    public static void method33205(final int n, final double[] array, final int n2, final double[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n6;
        final int n5 = n6 = 2 * n4;
        final int n7 = n6 + n5;
        final int n8 = n7 + n5;
        final int n9 = n2 + n6;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final double n12 = array[n2] + array[n10];
        final double n13 = -array[n2 + 1] - array[n10 + 1];
        final double n14 = array[n2] - array[n10];
        final double n15 = -array[n2 + 1] + array[n10 + 1];
        final double n16 = array[n9] + array[n11];
        final double n17 = array[n9 + 1] + array[n11 + 1];
        final double n18 = array[n9] - array[n11];
        final double n19 = array[n9 + 1] - array[n11 + 1];
        array[n2] = n12 + n16;
        array[n2 + 1] = n13 - n17;
        array[n9] = n12 - n16;
        array[n9 + 1] = n13 + n17;
        array[n10] = n14 + n19;
        array[n10 + 1] = n15 + n18;
        array[n11] = n14 - n19;
        array[n11 + 1] = n15 - n18;
        final double n20 = array2[n3 + 1];
        final double n21 = array2[n3 + 2];
        final double n22 = array2[n3 + 3];
        double n23 = 1.0;
        double n24 = 0.0;
        double n25 = 1.0;
        double n26 = 0.0;
        int n27 = 0;
        for (int i = 2; i < n4 - 2; i += 4) {
            n27 += 4;
            final int n28 = n3 + n27;
            final double n29 = n21 * (n23 + array2[n28]);
            final double n30 = n21 * (n24 + array2[n28 + 1]);
            final double n31 = n22 * (n25 + array2[n28 + 2]);
            final double n32 = n22 * (n26 + array2[n28 + 3]);
            n23 = array2[n28];
            n24 = array2[n28 + 1];
            n25 = array2[n28 + 2];
            n26 = array2[n28 + 3];
            final int n33 = i + n5;
            final int n34 = n33 + n5;
            final int n35 = n34 + n5;
            final int n36 = n2 + n33;
            final int n37 = n2 + n34;
            final int n38 = n2 + n35;
            final int n39 = n2 + i;
            final double n40 = array[n39] + array[n37];
            final double n41 = -array[n39 + 1] - array[n37 + 1];
            final double n42 = array[n39] - array[n2 + n34];
            final double n43 = -array[n39 + 1] + array[n37 + 1];
            final double n44 = array[n39 + 2] + array[n37 + 2];
            final double n45 = -array[n39 + 3] - array[n37 + 3];
            final double n46 = array[n39 + 2] - array[n37 + 2];
            final double n47 = -array[n39 + 3] + array[n37 + 3];
            final double n48 = array[n36] + array[n38];
            final double n49 = array[n36 + 1] + array[n38 + 1];
            final double n50 = array[n36] - array[n38];
            final double n51 = array[n36 + 1] - array[n38 + 1];
            final double n52 = array[n36 + 2] + array[n38 + 2];
            final double n53 = array[n36 + 3] + array[n38 + 3];
            final double n54 = array[n36 + 2] - array[n38 + 2];
            final double n55 = array[n36 + 3] - array[n38 + 3];
            array[n39] = n40 + n48;
            array[n39 + 1] = n41 - n49;
            array[n39 + 2] = n44 + n52;
            array[n39 + 3] = n45 - n53;
            array[n36] = n40 - n48;
            array[n36 + 1] = n41 + n49;
            array[n36 + 2] = n44 - n52;
            array[n36 + 3] = n45 + n53;
            final double n56 = n42 + n51;
            final double n57 = n43 + n50;
            array[n37] = n29 * n56 - n30 * n57;
            array[n37 + 1] = n29 * n57 + n30 * n56;
            final double n58 = n46 + n55;
            final double n59 = n47 + n54;
            array[n37 + 2] = n23 * n58 - n24 * n59;
            array[n37 + 3] = n23 * n59 + n24 * n58;
            final double n60 = n42 - n51;
            final double n61 = n43 - n50;
            array[n38] = n31 * n60 + n32 * n61;
            array[n38 + 1] = n31 * n61 - n32 * n60;
            final double n62 = n46 - n55;
            final double n63 = n47 - n54;
            array[n38 + 2] = n25 * n62 + n26 * n63;
            array[n38 + 3] = n25 * n63 - n26 * n62;
            final int n64 = n5 - i;
            final int n65 = n64 + n5;
            final int n66 = n65 + n5;
            final int n67 = n66 + n5;
            final int n68 = n2 + n64;
            final int n69 = n2 + n65;
            final int n70 = n2 + n66;
            final int n71 = n2 + n67;
            final double n72 = array[n68] + array[n70];
            final double n73 = -array[n68 + 1] - array[n70 + 1];
            final double n74 = array[n68] - array[n70];
            final double n75 = -array[n68 + 1] + array[n70 + 1];
            final double n76 = array[n68 - 2] + array[n70 - 2];
            final double n77 = -array[n68 - 1] - array[n70 - 1];
            final double n78 = array[n68 - 2] - array[n70 - 2];
            final double n79 = -array[n68 - 1] + array[n70 - 1];
            final double n80 = array[n69] + array[n71];
            final double n81 = array[n69 + 1] + array[n71 + 1];
            final double n82 = array[n69] - array[n71];
            final double n83 = array[n69 + 1] - array[n71 + 1];
            final double n84 = array[n69 - 2] + array[n71 - 2];
            final double n85 = array[n69 - 1] + array[n71 - 1];
            final double n86 = array[n69 - 2] - array[n71 - 2];
            final double n87 = array[n69 - 1] - array[n71 - 1];
            array[n68] = n72 + n80;
            array[n68 + 1] = n73 - n81;
            array[n68 - 2] = n76 + n84;
            array[n68 - 1] = n77 - n85;
            array[n69] = n72 - n80;
            array[n69 + 1] = n73 + n81;
            array[n69 - 2] = n76 - n84;
            array[n69 - 1] = n77 + n85;
            final double n88 = n74 + n83;
            final double n89 = n75 + n82;
            array[n70] = n30 * n88 - n29 * n89;
            array[n70 + 1] = n30 * n89 + n29 * n88;
            final double n90 = n78 + n87;
            final double n91 = n79 + n86;
            array[n70 - 2] = n24 * n90 - n23 * n91;
            array[n70 - 1] = n24 * n91 + n23 * n90;
            final double n92 = n74 - n83;
            final double n93 = n75 - n82;
            array[n71] = n32 * n92 + n31 * n93;
            array[n71 + 1] = n32 * n93 - n31 * n92;
            final double n94 = n78 - n87;
            final double n95 = n79 - n86;
            array[n71 - 2] = n26 * n94 + n25 * n95;
            array[n71 - 1] = n26 * n95 - n25 * n94;
        }
        final double n96 = n21 * (n23 + n20);
        final double n97 = n21 * (n24 + n20);
        final double n98 = n22 * (n25 - n20);
        final double n99 = n22 * (n26 - n20);
        final int n100 = n4;
        final int n101 = n100 + n5;
        final int n102 = n101 + n5;
        final int n103 = n102 + n5;
        final int n104 = n2 + n100;
        final int n105 = n2 + n101;
        final int n106 = n2 + n102;
        final int n107 = n2 + n103;
        final double n108 = array[n104 - 2] + array[n106 - 2];
        final double n109 = -array[n104 - 1] - array[n106 - 1];
        final double n110 = array[n104 - 2] - array[n106 - 2];
        final double n111 = -array[n104 - 1] + array[n106 - 1];
        final double n112 = array[n105 - 2] + array[n107 - 2];
        final double n113 = array[n105 - 1] + array[n107 - 1];
        final double n114 = array[n105 - 2] - array[n107 - 2];
        final double n115 = array[n105 - 1] - array[n107 - 1];
        array[n104 - 2] = n108 + n112;
        array[n104 - 1] = n109 - n113;
        array[n105 - 2] = n108 - n112;
        array[n105 - 1] = n109 + n113;
        final double n116 = n110 + n115;
        final double n117 = n111 + n114;
        array[n106 - 2] = n96 * n116 - n97 * n117;
        array[n106 - 1] = n96 * n117 + n97 * n116;
        final double n118 = n110 - n115;
        final double n119 = n111 - n114;
        array[n107 - 2] = n98 * n118 + n99 * n119;
        array[n107 - 1] = n98 * n119 - n99 * n118;
        final double n120 = array[n104] + array[n106];
        final double n121 = -array[n104 + 1] - array[n106 + 1];
        final double n122 = array[n104] - array[n106];
        final double n123 = -array[n104 + 1] + array[n106 + 1];
        final double n124 = array[n105] + array[n107];
        final double n125 = array[n105 + 1] + array[n107 + 1];
        final double n126 = array[n105] - array[n107];
        final double n127 = array[n105 + 1] - array[n107 + 1];
        array[n104] = n120 + n124;
        array[n104 + 1] = n121 - n125;
        array[n105] = n120 - n124;
        array[n105 + 1] = n121 + n125;
        final double n128 = n122 + n127;
        final double n129 = n123 + n126;
        array[n106] = n20 * (n128 - n129);
        array[n106 + 1] = n20 * (n129 + n128);
        final double n130 = n122 - n127;
        final double n131 = n123 - n126;
        array[n107] = -n20 * (n130 + n131);
        array[n107 + 1] = -n20 * (n131 - n130);
        final double n132 = array[n104 + 2] + array[n106 + 2];
        final double n133 = -array[n104 + 3] - array[n106 + 3];
        final double n134 = array[n104 + 2] - array[n106 + 2];
        final double n135 = -array[n104 + 3] + array[n106 + 3];
        final double n136 = array[n105 + 2] + array[n107 + 2];
        final double n137 = array[n105 + 3] + array[n107 + 3];
        final double n138 = array[n105 + 2] - array[n107 + 2];
        final double n139 = array[n105 + 3] - array[n107 + 3];
        array[n104 + 2] = n132 + n136;
        array[n104 + 3] = n133 - n137;
        array[n105 + 2] = n132 - n136;
        array[n105 + 3] = n133 + n137;
        final double n140 = n134 + n139;
        final double n141 = n135 + n138;
        array[n106 + 2] = n97 * n140 - n96 * n141;
        array[n106 + 3] = n97 * n141 + n96 * n140;
        final double n142 = n134 - n139;
        final double n143 = n135 - n138;
        array[n107 + 2] = n99 * n142 + n98 * n143;
        array[n107 + 3] = n99 * n143 - n98 * n142;
    }
    
    public static void method33206(final long n, final Class17 class17, final long n2, final Class17 class18, final long n3) {
        final long n4 = n >> 3;
        final long n6;
        final long n5 = n6 = 2L * n4;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final double n12 = class17.method137(n2) + class17.method137(n10);
        final double n13 = -class17.method137(n2 + 1L) - class17.method137(n10 + 1L);
        final double n14 = class17.method137(n2) - class17.method137(n10);
        final double n15 = -class17.method137(n2 + 1L) + class17.method137(n10 + 1L);
        final double n16 = class17.method137(n9) + class17.method137(n11);
        final double n17 = class17.method137(n9 + 1L) + class17.method137(n11 + 1L);
        final double n18 = class17.method137(n9) - class17.method137(n11);
        final double n19 = class17.method137(n9 + 1L) - class17.method137(n11 + 1L);
        class17.method171(n2, n12 + n16);
        class17.method171(n2 + 1L, n13 - n17);
        class17.method171(n9, n12 - n16);
        class17.method171(n9 + 1L, n13 + n17);
        class17.method171(n10, n14 + n19);
        class17.method171(n10 + 1L, n15 + n18);
        class17.method171(n11, n14 - n19);
        class17.method171(n11 + 1L, n15 - n18);
        final double method137 = class18.method137(n3 + 1L);
        final double method138 = class18.method137(n3 + 2L);
        final double method139 = class18.method137(n3 + 3L);
        double method140 = 1.0;
        double method141 = 0.0;
        double method142 = 1.0;
        double method143 = 0.0;
        long n20 = 0L;
        for (long n21 = 2L; n21 < n4 - 2L; n21 += 4L) {
            n20 += 4L;
            final long n22 = n3 + n20;
            final double n23 = method138 * (method140 + class18.method137(n22));
            final double n24 = method138 * (method141 + class18.method137(n22 + 1L));
            final double n25 = method139 * (method142 + class18.method137(n22 + 2L));
            final double n26 = method139 * (method143 + class18.method137(n22 + 3L));
            method140 = class18.method137(n22);
            method141 = class18.method137(n22 + 1L);
            method142 = class18.method137(n22 + 2L);
            method143 = class18.method137(n22 + 3L);
            final long n27 = n21 + n5;
            final long n28 = n27 + n5;
            final long n29 = n28 + n5;
            final long n30 = n2 + n27;
            final long n31 = n2 + n28;
            final long n32 = n2 + n29;
            final long n33 = n2 + n21;
            final double n34 = class17.method137(n33) + class17.method137(n31);
            final double n35 = -class17.method137(n33 + 1L) - class17.method137(n31 + 1L);
            final double n36 = class17.method137(n33) - class17.method137(n2 + n28);
            final double n37 = -class17.method137(n33 + 1L) + class17.method137(n31 + 1L);
            final double n38 = class17.method137(n33 + 2L) + class17.method137(n31 + 2L);
            final double n39 = -class17.method137(n33 + 3L) - class17.method137(n31 + 3L);
            final double n40 = class17.method137(n33 + 2L) - class17.method137(n31 + 2L);
            final double n41 = -class17.method137(n33 + 3L) + class17.method137(n31 + 3L);
            final double n42 = class17.method137(n30) + class17.method137(n32);
            final double n43 = class17.method137(n30 + 1L) + class17.method137(n32 + 1L);
            final double n44 = class17.method137(n30) - class17.method137(n32);
            final double n45 = class17.method137(n30 + 1L) - class17.method137(n32 + 1L);
            final double n46 = class17.method137(n30 + 2L) + class17.method137(n32 + 2L);
            final double n47 = class17.method137(n30 + 3L) + class17.method137(n32 + 3L);
            final double n48 = class17.method137(n30 + 2L) - class17.method137(n32 + 2L);
            final double n49 = class17.method137(n30 + 3L) - class17.method137(n32 + 3L);
            class17.method171(n33, n34 + n42);
            class17.method171(n33 + 1L, n35 - n43);
            class17.method171(n33 + 2L, n38 + n46);
            class17.method171(n33 + 3L, n39 - n47);
            class17.method171(n30, n34 - n42);
            class17.method171(n30 + 1L, n35 + n43);
            class17.method171(n30 + 2L, n38 - n46);
            class17.method171(n30 + 3L, n39 + n47);
            final double n50 = n36 + n45;
            final double n51 = n37 + n44;
            class17.method171(n31, n23 * n50 - n24 * n51);
            class17.method171(n31 + 1L, n23 * n51 + n24 * n50);
            final double n52 = n40 + n49;
            final double n53 = n41 + n48;
            class17.method171(n31 + 2L, method140 * n52 - method141 * n53);
            class17.method171(n31 + 3L, method140 * n53 + method141 * n52);
            final double n54 = n36 - n45;
            final double n55 = n37 - n44;
            class17.method171(n32, n25 * n54 + n26 * n55);
            class17.method171(n32 + 1L, n25 * n55 - n26 * n54);
            final double n56 = n40 - n49;
            final double n57 = n41 - n48;
            class17.method171(n32 + 2L, method142 * n56 + method143 * n57);
            class17.method171(n32 + 3L, method142 * n57 - method143 * n56);
            final long n58 = n5 - n21;
            final long n59 = n58 + n5;
            final long n60 = n59 + n5;
            final long n61 = n60 + n5;
            final long n62 = n2 + n58;
            final long n63 = n2 + n59;
            final long n64 = n2 + n60;
            final long n65 = n2 + n61;
            final double n66 = class17.method137(n62) + class17.method137(n64);
            final double n67 = -class17.method137(n62 + 1L) - class17.method137(n64 + 1L);
            final double n68 = class17.method137(n62) - class17.method137(n64);
            final double n69 = -class17.method137(n62 + 1L) + class17.method137(n64 + 1L);
            final double n70 = class17.method137(n62 - 2L) + class17.method137(n64 - 2L);
            final double n71 = -class17.method137(n62 - 1L) - class17.method137(n64 - 1L);
            final double n72 = class17.method137(n62 - 2L) - class17.method137(n64 - 2L);
            final double n73 = -class17.method137(n62 - 1L) + class17.method137(n64 - 1L);
            final double n74 = class17.method137(n63) + class17.method137(n65);
            final double n75 = class17.method137(n63 + 1L) + class17.method137(n65 + 1L);
            final double n76 = class17.method137(n63) - class17.method137(n65);
            final double n77 = class17.method137(n63 + 1L) - class17.method137(n65 + 1L);
            final double n78 = class17.method137(n63 - 2L) + class17.method137(n65 - 2L);
            final double n79 = class17.method137(n63 - 1L) + class17.method137(n65 - 1L);
            final double n80 = class17.method137(n63 - 2L) - class17.method137(n65 - 2L);
            final double n81 = class17.method137(n63 - 1L) - class17.method137(n65 - 1L);
            class17.method171(n62, n66 + n74);
            class17.method171(n62 + 1L, n67 - n75);
            class17.method171(n62 - 2L, n70 + n78);
            class17.method171(n62 - 1L, n71 - n79);
            class17.method171(n63, n66 - n74);
            class17.method171(n63 + 1L, n67 + n75);
            class17.method171(n63 - 2L, n70 - n78);
            class17.method171(n63 - 1L, n71 + n79);
            final double n82 = n68 + n77;
            final double n83 = n69 + n76;
            class17.method171(n64, n24 * n82 - n23 * n83);
            class17.method171(n64 + 1L, n24 * n83 + n23 * n82);
            final double n84 = n72 + n81;
            final double n85 = n73 + n80;
            class17.method171(n64 - 2L, method141 * n84 - method140 * n85);
            class17.method171(n64 - 1L, method141 * n85 + method140 * n84);
            final double n86 = n68 - n77;
            final double n87 = n69 - n76;
            class17.method171(n65, n26 * n86 + n25 * n87);
            class17.method171(n65 + 1L, n26 * n87 - n25 * n86);
            final double n88 = n72 - n81;
            final double n89 = n73 - n80;
            class17.method171(n65 - 2L, method143 * n88 + method142 * n89);
            class17.method171(n65 - 1L, method143 * n89 - method142 * n88);
        }
        final double n90 = method138 * (method140 + method137);
        final double n91 = method138 * (method141 + method137);
        final double n92 = method139 * (method142 - method137);
        final double n93 = method139 * (method143 - method137);
        final long n94 = n4;
        final long n95 = n94 + n5;
        final long n96 = n95 + n5;
        final long n97 = n96 + n5;
        final long n98 = n2 + n94;
        final long n99 = n2 + n95;
        final long n100 = n2 + n96;
        final long n101 = n2 + n97;
        final double n102 = class17.method137(n98 - 2L) + class17.method137(n100 - 2L);
        final double n103 = -class17.method137(n98 - 1L) - class17.method137(n100 - 1L);
        final double n104 = class17.method137(n98 - 2L) - class17.method137(n100 - 2L);
        final double n105 = -class17.method137(n98 - 1L) + class17.method137(n100 - 1L);
        final double n106 = class17.method137(n99 - 2L) + class17.method137(n101 - 2L);
        final double n107 = class17.method137(n99 - 1L) + class17.method137(n101 - 1L);
        final double n108 = class17.method137(n99 - 2L) - class17.method137(n101 - 2L);
        final double n109 = class17.method137(n99 - 1L) - class17.method137(n101 - 1L);
        class17.method171(n98 - 2L, n102 + n106);
        class17.method171(n98 - 1L, n103 - n107);
        class17.method171(n99 - 2L, n102 - n106);
        class17.method171(n99 - 1L, n103 + n107);
        final double n110 = n104 + n109;
        final double n111 = n105 + n108;
        class17.method171(n100 - 2L, n90 * n110 - n91 * n111);
        class17.method171(n100 - 1L, n90 * n111 + n91 * n110);
        final double n112 = n104 - n109;
        final double n113 = n105 - n108;
        class17.method171(n101 - 2L, n92 * n112 + n93 * n113);
        class17.method171(n101 - 1L, n92 * n113 - n93 * n112);
        final double n114 = class17.method137(n98) + class17.method137(n100);
        final double n115 = -class17.method137(n98 + 1L) - class17.method137(n100 + 1L);
        final double n116 = class17.method137(n98) - class17.method137(n100);
        final double n117 = -class17.method137(n98 + 1L) + class17.method137(n100 + 1L);
        final double n118 = class17.method137(n99) + class17.method137(n101);
        final double n119 = class17.method137(n99 + 1L) + class17.method137(n101 + 1L);
        final double n120 = class17.method137(n99) - class17.method137(n101);
        final double n121 = class17.method137(n99 + 1L) - class17.method137(n101 + 1L);
        class17.method171(n98, n114 + n118);
        class17.method171(n98 + 1L, n115 - n119);
        class17.method171(n99, n114 - n118);
        class17.method171(n99 + 1L, n115 + n119);
        final double n122 = n116 + n121;
        final double n123 = n117 + n120;
        class17.method171(n100, method137 * (n122 - n123));
        class17.method171(n100 + 1L, method137 * (n123 + n122));
        final double n124 = n116 - n121;
        final double n125 = n117 - n120;
        class17.method171(n101, -method137 * (n124 + n125));
        class17.method171(n101 + 1L, -method137 * (n125 - n124));
        final double n126 = class17.method137(n98 + 2L) + class17.method137(n100 + 2L);
        final double n127 = -class17.method137(n98 + 3L) - class17.method137(n100 + 3L);
        final double n128 = class17.method137(n98 + 2L) - class17.method137(n100 + 2L);
        final double n129 = -class17.method137(n98 + 3L) + class17.method137(n100 + 3L);
        final double n130 = class17.method137(n99 + 2L) + class17.method137(n101 + 2L);
        final double n131 = class17.method137(n99 + 3L) + class17.method137(n101 + 3L);
        final double n132 = class17.method137(n99 + 2L) - class17.method137(n101 + 2L);
        final double n133 = class17.method137(n99 + 3L) - class17.method137(n101 + 3L);
        class17.method171(n98 + 2L, n126 + n130);
        class17.method171(n98 + 3L, n127 - n131);
        class17.method171(n99 + 2L, n126 - n130);
        class17.method171(n99 + 3L, n127 + n131);
        final double n134 = n128 + n133;
        final double n135 = n129 + n132;
        class17.method171(n100 + 2L, n91 * n134 - n90 * n135);
        class17.method171(n100 + 3L, n91 * n135 + n90 * n134);
        final double n136 = n128 - n133;
        final double n137 = n129 - n132;
        class17.method171(n101 + 2L, n93 * n136 + n92 * n137);
        class17.method171(n101 + 3L, n93 * n137 - n92 * n136);
    }
    
    public static void method33207(final int n, final double[] array, final int n2, final int n3, final double[] array2) {
        int n4 = 0;
        int n5 = 2;
        int n6 = 0;
        int n7 = n >> 1;
        if (n >= method33159()) {
            n5 = 4;
            n6 = 1;
            n7 >>= 1;
        }
        final Future[] array3 = new Future[n5];
        final int n8 = n7;
        for (int i = 0; i < n5; ++i) {
            final int n9 = n2 + i * n7;
            if (i != n6) {
                array3[n4++] = Class8216.method27227(new Class887(n9, n8, n, array, array2, n3));
            }
            else {
                array3[n4++] = Class8216.method27227(new Class953(n9, n8, n, array, array2, n3));
            }
        }
        try {
            Class8216.method27228(array3);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    public static void method33208(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18) {
        int n4 = 0;
        int n5 = 2;
        int n6 = 0;
        long n7 = n >> 1;
        if (n >= method33159()) {
            n5 = 4;
            n6 = 1;
            n7 >>= 1;
        }
        final Future[] array = new Future[n5];
        final long n8 = n7;
        for (int i = 0; i < n5; ++i) {
            final long n9 = n2 + i * n7;
            if (i != n6) {
                array[n4++] = Class8216.method27227(new Class1643(n9, n8, n, class17, class18, n3));
            }
            else {
                array[n4++] = Class8216.method27227(new Class1467(n9, n8, n, class17, class18, n3));
            }
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    public static void method33209(final int n, final double[] array, final int n2, final int n3, final double[] array2) {
        int i = n;
        final int n4 = n2 + n;
        while (i > 512) {
            i >>= 2;
            method33215(i, array, n4 - i, array2, n3 - (i >> 1));
        }
        method33213(i, 1, array, n4 - i, n3, array2);
        int n5 = 0;
        final int n6 = n2 - i;
        for (int j = n - i; j > 0; j -= i) {
            ++n5;
            method33213(i, method33211(i, j, n5, array, n2, n3, array2), array, n6 + j, n3, array2);
        }
    }
    
    public static void method33210(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18) {
        long n4 = n;
        final long n5 = n2 + n;
        while (n4 > 512L) {
            n4 >>= 2;
            method33216(n4, class17, n5 - n4, class18, n3 - (n4 >> 1));
        }
        method33214(n4, 1L, class17, n5 - n4, n3, class18);
        long n6 = 0L;
        final long n7 = n2 - n4;
        for (long n8 = n - n4; n8 > 0L; n8 -= n4) {
            ++n6;
            method33214(n4, method33212(n4, n8, n6, class17, n2, n3, class18), class17, n7 + n8, n3, class18);
        }
    }
    
    public static int method33211(final int n, final int n2, final int n3, final double[] array, final int n4, final int n5, final double[] array2) {
        final int n6 = n4 - n;
        int i = n;
        int n7;
        for (n7 = n3; (n7 & 0x3) == 0x0; n7 >>= 2) {
            i <<= 2;
        }
        final int n8 = n7 & 0x1;
        final int n9 = n4 + n2;
        if (n8 == 0) {
            while (i > 128) {
                method33217(i, array, n9 - i, array2, n5 - i);
                i >>= 2;
            }
        }
        else {
            while (i > 128) {
                method33215(i, array, n9 - i, array2, n5 - (i >> 1));
                i >>= 2;
            }
        }
        final int n10;
        while ((n10 & 0x800000) == 0x0) {
            if ((n10 & 0x100000) == 0x0) {
                continue;
            }
            method33217(n, array, n6 + n2, array2, n5 - n);
        }
        return n8;
    }
    
    public static long method33212(final long n, final long n2, final long n3, final Class17 class17, final long n4, final long n5, final Class17 class18) {
        final long n6 = n4 - n;
        long n9;
        if ((n3 & 0x3L) == 0x0L) {
            long n7 = n;
            long n8;
            for (n8 = n3; (n8 & 0x3L) == 0x0L; n8 >>= 2) {
                n7 <<= 2;
            }
            n9 = (n8 & 0x1L);
            final long n10 = n4 + n2;
            if (n9 == 0L) {
                while (n7 > 128L) {
                    method33218(n7, class17, n10 - n7, class18, n5 - n7);
                    n7 >>= 2;
                }
            }
            else {
                while (n7 > 128L) {
                    method33216(n7, class17, n10 - n7, class18, n5 - (n7 >> 1));
                    n7 >>= 2;
                }
            }
        }
        else {
            n9 = (n3 & 0x1L);
            if (n9 == 0L) {
                method33218(n, class17, n6 + n2, class18, n5 - n);
            }
            else {
                method33216(n, class17, n6 + n2, class18, n5 - (n >> 1));
            }
        }
        return n9;
    }
    
    public static void method33213(final int n, final int n2, final double[] array, final int n3, final int n4, final double[] array2) {
        if (n != 512) {
            method33215(64, array, n3, array2, n4 - 32);
            method33225(array, n3, array2, n4 - 8);
            method33227(array, n3 + 16, array2, n4 - 8);
            method33225(array, n3 + 32, array2, n4 - 8);
            method33225(array, n3 + 48, array2, n4 - 8);
            method33217(64, array, n3 + 64, array2, n4 - 64);
            method33225(array, n3 + 64, array2, n4 - 8);
            method33227(array, n3 + 80, array2, n4 - 8);
            method33225(array, n3 + 96, array2, n4 - 8);
            method33227(array, n3 + 112, array2, n4 - 8);
            method33215(64, array, n3 + 128, array2, n4 - 32);
            method33225(array, n3 + 128, array2, n4 - 8);
            method33227(array, n3 + 144, array2, n4 - 8);
            method33225(array, n3 + 160, array2, n4 - 8);
            method33225(array, n3 + 176, array2, n4 - 8);
            if (n2 == 0) {
                method33217(64, array, n3 + 192, array2, n4 - 64);
                method33227(array, n3 + 240, array2, n4 - 8);
            }
            else {
                method33215(64, array, n3 + 192, array2, n4 - 32);
                method33225(array, n3 + 240, array2, n4 - 8);
            }
            method33225(array, n3 + 192, array2, n4 - 8);
            method33227(array, n3 + 208, array2, n4 - 8);
            method33225(array, n3 + 224, array2, n4 - 8);
        }
        else {
            method33215(128, array, n3, array2, n4 - 64);
            method33221(array, n3, array2, n4 - 8);
            method33223(array, n3 + 32, array2, n4 - 32);
            method33221(array, n3 + 64, array2, n4 - 8);
            method33221(array, n3 + 96, array2, n4 - 8);
            method33217(128, array, n3 + 128, array2, n4 - 128);
            method33221(array, n3 + 128, array2, n4 - 8);
            method33223(array, n3 + 160, array2, n4 - 32);
            method33221(array, n3 + 192, array2, n4 - 8);
            method33223(array, n3 + 224, array2, n4 - 32);
            method33215(128, array, n3 + 256, array2, n4 - 64);
            method33221(array, n3 + 256, array2, n4 - 8);
            method33223(array, n3 + 288, array2, n4 - 32);
            method33221(array, n3 + 320, array2, n4 - 8);
            method33221(array, n3 + 352, array2, n4 - 8);
            if (n2 == 0) {
                method33217(128, array, n3 + 384, array2, n4 - 128);
                method33223(array, n3 + 480, array2, n4 - 32);
            }
            else {
                method33215(128, array, n3 + 384, array2, n4 - 64);
                method33221(array, n3 + 480, array2, n4 - 8);
            }
            method33221(array, n3 + 384, array2, n4 - 8);
            method33223(array, n3 + 416, array2, n4 - 32);
            method33221(array, n3 + 448, array2, n4 - 8);
        }
    }
    
    public static void method33214(final long n, final long n2, final Class17 class17, final long n3, final long n4, final Class17 class18) {
        if (n != 512L) {
            method33216(64L, class17, n3, class18, n4 - 32L);
            method33226(class17, n3, class18, n4 - 8L);
            method33228(class17, n3 + 16L, class18, n4 - 8L);
            method33226(class17, n3 + 32L, class18, n4 - 8L);
            method33226(class17, n3 + 48L, class18, n4 - 8L);
            method33218(64L, class17, n3 + 64L, class18, n4 - 64L);
            method33226(class17, n3 + 64L, class18, n4 - 8L);
            method33228(class17, n3 + 80L, class18, n4 - 8L);
            method33226(class17, n3 + 96L, class18, n4 - 8L);
            method33228(class17, n3 + 112L, class18, n4 - 8L);
            method33216(64L, class17, n3 + 128L, class18, n4 - 32L);
            method33226(class17, n3 + 128L, class18, n4 - 8L);
            method33228(class17, n3 + 144L, class18, n4 - 8L);
            method33226(class17, n3 + 160L, class18, n4 - 8L);
            method33226(class17, n3 + 176L, class18, n4 - 8L);
            if (n2 == 0L) {
                method33218(64L, class17, n3 + 192L, class18, n4 - 64L);
                method33228(class17, n3 + 240L, class18, n4 - 8L);
            }
            else {
                method33216(64L, class17, n3 + 192L, class18, n4 - 32L);
                method33226(class17, n3 + 240L, class18, n4 - 8L);
            }
            method33226(class17, n3 + 192L, class18, n4 - 8L);
            method33228(class17, n3 + 208L, class18, n4 - 8L);
            method33226(class17, n3 + 224L, class18, n4 - 8L);
        }
        else {
            method33216(128L, class17, n3, class18, n4 - 64L);
            method33222(class17, n3, class18, n4 - 8L);
            method33224(class17, n3 + 32L, class18, n4 - 32L);
            method33222(class17, n3 + 64L, class18, n4 - 8L);
            method33222(class17, n3 + 96L, class18, n4 - 8L);
            method33218(128L, class17, n3 + 128L, class18, n4 - 128L);
            method33222(class17, n3 + 128L, class18, n4 - 8L);
            method33224(class17, n3 + 160L, class18, n4 - 32L);
            method33222(class17, n3 + 192L, class18, n4 - 8L);
            method33224(class17, n3 + 224L, class18, n4 - 32L);
            method33216(128L, class17, n3 + 256L, class18, n4 - 64L);
            method33222(class17, n3 + 256L, class18, n4 - 8L);
            method33224(class17, n3 + 288L, class18, n4 - 32L);
            method33222(class17, n3 + 320L, class18, n4 - 8L);
            method33222(class17, n3 + 352L, class18, n4 - 8L);
            if (n2 == 0L) {
                method33218(128L, class17, n3 + 384L, class18, n4 - 128L);
                method33224(class17, n3 + 480L, class18, n4 - 32L);
            }
            else {
                method33216(128L, class17, n3 + 384L, class18, n4 - 64L);
                method33222(class17, n3 + 480L, class18, n4 - 8L);
            }
            method33222(class17, n3 + 384L, class18, n4 - 8L);
            method33224(class17, n3 + 416L, class18, n4 - 32L);
            method33222(class17, n3 + 448L, class18, n4 - 8L);
        }
    }
    
    public static void method33215(final int n, final double[] array, final int n2, final double[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n6;
        final int n5 = n6 = 2 * n4;
        final int n7 = n6 + n5;
        final int n8 = n7 + n5;
        final int n9 = n2 + n6;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final double n12 = array[n2] + array[n10];
        final double n13 = array[n2 + 1] + array[n10 + 1];
        final double n14 = array[n2] - array[n10];
        final double n15 = array[n2 + 1] - array[n10 + 1];
        final double n16 = array[n9] + array[n11];
        final double n17 = array[n9 + 1] + array[n11 + 1];
        final double n18 = array[n9] - array[n11];
        final double n19 = array[n9 + 1] - array[n11 + 1];
        array[n2] = n12 + n16;
        array[n2 + 1] = n13 + n17;
        array[n9] = n12 - n16;
        array[n9 + 1] = n13 - n17;
        array[n10] = n14 - n19;
        array[n10 + 1] = n15 + n18;
        array[n11] = n14 + n19;
        array[n11 + 1] = n15 - n18;
        final double n20 = array2[n3 + 1];
        int n21 = 0;
        for (int i = 2; i < n4; i += 2) {
            n21 += 4;
            final int n22 = n3 + n21;
            final double n23 = array2[n22];
            final double n24 = array2[n22 + 1];
            final double n25 = array2[n22 + 2];
            final double n26 = array2[n22 + 3];
            final int n27 = i + n5;
            final int n28 = n27 + n5;
            final int n29 = n28 + n5;
            final int n30 = n2 + n27;
            final int n31 = n2 + n28;
            final int n32 = n2 + n29;
            final int n33 = n2 + i;
            final double n34 = array[n33] + array[n31];
            final double n35 = array[n33 + 1] + array[n31 + 1];
            final double n36 = array[n33] - array[n31];
            final double n37 = array[n33 + 1] - array[n31 + 1];
            final double n38 = array[n30] + array[n32];
            final double n39 = array[n30 + 1] + array[n32 + 1];
            final double n40 = array[n30] - array[n32];
            final double n41 = array[n30 + 1] - array[n32 + 1];
            array[n33] = n34 + n38;
            array[n33 + 1] = n35 + n39;
            array[n30] = n34 - n38;
            array[n30 + 1] = n35 - n39;
            final double n42 = n36 - n41;
            final double n43 = n37 + n40;
            array[n31] = n23 * n42 - n24 * n43;
            array[n31 + 1] = n23 * n43 + n24 * n42;
            final double n44 = n36 + n41;
            final double n45 = n37 - n40;
            array[n32] = n25 * n44 + n26 * n45;
            array[n32 + 1] = n25 * n45 - n26 * n44;
            final int n46 = n5 - i;
            final int n47 = n46 + n5;
            final int n48 = n47 + n5;
            final int n49 = n48 + n5;
            final int n50 = n2 + n46;
            final int n51 = n2 + n47;
            final int n52 = n2 + n48;
            final int n53 = n2 + n49;
            final double n54 = array[n50] + array[n52];
            final double n55 = array[n50 + 1] + array[n52 + 1];
            final double n56 = array[n50] - array[n52];
            final double n57 = array[n50 + 1] - array[n52 + 1];
            final double n58 = array[n51] + array[n53];
            final double n59 = array[n51 + 1] + array[n53 + 1];
            final double n60 = array[n51] - array[n53];
            final double n61 = array[n51 + 1] - array[n53 + 1];
            array[n50] = n54 + n58;
            array[n50 + 1] = n55 + n59;
            array[n51] = n54 - n58;
            array[n51 + 1] = n55 - n59;
            final double n62 = n56 - n61;
            final double n63 = n57 + n60;
            array[n52] = n24 * n62 - n23 * n63;
            array[n52 + 1] = n24 * n63 + n23 * n62;
            final double n64 = n56 + n61;
            final double n65 = n57 - n60;
            array[n53] = n26 * n64 + n25 * n65;
            array[n53 + 1] = n26 * n65 - n25 * n64;
        }
        final int n66 = n4;
        final int n67 = n66 + n5;
        final int n68 = n67 + n5;
        final int n69 = n68 + n5;
        final int n70 = n2 + n66;
        final int n71 = n2 + n67;
        final int n72 = n2 + n68;
        final int n73 = n2 + n69;
        final double n74 = array[n70] + array[n72];
        final double n75 = array[n70 + 1] + array[n72 + 1];
        final double n76 = array[n70] - array[n72];
        final double n77 = array[n70 + 1] - array[n72 + 1];
        final double n78 = array[n71] + array[n73];
        final double n79 = array[n71 + 1] + array[n73 + 1];
        final double n80 = array[n71] - array[n73];
        final double n81 = array[n71 + 1] - array[n73 + 1];
        array[n70] = n74 + n78;
        array[n70 + 1] = n75 + n79;
        array[n71] = n74 - n78;
        array[n71 + 1] = n75 - n79;
        final double n82 = n76 - n81;
        final double n83 = n77 + n80;
        array[n72] = n20 * (n82 - n83);
        array[n72 + 1] = n20 * (n83 + n82);
        final double n84 = n76 + n81;
        final double n85 = n77 - n80;
        array[n73] = -n20 * (n84 + n85);
        array[n73 + 1] = -n20 * (n85 - n84);
    }
    
    public static void method33216(final long n, final Class17 class17, final long n2, final Class17 class18, final long n3) {
        final long n4 = n >> 3;
        final long n6;
        final long n5 = n6 = 2L * n4;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final double n12 = class17.method137(n2) + class17.method137(n10);
        final double n13 = class17.method137(n2 + 1L) + class17.method137(n10 + 1L);
        final double n14 = class17.method137(n2) - class17.method137(n10);
        final double n15 = class17.method137(n2 + 1L) - class17.method137(n10 + 1L);
        final double n16 = class17.method137(n9) + class17.method137(n11);
        final double n17 = class17.method137(n9 + 1L) + class17.method137(n11 + 1L);
        final double n18 = class17.method137(n9) - class17.method137(n11);
        final double n19 = class17.method137(n9 + 1L) - class17.method137(n11 + 1L);
        class17.method171(n2, n12 + n16);
        class17.method171(n2 + 1L, n13 + n17);
        class17.method171(n9, n12 - n16);
        class17.method171(n9 + 1L, n13 - n17);
        class17.method171(n10, n14 - n19);
        class17.method171(n10 + 1L, n15 + n18);
        class17.method171(n11, n14 + n19);
        class17.method171(n11 + 1L, n15 - n18);
        final double method137 = class18.method137(n3 + 1L);
        long n20 = 0L;
        for (long n21 = 2L; n21 < n4; n21 += 2L) {
            n20 += 4L;
            final long n22 = n3 + n20;
            final double method138 = class18.method137(n22);
            final double method139 = class18.method137(n22 + 1L);
            final double method140 = class18.method137(n22 + 2L);
            final double method141 = class18.method137(n22 + 3L);
            final long n23 = n21 + n5;
            final long n24 = n23 + n5;
            final long n25 = n24 + n5;
            final long n26 = n2 + n23;
            final long n27 = n2 + n24;
            final long n28 = n2 + n25;
            final long n29 = n2 + n21;
            final double n30 = class17.method137(n29) + class17.method137(n27);
            final double n31 = class17.method137(n29 + 1L) + class17.method137(n27 + 1L);
            final double n32 = class17.method137(n29) - class17.method137(n27);
            final double n33 = class17.method137(n29 + 1L) - class17.method137(n27 + 1L);
            final double n34 = class17.method137(n26) + class17.method137(n28);
            final double n35 = class17.method137(n26 + 1L) + class17.method137(n28 + 1L);
            final double n36 = class17.method137(n26) - class17.method137(n28);
            final double n37 = class17.method137(n26 + 1L) - class17.method137(n28 + 1L);
            class17.method171(n29, n30 + n34);
            class17.method171(n29 + 1L, n31 + n35);
            class17.method171(n26, n30 - n34);
            class17.method171(n26 + 1L, n31 - n35);
            final double n38 = n32 - n37;
            final double n39 = n33 + n36;
            class17.method171(n27, method138 * n38 - method139 * n39);
            class17.method171(n27 + 1L, method138 * n39 + method139 * n38);
            final double n40 = n32 + n37;
            final double n41 = n33 - n36;
            class17.method171(n28, method140 * n40 + method141 * n41);
            class17.method171(n28 + 1L, method140 * n41 - method141 * n40);
            final long n42 = n5 - n21;
            final long n43 = n42 + n5;
            final long n44 = n43 + n5;
            final long n45 = n44 + n5;
            final long n46 = n2 + n42;
            final long n47 = n2 + n43;
            final long n48 = n2 + n44;
            final long n49 = n2 + n45;
            final double n50 = class17.method137(n46) + class17.method137(n48);
            final double n51 = class17.method137(n46 + 1L) + class17.method137(n48 + 1L);
            final double n52 = class17.method137(n46) - class17.method137(n48);
            final double n53 = class17.method137(n46 + 1L) - class17.method137(n48 + 1L);
            final double n54 = class17.method137(n47) + class17.method137(n49);
            final double n55 = class17.method137(n47 + 1L) + class17.method137(n49 + 1L);
            final double n56 = class17.method137(n47) - class17.method137(n49);
            final double n57 = class17.method137(n47 + 1L) - class17.method137(n49 + 1L);
            class17.method171(n46, n50 + n54);
            class17.method171(n46 + 1L, n51 + n55);
            class17.method171(n47, n50 - n54);
            class17.method171(n47 + 1L, n51 - n55);
            final double n58 = n52 - n57;
            final double n59 = n53 + n56;
            class17.method171(n48, method139 * n58 - method138 * n59);
            class17.method171(n48 + 1L, method139 * n59 + method138 * n58);
            final double n60 = n52 + n57;
            final double n61 = n53 - n56;
            class17.method171(n49, method141 * n60 + method140 * n61);
            class17.method171(n49 + 1L, method141 * n61 - method140 * n60);
        }
        final long n62 = n4;
        final long n63 = n62 + n5;
        final long n64 = n63 + n5;
        final long n65 = n64 + n5;
        final long n66 = n2 + n62;
        final long n67 = n2 + n63;
        final long n68 = n2 + n64;
        final long n69 = n2 + n65;
        final double n70 = class17.method137(n66) + class17.method137(n68);
        final double n71 = class17.method137(n66 + 1L) + class17.method137(n68 + 1L);
        final double n72 = class17.method137(n66) - class17.method137(n68);
        final double n73 = class17.method137(n66 + 1L) - class17.method137(n68 + 1L);
        final double n74 = class17.method137(n67) + class17.method137(n69);
        final double n75 = class17.method137(n67 + 1L) + class17.method137(n69 + 1L);
        final double n76 = class17.method137(n67) - class17.method137(n69);
        final double n77 = class17.method137(n67 + 1L) - class17.method137(n69 + 1L);
        class17.method171(n66, n70 + n74);
        class17.method171(n66 + 1L, n71 + n75);
        class17.method171(n67, n70 - n74);
        class17.method171(n67 + 1L, n71 - n75);
        final double n78 = n72 - n77;
        final double n79 = n73 + n76;
        class17.method171(n68, method137 * (n78 - n79));
        class17.method171(n68 + 1L, method137 * (n79 + n78));
        final double n80 = n72 + n77;
        final double n81 = n73 - n76;
        class17.method171(n69, -method137 * (n80 + n81));
        class17.method171(n69 + 1L, -method137 * (n81 - n80));
    }
    
    public static void method33217(final int n, final double[] array, final int n2, final double[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n5 = 2 * n4;
        final double n6 = array2[n3 + 1];
        final int n7 = n5;
        final int n8 = n7 + n5;
        final int n9 = n8 + n5;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final int n12 = n2 + n9;
        final double n13 = array[n2] - array[n11 + 1];
        final double n14 = array[n2 + 1] + array[n11];
        final double n15 = array[n2] + array[n11 + 1];
        final double n16 = array[n2 + 1] - array[n11];
        final double n17 = array[n10] - array[n12 + 1];
        final double n18 = array[n10 + 1] + array[n12];
        final double n19 = array[n10] + array[n12 + 1];
        final double n20 = array[n10 + 1] - array[n12];
        final double n21 = n6 * (n17 - n18);
        final double n22 = n6 * (n18 + n17);
        array[n2] = n13 + n21;
        array[n2 + 1] = n14 + n22;
        array[n10] = n13 - n21;
        array[n10 + 1] = n14 - n22;
        final double n23 = n6 * (n19 - n20);
        final double n24 = n6 * (n20 + n19);
        array[n11] = n15 - n24;
        array[n11 + 1] = n16 + n23;
        array[n12] = n15 + n24;
        array[n12 + 1] = n16 - n23;
        int n25 = 0;
        int n26 = 2 * n5;
        for (int i = 2; i < n4; i += 2) {
            n25 += 4;
            final int n27 = n3 + n25;
            final double n28 = array2[n27];
            final double n29 = array2[n27 + 1];
            final double n30 = array2[n27 + 2];
            final double n31 = array2[n27 + 3];
            n26 -= 4;
            final int n32 = n3 + n26;
            final double n33 = array2[n32];
            final double n34 = array2[n32 + 1];
            final double n35 = array2[n32 + 2];
            final double n36 = array2[n32 + 3];
            final int n37 = i + n5;
            final int n38 = n37 + n5;
            final int n39 = n38 + n5;
            final int n40 = n2 + n37;
            final int n41 = n2 + n38;
            final int n42 = n2 + n39;
            final int n43 = n2 + i;
            final double n44 = array[n43] - array[n41 + 1];
            final double n45 = array[n43 + 1] + array[n41];
            final double n46 = array[n43] + array[n41 + 1];
            final double n47 = array[n43 + 1] - array[n41];
            final double n48 = array[n40] - array[n42 + 1];
            final double n49 = array[n40 + 1] + array[n42];
            final double n50 = array[n40] + array[n42 + 1];
            final double n51 = array[n40 + 1] - array[n42];
            final double n52 = n28 * n44 - n29 * n45;
            final double n53 = n28 * n45 + n29 * n44;
            final double n54 = n34 * n48 - n33 * n49;
            final double n55 = n34 * n49 + n33 * n48;
            array[n43] = n52 + n54;
            array[n43 + 1] = n53 + n55;
            array[n40] = n52 - n54;
            array[n40 + 1] = n53 - n55;
            final double n56 = n30 * n46 + n31 * n47;
            final double n57 = n30 * n47 - n31 * n46;
            final double n58 = n36 * n50 + n35 * n51;
            final double n59 = n36 * n51 - n35 * n50;
            array[n41] = n56 + n58;
            array[n41 + 1] = n57 + n59;
            array[n42] = n56 - n58;
            array[n42 + 1] = n57 - n59;
            final int n60 = n5 - i;
            final int n61 = n60 + n5;
            final int n62 = n61 + n5;
            final int n63 = n62 + n5;
            final int n64 = n2 + n60;
            final int n65 = n2 + n61;
            final int n66 = n2 + n62;
            final int n67 = n2 + n63;
            final double n68 = array[n64] - array[n66 + 1];
            final double n69 = array[n64 + 1] + array[n66];
            final double n70 = array[n64] + array[n66 + 1];
            final double n71 = array[n64 + 1] - array[n66];
            final double n72 = array[n65] - array[n67 + 1];
            final double n73 = array[n65 + 1] + array[n67];
            final double n74 = array[n65] + array[n67 + 1];
            final double n75 = array[n65 + 1] - array[n67];
            final double n76 = n33 * n68 - n34 * n69;
            final double n77 = n33 * n69 + n34 * n68;
            final double n78 = n29 * n72 - n28 * n73;
            final double n79 = n29 * n73 + n28 * n72;
            array[n64] = n76 + n78;
            array[n64 + 1] = n77 + n79;
            array[n65] = n76 - n78;
            array[n65 + 1] = n77 - n79;
            final double n80 = n35 * n70 + n36 * n71;
            final double n81 = n35 * n71 - n36 * n70;
            final double n82 = n31 * n74 + n30 * n75;
            final double n83 = n31 * n75 - n30 * n74;
            array[n66] = n80 + n82;
            array[n66 + 1] = n81 + n83;
            array[n67] = n80 - n82;
            array[n67 + 1] = n81 - n83;
        }
        final double n84 = array2[n3 + n5];
        final double n85 = array2[n3 + n5 + 1];
        final int n86 = n4;
        final int n87 = n86 + n5;
        final int n88 = n87 + n5;
        final int n89 = n88 + n5;
        final int n90 = n2 + n86;
        final int n91 = n2 + n87;
        final int n92 = n2 + n88;
        final int n93 = n2 + n89;
        final double n94 = array[n90] - array[n92 + 1];
        final double n95 = array[n90 + 1] + array[n92];
        final double n96 = array[n90] + array[n92 + 1];
        final double n97 = array[n90 + 1] - array[n92];
        final double n98 = array[n91] - array[n93 + 1];
        final double n99 = array[n91 + 1] + array[n93];
        final double n100 = array[n91] + array[n93 + 1];
        final double n101 = array[n91 + 1] - array[n93];
        final double n102 = n84 * n94 - n85 * n95;
        final double n103 = n84 * n95 + n85 * n94;
        final double n104 = n85 * n98 - n84 * n99;
        final double n105 = n85 * n99 + n84 * n98;
        array[n90] = n102 + n104;
        array[n90 + 1] = n103 + n105;
        array[n91] = n102 - n104;
        array[n91 + 1] = n103 - n105;
        final double n106 = n85 * n96 - n84 * n97;
        final double n107 = n85 * n97 + n84 * n96;
        final double n108 = n84 * n100 - n85 * n101;
        final double n109 = n84 * n101 + n85 * n100;
        array[n92] = n106 - n108;
        array[n92 + 1] = n107 - n109;
        array[n93] = n106 + n108;
        array[n93 + 1] = n107 + n109;
    }
    
    public static void method33218(final long n, final Class17 class17, final long n2, final Class17 class18, final long n3) {
        final long n4 = n >> 3;
        final long n5 = 2L * n4;
        final double method137 = class18.method137(n3 + 1L);
        final long n6 = n5;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final double n12 = class17.method137(n2) - class17.method137(n10 + 1L);
        final double n13 = class17.method137(n2 + 1L) + class17.method137(n10);
        final double n14 = class17.method137(n2) + class17.method137(n10 + 1L);
        final double n15 = class17.method137(n2 + 1L) - class17.method137(n10);
        final double n16 = class17.method137(n9) - class17.method137(n11 + 1L);
        final double n17 = class17.method137(n9 + 1L) + class17.method137(n11);
        final double n18 = class17.method137(n9) + class17.method137(n11 + 1L);
        final double n19 = class17.method137(n9 + 1L) - class17.method137(n11);
        final double n20 = method137 * (n16 - n17);
        final double n21 = method137 * (n17 + n16);
        class17.method171(n2, n12 + n20);
        class17.method171(n2 + 1L, n13 + n21);
        class17.method171(n9, n12 - n20);
        class17.method171(n9 + 1L, n13 - n21);
        final double n22 = method137 * (n18 - n19);
        final double n23 = method137 * (n19 + n18);
        class17.method171(n10, n14 - n23);
        class17.method171(n10 + 1L, n15 + n22);
        class17.method171(n11, n14 + n23);
        class17.method171(n11 + 1L, n15 - n22);
        long n24 = 0L;
        long n25 = 2L * n5;
        for (int n26 = 2; n26 < n4; n26 += 2) {
            n24 += 4L;
            final long n27 = n3 + n24;
            final double method138 = class18.method137(n27);
            final double method139 = class18.method137(n27 + 1L);
            final double method140 = class18.method137(n27 + 2L);
            final double method141 = class18.method137(n27 + 3L);
            n25 -= 4L;
            final long n28 = n3 + n25;
            final double method142 = class18.method137(n28);
            final double method143 = class18.method137(n28 + 1L);
            final double method144 = class18.method137(n28 + 2L);
            final double method145 = class18.method137(n28 + 3L);
            final long n29 = n26 + n5;
            final long n30 = n29 + n5;
            final long n31 = n30 + n5;
            final long n32 = n2 + n29;
            final long n33 = n2 + n30;
            final long n34 = n2 + n31;
            final long n35 = n2 + n26;
            final double n36 = class17.method137(n35) - class17.method137(n33 + 1L);
            final double n37 = class17.method137(n35 + 1L) + class17.method137(n33);
            final double n38 = class17.method137(n35) + class17.method137(n33 + 1L);
            final double n39 = class17.method137(n35 + 1L) - class17.method137(n33);
            final double n40 = class17.method137(n32) - class17.method137(n34 + 1L);
            final double n41 = class17.method137(n32 + 1L) + class17.method137(n34);
            final double n42 = class17.method137(n32) + class17.method137(n34 + 1L);
            final double n43 = class17.method137(n32 + 1L) - class17.method137(n34);
            final double n44 = method138 * n36 - method139 * n37;
            final double n45 = method138 * n37 + method139 * n36;
            final double n46 = method143 * n40 - method142 * n41;
            final double n47 = method143 * n41 + method142 * n40;
            class17.method171(n35, n44 + n46);
            class17.method171(n35 + 1L, n45 + n47);
            class17.method171(n32, n44 - n46);
            class17.method171(n32 + 1L, n45 - n47);
            final double n48 = method140 * n38 + method141 * n39;
            final double n49 = method140 * n39 - method141 * n38;
            final double n50 = method145 * n42 + method144 * n43;
            final double n51 = method145 * n43 - method144 * n42;
            class17.method171(n33, n48 + n50);
            class17.method171(n33 + 1L, n49 + n51);
            class17.method171(n34, n48 - n50);
            class17.method171(n34 + 1L, n49 - n51);
            final long n52 = n5 - n26;
            final long n53 = n52 + n5;
            final long n54 = n53 + n5;
            final long n55 = n54 + n5;
            final long n56 = n2 + n52;
            final long n57 = n2 + n53;
            final long n58 = n2 + n54;
            final long n59 = n2 + n55;
            final double n60 = class17.method137(n56) - class17.method137(n58 + 1L);
            final double n61 = class17.method137(n56 + 1L) + class17.method137(n58);
            final double n62 = class17.method137(n56) + class17.method137(n58 + 1L);
            final double n63 = class17.method137(n56 + 1L) - class17.method137(n58);
            final double n64 = class17.method137(n57) - class17.method137(n59 + 1L);
            final double n65 = class17.method137(n57 + 1L) + class17.method137(n59);
            final double n66 = class17.method137(n57) + class17.method137(n59 + 1L);
            final double n67 = class17.method137(n57 + 1L) - class17.method137(n59);
            final double n68 = method142 * n60 - method143 * n61;
            final double n69 = method142 * n61 + method143 * n60;
            final double n70 = method139 * n64 - method138 * n65;
            final double n71 = method139 * n65 + method138 * n64;
            class17.method171(n56, n68 + n70);
            class17.method171(n56 + 1L, n69 + n71);
            class17.method171(n57, n68 - n70);
            class17.method171(n57 + 1L, n69 - n71);
            final double n72 = method144 * n62 + method145 * n63;
            final double n73 = method144 * n63 - method145 * n62;
            final double n74 = method141 * n66 + method140 * n67;
            final double n75 = method141 * n67 - method140 * n66;
            class17.method171(n58, n72 + n74);
            class17.method171(n58 + 1L, n73 + n75);
            class17.method171(n59, n72 - n74);
            class17.method171(n59 + 1L, n73 - n75);
        }
        final double method146 = class18.method137(n3 + n5);
        final double method147 = class18.method137(n3 + n5 + 1L);
        final long n76 = n4;
        final long n77 = n76 + n5;
        final long n78 = n77 + n5;
        final long n79 = n78 + n5;
        final long n80 = n2 + n76;
        final long n81 = n2 + n77;
        final long n82 = n2 + n78;
        final long n83 = n2 + n79;
        final double n84 = class17.method137(n80) - class17.method137(n82 + 1L);
        final double n85 = class17.method137(n80 + 1L) + class17.method137(n82);
        final double n86 = class17.method137(n80) + class17.method137(n82 + 1L);
        final double n87 = class17.method137(n80 + 1L) - class17.method137(n82);
        final double n88 = class17.method137(n81) - class17.method137(n83 + 1L);
        final double n89 = class17.method137(n81 + 1L) + class17.method137(n83);
        final double n90 = class17.method137(n81) + class17.method137(n83 + 1L);
        final double n91 = class17.method137(n81 + 1L) - class17.method137(n83);
        final double n92 = method146 * n84 - method147 * n85;
        final double n93 = method146 * n85 + method147 * n84;
        final double n94 = method147 * n88 - method146 * n89;
        final double n95 = method147 * n89 + method146 * n88;
        class17.method171(n80, n92 + n94);
        class17.method171(n80 + 1L, n93 + n95);
        class17.method171(n81, n92 - n94);
        class17.method171(n81 + 1L, n93 - n95);
        final double n96 = method147 * n86 - method146 * n87;
        final double n97 = method147 * n87 + method146 * n86;
        final double n98 = method146 * n90 - method147 * n91;
        final double n99 = method146 * n91 + method147 * n90;
        class17.method171(n82, n96 - n98);
        class17.method171(n82 + 1L, n97 - n99);
        class17.method171(n83, n96 + n98);
        class17.method171(n83 + 1L, n97 + n99);
    }
    
    public static void method33219(final int n, final double[] array, final int n2, final int n3, final double[] array2) {
        if (n != 128) {
            method33225(array, n2, array2, n3 - 8);
            method33227(array, n2 + 16, array2, n3 - 8);
            method33225(array, n2 + 32, array2, n3 - 8);
            method33225(array, n2 + 48, array2, n3 - 8);
        }
        else {
            method33221(array, n2, array2, n3 - 8);
            method33223(array, n2 + 32, array2, n3 - 32);
            method33221(array, n2 + 64, array2, n3 - 8);
            method33221(array, n2 + 96, array2, n3 - 8);
        }
    }
    
    public static void method33220(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18) {
        if (n != 128L) {
            method33226(class17, n2, class18, n3 - 8L);
            method33228(class17, n2 + 16L, class18, n3 - 8L);
            method33226(class17, n2 + 32L, class18, n3 - 8L);
            method33226(class17, n2 + 48L, class18, n3 - 8L);
        }
        else {
            method33222(class17, n2, class18, n3 - 8L);
            method33224(class17, n2 + 32L, class18, n3 - 32L);
            method33222(class17, n2 + 64L, class18, n3 - 8L);
            method33222(class17, n2 + 96L, class18, n3 - 8L);
        }
    }
    
    public static void method33221(final double[] array, final int n, final double[] array2, final int n2) {
        final double n3 = array2[n2 + 1];
        final double n4 = array2[n2 + 2];
        final double n5 = array2[n2 + 3];
        final double n6 = array[n] + array[n + 16];
        final double n7 = array[n + 1] + array[n + 17];
        final double n8 = array[n] - array[n + 16];
        final double n9 = array[n + 1] - array[n + 17];
        final double n10 = array[n + 8] + array[n + 24];
        final double n11 = array[n + 9] + array[n + 25];
        final double n12 = array[n + 8] - array[n + 24];
        final double n13 = array[n + 9] - array[n + 25];
        final double n14 = n6 + n10;
        final double n15 = n7 + n11;
        final double n16 = n6 - n10;
        final double n17 = n7 - n11;
        final double n18 = n8 - n13;
        final double n19 = n9 + n12;
        final double n20 = n8 + n13;
        final double n21 = n9 - n12;
        final double n22 = array[n + 2] + array[n + 18];
        final double n23 = array[n + 3] + array[n + 19];
        final double n24 = array[n + 2] - array[n + 18];
        final double n25 = array[n + 3] - array[n + 19];
        final double n26 = array[n + 10] + array[n + 26];
        final double n27 = array[n + 11] + array[n + 27];
        final double n28 = array[n + 10] - array[n + 26];
        final double n29 = array[n + 11] - array[n + 27];
        final double n30 = n22 + n26;
        final double n31 = n23 + n27;
        final double n32 = n22 - n26;
        final double n33 = n23 - n27;
        final double n34 = n24 - n29;
        final double n35 = n25 + n28;
        final double n36 = n4 * n34 - n5 * n35;
        final double n37 = n4 * n35 + n5 * n34;
        final double n38 = n24 + n29;
        final double n39 = n25 - n28;
        final double n40 = n5 * n38 - n4 * n39;
        final double n41 = n5 * n39 + n4 * n38;
        final double n42 = array[n + 4] + array[n + 20];
        final double n43 = array[n + 5] + array[n + 21];
        final double n44 = array[n + 4] - array[n + 20];
        final double n45 = array[n + 5] - array[n + 21];
        final double n46 = array[n + 12] + array[n + 28];
        final double n47 = array[n + 13] + array[n + 29];
        final double n48 = array[n + 12] - array[n + 28];
        final double n49 = array[n + 13] - array[n + 29];
        final double n50 = n42 + n46;
        final double n51 = n43 + n47;
        final double n52 = n42 - n46;
        final double n53 = n43 - n47;
        final double n54 = n44 - n49;
        final double n55 = n45 + n48;
        final double n56 = n3 * (n54 - n55);
        final double n57 = n3 * (n55 + n54);
        final double n58 = n44 + n49;
        final double n59 = n45 - n48;
        final double n60 = n3 * (n58 + n59);
        final double n61 = n3 * (n59 - n58);
        final double n62 = array[n + 6] + array[n + 22];
        final double n63 = array[n + 7] + array[n + 23];
        final double n64 = array[n + 6] - array[n + 22];
        final double n65 = array[n + 7] - array[n + 23];
        final double n66 = array[n + 14] + array[n + 30];
        final double n67 = array[n + 15] + array[n + 31];
        final double n68 = array[n + 14] - array[n + 30];
        final double n69 = array[n + 15] - array[n + 31];
        final double n70 = n62 + n66;
        final double n71 = n63 + n67;
        final double n72 = n62 - n66;
        final double n73 = n63 - n67;
        final double n74 = n64 - n69;
        final double n75 = n65 + n68;
        final double n76 = n5 * n74 - n4 * n75;
        final double n77 = n5 * n75 + n4 * n74;
        final double n78 = n64 + n69;
        final double n79 = n65 - n68;
        final double n80 = n4 * n78 - n5 * n79;
        final double n81 = n4 * n79 + n5 * n78;
        final double n82 = n20 - n60;
        final double n83 = n21 - n61;
        final double n84 = n20 + n60;
        final double n85 = n21 + n61;
        final double n86 = n40 - n80;
        final double n87 = n41 - n81;
        final double n88 = n40 + n80;
        final double n89 = n41 + n81;
        array[n + 24] = n82 + n86;
        array[n + 25] = n83 + n87;
        array[n + 26] = n82 - n86;
        array[n + 27] = n83 - n87;
        array[n + 28] = n84 - n89;
        array[n + 29] = n85 + n88;
        array[n + 30] = n84 + n89;
        array[n + 31] = n85 - n88;
        final double n90 = n18 + n56;
        final double n91 = n19 + n57;
        final double n92 = n18 - n56;
        final double n93 = n19 - n57;
        final double n94 = n36 + n76;
        final double n95 = n37 + n77;
        final double n96 = n36 - n76;
        final double n97 = n37 - n77;
        array[n + 16] = n90 + n94;
        array[n + 17] = n91 + n95;
        array[n + 18] = n90 - n94;
        array[n + 19] = n91 - n95;
        array[n + 20] = n92 - n97;
        array[n + 21] = n93 + n96;
        array[n + 22] = n92 + n97;
        array[n + 23] = n93 - n96;
        final double n98 = n32 - n73;
        final double n99 = n33 + n72;
        final double n100 = n3 * (n98 - n99);
        final double n101 = n3 * (n99 + n98);
        final double n102 = n32 + n73;
        final double n103 = n33 - n72;
        final double n104 = n3 * (n102 - n103);
        final double n105 = n3 * (n103 + n102);
        final double n106 = n16 - n53;
        final double n107 = n17 + n52;
        final double n108 = n16 + n53;
        final double n109 = n17 - n52;
        array[n + 8] = n106 + n100;
        array[n + 9] = n107 + n101;
        array[n + 10] = n106 - n100;
        array[n + 11] = n107 - n101;
        array[n + 12] = n108 - n105;
        array[n + 13] = n109 + n104;
        array[n + 14] = n108 + n105;
        array[n + 15] = n109 - n104;
        final double n110 = n14 + n50;
        final double n111 = n15 + n51;
        final double n112 = n14 - n50;
        final double n113 = n15 - n51;
        final double n114 = n30 + n70;
        final double n115 = n31 + n71;
        final double n116 = n30 - n70;
        final double n117 = n31 - n71;
        array[n] = n110 + n114;
        array[n + 1] = n111 + n115;
        array[n + 2] = n110 - n114;
        array[n + 3] = n111 - n115;
        array[n + 4] = n112 - n117;
        array[n + 5] = n113 + n116;
        array[n + 6] = n112 + n117;
        array[n + 7] = n113 - n116;
    }
    
    public static void method33222(final Class17 class17, final long n, final Class17 class18, final long n2) {
        final double method137 = class18.method137(n2 + 1L);
        final double method138 = class18.method137(n2 + 2L);
        final double method139 = class18.method137(n2 + 3L);
        final double n3 = class17.method137(n) + class17.method137(n + 16L);
        final double n4 = class17.method137(n + 1L) + class17.method137(n + 17L);
        final double n5 = class17.method137(n) - class17.method137(n + 16L);
        final double n6 = class17.method137(n + 1L) - class17.method137(n + 17L);
        final double n7 = class17.method137(n + 8L) + class17.method137(n + 24L);
        final double n8 = class17.method137(n + 9L) + class17.method137(n + 25L);
        final double n9 = class17.method137(n + 8L) - class17.method137(n + 24L);
        final double n10 = class17.method137(n + 9L) - class17.method137(n + 25L);
        final double n11 = n3 + n7;
        final double n12 = n4 + n8;
        final double n13 = n3 - n7;
        final double n14 = n4 - n8;
        final double n15 = n5 - n10;
        final double n16 = n6 + n9;
        final double n17 = n5 + n10;
        final double n18 = n6 - n9;
        final double n19 = class17.method137(n + 2L) + class17.method137(n + 18L);
        final double n20 = class17.method137(n + 3L) + class17.method137(n + 19L);
        final double n21 = class17.method137(n + 2L) - class17.method137(n + 18L);
        final double n22 = class17.method137(n + 3L) - class17.method137(n + 19L);
        final double n23 = class17.method137(n + 10L) + class17.method137(n + 26L);
        final double n24 = class17.method137(n + 11L) + class17.method137(n + 27L);
        final double n25 = class17.method137(n + 10L) - class17.method137(n + 26L);
        final double n26 = class17.method137(n + 11L) - class17.method137(n + 27L);
        final double n27 = n19 + n23;
        final double n28 = n20 + n24;
        final double n29 = n19 - n23;
        final double n30 = n20 - n24;
        final double n31 = n21 - n26;
        final double n32 = n22 + n25;
        final double n33 = method138 * n31 - method139 * n32;
        final double n34 = method138 * n32 + method139 * n31;
        final double n35 = n21 + n26;
        final double n36 = n22 - n25;
        final double n37 = method139 * n35 - method138 * n36;
        final double n38 = method139 * n36 + method138 * n35;
        final double n39 = class17.method137(n + 4L) + class17.method137(n + 20L);
        final double n40 = class17.method137(n + 5L) + class17.method137(n + 21L);
        final double n41 = class17.method137(n + 4L) - class17.method137(n + 20L);
        final double n42 = class17.method137(n + 5L) - class17.method137(n + 21L);
        final double n43 = class17.method137(n + 12L) + class17.method137(n + 28L);
        final double n44 = class17.method137(n + 13L) + class17.method137(n + 29L);
        final double n45 = class17.method137(n + 12L) - class17.method137(n + 28L);
        final double n46 = class17.method137(n + 13L) - class17.method137(n + 29L);
        final double n47 = n39 + n43;
        final double n48 = n40 + n44;
        final double n49 = n39 - n43;
        final double n50 = n40 - n44;
        final double n51 = n41 - n46;
        final double n52 = n42 + n45;
        final double n53 = method137 * (n51 - n52);
        final double n54 = method137 * (n52 + n51);
        final double n55 = n41 + n46;
        final double n56 = n42 - n45;
        final double n57 = method137 * (n55 + n56);
        final double n58 = method137 * (n56 - n55);
        final double n59 = class17.method137(n + 6L) + class17.method137(n + 22L);
        final double n60 = class17.method137(n + 7L) + class17.method137(n + 23L);
        final double n61 = class17.method137(n + 6L) - class17.method137(n + 22L);
        final double n62 = class17.method137(n + 7L) - class17.method137(n + 23L);
        final double n63 = class17.method137(n + 14L) + class17.method137(n + 30L);
        final double n64 = class17.method137(n + 15L) + class17.method137(n + 31L);
        final double n65 = class17.method137(n + 14L) - class17.method137(n + 30L);
        final double n66 = class17.method137(n + 15L) - class17.method137(n + 31L);
        final double n67 = n59 + n63;
        final double n68 = n60 + n64;
        final double n69 = n59 - n63;
        final double n70 = n60 - n64;
        final double n71 = n61 - n66;
        final double n72 = n62 + n65;
        final double n73 = method139 * n71 - method138 * n72;
        final double n74 = method139 * n72 + method138 * n71;
        final double n75 = n61 + n66;
        final double n76 = n62 - n65;
        final double n77 = method138 * n75 - method139 * n76;
        final double n78 = method138 * n76 + method139 * n75;
        final double n79 = n17 - n57;
        final double n80 = n18 - n58;
        final double n81 = n17 + n57;
        final double n82 = n18 + n58;
        final double n83 = n37 - n77;
        final double n84 = n38 - n78;
        final double n85 = n37 + n77;
        final double n86 = n38 + n78;
        class17.method171(n + 24L, n79 + n83);
        class17.method171(n + 25L, n80 + n84);
        class17.method171(n + 26L, n79 - n83);
        class17.method171(n + 27L, n80 - n84);
        class17.method171(n + 28L, n81 - n86);
        class17.method171(n + 29L, n82 + n85);
        class17.method171(n + 30L, n81 + n86);
        class17.method171(n + 31L, n82 - n85);
        final double n87 = n15 + n53;
        final double n88 = n16 + n54;
        final double n89 = n15 - n53;
        final double n90 = n16 - n54;
        final double n91 = n33 + n73;
        final double n92 = n34 + n74;
        final double n93 = n33 - n73;
        final double n94 = n34 - n74;
        class17.method171(n + 16L, n87 + n91);
        class17.method171(n + 17L, n88 + n92);
        class17.method171(n + 18L, n87 - n91);
        class17.method171(n + 19L, n88 - n92);
        class17.method171(n + 20L, n89 - n94);
        class17.method171(n + 21L, n90 + n93);
        class17.method171(n + 22L, n89 + n94);
        class17.method171(n + 23L, n90 - n93);
        final double n95 = n29 - n70;
        final double n96 = n30 + n69;
        final double n97 = method137 * (n95 - n96);
        final double n98 = method137 * (n96 + n95);
        final double n99 = n29 + n70;
        final double n100 = n30 - n69;
        final double n101 = method137 * (n99 - n100);
        final double n102 = method137 * (n100 + n99);
        final double n103 = n13 - n50;
        final double n104 = n14 + n49;
        final double n105 = n13 + n50;
        final double n106 = n14 - n49;
        class17.method171(n + 8L, n103 + n97);
        class17.method171(n + 9L, n104 + n98);
        class17.method171(n + 10L, n103 - n97);
        class17.method171(n + 11L, n104 - n98);
        class17.method171(n + 12L, n105 - n102);
        class17.method171(n + 13L, n106 + n101);
        class17.method171(n + 14L, n105 + n102);
        class17.method171(n + 15L, n106 - n101);
        final double n107 = n11 + n47;
        final double n108 = n12 + n48;
        final double n109 = n11 - n47;
        final double n110 = n12 - n48;
        final double n111 = n27 + n67;
        final double n112 = n28 + n68;
        final double n113 = n27 - n67;
        final double n114 = n28 - n68;
        class17.method171(n, n107 + n111);
        class17.method171(n + 1L, n108 + n112);
        class17.method171(n + 2L, n107 - n111);
        class17.method171(n + 3L, n108 - n112);
        class17.method171(n + 4L, n109 - n114);
        class17.method171(n + 5L, n110 + n113);
        class17.method171(n + 6L, n109 + n114);
        class17.method171(n + 7L, n110 - n113);
    }
    
    public static void method33223(final double[] array, final int n, final double[] array2, final int n2) {
        final double n3 = array2[n2 + 1];
        final double n4 = array2[n2 + 4];
        final double n5 = array2[n2 + 5];
        final double n6 = array2[n2 + 6];
        final double n7 = -array2[n2 + 7];
        final double n8 = array2[n2 + 8];
        final double n9 = array2[n2 + 9];
        final double n10 = array[n] - array[n + 17];
        final double n11 = array[n + 1] + array[n + 16];
        final double n12 = array[n + 8] - array[n + 25];
        final double n13 = array[n + 9] + array[n + 24];
        final double n14 = n3 * (n12 - n13);
        final double n15 = n3 * (n13 + n12);
        final double n16 = n10 + n14;
        final double n17 = n11 + n15;
        final double n18 = n10 - n14;
        final double n19 = n11 - n15;
        final double n20 = array[n] + array[n + 17];
        final double n21 = array[n + 1] - array[n + 16];
        final double n22 = array[n + 8] + array[n + 25];
        final double n23 = array[n + 9] - array[n + 24];
        final double n24 = n3 * (n22 - n23);
        final double n25 = n3 * (n23 + n22);
        final double n26 = n20 - n25;
        final double n27 = n21 + n24;
        final double n28 = n20 + n25;
        final double n29 = n21 - n24;
        final double n30 = array[n + 2] - array[n + 19];
        final double n31 = array[n + 3] + array[n + 18];
        final double n32 = n4 * n30 - n5 * n31;
        final double n33 = n4 * n31 + n5 * n30;
        final double n34 = array[n + 10] - array[n + 27];
        final double n35 = array[n + 11] + array[n + 26];
        final double n36 = n7 * n34 - n6 * n35;
        final double n37 = n7 * n35 + n6 * n34;
        final double n38 = n32 + n36;
        final double n39 = n33 + n37;
        final double n40 = n32 - n36;
        final double n41 = n33 - n37;
        final double n42 = array[n + 2] + array[n + 19];
        final double n43 = array[n + 3] - array[n + 18];
        final double n44 = n6 * n42 - n7 * n43;
        final double n45 = n6 * n43 + n7 * n42;
        final double n46 = array[n + 10] + array[n + 27];
        final double n47 = array[n + 11] - array[n + 26];
        final double n48 = n4 * n46 + n5 * n47;
        final double n49 = n4 * n47 - n5 * n46;
        final double n50 = n44 - n48;
        final double n51 = n45 - n49;
        final double n52 = n44 + n48;
        final double n53 = n45 + n49;
        final double n54 = array[n + 4] - array[n + 21];
        final double n55 = array[n + 5] + array[n + 20];
        final double n56 = n8 * n54 - n9 * n55;
        final double n57 = n8 * n55 + n9 * n54;
        final double n58 = array[n + 12] - array[n + 29];
        final double n59 = array[n + 13] + array[n + 28];
        final double n60 = n9 * n58 - n8 * n59;
        final double n61 = n9 * n59 + n8 * n58;
        final double n62 = n56 + n60;
        final double n63 = n57 + n61;
        final double n64 = n56 - n60;
        final double n65 = n57 - n61;
        final double n66 = array[n + 4] + array[n + 21];
        final double n67 = array[n + 5] - array[n + 20];
        final double n68 = n9 * n66 - n8 * n67;
        final double n69 = n9 * n67 + n8 * n66;
        final double n70 = array[n + 12] + array[n + 29];
        final double n71 = array[n + 13] - array[n + 28];
        final double n72 = n8 * n70 - n9 * n71;
        final double n73 = n8 * n71 + n9 * n70;
        final double n74 = n68 - n72;
        final double n75 = n69 - n73;
        final double n76 = n68 + n72;
        final double n77 = n69 + n73;
        final double n78 = array[n + 6] - array[n + 23];
        final double n79 = array[n + 7] + array[n + 22];
        final double n80 = n6 * n78 - n7 * n79;
        final double n81 = n6 * n79 + n7 * n78;
        final double n82 = array[n + 14] - array[n + 31];
        final double n83 = array[n + 15] + array[n + 30];
        final double n84 = n5 * n82 - n4 * n83;
        final double n85 = n5 * n83 + n4 * n82;
        final double n86 = n80 + n84;
        final double n87 = n81 + n85;
        final double n88 = n80 - n84;
        final double n89 = n81 - n85;
        final double n90 = array[n + 6] + array[n + 23];
        final double n91 = array[n + 7] - array[n + 22];
        final double n92 = n5 * n90 + n4 * n91;
        final double n93 = n5 * n91 - n4 * n90;
        final double n94 = array[n + 14] + array[n + 31];
        final double n95 = array[n + 15] - array[n + 30];
        final double n96 = n7 * n94 - n6 * n95;
        final double n97 = n7 * n95 + n6 * n94;
        final double n98 = n92 + n96;
        final double n99 = n93 + n97;
        final double n100 = n92 - n96;
        final double n101 = n93 - n97;
        final double n102 = n16 + n62;
        final double n103 = n17 + n63;
        final double n104 = n38 + n86;
        final double n105 = n39 + n87;
        array[n] = n102 + n104;
        array[n + 1] = n103 + n105;
        array[n + 2] = n102 - n104;
        array[n + 3] = n103 - n105;
        final double n106 = n16 - n62;
        final double n107 = n17 - n63;
        final double n108 = n38 - n86;
        final double n109 = n39 - n87;
        array[n + 4] = n106 - n109;
        array[n + 5] = n107 + n108;
        array[n + 6] = n106 + n109;
        array[n + 7] = n107 - n108;
        final double n110 = n18 - n65;
        final double n111 = n19 + n64;
        final double n112 = n40 - n89;
        final double n113 = n41 + n88;
        final double n114 = n3 * (n112 - n113);
        final double n115 = n3 * (n113 + n112);
        array[n + 8] = n110 + n114;
        array[n + 9] = n111 + n115;
        array[n + 10] = n110 - n114;
        array[n + 11] = n111 - n115;
        final double n116 = n18 + n65;
        final double n117 = n19 - n64;
        final double n118 = n40 + n89;
        final double n119 = n41 - n88;
        final double n120 = n3 * (n118 - n119);
        final double n121 = n3 * (n119 + n118);
        array[n + 12] = n116 - n121;
        array[n + 13] = n117 + n120;
        array[n + 14] = n116 + n121;
        array[n + 15] = n117 - n120;
        final double n122 = n26 + n74;
        final double n123 = n27 + n75;
        final double n124 = n50 - n98;
        final double n125 = n51 - n99;
        array[n + 16] = n122 + n124;
        array[n + 17] = n123 + n125;
        array[n + 18] = n122 - n124;
        array[n + 19] = n123 - n125;
        final double n126 = n26 - n74;
        final double n127 = n27 - n75;
        final double n128 = n50 + n98;
        final double n129 = n51 + n99;
        array[n + 20] = n126 - n129;
        array[n + 21] = n127 + n128;
        array[n + 22] = n126 + n129;
        array[n + 23] = n127 - n128;
        final double n130 = n28 - n77;
        final double n131 = n29 + n76;
        final double n132 = n52 + n101;
        final double n133 = n53 - n100;
        final double n134 = n3 * (n132 - n133);
        final double n135 = n3 * (n133 + n132);
        array[n + 24] = n130 + n134;
        array[n + 25] = n131 + n135;
        array[n + 26] = n130 - n134;
        array[n + 27] = n131 - n135;
        final double n136 = n28 + n77;
        final double n137 = n29 - n76;
        final double n138 = n52 - n101;
        final double n139 = n53 + n100;
        final double n140 = n3 * (n138 - n139);
        final double n141 = n3 * (n139 + n138);
        array[n + 28] = n136 - n141;
        array[n + 29] = n137 + n140;
        array[n + 30] = n136 + n141;
        array[n + 31] = n137 - n140;
    }
    
    public static void method33224(final Class17 class17, final long n, final Class17 class18, final long n2) {
        final double method137 = class18.method137(n2 + 1L);
        final double method138 = class18.method137(n2 + 4L);
        final double method139 = class18.method137(n2 + 5L);
        final double method140 = class18.method137(n2 + 6L);
        final double n3 = -class18.method137(n2 + 7L);
        final double method141 = class18.method137(n2 + 8L);
        final double method142 = class18.method137(n2 + 9L);
        final double n4 = class17.method137(n) - class17.method137(n + 17L);
        final double n5 = class17.method137(n + 1L) + class17.method137(n + 16L);
        final double n6 = class17.method137(n + 8L) - class17.method137(n + 25L);
        final double n7 = class17.method137(n + 9L) + class17.method137(n + 24L);
        final double n8 = method137 * (n6 - n7);
        final double n9 = method137 * (n7 + n6);
        final double n10 = n4 + n8;
        final double n11 = n5 + n9;
        final double n12 = n4 - n8;
        final double n13 = n5 - n9;
        final double n14 = class17.method137(n) + class17.method137(n + 17L);
        final double n15 = class17.method137(n + 1L) - class17.method137(n + 16L);
        final double n16 = class17.method137(n + 8L) + class17.method137(n + 25L);
        final double n17 = class17.method137(n + 9L) - class17.method137(n + 24L);
        final double n18 = method137 * (n16 - n17);
        final double n19 = method137 * (n17 + n16);
        final double n20 = n14 - n19;
        final double n21 = n15 + n18;
        final double n22 = n14 + n19;
        final double n23 = n15 - n18;
        final double n24 = class17.method137(n + 2L) - class17.method137(n + 19L);
        final double n25 = class17.method137(n + 3L) + class17.method137(n + 18L);
        final double n26 = method138 * n24 - method139 * n25;
        final double n27 = method138 * n25 + method139 * n24;
        final double n28 = class17.method137(n + 10L) - class17.method137(n + 27L);
        final double n29 = class17.method137(n + 11L) + class17.method137(n + 26L);
        final double n30 = n3 * n28 - method140 * n29;
        final double n31 = n3 * n29 + method140 * n28;
        final double n32 = n26 + n30;
        final double n33 = n27 + n31;
        final double n34 = n26 - n30;
        final double n35 = n27 - n31;
        final double n36 = class17.method137(n + 2L) + class17.method137(n + 19L);
        final double n37 = class17.method137(n + 3L) - class17.method137(n + 18L);
        final double n38 = method140 * n36 - n3 * n37;
        final double n39 = method140 * n37 + n3 * n36;
        final double n40 = class17.method137(n + 10L) + class17.method137(n + 27L);
        final double n41 = class17.method137(n + 11L) - class17.method137(n + 26L);
        final double n42 = method138 * n40 + method139 * n41;
        final double n43 = method138 * n41 - method139 * n40;
        final double n44 = n38 - n42;
        final double n45 = n39 - n43;
        final double n46 = n38 + n42;
        final double n47 = n39 + n43;
        final double n48 = class17.method137(n + 4L) - class17.method137(n + 21L);
        final double n49 = class17.method137(n + 5L) + class17.method137(n + 20L);
        final double n50 = method141 * n48 - method142 * n49;
        final double n51 = method141 * n49 + method142 * n48;
        final double n52 = class17.method137(n + 12L) - class17.method137(n + 29L);
        final double n53 = class17.method137(n + 13L) + class17.method137(n + 28L);
        final double n54 = method142 * n52 - method141 * n53;
        final double n55 = method142 * n53 + method141 * n52;
        final double n56 = n50 + n54;
        final double n57 = n51 + n55;
        final double n58 = n50 - n54;
        final double n59 = n51 - n55;
        final double n60 = class17.method137(n + 4L) + class17.method137(n + 21L);
        final double n61 = class17.method137(n + 5L) - class17.method137(n + 20L);
        final double n62 = method142 * n60 - method141 * n61;
        final double n63 = method142 * n61 + method141 * n60;
        final double n64 = class17.method137(n + 12L) + class17.method137(n + 29L);
        final double n65 = class17.method137(n + 13L) - class17.method137(n + 28L);
        final double n66 = method141 * n64 - method142 * n65;
        final double n67 = method141 * n65 + method142 * n64;
        final double n68 = n62 - n66;
        final double n69 = n63 - n67;
        final double n70 = n62 + n66;
        final double n71 = n63 + n67;
        final double n72 = class17.method137(n + 6L) - class17.method137(n + 23L);
        final double n73 = class17.method137(n + 7L) + class17.method137(n + 22L);
        final double n74 = method140 * n72 - n3 * n73;
        final double n75 = method140 * n73 + n3 * n72;
        final double n76 = class17.method137(n + 14L) - class17.method137(n + 31L);
        final double n77 = class17.method137(n + 15L) + class17.method137(n + 30L);
        final double n78 = method139 * n76 - method138 * n77;
        final double n79 = method139 * n77 + method138 * n76;
        final double n80 = n74 + n78;
        final double n81 = n75 + n79;
        final double n82 = n74 - n78;
        final double n83 = n75 - n79;
        final double n84 = class17.method137(n + 6L) + class17.method137(n + 23L);
        final double n85 = class17.method137(n + 7L) - class17.method137(n + 22L);
        final double n86 = method139 * n84 + method138 * n85;
        final double n87 = method139 * n85 - method138 * n84;
        final double n88 = class17.method137(n + 14L) + class17.method137(n + 31L);
        final double n89 = class17.method137(n + 15L) - class17.method137(n + 30L);
        final double n90 = n3 * n88 - method140 * n89;
        final double n91 = n3 * n89 + method140 * n88;
        final double n92 = n86 + n90;
        final double n93 = n87 + n91;
        final double n94 = n86 - n90;
        final double n95 = n87 - n91;
        final double n96 = n10 + n56;
        final double n97 = n11 + n57;
        final double n98 = n32 + n80;
        final double n99 = n33 + n81;
        class17.method171(n, n96 + n98);
        class17.method171(n + 1L, n97 + n99);
        class17.method171(n + 2L, n96 - n98);
        class17.method171(n + 3L, n97 - n99);
        final double n100 = n10 - n56;
        final double n101 = n11 - n57;
        final double n102 = n32 - n80;
        final double n103 = n33 - n81;
        class17.method171(n + 4L, n100 - n103);
        class17.method171(n + 5L, n101 + n102);
        class17.method171(n + 6L, n100 + n103);
        class17.method171(n + 7L, n101 - n102);
        final double n104 = n12 - n59;
        final double n105 = n13 + n58;
        final double n106 = n34 - n83;
        final double n107 = n35 + n82;
        final double n108 = method137 * (n106 - n107);
        final double n109 = method137 * (n107 + n106);
        class17.method171(n + 8L, n104 + n108);
        class17.method171(n + 9L, n105 + n109);
        class17.method171(n + 10L, n104 - n108);
        class17.method171(n + 11L, n105 - n109);
        final double n110 = n12 + n59;
        final double n111 = n13 - n58;
        final double n112 = n34 + n83;
        final double n113 = n35 - n82;
        final double n114 = method137 * (n112 - n113);
        final double n115 = method137 * (n113 + n112);
        class17.method171(n + 12L, n110 - n115);
        class17.method171(n + 13L, n111 + n114);
        class17.method171(n + 14L, n110 + n115);
        class17.method171(n + 15L, n111 - n114);
        final double n116 = n20 + n68;
        final double n117 = n21 + n69;
        final double n118 = n44 - n92;
        final double n119 = n45 - n93;
        class17.method171(n + 16L, n116 + n118);
        class17.method171(n + 17L, n117 + n119);
        class17.method171(n + 18L, n116 - n118);
        class17.method171(n + 19L, n117 - n119);
        final double n120 = n20 - n68;
        final double n121 = n21 - n69;
        final double n122 = n44 + n92;
        final double n123 = n45 + n93;
        class17.method171(n + 20L, n120 - n123);
        class17.method171(n + 21L, n121 + n122);
        class17.method171(n + 22L, n120 + n123);
        class17.method171(n + 23L, n121 - n122);
        final double n124 = n22 - n71;
        final double n125 = n23 + n70;
        final double n126 = n46 + n95;
        final double n127 = n47 - n94;
        final double n128 = method137 * (n126 - n127);
        final double n129 = method137 * (n127 + n126);
        class17.method171(n + 24L, n124 + n128);
        class17.method171(n + 25L, n125 + n129);
        class17.method171(n + 26L, n124 - n128);
        class17.method171(n + 27L, n125 - n129);
        final double n130 = n22 + n71;
        final double n131 = n23 - n70;
        final double n132 = n46 - n95;
        final double n133 = n47 + n94;
        final double n134 = method137 * (n132 - n133);
        final double n135 = method137 * (n133 + n132);
        class17.method171(n + 28L, n130 - n135);
        class17.method171(n + 29L, n131 + n134);
        class17.method171(n + 30L, n130 + n135);
        class17.method171(n + 31L, n131 - n134);
    }
    
    public static void method33225(final double[] array, final int n, final double[] array2, final int n2) {
        final double n3 = array2[n2 + 1];
        final double n4 = array[n] + array[n + 8];
        final double n5 = array[n + 1] + array[n + 9];
        final double n6 = array[n] - array[n + 8];
        final double n7 = array[n + 1] - array[n + 9];
        final double n8 = array[n + 4] + array[n + 12];
        final double n9 = array[n + 5] + array[n + 13];
        final double n10 = array[n + 4] - array[n + 12];
        final double n11 = array[n + 5] - array[n + 13];
        final double n12 = n4 + n8;
        final double n13 = n5 + n9;
        final double n14 = n4 - n8;
        final double n15 = n5 - n9;
        final double n16 = n6 - n11;
        final double n17 = n7 + n10;
        final double n18 = n6 + n11;
        final double n19 = n7 - n10;
        final double n20 = array[n + 2] + array[n + 10];
        final double n21 = array[n + 3] + array[n + 11];
        final double n22 = array[n + 2] - array[n + 10];
        final double n23 = array[n + 3] - array[n + 11];
        final double n24 = array[n + 6] + array[n + 14];
        final double n25 = array[n + 7] + array[n + 15];
        final double n26 = array[n + 6] - array[n + 14];
        final double n27 = array[n + 7] - array[n + 15];
        final double n28 = n20 + n24;
        final double n29 = n21 + n25;
        final double n30 = n20 - n24;
        final double n31 = n21 - n25;
        final double n32 = n22 - n27;
        final double n33 = n23 + n26;
        final double n34 = n22 + n27;
        final double n35 = n23 - n26;
        final double n36 = n3 * (n32 - n33);
        final double n37 = n3 * (n32 + n33);
        final double n38 = n3 * (n34 - n35);
        final double n39 = n3 * (n34 + n35);
        array[n + 8] = n16 + n36;
        array[n + 9] = n17 + n37;
        array[n + 10] = n16 - n36;
        array[n + 11] = n17 - n37;
        array[n + 12] = n18 - n39;
        array[n + 13] = n19 + n38;
        array[n + 14] = n18 + n39;
        array[n + 15] = n19 - n38;
        array[n] = n12 + n28;
        array[n + 1] = n13 + n29;
        array[n + 2] = n12 - n28;
        array[n + 3] = n13 - n29;
        array[n + 4] = n14 - n31;
        array[n + 5] = n15 + n30;
        array[n + 6] = n14 + n31;
        array[n + 7] = n15 - n30;
    }
    
    public static void method33226(final Class17 class17, final long n, final Class17 class18, final long n2) {
        final double method137 = class18.method137(n2 + 1L);
        final double n3 = class17.method137(n) + class17.method137(n + 8L);
        final double n4 = class17.method137(n + 1L) + class17.method137(n + 9L);
        final double n5 = class17.method137(n) - class17.method137(n + 8L);
        final double n6 = class17.method137(n + 1L) - class17.method137(n + 9L);
        final double n7 = class17.method137(n + 4L) + class17.method137(n + 12L);
        final double n8 = class17.method137(n + 5L) + class17.method137(n + 13L);
        final double n9 = class17.method137(n + 4L) - class17.method137(n + 12L);
        final double n10 = class17.method137(n + 5L) - class17.method137(n + 13L);
        final double n11 = n3 + n7;
        final double n12 = n4 + n8;
        final double n13 = n3 - n7;
        final double n14 = n4 - n8;
        final double n15 = n5 - n10;
        final double n16 = n6 + n9;
        final double n17 = n5 + n10;
        final double n18 = n6 - n9;
        final double n19 = class17.method137(n + 2L) + class17.method137(n + 10L);
        final double n20 = class17.method137(n + 3L) + class17.method137(n + 11L);
        final double n21 = class17.method137(n + 2L) - class17.method137(n + 10L);
        final double n22 = class17.method137(n + 3L) - class17.method137(n + 11L);
        final double n23 = class17.method137(n + 6L) + class17.method137(n + 14L);
        final double n24 = class17.method137(n + 7L) + class17.method137(n + 15L);
        final double n25 = class17.method137(n + 6L) - class17.method137(n + 14L);
        final double n26 = class17.method137(n + 7L) - class17.method137(n + 15L);
        final double n27 = n19 + n23;
        final double n28 = n20 + n24;
        final double n29 = n19 - n23;
        final double n30 = n20 - n24;
        final double n31 = n21 - n26;
        final double n32 = n22 + n25;
        final double n33 = n21 + n26;
        final double n34 = n22 - n25;
        final double n35 = method137 * (n31 - n32);
        final double n36 = method137 * (n31 + n32);
        final double n37 = method137 * (n33 - n34);
        final double n38 = method137 * (n33 + n34);
        class17.method171(n + 8L, n15 + n35);
        class17.method171(n + 9L, n16 + n36);
        class17.method171(n + 10L, n15 - n35);
        class17.method171(n + 11L, n16 - n36);
        class17.method171(n + 12L, n17 - n38);
        class17.method171(n + 13L, n18 + n37);
        class17.method171(n + 14L, n17 + n38);
        class17.method171(n + 15L, n18 - n37);
        class17.method171(n, n11 + n27);
        class17.method171(n + 1L, n12 + n28);
        class17.method171(n + 2L, n11 - n27);
        class17.method171(n + 3L, n12 - n28);
        class17.method171(n + 4L, n13 - n30);
        class17.method171(n + 5L, n14 + n29);
        class17.method171(n + 6L, n13 + n30);
        class17.method171(n + 7L, n14 - n29);
    }
    
    public static void method33227(final double[] array, final int n, final double[] array2, final int n2) {
        final double n3 = array2[n2 + 1];
        final double n4 = array2[n2 + 2];
        final double n5 = array2[n2 + 3];
        final double n6 = array[n] - array[n + 9];
        final double n7 = array[n + 1] + array[n + 8];
        final double n8 = array[n] + array[n + 9];
        final double n9 = array[n + 1] - array[n + 8];
        final double n10 = array[n + 4] - array[n + 13];
        final double n11 = array[n + 5] + array[n + 12];
        final double n12 = n3 * (n10 - n11);
        final double n13 = n3 * (n11 + n10);
        final double n14 = array[n + 4] + array[n + 13];
        final double n15 = array[n + 5] - array[n + 12];
        final double n16 = n3 * (n14 - n15);
        final double n17 = n3 * (n15 + n14);
        final double n18 = array[n + 2] - array[n + 11];
        final double n19 = array[n + 3] + array[n + 10];
        final double n20 = n4 * n18 - n5 * n19;
        final double n21 = n4 * n19 + n5 * n18;
        final double n22 = array[n + 2] + array[n + 11];
        final double n23 = array[n + 3] - array[n + 10];
        final double n24 = n5 * n22 - n4 * n23;
        final double n25 = n5 * n23 + n4 * n22;
        final double n26 = array[n + 6] - array[n + 15];
        final double n27 = array[n + 7] + array[n + 14];
        final double n28 = n5 * n26 - n4 * n27;
        final double n29 = n5 * n27 + n4 * n26;
        final double n30 = array[n + 6] + array[n + 15];
        final double n31 = array[n + 7] - array[n + 14];
        final double n32 = n4 * n30 - n5 * n31;
        final double n33 = n4 * n31 + n5 * n30;
        final double n34 = n6 + n12;
        final double n35 = n7 + n13;
        final double n36 = n20 + n28;
        final double n37 = n21 + n29;
        array[n] = n34 + n36;
        array[n + 1] = n35 + n37;
        array[n + 2] = n34 - n36;
        array[n + 3] = n35 - n37;
        final double n38 = n6 - n12;
        final double n39 = n7 - n13;
        final double n40 = n20 - n28;
        final double n41 = n21 - n29;
        array[n + 4] = n38 - n41;
        array[n + 5] = n39 + n40;
        array[n + 6] = n38 + n41;
        array[n + 7] = n39 - n40;
        final double n42 = n8 - n17;
        final double n43 = n9 + n16;
        final double n44 = n24 - n32;
        final double n45 = n25 - n33;
        array[n + 8] = n42 + n44;
        array[n + 9] = n43 + n45;
        array[n + 10] = n42 - n44;
        array[n + 11] = n43 - n45;
        final double n46 = n8 + n17;
        final double n47 = n9 - n16;
        final double n48 = n24 + n32;
        final double n49 = n25 + n33;
        array[n + 12] = n46 - n49;
        array[n + 13] = n47 + n48;
        array[n + 14] = n46 + n49;
        array[n + 15] = n47 - n48;
    }
    
    public static void method33228(final Class17 class17, final long n, final Class17 class18, final long n2) {
        final double method137 = class18.method137(n2 + 1L);
        final double method138 = class18.method137(n2 + 2L);
        final double method139 = class18.method137(n2 + 3L);
        final double n3 = class17.method137(n) - class17.method137(n + 9L);
        final double n4 = class17.method137(n + 1L) + class17.method137(n + 8L);
        final double n5 = class17.method137(n) + class17.method137(n + 9L);
        final double n6 = class17.method137(n + 1L) - class17.method137(n + 8L);
        final double n7 = class17.method137(n + 4L) - class17.method137(n + 13L);
        final double n8 = class17.method137(n + 5L) + class17.method137(n + 12L);
        final double n9 = method137 * (n7 - n8);
        final double n10 = method137 * (n8 + n7);
        final double n11 = class17.method137(n + 4L) + class17.method137(n + 13L);
        final double n12 = class17.method137(n + 5L) - class17.method137(n + 12L);
        final double n13 = method137 * (n11 - n12);
        final double n14 = method137 * (n12 + n11);
        final double n15 = class17.method137(n + 2L) - class17.method137(n + 11L);
        final double n16 = class17.method137(n + 3L) + class17.method137(n + 10L);
        final double n17 = method138 * n15 - method139 * n16;
        final double n18 = method138 * n16 + method139 * n15;
        final double n19 = class17.method137(n + 2L) + class17.method137(n + 11L);
        final double n20 = class17.method137(n + 3L) - class17.method137(n + 10L);
        final double n21 = method139 * n19 - method138 * n20;
        final double n22 = method139 * n20 + method138 * n19;
        final double n23 = class17.method137(n + 6L) - class17.method137(n + 15L);
        final double n24 = class17.method137(n + 7L) + class17.method137(n + 14L);
        final double n25 = method139 * n23 - method138 * n24;
        final double n26 = method139 * n24 + method138 * n23;
        final double n27 = class17.method137(n + 6L) + class17.method137(n + 15L);
        final double n28 = class17.method137(n + 7L) - class17.method137(n + 14L);
        final double n29 = method138 * n27 - method139 * n28;
        final double n30 = method138 * n28 + method139 * n27;
        final double n31 = n3 + n9;
        final double n32 = n4 + n10;
        final double n33 = n17 + n25;
        final double n34 = n18 + n26;
        class17.method171(n, n31 + n33);
        class17.method171(n + 1L, n32 + n34);
        class17.method171(n + 2L, n31 - n33);
        class17.method171(n + 3L, n32 - n34);
        final double n35 = n3 - n9;
        final double n36 = n4 - n10;
        final double n37 = n17 - n25;
        final double n38 = n18 - n26;
        class17.method171(n + 4L, n35 - n38);
        class17.method171(n + 5L, n36 + n37);
        class17.method171(n + 6L, n35 + n38);
        class17.method171(n + 7L, n36 - n37);
        final double n39 = n5 - n14;
        final double n40 = n6 + n13;
        final double n41 = n21 - n29;
        final double n42 = n22 - n30;
        class17.method171(n + 8L, n39 + n41);
        class17.method171(n + 9L, n40 + n42);
        class17.method171(n + 10L, n39 - n41);
        class17.method171(n + 11L, n40 - n42);
        final double n43 = n5 + n14;
        final double n44 = n6 - n13;
        final double n45 = n21 + n29;
        final double n46 = n22 + n30;
        class17.method171(n + 12L, n43 - n46);
        class17.method171(n + 13L, n44 + n45);
        class17.method171(n + 14L, n43 + n46);
        class17.method171(n + 15L, n44 - n45);
    }
    
    public static void method33229(final double[] array, final int n) {
        final double n2 = array[n] + array[n + 4];
        final double n3 = array[n + 1] + array[n + 5];
        final double n4 = array[n] - array[n + 4];
        final double n5 = array[n + 1] - array[n + 5];
        final double n6 = array[n + 2] + array[n + 6];
        final double n7 = array[n + 3] + array[n + 7];
        final double n8 = array[n + 2] - array[n + 6];
        final double n9 = array[n + 3] - array[n + 7];
        array[n] = n2 + n6;
        array[n + 1] = n3 + n7;
        array[n + 2] = n4 - n9;
        array[n + 3] = n5 + n8;
        array[n + 4] = n2 - n6;
        array[n + 5] = n3 - n7;
        array[n + 6] = n4 + n9;
        array[n + 7] = n5 - n8;
    }
    
    public static void method33230(final Class17 class17, final long n) {
        final double n2 = class17.method137(n) + class17.method137(n + 4L);
        final double n3 = class17.method137(n + 1L) + class17.method137(n + 5L);
        final double n4 = class17.method137(n) - class17.method137(n + 4L);
        final double n5 = class17.method137(n + 1L) - class17.method137(n + 5L);
        final double n6 = class17.method137(n + 2L) + class17.method137(n + 6L);
        final double n7 = class17.method137(n + 3L) + class17.method137(n + 7L);
        final double n8 = class17.method137(n + 2L) - class17.method137(n + 6L);
        final double n9 = class17.method137(n + 3L) - class17.method137(n + 7L);
        class17.method171(n, n2 + n6);
        class17.method171(n + 1L, n3 + n7);
        class17.method171(n + 2L, n4 - n9);
        class17.method171(n + 3L, n5 + n8);
        class17.method171(n + 4L, n2 - n6);
        class17.method171(n + 5L, n3 - n7);
        class17.method171(n + 6L, n4 + n9);
        class17.method171(n + 7L, n5 - n8);
    }
    
    public static void method33231(final double[] array, final int n) {
        final double n2 = array[n] + array[n + 4];
        final double n3 = array[n + 1] + array[n + 5];
        final double n4 = array[n] - array[n + 4];
        final double n5 = array[n + 1] - array[n + 5];
        final double n6 = array[n + 2] + array[n + 6];
        final double n7 = array[n + 3] + array[n + 7];
        final double n8 = array[n + 2] - array[n + 6];
        final double n9 = array[n + 3] - array[n + 7];
        array[n] = n2 + n6;
        array[n + 1] = n3 + n7;
        array[n + 2] = n4 + n9;
        array[n + 3] = n5 - n8;
        array[n + 4] = n2 - n6;
        array[n + 5] = n3 - n7;
        array[n + 6] = n4 - n9;
        array[n + 7] = n5 + n8;
    }
    
    public static void method33232(final Class17 class17, final long n) {
        final double n2 = class17.method137(n) + class17.method137(n + 4L);
        final double n3 = class17.method137(n + 1L) + class17.method137(n + 5L);
        final double n4 = class17.method137(n) - class17.method137(n + 4L);
        final double n5 = class17.method137(n + 1L) - class17.method137(n + 5L);
        final double n6 = class17.method137(n + 2L) + class17.method137(n + 6L);
        final double n7 = class17.method137(n + 3L) + class17.method137(n + 7L);
        final double n8 = class17.method137(n + 2L) - class17.method137(n + 6L);
        final double n9 = class17.method137(n + 3L) - class17.method137(n + 7L);
        class17.method171(n, n2 + n6);
        class17.method171(n + 1L, n3 + n7);
        class17.method171(n + 2L, n4 + n9);
        class17.method171(n + 3L, n5 - n8);
        class17.method171(n + 4L, n2 - n6);
        class17.method171(n + 5L, n3 - n7);
        class17.method171(n + 6L, n4 - n9);
        class17.method171(n + 7L, n5 + n8);
    }
    
    public static void method33233(final double[] array, final int n) {
        final double n2 = array[n] - array[n + 2];
        final double n3 = -array[n + 1] + array[n + 3];
        array[n] += array[n + 2];
        final int n4 = n + 1;
        array[n4] += array[n + 3];
        array[n + 2] = n2;
        array[n + 3] = n3;
    }
    
    public static void method33234(final Class17 class17, final long n) {
        final double n2 = class17.method137(n) - class17.method137(n + 2L);
        final double n3 = -class17.method137(n + 1L) + class17.method137(n + 3L);
        class17.method171(n, class17.method137(n) + class17.method137(n + 2L));
        class17.method171(n + 1L, class17.method137(n + 1L) + class17.method137(n + 3L));
        class17.method171(n + 2L, n2);
        class17.method171(n + 3L, n3);
    }
    
    public static void method33235(final double[] array, final int n) {
        final double n2 = array[n] - array[n + 2];
        final double n3 = array[n + 1] - array[n + 3];
        array[n] += array[n + 2];
        final int n4 = n + 1;
        array[n4] += array[n + 3];
        array[n + 2] = n2;
        array[n + 3] = n3;
    }
    
    public static void method33236(final Class17 class17, final long n) {
        final double n2 = class17.method137(n) - class17.method137(n + 2L);
        final double n3 = class17.method137(n + 1L) - class17.method137(n + 3L);
        class17.method171(n, class17.method137(n) + class17.method137(n + 2L));
        class17.method171(n + 1L, class17.method137(n + 1L) + class17.method137(n + 3L));
        class17.method171(n + 2L, n2);
        class17.method171(n + 3L, n3);
    }
    
    public static void method33237(final double[] array, final int n) {
        final double n2 = array[n] - array[n + 2];
        final double n3 = array[n + 1] + array[n + 3];
        array[n] += array[n + 2];
        final int n4 = n + 1;
        array[n4] -= array[n + 3];
        array[n + 2] = n2;
        array[n + 3] = n3;
    }
    
    public static void method33238(final Class17 class17, final long n) {
        final double n2 = class17.method137(n) - class17.method137(n + 2L);
        final double n3 = class17.method137(n + 1L) + class17.method137(n + 3L);
        class17.method171(n, class17.method137(n) + class17.method137(n + 2L));
        class17.method171(n + 1L, class17.method137(n + 1L) - class17.method137(n + 3L));
        class17.method171(n + 2L, n2);
        class17.method171(n + 3L, n3);
    }
    
    public static void method33239(final int n, final double[] array, final int n2, final int n3, final double[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final double n9 = 0.5 - array2[n4 + n3 - n7];
            final double n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final double n13 = array[n11] - array[n12];
            final double n14 = array[n11 + 1] + array[n12 + 1];
            final double n15 = n9 * n13 - n10 * n14;
            final double n16 = n9 * n14 + n10 * n13;
            final int n17 = n11;
            array[n17] -= n15;
            array[n11 + 1] = n16 - array[n11 + 1];
            final int n18 = n12;
            array[n18] += n15;
            array[n12 + 1] = n16 - array[n12 + 1];
        }
        array[n2 + n5 + 1] = -array[n2 + n5 + 1];
    }
    
    public static void method33240(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final double n10 = 0.5 - class18.method137(n4 + n3 - n7);
            final double method137 = class18.method137(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final double n13 = class17.method137(n11) - class17.method137(n12);
            final double n14 = class17.method137(n11 + 1L) + class17.method137(n12 + 1L);
            final double n15 = n10 * n13 - method137 * n14;
            final double n16 = n10 * n14 + method137 * n13;
            class17.method171(n11, class17.method137(n11) - n15);
            class17.method171(n11 + 1L, n16 - class17.method137(n11 + 1L));
            class17.method171(n12, class17.method137(n12) + n15);
            class17.method171(n12 + 1L, n16 - class17.method137(n12 + 1L));
        }
        class17.method171(n2 + n5 + 1L, -class17.method137(n2 + n5 + 1L));
    }
    
    public static void method33241(final int n, final double[] array, final int n2, final int n3, final double[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final double n9 = 0.5 - array2[n4 + n3 - n7];
            final double n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final double n13 = array[n11] - array[n12];
            final double n14 = array[n11 + 1] + array[n12 + 1];
            final double n15 = n9 * n13 - n10 * n14;
            final double n16 = n9 * n14 + n10 * n13;
            final int n17 = n11;
            array[n17] -= n15;
            final int n18 = n11 + 1;
            array[n18] -= n16;
            final int n19 = n12;
            array[n19] += n15;
            final int n20 = n12 + 1;
            array[n20] -= n16;
        }
    }
    
    public static void method33242(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final double n10 = 0.5 - class18.method137(n4 + n3 - n7);
            final double method137 = class18.method137(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final double n13 = class17.method137(n11) - class17.method137(n12);
            final double n14 = class17.method137(n11 + 1L) + class17.method137(n12 + 1L);
            final double n15 = n10 * n13 - method137 * n14;
            final double n16 = n10 * n14 + method137 * n13;
            class17.method171(n11, class17.method137(n11) - n15);
            class17.method171(n11 + 1L, class17.method137(n11 + 1L) - n16);
            class17.method171(n12, class17.method137(n12) + n15);
            class17.method171(n12 + 1L, class17.method137(n12 + 1L) - n16);
        }
    }
    
    public static void method33243(final int n, final double[] array, final int n2, final int n3, final double[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = n3 / n;
        int n7 = 0;
        for (int i = 1; i < n5; ++i) {
            final int n8 = n - i;
            n7 += n6;
            final int n9 = n4 + n7;
            final int n10 = n2 + i;
            final int n11 = n2 + n8;
            final double n12 = array2[n9] - array2[n4 + n3 - n7];
            final double n13 = array2[n9] + array2[n4 + n3 - n7];
            final double n14 = n13 * array[n10] - n12 * array[n11];
            array[n10] = n12 * array[n10] + n13 * array[n11];
            array[n11] = n14;
        }
        final int n15 = n2 + n5;
        array[n15] *= array2[n4];
    }
    
    public static void method33244(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18, final long n4) {
        final long n5 = n >> 1;
        final long n6 = n3 / n;
        long n7 = 0L;
        for (long n8 = 1L; n8 < n5; ++n8) {
            final long n9 = n - n8;
            n7 += n6;
            final long n10 = n4 + n7;
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final double n13 = class18.method137(n10) - class18.method137(n4 + n3 - n7);
            final double n14 = class18.method137(n10) + class18.method137(n4 + n3 - n7);
            final double n15 = n14 * class17.method137(n11) - n13 * class17.method137(n12);
            class17.method171(n11, n13 * class17.method137(n11) + n14 * class17.method137(n12));
            class17.method171(n12, n15);
        }
        class17.method171(n2 + n5, class17.method137(n2 + n5) * class18.method137(n4));
    }
    
    public static void method33245(final int n, final float[] array, final int n2, final int[] array2, final int n3, final float[] array3) {
        if (n <= 8) {
            if (n != 8) {
                if (n == 4) {
                    method33293(array, n2);
                }
            }
            else {
                method33287(array, n2);
            }
        }
        else if (n <= 32) {
            if (n != 32) {
                method33283(array, n2, array3, 0);
                method33257(array, n2);
            }
            else {
                method33279(array, n2, array3, n3 - 8);
                method33253(array, n2);
            }
        }
        else {
            method33261(n, array, n2, array3, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33265(n, array, n2, n3, array3);
            }
            else if (n <= 512) {
                if (n <= 128) {
                    method33277(n, array, n2, n3, array3);
                }
                else {
                    method33271(n, 1, array, n2, n3, array3);
                }
            }
            else {
                method33267(n, array, n2, n3, array3);
            }
            method33249(n, array2, array, n2);
        }
    }
    
    public static void method33246(final long n, final Class22 class22, final long n2, final Class15 class23, final long n3, final Class22 class24) {
        if (n <= 8L) {
            if (n != 8L) {
                if (n == 4L) {
                    method33294(class22, n2);
                }
            }
            else {
                method33288(class22, n2);
            }
        }
        else if (n <= 32L) {
            if (n != 32L) {
                method33284(class22, n2, class24, 0L);
                method33258(class22, n2);
            }
            else {
                method33280(class22, n2, class24, n3 - 8L);
                method33254(class22, n2);
            }
        }
        else {
            method33262(n, class22, n2, class24, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33266(n, class22, n2, n3, class24);
            }
            else if (n <= 512L) {
                if (n <= 128L) {
                    method33278(n, class22, n2, n3, class24);
                }
                else {
                    method33272(n, 1L, class22, n2, n3, class24);
                }
            }
            else {
                method33268(n, class22, n2, n3, class24);
            }
            method33250(n, class23, class22, n2);
        }
    }
    
    public static void method33247(final int n, final float[] array, final int n2, final int[] array2, final int n3, final float[] array3) {
        if (n <= 8) {
            if (n != 8) {
                if (n == 4) {
                    method33293(array, n2);
                }
            }
            else {
                method33289(array, n2);
            }
        }
        else if (n <= 32) {
            if (n != 32) {
                method33283(array, n2, array3, 0);
                method33259(array, n2);
            }
            else {
                method33279(array, n2, array3, n3 - 8);
                method33255(array, n2);
            }
        }
        else {
            method33263(n, array, n2, array3, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33265(n, array, n2, n3, array3);
            }
            else if (n <= 512) {
                if (n <= 128) {
                    method33277(n, array, n2, n3, array3);
                }
                else {
                    method33271(n, 1, array, n2, n3, array3);
                }
            }
            else {
                method33267(n, array, n2, n3, array3);
            }
            method33251(n, array2, array, n2);
        }
    }
    
    public static void method33248(final long n, final Class22 class22, final long n2, final Class15 class23, final long n3, final Class22 class24) {
        if (n <= 8L) {
            if (n != 8L) {
                if (n == 4L) {
                    method33294(class22, n2);
                }
            }
            else {
                method33290(class22, n2);
            }
        }
        else if (n <= 32L) {
            if (n != 32L) {
                method33284(class22, n2, class24, 0L);
                method33260(class22, n2);
            }
            else {
                method33280(class22, n2, class24, n3 - 8L);
                method33256(class22, n2);
            }
        }
        else {
            method33264(n, class22, n2, class24, n3 - (n >> 2));
            if (Class8216.method27224() > 1 && n >= method33158()) {
                method33266(n, class22, n2, n3, class24);
            }
            else if (n <= 512L) {
                if (n <= 128L) {
                    method33278(n, class22, n2, n3, class24);
                }
                else {
                    method33272(n, 1L, class22, n2, n3, class24);
                }
            }
            else {
                method33268(n, class22, n2, n3, class24);
            }
            method33252(n, class23, class22, n2);
        }
    }
    
    public static void method33249(final int n, final int[] array, final float[] array2, final int n2) {
        int n3 = 1;
        int i;
        for (i = n >> 2; i > 8; i >>= 2) {
            n3 <<= 1;
        }
        final int n4 = n >> 1;
        final int n5 = 4 * n3;
        if (i != 8) {
            for (int j = 0; j < n3; ++j) {
                final int n6 = 4 * j;
                for (int k = 0; k < j; ++k) {
                    final int n7 = 4 * k + array[n3 + j];
                    final int n8 = n6 + array[n3 + k];
                    final int n9 = n2 + n7;
                    final int n10 = n2 + n8;
                    final float n11 = array2[n9];
                    final float n12 = array2[n9 + 1];
                    final float n13 = array2[n10];
                    final float n14 = array2[n10 + 1];
                    array2[n9] = n13;
                    array2[n9 + 1] = n14;
                    array2[n10] = n11;
                    array2[n10 + 1] = n12;
                    final int n15 = n7 + n5;
                    int n16 = n8 + n5;
                    final int n17 = n2 + n15;
                    final int n18 = n2 + n16;
                    final float n19 = array2[n17];
                    final float n20 = array2[n17 + 1];
                    final float n21 = array2[n18];
                    final float n22 = array2[n18 + 1];
                    array2[n17] = n21;
                    array2[n17 + 1] = n22;
                    array2[n18] = n19;
                    array2[n18 + 1] = n20;
                    final int n23 = n15 + n4;
                    n16 += 2;
                    final int n24 = n2 + n23;
                    final int n25 = n2 + n16;
                    final float n26 = array2[n24];
                    final float n27 = array2[n24 + 1];
                    final float n28 = array2[n25];
                    final float n29 = array2[n25 + 1];
                    array2[n24] = n28;
                    array2[n24 + 1] = n29;
                    array2[n25] = n26;
                    array2[n25 + 1] = n27;
                    int n30 = n23 - n5;
                    final int n31 = n16 - n5;
                    final int n32 = n2 + n30;
                    final int n33 = n2 + n31;
                    final float n34 = array2[n32];
                    final float n35 = array2[n32 + 1];
                    final float n36 = array2[n33];
                    final float n37 = array2[n33 + 1];
                    array2[n32] = n36;
                    array2[n32 + 1] = n37;
                    array2[n33] = n34;
                    array2[n33 + 1] = n35;
                    n30 += 2;
                    final int n38 = n31 + n4;
                    final int n39 = n2 + n30;
                    final int n40 = n2 + n38;
                    final float n41 = array2[n39];
                    final float n42 = array2[n39 + 1];
                    final float n43 = array2[n40];
                    final float n44 = array2[n40 + 1];
                    array2[n39] = n43;
                    array2[n39 + 1] = n44;
                    array2[n40] = n41;
                    array2[n40 + 1] = n42;
                    final int n45 = n30 + n5;
                    int n46 = n38 + n5;
                    final int n47 = n2 + n45;
                    final int n48 = n2 + n46;
                    final float n49 = array2[n47];
                    final float n50 = array2[n47 + 1];
                    final float n51 = array2[n48];
                    final float n52 = array2[n48 + 1];
                    array2[n47] = n51;
                    array2[n47 + 1] = n52;
                    array2[n48] = n49;
                    array2[n48 + 1] = n50;
                    final int n53 = n45 - n4;
                    n46 -= 2;
                    final int n54 = n2 + n53;
                    final int n55 = n2 + n46;
                    final float n56 = array2[n54];
                    final float n57 = array2[n54 + 1];
                    final float n58 = array2[n55];
                    final float n59 = array2[n55 + 1];
                    array2[n54] = n58;
                    array2[n54 + 1] = n59;
                    array2[n55] = n56;
                    array2[n55 + 1] = n57;
                    final int n60 = n53 - n5;
                    final int n61 = n46 - n5;
                    final int n62 = n2 + n60;
                    final int n63 = n2 + n61;
                    final float n64 = array2[n62];
                    final float n65 = array2[n62 + 1];
                    final float n66 = array2[n63];
                    final float n67 = array2[n63 + 1];
                    array2[n62] = n66;
                    array2[n62 + 1] = n67;
                    array2[n63] = n64;
                    array2[n63 + 1] = n65;
                }
                final int n68 = n6 + array[n3 + j];
                final int n69 = n68 + 2;
                final int n70 = n68 + n4;
                final int n71 = n2 + n69;
                final int n72 = n2 + n70;
                final float n73 = array2[n71];
                final float n74 = array2[n71 + 1];
                final float n75 = array2[n72];
                final float n76 = array2[n72 + 1];
                array2[n71] = n75;
                array2[n71 + 1] = n76;
                array2[n72] = n73;
                array2[n72 + 1] = n74;
                final int n77 = n69 + n5;
                final int n78 = n70 + n5;
                final int n79 = n2 + n77;
                final int n80 = n2 + n78;
                final float n81 = array2[n79];
                final float n82 = array2[n79 + 1];
                final float n83 = array2[n80];
                final float n84 = array2[n80 + 1];
                array2[n79] = n83;
                array2[n79 + 1] = n84;
                array2[n80] = n81;
                array2[n80 + 1] = n82;
            }
        }
        else {
            for (int l = 0; l < n3; ++l) {
                final int n85 = 4 * l;
                for (int n86 = 0; n86 < l; ++n86) {
                    final int n87 = 4 * n86 + 2 * array[n3 + l];
                    final int n88 = n85 + 2 * array[n3 + n86];
                    final int n89 = n2 + n87;
                    final int n90 = n2 + n88;
                    final float n91 = array2[n89];
                    final float n92 = array2[n89 + 1];
                    final float n93 = array2[n90];
                    final float n94 = array2[n90 + 1];
                    array2[n89] = n93;
                    array2[n89 + 1] = n94;
                    array2[n90] = n91;
                    array2[n90 + 1] = n92;
                    final int n95 = n87 + n5;
                    final int n96 = n88 + 2 * n5;
                    final int n97 = n2 + n95;
                    final int n98 = n2 + n96;
                    final float n99 = array2[n97];
                    final float n100 = array2[n97 + 1];
                    final float n101 = array2[n98];
                    final float n102 = array2[n98 + 1];
                    array2[n97] = n101;
                    array2[n97 + 1] = n102;
                    array2[n98] = n99;
                    array2[n98 + 1] = n100;
                    final int n103 = n95 + n5;
                    final int n104 = n96 - n5;
                    final int n105 = n2 + n103;
                    final int n106 = n2 + n104;
                    final float n107 = array2[n105];
                    final float n108 = array2[n105 + 1];
                    final float n109 = array2[n106];
                    final float n110 = array2[n106 + 1];
                    array2[n105] = n109;
                    array2[n105 + 1] = n110;
                    array2[n106] = n107;
                    array2[n106 + 1] = n108;
                    final int n111 = n103 + n5;
                    int n112 = n104 + 2 * n5;
                    final int n113 = n2 + n111;
                    final int n114 = n2 + n112;
                    final float n115 = array2[n113];
                    final float n116 = array2[n113 + 1];
                    final float n117 = array2[n114];
                    final float n118 = array2[n114 + 1];
                    array2[n113] = n117;
                    array2[n113 + 1] = n118;
                    array2[n114] = n115;
                    array2[n114 + 1] = n116;
                    final int n119 = n111 + n4;
                    n112 += 2;
                    final int n120 = n2 + n119;
                    final int n121 = n2 + n112;
                    final float n122 = array2[n120];
                    final float n123 = array2[n120 + 1];
                    final float n124 = array2[n121];
                    final float n125 = array2[n121 + 1];
                    array2[n120] = n124;
                    array2[n120 + 1] = n125;
                    array2[n121] = n122;
                    array2[n121 + 1] = n123;
                    final int n126 = n119 - n5;
                    final int n127 = n112 - 2 * n5;
                    final int n128 = n2 + n126;
                    final int n129 = n2 + n127;
                    final float n130 = array2[n128];
                    final float n131 = array2[n128 + 1];
                    final float n132 = array2[n129];
                    final float n133 = array2[n129 + 1];
                    array2[n128] = n132;
                    array2[n128 + 1] = n133;
                    array2[n129] = n130;
                    array2[n129 + 1] = n131;
                    final int n134 = n126 - n5;
                    final int n135 = n127 + n5;
                    final int n136 = n2 + n134;
                    final int n137 = n2 + n135;
                    final float n138 = array2[n136];
                    final float n139 = array2[n136 + 1];
                    final float n140 = array2[n137];
                    final float n141 = array2[n137 + 1];
                    array2[n136] = n140;
                    array2[n136 + 1] = n141;
                    array2[n137] = n138;
                    array2[n137 + 1] = n139;
                    int n142 = n134 - n5;
                    final int n143 = n135 - 2 * n5;
                    final int n144 = n2 + n142;
                    final int n145 = n2 + n143;
                    final float n146 = array2[n144];
                    final float n147 = array2[n144 + 1];
                    final float n148 = array2[n145];
                    final float n149 = array2[n145 + 1];
                    array2[n144] = n148;
                    array2[n144 + 1] = n149;
                    array2[n145] = n146;
                    array2[n145 + 1] = n147;
                    n142 += 2;
                    final int n150 = n143 + n4;
                    final int n151 = n2 + n142;
                    final int n152 = n2 + n150;
                    final float n153 = array2[n151];
                    final float n154 = array2[n151 + 1];
                    final float n155 = array2[n152];
                    final float n156 = array2[n152 + 1];
                    array2[n151] = n155;
                    array2[n151 + 1] = n156;
                    array2[n152] = n153;
                    array2[n152 + 1] = n154;
                    final int n157 = n142 + n5;
                    final int n158 = n150 + 2 * n5;
                    final int n159 = n2 + n157;
                    final int n160 = n2 + n158;
                    final float n161 = array2[n159];
                    final float n162 = array2[n159 + 1];
                    final float n163 = array2[n160];
                    final float n164 = array2[n160 + 1];
                    array2[n159] = n163;
                    array2[n159 + 1] = n164;
                    array2[n160] = n161;
                    array2[n160 + 1] = n162;
                    final int n165 = n157 + n5;
                    final int n166 = n158 - n5;
                    final int n167 = n2 + n165;
                    final int n168 = n2 + n166;
                    final float n169 = array2[n167];
                    final float n170 = array2[n167 + 1];
                    final float n171 = array2[n168];
                    final float n172 = array2[n168 + 1];
                    array2[n167] = n171;
                    array2[n167 + 1] = n172;
                    array2[n168] = n169;
                    array2[n168 + 1] = n170;
                    final int n173 = n165 + n5;
                    int n174 = n166 + 2 * n5;
                    final int n175 = n2 + n173;
                    final int n176 = n2 + n174;
                    final float n177 = array2[n175];
                    final float n178 = array2[n175 + 1];
                    final float n179 = array2[n176];
                    final float n180 = array2[n176 + 1];
                    array2[n175] = n179;
                    array2[n175 + 1] = n180;
                    array2[n176] = n177;
                    array2[n176 + 1] = n178;
                    final int n181 = n173 - n4;
                    n174 -= 2;
                    final int n182 = n2 + n181;
                    final int n183 = n2 + n174;
                    final float n184 = array2[n182];
                    final float n185 = array2[n182 + 1];
                    final float n186 = array2[n183];
                    final float n187 = array2[n183 + 1];
                    array2[n182] = n186;
                    array2[n182 + 1] = n187;
                    array2[n183] = n184;
                    array2[n183 + 1] = n185;
                    final int n188 = n181 - n5;
                    final int n189 = n174 - 2 * n5;
                    final int n190 = n2 + n188;
                    final int n191 = n2 + n189;
                    final float n192 = array2[n190];
                    final float n193 = array2[n190 + 1];
                    final float n194 = array2[n191];
                    final float n195 = array2[n191 + 1];
                    array2[n190] = n194;
                    array2[n190 + 1] = n195;
                    array2[n191] = n192;
                    array2[n191 + 1] = n193;
                    final int n196 = n188 - n5;
                    final int n197 = n189 + n5;
                    final int n198 = n2 + n196;
                    final int n199 = n2 + n197;
                    final float n200 = array2[n198];
                    final float n201 = array2[n198 + 1];
                    final float n202 = array2[n199];
                    final float n203 = array2[n199 + 1];
                    array2[n198] = n202;
                    array2[n198 + 1] = n203;
                    array2[n199] = n200;
                    array2[n199 + 1] = n201;
                    final int n204 = n196 - n5;
                    final int n205 = n197 - 2 * n5;
                    final int n206 = n2 + n204;
                    final int n207 = n2 + n205;
                    final float n208 = array2[n206];
                    final float n209 = array2[n206 + 1];
                    final float n210 = array2[n207];
                    final float n211 = array2[n207 + 1];
                    array2[n206] = n210;
                    array2[n206 + 1] = n211;
                    array2[n207] = n208;
                    array2[n207 + 1] = n209;
                }
                final int n212 = n85 + 2 * array[n3 + l];
                final int n213 = n212 + 2;
                final int n214 = n212 + n4;
                final int n215 = n2 + n213;
                final int n216 = n2 + n214;
                final float n217 = array2[n215];
                final float n218 = array2[n215 + 1];
                final float n219 = array2[n216];
                final float n220 = array2[n216 + 1];
                array2[n215] = n219;
                array2[n215 + 1] = n220;
                array2[n216] = n217;
                array2[n216 + 1] = n218;
                final int n221 = n213 + n5;
                final int n222 = n214 + 2 * n5;
                final int n223 = n2 + n221;
                final int n224 = n2 + n222;
                final float n225 = array2[n223];
                final float n226 = array2[n223 + 1];
                final float n227 = array2[n224];
                final float n228 = array2[n224 + 1];
                array2[n223] = n227;
                array2[n223 + 1] = n228;
                array2[n224] = n225;
                array2[n224 + 1] = n226;
                int n229 = n221 + n5;
                final int n230 = n222 - n5;
                final int n231 = n2 + n229;
                final int n232 = n2 + n230;
                final float n233 = array2[n231];
                final float n234 = array2[n231 + 1];
                final float n235 = array2[n232];
                final float n236 = array2[n232 + 1];
                array2[n231] = n235;
                array2[n231 + 1] = n236;
                array2[n232] = n233;
                array2[n232 + 1] = n234;
                n229 -= 2;
                final int n237 = n230 - n4;
                final int n238 = n2 + n229;
                final int n239 = n2 + n237;
                final float n240 = array2[n238];
                final float n241 = array2[n238 + 1];
                final float n242 = array2[n239];
                final float n243 = array2[n239 + 1];
                array2[n238] = n242;
                array2[n238 + 1] = n243;
                array2[n239] = n240;
                array2[n239 + 1] = n241;
                final int n244 = n229 + (n4 + 2);
                final int n245 = n237 + (n4 + 2);
                final int n246 = n2 + n244;
                final int n247 = n2 + n245;
                final float n248 = array2[n246];
                final float n249 = array2[n246 + 1];
                final float n250 = array2[n247];
                final float n251 = array2[n247 + 1];
                array2[n246] = n250;
                array2[n246 + 1] = n251;
                array2[n247] = n248;
                array2[n247 + 1] = n249;
                final int n252 = n244 - (n4 - n5);
                final int n253 = n245 + (2 * n5 - 2);
                final int n254 = n2 + n252;
                final int n255 = n2 + n253;
                final float n256 = array2[n254];
                final float n257 = array2[n254 + 1];
                final float n258 = array2[n255];
                final float n259 = array2[n255 + 1];
                array2[n254] = n258;
                array2[n254 + 1] = n259;
                array2[n255] = n256;
                array2[n255 + 1] = n257;
            }
        }
    }
    
    public static void method33250(final long n, final Class15 class15, final Class22 class16, final long n2) {
        long n3 = 1L;
        long n4;
        for (n4 = n >> 2; n4 > 8L; n4 >>= 2) {
            n3 <<= 1;
        }
        final long n5 = n >> 1;
        final long n6 = 4L * n3;
        if (n4 != 8L) {
            for (long n7 = 0L; n7 < n3; ++n7) {
                final long n8 = 4L * n7;
                for (long n9 = 0L; n9 < n7; ++n9) {
                    final long n10 = 4L * n9 + class15.method133(n3 + n7);
                    final long n11 = n8 + class15.method133(n3 + n9);
                    final long n12 = n2 + n10;
                    final long n13 = n2 + n11;
                    final float method135 = class16.method135(n12);
                    final float method136 = class16.method135(n12 + 1L);
                    final float method137 = class16.method135(n13);
                    final float method138 = class16.method135(n13 + 1L);
                    class16.method169(n12, method137);
                    class16.method169(n12 + 1L, method138);
                    class16.method169(n13, method135);
                    class16.method169(n13 + 1L, method136);
                    final long n14 = n10 + n6;
                    final long n15 = n11 + n6;
                    final long n16 = n2 + n14;
                    final long n17 = n2 + n15;
                    final float method139 = class16.method135(n16);
                    final float method140 = class16.method135(n16 + 1L);
                    final float method141 = class16.method135(n17);
                    final float method142 = class16.method135(n17 + 1L);
                    class16.method169(n16, method141);
                    class16.method169(n16 + 1L, method142);
                    class16.method169(n17, method139);
                    class16.method169(n17 + 1L, method140);
                    final long n18 = n14 + n5;
                    final long n19 = n15 + 2L;
                    final long n20 = n2 + n18;
                    final long n21 = n2 + n19;
                    final float method143 = class16.method135(n20);
                    final float method144 = class16.method135(n20 + 1L);
                    final float method145 = class16.method135(n21);
                    final float method146 = class16.method135(n21 + 1L);
                    class16.method169(n20, method145);
                    class16.method169(n20 + 1L, method146);
                    class16.method169(n21, method143);
                    class16.method169(n21 + 1L, method144);
                    final long n22 = n18 - n6;
                    final long n23 = n19 - n6;
                    final long n24 = n2 + n22;
                    final long n25 = n2 + n23;
                    final float method147 = class16.method135(n24);
                    final float method148 = class16.method135(n24 + 1L);
                    final float method149 = class16.method135(n25);
                    final float method150 = class16.method135(n25 + 1L);
                    class16.method169(n24, method149);
                    class16.method169(n24 + 1L, method150);
                    class16.method169(n25, method147);
                    class16.method169(n25 + 1L, method148);
                    final long n26 = n22 + 2L;
                    final long n27 = n23 + n5;
                    final long n28 = n2 + n26;
                    final long n29 = n2 + n27;
                    final float method151 = class16.method135(n28);
                    final float method152 = class16.method135(n28 + 1L);
                    final float method153 = class16.method135(n29);
                    final float method154 = class16.method135(n29 + 1L);
                    class16.method169(n28, method153);
                    class16.method169(n28 + 1L, method154);
                    class16.method169(n29, method151);
                    class16.method169(n29 + 1L, method152);
                    final long n30 = n26 + n6;
                    final long n31 = n27 + n6;
                    final long n32 = n2 + n30;
                    final long n33 = n2 + n31;
                    final float method155 = class16.method135(n32);
                    final float method156 = class16.method135(n32 + 1L);
                    final float method157 = class16.method135(n33);
                    final float method158 = class16.method135(n33 + 1L);
                    class16.method169(n32, method157);
                    class16.method169(n32 + 1L, method158);
                    class16.method169(n33, method155);
                    class16.method169(n33 + 1L, method156);
                    final long n34 = n30 - n5;
                    final long n35 = n31 - 2L;
                    final long n36 = n2 + n34;
                    final long n37 = n2 + n35;
                    final float method159 = class16.method135(n36);
                    final float method160 = class16.method135(n36 + 1L);
                    final float method161 = class16.method135(n37);
                    final float method162 = class16.method135(n37 + 1L);
                    class16.method169(n36, method161);
                    class16.method169(n36 + 1L, method162);
                    class16.method169(n37, method159);
                    class16.method169(n37 + 1L, method160);
                    final long n38 = n34 - n6;
                    final long n39 = n35 - n6;
                    final long n40 = n2 + n38;
                    final long n41 = n2 + n39;
                    final float method163 = class16.method135(n40);
                    final float method164 = class16.method135(n40 + 1L);
                    final float method165 = class16.method135(n41);
                    final float method166 = class16.method135(n41 + 1L);
                    class16.method169(n40, method165);
                    class16.method169(n40 + 1L, method166);
                    class16.method169(n41, method163);
                    class16.method169(n41 + 1L, method164);
                }
                final long n42 = n8 + class15.method133(n3 + n7);
                final long n43 = n42 + 2L;
                final long n44 = n42 + n5;
                final long n45 = n2 + n43;
                final long n46 = n2 + n44;
                final float method167 = class16.method135(n45);
                final float method168 = class16.method135(n45 + 1L);
                final float method169 = class16.method135(n46);
                final float method170 = class16.method135(n46 + 1L);
                class16.method169(n45, method169);
                class16.method169(n45 + 1L, method170);
                class16.method169(n46, method167);
                class16.method169(n46 + 1L, method168);
                final long n47 = n43 + n6;
                final long n48 = n44 + n6;
                final long n49 = n2 + n47;
                final long n50 = n2 + n48;
                final float method171 = class16.method135(n49);
                final float method172 = class16.method135(n49 + 1L);
                final float method173 = class16.method135(n50);
                final float method174 = class16.method135(n50 + 1L);
                class16.method169(n49, method173);
                class16.method169(n49 + 1L, method174);
                class16.method169(n50, method171);
                class16.method169(n50 + 1L, method172);
            }
        }
        else {
            for (long n51 = 0L; n51 < n3; ++n51) {
                final long n52 = 4L * n51;
                for (long n53 = 0L; n53 < n51; ++n53) {
                    final long n54 = 4L * n53 + 2L * class15.method133(n3 + n51);
                    final long n55 = n52 + 2L * class15.method133(n3 + n53);
                    final long n56 = n2 + n54;
                    final long n57 = n2 + n55;
                    final float method175 = class16.method135(n56);
                    final float method176 = class16.method135(n56 + 1L);
                    final float method177 = class16.method135(n57);
                    final float method178 = class16.method135(n57 + 1L);
                    class16.method169(n56, method177);
                    class16.method169(n56 + 1L, method178);
                    class16.method169(n57, method175);
                    class16.method169(n57 + 1L, method176);
                    final long n58 = n54 + n6;
                    final long n59 = n55 + 2L * n6;
                    final long n60 = n2 + n58;
                    final long n61 = n2 + n59;
                    final float method179 = class16.method135(n60);
                    final float method180 = class16.method135(n60 + 1L);
                    final float method181 = class16.method135(n61);
                    final float method182 = class16.method135(n61 + 1L);
                    class16.method169(n60, method181);
                    class16.method169(n60 + 1L, method182);
                    class16.method169(n61, method179);
                    class16.method169(n61 + 1L, method180);
                    final long n62 = n58 + n6;
                    final long n63 = n59 - n6;
                    final long n64 = n2 + n62;
                    final long n65 = n2 + n63;
                    final float method183 = class16.method135(n64);
                    final float method184 = class16.method135(n64 + 1L);
                    final float method185 = class16.method135(n65);
                    final float method186 = class16.method135(n65 + 1L);
                    class16.method169(n64, method185);
                    class16.method169(n64 + 1L, method186);
                    class16.method169(n65, method183);
                    class16.method169(n65 + 1L, method184);
                    final long n66 = n62 + n6;
                    final long n67 = n63 + 2L * n6;
                    final long n68 = n2 + n66;
                    final long n69 = n2 + n67;
                    final float method187 = class16.method135(n68);
                    final float method188 = class16.method135(n68 + 1L);
                    final float method189 = class16.method135(n69);
                    final float method190 = class16.method135(n69 + 1L);
                    class16.method169(n68, method189);
                    class16.method169(n68 + 1L, method190);
                    class16.method169(n69, method187);
                    class16.method169(n69 + 1L, method188);
                    final long n70 = n66 + n5;
                    final long n71 = n67 + 2L;
                    final long n72 = n2 + n70;
                    final long n73 = n2 + n71;
                    final float method191 = class16.method135(n72);
                    final float method192 = class16.method135(n72 + 1L);
                    final float method193 = class16.method135(n73);
                    final float method194 = class16.method135(n73 + 1L);
                    class16.method169(n72, method193);
                    class16.method169(n72 + 1L, method194);
                    class16.method169(n73, method191);
                    class16.method169(n73 + 1L, method192);
                    final long n74 = n70 - n6;
                    final long n75 = n71 - 2L * n6;
                    final long n76 = n2 + n74;
                    final long n77 = n2 + n75;
                    final float method195 = class16.method135(n76);
                    final float method196 = class16.method135(n76 + 1L);
                    final float method197 = class16.method135(n77);
                    final float method198 = class16.method135(n77 + 1L);
                    class16.method169(n76, method197);
                    class16.method169(n76 + 1L, method198);
                    class16.method169(n77, method195);
                    class16.method169(n77 + 1L, method196);
                    final long n78 = n74 - n6;
                    final long n79 = n75 + n6;
                    final long n80 = n2 + n78;
                    final long n81 = n2 + n79;
                    final float method199 = class16.method135(n80);
                    final float method200 = class16.method135(n80 + 1L);
                    final float method201 = class16.method135(n81);
                    final float method202 = class16.method135(n81 + 1L);
                    class16.method169(n80, method201);
                    class16.method169(n80 + 1L, method202);
                    class16.method169(n81, method199);
                    class16.method169(n81 + 1L, method200);
                    final long n82 = n78 - n6;
                    final long n83 = n79 - 2L * n6;
                    final long n84 = n2 + n82;
                    final long n85 = n2 + n83;
                    final float method203 = class16.method135(n84);
                    final float method204 = class16.method135(n84 + 1L);
                    final float method205 = class16.method135(n85);
                    final float method206 = class16.method135(n85 + 1L);
                    class16.method169(n84, method205);
                    class16.method169(n84 + 1L, method206);
                    class16.method169(n85, method203);
                    class16.method169(n85 + 1L, method204);
                    final long n86 = n82 + 2L;
                    final long n87 = n83 + n5;
                    final long n88 = n2 + n86;
                    final long n89 = n2 + n87;
                    final float method207 = class16.method135(n88);
                    final float method208 = class16.method135(n88 + 1L);
                    final float method209 = class16.method135(n89);
                    final float method210 = class16.method135(n89 + 1L);
                    class16.method169(n88, method209);
                    class16.method169(n88 + 1L, method210);
                    class16.method169(n89, method207);
                    class16.method169(n89 + 1L, method208);
                    final long n90 = n86 + n6;
                    final long n91 = n87 + 2L * n6;
                    final long n92 = n2 + n90;
                    final long n93 = n2 + n91;
                    final float method211 = class16.method135(n92);
                    final float method212 = class16.method135(n92 + 1L);
                    final float method213 = class16.method135(n93);
                    final float method214 = class16.method135(n93 + 1L);
                    class16.method169(n92, method213);
                    class16.method169(n92 + 1L, method214);
                    class16.method169(n93, method211);
                    class16.method169(n93 + 1L, method212);
                    final long n94 = n90 + n6;
                    final long n95 = n91 - n6;
                    final long n96 = n2 + n94;
                    final long n97 = n2 + n95;
                    final float method215 = class16.method135(n96);
                    final float method216 = class16.method135(n96 + 1L);
                    final float method217 = class16.method135(n97);
                    final float method218 = class16.method135(n97 + 1L);
                    class16.method169(n96, method217);
                    class16.method169(n96 + 1L, method218);
                    class16.method169(n97, method215);
                    class16.method169(n97 + 1L, method216);
                    final long n98 = n94 + n6;
                    final long n99 = n95 + 2L * n6;
                    final long n100 = n2 + n98;
                    final long n101 = n2 + n99;
                    final float method219 = class16.method135(n100);
                    final float method220 = class16.method135(n100 + 1L);
                    final float method221 = class16.method135(n101);
                    final float method222 = class16.method135(n101 + 1L);
                    class16.method169(n100, method221);
                    class16.method169(n100 + 1L, method222);
                    class16.method169(n101, method219);
                    class16.method169(n101 + 1L, method220);
                    final long n102 = n98 - n5;
                    final long n103 = n99 - 2L;
                    final long n104 = n2 + n102;
                    final long n105 = n2 + n103;
                    final float method223 = class16.method135(n104);
                    final float method224 = class16.method135(n104 + 1L);
                    final float method225 = class16.method135(n105);
                    final float method226 = class16.method135(n105 + 1L);
                    class16.method169(n104, method225);
                    class16.method169(n104 + 1L, method226);
                    class16.method169(n105, method223);
                    class16.method169(n105 + 1L, method224);
                    final long n106 = n102 - n6;
                    final long n107 = n103 - 2L * n6;
                    final long n108 = n2 + n106;
                    final long n109 = n2 + n107;
                    final float method227 = class16.method135(n108);
                    final float method228 = class16.method135(n108 + 1L);
                    final float method229 = class16.method135(n109);
                    final float method230 = class16.method135(n109 + 1L);
                    class16.method169(n108, method229);
                    class16.method169(n108 + 1L, method230);
                    class16.method169(n109, method227);
                    class16.method169(n109 + 1L, method228);
                    final long n110 = n106 - n6;
                    final long n111 = n107 + n6;
                    final long n112 = n2 + n110;
                    final long n113 = n2 + n111;
                    final float method231 = class16.method135(n112);
                    final float method232 = class16.method135(n112 + 1L);
                    final float method233 = class16.method135(n113);
                    final float method234 = class16.method135(n113 + 1L);
                    class16.method169(n112, method233);
                    class16.method169(n112 + 1L, method234);
                    class16.method169(n113, method231);
                    class16.method169(n113 + 1L, method232);
                    final long n114 = n110 - n6;
                    final long n115 = n111 - 2L * n6;
                    final long n116 = n2 + n114;
                    final long n117 = n2 + n115;
                    final float method235 = class16.method135(n116);
                    final float method236 = class16.method135(n116 + 1L);
                    final float method237 = class16.method135(n117);
                    final float method238 = class16.method135(n117 + 1L);
                    class16.method169(n116, method237);
                    class16.method169(n116 + 1L, method238);
                    class16.method169(n117, method235);
                    class16.method169(n117 + 1L, method236);
                }
                final long n118 = n52 + 2L * class15.method133(n3 + n51);
                final long n119 = n118 + 2L;
                final long n120 = n118 + n5;
                final long n121 = n2 + n119;
                final long n122 = n2 + n120;
                final float method239 = class16.method135(n121);
                final float method240 = class16.method135(n121 + 1L);
                final float method241 = class16.method135(n122);
                final float method242 = class16.method135(n122 + 1L);
                class16.method169(n121, method241);
                class16.method169(n121 + 1L, method242);
                class16.method169(n122, method239);
                class16.method169(n122 + 1L, method240);
                final long n123 = n119 + n6;
                final long n124 = n120 + 2L * n6;
                final long n125 = n2 + n123;
                final long n126 = n2 + n124;
                final float method243 = class16.method135(n125);
                final float method244 = class16.method135(n125 + 1L);
                final float method245 = class16.method135(n126);
                final float method246 = class16.method135(n126 + 1L);
                class16.method169(n125, method245);
                class16.method169(n125 + 1L, method246);
                class16.method169(n126, method243);
                class16.method169(n126 + 1L, method244);
                final long n127 = n123 + n6;
                final long n128 = n124 - n6;
                final long n129 = n2 + n127;
                final long n130 = n2 + n128;
                final float method247 = class16.method135(n129);
                final float method248 = class16.method135(n129 + 1L);
                final float method249 = class16.method135(n130);
                final float method250 = class16.method135(n130 + 1L);
                class16.method169(n129, method249);
                class16.method169(n129 + 1L, method250);
                class16.method169(n130, method247);
                class16.method169(n130 + 1L, method248);
                final long n131 = n127 - 2L;
                final long n132 = n128 - n5;
                final long n133 = n2 + n131;
                final long n134 = n2 + n132;
                final float method251 = class16.method135(n133);
                final float method252 = class16.method135(n133 + 1L);
                final float method253 = class16.method135(n134);
                final float method254 = class16.method135(n134 + 1L);
                class16.method169(n133, method253);
                class16.method169(n133 + 1L, method254);
                class16.method169(n134, method251);
                class16.method169(n134 + 1L, method252);
                final long n135 = n131 + (n5 + 2L);
                final long n136 = n132 + (n5 + 2L);
                final long n137 = n2 + n135;
                final long n138 = n2 + n136;
                final float method255 = class16.method135(n137);
                final float method256 = class16.method135(n137 + 1L);
                final float method257 = class16.method135(n138);
                final float method258 = class16.method135(n138 + 1L);
                class16.method169(n137, method257);
                class16.method169(n137 + 1L, method258);
                class16.method169(n138, method255);
                class16.method169(n138 + 1L, method256);
                final long n139 = n135 - (n5 - n6);
                final long n140 = n136 + (2L * n6 - 2L);
                final long n141 = n2 + n139;
                final long n142 = n2 + n140;
                final float method259 = class16.method135(n141);
                final float method260 = class16.method135(n141 + 1L);
                final float method261 = class16.method135(n142);
                final float method262 = class16.method135(n142 + 1L);
                class16.method169(n141, method261);
                class16.method169(n141 + 1L, method262);
                class16.method169(n142, method259);
                class16.method169(n142 + 1L, method260);
            }
        }
    }
    
    public static void method33251(final int n, final int[] array, final float[] array2, final int n2) {
        int n3 = 1;
        int i;
        for (i = n >> 2; i > 8; i >>= 2) {
            n3 <<= 1;
        }
        final int n4 = n >> 1;
        final int n5 = 4 * n3;
        if (i != 8) {
            for (int j = 0; j < n3; ++j) {
                final int n6 = 4 * j;
                for (int k = 0; k < j; ++k) {
                    final int n7 = 4 * k + array[n3 + j];
                    final int n8 = n6 + array[n3 + k];
                    final int n9 = n2 + n7;
                    final int n10 = n2 + n8;
                    final float n11 = array2[n9];
                    final float n12 = -array2[n9 + 1];
                    final float n13 = array2[n10];
                    final float n14 = -array2[n10 + 1];
                    array2[n9] = n13;
                    array2[n9 + 1] = n14;
                    array2[n10] = n11;
                    array2[n10 + 1] = n12;
                    final int n15 = n7 + n5;
                    int n16 = n8 + n5;
                    final int n17 = n2 + n15;
                    final int n18 = n2 + n16;
                    final float n19 = array2[n17];
                    final float n20 = -array2[n17 + 1];
                    final float n21 = array2[n18];
                    final float n22 = -array2[n18 + 1];
                    array2[n17] = n21;
                    array2[n17 + 1] = n22;
                    array2[n18] = n19;
                    array2[n18 + 1] = n20;
                    final int n23 = n15 + n4;
                    n16 += 2;
                    final int n24 = n2 + n23;
                    final int n25 = n2 + n16;
                    final float n26 = array2[n24];
                    final float n27 = -array2[n24 + 1];
                    final float n28 = array2[n25];
                    final float n29 = -array2[n25 + 1];
                    array2[n24] = n28;
                    array2[n24 + 1] = n29;
                    array2[n25] = n26;
                    array2[n25 + 1] = n27;
                    int n30 = n23 - n5;
                    final int n31 = n16 - n5;
                    final int n32 = n2 + n30;
                    final int n33 = n2 + n31;
                    final float n34 = array2[n32];
                    final float n35 = -array2[n32 + 1];
                    final float n36 = array2[n33];
                    final float n37 = -array2[n33 + 1];
                    array2[n32] = n36;
                    array2[n32 + 1] = n37;
                    array2[n33] = n34;
                    array2[n33 + 1] = n35;
                    n30 += 2;
                    final int n38 = n31 + n4;
                    final int n39 = n2 + n30;
                    final int n40 = n2 + n38;
                    final float n41 = array2[n39];
                    final float n42 = -array2[n39 + 1];
                    final float n43 = array2[n40];
                    final float n44 = -array2[n40 + 1];
                    array2[n39] = n43;
                    array2[n39 + 1] = n44;
                    array2[n40] = n41;
                    array2[n40 + 1] = n42;
                    final int n45 = n30 + n5;
                    int n46 = n38 + n5;
                    final int n47 = n2 + n45;
                    final int n48 = n2 + n46;
                    final float n49 = array2[n47];
                    final float n50 = -array2[n47 + 1];
                    final float n51 = array2[n48];
                    final float n52 = -array2[n48 + 1];
                    array2[n47] = n51;
                    array2[n47 + 1] = n52;
                    array2[n48] = n49;
                    array2[n48 + 1] = n50;
                    final int n53 = n45 - n4;
                    n46 -= 2;
                    final int n54 = n2 + n53;
                    final int n55 = n2 + n46;
                    final float n56 = array2[n54];
                    final float n57 = -array2[n54 + 1];
                    final float n58 = array2[n55];
                    final float n59 = -array2[n55 + 1];
                    array2[n54] = n58;
                    array2[n54 + 1] = n59;
                    array2[n55] = n56;
                    array2[n55 + 1] = n57;
                    final int n60 = n53 - n5;
                    final int n61 = n46 - n5;
                    final int n62 = n2 + n60;
                    final int n63 = n2 + n61;
                    final float n64 = array2[n62];
                    final float n65 = -array2[n62 + 1];
                    final float n66 = array2[n63];
                    final float n67 = -array2[n63 + 1];
                    array2[n62] = n66;
                    array2[n62 + 1] = n67;
                    array2[n63] = n64;
                    array2[n63 + 1] = n65;
                }
                final int n68 = n6 + array[n3 + j];
                final int n69 = n68 + 2;
                final int n70 = n68 + n4;
                final int n71 = n2 + n69;
                final int n72 = n2 + n70;
                array2[n71 - 1] = -array2[n71 - 1];
                final float n73 = array2[n71];
                final float n74 = -array2[n71 + 1];
                final float n75 = array2[n72];
                final float n76 = -array2[n72 + 1];
                array2[n71] = n75;
                array2[n71 + 1] = n76;
                array2[n72] = n73;
                array2[n72 + 1] = n74;
                array2[n72 + 3] = -array2[n72 + 3];
                final int n77 = n69 + n5;
                final int n78 = n70 + n5;
                final int n79 = n2 + n77;
                final int n80 = n2 + n78;
                array2[n79 - 1] = -array2[n79 - 1];
                final float n81 = array2[n79];
                final float n82 = -array2[n79 + 1];
                final float n83 = array2[n80];
                final float n84 = -array2[n80 + 1];
                array2[n79] = n83;
                array2[n79 + 1] = n84;
                array2[n80] = n81;
                array2[n80 + 1] = n82;
                array2[n80 + 3] = -array2[n80 + 3];
            }
        }
        else {
            for (int l = 0; l < n3; ++l) {
                final int n85 = 4 * l;
                for (int n86 = 0; n86 < l; ++n86) {
                    final int n87 = 4 * n86 + 2 * array[n3 + l];
                    final int n88 = n85 + 2 * array[n3 + n86];
                    final int n89 = n2 + n87;
                    final int n90 = n2 + n88;
                    final float n91 = array2[n89];
                    final float n92 = -array2[n89 + 1];
                    final float n93 = array2[n90];
                    final float n94 = -array2[n90 + 1];
                    array2[n89] = n93;
                    array2[n89 + 1] = n94;
                    array2[n90] = n91;
                    array2[n90 + 1] = n92;
                    final int n95 = n87 + n5;
                    final int n96 = n88 + 2 * n5;
                    final int n97 = n2 + n95;
                    final int n98 = n2 + n96;
                    final float n99 = array2[n97];
                    final float n100 = -array2[n97 + 1];
                    final float n101 = array2[n98];
                    final float n102 = -array2[n98 + 1];
                    array2[n97] = n101;
                    array2[n97 + 1] = n102;
                    array2[n98] = n99;
                    array2[n98 + 1] = n100;
                    final int n103 = n95 + n5;
                    final int n104 = n96 - n5;
                    final int n105 = n2 + n103;
                    final int n106 = n2 + n104;
                    final float n107 = array2[n105];
                    final float n108 = -array2[n105 + 1];
                    final float n109 = array2[n106];
                    final float n110 = -array2[n106 + 1];
                    array2[n105] = n109;
                    array2[n105 + 1] = n110;
                    array2[n106] = n107;
                    array2[n106 + 1] = n108;
                    final int n111 = n103 + n5;
                    int n112 = n104 + 2 * n5;
                    final int n113 = n2 + n111;
                    final int n114 = n2 + n112;
                    final float n115 = array2[n113];
                    final float n116 = -array2[n113 + 1];
                    final float n117 = array2[n114];
                    final float n118 = -array2[n114 + 1];
                    array2[n113] = n117;
                    array2[n113 + 1] = n118;
                    array2[n114] = n115;
                    array2[n114 + 1] = n116;
                    final int n119 = n111 + n4;
                    n112 += 2;
                    final int n120 = n2 + n119;
                    final int n121 = n2 + n112;
                    final float n122 = array2[n120];
                    final float n123 = -array2[n120 + 1];
                    final float n124 = array2[n121];
                    final float n125 = -array2[n121 + 1];
                    array2[n120] = n124;
                    array2[n120 + 1] = n125;
                    array2[n121] = n122;
                    array2[n121 + 1] = n123;
                    final int n126 = n119 - n5;
                    final int n127 = n112 - 2 * n5;
                    final int n128 = n2 + n126;
                    final int n129 = n2 + n127;
                    final float n130 = array2[n128];
                    final float n131 = -array2[n128 + 1];
                    final float n132 = array2[n129];
                    final float n133 = -array2[n129 + 1];
                    array2[n128] = n132;
                    array2[n128 + 1] = n133;
                    array2[n129] = n130;
                    array2[n129 + 1] = n131;
                    final int n134 = n126 - n5;
                    final int n135 = n127 + n5;
                    final int n136 = n2 + n134;
                    final int n137 = n2 + n135;
                    final float n138 = array2[n136];
                    final float n139 = -array2[n136 + 1];
                    final float n140 = array2[n137];
                    final float n141 = -array2[n137 + 1];
                    array2[n136] = n140;
                    array2[n136 + 1] = n141;
                    array2[n137] = n138;
                    array2[n137 + 1] = n139;
                    int n142 = n134 - n5;
                    final int n143 = n135 - 2 * n5;
                    final int n144 = n2 + n142;
                    final int n145 = n2 + n143;
                    final float n146 = array2[n144];
                    final float n147 = -array2[n144 + 1];
                    final float n148 = array2[n145];
                    final float n149 = -array2[n145 + 1];
                    array2[n144] = n148;
                    array2[n144 + 1] = n149;
                    array2[n145] = n146;
                    array2[n145 + 1] = n147;
                    n142 += 2;
                    final int n150 = n143 + n4;
                    final int n151 = n2 + n142;
                    final int n152 = n2 + n150;
                    final float n153 = array2[n151];
                    final float n154 = -array2[n151 + 1];
                    final float n155 = array2[n152];
                    final float n156 = -array2[n152 + 1];
                    array2[n151] = n155;
                    array2[n151 + 1] = n156;
                    array2[n152] = n153;
                    array2[n152 + 1] = n154;
                    final int n157 = n142 + n5;
                    final int n158 = n150 + 2 * n5;
                    final int n159 = n2 + n157;
                    final int n160 = n2 + n158;
                    final float n161 = array2[n159];
                    final float n162 = -array2[n159 + 1];
                    final float n163 = array2[n160];
                    final float n164 = -array2[n160 + 1];
                    array2[n159] = n163;
                    array2[n159 + 1] = n164;
                    array2[n160] = n161;
                    array2[n160 + 1] = n162;
                    final int n165 = n157 + n5;
                    final int n166 = n158 - n5;
                    final int n167 = n2 + n165;
                    final int n168 = n2 + n166;
                    final float n169 = array2[n167];
                    final float n170 = -array2[n167 + 1];
                    final float n171 = array2[n168];
                    final float n172 = -array2[n168 + 1];
                    array2[n167] = n171;
                    array2[n167 + 1] = n172;
                    array2[n168] = n169;
                    array2[n168 + 1] = n170;
                    final int n173 = n165 + n5;
                    int n174 = n166 + 2 * n5;
                    final int n175 = n2 + n173;
                    final int n176 = n2 + n174;
                    final float n177 = array2[n175];
                    final float n178 = -array2[n175 + 1];
                    final float n179 = array2[n176];
                    final float n180 = -array2[n176 + 1];
                    array2[n175] = n179;
                    array2[n175 + 1] = n180;
                    array2[n176] = n177;
                    array2[n176 + 1] = n178;
                    final int n181 = n173 - n4;
                    n174 -= 2;
                    final int n182 = n2 + n181;
                    final int n183 = n2 + n174;
                    final float n184 = array2[n182];
                    final float n185 = -array2[n182 + 1];
                    final float n186 = array2[n183];
                    final float n187 = -array2[n183 + 1];
                    array2[n182] = n186;
                    array2[n182 + 1] = n187;
                    array2[n183] = n184;
                    array2[n183 + 1] = n185;
                    final int n188 = n181 - n5;
                    final int n189 = n174 - 2 * n5;
                    final int n190 = n2 + n188;
                    final int n191 = n2 + n189;
                    final float n192 = array2[n190];
                    final float n193 = -array2[n190 + 1];
                    final float n194 = array2[n191];
                    final float n195 = -array2[n191 + 1];
                    array2[n190] = n194;
                    array2[n190 + 1] = n195;
                    array2[n191] = n192;
                    array2[n191 + 1] = n193;
                    final int n196 = n188 - n5;
                    final int n197 = n189 + n5;
                    final int n198 = n2 + n196;
                    final int n199 = n2 + n197;
                    final float n200 = array2[n198];
                    final float n201 = -array2[n198 + 1];
                    final float n202 = array2[n199];
                    final float n203 = -array2[n199 + 1];
                    array2[n198] = n202;
                    array2[n198 + 1] = n203;
                    array2[n199] = n200;
                    array2[n199 + 1] = n201;
                    final int n204 = n196 - n5;
                    final int n205 = n197 - 2 * n5;
                    final int n206 = n2 + n204;
                    final int n207 = n2 + n205;
                    final float n208 = array2[n206];
                    final float n209 = -array2[n206 + 1];
                    final float n210 = array2[n207];
                    final float n211 = -array2[n207 + 1];
                    array2[n206] = n210;
                    array2[n206 + 1] = n211;
                    array2[n207] = n208;
                    array2[n207 + 1] = n209;
                }
                final int n212 = n85 + 2 * array[n3 + l];
                final int n213 = n212 + 2;
                final int n214 = n212 + n4;
                final int n215 = n2 + n213;
                final int n216 = n2 + n214;
                array2[n215 - 1] = -array2[n215 - 1];
                final float n217 = array2[n215];
                final float n218 = -array2[n215 + 1];
                final float n219 = array2[n216];
                final float n220 = -array2[n216 + 1];
                array2[n215] = n219;
                array2[n215 + 1] = n220;
                array2[n216] = n217;
                array2[n216 + 1] = n218;
                array2[n216 + 3] = -array2[n216 + 3];
                final int n221 = n213 + n5;
                final int n222 = n214 + 2 * n5;
                final int n223 = n2 + n221;
                final int n224 = n2 + n222;
                final float n225 = array2[n223];
                final float n226 = -array2[n223 + 1];
                final float n227 = array2[n224];
                final float n228 = -array2[n224 + 1];
                array2[n223] = n227;
                array2[n223 + 1] = n228;
                array2[n224] = n225;
                array2[n224 + 1] = n226;
                int n229 = n221 + n5;
                final int n230 = n222 - n5;
                final int n231 = n2 + n229;
                final int n232 = n2 + n230;
                final float n233 = array2[n231];
                final float n234 = -array2[n231 + 1];
                final float n235 = array2[n232];
                final float n236 = -array2[n232 + 1];
                array2[n231] = n235;
                array2[n231 + 1] = n236;
                array2[n232] = n233;
                array2[n232 + 1] = n234;
                n229 -= 2;
                final int n237 = n230 - n4;
                final int n238 = n2 + n229;
                final int n239 = n2 + n237;
                final float n240 = array2[n238];
                final float n241 = -array2[n238 + 1];
                final float n242 = array2[n239];
                final float n243 = -array2[n239 + 1];
                array2[n238] = n242;
                array2[n238 + 1] = n243;
                array2[n239] = n240;
                array2[n239 + 1] = n241;
                final int n244 = n229 + (n4 + 2);
                final int n245 = n237 + (n4 + 2);
                final int n246 = n2 + n244;
                final int n247 = n2 + n245;
                final float n248 = array2[n246];
                final float n249 = -array2[n246 + 1];
                final float n250 = array2[n247];
                final float n251 = -array2[n247 + 1];
                array2[n246] = n250;
                array2[n246 + 1] = n251;
                array2[n247] = n248;
                array2[n247 + 1] = n249;
                final int n252 = n244 - (n4 - n5);
                final int n253 = n245 + (2 * n5 - 2);
                final int n254 = n2 + n252;
                final int n255 = n2 + n253;
                array2[n254 - 1] = -array2[n254 - 1];
                final float n256 = array2[n254];
                final float n257 = -array2[n254 + 1];
                final float n258 = array2[n255];
                final float n259 = -array2[n255 + 1];
                array2[n254] = n258;
                array2[n254 + 1] = n259;
                array2[n255] = n256;
                array2[n255 + 1] = n257;
                array2[n255 + 3] = -array2[n255 + 3];
            }
        }
    }
    
    public static void method33252(final long n, final Class15 class15, final Class22 class16, final long n2) {
        long n3 = 1L;
        long n4;
        for (n4 = n >> 2; n4 > 8L; n4 >>= 2) {
            n3 <<= 1;
        }
        final long n5 = n >> 1;
        final long n6 = 4L * n3;
        if (n4 != 8L) {
            for (int n7 = 0; n7 < n3; ++n7) {
                final long n8 = 4L * n7;
                for (int i = 0; i < n7; ++i) {
                    final long n9 = 4L * i + class15.method133(n3 + n7);
                    final long n10 = n8 + class15.method133(n3 + i);
                    final long n11 = n2 + n9;
                    final long n12 = n2 + n10;
                    final float method135 = class16.method135(n11);
                    final float n13 = -class16.method135(n11 + 1L);
                    final float method136 = class16.method135(n12);
                    final float n14 = -class16.method135(n12 + 1L);
                    class16.method169(n11, method136);
                    class16.method169(n11 + 1L, n14);
                    class16.method169(n12, method135);
                    class16.method169(n12 + 1L, n13);
                    final long n15 = n9 + n6;
                    final long n16 = n10 + n6;
                    final long n17 = n2 + n15;
                    final long n18 = n2 + n16;
                    final float method137 = class16.method135(n17);
                    final float n19 = -class16.method135(n17 + 1L);
                    final float method138 = class16.method135(n18);
                    final float n20 = -class16.method135(n18 + 1L);
                    class16.method169(n17, method138);
                    class16.method169(n17 + 1L, n20);
                    class16.method169(n18, method137);
                    class16.method169(n18 + 1L, n19);
                    final long n21 = n15 + n5;
                    final long n22 = n16 + 2L;
                    final long n23 = n2 + n21;
                    final long n24 = n2 + n22;
                    final float method139 = class16.method135(n23);
                    final float n25 = -class16.method135(n23 + 1L);
                    final float method140 = class16.method135(n24);
                    final float n26 = -class16.method135(n24 + 1L);
                    class16.method169(n23, method140);
                    class16.method169(n23 + 1L, n26);
                    class16.method169(n24, method139);
                    class16.method169(n24 + 1L, n25);
                    final long n27 = n21 - n6;
                    final long n28 = n22 - n6;
                    final long n29 = n2 + n27;
                    final long n30 = n2 + n28;
                    final float method141 = class16.method135(n29);
                    final float n31 = -class16.method135(n29 + 1L);
                    final float method142 = class16.method135(n30);
                    final float n32 = -class16.method135(n30 + 1L);
                    class16.method169(n29, method142);
                    class16.method169(n29 + 1L, n32);
                    class16.method169(n30, method141);
                    class16.method169(n30 + 1L, n31);
                    final long n33 = n27 + 2L;
                    final long n34 = n28 + n5;
                    final long n35 = n2 + n33;
                    final long n36 = n2 + n34;
                    final float method143 = class16.method135(n35);
                    final float n37 = -class16.method135(n35 + 1L);
                    final float method144 = class16.method135(n36);
                    final float n38 = -class16.method135(n36 + 1L);
                    class16.method169(n35, method144);
                    class16.method169(n35 + 1L, n38);
                    class16.method169(n36, method143);
                    class16.method169(n36 + 1L, n37);
                    final long n39 = n33 + n6;
                    final long n40 = n34 + n6;
                    final long n41 = n2 + n39;
                    final long n42 = n2 + n40;
                    final float method145 = class16.method135(n41);
                    final float n43 = -class16.method135(n41 + 1L);
                    final float method146 = class16.method135(n42);
                    final float n44 = -class16.method135(n42 + 1L);
                    class16.method169(n41, method146);
                    class16.method169(n41 + 1L, n44);
                    class16.method169(n42, method145);
                    class16.method169(n42 + 1L, n43);
                    final long n45 = n39 - n5;
                    final long n46 = n40 - 2L;
                    final long n47 = n2 + n45;
                    final long n48 = n2 + n46;
                    final float method147 = class16.method135(n47);
                    final float n49 = -class16.method135(n47 + 1L);
                    final float method148 = class16.method135(n48);
                    final float n50 = -class16.method135(n48 + 1L);
                    class16.method169(n47, method148);
                    class16.method169(n47 + 1L, n50);
                    class16.method169(n48, method147);
                    class16.method169(n48 + 1L, n49);
                    final long n51 = n45 - n6;
                    final long n52 = n46 - n6;
                    final long n53 = n2 + n51;
                    final long n54 = n2 + n52;
                    final float method149 = class16.method135(n53);
                    final float n55 = -class16.method135(n53 + 1L);
                    final float method150 = class16.method135(n54);
                    final float n56 = -class16.method135(n54 + 1L);
                    class16.method169(n53, method150);
                    class16.method169(n53 + 1L, n56);
                    class16.method169(n54, method149);
                    class16.method169(n54 + 1L, n55);
                }
                final long n57 = n8 + class15.method133(n3 + n7);
                final long n58 = n57 + 2L;
                final long n59 = n57 + n5;
                final long n60 = n2 + n58;
                final long n61 = n2 + n59;
                class16.method169(n60 - 1L, -class16.method135(n60 - 1L));
                final float method151 = class16.method135(n60);
                final float n62 = -class16.method135(n60 + 1L);
                final float method152 = class16.method135(n61);
                final float n63 = -class16.method135(n61 + 1L);
                class16.method169(n60, method152);
                class16.method169(n60 + 1L, n63);
                class16.method169(n61, method151);
                class16.method169(n61 + 1L, n62);
                class16.method169(n61 + 3L, -class16.method135(n61 + 3L));
                final long n64 = n58 + n6;
                final long n65 = n59 + n6;
                final long n66 = n2 + n64;
                final long n67 = n2 + n65;
                class16.method169(n66 - 1L, -class16.method135(n66 - 1L));
                final float method153 = class16.method135(n66);
                final float n68 = -class16.method135(n66 + 1L);
                final float method154 = class16.method135(n67);
                final float n69 = -class16.method135(n67 + 1L);
                class16.method169(n66, method154);
                class16.method169(n66 + 1L, n69);
                class16.method169(n67, method153);
                class16.method169(n67 + 1L, n68);
                class16.method169(n67 + 3L, -class16.method135(n67 + 3L));
            }
        }
        else {
            for (long n70 = 0L; n70 < n3; ++n70) {
                final long n71 = 4L * n70;
                for (long n72 = 0L; n72 < n70; ++n72) {
                    final long n73 = 4L * n72 + 2L * class15.method133(n3 + n70);
                    final long n74 = n71 + 2L * class15.method133(n3 + n72);
                    final long n75 = n2 + n73;
                    final long n76 = n2 + n74;
                    final float method155 = class16.method135(n75);
                    final float n77 = -class16.method135(n75 + 1L);
                    final float method156 = class16.method135(n76);
                    final float n78 = -class16.method135(n76 + 1L);
                    class16.method169(n75, method156);
                    class16.method169(n75 + 1L, n78);
                    class16.method169(n76, method155);
                    class16.method169(n76 + 1L, n77);
                    final long n79 = n73 + n6;
                    final long n80 = n74 + 2L * n6;
                    final long n81 = n2 + n79;
                    final long n82 = n2 + n80;
                    final float method157 = class16.method135(n81);
                    final float n83 = -class16.method135(n81 + 1L);
                    final float method158 = class16.method135(n82);
                    final float n84 = -class16.method135(n82 + 1L);
                    class16.method169(n81, method158);
                    class16.method169(n81 + 1L, n84);
                    class16.method169(n82, method157);
                    class16.method169(n82 + 1L, n83);
                    final long n85 = n79 + n6;
                    final long n86 = n80 - n6;
                    final long n87 = n2 + n85;
                    final long n88 = n2 + n86;
                    final float method159 = class16.method135(n87);
                    final float n89 = -class16.method135(n87 + 1L);
                    final float method160 = class16.method135(n88);
                    final float n90 = -class16.method135(n88 + 1L);
                    class16.method169(n87, method160);
                    class16.method169(n87 + 1L, n90);
                    class16.method169(n88, method159);
                    class16.method169(n88 + 1L, n89);
                    final long n91 = n85 + n6;
                    final long n92 = n86 + 2L * n6;
                    final long n93 = n2 + n91;
                    final long n94 = n2 + n92;
                    final float method161 = class16.method135(n93);
                    final float n95 = -class16.method135(n93 + 1L);
                    final float method162 = class16.method135(n94);
                    final float n96 = -class16.method135(n94 + 1L);
                    class16.method169(n93, method162);
                    class16.method169(n93 + 1L, n96);
                    class16.method169(n94, method161);
                    class16.method169(n94 + 1L, n95);
                    final long n97 = n91 + n5;
                    final long n98 = n92 + 2L;
                    final long n99 = n2 + n97;
                    final long n100 = n2 + n98;
                    final float method163 = class16.method135(n99);
                    final float n101 = -class16.method135(n99 + 1L);
                    final float method164 = class16.method135(n100);
                    final float n102 = -class16.method135(n100 + 1L);
                    class16.method169(n99, method164);
                    class16.method169(n99 + 1L, n102);
                    class16.method169(n100, method163);
                    class16.method169(n100 + 1L, n101);
                    final long n103 = n97 - n6;
                    final long n104 = n98 - 2L * n6;
                    final long n105 = n2 + n103;
                    final long n106 = n2 + n104;
                    final float method165 = class16.method135(n105);
                    final float n107 = -class16.method135(n105 + 1L);
                    final float method166 = class16.method135(n106);
                    final float n108 = -class16.method135(n106 + 1L);
                    class16.method169(n105, method166);
                    class16.method169(n105 + 1L, n108);
                    class16.method169(n106, method165);
                    class16.method169(n106 + 1L, n107);
                    final long n109 = n103 - n6;
                    final long n110 = n104 + n6;
                    final long n111 = n2 + n109;
                    final long n112 = n2 + n110;
                    final float method167 = class16.method135(n111);
                    final float n113 = -class16.method135(n111 + 1L);
                    final float method168 = class16.method135(n112);
                    final float n114 = -class16.method135(n112 + 1L);
                    class16.method169(n111, method168);
                    class16.method169(n111 + 1L, n114);
                    class16.method169(n112, method167);
                    class16.method169(n112 + 1L, n113);
                    final long n115 = n109 - n6;
                    final long n116 = n110 - 2L * n6;
                    final long n117 = n2 + n115;
                    final long n118 = n2 + n116;
                    final float method169 = class16.method135(n117);
                    final float n119 = -class16.method135(n117 + 1L);
                    final float method170 = class16.method135(n118);
                    final float n120 = -class16.method135(n118 + 1L);
                    class16.method169(n117, method170);
                    class16.method169(n117 + 1L, n120);
                    class16.method169(n118, method169);
                    class16.method169(n118 + 1L, n119);
                    final long n121 = n115 + 2L;
                    final long n122 = n116 + n5;
                    final long n123 = n2 + n121;
                    final long n124 = n2 + n122;
                    final float method171 = class16.method135(n123);
                    final float n125 = -class16.method135(n123 + 1L);
                    final float method172 = class16.method135(n124);
                    final float n126 = -class16.method135(n124 + 1L);
                    class16.method169(n123, method172);
                    class16.method169(n123 + 1L, n126);
                    class16.method169(n124, method171);
                    class16.method169(n124 + 1L, n125);
                    final long n127 = n121 + n6;
                    final long n128 = n122 + 2L * n6;
                    final long n129 = n2 + n127;
                    final long n130 = n2 + n128;
                    final float method173 = class16.method135(n129);
                    final float n131 = -class16.method135(n129 + 1L);
                    final float method174 = class16.method135(n130);
                    final float n132 = -class16.method135(n130 + 1L);
                    class16.method169(n129, method174);
                    class16.method169(n129 + 1L, n132);
                    class16.method169(n130, method173);
                    class16.method169(n130 + 1L, n131);
                    final long n133 = n127 + n6;
                    final long n134 = n128 - n6;
                    final long n135 = n2 + n133;
                    final long n136 = n2 + n134;
                    final float method175 = class16.method135(n135);
                    final float n137 = -class16.method135(n135 + 1L);
                    final float method176 = class16.method135(n136);
                    final float n138 = -class16.method135(n136 + 1L);
                    class16.method169(n135, method176);
                    class16.method169(n135 + 1L, n138);
                    class16.method169(n136, method175);
                    class16.method169(n136 + 1L, n137);
                    final long n139 = n133 + n6;
                    final long n140 = n134 + 2L * n6;
                    final long n141 = n2 + n139;
                    final long n142 = n2 + n140;
                    final float method177 = class16.method135(n141);
                    final float n143 = -class16.method135(n141 + 1L);
                    final float method178 = class16.method135(n142);
                    final float n144 = -class16.method135(n142 + 1L);
                    class16.method169(n141, method178);
                    class16.method169(n141 + 1L, n144);
                    class16.method169(n142, method177);
                    class16.method169(n142 + 1L, n143);
                    final long n145 = n139 - n5;
                    final long n146 = n140 - 2L;
                    final long n147 = n2 + n145;
                    final long n148 = n2 + n146;
                    final float method179 = class16.method135(n147);
                    final float n149 = -class16.method135(n147 + 1L);
                    final float method180 = class16.method135(n148);
                    final float n150 = -class16.method135(n148 + 1L);
                    class16.method169(n147, method180);
                    class16.method169(n147 + 1L, n150);
                    class16.method169(n148, method179);
                    class16.method169(n148 + 1L, n149);
                    final long n151 = n145 - n6;
                    final long n152 = n146 - 2L * n6;
                    final long n153 = n2 + n151;
                    final long n154 = n2 + n152;
                    final float method181 = class16.method135(n153);
                    final float n155 = -class16.method135(n153 + 1L);
                    final float method182 = class16.method135(n154);
                    final float n156 = -class16.method135(n154 + 1L);
                    class16.method169(n153, method182);
                    class16.method169(n153 + 1L, n156);
                    class16.method169(n154, method181);
                    class16.method169(n154 + 1L, n155);
                    final long n157 = n151 - n6;
                    final long n158 = n152 + n6;
                    final long n159 = n2 + n157;
                    final long n160 = n2 + n158;
                    final float method183 = class16.method135(n159);
                    final float n161 = -class16.method135(n159 + 1L);
                    final float method184 = class16.method135(n160);
                    final float n162 = -class16.method135(n160 + 1L);
                    class16.method169(n159, method184);
                    class16.method169(n159 + 1L, n162);
                    class16.method169(n160, method183);
                    class16.method169(n160 + 1L, n161);
                    final long n163 = n157 - n6;
                    final long n164 = n158 - 2L * n6;
                    final long n165 = n2 + n163;
                    final long n166 = n2 + n164;
                    final float method185 = class16.method135(n165);
                    final float n167 = -class16.method135(n165 + 1L);
                    final float method186 = class16.method135(n166);
                    final float n168 = -class16.method135(n166 + 1L);
                    class16.method169(n165, method186);
                    class16.method169(n165 + 1L, n168);
                    class16.method169(n166, method185);
                    class16.method169(n166 + 1L, n167);
                }
                final long n169 = n71 + 2L * class15.method133(n3 + n70);
                final long n170 = n169 + 2L;
                final long n171 = n169 + n5;
                final long n172 = n2 + n170;
                final long n173 = n2 + n171;
                class16.method169(n172 - 1L, -class16.method135(n172 - 1L));
                final float method187 = class16.method135(n172);
                final float n174 = -class16.method135(n172 + 1L);
                final float method188 = class16.method135(n173);
                final float n175 = -class16.method135(n173 + 1L);
                class16.method169(n172, method188);
                class16.method169(n172 + 1L, n175);
                class16.method169(n173, method187);
                class16.method169(n173 + 1L, n174);
                class16.method169(n173 + 3L, -class16.method135(n173 + 3L));
                final long n176 = n170 + n6;
                final long n177 = n171 + 2L * n6;
                final long n178 = n2 + n176;
                final long n179 = n2 + n177;
                final float method189 = class16.method135(n178);
                final float n180 = -class16.method135(n178 + 1L);
                final float method190 = class16.method135(n179);
                final float n181 = -class16.method135(n179 + 1L);
                class16.method169(n178, method190);
                class16.method169(n178 + 1L, n181);
                class16.method169(n179, method189);
                class16.method169(n179 + 1L, n180);
                final long n182 = n176 + n6;
                final long n183 = n177 - n6;
                final long n184 = n2 + n182;
                final long n185 = n2 + n183;
                final float method191 = class16.method135(n184);
                final float n186 = -class16.method135(n184 + 1L);
                final float method192 = class16.method135(n185);
                final float n187 = -class16.method135(n185 + 1L);
                class16.method169(n184, method192);
                class16.method169(n184 + 1L, n187);
                class16.method169(n185, method191);
                class16.method169(n185 + 1L, n186);
                final long n188 = n182 - 2L;
                final long n189 = n183 - n5;
                final long n190 = n2 + n188;
                final long n191 = n2 + n189;
                final float method193 = class16.method135(n190);
                final float n192 = -class16.method135(n190 + 1L);
                final float method194 = class16.method135(n191);
                final float n193 = -class16.method135(n191 + 1L);
                class16.method169(n190, method194);
                class16.method169(n190 + 1L, n193);
                class16.method169(n191, method193);
                class16.method169(n191 + 1L, n192);
                final long n194 = n188 + (n5 + 2L);
                final long n195 = n189 + (n5 + 2L);
                final long n196 = n2 + n194;
                final long n197 = n2 + n195;
                final float method195 = class16.method135(n196);
                final float n198 = -class16.method135(n196 + 1L);
                final float method196 = class16.method135(n197);
                final float n199 = -class16.method135(n197 + 1L);
                class16.method169(n196, method196);
                class16.method169(n196 + 1L, n199);
                class16.method169(n197, method195);
                class16.method169(n197 + 1L, n198);
                final long n200 = n194 - (n5 - n6);
                final long n201 = n195 + (2L * n6 - 2L);
                final long n202 = n2 + n200;
                final long n203 = n2 + n201;
                class16.method169(n202 - 1L, -class16.method135(n202 - 1L));
                final float method197 = class16.method135(n202);
                final float n204 = -class16.method135(n202 + 1L);
                final float method198 = class16.method135(n203);
                final float n205 = -class16.method135(n203 + 1L);
                class16.method169(n202, method198);
                class16.method169(n202 + 1L, n205);
                class16.method169(n203, method197);
                class16.method169(n203 + 1L, n204);
                class16.method169(n203 + 3L, -class16.method135(n203 + 3L));
            }
        }
    }
    
    public static void method33253(final float[] array, final int n) {
        final float n2 = array[n + 2];
        final float n3 = array[n + 3];
        final float n4 = array[n + 4];
        final float n5 = array[n + 5];
        final float n6 = array[n + 6];
        final float n7 = array[n + 7];
        final float n8 = array[n + 8];
        final float n9 = array[n + 9];
        final float n10 = array[n + 10];
        final float n11 = array[n + 11];
        final float n12 = array[n + 14];
        final float n13 = array[n + 15];
        final float n14 = array[n + 16];
        final float n15 = array[n + 17];
        final float n16 = array[n + 20];
        final float n17 = array[n + 21];
        final float n18 = array[n + 22];
        final float n19 = array[n + 23];
        final float n20 = array[n + 24];
        final float n21 = array[n + 25];
        final float n22 = array[n + 26];
        final float n23 = array[n + 27];
        final float n24 = array[n + 28];
        final float n25 = array[n + 29];
        array[n + 2] = n14;
        array[n + 3] = n15;
        array[n + 4] = n8;
        array[n + 5] = n9;
        array[n + 6] = n20;
        array[n + 7] = n21;
        array[n + 8] = n4;
        array[n + 9] = n5;
        array[n + 10] = n16;
        array[n + 11] = n17;
        array[n + 14] = n24;
        array[n + 15] = n25;
        array[n + 16] = n2;
        array[n + 17] = n3;
        array[n + 20] = n10;
        array[n + 21] = n11;
        array[n + 22] = n22;
        array[n + 23] = n23;
        array[n + 24] = n6;
        array[n + 25] = n7;
        array[n + 26] = n18;
        array[n + 27] = n19;
        array[n + 28] = n12;
        array[n + 29] = n13;
    }
    
    public static void method33254(final Class22 class22, final long n) {
        final float method135 = class22.method135(n + 2L);
        final float method136 = class22.method135(n + 3L);
        final float method137 = class22.method135(n + 4L);
        final float method138 = class22.method135(n + 5L);
        final float method139 = class22.method135(n + 6L);
        final float method140 = class22.method135(n + 7L);
        final float method141 = class22.method135(n + 8L);
        final float method142 = class22.method135(n + 9L);
        final float method143 = class22.method135(n + 10L);
        final float method144 = class22.method135(n + 11L);
        final float method145 = class22.method135(n + 14L);
        final float method146 = class22.method135(n + 15L);
        final float method147 = class22.method135(n + 16L);
        final float method148 = class22.method135(n + 17L);
        final float method149 = class22.method135(n + 20L);
        final float method150 = class22.method135(n + 21L);
        final float method151 = class22.method135(n + 22L);
        final float method152 = class22.method135(n + 23L);
        final float method153 = class22.method135(n + 24L);
        final float method154 = class22.method135(n + 25L);
        final float method155 = class22.method135(n + 26L);
        final float method156 = class22.method135(n + 27L);
        final float method157 = class22.method135(n + 28L);
        final float method158 = class22.method135(n + 29L);
        class22.method169(n + 2L, method147);
        class22.method169(n + 3L, method148);
        class22.method169(n + 4L, method141);
        class22.method169(n + 5L, method142);
        class22.method169(n + 6L, method153);
        class22.method169(n + 7L, method154);
        class22.method169(n + 8L, method137);
        class22.method169(n + 9L, method138);
        class22.method169(n + 10L, method149);
        class22.method169(n + 11L, method150);
        class22.method169(n + 14L, method157);
        class22.method169(n + 15L, method158);
        class22.method169(n + 16L, method135);
        class22.method169(n + 17L, method136);
        class22.method169(n + 20L, method143);
        class22.method169(n + 21L, method144);
        class22.method169(n + 22L, method155);
        class22.method169(n + 23L, method156);
        class22.method169(n + 24L, method139);
        class22.method169(n + 25L, method140);
        class22.method169(n + 26L, method151);
        class22.method169(n + 27L, method152);
        class22.method169(n + 28L, method145);
        class22.method169(n + 29L, method146);
    }
    
    public static void method33255(final float[] array, final int n) {
        final float n2 = array[n + 2];
        final float n3 = array[n + 3];
        final float n4 = array[n + 4];
        final float n5 = array[n + 5];
        final float n6 = array[n + 6];
        final float n7 = array[n + 7];
        final float n8 = array[n + 8];
        final float n9 = array[n + 9];
        final float n10 = array[n + 10];
        final float n11 = array[n + 11];
        final float n12 = array[n + 12];
        final float n13 = array[n + 13];
        final float n14 = array[n + 14];
        final float n15 = array[n + 15];
        final float n16 = array[n + 16];
        final float n17 = array[n + 17];
        final float n18 = array[n + 18];
        final float n19 = array[n + 19];
        final float n20 = array[n + 20];
        final float n21 = array[n + 21];
        final float n22 = array[n + 22];
        final float n23 = array[n + 23];
        final float n24 = array[n + 24];
        final float n25 = array[n + 25];
        final float n26 = array[n + 26];
        final float n27 = array[n + 27];
        final float n28 = array[n + 28];
        final float n29 = array[n + 29];
        final float n30 = array[n + 30];
        final float n31 = array[n + 31];
        array[n + 2] = n30;
        array[n + 3] = n31;
        array[n + 4] = n14;
        array[n + 5] = n15;
        array[n + 6] = n22;
        array[n + 7] = n23;
        array[n + 8] = n6;
        array[n + 9] = n7;
        array[n + 10] = n26;
        array[n + 11] = n27;
        array[n + 12] = n10;
        array[n + 13] = n11;
        array[n + 14] = n18;
        array[n + 15] = n19;
        array[n + 16] = n2;
        array[n + 17] = n3;
        array[n + 18] = n28;
        array[n + 19] = n29;
        array[n + 20] = n12;
        array[n + 21] = n13;
        array[n + 22] = n20;
        array[n + 23] = n21;
        array[n + 24] = n4;
        array[n + 25] = n5;
        array[n + 26] = n24;
        array[n + 27] = n25;
        array[n + 28] = n8;
        array[n + 29] = n9;
        array[n + 30] = n16;
        array[n + 31] = n17;
    }
    
    public static void method33256(final Class22 class22, final long n) {
        final float method135 = class22.method135(n + 2L);
        final float method136 = class22.method135(n + 3L);
        final float method137 = class22.method135(n + 4L);
        final float method138 = class22.method135(n + 5L);
        final float method139 = class22.method135(n + 6L);
        final float method140 = class22.method135(n + 7L);
        final float method141 = class22.method135(n + 8L);
        final float method142 = class22.method135(n + 9L);
        final float method143 = class22.method135(n + 10L);
        final float method144 = class22.method135(n + 11L);
        final float method145 = class22.method135(n + 12L);
        final float method146 = class22.method135(n + 13L);
        final float method147 = class22.method135(n + 14L);
        final float method148 = class22.method135(n + 15L);
        final float method149 = class22.method135(n + 16L);
        final float method150 = class22.method135(n + 17L);
        final float method151 = class22.method135(n + 18L);
        final float method152 = class22.method135(n + 19L);
        final float method153 = class22.method135(n + 20L);
        final float method154 = class22.method135(n + 21L);
        final float method155 = class22.method135(n + 22L);
        final float method156 = class22.method135(n + 23L);
        final float method157 = class22.method135(n + 24L);
        final float method158 = class22.method135(n + 25L);
        final float method159 = class22.method135(n + 26L);
        final float method160 = class22.method135(n + 27L);
        final float method161 = class22.method135(n + 28L);
        final float method162 = class22.method135(n + 29L);
        final float method163 = class22.method135(n + 30L);
        final float method164 = class22.method135(n + 31L);
        class22.method169(n + 2L, method163);
        class22.method169(n + 3L, method164);
        class22.method169(n + 4L, method147);
        class22.method169(n + 5L, method148);
        class22.method169(n + 6L, method155);
        class22.method169(n + 7L, method156);
        class22.method169(n + 8L, method139);
        class22.method169(n + 9L, method140);
        class22.method169(n + 10L, method159);
        class22.method169(n + 11L, method160);
        class22.method169(n + 12L, method143);
        class22.method169(n + 13L, method144);
        class22.method169(n + 14L, method151);
        class22.method169(n + 15L, method152);
        class22.method169(n + 16L, method135);
        class22.method169(n + 17L, method136);
        class22.method169(n + 18L, method161);
        class22.method169(n + 19L, method162);
        class22.method169(n + 20L, method145);
        class22.method169(n + 21L, method146);
        class22.method169(n + 22L, method153);
        class22.method169(n + 23L, method154);
        class22.method169(n + 24L, method137);
        class22.method169(n + 25L, method138);
        class22.method169(n + 26L, method157);
        class22.method169(n + 27L, method158);
        class22.method169(n + 28L, method141);
        class22.method169(n + 29L, method142);
        class22.method169(n + 30L, method149);
        class22.method169(n + 31L, method150);
    }
    
    public static void method33257(final float[] array, final int n) {
        final float n2 = array[n + 2];
        final float n3 = array[n + 3];
        final float n4 = array[n + 6];
        final float n5 = array[n + 7];
        final float n6 = array[n + 8];
        final float n7 = array[n + 9];
        final float n8 = array[n + 12];
        final float n9 = array[n + 13];
        array[n + 2] = n6;
        array[n + 3] = n7;
        array[n + 6] = n8;
        array[n + 7] = n9;
        array[n + 8] = n2;
        array[n + 9] = n3;
        array[n + 12] = n4;
        array[n + 13] = n5;
    }
    
    public static void method33258(final Class22 class22, final long n) {
        final float method135 = class22.method135(n + 2L);
        final float method136 = class22.method135(n + 3L);
        final float method137 = class22.method135(n + 6L);
        final float method138 = class22.method135(n + 7L);
        final float method139 = class22.method135(n + 8L);
        final float method140 = class22.method135(n + 9L);
        final float method141 = class22.method135(n + 12L);
        final float method142 = class22.method135(n + 13L);
        class22.method169(n + 2L, method139);
        class22.method169(n + 3L, method140);
        class22.method169(n + 6L, method141);
        class22.method169(n + 7L, method142);
        class22.method169(n + 8L, method135);
        class22.method169(n + 9L, method136);
        class22.method169(n + 12L, method137);
        class22.method169(n + 13L, method138);
    }
    
    public static void method33259(final float[] array, final int n) {
        final float n2 = array[n + 2];
        final float n3 = array[n + 3];
        final float n4 = array[n + 4];
        final float n5 = array[n + 5];
        final float n6 = array[n + 6];
        final float n7 = array[n + 7];
        final float n8 = array[n + 8];
        final float n9 = array[n + 9];
        final float n10 = array[n + 10];
        final float n11 = array[n + 11];
        final float n12 = array[n + 12];
        final float n13 = array[n + 13];
        final float n14 = array[n + 14];
        final float n15 = array[n + 15];
        array[n + 2] = n14;
        array[n + 3] = n15;
        array[n + 4] = n6;
        array[n + 5] = n7;
        array[n + 6] = n10;
        array[n + 7] = n11;
        array[n + 8] = n2;
        array[n + 9] = n3;
        array[n + 10] = n12;
        array[n + 11] = n13;
        array[n + 12] = n4;
        array[n + 13] = n5;
        array[n + 14] = n8;
        array[n + 15] = n9;
    }
    
    public static void method33260(final Class22 class22, final long n) {
        final float method135 = class22.method135(n + 2L);
        final float method136 = class22.method135(n + 3L);
        final float method137 = class22.method135(n + 4L);
        final float method138 = class22.method135(n + 5L);
        final float method139 = class22.method135(n + 6L);
        final float method140 = class22.method135(n + 7L);
        final float method141 = class22.method135(n + 8L);
        final float method142 = class22.method135(n + 9L);
        final float method143 = class22.method135(n + 10L);
        final float method144 = class22.method135(n + 11L);
        final float method145 = class22.method135(n + 12L);
        final float method146 = class22.method135(n + 13L);
        final float method147 = class22.method135(n + 14L);
        final float method148 = class22.method135(n + 15L);
        class22.method169(n + 2L, method147);
        class22.method169(n + 3L, method148);
        class22.method169(n + 4L, method139);
        class22.method169(n + 5L, method140);
        class22.method169(n + 6L, method143);
        class22.method169(n + 7L, method144);
        class22.method169(n + 8L, method135);
        class22.method169(n + 9L, method136);
        class22.method169(n + 10L, method145);
        class22.method169(n + 11L, method146);
        class22.method169(n + 12L, method137);
        class22.method169(n + 13L, method138);
        class22.method169(n + 14L, method141);
        class22.method169(n + 15L, method142);
    }
    
    public static void method33261(final int n, final float[] array, final int n2, final float[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n6;
        final int n5 = n6 = 2 * n4;
        final int n7 = n6 + n5;
        final int n8 = n7 + n5;
        final int n9 = n2 + n6;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final float n12 = array[n2] + array[n10];
        final float n13 = array[n2 + 1] + array[n10 + 1];
        final float n14 = array[n2] - array[n10];
        final float n15 = array[n2 + 1] - array[n10 + 1];
        final float n16 = array[n9] + array[n11];
        final float n17 = array[n9 + 1] + array[n11 + 1];
        final float n18 = array[n9] - array[n11];
        final float n19 = array[n9 + 1] - array[n11 + 1];
        array[n2] = n12 + n16;
        array[n2 + 1] = n13 + n17;
        array[n9] = n12 - n16;
        array[n9 + 1] = n13 - n17;
        array[n10] = n14 - n19;
        array[n10 + 1] = n15 + n18;
        array[n11] = n14 + n19;
        array[n11 + 1] = n15 - n18;
        final float n20 = array2[n3 + 1];
        final float n21 = array2[n3 + 2];
        final float n22 = array2[n3 + 3];
        float n23 = 1.0f;
        float n24 = 0.0f;
        float n25 = 1.0f;
        float n26 = 0.0f;
        int n27 = 0;
        for (int i = 2; i < n4 - 2; i += 4) {
            n27 += 4;
            final int n28 = n3 + n27;
            final float n29 = n21 * (n23 + array2[n28]);
            final float n30 = n21 * (n24 + array2[n28 + 1]);
            final float n31 = n22 * (n25 + array2[n28 + 2]);
            final float n32 = n22 * (n26 + array2[n28 + 3]);
            n23 = array2[n28];
            n24 = array2[n28 + 1];
            n25 = array2[n28 + 2];
            n26 = array2[n28 + 3];
            final int n33 = i + n5;
            final int n34 = n33 + n5;
            final int n35 = n34 + n5;
            final int n36 = n2 + n33;
            final int n37 = n2 + n34;
            final int n38 = n2 + n35;
            final int n39 = n2 + i;
            final float n40 = array[n39] + array[n37];
            final float n41 = array[n39 + 1] + array[n37 + 1];
            final float n42 = array[n39] - array[n37];
            final float n43 = array[n39 + 1] - array[n37 + 1];
            final float n44 = array[n39 + 2] + array[n37 + 2];
            final float n45 = array[n39 + 3] + array[n37 + 3];
            final float n46 = array[n39 + 2] - array[n37 + 2];
            final float n47 = array[n39 + 3] - array[n37 + 3];
            final float n48 = array[n36] + array[n38];
            final float n49 = array[n36 + 1] + array[n38 + 1];
            final float n50 = array[n36] - array[n38];
            final float n51 = array[n36 + 1] - array[n38 + 1];
            final float n52 = array[n36 + 2] + array[n38 + 2];
            final float n53 = array[n36 + 3] + array[n38 + 3];
            final float n54 = array[n36 + 2] - array[n38 + 2];
            final float n55 = array[n36 + 3] - array[n38 + 3];
            array[n39] = n40 + n48;
            array[n39 + 1] = n41 + n49;
            array[n39 + 2] = n44 + n52;
            array[n39 + 3] = n45 + n53;
            array[n36] = n40 - n48;
            array[n36 + 1] = n41 - n49;
            array[n36 + 2] = n44 - n52;
            array[n36 + 3] = n45 - n53;
            final float n56 = n42 - n51;
            final float n57 = n43 + n50;
            array[n37] = n29 * n56 - n30 * n57;
            array[n37 + 1] = n29 * n57 + n30 * n56;
            final float n58 = n46 - n55;
            final float n59 = n47 + n54;
            array[n37 + 2] = n23 * n58 - n24 * n59;
            array[n37 + 3] = n23 * n59 + n24 * n58;
            final float n60 = n42 + n51;
            final float n61 = n43 - n50;
            array[n38] = n31 * n60 + n32 * n61;
            array[n38 + 1] = n31 * n61 - n32 * n60;
            final float n62 = n46 + n55;
            final float n63 = n47 - n54;
            array[n38 + 2] = n25 * n62 + n26 * n63;
            array[n38 + 3] = n25 * n63 - n26 * n62;
            final int n64 = n5 - i;
            final int n65 = n64 + n5;
            final int n66 = n65 + n5;
            final int n67 = n66 + n5;
            final int n68 = n2 + n64;
            final int n69 = n2 + n65;
            final int n70 = n2 + n66;
            final int n71 = n2 + n67;
            final float n72 = array[n68] + array[n70];
            final float n73 = array[n68 + 1] + array[n70 + 1];
            final float n74 = array[n68] - array[n70];
            final float n75 = array[n68 + 1] - array[n70 + 1];
            final float n76 = array[n68 - 2] + array[n70 - 2];
            final float n77 = array[n68 - 1] + array[n70 - 1];
            final float n78 = array[n68 - 2] - array[n70 - 2];
            final float n79 = array[n68 - 1] - array[n70 - 1];
            final float n80 = array[n69] + array[n71];
            final float n81 = array[n69 + 1] + array[n71 + 1];
            final float n82 = array[n69] - array[n71];
            final float n83 = array[n69 + 1] - array[n71 + 1];
            final float n84 = array[n69 - 2] + array[n71 - 2];
            final float n85 = array[n69 - 1] + array[n71 - 1];
            final float n86 = array[n69 - 2] - array[n71 - 2];
            final float n87 = array[n69 - 1] - array[n71 - 1];
            array[n68] = n72 + n80;
            array[n68 + 1] = n73 + n81;
            array[n68 - 2] = n76 + n84;
            array[n68 - 1] = n77 + n85;
            array[n69] = n72 - n80;
            array[n69 + 1] = n73 - n81;
            array[n69 - 2] = n76 - n84;
            array[n69 - 1] = n77 - n85;
            final float n88 = n74 - n83;
            final float n89 = n75 + n82;
            array[n70] = n30 * n88 - n29 * n89;
            array[n70 + 1] = n30 * n89 + n29 * n88;
            final float n90 = n78 - n87;
            final float n91 = n79 + n86;
            array[n70 - 2] = n24 * n90 - n23 * n91;
            array[n70 - 1] = n24 * n91 + n23 * n90;
            final float n92 = n74 + n83;
            final float n93 = n75 - n82;
            array[n71] = n32 * n92 + n31 * n93;
            array[n71 + 1] = n32 * n93 - n31 * n92;
            final float n94 = n78 + n87;
            final float n95 = n79 - n86;
            array[n2 + n67 - 2] = n26 * n94 + n25 * n95;
            array[n2 + n67 - 1] = n26 * n95 - n25 * n94;
        }
        final float n96 = n21 * (n23 + n20);
        final float n97 = n21 * (n24 + n20);
        final float n98 = n22 * (n25 - n20);
        final float n99 = n22 * (n26 - n20);
        final int n100 = n4;
        final int n101 = n100 + n5;
        final int n102 = n101 + n5;
        final int n103 = n102 + n5;
        final int n104 = n2 + n100;
        final int n105 = n2 + n101;
        final int n106 = n2 + n102;
        final int n107 = n2 + n103;
        final float n108 = array[n104 - 2] + array[n106 - 2];
        final float n109 = array[n104 - 1] + array[n106 - 1];
        final float n110 = array[n104 - 2] - array[n106 - 2];
        final float n111 = array[n104 - 1] - array[n106 - 1];
        final float n112 = array[n105 - 2] + array[n107 - 2];
        final float n113 = array[n105 - 1] + array[n107 - 1];
        final float n114 = array[n105 - 2] - array[n107 - 2];
        final float n115 = array[n105 - 1] - array[n107 - 1];
        array[n104 - 2] = n108 + n112;
        array[n104 - 1] = n109 + n113;
        array[n105 - 2] = n108 - n112;
        array[n105 - 1] = n109 - n113;
        final float n116 = n110 - n115;
        final float n117 = n111 + n114;
        array[n106 - 2] = n96 * n116 - n97 * n117;
        array[n106 - 1] = n96 * n117 + n97 * n116;
        final float n118 = n110 + n115;
        final float n119 = n111 - n114;
        array[n107 - 2] = n98 * n118 + n99 * n119;
        array[n107 - 1] = n98 * n119 - n99 * n118;
        final float n120 = array[n104] + array[n106];
        final float n121 = array[n104 + 1] + array[n106 + 1];
        final float n122 = array[n104] - array[n106];
        final float n123 = array[n104 + 1] - array[n106 + 1];
        final float n124 = array[n105] + array[n107];
        final float n125 = array[n105 + 1] + array[n107 + 1];
        final float n126 = array[n105] - array[n107];
        final float n127 = array[n105 + 1] - array[n107 + 1];
        array[n104] = n120 + n124;
        array[n104 + 1] = n121 + n125;
        array[n105] = n120 - n124;
        array[n105 + 1] = n121 - n125;
        final float n128 = n122 - n127;
        final float n129 = n123 + n126;
        array[n106] = n20 * (n128 - n129);
        array[n106 + 1] = n20 * (n129 + n128);
        final float n130 = n122 + n127;
        final float n131 = n123 - n126;
        array[n107] = -n20 * (n130 + n131);
        array[n107 + 1] = -n20 * (n131 - n130);
        final float n132 = array[n104 + 2] + array[n106 + 2];
        final float n133 = array[n104 + 3] + array[n106 + 3];
        final float n134 = array[n104 + 2] - array[n106 + 2];
        final float n135 = array[n104 + 3] - array[n106 + 3];
        final float n136 = array[n105 + 2] + array[n107 + 2];
        final float n137 = array[n105 + 3] + array[n107 + 3];
        final float n138 = array[n105 + 2] - array[n107 + 2];
        final float n139 = array[n105 + 3] - array[n107 + 3];
        array[n104 + 2] = n132 + n136;
        array[n104 + 3] = n133 + n137;
        array[n105 + 2] = n132 - n136;
        array[n105 + 3] = n133 - n137;
        final float n140 = n134 - n139;
        final float n141 = n135 + n138;
        array[n106 + 2] = n97 * n140 - n96 * n141;
        array[n106 + 3] = n97 * n141 + n96 * n140;
        final float n142 = n134 + n139;
        final float n143 = n135 - n138;
        array[n107 + 2] = n99 * n142 + n98 * n143;
        array[n107 + 3] = n99 * n143 - n98 * n142;
    }
    
    public static void method33262(final long n, final Class22 class22, final long n2, final Class22 class23, final long n3) {
        final long n4 = n >> 3;
        final long n6;
        final long n5 = n6 = 2L * n4;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final float n12 = class22.method135(n2) + class22.method135(n10);
        final float n13 = class22.method135(n2 + 1L) + class22.method135(n10 + 1L);
        final float n14 = class22.method135(n2) - class22.method135(n10);
        final float n15 = class22.method135(n2 + 1L) - class22.method135(n10 + 1L);
        final float n16 = class22.method135(n9) + class22.method135(n11);
        final float n17 = class22.method135(n9 + 1L) + class22.method135(n11 + 1L);
        final float n18 = class22.method135(n9) - class22.method135(n11);
        final float n19 = class22.method135(n9 + 1L) - class22.method135(n11 + 1L);
        class22.method169(n2, n12 + n16);
        class22.method169(n2 + 1L, n13 + n17);
        class22.method169(n9, n12 - n16);
        class22.method169(n9 + 1L, n13 - n17);
        class22.method169(n10, n14 - n19);
        class22.method169(n10 + 1L, n15 + n18);
        class22.method169(n11, n14 + n19);
        class22.method169(n11 + 1L, n15 - n18);
        final float method135 = class23.method135(n3 + 1L);
        final float method136 = class23.method135(n3 + 2L);
        final float method137 = class23.method135(n3 + 3L);
        float method138 = 1.0f;
        float method139 = 0.0f;
        float method140 = 1.0f;
        float method141 = 0.0f;
        long n20 = 0L;
        for (int n21 = 2; n21 < n4 - 2L; n21 += 4) {
            n20 += 4L;
            final long n22 = n3 + n20;
            final float n23 = method136 * (method138 + class23.method135(n22));
            final float n24 = method136 * (method139 + class23.method135(n22 + 1L));
            final float n25 = method137 * (method140 + class23.method135(n22 + 2L));
            final float n26 = method137 * (method141 + class23.method135(n22 + 3L));
            method138 = class23.method135(n22);
            method139 = class23.method135(n22 + 1L);
            method140 = class23.method135(n22 + 2L);
            method141 = class23.method135(n22 + 3L);
            final long n27 = n21 + n5;
            final long n28 = n27 + n5;
            final long n29 = n28 + n5;
            final long n30 = n2 + n27;
            final long n31 = n2 + n28;
            final long n32 = n2 + n29;
            final long n33 = n2 + n21;
            final float n34 = class22.method135(n33) + class22.method135(n31);
            final float n35 = class22.method135(n33 + 1L) + class22.method135(n31 + 1L);
            final float n36 = class22.method135(n33) - class22.method135(n31);
            final float n37 = class22.method135(n33 + 1L) - class22.method135(n31 + 1L);
            final float n38 = class22.method135(n33 + 2L) + class22.method135(n31 + 2L);
            final float n39 = class22.method135(n33 + 3L) + class22.method135(n31 + 3L);
            final float n40 = class22.method135(n33 + 2L) - class22.method135(n31 + 2L);
            final float n41 = class22.method135(n33 + 3L) - class22.method135(n31 + 3L);
            final float n42 = class22.method135(n30) + class22.method135(n32);
            final float n43 = class22.method135(n30 + 1L) + class22.method135(n32 + 1L);
            final float n44 = class22.method135(n30) - class22.method135(n32);
            final float n45 = class22.method135(n30 + 1L) - class22.method135(n32 + 1L);
            final float n46 = class22.method135(n30 + 2L) + class22.method135(n32 + 2L);
            final float n47 = class22.method135(n30 + 3L) + class22.method135(n32 + 3L);
            final float n48 = class22.method135(n30 + 2L) - class22.method135(n32 + 2L);
            final float n49 = class22.method135(n30 + 3L) - class22.method135(n32 + 3L);
            class22.method169(n33, n34 + n42);
            class22.method169(n33 + 1L, n35 + n43);
            class22.method169(n33 + 2L, n38 + n46);
            class22.method169(n33 + 3L, n39 + n47);
            class22.method169(n30, n34 - n42);
            class22.method169(n30 + 1L, n35 - n43);
            class22.method169(n30 + 2L, n38 - n46);
            class22.method169(n30 + 3L, n39 - n47);
            final float n50 = n36 - n45;
            final float n51 = n37 + n44;
            class22.method169(n31, n23 * n50 - n24 * n51);
            class22.method169(n31 + 1L, n23 * n51 + n24 * n50);
            final float n52 = n40 - n49;
            final float n53 = n41 + n48;
            class22.method169(n31 + 2L, method138 * n52 - method139 * n53);
            class22.method169(n31 + 3L, method138 * n53 + method139 * n52);
            final float n54 = n36 + n45;
            final float n55 = n37 - n44;
            class22.method169(n32, n25 * n54 + n26 * n55);
            class22.method169(n32 + 1L, n25 * n55 - n26 * n54);
            final float n56 = n40 + n49;
            final float n57 = n41 - n48;
            class22.method169(n32 + 2L, method140 * n56 + method141 * n57);
            class22.method169(n32 + 3L, method140 * n57 - method141 * n56);
            final long n58 = n5 - n21;
            final long n59 = n58 + n5;
            final long n60 = n59 + n5;
            final long n61 = n60 + n5;
            final long n62 = n2 + n58;
            final long n63 = n2 + n59;
            final long n64 = n2 + n60;
            final long n65 = n2 + n61;
            final float n66 = class22.method135(n62) + class22.method135(n64);
            final float n67 = class22.method135(n62 + 1L) + class22.method135(n64 + 1L);
            final float n68 = class22.method135(n62) - class22.method135(n64);
            final float n69 = class22.method135(n62 + 1L) - class22.method135(n64 + 1L);
            final float n70 = class22.method135(n62 - 2L) + class22.method135(n64 - 2L);
            final float n71 = class22.method135(n62 - 1L) + class22.method135(n64 - 1L);
            final float n72 = class22.method135(n62 - 2L) - class22.method135(n64 - 2L);
            final float n73 = class22.method135(n62 - 1L) - class22.method135(n64 - 1L);
            final float n74 = class22.method135(n63) + class22.method135(n65);
            final float n75 = class22.method135(n63 + 1L) + class22.method135(n65 + 1L);
            final float n76 = class22.method135(n63) - class22.method135(n65);
            final float n77 = class22.method135(n63 + 1L) - class22.method135(n65 + 1L);
            final float n78 = class22.method135(n63 - 2L) + class22.method135(n65 - 2L);
            final float n79 = class22.method135(n63 - 1L) + class22.method135(n65 - 1L);
            final float n80 = class22.method135(n63 - 2L) - class22.method135(n65 - 2L);
            final float n81 = class22.method135(n63 - 1L) - class22.method135(n65 - 1L);
            class22.method169(n62, n66 + n74);
            class22.method169(n62 + 1L, n67 + n75);
            class22.method169(n62 - 2L, n70 + n78);
            class22.method169(n62 - 1L, n71 + n79);
            class22.method169(n63, n66 - n74);
            class22.method169(n63 + 1L, n67 - n75);
            class22.method169(n63 - 2L, n70 - n78);
            class22.method169(n63 - 1L, n71 - n79);
            final float n82 = n68 - n77;
            final float n83 = n69 + n76;
            class22.method169(n64, n24 * n82 - n23 * n83);
            class22.method169(n64 + 1L, n24 * n83 + n23 * n82);
            final float n84 = n72 - n81;
            final float n85 = n73 + n80;
            class22.method169(n64 - 2L, method139 * n84 - method138 * n85);
            class22.method169(n64 - 1L, method139 * n85 + method138 * n84);
            final float n86 = n68 + n77;
            final float n87 = n69 - n76;
            class22.method169(n65, n26 * n86 + n25 * n87);
            class22.method169(n65 + 1L, n26 * n87 - n25 * n86);
            final float n88 = n72 + n81;
            final float n89 = n73 - n80;
            class22.method169(n2 + n61 - 2L, method141 * n88 + method140 * n89);
            class22.method169(n2 + n61 - 1L, method141 * n89 - method140 * n88);
        }
        final float n90 = method136 * (method138 + method135);
        final float n91 = method136 * (method139 + method135);
        final float n92 = method137 * (method140 - method135);
        final float n93 = method137 * (method141 - method135);
        final long n94 = n4;
        final long n95 = n94 + n5;
        final long n96 = n95 + n5;
        final long n97 = n96 + n5;
        final long n98 = n2 + n94;
        final long n99 = n2 + n95;
        final long n100 = n2 + n96;
        final long n101 = n2 + n97;
        final float n102 = class22.method135(n98 - 2L) + class22.method135(n100 - 2L);
        final float n103 = class22.method135(n98 - 1L) + class22.method135(n100 - 1L);
        final float n104 = class22.method135(n98 - 2L) - class22.method135(n100 - 2L);
        final float n105 = class22.method135(n98 - 1L) - class22.method135(n100 - 1L);
        final float n106 = class22.method135(n99 - 2L) + class22.method135(n101 - 2L);
        final float n107 = class22.method135(n99 - 1L) + class22.method135(n101 - 1L);
        final float n108 = class22.method135(n99 - 2L) - class22.method135(n101 - 2L);
        final float n109 = class22.method135(n99 - 1L) - class22.method135(n101 - 1L);
        class22.method169(n98 - 2L, n102 + n106);
        class22.method169(n98 - 1L, n103 + n107);
        class22.method169(n99 - 2L, n102 - n106);
        class22.method169(n99 - 1L, n103 - n107);
        final float n110 = n104 - n109;
        final float n111 = n105 + n108;
        class22.method169(n100 - 2L, n90 * n110 - n91 * n111);
        class22.method169(n100 - 1L, n90 * n111 + n91 * n110);
        final float n112 = n104 + n109;
        final float n113 = n105 - n108;
        class22.method169(n101 - 2L, n92 * n112 + n93 * n113);
        class22.method169(n101 - 1L, n92 * n113 - n93 * n112);
        final float n114 = class22.method135(n98) + class22.method135(n100);
        final float n115 = class22.method135(n98 + 1L) + class22.method135(n100 + 1L);
        final float n116 = class22.method135(n98) - class22.method135(n100);
        final float n117 = class22.method135(n98 + 1L) - class22.method135(n100 + 1L);
        final float n118 = class22.method135(n99) + class22.method135(n101);
        final float n119 = class22.method135(n99 + 1L) + class22.method135(n101 + 1L);
        final float n120 = class22.method135(n99) - class22.method135(n101);
        final float n121 = class22.method135(n99 + 1L) - class22.method135(n101 + 1L);
        class22.method169(n98, n114 + n118);
        class22.method169(n98 + 1L, n115 + n119);
        class22.method169(n99, n114 - n118);
        class22.method169(n99 + 1L, n115 - n119);
        final float n122 = n116 - n121;
        final float n123 = n117 + n120;
        class22.method169(n100, method135 * (n122 - n123));
        class22.method169(n100 + 1L, method135 * (n123 + n122));
        final float n124 = n116 + n121;
        final float n125 = n117 - n120;
        class22.method169(n101, -method135 * (n124 + n125));
        class22.method169(n101 + 1L, -method135 * (n125 - n124));
        final float n126 = class22.method135(n98 + 2L) + class22.method135(n100 + 2L);
        final float n127 = class22.method135(n98 + 3L) + class22.method135(n100 + 3L);
        final float n128 = class22.method135(n98 + 2L) - class22.method135(n100 + 2L);
        final float n129 = class22.method135(n98 + 3L) - class22.method135(n100 + 3L);
        final float n130 = class22.method135(n99 + 2L) + class22.method135(n101 + 2L);
        final float n131 = class22.method135(n99 + 3L) + class22.method135(n101 + 3L);
        final float n132 = class22.method135(n99 + 2L) - class22.method135(n101 + 2L);
        final float n133 = class22.method135(n99 + 3L) - class22.method135(n101 + 3L);
        class22.method169(n98 + 2L, n126 + n130);
        class22.method169(n98 + 3L, n127 + n131);
        class22.method169(n99 + 2L, n126 - n130);
        class22.method169(n99 + 3L, n127 - n131);
        final float n134 = n128 - n133;
        final float n135 = n129 + n132;
        class22.method169(n100 + 2L, n91 * n134 - n90 * n135);
        class22.method169(n100 + 3L, n91 * n135 + n90 * n134);
        final float n136 = n128 + n133;
        final float n137 = n129 - n132;
        class22.method169(n101 + 2L, n93 * n136 + n92 * n137);
        class22.method169(n101 + 3L, n93 * n137 - n92 * n136);
    }
    
    public static void method33263(final int n, final float[] array, final int n2, final float[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n6;
        final int n5 = n6 = 2 * n4;
        final int n7 = n6 + n5;
        final int n8 = n7 + n5;
        final int n9 = n2 + n6;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final float n12 = array[n2] + array[n10];
        final float n13 = -array[n2 + 1] - array[n10 + 1];
        final float n14 = array[n2] - array[n10];
        final float n15 = -array[n2 + 1] + array[n10 + 1];
        final float n16 = array[n9] + array[n11];
        final float n17 = array[n9 + 1] + array[n11 + 1];
        final float n18 = array[n9] - array[n11];
        final float n19 = array[n9 + 1] - array[n11 + 1];
        array[n2] = n12 + n16;
        array[n2 + 1] = n13 - n17;
        array[n9] = n12 - n16;
        array[n9 + 1] = n13 + n17;
        array[n10] = n14 + n19;
        array[n10 + 1] = n15 + n18;
        array[n11] = n14 - n19;
        array[n11 + 1] = n15 - n18;
        final float n20 = array2[n3 + 1];
        final float n21 = array2[n3 + 2];
        final float n22 = array2[n3 + 3];
        float n23 = 1.0f;
        float n24 = 0.0f;
        float n25 = 1.0f;
        float n26 = 0.0f;
        int n27 = 0;
        for (int i = 2; i < n4 - 2; i += 4) {
            n27 += 4;
            final int n28 = n3 + n27;
            final float n29 = n21 * (n23 + array2[n28]);
            final float n30 = n21 * (n24 + array2[n28 + 1]);
            final float n31 = n22 * (n25 + array2[n28 + 2]);
            final float n32 = n22 * (n26 + array2[n28 + 3]);
            n23 = array2[n28];
            n24 = array2[n28 + 1];
            n25 = array2[n28 + 2];
            n26 = array2[n28 + 3];
            final int n33 = i + n5;
            final int n34 = n33 + n5;
            final int n35 = n34 + n5;
            final int n36 = n2 + n33;
            final int n37 = n2 + n34;
            final int n38 = n2 + n35;
            final int n39 = n2 + i;
            final float n40 = array[n39] + array[n37];
            final float n41 = -array[n39 + 1] - array[n37 + 1];
            final float n42 = array[n39] - array[n2 + n34];
            final float n43 = -array[n39 + 1] + array[n37 + 1];
            final float n44 = array[n39 + 2] + array[n37 + 2];
            final float n45 = -array[n39 + 3] - array[n37 + 3];
            final float n46 = array[n39 + 2] - array[n37 + 2];
            final float n47 = -array[n39 + 3] + array[n37 + 3];
            final float n48 = array[n36] + array[n38];
            final float n49 = array[n36 + 1] + array[n38 + 1];
            final float n50 = array[n36] - array[n38];
            final float n51 = array[n36 + 1] - array[n38 + 1];
            final float n52 = array[n36 + 2] + array[n38 + 2];
            final float n53 = array[n36 + 3] + array[n38 + 3];
            final float n54 = array[n36 + 2] - array[n38 + 2];
            final float n55 = array[n36 + 3] - array[n38 + 3];
            array[n39] = n40 + n48;
            array[n39 + 1] = n41 - n49;
            array[n39 + 2] = n44 + n52;
            array[n39 + 3] = n45 - n53;
            array[n36] = n40 - n48;
            array[n36 + 1] = n41 + n49;
            array[n36 + 2] = n44 - n52;
            array[n36 + 3] = n45 + n53;
            final float n56 = n42 + n51;
            final float n57 = n43 + n50;
            array[n37] = n29 * n56 - n30 * n57;
            array[n37 + 1] = n29 * n57 + n30 * n56;
            final float n58 = n46 + n55;
            final float n59 = n47 + n54;
            array[n37 + 2] = n23 * n58 - n24 * n59;
            array[n37 + 3] = n23 * n59 + n24 * n58;
            final float n60 = n42 - n51;
            final float n61 = n43 - n50;
            array[n38] = n31 * n60 + n32 * n61;
            array[n38 + 1] = n31 * n61 - n32 * n60;
            final float n62 = n46 - n55;
            final float n63 = n47 - n54;
            array[n38 + 2] = n25 * n62 + n26 * n63;
            array[n38 + 3] = n25 * n63 - n26 * n62;
            final int n64 = n5 - i;
            final int n65 = n64 + n5;
            final int n66 = n65 + n5;
            final int n67 = n66 + n5;
            final int n68 = n2 + n64;
            final int n69 = n2 + n65;
            final int n70 = n2 + n66;
            final int n71 = n2 + n67;
            final float n72 = array[n68] + array[n70];
            final float n73 = -array[n68 + 1] - array[n70 + 1];
            final float n74 = array[n68] - array[n70];
            final float n75 = -array[n68 + 1] + array[n70 + 1];
            final float n76 = array[n68 - 2] + array[n70 - 2];
            final float n77 = -array[n68 - 1] - array[n70 - 1];
            final float n78 = array[n68 - 2] - array[n70 - 2];
            final float n79 = -array[n68 - 1] + array[n70 - 1];
            final float n80 = array[n69] + array[n71];
            final float n81 = array[n69 + 1] + array[n71 + 1];
            final float n82 = array[n69] - array[n71];
            final float n83 = array[n69 + 1] - array[n71 + 1];
            final float n84 = array[n69 - 2] + array[n71 - 2];
            final float n85 = array[n69 - 1] + array[n71 - 1];
            final float n86 = array[n69 - 2] - array[n71 - 2];
            final float n87 = array[n69 - 1] - array[n71 - 1];
            array[n68] = n72 + n80;
            array[n68 + 1] = n73 - n81;
            array[n68 - 2] = n76 + n84;
            array[n68 - 1] = n77 - n85;
            array[n69] = n72 - n80;
            array[n69 + 1] = n73 + n81;
            array[n69 - 2] = n76 - n84;
            array[n69 - 1] = n77 + n85;
            final float n88 = n74 + n83;
            final float n89 = n75 + n82;
            array[n70] = n30 * n88 - n29 * n89;
            array[n70 + 1] = n30 * n89 + n29 * n88;
            final float n90 = n78 + n87;
            final float n91 = n79 + n86;
            array[n70 - 2] = n24 * n90 - n23 * n91;
            array[n70 - 1] = n24 * n91 + n23 * n90;
            final float n92 = n74 - n83;
            final float n93 = n75 - n82;
            array[n71] = n32 * n92 + n31 * n93;
            array[n71 + 1] = n32 * n93 - n31 * n92;
            final float n94 = n78 - n87;
            final float n95 = n79 - n86;
            array[n71 - 2] = n26 * n94 + n25 * n95;
            array[n71 - 1] = n26 * n95 - n25 * n94;
        }
        final float n96 = n21 * (n23 + n20);
        final float n97 = n21 * (n24 + n20);
        final float n98 = n22 * (n25 - n20);
        final float n99 = n22 * (n26 - n20);
        final int n100 = n4;
        final int n101 = n100 + n5;
        final int n102 = n101 + n5;
        final int n103 = n102 + n5;
        final int n104 = n2 + n100;
        final int n105 = n2 + n101;
        final int n106 = n2 + n102;
        final int n107 = n2 + n103;
        final float n108 = array[n104 - 2] + array[n106 - 2];
        final float n109 = -array[n104 - 1] - array[n106 - 1];
        final float n110 = array[n104 - 2] - array[n106 - 2];
        final float n111 = -array[n104 - 1] + array[n106 - 1];
        final float n112 = array[n105 - 2] + array[n107 - 2];
        final float n113 = array[n105 - 1] + array[n107 - 1];
        final float n114 = array[n105 - 2] - array[n107 - 2];
        final float n115 = array[n105 - 1] - array[n107 - 1];
        array[n104 - 2] = n108 + n112;
        array[n104 - 1] = n109 - n113;
        array[n105 - 2] = n108 - n112;
        array[n105 - 1] = n109 + n113;
        final float n116 = n110 + n115;
        final float n117 = n111 + n114;
        array[n106 - 2] = n96 * n116 - n97 * n117;
        array[n106 - 1] = n96 * n117 + n97 * n116;
        final float n118 = n110 - n115;
        final float n119 = n111 - n114;
        array[n107 - 2] = n98 * n118 + n99 * n119;
        array[n107 - 1] = n98 * n119 - n99 * n118;
        final float n120 = array[n104] + array[n106];
        final float n121 = -array[n104 + 1] - array[n106 + 1];
        final float n122 = array[n104] - array[n106];
        final float n123 = -array[n104 + 1] + array[n106 + 1];
        final float n124 = array[n105] + array[n107];
        final float n125 = array[n105 + 1] + array[n107 + 1];
        final float n126 = array[n105] - array[n107];
        final float n127 = array[n105 + 1] - array[n107 + 1];
        array[n104] = n120 + n124;
        array[n104 + 1] = n121 - n125;
        array[n105] = n120 - n124;
        array[n105 + 1] = n121 + n125;
        final float n128 = n122 + n127;
        final float n129 = n123 + n126;
        array[n106] = n20 * (n128 - n129);
        array[n106 + 1] = n20 * (n129 + n128);
        final float n130 = n122 - n127;
        final float n131 = n123 - n126;
        array[n107] = -n20 * (n130 + n131);
        array[n107 + 1] = -n20 * (n131 - n130);
        final float n132 = array[n104 + 2] + array[n106 + 2];
        final float n133 = -array[n104 + 3] - array[n106 + 3];
        final float n134 = array[n104 + 2] - array[n106 + 2];
        final float n135 = -array[n104 + 3] + array[n106 + 3];
        final float n136 = array[n105 + 2] + array[n107 + 2];
        final float n137 = array[n105 + 3] + array[n107 + 3];
        final float n138 = array[n105 + 2] - array[n107 + 2];
        final float n139 = array[n105 + 3] - array[n107 + 3];
        array[n104 + 2] = n132 + n136;
        array[n104 + 3] = n133 - n137;
        array[n105 + 2] = n132 - n136;
        array[n105 + 3] = n133 + n137;
        final float n140 = n134 + n139;
        final float n141 = n135 + n138;
        array[n106 + 2] = n97 * n140 - n96 * n141;
        array[n106 + 3] = n97 * n141 + n96 * n140;
        final float n142 = n134 - n139;
        final float n143 = n135 - n138;
        array[n107 + 2] = n99 * n142 + n98 * n143;
        array[n107 + 3] = n99 * n143 - n98 * n142;
    }
    
    public static void method33264(final long n, final Class22 class22, final long n2, final Class22 class23, final long n3) {
        final long n4 = n >> 3;
        final long n6;
        final long n5 = n6 = 2L * n4;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final float n12 = class22.method135(n2) + class22.method135(n10);
        final float n13 = -class22.method135(n2 + 1L) - class22.method135(n10 + 1L);
        final float n14 = class22.method135(n2) - class22.method135(n10);
        final float n15 = -class22.method135(n2 + 1L) + class22.method135(n10 + 1L);
        final float n16 = class22.method135(n9) + class22.method135(n11);
        final float n17 = class22.method135(n9 + 1L) + class22.method135(n11 + 1L);
        final float n18 = class22.method135(n9) - class22.method135(n11);
        final float n19 = class22.method135(n9 + 1L) - class22.method135(n11 + 1L);
        class22.method169(n2, n12 + n16);
        class22.method169(n2 + 1L, n13 - n17);
        class22.method169(n9, n12 - n16);
        class22.method169(n9 + 1L, n13 + n17);
        class22.method169(n10, n14 + n19);
        class22.method169(n10 + 1L, n15 + n18);
        class22.method169(n11, n14 - n19);
        class22.method169(n11 + 1L, n15 - n18);
        final float method135 = class23.method135(n3 + 1L);
        final float method136 = class23.method135(n3 + 2L);
        final float method137 = class23.method135(n3 + 3L);
        float method138 = 1.0f;
        float method139 = 0.0f;
        float method140 = 1.0f;
        float method141 = 0.0f;
        long n20 = 0L;
        for (long n21 = 2L; n21 < n4 - 2L; n21 += 4L) {
            n20 += 4L;
            final long n22 = n3 + n20;
            final float n23 = method136 * (method138 + class23.method135(n22));
            final float n24 = method136 * (method139 + class23.method135(n22 + 1L));
            final float n25 = method137 * (method140 + class23.method135(n22 + 2L));
            final float n26 = method137 * (method141 + class23.method135(n22 + 3L));
            method138 = class23.method135(n22);
            method139 = class23.method135(n22 + 1L);
            method140 = class23.method135(n22 + 2L);
            method141 = class23.method135(n22 + 3L);
            final long n27 = n21 + n5;
            final long n28 = n27 + n5;
            final long n29 = n28 + n5;
            final long n30 = n2 + n27;
            final long n31 = n2 + n28;
            final long n32 = n2 + n29;
            final long n33 = n2 + n21;
            final float n34 = class22.method135(n33) + class22.method135(n31);
            final float n35 = -class22.method135(n33 + 1L) - class22.method135(n31 + 1L);
            final float n36 = class22.method135(n33) - class22.method135(n2 + n28);
            final float n37 = -class22.method135(n33 + 1L) + class22.method135(n31 + 1L);
            final float n38 = class22.method135(n33 + 2L) + class22.method135(n31 + 2L);
            final float n39 = -class22.method135(n33 + 3L) - class22.method135(n31 + 3L);
            final float n40 = class22.method135(n33 + 2L) - class22.method135(n31 + 2L);
            final float n41 = -class22.method135(n33 + 3L) + class22.method135(n31 + 3L);
            final float n42 = class22.method135(n30) + class22.method135(n32);
            final float n43 = class22.method135(n30 + 1L) + class22.method135(n32 + 1L);
            final float n44 = class22.method135(n30) - class22.method135(n32);
            final float n45 = class22.method135(n30 + 1L) - class22.method135(n32 + 1L);
            final float n46 = class22.method135(n30 + 2L) + class22.method135(n32 + 2L);
            final float n47 = class22.method135(n30 + 3L) + class22.method135(n32 + 3L);
            final float n48 = class22.method135(n30 + 2L) - class22.method135(n32 + 2L);
            final float n49 = class22.method135(n30 + 3L) - class22.method135(n32 + 3L);
            class22.method169(n33, n34 + n42);
            class22.method169(n33 + 1L, n35 - n43);
            class22.method169(n33 + 2L, n38 + n46);
            class22.method169(n33 + 3L, n39 - n47);
            class22.method169(n30, n34 - n42);
            class22.method169(n30 + 1L, n35 + n43);
            class22.method169(n30 + 2L, n38 - n46);
            class22.method169(n30 + 3L, n39 + n47);
            final float n50 = n36 + n45;
            final float n51 = n37 + n44;
            class22.method169(n31, n23 * n50 - n24 * n51);
            class22.method169(n31 + 1L, n23 * n51 + n24 * n50);
            final float n52 = n40 + n49;
            final float n53 = n41 + n48;
            class22.method169(n31 + 2L, method138 * n52 - method139 * n53);
            class22.method169(n31 + 3L, method138 * n53 + method139 * n52);
            final float n54 = n36 - n45;
            final float n55 = n37 - n44;
            class22.method169(n32, n25 * n54 + n26 * n55);
            class22.method169(n32 + 1L, n25 * n55 - n26 * n54);
            final float n56 = n40 - n49;
            final float n57 = n41 - n48;
            class22.method169(n32 + 2L, method140 * n56 + method141 * n57);
            class22.method169(n32 + 3L, method140 * n57 - method141 * n56);
            final long n58 = n5 - n21;
            final long n59 = n58 + n5;
            final long n60 = n59 + n5;
            final long n61 = n60 + n5;
            final long n62 = n2 + n58;
            final long n63 = n2 + n59;
            final long n64 = n2 + n60;
            final long n65 = n2 + n61;
            final float n66 = class22.method135(n62) + class22.method135(n64);
            final float n67 = -class22.method135(n62 + 1L) - class22.method135(n64 + 1L);
            final float n68 = class22.method135(n62) - class22.method135(n64);
            final float n69 = -class22.method135(n62 + 1L) + class22.method135(n64 + 1L);
            final float n70 = class22.method135(n62 - 2L) + class22.method135(n64 - 2L);
            final float n71 = -class22.method135(n62 - 1L) - class22.method135(n64 - 1L);
            final float n72 = class22.method135(n62 - 2L) - class22.method135(n64 - 2L);
            final float n73 = -class22.method135(n62 - 1L) + class22.method135(n64 - 1L);
            final float n74 = class22.method135(n63) + class22.method135(n65);
            final float n75 = class22.method135(n63 + 1L) + class22.method135(n65 + 1L);
            final float n76 = class22.method135(n63) - class22.method135(n65);
            final float n77 = class22.method135(n63 + 1L) - class22.method135(n65 + 1L);
            final float n78 = class22.method135(n63 - 2L) + class22.method135(n65 - 2L);
            final float n79 = class22.method135(n63 - 1L) + class22.method135(n65 - 1L);
            final float n80 = class22.method135(n63 - 2L) - class22.method135(n65 - 2L);
            final float n81 = class22.method135(n63 - 1L) - class22.method135(n65 - 1L);
            class22.method169(n62, n66 + n74);
            class22.method169(n62 + 1L, n67 - n75);
            class22.method169(n62 - 2L, n70 + n78);
            class22.method169(n62 - 1L, n71 - n79);
            class22.method169(n63, n66 - n74);
            class22.method169(n63 + 1L, n67 + n75);
            class22.method169(n63 - 2L, n70 - n78);
            class22.method169(n63 - 1L, n71 + n79);
            final float n82 = n68 + n77;
            final float n83 = n69 + n76;
            class22.method169(n64, n24 * n82 - n23 * n83);
            class22.method169(n64 + 1L, n24 * n83 + n23 * n82);
            final float n84 = n72 + n81;
            final float n85 = n73 + n80;
            class22.method169(n64 - 2L, method139 * n84 - method138 * n85);
            class22.method169(n64 - 1L, method139 * n85 + method138 * n84);
            final float n86 = n68 - n77;
            final float n87 = n69 - n76;
            class22.method169(n65, n26 * n86 + n25 * n87);
            class22.method169(n65 + 1L, n26 * n87 - n25 * n86);
            final float n88 = n72 - n81;
            final float n89 = n73 - n80;
            class22.method169(n65 - 2L, method141 * n88 + method140 * n89);
            class22.method169(n65 - 1L, method141 * n89 - method140 * n88);
        }
        final float n90 = method136 * (method138 + method135);
        final float n91 = method136 * (method139 + method135);
        final float n92 = method137 * (method140 - method135);
        final float n93 = method137 * (method141 - method135);
        final long n94 = n4;
        final long n95 = n94 + n5;
        final long n96 = n95 + n5;
        final long n97 = n96 + n5;
        final long n98 = n2 + n94;
        final long n99 = n2 + n95;
        final long n100 = n2 + n96;
        final long n101 = n2 + n97;
        final float n102 = class22.method135(n98 - 2L) + class22.method135(n100 - 2L);
        final float n103 = -class22.method135(n98 - 1L) - class22.method135(n100 - 1L);
        final float n104 = class22.method135(n98 - 2L) - class22.method135(n100 - 2L);
        final float n105 = -class22.method135(n98 - 1L) + class22.method135(n100 - 1L);
        final float n106 = class22.method135(n99 - 2L) + class22.method135(n101 - 2L);
        final float n107 = class22.method135(n99 - 1L) + class22.method135(n101 - 1L);
        final float n108 = class22.method135(n99 - 2L) - class22.method135(n101 - 2L);
        final float n109 = class22.method135(n99 - 1L) - class22.method135(n101 - 1L);
        class22.method169(n98 - 2L, n102 + n106);
        class22.method169(n98 - 1L, n103 - n107);
        class22.method169(n99 - 2L, n102 - n106);
        class22.method169(n99 - 1L, n103 + n107);
        final float n110 = n104 + n109;
        final float n111 = n105 + n108;
        class22.method169(n100 - 2L, n90 * n110 - n91 * n111);
        class22.method169(n100 - 1L, n90 * n111 + n91 * n110);
        final float n112 = n104 - n109;
        final float n113 = n105 - n108;
        class22.method169(n101 - 2L, n92 * n112 + n93 * n113);
        class22.method169(n101 - 1L, n92 * n113 - n93 * n112);
        final float n114 = class22.method135(n98) + class22.method135(n100);
        final float n115 = -class22.method135(n98 + 1L) - class22.method135(n100 + 1L);
        final float n116 = class22.method135(n98) - class22.method135(n100);
        final float n117 = -class22.method135(n98 + 1L) + class22.method135(n100 + 1L);
        final float n118 = class22.method135(n99) + class22.method135(n101);
        final float n119 = class22.method135(n99 + 1L) + class22.method135(n101 + 1L);
        final float n120 = class22.method135(n99) - class22.method135(n101);
        final float n121 = class22.method135(n99 + 1L) - class22.method135(n101 + 1L);
        class22.method169(n98, n114 + n118);
        class22.method169(n98 + 1L, n115 - n119);
        class22.method169(n99, n114 - n118);
        class22.method169(n99 + 1L, n115 + n119);
        final float n122 = n116 + n121;
        final float n123 = n117 + n120;
        class22.method169(n100, method135 * (n122 - n123));
        class22.method169(n100 + 1L, method135 * (n123 + n122));
        final float n124 = n116 - n121;
        final float n125 = n117 - n120;
        class22.method169(n101, -method135 * (n124 + n125));
        class22.method169(n101 + 1L, -method135 * (n125 - n124));
        final float n126 = class22.method135(n98 + 2L) + class22.method135(n100 + 2L);
        final float n127 = -class22.method135(n98 + 3L) - class22.method135(n100 + 3L);
        final float n128 = class22.method135(n98 + 2L) - class22.method135(n100 + 2L);
        final float n129 = -class22.method135(n98 + 3L) + class22.method135(n100 + 3L);
        final float n130 = class22.method135(n99 + 2L) + class22.method135(n101 + 2L);
        final float n131 = class22.method135(n99 + 3L) + class22.method135(n101 + 3L);
        final float n132 = class22.method135(n99 + 2L) - class22.method135(n101 + 2L);
        final float n133 = class22.method135(n99 + 3L) - class22.method135(n101 + 3L);
        class22.method169(n98 + 2L, n126 + n130);
        class22.method169(n98 + 3L, n127 - n131);
        class22.method169(n99 + 2L, n126 - n130);
        class22.method169(n99 + 3L, n127 + n131);
        final float n134 = n128 + n133;
        final float n135 = n129 + n132;
        class22.method169(n100 + 2L, n91 * n134 - n90 * n135);
        class22.method169(n100 + 3L, n91 * n135 + n90 * n134);
        final float n136 = n128 - n133;
        final float n137 = n129 - n132;
        class22.method169(n101 + 2L, n93 * n136 + n92 * n137);
        class22.method169(n101 + 3L, n93 * n137 - n92 * n136);
    }
    
    public static void method33265(final int n, final float[] array, final int n2, final int n3, final float[] array2) {
        int n4 = 0;
        int n5 = 2;
        int n6 = 0;
        int n7 = n >> 1;
        if (n >= method33159()) {
            n5 = 4;
            n6 = 1;
            n7 >>= 1;
        }
        final Future[] array3 = new Future[n5];
        final int n8 = n7;
        for (int i = 0; i < n5; ++i) {
            final int n9 = n2 + i * n7;
            if (i != n6) {
                array3[n4++] = Class8216.method27227(new Class1272(n9, n8, n, array, array2, n3));
            }
            else {
                array3[n4++] = Class8216.method27227(new Class1392(n9, n8, n, array, array2, n3));
            }
        }
        try {
            Class8216.method27228(array3);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    public static void method33266(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23) {
        int n4 = 0;
        int n5 = 2;
        int n6 = 0;
        long n7 = n >> 1;
        if (n >= method33159()) {
            n5 = 4;
            n6 = 1;
            n7 >>= 1;
        }
        final Future[] array = new Future[n5];
        final long n8 = n7;
        for (int i = 0; i < n5; ++i) {
            final long n9 = n2 + i * n7;
            if (i != n6) {
                array[n4++] = Class8216.method27227(new Class1438(n9, n8, n, class22, class23, n3));
            }
            else {
                array[n4++] = Class8216.method27227(new Class1174(n9, n8, n, class22, class23, n3));
            }
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    public static void method33267(final int n, final float[] array, final int n2, final int n3, final float[] array2) {
        int i = n;
        final int n4 = n2 + n;
        while (i > 512) {
            i >>= 2;
            method33273(i, array, n4 - i, array2, n3 - (i >> 1));
        }
        method33271(i, 1, array, n4 - i, n3, array2);
        int n5 = 0;
        final int n6 = n2 - i;
        for (int j = n - i; j > 0; j -= i) {
            ++n5;
            method33271(i, method33269(i, j, n5, array, n2, n3, array2), array, n6 + j, n3, array2);
        }
    }
    
    public static void method33268(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23) {
        long n4 = n;
        final long n5 = n2 + n;
        while (n4 > 512L) {
            n4 >>= 2;
            method33274(n4, class22, n5 - n4, class23, n3 - (n4 >> 1));
        }
        method33272(n4, 1L, class22, n5 - n4, n3, class23);
        long n6 = 0L;
        final long n7 = n2 - n4;
        for (long n8 = n - n4; n8 > 0L; n8 -= n4) {
            ++n6;
            method33272(n4, method33270(n4, n8, n6, class22, n2, n3, class23), class22, n7 + n8, n3, class23);
        }
    }
    
    public static int method33269(final int n, final int n2, final int n3, final float[] array, final int n4, final int n5, final float[] array2) {
        final int n6 = n4 - n;
        int i = n;
        int n7;
        for (n7 = n3; (n7 & 0x3) == 0x0; n7 >>= 2) {
            i <<= 2;
        }
        final int n8 = n7 & 0x1;
        final int n9 = n4 + n2;
        if (n8 == 0) {
            while (i > 128) {
                method33275(i, array, n9 - i, array2, n5 - i);
                i >>= 2;
            }
        }
        else {
            while (i > 128) {
                method33273(i, array, n9 - i, array2, n5 - (i >> 1));
                i >>= 2;
            }
        }
        final int n10;
        while ((n10 & 0x400000) == 0x0) {
            if ((n10 & 0x40) == 0x0) {
                method33275(n, array, n6 + n2, array2, n5 - n);
            }
        }
        return n8;
    }
    
    public static long method33270(final long n, final long n2, final long n3, final Class22 class22, final long n4, final long n5, final Class22 class23) {
        final long n6 = n4 - n;
        long n9;
        if ((n3 & 0x3L) == 0x0L) {
            long n7 = n;
            long n8;
            for (n8 = n3; (n8 & 0x3L) == 0x0L; n8 >>= 2) {
                n7 <<= 2;
            }
            n9 = (n8 & 0x1L);
            final long n10 = n4 + n2;
            if (n9 == 0L) {
                while (n7 > 128L) {
                    method33276(n7, class22, n10 - n7, class23, n5 - n7);
                    n7 >>= 2;
                }
            }
            else {
                while (n7 > 128L) {
                    method33274(n7, class22, n10 - n7, class23, n5 - (n7 >> 1));
                    n7 >>= 2;
                }
            }
        }
        else {
            n9 = (n3 & 0x1L);
            if (n9 == 0L) {
                method33276(n, class22, n6 + n2, class23, n5 - n);
            }
            else {
                method33274(n, class22, n6 + n2, class23, n5 - (n >> 1));
            }
        }
        return n9;
    }
    
    public static void method33271(final int n, final int n2, final float[] array, final int n3, final int n4, final float[] array2) {
        if (n != 512) {
            method33273(64, array, n3, array2, n4 - 32);
            method33283(array, n3, array2, n4 - 8);
            method33285(array, n3 + 16, array2, n4 - 8);
            method33283(array, n3 + 32, array2, n4 - 8);
            method33283(array, n3 + 48, array2, n4 - 8);
            method33275(64, array, n3 + 64, array2, n4 - 64);
            method33283(array, n3 + 64, array2, n4 - 8);
            method33285(array, n3 + 80, array2, n4 - 8);
            method33283(array, n3 + 96, array2, n4 - 8);
            method33285(array, n3 + 112, array2, n4 - 8);
            method33273(64, array, n3 + 128, array2, n4 - 32);
            method33283(array, n3 + 128, array2, n4 - 8);
            method33285(array, n3 + 144, array2, n4 - 8);
            method33283(array, n3 + 160, array2, n4 - 8);
            method33283(array, n3 + 176, array2, n4 - 8);
            if (n2 == 0) {
                method33275(64, array, n3 + 192, array2, n4 - 64);
                method33285(array, n3 + 240, array2, n4 - 8);
            }
            else {
                method33273(64, array, n3 + 192, array2, n4 - 32);
                method33283(array, n3 + 240, array2, n4 - 8);
            }
            method33283(array, n3 + 192, array2, n4 - 8);
            method33285(array, n3 + 208, array2, n4 - 8);
            method33283(array, n3 + 224, array2, n4 - 8);
        }
        else {
            method33273(128, array, n3, array2, n4 - 64);
            method33279(array, n3, array2, n4 - 8);
            method33281(array, n3 + 32, array2, n4 - 32);
            method33279(array, n3 + 64, array2, n4 - 8);
            method33279(array, n3 + 96, array2, n4 - 8);
            method33275(128, array, n3 + 128, array2, n4 - 128);
            method33279(array, n3 + 128, array2, n4 - 8);
            method33281(array, n3 + 160, array2, n4 - 32);
            method33279(array, n3 + 192, array2, n4 - 8);
            method33281(array, n3 + 224, array2, n4 - 32);
            method33273(128, array, n3 + 256, array2, n4 - 64);
            method33279(array, n3 + 256, array2, n4 - 8);
            method33281(array, n3 + 288, array2, n4 - 32);
            method33279(array, n3 + 320, array2, n4 - 8);
            method33279(array, n3 + 352, array2, n4 - 8);
            if (n2 == 0) {
                method33275(128, array, n3 + 384, array2, n4 - 128);
                method33281(array, n3 + 480, array2, n4 - 32);
            }
            else {
                method33273(128, array, n3 + 384, array2, n4 - 64);
                method33279(array, n3 + 480, array2, n4 - 8);
            }
            method33279(array, n3 + 384, array2, n4 - 8);
            method33281(array, n3 + 416, array2, n4 - 32);
            method33279(array, n3 + 448, array2, n4 - 8);
        }
    }
    
    public static void method33272(final long n, final long n2, final Class22 class22, final long n3, final long n4, final Class22 class23) {
        if (n != 512L) {
            method33274(64L, class22, n3, class23, n4 - 32L);
            method33284(class22, n3, class23, n4 - 8L);
            method33286(class22, n3 + 16L, class23, n4 - 8L);
            method33284(class22, n3 + 32L, class23, n4 - 8L);
            method33284(class22, n3 + 48L, class23, n4 - 8L);
            method33276(64L, class22, n3 + 64L, class23, n4 - 64L);
            method33284(class22, n3 + 64L, class23, n4 - 8L);
            method33286(class22, n3 + 80L, class23, n4 - 8L);
            method33284(class22, n3 + 96L, class23, n4 - 8L);
            method33286(class22, n3 + 112L, class23, n4 - 8L);
            method33274(64L, class22, n3 + 128L, class23, n4 - 32L);
            method33284(class22, n3 + 128L, class23, n4 - 8L);
            method33286(class22, n3 + 144L, class23, n4 - 8L);
            method33284(class22, n3 + 160L, class23, n4 - 8L);
            method33284(class22, n3 + 176L, class23, n4 - 8L);
            if (n2 == 0L) {
                method33276(64L, class22, n3 + 192L, class23, n4 - 64L);
                method33286(class22, n3 + 240L, class23, n4 - 8L);
            }
            else {
                method33274(64L, class22, n3 + 192L, class23, n4 - 32L);
                method33284(class22, n3 + 240L, class23, n4 - 8L);
            }
            method33284(class22, n3 + 192L, class23, n4 - 8L);
            method33286(class22, n3 + 208L, class23, n4 - 8L);
            method33284(class22, n3 + 224L, class23, n4 - 8L);
        }
        else {
            method33274(128L, class22, n3, class23, n4 - 64L);
            method33280(class22, n3, class23, n4 - 8L);
            method33282(class22, n3 + 32L, class23, n4 - 32L);
            method33280(class22, n3 + 64L, class23, n4 - 8L);
            method33280(class22, n3 + 96L, class23, n4 - 8L);
            method33276(128L, class22, n3 + 128L, class23, n4 - 128L);
            method33280(class22, n3 + 128L, class23, n4 - 8L);
            method33282(class22, n3 + 160L, class23, n4 - 32L);
            method33280(class22, n3 + 192L, class23, n4 - 8L);
            method33282(class22, n3 + 224L, class23, n4 - 32L);
            method33274(128L, class22, n3 + 256L, class23, n4 - 64L);
            method33280(class22, n3 + 256L, class23, n4 - 8L);
            method33282(class22, n3 + 288L, class23, n4 - 32L);
            method33280(class22, n3 + 320L, class23, n4 - 8L);
            method33280(class22, n3 + 352L, class23, n4 - 8L);
            if (n2 == 0L) {
                method33276(128L, class22, n3 + 384L, class23, n4 - 128L);
                method33282(class22, n3 + 480L, class23, n4 - 32L);
            }
            else {
                method33274(128L, class22, n3 + 384L, class23, n4 - 64L);
                method33280(class22, n3 + 480L, class23, n4 - 8L);
            }
            method33280(class22, n3 + 384L, class23, n4 - 8L);
            method33282(class22, n3 + 416L, class23, n4 - 32L);
            method33280(class22, n3 + 448L, class23, n4 - 8L);
        }
    }
    
    public static void method33273(final int n, final float[] array, final int n2, final float[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n6;
        final int n5 = n6 = 2 * n4;
        final int n7 = n6 + n5;
        final int n8 = n7 + n5;
        final int n9 = n2 + n6;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final float n12 = array[n2] + array[n10];
        final float n13 = array[n2 + 1] + array[n10 + 1];
        final float n14 = array[n2] - array[n10];
        final float n15 = array[n2 + 1] - array[n10 + 1];
        final float n16 = array[n9] + array[n11];
        final float n17 = array[n9 + 1] + array[n11 + 1];
        final float n18 = array[n9] - array[n11];
        final float n19 = array[n9 + 1] - array[n11 + 1];
        array[n2] = n12 + n16;
        array[n2 + 1] = n13 + n17;
        array[n9] = n12 - n16;
        array[n9 + 1] = n13 - n17;
        array[n10] = n14 - n19;
        array[n10 + 1] = n15 + n18;
        array[n11] = n14 + n19;
        array[n11 + 1] = n15 - n18;
        final float n20 = array2[n3 + 1];
        int n21 = 0;
        for (int i = 2; i < n4; i += 2) {
            n21 += 4;
            final int n22 = n3 + n21;
            final float n23 = array2[n22];
            final float n24 = array2[n22 + 1];
            final float n25 = array2[n22 + 2];
            final float n26 = array2[n22 + 3];
            final int n27 = i + n5;
            final int n28 = n27 + n5;
            final int n29 = n28 + n5;
            final int n30 = n2 + n27;
            final int n31 = n2 + n28;
            final int n32 = n2 + n29;
            final int n33 = n2 + i;
            final float n34 = array[n33] + array[n31];
            final float n35 = array[n33 + 1] + array[n31 + 1];
            final float n36 = array[n33] - array[n31];
            final float n37 = array[n33 + 1] - array[n31 + 1];
            final float n38 = array[n30] + array[n32];
            final float n39 = array[n30 + 1] + array[n32 + 1];
            final float n40 = array[n30] - array[n32];
            final float n41 = array[n30 + 1] - array[n32 + 1];
            array[n33] = n34 + n38;
            array[n33 + 1] = n35 + n39;
            array[n30] = n34 - n38;
            array[n30 + 1] = n35 - n39;
            final float n42 = n36 - n41;
            final float n43 = n37 + n40;
            array[n31] = n23 * n42 - n24 * n43;
            array[n31 + 1] = n23 * n43 + n24 * n42;
            final float n44 = n36 + n41;
            final float n45 = n37 - n40;
            array[n32] = n25 * n44 + n26 * n45;
            array[n32 + 1] = n25 * n45 - n26 * n44;
            final int n46 = n5 - i;
            final int n47 = n46 + n5;
            final int n48 = n47 + n5;
            final int n49 = n48 + n5;
            final int n50 = n2 + n46;
            final int n51 = n2 + n47;
            final int n52 = n2 + n48;
            final int n53 = n2 + n49;
            final float n54 = array[n50] + array[n52];
            final float n55 = array[n50 + 1] + array[n52 + 1];
            final float n56 = array[n50] - array[n52];
            final float n57 = array[n50 + 1] - array[n52 + 1];
            final float n58 = array[n51] + array[n53];
            final float n59 = array[n51 + 1] + array[n53 + 1];
            final float n60 = array[n51] - array[n53];
            final float n61 = array[n51 + 1] - array[n53 + 1];
            array[n50] = n54 + n58;
            array[n50 + 1] = n55 + n59;
            array[n51] = n54 - n58;
            array[n51 + 1] = n55 - n59;
            final float n62 = n56 - n61;
            final float n63 = n57 + n60;
            array[n52] = n24 * n62 - n23 * n63;
            array[n52 + 1] = n24 * n63 + n23 * n62;
            final float n64 = n56 + n61;
            final float n65 = n57 - n60;
            array[n53] = n26 * n64 + n25 * n65;
            array[n53 + 1] = n26 * n65 - n25 * n64;
        }
        final int n66 = n4;
        final int n67 = n66 + n5;
        final int n68 = n67 + n5;
        final int n69 = n68 + n5;
        final int n70 = n2 + n66;
        final int n71 = n2 + n67;
        final int n72 = n2 + n68;
        final int n73 = n2 + n69;
        final float n74 = array[n70] + array[n72];
        final float n75 = array[n70 + 1] + array[n72 + 1];
        final float n76 = array[n70] - array[n72];
        final float n77 = array[n70 + 1] - array[n72 + 1];
        final float n78 = array[n71] + array[n73];
        final float n79 = array[n71 + 1] + array[n73 + 1];
        final float n80 = array[n71] - array[n73];
        final float n81 = array[n71 + 1] - array[n73 + 1];
        array[n70] = n74 + n78;
        array[n70 + 1] = n75 + n79;
        array[n71] = n74 - n78;
        array[n71 + 1] = n75 - n79;
        final float n82 = n76 - n81;
        final float n83 = n77 + n80;
        array[n72] = n20 * (n82 - n83);
        array[n72 + 1] = n20 * (n83 + n82);
        final float n84 = n76 + n81;
        final float n85 = n77 - n80;
        array[n73] = -n20 * (n84 + n85);
        array[n73 + 1] = -n20 * (n85 - n84);
    }
    
    public static void method33274(final long n, final Class22 class22, final long n2, final Class22 class23, final long n3) {
        final long n4 = n >> 3;
        final long n6;
        final long n5 = n6 = 2L * n4;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final float n12 = class22.method135(n2) + class22.method135(n10);
        final float n13 = class22.method135(n2 + 1L) + class22.method135(n10 + 1L);
        final float n14 = class22.method135(n2) - class22.method135(n10);
        final float n15 = class22.method135(n2 + 1L) - class22.method135(n10 + 1L);
        final float n16 = class22.method135(n9) + class22.method135(n11);
        final float n17 = class22.method135(n9 + 1L) + class22.method135(n11 + 1L);
        final float n18 = class22.method135(n9) - class22.method135(n11);
        final float n19 = class22.method135(n9 + 1L) - class22.method135(n11 + 1L);
        class22.method169(n2, n12 + n16);
        class22.method169(n2 + 1L, n13 + n17);
        class22.method169(n9, n12 - n16);
        class22.method169(n9 + 1L, n13 - n17);
        class22.method169(n10, n14 - n19);
        class22.method169(n10 + 1L, n15 + n18);
        class22.method169(n11, n14 + n19);
        class22.method169(n11 + 1L, n15 - n18);
        final float method135 = class23.method135(n3 + 1L);
        long n20 = 0L;
        for (long n21 = 2L; n21 < n4; n21 += 2L) {
            n20 += 4L;
            final long n22 = n3 + n20;
            final float method136 = class23.method135(n22);
            final float method137 = class23.method135(n22 + 1L);
            final float method138 = class23.method135(n22 + 2L);
            final float method139 = class23.method135(n22 + 3L);
            final long n23 = n21 + n5;
            final long n24 = n23 + n5;
            final long n25 = n24 + n5;
            final long n26 = n2 + n23;
            final long n27 = n2 + n24;
            final long n28 = n2 + n25;
            final long n29 = n2 + n21;
            final float n30 = class22.method135(n29) + class22.method135(n27);
            final float n31 = class22.method135(n29 + 1L) + class22.method135(n27 + 1L);
            final float n32 = class22.method135(n29) - class22.method135(n27);
            final float n33 = class22.method135(n29 + 1L) - class22.method135(n27 + 1L);
            final float n34 = class22.method135(n26) + class22.method135(n28);
            final float n35 = class22.method135(n26 + 1L) + class22.method135(n28 + 1L);
            final float n36 = class22.method135(n26) - class22.method135(n28);
            final float n37 = class22.method135(n26 + 1L) - class22.method135(n28 + 1L);
            class22.method169(n29, n30 + n34);
            class22.method169(n29 + 1L, n31 + n35);
            class22.method169(n26, n30 - n34);
            class22.method169(n26 + 1L, n31 - n35);
            final float n38 = n32 - n37;
            final float n39 = n33 + n36;
            class22.method169(n27, method136 * n38 - method137 * n39);
            class22.method169(n27 + 1L, method136 * n39 + method137 * n38);
            final float n40 = n32 + n37;
            final float n41 = n33 - n36;
            class22.method169(n28, method138 * n40 + method139 * n41);
            class22.method169(n28 + 1L, method138 * n41 - method139 * n40);
            final long n42 = n5 - n21;
            final long n43 = n42 + n5;
            final long n44 = n43 + n5;
            final long n45 = n44 + n5;
            final long n46 = n2 + n42;
            final long n47 = n2 + n43;
            final long n48 = n2 + n44;
            final long n49 = n2 + n45;
            final float n50 = class22.method135(n46) + class22.method135(n48);
            final float n51 = class22.method135(n46 + 1L) + class22.method135(n48 + 1L);
            final float n52 = class22.method135(n46) - class22.method135(n48);
            final float n53 = class22.method135(n46 + 1L) - class22.method135(n48 + 1L);
            final float n54 = class22.method135(n47) + class22.method135(n49);
            final float n55 = class22.method135(n47 + 1L) + class22.method135(n49 + 1L);
            final float n56 = class22.method135(n47) - class22.method135(n49);
            final float n57 = class22.method135(n47 + 1L) - class22.method135(n49 + 1L);
            class22.method169(n46, n50 + n54);
            class22.method169(n46 + 1L, n51 + n55);
            class22.method169(n47, n50 - n54);
            class22.method169(n47 + 1L, n51 - n55);
            final float n58 = n52 - n57;
            final float n59 = n53 + n56;
            class22.method169(n48, method137 * n58 - method136 * n59);
            class22.method169(n48 + 1L, method137 * n59 + method136 * n58);
            final float n60 = n52 + n57;
            final float n61 = n53 - n56;
            class22.method169(n49, method139 * n60 + method138 * n61);
            class22.method169(n49 + 1L, method139 * n61 - method138 * n60);
        }
        final long n62 = n4;
        final long n63 = n62 + n5;
        final long n64 = n63 + n5;
        final long n65 = n64 + n5;
        final long n66 = n2 + n62;
        final long n67 = n2 + n63;
        final long n68 = n2 + n64;
        final long n69 = n2 + n65;
        final float n70 = class22.method135(n66) + class22.method135(n68);
        final float n71 = class22.method135(n66 + 1L) + class22.method135(n68 + 1L);
        final float n72 = class22.method135(n66) - class22.method135(n68);
        final float n73 = class22.method135(n66 + 1L) - class22.method135(n68 + 1L);
        final float n74 = class22.method135(n67) + class22.method135(n69);
        final float n75 = class22.method135(n67 + 1L) + class22.method135(n69 + 1L);
        final float n76 = class22.method135(n67) - class22.method135(n69);
        final float n77 = class22.method135(n67 + 1L) - class22.method135(n69 + 1L);
        class22.method169(n66, n70 + n74);
        class22.method169(n66 + 1L, n71 + n75);
        class22.method169(n67, n70 - n74);
        class22.method169(n67 + 1L, n71 - n75);
        final float n78 = n72 - n77;
        final float n79 = n73 + n76;
        class22.method169(n68, method135 * (n78 - n79));
        class22.method169(n68 + 1L, method135 * (n79 + n78));
        final float n80 = n72 + n77;
        final float n81 = n73 - n76;
        class22.method169(n69, -method135 * (n80 + n81));
        class22.method169(n69 + 1L, -method135 * (n81 - n80));
    }
    
    public static void method33275(final int n, final float[] array, final int n2, final float[] array2, final int n3) {
        final int n4 = n >> 3;
        final int n5 = 2 * n4;
        final float n6 = array2[n3 + 1];
        final int n7 = n5;
        final int n8 = n7 + n5;
        final int n9 = n8 + n5;
        final int n10 = n2 + n7;
        final int n11 = n2 + n8;
        final int n12 = n2 + n9;
        final float n13 = array[n2] - array[n11 + 1];
        final float n14 = array[n2 + 1] + array[n11];
        final float n15 = array[n2] + array[n11 + 1];
        final float n16 = array[n2 + 1] - array[n11];
        final float n17 = array[n10] - array[n12 + 1];
        final float n18 = array[n10 + 1] + array[n12];
        final float n19 = array[n10] + array[n12 + 1];
        final float n20 = array[n10 + 1] - array[n12];
        final float n21 = n6 * (n17 - n18);
        final float n22 = n6 * (n18 + n17);
        array[n2] = n13 + n21;
        array[n2 + 1] = n14 + n22;
        array[n10] = n13 - n21;
        array[n10 + 1] = n14 - n22;
        final float n23 = n6 * (n19 - n20);
        final float n24 = n6 * (n20 + n19);
        array[n11] = n15 - n24;
        array[n11 + 1] = n16 + n23;
        array[n12] = n15 + n24;
        array[n12 + 1] = n16 - n23;
        int n25 = 0;
        int n26 = 2 * n5;
        for (int i = 2; i < n4; i += 2) {
            n25 += 4;
            final int n27 = n3 + n25;
            final float n28 = array2[n27];
            final float n29 = array2[n27 + 1];
            final float n30 = array2[n27 + 2];
            final float n31 = array2[n27 + 3];
            n26 -= 4;
            final int n32 = n3 + n26;
            final float n33 = array2[n32];
            final float n34 = array2[n32 + 1];
            final float n35 = array2[n32 + 2];
            final float n36 = array2[n32 + 3];
            final int n37 = i + n5;
            final int n38 = n37 + n5;
            final int n39 = n38 + n5;
            final int n40 = n2 + n37;
            final int n41 = n2 + n38;
            final int n42 = n2 + n39;
            final int n43 = n2 + i;
            final float n44 = array[n43] - array[n41 + 1];
            final float n45 = array[n43 + 1] + array[n41];
            final float n46 = array[n43] + array[n41 + 1];
            final float n47 = array[n43 + 1] - array[n41];
            final float n48 = array[n40] - array[n42 + 1];
            final float n49 = array[n40 + 1] + array[n42];
            final float n50 = array[n40] + array[n42 + 1];
            final float n51 = array[n40 + 1] - array[n42];
            final float n52 = n28 * n44 - n29 * n45;
            final float n53 = n28 * n45 + n29 * n44;
            final float n54 = n34 * n48 - n33 * n49;
            final float n55 = n34 * n49 + n33 * n48;
            array[n43] = n52 + n54;
            array[n43 + 1] = n53 + n55;
            array[n40] = n52 - n54;
            array[n40 + 1] = n53 - n55;
            final float n56 = n30 * n46 + n31 * n47;
            final float n57 = n30 * n47 - n31 * n46;
            final float n58 = n36 * n50 + n35 * n51;
            final float n59 = n36 * n51 - n35 * n50;
            array[n41] = n56 + n58;
            array[n41 + 1] = n57 + n59;
            array[n42] = n56 - n58;
            array[n42 + 1] = n57 - n59;
            final int n60 = n5 - i;
            final int n61 = n60 + n5;
            final int n62 = n61 + n5;
            final int n63 = n62 + n5;
            final int n64 = n2 + n60;
            final int n65 = n2 + n61;
            final int n66 = n2 + n62;
            final int n67 = n2 + n63;
            final float n68 = array[n64] - array[n66 + 1];
            final float n69 = array[n64 + 1] + array[n66];
            final float n70 = array[n64] + array[n66 + 1];
            final float n71 = array[n64 + 1] - array[n66];
            final float n72 = array[n65] - array[n67 + 1];
            final float n73 = array[n65 + 1] + array[n67];
            final float n74 = array[n65] + array[n67 + 1];
            final float n75 = array[n65 + 1] - array[n67];
            final float n76 = n33 * n68 - n34 * n69;
            final float n77 = n33 * n69 + n34 * n68;
            final float n78 = n29 * n72 - n28 * n73;
            final float n79 = n29 * n73 + n28 * n72;
            array[n64] = n76 + n78;
            array[n64 + 1] = n77 + n79;
            array[n65] = n76 - n78;
            array[n65 + 1] = n77 - n79;
            final float n80 = n35 * n70 + n36 * n71;
            final float n81 = n35 * n71 - n36 * n70;
            final float n82 = n31 * n74 + n30 * n75;
            final float n83 = n31 * n75 - n30 * n74;
            array[n66] = n80 + n82;
            array[n66 + 1] = n81 + n83;
            array[n67] = n80 - n82;
            array[n67 + 1] = n81 - n83;
        }
        final float n84 = array2[n3 + n5];
        final float n85 = array2[n3 + n5 + 1];
        final int n86 = n4;
        final int n87 = n86 + n5;
        final int n88 = n87 + n5;
        final int n89 = n88 + n5;
        final int n90 = n2 + n86;
        final int n91 = n2 + n87;
        final int n92 = n2 + n88;
        final int n93 = n2 + n89;
        final float n94 = array[n90] - array[n92 + 1];
        final float n95 = array[n90 + 1] + array[n92];
        final float n96 = array[n90] + array[n92 + 1];
        final float n97 = array[n90 + 1] - array[n92];
        final float n98 = array[n91] - array[n93 + 1];
        final float n99 = array[n91 + 1] + array[n93];
        final float n100 = array[n91] + array[n93 + 1];
        final float n101 = array[n91 + 1] - array[n93];
        final float n102 = n84 * n94 - n85 * n95;
        final float n103 = n84 * n95 + n85 * n94;
        final float n104 = n85 * n98 - n84 * n99;
        final float n105 = n85 * n99 + n84 * n98;
        array[n90] = n102 + n104;
        array[n90 + 1] = n103 + n105;
        array[n91] = n102 - n104;
        array[n91 + 1] = n103 - n105;
        final float n106 = n85 * n96 - n84 * n97;
        final float n107 = n85 * n97 + n84 * n96;
        final float n108 = n84 * n100 - n85 * n101;
        final float n109 = n84 * n101 + n85 * n100;
        array[n92] = n106 - n108;
        array[n92 + 1] = n107 - n109;
        array[n93] = n106 + n108;
        array[n93 + 1] = n107 + n109;
    }
    
    public static void method33276(final long n, final Class22 class22, final long n2, final Class22 class23, final long n3) {
        final long n4 = n >> 3;
        final long n5 = 2L * n4;
        final float method135 = class23.method135(n3 + 1L);
        final long n6 = n5;
        final long n7 = n6 + n5;
        final long n8 = n7 + n5;
        final long n9 = n2 + n6;
        final long n10 = n2 + n7;
        final long n11 = n2 + n8;
        final float n12 = class22.method135(n2) - class22.method135(n10 + 1L);
        final float n13 = class22.method135(n2 + 1L) + class22.method135(n10);
        final float n14 = class22.method135(n2) + class22.method135(n10 + 1L);
        final float n15 = class22.method135(n2 + 1L) - class22.method135(n10);
        final float n16 = class22.method135(n9) - class22.method135(n11 + 1L);
        final float n17 = class22.method135(n9 + 1L) + class22.method135(n11);
        final float n18 = class22.method135(n9) + class22.method135(n11 + 1L);
        final float n19 = class22.method135(n9 + 1L) - class22.method135(n11);
        final float n20 = method135 * (n16 - n17);
        final float n21 = method135 * (n17 + n16);
        class22.method169(n2, n12 + n20);
        class22.method169(n2 + 1L, n13 + n21);
        class22.method169(n9, n12 - n20);
        class22.method169(n9 + 1L, n13 - n21);
        final float n22 = method135 * (n18 - n19);
        final float n23 = method135 * (n19 + n18);
        class22.method169(n10, n14 - n23);
        class22.method169(n10 + 1L, n15 + n22);
        class22.method169(n11, n14 + n23);
        class22.method169(n11 + 1L, n15 - n22);
        long n24 = 0L;
        long n25 = 2L * n5;
        for (int n26 = 2; n26 < n4; n26 += 2) {
            n24 += 4L;
            final long n27 = n3 + n24;
            final float method136 = class23.method135(n27);
            final float method137 = class23.method135(n27 + 1L);
            final float method138 = class23.method135(n27 + 2L);
            final float method139 = class23.method135(n27 + 3L);
            n25 -= 4L;
            final long n28 = n3 + n25;
            final float method140 = class23.method135(n28);
            final float method141 = class23.method135(n28 + 1L);
            final float method142 = class23.method135(n28 + 2L);
            final float method143 = class23.method135(n28 + 3L);
            final long n29 = n26 + n5;
            final long n30 = n29 + n5;
            final long n31 = n30 + n5;
            final long n32 = n2 + n29;
            final long n33 = n2 + n30;
            final long n34 = n2 + n31;
            final long n35 = n2 + n26;
            final float n36 = class22.method135(n35) - class22.method135(n33 + 1L);
            final float n37 = class22.method135(n35 + 1L) + class22.method135(n33);
            final float n38 = class22.method135(n35) + class22.method135(n33 + 1L);
            final float n39 = class22.method135(n35 + 1L) - class22.method135(n33);
            final float n40 = class22.method135(n32) - class22.method135(n34 + 1L);
            final float n41 = class22.method135(n32 + 1L) + class22.method135(n34);
            final float n42 = class22.method135(n32) + class22.method135(n34 + 1L);
            final float n43 = class22.method135(n32 + 1L) - class22.method135(n34);
            final float n44 = method136 * n36 - method137 * n37;
            final float n45 = method136 * n37 + method137 * n36;
            final float n46 = method141 * n40 - method140 * n41;
            final float n47 = method141 * n41 + method140 * n40;
            class22.method169(n35, n44 + n46);
            class22.method169(n35 + 1L, n45 + n47);
            class22.method169(n32, n44 - n46);
            class22.method169(n32 + 1L, n45 - n47);
            final float n48 = method138 * n38 + method139 * n39;
            final float n49 = method138 * n39 - method139 * n38;
            final float n50 = method143 * n42 + method142 * n43;
            final float n51 = method143 * n43 - method142 * n42;
            class22.method169(n33, n48 + n50);
            class22.method169(n33 + 1L, n49 + n51);
            class22.method169(n34, n48 - n50);
            class22.method169(n34 + 1L, n49 - n51);
            final long n52 = n5 - n26;
            final long n53 = n52 + n5;
            final long n54 = n53 + n5;
            final long n55 = n54 + n5;
            final long n56 = n2 + n52;
            final long n57 = n2 + n53;
            final long n58 = n2 + n54;
            final long n59 = n2 + n55;
            final float n60 = class22.method135(n56) - class22.method135(n58 + 1L);
            final float n61 = class22.method135(n56 + 1L) + class22.method135(n58);
            final float n62 = class22.method135(n56) + class22.method135(n58 + 1L);
            final float n63 = class22.method135(n56 + 1L) - class22.method135(n58);
            final float n64 = class22.method135(n57) - class22.method135(n59 + 1L);
            final float n65 = class22.method135(n57 + 1L) + class22.method135(n59);
            final float n66 = class22.method135(n57) + class22.method135(n59 + 1L);
            final float n67 = class22.method135(n57 + 1L) - class22.method135(n59);
            final float n68 = method140 * n60 - method141 * n61;
            final float n69 = method140 * n61 + method141 * n60;
            final float n70 = method137 * n64 - method136 * n65;
            final float n71 = method137 * n65 + method136 * n64;
            class22.method169(n56, n68 + n70);
            class22.method169(n56 + 1L, n69 + n71);
            class22.method169(n57, n68 - n70);
            class22.method169(n57 + 1L, n69 - n71);
            final float n72 = method142 * n62 + method143 * n63;
            final float n73 = method142 * n63 - method143 * n62;
            final float n74 = method139 * n66 + method138 * n67;
            final float n75 = method139 * n67 - method138 * n66;
            class22.method169(n58, n72 + n74);
            class22.method169(n58 + 1L, n73 + n75);
            class22.method169(n59, n72 - n74);
            class22.method169(n59 + 1L, n73 - n75);
        }
        final float method144 = class23.method135(n3 + n5);
        final float method145 = class23.method135(n3 + n5 + 1L);
        final long n76 = n4;
        final long n77 = n76 + n5;
        final long n78 = n77 + n5;
        final long n79 = n78 + n5;
        final long n80 = n2 + n76;
        final long n81 = n2 + n77;
        final long n82 = n2 + n78;
        final long n83 = n2 + n79;
        final float n84 = class22.method135(n80) - class22.method135(n82 + 1L);
        final float n85 = class22.method135(n80 + 1L) + class22.method135(n82);
        final float n86 = class22.method135(n80) + class22.method135(n82 + 1L);
        final float n87 = class22.method135(n80 + 1L) - class22.method135(n82);
        final float n88 = class22.method135(n81) - class22.method135(n83 + 1L);
        final float n89 = class22.method135(n81 + 1L) + class22.method135(n83);
        final float n90 = class22.method135(n81) + class22.method135(n83 + 1L);
        final float n91 = class22.method135(n81 + 1L) - class22.method135(n83);
        final float n92 = method144 * n84 - method145 * n85;
        final float n93 = method144 * n85 + method145 * n84;
        final float n94 = method145 * n88 - method144 * n89;
        final float n95 = method145 * n89 + method144 * n88;
        class22.method169(n80, n92 + n94);
        class22.method169(n80 + 1L, n93 + n95);
        class22.method169(n81, n92 - n94);
        class22.method169(n81 + 1L, n93 - n95);
        final float n96 = method145 * n86 - method144 * n87;
        final float n97 = method145 * n87 + method144 * n86;
        final float n98 = method144 * n90 - method145 * n91;
        final float n99 = method144 * n91 + method145 * n90;
        class22.method169(n82, n96 - n98);
        class22.method169(n82 + 1L, n97 - n99);
        class22.method169(n83, n96 + n98);
        class22.method169(n83 + 1L, n97 + n99);
    }
    
    public static void method33277(final int n, final float[] array, final int n2, final int n3, final float[] array2) {
        if (n != 128) {
            method33283(array, n2, array2, n3 - 8);
            method33285(array, n2 + 16, array2, n3 - 8);
            method33283(array, n2 + 32, array2, n3 - 8);
            method33283(array, n2 + 48, array2, n3 - 8);
        }
        else {
            method33279(array, n2, array2, n3 - 8);
            method33281(array, n2 + 32, array2, n3 - 32);
            method33279(array, n2 + 64, array2, n3 - 8);
            method33279(array, n2 + 96, array2, n3 - 8);
        }
    }
    
    public static void method33278(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23) {
        if (n != 128L) {
            method33284(class22, n2, class23, n3 - 8L);
            method33286(class22, n2 + 16L, class23, n3 - 8L);
            method33284(class22, n2 + 32L, class23, n3 - 8L);
            method33284(class22, n2 + 48L, class23, n3 - 8L);
        }
        else {
            method33280(class22, n2, class23, n3 - 8L);
            method33282(class22, n2 + 32L, class23, n3 - 32L);
            method33280(class22, n2 + 64L, class23, n3 - 8L);
            method33280(class22, n2 + 96L, class23, n3 - 8L);
        }
    }
    
    public static void method33279(final float[] array, final int n, final float[] array2, final int n2) {
        final float n3 = array2[n2 + 1];
        final float n4 = array2[n2 + 2];
        final float n5 = array2[n2 + 3];
        final float n6 = array[n] + array[n + 16];
        final float n7 = array[n + 1] + array[n + 17];
        final float n8 = array[n] - array[n + 16];
        final float n9 = array[n + 1] - array[n + 17];
        final float n10 = array[n + 8] + array[n + 24];
        final float n11 = array[n + 9] + array[n + 25];
        final float n12 = array[n + 8] - array[n + 24];
        final float n13 = array[n + 9] - array[n + 25];
        final float n14 = n6 + n10;
        final float n15 = n7 + n11;
        final float n16 = n6 - n10;
        final float n17 = n7 - n11;
        final float n18 = n8 - n13;
        final float n19 = n9 + n12;
        final float n20 = n8 + n13;
        final float n21 = n9 - n12;
        final float n22 = array[n + 2] + array[n + 18];
        final float n23 = array[n + 3] + array[n + 19];
        final float n24 = array[n + 2] - array[n + 18];
        final float n25 = array[n + 3] - array[n + 19];
        final float n26 = array[n + 10] + array[n + 26];
        final float n27 = array[n + 11] + array[n + 27];
        final float n28 = array[n + 10] - array[n + 26];
        final float n29 = array[n + 11] - array[n + 27];
        final float n30 = n22 + n26;
        final float n31 = n23 + n27;
        final float n32 = n22 - n26;
        final float n33 = n23 - n27;
        final float n34 = n24 - n29;
        final float n35 = n25 + n28;
        final float n36 = n4 * n34 - n5 * n35;
        final float n37 = n4 * n35 + n5 * n34;
        final float n38 = n24 + n29;
        final float n39 = n25 - n28;
        final float n40 = n5 * n38 - n4 * n39;
        final float n41 = n5 * n39 + n4 * n38;
        final float n42 = array[n + 4] + array[n + 20];
        final float n43 = array[n + 5] + array[n + 21];
        final float n44 = array[n + 4] - array[n + 20];
        final float n45 = array[n + 5] - array[n + 21];
        final float n46 = array[n + 12] + array[n + 28];
        final float n47 = array[n + 13] + array[n + 29];
        final float n48 = array[n + 12] - array[n + 28];
        final float n49 = array[n + 13] - array[n + 29];
        final float n50 = n42 + n46;
        final float n51 = n43 + n47;
        final float n52 = n42 - n46;
        final float n53 = n43 - n47;
        final float n54 = n44 - n49;
        final float n55 = n45 + n48;
        final float n56 = n3 * (n54 - n55);
        final float n57 = n3 * (n55 + n54);
        final float n58 = n44 + n49;
        final float n59 = n45 - n48;
        final float n60 = n3 * (n58 + n59);
        final float n61 = n3 * (n59 - n58);
        final float n62 = array[n + 6] + array[n + 22];
        final float n63 = array[n + 7] + array[n + 23];
        final float n64 = array[n + 6] - array[n + 22];
        final float n65 = array[n + 7] - array[n + 23];
        final float n66 = array[n + 14] + array[n + 30];
        final float n67 = array[n + 15] + array[n + 31];
        final float n68 = array[n + 14] - array[n + 30];
        final float n69 = array[n + 15] - array[n + 31];
        final float n70 = n62 + n66;
        final float n71 = n63 + n67;
        final float n72 = n62 - n66;
        final float n73 = n63 - n67;
        final float n74 = n64 - n69;
        final float n75 = n65 + n68;
        final float n76 = n5 * n74 - n4 * n75;
        final float n77 = n5 * n75 + n4 * n74;
        final float n78 = n64 + n69;
        final float n79 = n65 - n68;
        final float n80 = n4 * n78 - n5 * n79;
        final float n81 = n4 * n79 + n5 * n78;
        final float n82 = n20 - n60;
        final float n83 = n21 - n61;
        final float n84 = n20 + n60;
        final float n85 = n21 + n61;
        final float n86 = n40 - n80;
        final float n87 = n41 - n81;
        final float n88 = n40 + n80;
        final float n89 = n41 + n81;
        array[n + 24] = n82 + n86;
        array[n + 25] = n83 + n87;
        array[n + 26] = n82 - n86;
        array[n + 27] = n83 - n87;
        array[n + 28] = n84 - n89;
        array[n + 29] = n85 + n88;
        array[n + 30] = n84 + n89;
        array[n + 31] = n85 - n88;
        final float n90 = n18 + n56;
        final float n91 = n19 + n57;
        final float n92 = n18 - n56;
        final float n93 = n19 - n57;
        final float n94 = n36 + n76;
        final float n95 = n37 + n77;
        final float n96 = n36 - n76;
        final float n97 = n37 - n77;
        array[n + 16] = n90 + n94;
        array[n + 17] = n91 + n95;
        array[n + 18] = n90 - n94;
        array[n + 19] = n91 - n95;
        array[n + 20] = n92 - n97;
        array[n + 21] = n93 + n96;
        array[n + 22] = n92 + n97;
        array[n + 23] = n93 - n96;
        final float n98 = n32 - n73;
        final float n99 = n33 + n72;
        final float n100 = n3 * (n98 - n99);
        final float n101 = n3 * (n99 + n98);
        final float n102 = n32 + n73;
        final float n103 = n33 - n72;
        final float n104 = n3 * (n102 - n103);
        final float n105 = n3 * (n103 + n102);
        final float n106 = n16 - n53;
        final float n107 = n17 + n52;
        final float n108 = n16 + n53;
        final float n109 = n17 - n52;
        array[n + 8] = n106 + n100;
        array[n + 9] = n107 + n101;
        array[n + 10] = n106 - n100;
        array[n + 11] = n107 - n101;
        array[n + 12] = n108 - n105;
        array[n + 13] = n109 + n104;
        array[n + 14] = n108 + n105;
        array[n + 15] = n109 - n104;
        final float n110 = n14 + n50;
        final float n111 = n15 + n51;
        final float n112 = n14 - n50;
        final float n113 = n15 - n51;
        final float n114 = n30 + n70;
        final float n115 = n31 + n71;
        final float n116 = n30 - n70;
        final float n117 = n31 - n71;
        array[n] = n110 + n114;
        array[n + 1] = n111 + n115;
        array[n + 2] = n110 - n114;
        array[n + 3] = n111 - n115;
        array[n + 4] = n112 - n117;
        array[n + 5] = n113 + n116;
        array[n + 6] = n112 + n117;
        array[n + 7] = n113 - n116;
    }
    
    public static void method33280(final Class22 class22, final long n, final Class22 class23, final long n2) {
        final float method135 = class23.method135(n2 + 1L);
        final float method136 = class23.method135(n2 + 2L);
        final float method137 = class23.method135(n2 + 3L);
        final float n3 = class22.method135(n) + class22.method135(n + 16L);
        final float n4 = class22.method135(n + 1L) + class22.method135(n + 17L);
        final float n5 = class22.method135(n) - class22.method135(n + 16L);
        final float n6 = class22.method135(n + 1L) - class22.method135(n + 17L);
        final float n7 = class22.method135(n + 8L) + class22.method135(n + 24L);
        final float n8 = class22.method135(n + 9L) + class22.method135(n + 25L);
        final float n9 = class22.method135(n + 8L) - class22.method135(n + 24L);
        final float n10 = class22.method135(n + 9L) - class22.method135(n + 25L);
        final float n11 = n3 + n7;
        final float n12 = n4 + n8;
        final float n13 = n3 - n7;
        final float n14 = n4 - n8;
        final float n15 = n5 - n10;
        final float n16 = n6 + n9;
        final float n17 = n5 + n10;
        final float n18 = n6 - n9;
        final float n19 = class22.method135(n + 2L) + class22.method135(n + 18L);
        final float n20 = class22.method135(n + 3L) + class22.method135(n + 19L);
        final float n21 = class22.method135(n + 2L) - class22.method135(n + 18L);
        final float n22 = class22.method135(n + 3L) - class22.method135(n + 19L);
        final float n23 = class22.method135(n + 10L) + class22.method135(n + 26L);
        final float n24 = class22.method135(n + 11L) + class22.method135(n + 27L);
        final float n25 = class22.method135(n + 10L) - class22.method135(n + 26L);
        final float n26 = class22.method135(n + 11L) - class22.method135(n + 27L);
        final float n27 = n19 + n23;
        final float n28 = n20 + n24;
        final float n29 = n19 - n23;
        final float n30 = n20 - n24;
        final float n31 = n21 - n26;
        final float n32 = n22 + n25;
        final float n33 = method136 * n31 - method137 * n32;
        final float n34 = method136 * n32 + method137 * n31;
        final float n35 = n21 + n26;
        final float n36 = n22 - n25;
        final float n37 = method137 * n35 - method136 * n36;
        final float n38 = method137 * n36 + method136 * n35;
        final float n39 = class22.method135(n + 4L) + class22.method135(n + 20L);
        final float n40 = class22.method135(n + 5L) + class22.method135(n + 21L);
        final float n41 = class22.method135(n + 4L) - class22.method135(n + 20L);
        final float n42 = class22.method135(n + 5L) - class22.method135(n + 21L);
        final float n43 = class22.method135(n + 12L) + class22.method135(n + 28L);
        final float n44 = class22.method135(n + 13L) + class22.method135(n + 29L);
        final float n45 = class22.method135(n + 12L) - class22.method135(n + 28L);
        final float n46 = class22.method135(n + 13L) - class22.method135(n + 29L);
        final float n47 = n39 + n43;
        final float n48 = n40 + n44;
        final float n49 = n39 - n43;
        final float n50 = n40 - n44;
        final float n51 = n41 - n46;
        final float n52 = n42 + n45;
        final float n53 = method135 * (n51 - n52);
        final float n54 = method135 * (n52 + n51);
        final float n55 = n41 + n46;
        final float n56 = n42 - n45;
        final float n57 = method135 * (n55 + n56);
        final float n58 = method135 * (n56 - n55);
        final float n59 = class22.method135(n + 6L) + class22.method135(n + 22L);
        final float n60 = class22.method135(n + 7L) + class22.method135(n + 23L);
        final float n61 = class22.method135(n + 6L) - class22.method135(n + 22L);
        final float n62 = class22.method135(n + 7L) - class22.method135(n + 23L);
        final float n63 = class22.method135(n + 14L) + class22.method135(n + 30L);
        final float n64 = class22.method135(n + 15L) + class22.method135(n + 31L);
        final float n65 = class22.method135(n + 14L) - class22.method135(n + 30L);
        final float n66 = class22.method135(n + 15L) - class22.method135(n + 31L);
        final float n67 = n59 + n63;
        final float n68 = n60 + n64;
        final float n69 = n59 - n63;
        final float n70 = n60 - n64;
        final float n71 = n61 - n66;
        final float n72 = n62 + n65;
        final float n73 = method137 * n71 - method136 * n72;
        final float n74 = method137 * n72 + method136 * n71;
        final float n75 = n61 + n66;
        final float n76 = n62 - n65;
        final float n77 = method136 * n75 - method137 * n76;
        final float n78 = method136 * n76 + method137 * n75;
        final float n79 = n17 - n57;
        final float n80 = n18 - n58;
        final float n81 = n17 + n57;
        final float n82 = n18 + n58;
        final float n83 = n37 - n77;
        final float n84 = n38 - n78;
        final float n85 = n37 + n77;
        final float n86 = n38 + n78;
        class22.method169(n + 24L, n79 + n83);
        class22.method169(n + 25L, n80 + n84);
        class22.method169(n + 26L, n79 - n83);
        class22.method169(n + 27L, n80 - n84);
        class22.method169(n + 28L, n81 - n86);
        class22.method169(n + 29L, n82 + n85);
        class22.method169(n + 30L, n81 + n86);
        class22.method169(n + 31L, n82 - n85);
        final float n87 = n15 + n53;
        final float n88 = n16 + n54;
        final float n89 = n15 - n53;
        final float n90 = n16 - n54;
        final float n91 = n33 + n73;
        final float n92 = n34 + n74;
        final float n93 = n33 - n73;
        final float n94 = n34 - n74;
        class22.method169(n + 16L, n87 + n91);
        class22.method169(n + 17L, n88 + n92);
        class22.method169(n + 18L, n87 - n91);
        class22.method169(n + 19L, n88 - n92);
        class22.method169(n + 20L, n89 - n94);
        class22.method169(n + 21L, n90 + n93);
        class22.method169(n + 22L, n89 + n94);
        class22.method169(n + 23L, n90 - n93);
        final float n95 = n29 - n70;
        final float n96 = n30 + n69;
        final float n97 = method135 * (n95 - n96);
        final float n98 = method135 * (n96 + n95);
        final float n99 = n29 + n70;
        final float n100 = n30 - n69;
        final float n101 = method135 * (n99 - n100);
        final float n102 = method135 * (n100 + n99);
        final float n103 = n13 - n50;
        final float n104 = n14 + n49;
        final float n105 = n13 + n50;
        final float n106 = n14 - n49;
        class22.method169(n + 8L, n103 + n97);
        class22.method169(n + 9L, n104 + n98);
        class22.method169(n + 10L, n103 - n97);
        class22.method169(n + 11L, n104 - n98);
        class22.method169(n + 12L, n105 - n102);
        class22.method169(n + 13L, n106 + n101);
        class22.method169(n + 14L, n105 + n102);
        class22.method169(n + 15L, n106 - n101);
        final float n107 = n11 + n47;
        final float n108 = n12 + n48;
        final float n109 = n11 - n47;
        final float n110 = n12 - n48;
        final float n111 = n27 + n67;
        final float n112 = n28 + n68;
        final float n113 = n27 - n67;
        final float n114 = n28 - n68;
        class22.method169(n, n107 + n111);
        class22.method169(n + 1L, n108 + n112);
        class22.method169(n + 2L, n107 - n111);
        class22.method169(n + 3L, n108 - n112);
        class22.method169(n + 4L, n109 - n114);
        class22.method169(n + 5L, n110 + n113);
        class22.method169(n + 6L, n109 + n114);
        class22.method169(n + 7L, n110 - n113);
    }
    
    public static void method33281(final float[] array, final int n, final float[] array2, final int n2) {
        final float n3 = array2[n2 + 1];
        final float n4 = array2[n2 + 4];
        final float n5 = array2[n2 + 5];
        final float n6 = array2[n2 + 6];
        final float n7 = -array2[n2 + 7];
        final float n8 = array2[n2 + 8];
        final float n9 = array2[n2 + 9];
        final float n10 = array[n] - array[n + 17];
        final float n11 = array[n + 1] + array[n + 16];
        final float n12 = array[n + 8] - array[n + 25];
        final float n13 = array[n + 9] + array[n + 24];
        final float n14 = n3 * (n12 - n13);
        final float n15 = n3 * (n13 + n12);
        final float n16 = n10 + n14;
        final float n17 = n11 + n15;
        final float n18 = n10 - n14;
        final float n19 = n11 - n15;
        final float n20 = array[n] + array[n + 17];
        final float n21 = array[n + 1] - array[n + 16];
        final float n22 = array[n + 8] + array[n + 25];
        final float n23 = array[n + 9] - array[n + 24];
        final float n24 = n3 * (n22 - n23);
        final float n25 = n3 * (n23 + n22);
        final float n26 = n20 - n25;
        final float n27 = n21 + n24;
        final float n28 = n20 + n25;
        final float n29 = n21 - n24;
        final float n30 = array[n + 2] - array[n + 19];
        final float n31 = array[n + 3] + array[n + 18];
        final float n32 = n4 * n30 - n5 * n31;
        final float n33 = n4 * n31 + n5 * n30;
        final float n34 = array[n + 10] - array[n + 27];
        final float n35 = array[n + 11] + array[n + 26];
        final float n36 = n7 * n34 - n6 * n35;
        final float n37 = n7 * n35 + n6 * n34;
        final float n38 = n32 + n36;
        final float n39 = n33 + n37;
        final float n40 = n32 - n36;
        final float n41 = n33 - n37;
        final float n42 = array[n + 2] + array[n + 19];
        final float n43 = array[n + 3] - array[n + 18];
        final float n44 = n6 * n42 - n7 * n43;
        final float n45 = n6 * n43 + n7 * n42;
        final float n46 = array[n + 10] + array[n + 27];
        final float n47 = array[n + 11] - array[n + 26];
        final float n48 = n4 * n46 + n5 * n47;
        final float n49 = n4 * n47 - n5 * n46;
        final float n50 = n44 - n48;
        final float n51 = n45 - n49;
        final float n52 = n44 + n48;
        final float n53 = n45 + n49;
        final float n54 = array[n + 4] - array[n + 21];
        final float n55 = array[n + 5] + array[n + 20];
        final float n56 = n8 * n54 - n9 * n55;
        final float n57 = n8 * n55 + n9 * n54;
        final float n58 = array[n + 12] - array[n + 29];
        final float n59 = array[n + 13] + array[n + 28];
        final float n60 = n9 * n58 - n8 * n59;
        final float n61 = n9 * n59 + n8 * n58;
        final float n62 = n56 + n60;
        final float n63 = n57 + n61;
        final float n64 = n56 - n60;
        final float n65 = n57 - n61;
        final float n66 = array[n + 4] + array[n + 21];
        final float n67 = array[n + 5] - array[n + 20];
        final float n68 = n9 * n66 - n8 * n67;
        final float n69 = n9 * n67 + n8 * n66;
        final float n70 = array[n + 12] + array[n + 29];
        final float n71 = array[n + 13] - array[n + 28];
        final float n72 = n8 * n70 - n9 * n71;
        final float n73 = n8 * n71 + n9 * n70;
        final float n74 = n68 - n72;
        final float n75 = n69 - n73;
        final float n76 = n68 + n72;
        final float n77 = n69 + n73;
        final float n78 = array[n + 6] - array[n + 23];
        final float n79 = array[n + 7] + array[n + 22];
        final float n80 = n6 * n78 - n7 * n79;
        final float n81 = n6 * n79 + n7 * n78;
        final float n82 = array[n + 14] - array[n + 31];
        final float n83 = array[n + 15] + array[n + 30];
        final float n84 = n5 * n82 - n4 * n83;
        final float n85 = n5 * n83 + n4 * n82;
        final float n86 = n80 + n84;
        final float n87 = n81 + n85;
        final float n88 = n80 - n84;
        final float n89 = n81 - n85;
        final float n90 = array[n + 6] + array[n + 23];
        final float n91 = array[n + 7] - array[n + 22];
        final float n92 = n5 * n90 + n4 * n91;
        final float n93 = n5 * n91 - n4 * n90;
        final float n94 = array[n + 14] + array[n + 31];
        final float n95 = array[n + 15] - array[n + 30];
        final float n96 = n7 * n94 - n6 * n95;
        final float n97 = n7 * n95 + n6 * n94;
        final float n98 = n92 + n96;
        final float n99 = n93 + n97;
        final float n100 = n92 - n96;
        final float n101 = n93 - n97;
        final float n102 = n16 + n62;
        final float n103 = n17 + n63;
        final float n104 = n38 + n86;
        final float n105 = n39 + n87;
        array[n] = n102 + n104;
        array[n + 1] = n103 + n105;
        array[n + 2] = n102 - n104;
        array[n + 3] = n103 - n105;
        final float n106 = n16 - n62;
        final float n107 = n17 - n63;
        final float n108 = n38 - n86;
        final float n109 = n39 - n87;
        array[n + 4] = n106 - n109;
        array[n + 5] = n107 + n108;
        array[n + 6] = n106 + n109;
        array[n + 7] = n107 - n108;
        final float n110 = n18 - n65;
        final float n111 = n19 + n64;
        final float n112 = n40 - n89;
        final float n113 = n41 + n88;
        final float n114 = n3 * (n112 - n113);
        final float n115 = n3 * (n113 + n112);
        array[n + 8] = n110 + n114;
        array[n + 9] = n111 + n115;
        array[n + 10] = n110 - n114;
        array[n + 11] = n111 - n115;
        final float n116 = n18 + n65;
        final float n117 = n19 - n64;
        final float n118 = n40 + n89;
        final float n119 = n41 - n88;
        final float n120 = n3 * (n118 - n119);
        final float n121 = n3 * (n119 + n118);
        array[n + 12] = n116 - n121;
        array[n + 13] = n117 + n120;
        array[n + 14] = n116 + n121;
        array[n + 15] = n117 - n120;
        final float n122 = n26 + n74;
        final float n123 = n27 + n75;
        final float n124 = n50 - n98;
        final float n125 = n51 - n99;
        array[n + 16] = n122 + n124;
        array[n + 17] = n123 + n125;
        array[n + 18] = n122 - n124;
        array[n + 19] = n123 - n125;
        final float n126 = n26 - n74;
        final float n127 = n27 - n75;
        final float n128 = n50 + n98;
        final float n129 = n51 + n99;
        array[n + 20] = n126 - n129;
        array[n + 21] = n127 + n128;
        array[n + 22] = n126 + n129;
        array[n + 23] = n127 - n128;
        final float n130 = n28 - n77;
        final float n131 = n29 + n76;
        final float n132 = n52 + n101;
        final float n133 = n53 - n100;
        final float n134 = n3 * (n132 - n133);
        final float n135 = n3 * (n133 + n132);
        array[n + 24] = n130 + n134;
        array[n + 25] = n131 + n135;
        array[n + 26] = n130 - n134;
        array[n + 27] = n131 - n135;
        final float n136 = n28 + n77;
        final float n137 = n29 - n76;
        final float n138 = n52 - n101;
        final float n139 = n53 + n100;
        final float n140 = n3 * (n138 - n139);
        final float n141 = n3 * (n139 + n138);
        array[n + 28] = n136 - n141;
        array[n + 29] = n137 + n140;
        array[n + 30] = n136 + n141;
        array[n + 31] = n137 - n140;
    }
    
    public static void method33282(final Class22 class22, final long n, final Class22 class23, final long n2) {
        final float method135 = class23.method135(n2 + 1L);
        final float method136 = class23.method135(n2 + 4L);
        final float method137 = class23.method135(n2 + 5L);
        final float method138 = class23.method135(n2 + 6L);
        final float n3 = -class23.method135(n2 + 7L);
        final float method139 = class23.method135(n2 + 8L);
        final float method140 = class23.method135(n2 + 9L);
        final float n4 = class22.method135(n) - class22.method135(n + 17L);
        final float n5 = class22.method135(n + 1L) + class22.method135(n + 16L);
        final float n6 = class22.method135(n + 8L) - class22.method135(n + 25L);
        final float n7 = class22.method135(n + 9L) + class22.method135(n + 24L);
        final float n8 = method135 * (n6 - n7);
        final float n9 = method135 * (n7 + n6);
        final float n10 = n4 + n8;
        final float n11 = n5 + n9;
        final float n12 = n4 - n8;
        final float n13 = n5 - n9;
        final float n14 = class22.method135(n) + class22.method135(n + 17L);
        final float n15 = class22.method135(n + 1L) - class22.method135(n + 16L);
        final float n16 = class22.method135(n + 8L) + class22.method135(n + 25L);
        final float n17 = class22.method135(n + 9L) - class22.method135(n + 24L);
        final float n18 = method135 * (n16 - n17);
        final float n19 = method135 * (n17 + n16);
        final float n20 = n14 - n19;
        final float n21 = n15 + n18;
        final float n22 = n14 + n19;
        final float n23 = n15 - n18;
        final float n24 = class22.method135(n + 2L) - class22.method135(n + 19L);
        final float n25 = class22.method135(n + 3L) + class22.method135(n + 18L);
        final float n26 = method136 * n24 - method137 * n25;
        final float n27 = method136 * n25 + method137 * n24;
        final float n28 = class22.method135(n + 10L) - class22.method135(n + 27L);
        final float n29 = class22.method135(n + 11L) + class22.method135(n + 26L);
        final float n30 = n3 * n28 - method138 * n29;
        final float n31 = n3 * n29 + method138 * n28;
        final float n32 = n26 + n30;
        final float n33 = n27 + n31;
        final float n34 = n26 - n30;
        final float n35 = n27 - n31;
        final float n36 = class22.method135(n + 2L) + class22.method135(n + 19L);
        final float n37 = class22.method135(n + 3L) - class22.method135(n + 18L);
        final float n38 = method138 * n36 - n3 * n37;
        final float n39 = method138 * n37 + n3 * n36;
        final float n40 = class22.method135(n + 10L) + class22.method135(n + 27L);
        final float n41 = class22.method135(n + 11L) - class22.method135(n + 26L);
        final float n42 = method136 * n40 + method137 * n41;
        final float n43 = method136 * n41 - method137 * n40;
        final float n44 = n38 - n42;
        final float n45 = n39 - n43;
        final float n46 = n38 + n42;
        final float n47 = n39 + n43;
        final float n48 = class22.method135(n + 4L) - class22.method135(n + 21L);
        final float n49 = class22.method135(n + 5L) + class22.method135(n + 20L);
        final float n50 = method139 * n48 - method140 * n49;
        final float n51 = method139 * n49 + method140 * n48;
        final float n52 = class22.method135(n + 12L) - class22.method135(n + 29L);
        final float n53 = class22.method135(n + 13L) + class22.method135(n + 28L);
        final float n54 = method140 * n52 - method139 * n53;
        final float n55 = method140 * n53 + method139 * n52;
        final float n56 = n50 + n54;
        final float n57 = n51 + n55;
        final float n58 = n50 - n54;
        final float n59 = n51 - n55;
        final float n60 = class22.method135(n + 4L) + class22.method135(n + 21L);
        final float n61 = class22.method135(n + 5L) - class22.method135(n + 20L);
        final float n62 = method140 * n60 - method139 * n61;
        final float n63 = method140 * n61 + method139 * n60;
        final float n64 = class22.method135(n + 12L) + class22.method135(n + 29L);
        final float n65 = class22.method135(n + 13L) - class22.method135(n + 28L);
        final float n66 = method139 * n64 - method140 * n65;
        final float n67 = method139 * n65 + method140 * n64;
        final float n68 = n62 - n66;
        final float n69 = n63 - n67;
        final float n70 = n62 + n66;
        final float n71 = n63 + n67;
        final float n72 = class22.method135(n + 6L) - class22.method135(n + 23L);
        final float n73 = class22.method135(n + 7L) + class22.method135(n + 22L);
        final float n74 = method138 * n72 - n3 * n73;
        final float n75 = method138 * n73 + n3 * n72;
        final float n76 = class22.method135(n + 14L) - class22.method135(n + 31L);
        final float n77 = class22.method135(n + 15L) + class22.method135(n + 30L);
        final float n78 = method137 * n76 - method136 * n77;
        final float n79 = method137 * n77 + method136 * n76;
        final float n80 = n74 + n78;
        final float n81 = n75 + n79;
        final float n82 = n74 - n78;
        final float n83 = n75 - n79;
        final float n84 = class22.method135(n + 6L) + class22.method135(n + 23L);
        final float n85 = class22.method135(n + 7L) - class22.method135(n + 22L);
        final float n86 = method137 * n84 + method136 * n85;
        final float n87 = method137 * n85 - method136 * n84;
        final float n88 = class22.method135(n + 14L) + class22.method135(n + 31L);
        final float n89 = class22.method135(n + 15L) - class22.method135(n + 30L);
        final float n90 = n3 * n88 - method138 * n89;
        final float n91 = n3 * n89 + method138 * n88;
        final float n92 = n86 + n90;
        final float n93 = n87 + n91;
        final float n94 = n86 - n90;
        final float n95 = n87 - n91;
        final float n96 = n10 + n56;
        final float n97 = n11 + n57;
        final float n98 = n32 + n80;
        final float n99 = n33 + n81;
        class22.method169(n, n96 + n98);
        class22.method169(n + 1L, n97 + n99);
        class22.method169(n + 2L, n96 - n98);
        class22.method169(n + 3L, n97 - n99);
        final float n100 = n10 - n56;
        final float n101 = n11 - n57;
        final float n102 = n32 - n80;
        final float n103 = n33 - n81;
        class22.method169(n + 4L, n100 - n103);
        class22.method169(n + 5L, n101 + n102);
        class22.method169(n + 6L, n100 + n103);
        class22.method169(n + 7L, n101 - n102);
        final float n104 = n12 - n59;
        final float n105 = n13 + n58;
        final float n106 = n34 - n83;
        final float n107 = n35 + n82;
        final float n108 = method135 * (n106 - n107);
        final float n109 = method135 * (n107 + n106);
        class22.method169(n + 8L, n104 + n108);
        class22.method169(n + 9L, n105 + n109);
        class22.method169(n + 10L, n104 - n108);
        class22.method169(n + 11L, n105 - n109);
        final float n110 = n12 + n59;
        final float n111 = n13 - n58;
        final float n112 = n34 + n83;
        final float n113 = n35 - n82;
        final float n114 = method135 * (n112 - n113);
        final float n115 = method135 * (n113 + n112);
        class22.method169(n + 12L, n110 - n115);
        class22.method169(n + 13L, n111 + n114);
        class22.method169(n + 14L, n110 + n115);
        class22.method169(n + 15L, n111 - n114);
        final float n116 = n20 + n68;
        final float n117 = n21 + n69;
        final float n118 = n44 - n92;
        final float n119 = n45 - n93;
        class22.method169(n + 16L, n116 + n118);
        class22.method169(n + 17L, n117 + n119);
        class22.method169(n + 18L, n116 - n118);
        class22.method169(n + 19L, n117 - n119);
        final float n120 = n20 - n68;
        final float n121 = n21 - n69;
        final float n122 = n44 + n92;
        final float n123 = n45 + n93;
        class22.method169(n + 20L, n120 - n123);
        class22.method169(n + 21L, n121 + n122);
        class22.method169(n + 22L, n120 + n123);
        class22.method169(n + 23L, n121 - n122);
        final float n124 = n22 - n71;
        final float n125 = n23 + n70;
        final float n126 = n46 + n95;
        final float n127 = n47 - n94;
        final float n128 = method135 * (n126 - n127);
        final float n129 = method135 * (n127 + n126);
        class22.method169(n + 24L, n124 + n128);
        class22.method169(n + 25L, n125 + n129);
        class22.method169(n + 26L, n124 - n128);
        class22.method169(n + 27L, n125 - n129);
        final float n130 = n22 + n71;
        final float n131 = n23 - n70;
        final float n132 = n46 - n95;
        final float n133 = n47 + n94;
        final float n134 = method135 * (n132 - n133);
        final float n135 = method135 * (n133 + n132);
        class22.method169(n + 28L, n130 - n135);
        class22.method169(n + 29L, n131 + n134);
        class22.method169(n + 30L, n130 + n135);
        class22.method169(n + 31L, n131 - n134);
    }
    
    public static void method33283(final float[] array, final int n, final float[] array2, final int n2) {
        final float n3 = array2[n2 + 1];
        final float n4 = array[n] + array[n + 8];
        final float n5 = array[n + 1] + array[n + 9];
        final float n6 = array[n] - array[n + 8];
        final float n7 = array[n + 1] - array[n + 9];
        final float n8 = array[n + 4] + array[n + 12];
        final float n9 = array[n + 5] + array[n + 13];
        final float n10 = array[n + 4] - array[n + 12];
        final float n11 = array[n + 5] - array[n + 13];
        final float n12 = n4 + n8;
        final float n13 = n5 + n9;
        final float n14 = n4 - n8;
        final float n15 = n5 - n9;
        final float n16 = n6 - n11;
        final float n17 = n7 + n10;
        final float n18 = n6 + n11;
        final float n19 = n7 - n10;
        final float n20 = array[n + 2] + array[n + 10];
        final float n21 = array[n + 3] + array[n + 11];
        final float n22 = array[n + 2] - array[n + 10];
        final float n23 = array[n + 3] - array[n + 11];
        final float n24 = array[n + 6] + array[n + 14];
        final float n25 = array[n + 7] + array[n + 15];
        final float n26 = array[n + 6] - array[n + 14];
        final float n27 = array[n + 7] - array[n + 15];
        final float n28 = n20 + n24;
        final float n29 = n21 + n25;
        final float n30 = n20 - n24;
        final float n31 = n21 - n25;
        final float n32 = n22 - n27;
        final float n33 = n23 + n26;
        final float n34 = n22 + n27;
        final float n35 = n23 - n26;
        final float n36 = n3 * (n32 - n33);
        final float n37 = n3 * (n32 + n33);
        final float n38 = n3 * (n34 - n35);
        final float n39 = n3 * (n34 + n35);
        array[n + 8] = n16 + n36;
        array[n + 9] = n17 + n37;
        array[n + 10] = n16 - n36;
        array[n + 11] = n17 - n37;
        array[n + 12] = n18 - n39;
        array[n + 13] = n19 + n38;
        array[n + 14] = n18 + n39;
        array[n + 15] = n19 - n38;
        array[n] = n12 + n28;
        array[n + 1] = n13 + n29;
        array[n + 2] = n12 - n28;
        array[n + 3] = n13 - n29;
        array[n + 4] = n14 - n31;
        array[n + 5] = n15 + n30;
        array[n + 6] = n14 + n31;
        array[n + 7] = n15 - n30;
    }
    
    public static void method33284(final Class22 class22, final long n, final Class22 class23, final long n2) {
        final float method135 = class23.method135(n2 + 1L);
        final float n3 = class22.method135(n) + class22.method135(n + 8L);
        final float n4 = class22.method135(n + 1L) + class22.method135(n + 9L);
        final float n5 = class22.method135(n) - class22.method135(n + 8L);
        final float n6 = class22.method135(n + 1L) - class22.method135(n + 9L);
        final float n7 = class22.method135(n + 4L) + class22.method135(n + 12L);
        final float n8 = class22.method135(n + 5L) + class22.method135(n + 13L);
        final float n9 = class22.method135(n + 4L) - class22.method135(n + 12L);
        final float n10 = class22.method135(n + 5L) - class22.method135(n + 13L);
        final float n11 = n3 + n7;
        final float n12 = n4 + n8;
        final float n13 = n3 - n7;
        final float n14 = n4 - n8;
        final float n15 = n5 - n10;
        final float n16 = n6 + n9;
        final float n17 = n5 + n10;
        final float n18 = n6 - n9;
        final float n19 = class22.method135(n + 2L) + class22.method135(n + 10L);
        final float n20 = class22.method135(n + 3L) + class22.method135(n + 11L);
        final float n21 = class22.method135(n + 2L) - class22.method135(n + 10L);
        final float n22 = class22.method135(n + 3L) - class22.method135(n + 11L);
        final float n23 = class22.method135(n + 6L) + class22.method135(n + 14L);
        final float n24 = class22.method135(n + 7L) + class22.method135(n + 15L);
        final float n25 = class22.method135(n + 6L) - class22.method135(n + 14L);
        final float n26 = class22.method135(n + 7L) - class22.method135(n + 15L);
        final float n27 = n19 + n23;
        final float n28 = n20 + n24;
        final float n29 = n19 - n23;
        final float n30 = n20 - n24;
        final float n31 = n21 - n26;
        final float n32 = n22 + n25;
        final float n33 = n21 + n26;
        final float n34 = n22 - n25;
        final float n35 = method135 * (n31 - n32);
        final float n36 = method135 * (n31 + n32);
        final float n37 = method135 * (n33 - n34);
        final float n38 = method135 * (n33 + n34);
        class22.method169(n + 8L, n15 + n35);
        class22.method169(n + 9L, n16 + n36);
        class22.method169(n + 10L, n15 - n35);
        class22.method169(n + 11L, n16 - n36);
        class22.method169(n + 12L, n17 - n38);
        class22.method169(n + 13L, n18 + n37);
        class22.method169(n + 14L, n17 + n38);
        class22.method169(n + 15L, n18 - n37);
        class22.method169(n, n11 + n27);
        class22.method169(n + 1L, n12 + n28);
        class22.method169(n + 2L, n11 - n27);
        class22.method169(n + 3L, n12 - n28);
        class22.method169(n + 4L, n13 - n30);
        class22.method169(n + 5L, n14 + n29);
        class22.method169(n + 6L, n13 + n30);
        class22.method169(n + 7L, n14 - n29);
    }
    
    public static void method33285(final float[] array, final int n, final float[] array2, final int n2) {
        final float n3 = array2[n2 + 1];
        final float n4 = array2[n2 + 2];
        final float n5 = array2[n2 + 3];
        final float n6 = array[n] - array[n + 9];
        final float n7 = array[n + 1] + array[n + 8];
        final float n8 = array[n] + array[n + 9];
        final float n9 = array[n + 1] - array[n + 8];
        final float n10 = array[n + 4] - array[n + 13];
        final float n11 = array[n + 5] + array[n + 12];
        final float n12 = n3 * (n10 - n11);
        final float n13 = n3 * (n11 + n10);
        final float n14 = array[n + 4] + array[n + 13];
        final float n15 = array[n + 5] - array[n + 12];
        final float n16 = n3 * (n14 - n15);
        final float n17 = n3 * (n15 + n14);
        final float n18 = array[n + 2] - array[n + 11];
        final float n19 = array[n + 3] + array[n + 10];
        final float n20 = n4 * n18 - n5 * n19;
        final float n21 = n4 * n19 + n5 * n18;
        final float n22 = array[n + 2] + array[n + 11];
        final float n23 = array[n + 3] - array[n + 10];
        final float n24 = n5 * n22 - n4 * n23;
        final float n25 = n5 * n23 + n4 * n22;
        final float n26 = array[n + 6] - array[n + 15];
        final float n27 = array[n + 7] + array[n + 14];
        final float n28 = n5 * n26 - n4 * n27;
        final float n29 = n5 * n27 + n4 * n26;
        final float n30 = array[n + 6] + array[n + 15];
        final float n31 = array[n + 7] - array[n + 14];
        final float n32 = n4 * n30 - n5 * n31;
        final float n33 = n4 * n31 + n5 * n30;
        final float n34 = n6 + n12;
        final float n35 = n7 + n13;
        final float n36 = n20 + n28;
        final float n37 = n21 + n29;
        array[n] = n34 + n36;
        array[n + 1] = n35 + n37;
        array[n + 2] = n34 - n36;
        array[n + 3] = n35 - n37;
        final float n38 = n6 - n12;
        final float n39 = n7 - n13;
        final float n40 = n20 - n28;
        final float n41 = n21 - n29;
        array[n + 4] = n38 - n41;
        array[n + 5] = n39 + n40;
        array[n + 6] = n38 + n41;
        array[n + 7] = n39 - n40;
        final float n42 = n8 - n17;
        final float n43 = n9 + n16;
        final float n44 = n24 - n32;
        final float n45 = n25 - n33;
        array[n + 8] = n42 + n44;
        array[n + 9] = n43 + n45;
        array[n + 10] = n42 - n44;
        array[n + 11] = n43 - n45;
        final float n46 = n8 + n17;
        final float n47 = n9 - n16;
        final float n48 = n24 + n32;
        final float n49 = n25 + n33;
        array[n + 12] = n46 - n49;
        array[n + 13] = n47 + n48;
        array[n + 14] = n46 + n49;
        array[n + 15] = n47 - n48;
    }
    
    public static void method33286(final Class22 class22, final long n, final Class22 class23, final long n2) {
        final float method135 = class23.method135(n2 + 1L);
        final float method136 = class23.method135(n2 + 2L);
        final float method137 = class23.method135(n2 + 3L);
        final float n3 = class22.method135(n) - class22.method135(n + 9L);
        final float n4 = class22.method135(n + 1L) + class22.method135(n + 8L);
        final float n5 = class22.method135(n) + class22.method135(n + 9L);
        final float n6 = class22.method135(n + 1L) - class22.method135(n + 8L);
        final float n7 = class22.method135(n + 4L) - class22.method135(n + 13L);
        final float n8 = class22.method135(n + 5L) + class22.method135(n + 12L);
        final float n9 = method135 * (n7 - n8);
        final float n10 = method135 * (n8 + n7);
        final float n11 = class22.method135(n + 4L) + class22.method135(n + 13L);
        final float n12 = class22.method135(n + 5L) - class22.method135(n + 12L);
        final float n13 = method135 * (n11 - n12);
        final float n14 = method135 * (n12 + n11);
        final float n15 = class22.method135(n + 2L) - class22.method135(n + 11L);
        final float n16 = class22.method135(n + 3L) + class22.method135(n + 10L);
        final float n17 = method136 * n15 - method137 * n16;
        final float n18 = method136 * n16 + method137 * n15;
        final float n19 = class22.method135(n + 2L) + class22.method135(n + 11L);
        final float n20 = class22.method135(n + 3L) - class22.method135(n + 10L);
        final float n21 = method137 * n19 - method136 * n20;
        final float n22 = method137 * n20 + method136 * n19;
        final float n23 = class22.method135(n + 6L) - class22.method135(n + 15L);
        final float n24 = class22.method135(n + 7L) + class22.method135(n + 14L);
        final float n25 = method137 * n23 - method136 * n24;
        final float n26 = method137 * n24 + method136 * n23;
        final float n27 = class22.method135(n + 6L) + class22.method135(n + 15L);
        final float n28 = class22.method135(n + 7L) - class22.method135(n + 14L);
        final float n29 = method136 * n27 - method137 * n28;
        final float n30 = method136 * n28 + method137 * n27;
        final float n31 = n3 + n9;
        final float n32 = n4 + n10;
        final float n33 = n17 + n25;
        final float n34 = n18 + n26;
        class22.method169(n, n31 + n33);
        class22.method169(n + 1L, n32 + n34);
        class22.method169(n + 2L, n31 - n33);
        class22.method169(n + 3L, n32 - n34);
        final float n35 = n3 - n9;
        final float n36 = n4 - n10;
        final float n37 = n17 - n25;
        final float n38 = n18 - n26;
        class22.method169(n + 4L, n35 - n38);
        class22.method169(n + 5L, n36 + n37);
        class22.method169(n + 6L, n35 + n38);
        class22.method169(n + 7L, n36 - n37);
        final float n39 = n5 - n14;
        final float n40 = n6 + n13;
        final float n41 = n21 - n29;
        final float n42 = n22 - n30;
        class22.method169(n + 8L, n39 + n41);
        class22.method169(n + 9L, n40 + n42);
        class22.method169(n + 10L, n39 - n41);
        class22.method169(n + 11L, n40 - n42);
        final float n43 = n5 + n14;
        final float n44 = n6 - n13;
        final float n45 = n21 + n29;
        final float n46 = n22 + n30;
        class22.method169(n + 12L, n43 - n46);
        class22.method169(n + 13L, n44 + n45);
        class22.method169(n + 14L, n43 + n46);
        class22.method169(n + 15L, n44 - n45);
    }
    
    public static void method33287(final float[] array, final int n) {
        final float n2 = array[n] + array[n + 4];
        final float n3 = array[n + 1] + array[n + 5];
        final float n4 = array[n] - array[n + 4];
        final float n5 = array[n + 1] - array[n + 5];
        final float n6 = array[n + 2] + array[n + 6];
        final float n7 = array[n + 3] + array[n + 7];
        final float n8 = array[n + 2] - array[n + 6];
        final float n9 = array[n + 3] - array[n + 7];
        array[n] = n2 + n6;
        array[n + 1] = n3 + n7;
        array[n + 2] = n4 - n9;
        array[n + 3] = n5 + n8;
        array[n + 4] = n2 - n6;
        array[n + 5] = n3 - n7;
        array[n + 6] = n4 + n9;
        array[n + 7] = n5 - n8;
    }
    
    public static void method33288(final Class22 class22, final long n) {
        final float n2 = class22.method135(n) + class22.method135(n + 4L);
        final float n3 = class22.method135(n + 1L) + class22.method135(n + 5L);
        final float n4 = class22.method135(n) - class22.method135(n + 4L);
        final float n5 = class22.method135(n + 1L) - class22.method135(n + 5L);
        final float n6 = class22.method135(n + 2L) + class22.method135(n + 6L);
        final float n7 = class22.method135(n + 3L) + class22.method135(n + 7L);
        final float n8 = class22.method135(n + 2L) - class22.method135(n + 6L);
        final float n9 = class22.method135(n + 3L) - class22.method135(n + 7L);
        class22.method169(n, n2 + n6);
        class22.method169(n + 1L, n3 + n7);
        class22.method169(n + 2L, n4 - n9);
        class22.method169(n + 3L, n5 + n8);
        class22.method169(n + 4L, n2 - n6);
        class22.method169(n + 5L, n3 - n7);
        class22.method169(n + 6L, n4 + n9);
        class22.method169(n + 7L, n5 - n8);
    }
    
    public static void method33289(final float[] array, final int n) {
        final float n2 = array[n] + array[n + 4];
        final float n3 = array[n + 1] + array[n + 5];
        final float n4 = array[n] - array[n + 4];
        final float n5 = array[n + 1] - array[n + 5];
        final float n6 = array[n + 2] + array[n + 6];
        final float n7 = array[n + 3] + array[n + 7];
        final float n8 = array[n + 2] - array[n + 6];
        final float n9 = array[n + 3] - array[n + 7];
        array[n] = n2 + n6;
        array[n + 1] = n3 + n7;
        array[n + 2] = n4 + n9;
        array[n + 3] = n5 - n8;
        array[n + 4] = n2 - n6;
        array[n + 5] = n3 - n7;
        array[n + 6] = n4 - n9;
        array[n + 7] = n5 + n8;
    }
    
    public static void method33290(final Class22 class22, final long n) {
        final float n2 = class22.method135(n) + class22.method135(n + 4L);
        final float n3 = class22.method135(n + 1L) + class22.method135(n + 5L);
        final float n4 = class22.method135(n) - class22.method135(n + 4L);
        final float n5 = class22.method135(n + 1L) - class22.method135(n + 5L);
        final float n6 = class22.method135(n + 2L) + class22.method135(n + 6L);
        final float n7 = class22.method135(n + 3L) + class22.method135(n + 7L);
        final float n8 = class22.method135(n + 2L) - class22.method135(n + 6L);
        final float n9 = class22.method135(n + 3L) - class22.method135(n + 7L);
        class22.method169(n, n2 + n6);
        class22.method169(n + 1L, n3 + n7);
        class22.method169(n + 2L, n4 + n9);
        class22.method169(n + 3L, n5 - n8);
        class22.method169(n + 4L, n2 - n6);
        class22.method169(n + 5L, n3 - n7);
        class22.method169(n + 6L, n4 - n9);
        class22.method169(n + 7L, n5 + n8);
    }
    
    public static void method33291(final float[] array, final int n) {
        final float n2 = array[n] - array[n + 2];
        final float n3 = -array[n + 1] + array[n + 3];
        array[n] += array[n + 2];
        final int n4 = n + 1;
        array[n4] += array[n + 3];
        array[n + 2] = n2;
        array[n + 3] = n3;
    }
    
    public static void method33292(final Class22 class22, final long n) {
        final float n2 = class22.method135(n) - class22.method135(n + 2L);
        final float n3 = -class22.method135(n + 1L) + class22.method135(n + 3L);
        class22.method169(n, class22.method135(n) + class22.method135(n + 2L));
        class22.method169(n + 1L, class22.method135(n + 1L) + class22.method135(n + 3L));
        class22.method169(n + 2L, n2);
        class22.method169(n + 3L, n3);
    }
    
    public static void method33293(final float[] array, final int n) {
        final float n2 = array[n] - array[n + 2];
        final float n3 = array[n + 1] - array[n + 3];
        array[n] += array[n + 2];
        final int n4 = n + 1;
        array[n4] += array[n + 3];
        array[n + 2] = n2;
        array[n + 3] = n3;
    }
    
    public static void method33294(final Class22 class22, final long n) {
        final float n2 = class22.method135(n) - class22.method135(n + 2L);
        final float n3 = class22.method135(n + 1L) - class22.method135(n + 3L);
        class22.method169(n, class22.method135(n) + class22.method135(n + 2L));
        class22.method169(n + 1L, class22.method135(n + 1L) + class22.method135(n + 3L));
        class22.method169(n + 2L, n2);
        class22.method169(n + 3L, n3);
    }
    
    public static void method33295(final float[] array, final int n) {
        final float n2 = array[n] - array[n + 2];
        final float n3 = array[n + 1] + array[n + 3];
        array[n] += array[n + 2];
        final int n4 = n + 1;
        array[n4] -= array[n + 3];
        array[n + 2] = n2;
        array[n + 3] = n3;
    }
    
    public static void method33296(final Class22 class22, final long n) {
        final float n2 = class22.method135(n) - class22.method135(n + 2L);
        final float n3 = class22.method135(n + 1L) + class22.method135(n + 3L);
        class22.method169(n, class22.method135(n) + class22.method135(n + 2L));
        class22.method169(n + 1L, class22.method135(n + 1L) - class22.method135(n + 3L));
        class22.method169(n + 2L, n2);
        class22.method169(n + 3L, n3);
    }
    
    public static void method33297(final int n, final float[] array, final int n2, final int n3, final float[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final float n9 = 0.5f - array2[n4 + n3 - n7];
            final float n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final float n13 = array[n11] - array[n12];
            final float n14 = array[n11 + 1] + array[n12 + 1];
            final float n15 = n9 * n13 - n10 * n14;
            final float n16 = n9 * n14 + n10 * n13;
            final int n17 = n11;
            array[n17] -= n15;
            array[n11 + 1] = n16 - array[n11 + 1];
            final int n18 = n12;
            array[n18] += n15;
            array[n12 + 1] = n16 - array[n12 + 1];
        }
        array[n2 + n5 + 1] = -array[n2 + n5 + 1];
    }
    
    public static void method33298(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final float n10 = 0.5f - class23.method135(n4 + n3 - n7);
            final float method135 = class23.method135(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final float n13 = class22.method135(n11) - class22.method135(n12);
            final float n14 = class22.method135(n11 + 1L) + class22.method135(n12 + 1L);
            final float n15 = n10 * n13 - method135 * n14;
            final float n16 = n10 * n14 + method135 * n13;
            class22.method169(n11, class22.method135(n11) - n15);
            class22.method169(n11 + 1L, n16 - class22.method135(n11 + 1L));
            class22.method169(n12, class22.method135(n12) + n15);
            class22.method169(n12 + 1L, n16 - class22.method135(n12 + 1L));
        }
        class22.method169(n2 + n5 + 1L, -class22.method135(n2 + n5 + 1L));
    }
    
    public static void method33299(final int n, final float[] array, final int n2, final int n3, final float[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final float n9 = 0.5f - array2[n4 + n3 - n7];
            final float n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final float n13 = array[n11] - array[n12];
            final float n14 = array[n11 + 1] + array[n12 + 1];
            final float n15 = n9 * n13 - n10 * n14;
            final float n16 = n9 * n14 + n10 * n13;
            final int n17 = n11;
            array[n17] -= n15;
            final int n18 = n11 + 1;
            array[n18] -= n16;
            final int n19 = n12;
            array[n19] += n15;
            final int n20 = n12 + 1;
            array[n20] -= n16;
        }
    }
    
    public static void method33300(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final float n10 = 0.5f - class23.method135(n4 + n3 - n7);
            final float method135 = class23.method135(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final float n13 = class22.method135(n11) - class22.method135(n12);
            final float n14 = class22.method135(n11 + 1L) + class22.method135(n12 + 1L);
            final float n15 = n10 * n13 - method135 * n14;
            final float n16 = n10 * n14 + method135 * n13;
            class22.method169(n11, class22.method135(n11) - n15);
            class22.method169(n11 + 1L, class22.method135(n11 + 1L) - n16);
            class22.method169(n12, class22.method135(n12) + n15);
            class22.method169(n12 + 1L, class22.method135(n12 + 1L) - n16);
        }
    }
    
    public static void method33301(final int n, final float[] array, final int n2, final int n3, final float[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = n3 / n;
        int n7 = 0;
        for (int i = 1; i < n5; ++i) {
            final int n8 = n - i;
            n7 += n6;
            final int n9 = n4 + n7;
            final int n10 = n2 + i;
            final int n11 = n2 + n8;
            final float n12 = array2[n9] - array2[n4 + n3 - n7];
            final float n13 = array2[n9] + array2[n4 + n3 - n7];
            final float n14 = n13 * array[n10] - n12 * array[n11];
            array[n10] = n12 * array[n10] + n13 * array[n11];
            array[n11] = n14;
        }
        final int n15 = n2 + n5;
        array[n15] *= array2[n4];
    }
    
    public static void method33302(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23, final long n4) {
        final long n5 = n >> 1;
        final long n6 = n3 / n;
        long n7 = 0L;
        for (long n8 = 1L; n8 < n5; ++n8) {
            final long n9 = n - n8;
            n7 += n6;
            final long n10 = n4 + n7;
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final float n13 = class23.method135(n10) - class23.method135(n4 + n3 - n7);
            final float n14 = class23.method135(n10) + class23.method135(n4 + n3 - n7);
            final float n15 = n14 * class22.method135(n11) - n13 * class22.method135(n12);
            class22.method169(n11, n13 * class22.method135(n11) + n14 * class22.method135(n12));
            class22.method169(n12, n15);
        }
        class22.method169(n2 + n5, class22.method135(n2 + n5) * class23.method135(n4));
    }
    
    public static void method33303(final int n, final double n2, final double[] array, final int n3, final boolean b) {
        final int method27224 = Class8216.method27224();
        int n4;
        if (b) {
            n4 = 2 * n;
        }
        else {
            n4 = n;
        }
        if (method27224 > 1 && n4 > method33158()) {
            final int n5 = 2;
            final int n6 = n4 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final int n7 = n3 + i * n6;
                array2[i] = Class8216.method27227(new Class949(n7, (i == n5 - 1) ? (n3 + n4) : (n7 + n6), array, n2));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (int n8 = n3 + n4, j = n3; j < n8; ++j) {
                final int n9 = j;
                array[n9] *= n2;
            }
        }
    }
    
    public static void method33304(final long n, final double n2, final Class17 class17, final long n3, final boolean b) {
        final int method27224 = Class8216.method27224();
        long n4;
        if (b) {
            n4 = 2L * n;
        }
        else {
            n4 = n;
        }
        if (method27224 > 1 && n4 >= method33158()) {
            final long n5 = n4 / method27224;
            final Future[] array = new Future[method27224];
            for (int i = 0; i < method27224; ++i) {
                final long n6 = n3 + i * n5;
                array[i] = Class8216.method27227(new Class1654(n6, (i == method27224 - 1) ? (n3 + n4) : (n6 + n5), class17, n2));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (long n7 = n3; n7 < n3 + n4; ++n7) {
                class17.method171(n7, class17.method137(n7) * n2);
            }
        }
    }
    
    public static void method33305(final int n, final float n2, final float[] array, final int n3, final boolean b) {
        final int method27224 = Class8216.method27224();
        int n4;
        if (b) {
            n4 = 2 * n;
        }
        else {
            n4 = n;
        }
        if (method27224 > 1 && n4 > method33158()) {
            final int n5 = 2;
            final int n6 = n4 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final int n7 = n3 + i * n6;
                array2[i] = Class8216.method27227(new Class1367(n7, (i == n5 - 1) ? (n3 + n4) : (n7 + n6), array, n2));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (int n8 = n3 + n4, j = n3; j < n8; ++j) {
                final int n9 = j;
                array[n9] *= n2;
            }
        }
    }
    
    public static void method33306(final long n, final float n2, final Class22 class22, final long n3, final boolean b) {
        final int method27224 = Class8216.method27224();
        long n4;
        if (b) {
            n4 = 2L * n;
        }
        else {
            n4 = n;
        }
        if (method27224 > 1 && n4 >= method33158()) {
            final long n5 = n4 / method27224;
            final Future[] array = new Future[method27224];
            for (int i = 0; i < method27224; ++i) {
                final long n6 = n3 + i * n5;
                array[i] = Class8216.method27227(new Class1244(n6, (i == method27224 - 1) ? (n3 + n4) : (n6 + n5), class22, n2));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9133.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (long n7 = n3; n7 < n3 + n4; ++n7) {
                class22.method171(n7, class22.method137(n7) * n2);
            }
        }
    }
    
    static {
        Class9133.field38705 = 8192L;
        Class9133.field38706 = 65536L;
        Class9133.field38707 = 65536L;
        Class9133.field38708 = 65536L;
        Class9133.field38709 = false;
    }
}
