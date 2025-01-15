// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class8686
{
    private static int field36503;
    private static int field36504;
    private static int field36505;
    private static int field36506;
    private static int field36507;
    private static boolean field36508;
    private static long[] field36509;
    private static long[] field36510;
    private static long[] field36511;
    private static boolean field36512;
    
    private Class8686() {
    }
    
    public static void method29760(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class8686.field36503 = Integer.parseInt(array[0]);
            Class8686.field36506 = Integer.parseInt(array[1]);
            Class8686.field36507 = Integer.parseInt(array[2]);
            Class8686.field36504 = Integer.parseInt(array[3]);
            Class8686.field36508 = Boolean.parseBoolean(array[4]);
            Class8686.field36512 = Boolean.parseBoolean(array[5]);
            Class8686.field36505 = Integer.parseInt(array[6]);
            Class8686.field36509 = new long[Class8686.field36505];
            Class8686.field36510 = new long[Class8686.field36505];
            Class8686.field36511 = new long[Class8686.field36505];
            for (int i = 0; i < Class8686.field36505; ++i) {
                Class8686.field36509[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class8686.field36505; ++j) {
                Class8686.field36510[j] = Integer.parseInt(array[7 + Class8686.field36505 + j]);
            }
            for (int k = 0; k < Class8686.field36505; ++k) {
                Class8686.field36511[k] = Integer.parseInt(array[7 + Class8686.field36505 + Class8686.field36505 + k]);
            }
        }
        Class8216.method27225(Class8686.field36503);
        Class9133.method33164(Class8686.field36506);
        Class9133.method33165(Class8686.field36507);
        System.out.println("nthred = " + Class8686.field36503);
        System.out.println("threadsBegin2D = " + Class8686.field36506);
        System.out.println("threadsBegin3D = " + Class8686.field36507);
        System.out.println("niter = " + Class8686.field36504);
        System.out.println("doWarmup = " + Class8686.field36508);
        System.out.println("doScaling = " + Class8686.field36512);
        System.out.println("nsize = " + Class8686.field36505);
        System.out.println("sizes1D[] = " + Arrays.toString(Class8686.field36509));
        System.out.println("sizes2D[] = " + Arrays.toString(Class8686.field36510));
        System.out.println("sizes3D[] = " + Arrays.toString(Class8686.field36511));
    }
    
    public static void method29761() {
        final double[] array = new double[Class8686.field36505];
        final double[] array2 = new double[Class8686.field36505];
        for (int i = 0; i < Class8686.field36505; ++i) {
            System.out.println("Forward DCT 1D of size " + Class8686.field36509[i]);
            if (Class8686.field36508) {
                final Class8673 class8673 = new Class8673(Class8686.field36509[i]);
                final float[] array3 = new float[(int)Class8686.field36509[i]];
                Class7468.method23023(Class8686.field36509[i], array3);
                class8673.method29689(array3, Class8686.field36512);
                Class7468.method23023(Class8686.field36509[i], array3);
                class8673.method29689(array3, Class8686.field36512);
            }
            final long nanoTime = System.nanoTime();
            final Class8673 class8674 = new Class8673(Class8686.field36509[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[] array4 = new float[(int)Class8686.field36509[i]];
            double n = 0.0;
            for (int j = 0; j < Class8686.field36504; ++j) {
                Class7468.method23023(Class8686.field36509[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8674.method29689(array4, Class8686.field36512);
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
        Class7468.method23058("benchmarkFloatForwardDCT_1D.txt", Class8686.field36503, Class8686.field36504, Class8686.field36508, Class8686.field36512, Class8686.field36509, array, array2);
    }
    
    public static void method29762() {
        final double[] array = new double[Class8686.field36505];
        final double[] array2 = new double[Class8686.field36505];
        for (int i = 0; i < Class8686.field36505; ++i) {
            System.out.println("Forward DCT 2D (input 1D) of size " + Class8686.field36510[i] + " x " + Class8686.field36510[i]);
            if (Class8686.field36508) {
                final Class7706 class7706 = new Class7706(Class8686.field36510[i], Class8686.field36510[i]);
                final Class22 class7707 = new Class22(Class8686.field36510[i] * Class8686.field36510[i], false);
                Class7468.method23025(Class8686.field36510[i], Class8686.field36510[i], class7707);
                class7706.method24562(class7707, Class8686.field36512);
                Class7468.method23025(Class8686.field36510[i], Class8686.field36510[i], class7707);
                class7706.method24562(class7707, Class8686.field36512);
            }
            final long nanoTime = System.nanoTime();
            final Class7706 class7708 = new Class7706(Class8686.field36510[i], Class8686.field36510[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class7709 = new Class22(Class8686.field36510[i] * Class8686.field36510[i], false);
            double n = 0.0;
            for (int j = 0; j < Class8686.field36504; ++j) {
                Class7468.method23025(Class8686.field36510[i], Class8686.field36510[i], class7709);
                final long nanoTime2 = System.nanoTime();
                class7708.method24562(class7709, Class8686.field36512);
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
        Class7468.method23058("benchmarkFloatForwardDCT_2D_input_1D.txt", Class8686.field36503, Class8686.field36504, Class8686.field36508, Class8686.field36512, Class8686.field36510, array, array2);
    }
    
    public static void method29763() {
        final double[] array = new double[Class8686.field36505];
        final double[] array2 = new double[Class8686.field36505];
        for (int i = 0; i < Class8686.field36505; ++i) {
            System.out.println("Forward DCT 2D (input 2D) of size " + Class8686.field36510[i] + " x " + Class8686.field36510[i]);
            if (Class8686.field36508) {
                final Class7706 class7706 = new Class7706(Class8686.field36510[i], Class8686.field36510[i]);
                final float[][] array3 = new float[(int)Class8686.field36510[i]][(int)Class8686.field36510[i]];
                Class7468.method23029(Class8686.field36510[i], Class8686.field36510[i], array3);
                class7706.method24563(array3, Class8686.field36512);
                Class7468.method23029(Class8686.field36510[i], Class8686.field36510[i], array3);
                class7706.method24563(array3, Class8686.field36512);
            }
            final long nanoTime = System.nanoTime();
            final Class7706 class7707 = new Class7706(Class8686.field36510[i], Class8686.field36510[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][] array4 = new float[(int)Class8686.field36510[i]][(int)Class8686.field36510[i]];
            double n = 0.0;
            for (int j = 0; j < Class8686.field36504; ++j) {
                Class7468.method23029(Class8686.field36510[i], Class8686.field36510[i], array4);
                final long nanoTime2 = System.nanoTime();
                class7707.method24563(array4, Class8686.field36512);
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
        Class7468.method23058("benchmarkFloatForwardDCT_2D_input_2D.txt", Class8686.field36503, Class8686.field36504, Class8686.field36508, Class8686.field36512, Class8686.field36510, array, array2);
    }
    
    public static void method29764() {
        final double[] array = new double[Class8686.field36505];
        final double[] array2 = new double[Class8686.field36505];
        for (int i = 0; i < Class8686.field36505; ++i) {
            System.out.println("Forward DCT 3D (input 1D) of size " + Class8686.field36511[i] + " x " + Class8686.field36511[i] + " x " + Class8686.field36511[i]);
            if (Class8686.field36508) {
                final Class9117 class9117 = new Class9117(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i]);
                final Class22 class9118 = new Class22(Class8686.field36511[i] * Class8686.field36511[i] * Class8686.field36511[i], false);
                Class7468.method23032(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i], class9118);
                class9117.method32985(class9118, Class8686.field36512);
                Class7468.method23032(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i], class9118);
                class9117.method32985(class9118, Class8686.field36512);
            }
            final long nanoTime = System.nanoTime();
            final Class9117 class9119 = new Class9117(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class9120 = new Class22(Class8686.field36511[i] * Class8686.field36511[i] * Class8686.field36511[i], false);
            double n = 0.0;
            for (int j = 0; j < Class8686.field36504; ++j) {
                Class7468.method23032(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i], class9120);
                final long nanoTime2 = System.nanoTime();
                class9119.method32985(class9120, Class8686.field36512);
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
        Class7468.method23058("benchmarkFloatForwardDCT_3D_input_1D.txt", Class8686.field36503, Class8686.field36504, Class8686.field36508, Class8686.field36512, Class8686.field36511, array, array2);
    }
    
    public static void method29765() {
        final double[] array = new double[Class8686.field36505];
        final double[] array2 = new double[Class8686.field36505];
        for (int i = 0; i < Class8686.field36505; ++i) {
            System.out.println("Forward DCT 3D (input 3D) of size " + Class8686.field36511[i] + " x " + Class8686.field36511[i] + " x " + Class8686.field36511[i]);
            if (Class8686.field36508) {
                final Class9117 class9117 = new Class9117(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i]);
                final float[][][] array3 = new float[(int)Class8686.field36511[i]][(int)Class8686.field36511[i]][(int)Class8686.field36511[i]];
                Class7468.method23035(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i], array3);
                class9117.method32986(array3, Class8686.field36512);
                Class7468.method23035(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i], array3);
                class9117.method32986(array3, Class8686.field36512);
            }
            final long nanoTime = System.nanoTime();
            final Class9117 class9118 = new Class9117(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][][] array4 = new float[(int)Class8686.field36511[i]][(int)Class8686.field36511[i]][(int)Class8686.field36511[i]];
            double n = 0.0;
            for (int j = 0; j < Class8686.field36504; ++j) {
                Class7468.method23035(Class8686.field36511[i], Class8686.field36511[i], Class8686.field36511[i], array4);
                final long nanoTime2 = System.nanoTime();
                class9118.method32986(array4, Class8686.field36512);
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
        Class7468.method23058("benchmarkFloatForwardDCT_3D_input_3D.txt", Class8686.field36503, Class8686.field36504, Class8686.field36508, Class8686.field36512, Class8686.field36511, array, array2);
    }
    
    public static void main(final String[] array) {
        method29760(array);
        method29761();
        method29762();
        method29763();
        method29764();
        method29765();
        System.exit(0);
    }
    
    static {
        Class8686.field36503 = 8;
        Class8686.field36504 = 200;
        Class8686.field36505 = 16;
        Class8686.field36506 = 65636;
        Class8686.field36507 = 65636;
        Class8686.field36508 = true;
        Class8686.field36509 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class8686.field36510 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class8686.field36511 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class8686.field36512 = false;
    }
}
