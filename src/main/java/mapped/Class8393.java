// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class8393
{
    private static int field34396;
    private static int field34397;
    private static int field34398;
    private static int field34399;
    private static int field34400;
    private static boolean field34401;
    private static long[] field34402;
    private static long[] field34403;
    private static long[] field34404;
    private static boolean field34405;
    
    private Class8393() {
    }
    
    public static void method27978(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class8393.field34396 = Integer.parseInt(array[0]);
            Class8393.field34399 = Integer.parseInt(array[1]);
            Class8393.field34400 = Integer.parseInt(array[2]);
            Class8393.field34397 = Integer.parseInt(array[3]);
            Class8393.field34401 = Boolean.parseBoolean(array[4]);
            Class8393.field34405 = Boolean.parseBoolean(array[5]);
            Class8393.field34398 = Integer.parseInt(array[6]);
            Class8393.field34402 = new long[Class8393.field34398];
            Class8393.field34403 = new long[Class8393.field34398];
            Class8393.field34404 = new long[Class8393.field34398];
            for (int i = 0; i < Class8393.field34398; ++i) {
                Class8393.field34402[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class8393.field34398; ++j) {
                Class8393.field34403[j] = Integer.parseInt(array[7 + Class8393.field34398 + j]);
            }
            for (int k = 0; k < Class8393.field34398; ++k) {
                Class8393.field34404[k] = Integer.parseInt(array[7 + Class8393.field34398 + Class8393.field34398 + k]);
            }
        }
        Class8216.method27225(Class8393.field34396);
        Class9133.method33164(Class8393.field34399);
        Class9133.method33165(Class8393.field34400);
        System.out.println("nthred = " + Class8393.field34396);
        System.out.println("threadsBegin2D = " + Class8393.field34399);
        System.out.println("threadsBegin3D = " + Class8393.field34400);
        System.out.println("niter = " + Class8393.field34397);
        System.out.println("doWarmup = " + Class8393.field34401);
        System.out.println("doScaling = " + Class8393.field34405);
        System.out.println("nsize = " + Class8393.field34398);
        System.out.println("sizes1D[] = " + Arrays.toString(Class8393.field34402));
        System.out.println("sizes2D[] = " + Arrays.toString(Class8393.field34403));
        System.out.println("sizes3D[] = " + Arrays.toString(Class8393.field34404));
    }
    
    public static void method27979() {
        final double[] array = new double[Class8393.field34398];
        final double[] array2 = new double[Class8393.field34398];
        for (int i = 0; i < Class8393.field34398; ++i) {
            System.out.println("Forward DST 1D of size " + Class8393.field34402[i]);
            if (Class8393.field34401) {
                final Class9267 class9267 = new Class9267(Class8393.field34402[i]);
                final float[] array3 = new float[(int)Class8393.field34402[i]];
                Class7468.method23023(Class8393.field34402[i], array3);
                class9267.method34181(array3, Class8393.field34405);
                Class7468.method23023(Class8393.field34402[i], array3);
                class9267.method34181(array3, Class8393.field34405);
            }
            final long nanoTime = System.nanoTime();
            final Class9267 class9268 = new Class9267(Class8393.field34402[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[] array4 = new float[(int)Class8393.field34402[i]];
            double n = 0.0;
            for (int j = 0; j < Class8393.field34397; ++j) {
                Class7468.method23023(Class8393.field34402[i], array4);
                final long nanoTime2 = System.nanoTime();
                class9268.method34181(array4, Class8393.field34405);
                final long n2 = System.nanoTime() - nanoTime2;
                if (n2 < n) {
                    n = (double)n2;
                }
            }
            array[i] = n / 1000000.0;
            final double[] array5 = array2;
            final int n3 = i;
            array5[n3] += array[i];
            System.out.println("\tBest execution time without constructor: " + String.format("%.2f", array[i]) + " msec");
            System.out.println("\tBest execution time with constructor: " + String.format("%.2f", array2[i]) + " msec");
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkFloatForwardDST_1D.txt", Class8393.field34396, Class8393.field34397, Class8393.field34401, Class8393.field34405, Class8393.field34402, array, array2);
    }
    
    public static void method27980() {
        final double[] array = new double[Class8393.field34398];
        final double[] array2 = new double[Class8393.field34398];
        for (int i = 0; i < Class8393.field34398; ++i) {
            System.out.println("Forward DST 2D (input 1D) of size " + Class8393.field34403[i] + " x " + Class8393.field34403[i]);
            if (Class8393.field34401) {
                final Class6710 class6710 = new Class6710(Class8393.field34403[i], Class8393.field34403[i]);
                final Class22 class6711 = new Class22(Class8393.field34403[i] * Class8393.field34403[i], false);
                Class7468.method23025(Class8393.field34403[i], Class8393.field34403[i], class6711);
                class6710.method20366(class6711, Class8393.field34405);
                Class7468.method23025(Class8393.field34403[i], Class8393.field34403[i], class6711);
                class6710.method20366(class6711, Class8393.field34405);
            }
            final long nanoTime = System.nanoTime();
            final Class6710 class6712 = new Class6710(Class8393.field34403[i], Class8393.field34403[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class6713 = new Class22(Class8393.field34403[i] * Class8393.field34403[i], false);
            double n = 0.0;
            for (int j = 0; j < Class8393.field34397; ++j) {
                Class7468.method23025(Class8393.field34403[i], Class8393.field34403[i], class6713);
                final long nanoTime2 = System.nanoTime();
                class6712.method20366(class6713, Class8393.field34405);
                final long n2 = System.nanoTime() - nanoTime2;
                if (n2 < n) {
                    n = (double)n2;
                }
            }
            array[i] = n / 1000000.0;
            final double[] array3 = array2;
            final int n3 = i;
            array3[n3] += array[i];
            System.out.println("\tBest execution time without constructor: " + String.format("%.2f", array[i]) + " msec");
            System.out.println("\tBest execution time with constructor: " + String.format("%.2f", array2[i]) + " msec");
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkFloatForwardDST_2D_input_1D.txt", Class8393.field34396, Class8393.field34397, Class8393.field34401, Class8393.field34405, Class8393.field34403, array, array2);
    }
    
    public static void method27981() {
        final double[] array = new double[Class8393.field34398];
        final double[] array2 = new double[Class8393.field34398];
        for (int i = 0; i < Class8393.field34398; ++i) {
            System.out.println("Forward DST 2D (input 2D) of size " + Class8393.field34403[i] + " x " + Class8393.field34403[i]);
            if (Class8393.field34401) {
                final Class6710 class6710 = new Class6710(Class8393.field34403[i], Class8393.field34403[i]);
                final float[][] array3 = new float[(int)Class8393.field34403[i]][(int)Class8393.field34403[i]];
                Class7468.method23029(Class8393.field34403[i], Class8393.field34403[i], array3);
                class6710.method20367(array3, Class8393.field34405);
                Class7468.method23029(Class8393.field34403[i], Class8393.field34403[i], array3);
                class6710.method20367(array3, Class8393.field34405);
            }
            final long nanoTime = System.nanoTime();
            final Class6710 class6711 = new Class6710(Class8393.field34403[i], Class8393.field34403[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][] array4 = new float[(int)Class8393.field34403[i]][(int)Class8393.field34403[i]];
            double n = 0.0;
            for (int j = 0; j < Class8393.field34397; ++j) {
                Class7468.method23029(Class8393.field34403[i], Class8393.field34403[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6711.method20367(array4, Class8393.field34405);
                final long n2 = System.nanoTime() - nanoTime2;
                if (n2 < n) {
                    n = (double)n2;
                }
            }
            array[i] = n / 1000000.0;
            final double[] array5 = array2;
            final int n3 = i;
            array5[n3] += array[i];
            System.out.println("\tBest execution time without constructor: " + String.format("%.2f", array[i]) + " msec");
            System.out.println("\tBest execution time with constructor: " + String.format("%.2f", array2[i]) + " msec");
            final float[][] array6 = null;
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkFloatForwardDST_2D_input_2D.txt", Class8393.field34396, Class8393.field34397, Class8393.field34401, Class8393.field34405, Class8393.field34403, array, array2);
    }
    
    public static void method27982() {
        final double[] array = new double[Class8393.field34398];
        final double[] array2 = new double[Class8393.field34398];
        for (int i = 0; i < Class8393.field34398; ++i) {
            System.out.println("Forward DST 3D (input 1D) of size " + Class8393.field34404[i] + " x " + Class8393.field34404[i] + " x " + Class8393.field34404[i]);
            if (Class8393.field34401) {
                final Class6498 class6498 = new Class6498(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i]);
                final Class22 class6499 = new Class22(Class8393.field34404[i] * Class8393.field34404[i] * Class8393.field34404[i], false);
                Class7468.method23032(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i], class6499);
                class6498.method19547(class6499, Class8393.field34405);
                Class7468.method23032(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i], class6499);
                class6498.method19547(class6499, Class8393.field34405);
            }
            final long nanoTime = System.nanoTime();
            final Class6498 class6500 = new Class6498(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class6501 = new Class22(Class8393.field34404[i] * Class8393.field34404[i] * Class8393.field34404[i], false);
            double n = 0.0;
            for (int j = 0; j < Class8393.field34397; ++j) {
                Class7468.method23032(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i], class6501);
                final long nanoTime2 = System.nanoTime();
                class6500.method19547(class6501, Class8393.field34405);
                final long n2 = System.nanoTime() - nanoTime2;
                if (n2 < n) {
                    n = (double)n2;
                }
            }
            array[i] = n / 1000000.0;
            final double[] array3 = array2;
            final int n3 = i;
            array3[n3] += array[i];
            System.out.println("\tBest execution time without constructor: " + String.format("%.2f", array[i]) + " msec");
            System.out.println("\tBest execution time with constructor: " + String.format("%.2f", array2[i]) + " msec");
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkFloatForwardDST_3D_input_1D.txt", Class8393.field34396, Class8393.field34397, Class8393.field34401, Class8393.field34405, Class8393.field34404, array, array2);
    }
    
    public static void method27983() {
        final double[] array = new double[Class8393.field34398];
        final double[] array2 = new double[Class8393.field34398];
        for (int i = 0; i < Class8393.field34398; ++i) {
            System.out.println("Forward DST 3D (input 3D) of size " + Class8393.field34404[i] + " x " + Class8393.field34404[i] + " x " + Class8393.field34404[i]);
            if (Class8393.field34401) {
                final Class6498 class6498 = new Class6498(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i]);
                final float[][][] array3 = new float[(int)Class8393.field34404[i]][(int)Class8393.field34404[i]][(int)Class8393.field34404[i]];
                Class7468.method23035(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i], array3);
                class6498.method19548(array3, Class8393.field34405);
                Class7468.method23035(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i], array3);
                class6498.method19548(array3, Class8393.field34405);
            }
            final long nanoTime = System.nanoTime();
            final Class6498 class6499 = new Class6498(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][][] array4 = new float[(int)Class8393.field34404[i]][(int)Class8393.field34404[i]][(int)Class8393.field34404[i]];
            double n = 0.0;
            for (int j = 0; j < Class8393.field34397; ++j) {
                Class7468.method23035(Class8393.field34404[i], Class8393.field34404[i], Class8393.field34404[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6499.method19548(array4, Class8393.field34405);
                final long n2 = System.nanoTime() - nanoTime2;
                if (n2 < n) {
                    n = (double)n2;
                }
            }
            array[i] = n / 1000000.0;
            final double[] array5 = array2;
            final int n3 = i;
            array5[n3] += array[i];
            System.out.println("\tBest execution time without constructor: " + String.format("%.2f", array[i]) + " msec");
            System.out.println("\tBest execution time with constructor: " + String.format("%.2f", array2[i]) + " msec");
            final float[][][] array6 = null;
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkFloatForwardDST_3D_input_3D.txt", Class8393.field34396, Class8393.field34397, Class8393.field34401, Class8393.field34405, Class8393.field34404, array, array2);
    }
    
    public static void main(final String[] array) {
        method27978(array);
        method27979();
        method27980();
        method27981();
        method27982();
        method27983();
        System.exit(0);
    }
    
    static {
        Class8393.field34396 = 8;
        Class8393.field34397 = 200;
        Class8393.field34398 = 16;
        Class8393.field34399 = 65636;
        Class8393.field34400 = 65636;
        Class8393.field34401 = true;
        Class8393.field34402 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class8393.field34403 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class8393.field34404 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class8393.field34405 = false;
    }
}
