// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class6720
{
    private static int field26454;
    private static int field26455;
    private static int field26456;
    private static int field26457;
    private static int field26458;
    private static boolean field26459;
    private static long[] field26460;
    private static long[] field26461;
    private static long[] field26462;
    private static boolean field26463;
    
    private Class6720() {
    }
    
    public static void method20405(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class6720.field26454 = Integer.parseInt(array[0]);
            Class6720.field26457 = Integer.parseInt(array[1]);
            Class6720.field26458 = Integer.parseInt(array[2]);
            Class6720.field26455 = Integer.parseInt(array[3]);
            Class6720.field26459 = Boolean.parseBoolean(array[4]);
            Class6720.field26463 = Boolean.parseBoolean(array[5]);
            Class6720.field26456 = Integer.parseInt(array[6]);
            Class6720.field26460 = new long[Class6720.field26456];
            Class6720.field26461 = new long[Class6720.field26456];
            Class6720.field26462 = new long[Class6720.field26456];
            for (int i = 0; i < Class6720.field26456; ++i) {
                Class6720.field26460[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class6720.field26456; ++j) {
                Class6720.field26461[j] = Integer.parseInt(array[7 + Class6720.field26456 + j]);
            }
            for (int k = 0; k < Class6720.field26456; ++k) {
                Class6720.field26462[k] = Integer.parseInt(array[7 + Class6720.field26456 + Class6720.field26456 + k]);
            }
        }
        Class8216.method27225(Class6720.field26454);
        Class9133.method33164(Class6720.field26457);
        Class9133.method33165(Class6720.field26458);
        System.out.println("nthred = " + Class6720.field26454);
        System.out.println("threadsBegin2D = " + Class6720.field26457);
        System.out.println("threadsBegin3D = " + Class6720.field26458);
        System.out.println("niter = " + Class6720.field26455);
        System.out.println("doWarmup = " + Class6720.field26459);
        System.out.println("doScaling = " + Class6720.field26463);
        System.out.println("nsize = " + Class6720.field26456);
        System.out.println("sizes1D[] = " + Arrays.toString(Class6720.field26460));
        System.out.println("sizes2D[] = " + Arrays.toString(Class6720.field26461));
        System.out.println("sizes3D[] = " + Arrays.toString(Class6720.field26462));
    }
    
    public static void method20406() {
        final double[] array = new double[Class6720.field26456];
        final double[] array2 = new double[Class6720.field26456];
        for (int i = 0; i < Class6720.field26456; ++i) {
            System.out.println("Forward DHT 1D of size " + Class6720.field26460[i]);
            if (Class6720.field26459) {
                final Class8770 class8770 = new Class8770(Class6720.field26460[i]);
                final float[] array3 = new float[(int)Class6720.field26460[i]];
                Class7468.method23023(Class6720.field26460[i], array3);
                class8770.method30445(array3);
                Class7468.method23023(Class6720.field26460[i], array3);
                class8770.method30445(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class8770 class8771 = new Class8770(Class6720.field26460[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[] array4 = new float[(int)Class6720.field26460[i]];
            double n = 0.0;
            for (int j = 0; j < Class6720.field26455; ++j) {
                Class7468.method23023(Class6720.field26460[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8771.method30445(array4);
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
        Class7468.method23058("benchmarkFloatForwardDHT_1D.txt", Class6720.field26454, Class6720.field26455, Class6720.field26459, Class6720.field26463, Class6720.field26460, array, array2);
    }
    
    public static void method20407() {
        final double[] array = new double[Class6720.field26456];
        final double[] array2 = new double[Class6720.field26456];
        for (int i = 0; i < Class6720.field26456; ++i) {
            System.out.println("Forward DHT 2D (input 1D) of size " + Class6720.field26461[i] + " x " + Class6720.field26461[i]);
            if (Class6720.field26459) {
                final Class6874 class6874 = new Class6874(Class6720.field26461[i], Class6720.field26461[i]);
                final Class22 class6875 = new Class22(Class6720.field26461[i] * Class6720.field26461[i], false);
                Class7468.method23025(Class6720.field26461[i], Class6720.field26461[i], class6875);
                class6874.method21016(class6875);
                Class7468.method23025(Class6720.field26461[i], Class6720.field26461[i], class6875);
                class6874.method21016(class6875);
            }
            final long nanoTime = System.nanoTime();
            final Class6874 class6876 = new Class6874(Class6720.field26461[i], Class6720.field26461[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class6877 = new Class22(Class6720.field26461[i] * Class6720.field26461[i], false);
            double n = 0.0;
            for (int j = 0; j < Class6720.field26455; ++j) {
                Class7468.method23025(Class6720.field26461[i], Class6720.field26461[i], class6877);
                final long nanoTime2 = System.nanoTime();
                class6876.method21016(class6877);
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
        Class7468.method23058("benchmarkFloatForwardDHT_2D_input_1D.txt", Class6720.field26454, Class6720.field26455, Class6720.field26459, Class6720.field26463, Class6720.field26461, array, array2);
    }
    
    public static void method20408() {
        final double[] array = new double[Class6720.field26456];
        final double[] array2 = new double[Class6720.field26456];
        for (int i = 0; i < Class6720.field26456; ++i) {
            System.out.println("Forward DHT 2D (input 2D) of size " + Class6720.field26461[i] + " x " + Class6720.field26461[i]);
            if (Class6720.field26459) {
                final Class6874 class6874 = new Class6874(Class6720.field26461[i], Class6720.field26461[i]);
                final float[][] array3 = new float[(int)Class6720.field26461[i]][(int)Class6720.field26461[i]];
                Class7468.method23029(Class6720.field26461[i], Class6720.field26461[i], array3);
                class6874.method21017(array3);
                Class7468.method23029(Class6720.field26461[i], Class6720.field26461[i], array3);
                class6874.method21017(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class6874 class6875 = new Class6874(Class6720.field26461[i], Class6720.field26461[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][] array4 = new float[(int)Class6720.field26461[i]][(int)Class6720.field26461[i]];
            double n = 0.0;
            for (int j = 0; j < Class6720.field26455; ++j) {
                Class7468.method23029(Class6720.field26461[i], Class6720.field26461[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6875.method21017(array4);
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
        Class7468.method23058("benchmarkFloatForwardDHT_2D_input_2D.txt", Class6720.field26454, Class6720.field26455, Class6720.field26459, Class6720.field26463, Class6720.field26461, array, array2);
    }
    
    public static void method20409() {
        final double[] array = new double[Class6720.field26456];
        final double[] array2 = new double[Class6720.field26456];
        for (int i = 0; i < Class6720.field26456; ++i) {
            System.out.println("Forward DHT 3D (input 1D) of size " + Class6720.field26462[i] + " x " + Class6720.field26462[i] + " x " + Class6720.field26462[i]);
            if (Class6720.field26459) {
                final Class5934 class5934 = new Class5934(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i]);
                final Class22 class5935 = new Class22(Class6720.field26462[i] * Class6720.field26462[i] * Class6720.field26462[i], false);
                Class7468.method23032(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i], class5935);
                class5934.method17817(class5935);
                Class7468.method23032(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i], class5935);
                class5934.method17817(class5935);
            }
            final long nanoTime = System.nanoTime();
            final Class5934 class5936 = new Class5934(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class5937 = new Class22(Class6720.field26462[i] * Class6720.field26462[i] * Class6720.field26462[i], false);
            double n = 0.0;
            for (int j = 0; j < Class6720.field26455; ++j) {
                Class7468.method23032(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i], class5937);
                final long nanoTime2 = System.nanoTime();
                class5936.method17817(class5937);
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
        Class7468.method23058("benchmarkFloatForwardDHT_3D_input_1D.txt", Class6720.field26454, Class6720.field26455, Class6720.field26459, Class6720.field26463, Class6720.field26462, array, array2);
    }
    
    public static void method20410() {
        final double[] array = new double[Class6720.field26456];
        final double[] array2 = new double[Class6720.field26456];
        for (int i = 0; i < Class6720.field26456; ++i) {
            System.out.println("Forward DHT 3D (input 3D) of size " + Class6720.field26462[i] + " x " + Class6720.field26462[i] + " x " + Class6720.field26462[i]);
            if (Class6720.field26459) {
                final Class5934 class5934 = new Class5934(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i]);
                final float[][][] array3 = new float[(int)Class6720.field26462[i]][(int)Class6720.field26462[i]][(int)Class6720.field26462[i]];
                Class7468.method23035(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i], array3);
                class5934.method17818(array3);
                Class7468.method23035(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i], array3);
                class5934.method17818(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class5934 class5935 = new Class5934(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][][] array4 = new float[(int)Class6720.field26462[i]][(int)Class6720.field26462[i]][(int)Class6720.field26462[i]];
            double n = 0.0;
            for (int j = 0; j < Class6720.field26455; ++j) {
                Class7468.method23035(Class6720.field26462[i], Class6720.field26462[i], Class6720.field26462[i], array4);
                final long nanoTime2 = System.nanoTime();
                class5935.method17818(array4);
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
        Class7468.method23058("benchmarkFloatForwardDHT_3D_input_3D.txt", Class6720.field26454, Class6720.field26455, Class6720.field26459, Class6720.field26463, Class6720.field26462, array, array2);
    }
    
    public static void main(final String[] array) {
        method20405(array);
        method20406();
        method20407();
        method20408();
        method20409();
        method20410();
        System.exit(0);
    }
    
    static {
        Class6720.field26454 = 8;
        Class6720.field26455 = 200;
        Class6720.field26456 = 16;
        Class6720.field26457 = 65636;
        Class6720.field26458 = 65636;
        Class6720.field26459 = true;
        Class6720.field26460 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class6720.field26461 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class6720.field26462 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class6720.field26463 = false;
    }
}
