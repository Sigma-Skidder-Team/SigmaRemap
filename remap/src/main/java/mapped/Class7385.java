// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class7385
{
    private static int field28444;
    private static int field28445;
    private static int field28446;
    private static int field28447;
    private static int field28448;
    private static boolean field28449;
    private static long[] field28450;
    private static long[] field28451;
    private static long[] field28452;
    private static boolean field28453;
    
    private Class7385() {
    }
    
    public static void method22678(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class7385.field28444 = Integer.parseInt(array[0]);
            Class7385.field28447 = Integer.parseInt(array[1]);
            Class7385.field28448 = Integer.parseInt(array[2]);
            Class7385.field28445 = Integer.parseInt(array[3]);
            Class7385.field28449 = Boolean.parseBoolean(array[4]);
            Class7385.field28453 = Boolean.parseBoolean(array[5]);
            Class7385.field28446 = Integer.parseInt(array[6]);
            Class7385.field28450 = new long[Class7385.field28446];
            Class7385.field28451 = new long[Class7385.field28446];
            Class7385.field28452 = new long[Class7385.field28446];
            for (int i = 0; i < Class7385.field28446; ++i) {
                Class7385.field28450[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class7385.field28446; ++j) {
                Class7385.field28451[j] = Integer.parseInt(array[7 + Class7385.field28446 + j]);
            }
            for (int k = 0; k < Class7385.field28446; ++k) {
                Class7385.field28452[k] = Integer.parseInt(array[7 + Class7385.field28446 + Class7385.field28446 + k]);
            }
        }
        Class8216.method27225(Class7385.field28444);
        Class9133.method33164(Class7385.field28447);
        Class9133.method33165(Class7385.field28448);
        System.out.println("nthred = " + Class7385.field28444);
        System.out.println("threadsBegin2D = " + Class7385.field28447);
        System.out.println("threadsBegin3D = " + Class7385.field28448);
        System.out.println("niter = " + Class7385.field28445);
        System.out.println("doWarmup = " + Class7385.field28449);
        System.out.println("doScaling = " + Class7385.field28453);
        System.out.println("nsize = " + Class7385.field28446);
        System.out.println("sizes1D[] = " + Arrays.toString(Class7385.field28450));
        System.out.println("sizes2D[] = " + Arrays.toString(Class7385.field28451));
        System.out.println("sizes3D[] = " + Arrays.toString(Class7385.field28452));
    }
    
    public static void method22679() {
        final double[] array = new double[Class7385.field28446];
        final double[] array2 = new double[Class7385.field28446];
        for (int i = 0; i < Class7385.field28446; ++i) {
            System.out.println("Forward DST 1D of size " + Class7385.field28450[i]);
            if (Class7385.field28449) {
                final Class8806 class8806 = new Class8806(Class7385.field28450[i]);
                final double[] array3 = new double[(int)Class7385.field28450[i]];
                Class7468.method23020(Class7385.field28450[i], array3);
                class8806.method30721(array3, Class7385.field28453);
                Class7468.method23020(Class7385.field28450[i], array3);
                class8806.method30721(array3, Class7385.field28453);
            }
            final long nanoTime = System.nanoTime();
            final Class8806 class8807 = new Class8806(Class7385.field28450[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[] array4 = new double[(int)Class7385.field28450[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class7385.field28445; ++j) {
                Class7468.method23020(Class7385.field28450[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8807.method30721(array4, Class7385.field28453);
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
        Class7468.method23058("benchmarkDoubleForwardDST_1D.txt", Class7385.field28444, Class7385.field28445, Class7385.field28449, Class7385.field28453, Class7385.field28450, array, array2);
    }
    
    public static void method22680() {
        final double[] array = new double[Class7385.field28446];
        final double[] array2 = new double[Class7385.field28446];
        for (int i = 0; i < Class7385.field28446; ++i) {
            System.out.println("Forward DST 2D (input 1D) of size " + Class7385.field28451[i] + " x " + Class7385.field28451[i]);
            if (Class7385.field28449) {
                final Class4406 class4406 = new Class4406(Class7385.field28451[i], Class7385.field28451[i]);
                final Class17 class4407 = new Class17(Class7385.field28451[i] * Class7385.field28451[i], false);
                Class7468.method23026(Class7385.field28451[i], Class7385.field28451[i], class4407);
                class4406.method13318(class4407, Class7385.field28453);
                Class7468.method23026(Class7385.field28451[i], Class7385.field28451[i], class4407);
                class4406.method13318(class4407, Class7385.field28453);
            }
            final long nanoTime = System.nanoTime();
            final Class4406 class4408 = new Class4406(Class7385.field28451[i], Class7385.field28451[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class4409 = new Class17(Class7385.field28451[i] * Class7385.field28451[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class7385.field28445; ++j) {
                Class7468.method23026(Class7385.field28451[i], Class7385.field28451[i], class4409);
                final long nanoTime2 = System.nanoTime();
                class4408.method13318(class4409, Class7385.field28453);
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
        Class7468.method23058("benchmarkDoubleForwardDST_2D_input_1D.txt", Class7385.field28444, Class7385.field28445, Class7385.field28449, Class7385.field28453, Class7385.field28451, array, array2);
    }
    
    public static void method22681() {
        final double[] array = new double[Class7385.field28446];
        final double[] array2 = new double[Class7385.field28446];
        for (int i = 0; i < Class7385.field28446; ++i) {
            System.out.println("Forward DST 2D (input 2D) of size " + Class7385.field28451[i] + " x " + Class7385.field28451[i]);
            if (Class7385.field28449) {
                final Class4406 class4406 = new Class4406(Class7385.field28451[i], Class7385.field28451[i]);
                final double[][] array3 = new double[(int)Class7385.field28451[i]][(int)Class7385.field28451[i]];
                Class7468.method23028(Class7385.field28451[i], Class7385.field28451[i], array3);
                class4406.method13319(array3, Class7385.field28453);
                Class7468.method23028(Class7385.field28451[i], Class7385.field28451[i], array3);
                class4406.method13319(array3, Class7385.field28453);
            }
            final long nanoTime = System.nanoTime();
            final Class4406 class4407 = new Class4406(Class7385.field28451[i], Class7385.field28451[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][] array4 = new double[(int)Class7385.field28451[i]][(int)Class7385.field28451[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class7385.field28445; ++j) {
                Class7468.method23028(Class7385.field28451[i], Class7385.field28451[i], array4);
                final long nanoTime2 = System.nanoTime();
                class4407.method13319(array4, Class7385.field28453);
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
        Class7468.method23058("benchmarkDoubleForwardDST_2D_input_2D.txt", Class7385.field28444, Class7385.field28445, Class7385.field28449, Class7385.field28453, Class7385.field28451, array, array2);
    }
    
    public static void method22682() {
        final double[] array = new double[Class7385.field28446];
        final double[] array2 = new double[Class7385.field28446];
        for (int i = 0; i < Class7385.field28446; ++i) {
            System.out.println("Forward DST 3D (input 1D) of size " + Class7385.field28452[i] + " x " + Class7385.field28452[i] + " x " + Class7385.field28452[i]);
            if (Class7385.field28449) {
                final Class7568 class7568 = new Class7568(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i]);
                final Class17 class7569 = new Class17(Class7385.field28452[i] * Class7385.field28452[i] * Class7385.field28452[i], false);
                Class7468.method23031(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i], class7569);
                class7568.method23759(class7569, Class7385.field28453);
                Class7468.method23031(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i], class7569);
                class7568.method23759(class7569, Class7385.field28453);
            }
            final long nanoTime = System.nanoTime();
            final Class7568 class7570 = new Class7568(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class7571 = new Class17(Class7385.field28452[i] * Class7385.field28452[i] * Class7385.field28452[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class7385.field28445; ++j) {
                Class7468.method23031(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i], class7571);
                final long nanoTime2 = System.nanoTime();
                class7570.method23759(class7571, Class7385.field28453);
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
        Class7468.method23058("benchmarkDoubleForwardDST_3D_input_1D.txt", Class7385.field28444, Class7385.field28445, Class7385.field28449, Class7385.field28453, Class7385.field28452, array, array2);
    }
    
    public static void method22683() {
        final double[] array = new double[Class7385.field28446];
        final double[] array2 = new double[Class7385.field28446];
        for (int i = 0; i < Class7385.field28446; ++i) {
            System.out.println("Forward DST 3D (input 3D) of size " + Class7385.field28452[i] + " x " + Class7385.field28452[i] + " x " + Class7385.field28452[i]);
            if (Class7385.field28449) {
                final Class7568 class7568 = new Class7568(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i]);
                final double[][][] array3 = new double[(int)Class7385.field28452[i]][(int)Class7385.field28452[i]][(int)Class7385.field28452[i]];
                Class7468.method23034(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i], array3);
                class7568.method23760(array3, Class7385.field28453);
                Class7468.method23034(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i], array3);
                class7568.method23760(array3, Class7385.field28453);
            }
            final long nanoTime = System.nanoTime();
            final Class7568 class7569 = new Class7568(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][][] array4 = new double[(int)Class7385.field28452[i]][(int)Class7385.field28452[i]][(int)Class7385.field28452[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class7385.field28445; ++j) {
                Class7468.method23034(Class7385.field28452[i], Class7385.field28452[i], Class7385.field28452[i], array4);
                final long nanoTime2 = System.nanoTime();
                class7569.method23760(array4, Class7385.field28453);
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
        Class7468.method23058("benchmarkDoubleForwardDST_3D_input_3D.txt", Class7385.field28444, Class7385.field28445, Class7385.field28449, Class7385.field28453, Class7385.field28452, array, array2);
    }
    
    public static void main(final String[] array) {
        method22678(array);
        method22679();
        method22680();
        method22681();
        method22682();
        method22683();
        System.exit(0);
    }
    
    static {
        Class7385.field28444 = 8;
        Class7385.field28445 = 200;
        Class7385.field28446 = 16;
        Class7385.field28447 = 65636;
        Class7385.field28448 = 65636;
        Class7385.field28449 = true;
        Class7385.field28450 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class7385.field28451 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class7385.field28452 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class7385.field28453 = false;
    }
}
