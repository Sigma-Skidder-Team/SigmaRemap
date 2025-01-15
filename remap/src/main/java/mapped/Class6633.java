// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class6633
{
    private static int field26220;
    private static int field26221;
    private static int field26222;
    private static int field26223;
    private static int field26224;
    private static boolean field26225;
    private static long[] field26226;
    private static long[] field26227;
    private static long[] field26228;
    private static boolean field26229;
    
    private Class6633() {
    }
    
    public static void method20076(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class6633.field26220 = Integer.parseInt(array[0]);
            Class6633.field26223 = Integer.parseInt(array[1]);
            Class6633.field26224 = Integer.parseInt(array[2]);
            Class6633.field26221 = Integer.parseInt(array[3]);
            Class6633.field26225 = Boolean.parseBoolean(array[4]);
            Class6633.field26229 = Boolean.parseBoolean(array[5]);
            Class6633.field26222 = Integer.parseInt(array[6]);
            Class6633.field26226 = new long[Class6633.field26222];
            Class6633.field26227 = new long[Class6633.field26222];
            Class6633.field26228 = new long[Class6633.field26222];
            for (int i = 0; i < Class6633.field26222; ++i) {
                Class6633.field26226[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class6633.field26222; ++j) {
                Class6633.field26227[j] = Integer.parseInt(array[7 + Class6633.field26222 + j]);
            }
            for (int k = 0; k < Class6633.field26222; ++k) {
                Class6633.field26228[k] = Integer.parseInt(array[7 + Class6633.field26222 + Class6633.field26222 + k]);
            }
        }
        Class8216.method27225(Class6633.field26220);
        Class9133.method33164(Class6633.field26223);
        Class9133.method33165(Class6633.field26224);
        System.out.println("nthred = " + Class6633.field26220);
        System.out.println("threadsBegin2D = " + Class6633.field26223);
        System.out.println("threadsBegin3D = " + Class6633.field26224);
        System.out.println("niter = " + Class6633.field26221);
        System.out.println("doWarmup = " + Class6633.field26225);
        System.out.println("doScaling = " + Class6633.field26229);
        System.out.println("nsize = " + Class6633.field26222);
        System.out.println("sizes1D[] = " + Arrays.toString(Class6633.field26226));
        System.out.println("sizes2D[] = " + Arrays.toString(Class6633.field26227));
        System.out.println("sizes3D[] = " + Arrays.toString(Class6633.field26228));
    }
    
    public static void method20077() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Complex forward FFT 1D of size " + Class6633.field26226[i]);
            if (Class6633.field26225) {
                final Class7978 class7978 = new Class7978(Class6633.field26226[i]);
                final float[] array3 = new float[(int)(2L * Class6633.field26226[i])];
                Class7468.method23023(2L * Class6633.field26226[i], array3);
                class7978.method25925(array3);
                Class7468.method23023(2L * Class6633.field26226[i], array3);
                class7978.method25925(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class7978 class7979 = new Class7978(Class6633.field26226[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[] array4 = new float[(int)(2L * Class6633.field26226[i])];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23023(2L * Class6633.field26226[i], array4);
                final long nanoTime2 = System.nanoTime();
                class7979.method25925(array4);
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
        Class7468.method23058("benchmarkFloatComplexForwardFFT_1D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26226, array, array2);
    }
    
    public static void method20078() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Real forward FFT 1D of size " + Class6633.field26226[i]);
            if (Class6633.field26225) {
                final Class7978 class7978 = new Class7978(Class6633.field26226[i]);
                final float[] array3 = new float[(int)(2L * Class6633.field26226[i])];
                Class7468.method23023(Class6633.field26226[i], array3);
                class7978.method25937(array3);
                Class7468.method23023(Class6633.field26226[i], array3);
                class7978.method25937(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class7978 class7979 = new Class7978(Class6633.field26226[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[] array4 = new float[(int)(2L * Class6633.field26226[i])];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23023(Class6633.field26226[i], array4);
                final long nanoTime2 = System.nanoTime();
                class7979.method25937(array4);
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
        Class7468.method23058("benchmarkFloatRealForwardFFT_1D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26226, array, array2);
    }
    
    public static void method20079() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Complex forward FFT 2D (input 1D) of size " + Class6633.field26227[i] + " x " + Class6633.field26227[i]);
            if (Class6633.field26225) {
                final Class8328 class8328 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
                final Class22 class8329 = new Class22(Class6633.field26227[i] * 2L * Class6633.field26227[i], false);
                Class7468.method23025(Class6633.field26227[i], 2L * Class6633.field26227[i], class8329);
                class8328.method27718(class8329);
                Class7468.method23025(Class6633.field26227[i], 2L * Class6633.field26227[i], class8329);
                class8328.method27718(class8329);
            }
            final long nanoTime = System.nanoTime();
            final Class8328 class8330 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class8331 = new Class22(Class6633.field26227[i] * 2L * Class6633.field26227[i], false);
            double n = Double.MAX_VALUE;
            int n2 = Class6633.field26221;
            if (Class6633.field26227[i] >= 8192L) {
                n2 = Class7640.method24132(1, Class6633.field26221 / 10);
            }
            for (int j = 0; j < n2; ++j) {
                Class7468.method23025(Class6633.field26227[i], 2L * Class6633.field26227[i], class8331);
                final long nanoTime2 = System.nanoTime();
                class8330.method27718(class8331);
                final long n3 = System.nanoTime() - nanoTime2;
                if (n3 < n) {
                    n = (double)n3;
                }
            }
            array[i] = n / 1000000.0;
            final double[] array3 = array2;
            final int n4 = i;
            array3[n4] += array[i];
            System.out.println("\tBest execution time without constructor: " + String.format("%.2f", array[i]) + " msec");
            System.out.println("\tBest execution time with constructor: " + String.format("%.2f", array2[i]) + " msec");
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkFloatComplexForwardFFT_2D_input_1D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26227, array, array2);
    }
    
    public static void method20080() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Complex forward FFT 2D (input 2D) of size " + Class6633.field26227[i] + " x " + Class6633.field26227[i]);
            if (Class6633.field26225) {
                final Class8328 class8328 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
                final float[][] array3 = new float[(int)Class6633.field26227[i]][2 * (int)Class6633.field26227[i]];
                Class7468.method23029(Class6633.field26227[i], 2L * Class6633.field26227[i], array3);
                class8328.method27719(array3);
                Class7468.method23029(Class6633.field26227[i], 2L * Class6633.field26227[i], array3);
                class8328.method27719(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class8328 class8329 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][] array4 = new float[(int)Class6633.field26227[i]][2 * (int)Class6633.field26227[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23029(Class6633.field26227[i], 2L * Class6633.field26227[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8329.method27719(array4);
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
        Class7468.method23058("benchmarkFloatComplexForwardFFT_2D_input_2D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26227, array, array2);
    }
    
    public static void method20081() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Real forward FFT 2D (input 1D) of size " + Class6633.field26227[i] + " x " + Class6633.field26227[i]);
            if (Class6633.field26225) {
                final Class8328 class8328 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
                final Class22 class8329 = new Class22(Class6633.field26227[i] * 2L * Class6633.field26227[i], false);
                Class7468.method23025(Class6633.field26227[i], Class6633.field26227[i], class8329);
                class8328.method27727(class8329);
                Class7468.method23025(Class6633.field26227[i], Class6633.field26227[i], class8329);
                class8328.method27727(class8329);
            }
            final long nanoTime = System.nanoTime();
            final Class8328 class8330 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class8331 = new Class22(Class6633.field26227[i] * 2L * Class6633.field26227[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23025(Class6633.field26227[i], Class6633.field26227[i], class8331);
                final long nanoTime2 = System.nanoTime();
                class8330.method27727(class8331);
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
        Class7468.method23058("benchmarkFloatRealForwardFFT_2D_input_1D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26227, array, array2);
    }
    
    public static void method20082() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Real forward FFT 2D (input 2D) of size " + Class6633.field26227[i] + " x " + Class6633.field26227[i]);
            if (Class6633.field26225) {
                final Class8328 class8328 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
                final float[][] array3 = new float[(int)Class6633.field26227[i]][2 * (int)Class6633.field26227[i]];
                Class7468.method23029(Class6633.field26227[i], Class6633.field26227[i], array3);
                class8328.method27728(array3);
                Class7468.method23029(Class6633.field26227[i], Class6633.field26227[i], array3);
                class8328.method27728(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class8328 class8329 = new Class8328(Class6633.field26227[i], Class6633.field26227[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][] array4 = new float[(int)Class6633.field26227[i]][2 * (int)Class6633.field26227[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23029(Class6633.field26227[i], Class6633.field26227[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8329.method27728(array4);
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
        Class7468.method23058("benchmarkFloatRealForwardFFT_2D_input_2D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26227, array, array2);
    }
    
    public static void method20083() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Complex forward FFT 3D (input 1D) of size " + Class6633.field26228[i] + " x " + Class6633.field26228[i] + " x " + Class6633.field26228[i]);
            if (Class6633.field26225) {
                final Class6362 class6362 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
                final Class22 class6363 = new Class22(Class6633.field26228[i] * Class6633.field26228[i] * 2L * Class6633.field26228[i], false);
                Class7468.method23032(Class6633.field26228[i], Class6633.field26228[i], 2L * Class6633.field26228[i], class6363);
                class6362.method18950(class6363);
                Class7468.method23032(Class6633.field26228[i], Class6633.field26228[i], 2L * Class6633.field26228[i], class6363);
                class6362.method18950(class6363);
            }
            final long nanoTime = System.nanoTime();
            final Class6362 class6364 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class6365 = new Class22(Class6633.field26228[i] * Class6633.field26228[i] * 2L * Class6633.field26228[i], false);
            double n = Double.MAX_VALUE;
            int n2 = Class6633.field26221;
            if (Class6633.field26228[i] >= 1024L) {
                n2 = Class7640.method24132(1, Class6633.field26221 / 10);
            }
            for (int j = 0; j < n2; ++j) {
                Class7468.method23032(Class6633.field26228[i], Class6633.field26228[i], 2L * Class6633.field26228[i], class6365);
                final long nanoTime2 = System.nanoTime();
                class6364.method18950(class6365);
                final long n3 = System.nanoTime() - nanoTime2;
                if (n3 < n) {
                    n = (double)n3;
                }
            }
            array[i] = n / 1000000.0;
            final double[] array3 = array2;
            final int n4 = i;
            array3[n4] += array[i];
            System.out.println("\tBest execution time without constructor: " + String.format("%.2f", array[i]) + " msec");
            System.out.println("\tBest execution time with constructor: " + String.format("%.2f", array2[i]) + " msec");
            System.gc();
            Class9133.method33157(5000L);
        }
        Class7468.method23058("benchmarkFloatComplexForwardFFT_3D_input_1D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26228, array, array2);
    }
    
    public static void method20084() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Complex forward FFT 3D (input 3D) of size " + Class6633.field26228[i] + " x " + Class6633.field26228[i] + " x " + Class6633.field26228[i]);
            if (Class6633.field26225) {
                final Class6362 class6362 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
                final float[][][] array3 = new float[(int)Class6633.field26228[i]][(int)Class6633.field26228[i]][2 * (int)Class6633.field26228[i]];
                Class7468.method23035(Class6633.field26228[i], Class6633.field26228[i], 2L * Class6633.field26228[i], array3);
                class6362.method18951(array3);
                Class7468.method23035(Class6633.field26228[i], Class6633.field26228[i], 2L * Class6633.field26228[i], array3);
                class6362.method18951(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class6362 class6363 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][][] array4 = new float[(int)Class6633.field26228[i]][(int)Class6633.field26228[i]][2 * (int)Class6633.field26228[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23035(Class6633.field26228[i], Class6633.field26228[i], 2L * Class6633.field26228[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6363.method18951(array4);
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
        Class7468.method23058("benchmarkFloatComplexForwardFFT_3D_input_3D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26228, array, array2);
    }
    
    public static void method20085() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Real forward FFT 3D (input 1D) of size " + Class6633.field26228[i] + " x " + Class6633.field26228[i] + " x " + Class6633.field26228[i]);
            if (Class6633.field26225) {
                final Class6362 class6362 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
                final Class22 class6363 = new Class22(Class6633.field26228[i] * Class6633.field26228[i] * 2L * Class6633.field26228[i], false);
                class6362.method18959(class6363);
                Class7468.method23032(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i], class6363);
                class6362.method18959(class6363);
            }
            final long nanoTime = System.nanoTime();
            final Class6362 class6364 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class22 class6365 = new Class22(Class6633.field26228[i] * Class6633.field26228[i] * 2L * Class6633.field26228[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23032(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i], class6365);
                final long nanoTime2 = System.nanoTime();
                class6364.method18959(class6365);
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
        Class7468.method23058("benchmarkFloatRealForwardFFT_3D_input_1D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26228, array, array2);
    }
    
    public static void method20086() {
        final double[] array = new double[Class6633.field26222];
        final double[] array2 = new double[Class6633.field26222];
        for (int i = 0; i < Class6633.field26222; ++i) {
            System.out.println("Real forward FFT 3D (input 3D) of size " + Class6633.field26228[i] + " x " + Class6633.field26228[i] + " x " + Class6633.field26228[i]);
            if (Class6633.field26225) {
                final Class6362 class6362 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
                final float[][][] array3 = new float[(int)Class6633.field26228[i]][(int)Class6633.field26228[i]][2 * (int)Class6633.field26228[i]];
                Class7468.method23035(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i], array3);
                class6362.method18960(array3);
                Class7468.method23035(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i], array3);
                class6362.method18960(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class6362 class6363 = new Class6362(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final float[][][] array4 = new float[(int)Class6633.field26228[i]][(int)Class6633.field26228[i]][2 * (int)Class6633.field26228[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class6633.field26221; ++j) {
                Class7468.method23035(Class6633.field26228[i], Class6633.field26228[i], Class6633.field26228[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6363.method18960(array4);
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
        Class7468.method23058("benchmarkFloatRealForwardFFT_3D_input_3D.txt", Class6633.field26220, Class6633.field26221, Class6633.field26225, Class6633.field26229, Class6633.field26228, array, array2);
    }
    
    public static void main(final String[] array) {
        method20076(array);
        method20077();
        method20078();
        method20079();
        method20080();
        method20081();
        method20082();
        method20083();
        method20084();
        method20085();
        method20086();
        System.exit(0);
    }
    
    static {
        Class6633.field26220 = 16;
        Class6633.field26221 = 100;
        Class6633.field26222 = 8;
        Class6633.field26223 = 65536;
        Class6633.field26224 = 65536;
        Class6633.field26225 = true;
        Class6633.field26226 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class6633.field26227 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class6633.field26228 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class6633.field26229 = false;
    }
}
