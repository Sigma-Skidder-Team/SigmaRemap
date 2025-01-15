// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class8886
{
    private static int field37376;
    private static int field37377;
    private static int field37378;
    private static int field37379;
    private static int field37380;
    private static boolean field37381;
    private static long[] field37382;
    private static long[] field37383;
    private static long[] field37384;
    private static boolean field37385;
    
    private Class8886() {
    }
    
    public static void method31278(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class8886.field37376 = Integer.parseInt(array[0]);
            Class8886.field37379 = Integer.parseInt(array[1]);
            Class8886.field37380 = Integer.parseInt(array[2]);
            Class8886.field37377 = Integer.parseInt(array[3]);
            Class8886.field37381 = Boolean.parseBoolean(array[4]);
            Class8886.field37385 = Boolean.parseBoolean(array[5]);
            Class8886.field37378 = Integer.parseInt(array[6]);
            Class8886.field37382 = new long[Class8886.field37378];
            Class8886.field37383 = new long[Class8886.field37378];
            Class8886.field37384 = new long[Class8886.field37378];
            for (int i = 0; i < Class8886.field37378; ++i) {
                Class8886.field37382[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class8886.field37378; ++j) {
                Class8886.field37383[j] = Integer.parseInt(array[7 + Class8886.field37378 + j]);
            }
            for (int k = 0; k < Class8886.field37378; ++k) {
                Class8886.field37384[k] = Integer.parseInt(array[7 + Class8886.field37378 + Class8886.field37378 + k]);
            }
        }
        Class8216.method27225(Class8886.field37376);
        Class9133.method33164(Class8886.field37379);
        Class9133.method33165(Class8886.field37380);
        System.out.println("nthred = " + Class8886.field37376);
        System.out.println("threadsBegin2D = " + Class8886.field37379);
        System.out.println("threadsBegin3D = " + Class8886.field37380);
        System.out.println("niter = " + Class8886.field37377);
        System.out.println("doWarmup = " + Class8886.field37381);
        System.out.println("doScaling = " + Class8886.field37385);
        System.out.println("nsize = " + Class8886.field37378);
        System.out.println("sizes1D[] = " + Arrays.toString(Class8886.field37382));
        System.out.println("sizes2D[] = " + Arrays.toString(Class8886.field37383));
        System.out.println("sizes3D[] = " + Arrays.toString(Class8886.field37384));
    }
    
    public static void method31279() {
        final double[] array = new double[Class8886.field37378];
        final double[] array2 = new double[Class8886.field37378];
        for (int i = 0; i < Class8886.field37378; ++i) {
            System.out.println("Forward DCT 1D of size " + Class8886.field37382[i]);
            if (Class8886.field37381) {
                final Class6062 class6062 = new Class6062(Class8886.field37382[i]);
                final double[] array3 = new double[(int)Class8886.field37382[i]];
                Class7468.method23020(Class8886.field37382[i], array3);
                class6062.method18036(array3, Class8886.field37385);
                Class7468.method23020(Class8886.field37382[i], array3);
                class6062.method18036(array3, Class8886.field37385);
            }
            final long nanoTime = System.nanoTime();
            final Class6062 class6063 = new Class6062(Class8886.field37382[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[] array4 = new double[(int)Class8886.field37382[i]];
            if (Class8886.field37381) {
                Class7468.method23020(Class8886.field37382[i], array4);
                class6063.method18036(array4, Class8886.field37385);
                Class7468.method23020(Class8886.field37382[i], array4);
                class6063.method18036(array4, Class8886.field37385);
            }
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class8886.field37377; ++j) {
                Class7468.method23020(Class8886.field37382[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6063.method18036(array4, Class8886.field37385);
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
        Class7468.method23058("benchmarkDoubleForwardDCT_1D.txt", Class8886.field37376, Class8886.field37377, Class8886.field37381, Class8886.field37385, Class8886.field37382, array, array2);
    }
    
    public static void method31280() {
        final double[] array = new double[Class8886.field37378];
        final double[] array2 = new double[Class8886.field37378];
        for (int i = 0; i < Class8886.field37378; ++i) {
            System.out.println("Forward DCT 2D (input 1D) of size " + Class8886.field37383[i] + " x " + Class8886.field37383[i]);
            if (Class8886.field37381) {
                final Class9033 class9033 = new Class9033(Class8886.field37383[i], Class8886.field37383[i]);
                final Class17 class9034 = new Class17(Class8886.field37383[i] * Class8886.field37383[i], false);
                Class7468.method23026(Class8886.field37383[i], Class8886.field37383[i], class9034);
                class9033.method32437(class9034, Class8886.field37385);
                Class7468.method23026(Class8886.field37383[i], Class8886.field37383[i], class9034);
                class9033.method32437(class9034, Class8886.field37385);
            }
            final long nanoTime = System.nanoTime();
            final Class9033 class9035 = new Class9033(Class8886.field37383[i], Class8886.field37383[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class9036 = new Class17(Class8886.field37383[i] * Class8886.field37383[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class8886.field37377; ++j) {
                Class7468.method23026(Class8886.field37383[i], Class8886.field37383[i], class9036);
                final long nanoTime2 = System.nanoTime();
                class9035.method32437(class9036, Class8886.field37385);
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
        Class7468.method23058("benchmarkDoubleForwardDCT_2D_input_1D.txt", Class8886.field37376, Class8886.field37377, Class8886.field37381, Class8886.field37385, Class8886.field37383, array, array2);
    }
    
    public static void method31281() {
        final double[] array = new double[Class8886.field37378];
        final double[] array2 = new double[Class8886.field37378];
        for (int i = 0; i < Class8886.field37378; ++i) {
            System.out.println("Forward DCT 2D (input 2D) of size " + Class8886.field37383[i] + " x " + Class8886.field37383[i]);
            if (Class8886.field37381) {
                final Class9033 class9033 = new Class9033(Class8886.field37383[i], Class8886.field37383[i]);
                final double[][] array3 = new double[(int)Class8886.field37383[i]][(int)Class8886.field37383[i]];
                Class7468.method23028(Class8886.field37383[i], Class8886.field37383[i], array3);
                class9033.method32438(array3, Class8886.field37385);
                Class7468.method23028(Class8886.field37383[i], Class8886.field37383[i], array3);
                class9033.method32438(array3, Class8886.field37385);
            }
            final long nanoTime = System.nanoTime();
            final Class9033 class9034 = new Class9033(Class8886.field37383[i], Class8886.field37383[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][] array4 = new double[(int)Class8886.field37383[i]][(int)Class8886.field37383[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class8886.field37377; ++j) {
                Class7468.method23028(Class8886.field37383[i], Class8886.field37383[i], array4);
                final long nanoTime2 = System.nanoTime();
                class9034.method32438(array4, Class8886.field37385);
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
            final double[][] array6 = null;
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkDoubleForwardDCT_2D_input_2D.txt", Class8886.field37376, Class8886.field37377, Class8886.field37381, Class8886.field37385, Class8886.field37383, array, array2);
    }
    
    public static void method31282() {
        final double[] array = new double[Class8886.field37378];
        final double[] array2 = new double[Class8886.field37378];
        for (int i = 0; i < Class8886.field37378; ++i) {
            System.out.println("Forward DCT 3D (input 1D) of size " + Class8886.field37384[i] + " x " + Class8886.field37384[i] + " x " + Class8886.field37384[i]);
            if (Class8886.field37381) {
                final Class7796 class7796 = new Class7796(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i]);
                final Class17 class7797 = new Class17(Class8886.field37384[i] * Class8886.field37384[i] * Class8886.field37384[i], false);
                Class7468.method23031(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i], class7797);
                class7796.method25126(class7797, Class8886.field37385);
                Class7468.method23031(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i], class7797);
                class7796.method25126(class7797, Class8886.field37385);
            }
            final long nanoTime = System.nanoTime();
            final Class7796 class7798 = new Class7796(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class7799 = new Class17(Class8886.field37384[i] * Class8886.field37384[i] * Class8886.field37384[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class8886.field37377; ++j) {
                Class7468.method23031(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i], class7799);
                final long nanoTime2 = System.nanoTime();
                class7798.method25126(class7799, Class8886.field37385);
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
        Class7468.method23058("benchmarkDoubleForwardDCT_3D_input_1D.txt", Class8886.field37376, Class8886.field37377, Class8886.field37381, Class8886.field37385, Class8886.field37384, array, array2);
    }
    
    public static void method31283() {
        final double[] array = new double[Class8886.field37378];
        final double[] array2 = new double[Class8886.field37378];
        for (int i = 0; i < Class8886.field37378; ++i) {
            System.out.println("Forward DCT 3D (input 3D) of size " + Class8886.field37384[i] + " x " + Class8886.field37384[i] + " x " + Class8886.field37384[i]);
            if (Class8886.field37381) {
                final Class7796 class7796 = new Class7796(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i]);
                final double[][][] array3 = new double[(int)Class8886.field37384[i]][(int)Class8886.field37384[i]][(int)Class8886.field37384[i]];
                Class7468.method23034(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i], array3);
                class7796.method25127(array3, Class8886.field37385);
                Class7468.method23034(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i], array3);
                class7796.method25127(array3, Class8886.field37385);
            }
            final long nanoTime = System.nanoTime();
            final Class7796 class7797 = new Class7796(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][][] array4 = new double[(int)Class8886.field37384[i]][(int)Class8886.field37384[i]][(int)Class8886.field37384[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class8886.field37377; ++j) {
                Class7468.method23034(Class8886.field37384[i], Class8886.field37384[i], Class8886.field37384[i], array4);
                final long nanoTime2 = System.nanoTime();
                class7797.method25127(array4, Class8886.field37385);
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
            final double[][][] array6 = null;
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkDoubleForwardDCT_3D_input_3D.txt", Class8886.field37376, Class8886.field37377, Class8886.field37381, Class8886.field37385, Class8886.field37384, array, array2);
    }
    
    public static void main(final String[] array) {
        method31278(array);
        method31279();
        method31280();
        method31281();
        method31282();
        method31283();
        System.exit(0);
    }
    
    static {
        Class8886.field37376 = 8;
        Class8886.field37377 = 200;
        Class8886.field37378 = 16;
        Class8886.field37379 = 65636;
        Class8886.field37380 = 65636;
        Class8886.field37381 = true;
        Class8886.field37382 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class8886.field37383 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class8886.field37384 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class8886.field37385 = false;
    }
}
