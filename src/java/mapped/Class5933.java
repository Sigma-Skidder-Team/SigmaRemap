// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class5933
{
    private static int field24403;
    private static int field24404;
    private static int field24405;
    private static int field24406;
    private static int field24407;
    private static boolean field24408;
    private static long[] field24409;
    private static long[] field24410;
    private static long[] field24411;
    private static boolean field24412;
    
    private Class5933() {
    }
    
    public static void method17805(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class5933.field24403 = Integer.parseInt(array[0]);
            Class5933.field24406 = Integer.parseInt(array[1]);
            Class5933.field24407 = Integer.parseInt(array[2]);
            Class5933.field24404 = Integer.parseInt(array[3]);
            Class5933.field24408 = Boolean.parseBoolean(array[4]);
            Class5933.field24412 = Boolean.parseBoolean(array[5]);
            Class5933.field24405 = Integer.parseInt(array[6]);
            Class5933.field24409 = new long[Class5933.field24405];
            Class5933.field24410 = new long[Class5933.field24405];
            Class5933.field24411 = new long[Class5933.field24405];
            for (int i = 0; i < Class5933.field24405; ++i) {
                Class5933.field24409[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class5933.field24405; ++j) {
                Class5933.field24410[j] = Integer.parseInt(array[7 + Class5933.field24405 + j]);
            }
            for (int k = 0; k < Class5933.field24405; ++k) {
                Class5933.field24411[k] = Integer.parseInt(array[7 + Class5933.field24405 + Class5933.field24405 + k]);
            }
        }
        Class8216.method27225(Class5933.field24403);
        Class9133.method33164(Class5933.field24406);
        Class9133.method33165(Class5933.field24407);
        System.out.println("nthred = " + Class5933.field24403);
        System.out.println("threadsBegin2D = " + Class5933.field24406);
        System.out.println("threadsBegin3D = " + Class5933.field24407);
        System.out.println("niter = " + Class5933.field24404);
        System.out.println("doWarmup = " + Class5933.field24408);
        System.out.println("doScaling = " + Class5933.field24412);
        System.out.println("nsize = " + Class5933.field24405);
        System.out.println("sizes1D[] = " + Arrays.toString(Class5933.field24409));
        System.out.println("sizes2D[] = " + Arrays.toString(Class5933.field24410));
        System.out.println("sizes3D[] = " + Arrays.toString(Class5933.field24411));
    }
    
    public static void method17806() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Complex forward FFT 1D of size " + Class5933.field24409[i]);
            if (Class5933.field24408) {
                final Class7992 class7992 = new Class7992(Class5933.field24409[i]);
                final double[] array3 = new double[(int)(2L * Class5933.field24409[i])];
                Class7468.method23020(2L * Class5933.field24409[i], array3);
                class7992.method26072(array3);
                Class7468.method23020(2L * Class5933.field24409[i], array3);
                class7992.method26072(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class7992 class7993 = new Class7992(Class5933.field24409[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[] array4 = new double[(int)(2L * Class5933.field24409[i])];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23020(2L * Class5933.field24409[i], array4);
                final long nanoTime2 = System.nanoTime();
                class7993.method26072(array4);
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
        Class7468.method23058("benchmarkDoubleComplexForwardFFT_1D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24409, array, array2);
    }
    
    public static void method17807() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Real forward FFT 1D of size " + Class5933.field24409[i]);
            if (Class5933.field24408) {
                final Class7992 class7992 = new Class7992(Class5933.field24409[i]);
                final double[] array3 = new double[(int)(2L * Class5933.field24409[i])];
                Class7468.method23020(Class5933.field24409[i], array3);
                class7992.method26084(array3);
                Class7468.method23020(Class5933.field24409[i], array3);
                class7992.method26084(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class7992 class7993 = new Class7992(Class5933.field24409[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[] array4 = new double[(int)(2L * Class5933.field24409[i])];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23020(Class5933.field24409[i], array4);
                final long nanoTime2 = System.nanoTime();
                class7993.method26084(array4);
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
        Class7468.method23058("benchmarkDoubleRealForwardFFT_1D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24409, array, array2);
    }
    
    public static void method17808() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Complex forward FFT 2D (input 1D) of size " + Class5933.field24410[i] + " x " + Class5933.field24410[i]);
            if (Class5933.field24408) {
                final Class8983 class8983 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
                final Class17 class8984 = new Class17(Class5933.field24410[i] * 2L * Class5933.field24410[i], false);
                Class7468.method23026(Class5933.field24410[i], 2L * Class5933.field24410[i], class8984);
                class8983.method31934(class8984);
                Class7468.method23026(Class5933.field24410[i], 2L * Class5933.field24410[i], class8984);
                class8983.method31934(class8984);
            }
            final long nanoTime = System.nanoTime();
            final Class8983 class8985 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class8986 = new Class17(Class5933.field24410[i] * 2L * Class5933.field24410[i], false);
            double n = Double.MAX_VALUE;
            int n2 = Class5933.field24404;
            if (Class5933.field24410[i] >= 8192L) {
                n2 = Class7640.method24132(1, Class5933.field24404 / 10);
            }
            for (int j = 0; j < n2; ++j) {
                Class7468.method23026(Class5933.field24410[i], 2L * Class5933.field24410[i], class8986);
                final long nanoTime2 = System.nanoTime();
                class8985.method31934(class8986);
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
        Class7468.method23058("benchmarkDoubleComplexForwardFFT_2D_input_1D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24410, array, array2);
    }
    
    public static void method17809() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Complex forward FFT 2D (input 2D) of size " + Class5933.field24410[i] + " x " + Class5933.field24410[i]);
            if (Class5933.field24408) {
                final Class8983 class8983 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
                final double[][] array3 = new double[(int)Class5933.field24410[i]][2 * (int)Class5933.field24410[i]];
                Class7468.method23028(Class5933.field24410[i], 2L * Class5933.field24410[i], array3);
                class8983.method31935(array3);
                Class7468.method23028(Class5933.field24410[i], 2L * Class5933.field24410[i], array3);
                class8983.method31935(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class8983 class8984 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][] array4 = new double[(int)Class5933.field24410[i]][2 * (int)Class5933.field24410[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23028(Class5933.field24410[i], 2L * Class5933.field24410[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8984.method31935(array4);
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
        Class7468.method23058("benchmarkDoubleComplexForwardFFT_2D_input_2D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24410, array, array2);
    }
    
    public static void method17810() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Real forward FFT 2D (input 1D) of size " + Class5933.field24410[i] + " x " + Class5933.field24410[i]);
            if (Class5933.field24408) {
                final Class8983 class8983 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
                final Class17 class8984 = new Class17(Class5933.field24410[i] * 2L * Class5933.field24410[i], false);
                Class7468.method23026(Class5933.field24410[i], Class5933.field24410[i], class8984);
                class8983.method31943(class8984);
                Class7468.method23026(Class5933.field24410[i], Class5933.field24410[i], class8984);
                class8983.method31943(class8984);
            }
            final long nanoTime = System.nanoTime();
            final Class8983 class8985 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class8986 = new Class17(Class5933.field24410[i] * 2L * Class5933.field24410[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23026(Class5933.field24410[i], Class5933.field24410[i], class8986);
                final long nanoTime2 = System.nanoTime();
                class8985.method31943(class8986);
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
        Class7468.method23058("benchmarkDoubleRealForwardFFT_2D_input_1D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24410, array, array2);
    }
    
    public static void method17811() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Real forward FFT 2D (input 2D) of size " + Class5933.field24410[i] + " x " + Class5933.field24410[i]);
            if (Class5933.field24408) {
                final Class8983 class8983 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
                final double[][] array3 = new double[(int)Class5933.field24410[i]][2 * (int)Class5933.field24410[i]];
                Class7468.method23028(Class5933.field24410[i], Class5933.field24410[i], array3);
                class8983.method31944(array3);
                Class7468.method23028(Class5933.field24410[i], Class5933.field24410[i], array3);
                class8983.method31944(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class8983 class8984 = new Class8983(Class5933.field24410[i], Class5933.field24410[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][] array4 = new double[(int)Class5933.field24410[i]][2 * (int)Class5933.field24410[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23028(Class5933.field24410[i], Class5933.field24410[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8984.method31944(array4);
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
        Class7468.method23058("benchmarkDoubleRealForwardFFT_2D_input_2D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24410, array, array2);
    }
    
    public static void method17812() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Complex forward FFT 3D (input 1D) of size " + Class5933.field24411[i] + " x " + Class5933.field24411[i] + " x " + Class5933.field24411[i]);
            if (Class5933.field24408) {
                final Class6733 class6733 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
                final Class17 class6734 = new Class17(Class5933.field24411[i] * Class5933.field24411[i] * 2L * Class5933.field24411[i], false);
                Class7468.method23031(Class5933.field24411[i], Class5933.field24411[i], 2L * Class5933.field24411[i], class6734);
                class6733.method20426(class6734);
                Class7468.method23031(Class5933.field24411[i], Class5933.field24411[i], 2L * Class5933.field24411[i], class6734);
                class6733.method20426(class6734);
            }
            final long nanoTime = System.nanoTime();
            final Class6733 class6735 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class6736 = new Class17(Class5933.field24411[i] * Class5933.field24411[i] * 2L * Class5933.field24411[i], false);
            double n = Double.MAX_VALUE;
            int n2 = Class5933.field24404;
            if (Class5933.field24411[i] >= 1024L) {
                n2 = Class7640.method24132(1, Class5933.field24404 / 10);
            }
            for (int j = 0; j < n2; ++j) {
                Class7468.method23031(Class5933.field24411[i], Class5933.field24411[i], 2L * Class5933.field24411[i], class6736);
                final long nanoTime2 = System.nanoTime();
                class6735.method20426(class6736);
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
        Class7468.method23058("benchmarkDoubleComplexForwardFFT_3D_input_1D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24411, array, array2);
    }
    
    public static void method17813() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Complex forward FFT 3D (input 3D) of size " + Class5933.field24411[i] + " x " + Class5933.field24411[i] + " x " + Class5933.field24411[i]);
            if (Class5933.field24408) {
                final Class6733 class6733 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
                final double[][][] array3 = new double[(int)Class5933.field24411[i]][(int)Class5933.field24411[i]][2 * (int)Class5933.field24411[i]];
                Class7468.method23034(Class5933.field24411[i], Class5933.field24411[i], 2L * Class5933.field24411[i], array3);
                class6733.method20427(array3);
                Class7468.method23034(Class5933.field24411[i], Class5933.field24411[i], 2L * Class5933.field24411[i], array3);
                class6733.method20427(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class6733 class6734 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][][] array4 = new double[(int)Class5933.field24411[i]][(int)Class5933.field24411[i]][2 * (int)Class5933.field24411[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23034(Class5933.field24411[i], Class5933.field24411[i], 2L * Class5933.field24411[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6734.method20427(array4);
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
        Class7468.method23058("benchmarkDoubleComplexForwardFFT_3D_input_3D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24411, array, array2);
    }
    
    public static void method17814() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Real forward FFT 3D (input 1D) of size " + Class5933.field24411[i] + " x " + Class5933.field24411[i] + " x " + Class5933.field24411[i]);
            if (Class5933.field24408) {
                final Class6733 class6733 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
                final Class17 class6734 = new Class17(Class5933.field24411[i] * Class5933.field24411[i] * 2L * Class5933.field24411[i], false);
                Class7468.method23031(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i], class6734);
                class6733.method20435(class6734);
                Class7468.method23031(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i], class6734);
                class6733.method20435(class6734);
            }
            final long nanoTime = System.nanoTime();
            final Class6733 class6735 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class6736 = new Class17(Class5933.field24411[i] * Class5933.field24411[i] * 2L * Class5933.field24411[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23031(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i], class6736);
                final long nanoTime2 = System.nanoTime();
                class6735.method20435(class6736);
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
        Class7468.method23058("benchmarkDoubleRealForwardFFT_3D_input_1D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24411, array, array2);
    }
    
    public static void method17815() {
        final double[] array = new double[Class5933.field24405];
        final double[] array2 = new double[Class5933.field24405];
        for (int i = 0; i < Class5933.field24405; ++i) {
            System.out.println("Real forward FFT 3D (input 3D) of size " + Class5933.field24411[i] + " x " + Class5933.field24411[i] + " x " + Class5933.field24411[i]);
            if (Class5933.field24408) {
                final Class6733 class6733 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
                final double[][][] array3 = new double[(int)Class5933.field24411[i]][(int)Class5933.field24411[i]][2 * (int)Class5933.field24411[i]];
                Class7468.method23034(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i], array3);
                class6733.method20436(array3);
                Class7468.method23034(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i], array3);
                class6733.method20436(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class6733 class6734 = new Class6733(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][][] array4 = new double[(int)Class5933.field24411[i]][(int)Class5933.field24411[i]][2 * (int)Class5933.field24411[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class5933.field24404; ++j) {
                Class7468.method23034(Class5933.field24411[i], Class5933.field24411[i], Class5933.field24411[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6734.method20436(array4);
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
        Class7468.method23058("benchmarkDoubleRealForwardFFT_3D_input_3D.txt", Class5933.field24403, Class5933.field24404, Class5933.field24408, Class5933.field24412, Class5933.field24411, array, array2);
    }
    
    public static void main(final String[] array) {
        method17805(array);
        method17806();
        method17807();
        method17808();
        method17809();
        method17810();
        method17811();
        method17812();
        method17813();
        method17814();
        method17815();
        System.exit(0);
    }
    
    static {
        Class5933.field24403 = 16;
        Class5933.field24404 = 100;
        Class5933.field24405 = 8;
        Class5933.field24406 = 65536;
        Class5933.field24407 = 65536;
        Class5933.field24408 = true;
        Class5933.field24409 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class5933.field24410 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class5933.field24411 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class5933.field24412 = false;
    }
}
