// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class9046
{
    private static int field38289;
    private static int field38290;
    private static int field38291;
    private static int field38292;
    private static int field38293;
    private static boolean field38294;
    private static long[] field38295;
    private static long[] field38296;
    private static long[] field38297;
    private static boolean field38298;
    
    private Class9046() {
    }
    
    public static void method32532(final String[] array) {
        if (array.length <= 0) {
            System.out.println("Default settings are used.");
        }
        else {
            Class9046.field38289 = Integer.parseInt(array[0]);
            Class9046.field38292 = Integer.parseInt(array[1]);
            Class9046.field38293 = Integer.parseInt(array[2]);
            Class9046.field38290 = Integer.parseInt(array[3]);
            Class9046.field38294 = Boolean.parseBoolean(array[4]);
            Class9046.field38298 = Boolean.parseBoolean(array[5]);
            Class9046.field38291 = Integer.parseInt(array[6]);
            Class9046.field38295 = new long[Class9046.field38291];
            Class9046.field38296 = new long[Class9046.field38291];
            Class9046.field38297 = new long[Class9046.field38291];
            for (int i = 0; i < Class9046.field38291; ++i) {
                Class9046.field38295[i] = Integer.parseInt(array[7 + i]);
            }
            for (int j = 0; j < Class9046.field38291; ++j) {
                Class9046.field38296[j] = Integer.parseInt(array[7 + Class9046.field38291 + j]);
            }
            for (int k = 0; k < Class9046.field38291; ++k) {
                Class9046.field38297[k] = Integer.parseInt(array[7 + Class9046.field38291 + Class9046.field38291 + k]);
            }
        }
        Class8216.method27225(Class9046.field38289);
        Class9133.method33164(Class9046.field38292);
        Class9133.method33165(Class9046.field38293);
        System.out.println("nthred = " + Class9046.field38289);
        System.out.println("threadsBegin2D = " + Class9046.field38292);
        System.out.println("threadsBegin3D = " + Class9046.field38293);
        System.out.println("niter = " + Class9046.field38290);
        System.out.println("doWarmup = " + Class9046.field38294);
        System.out.println("doScaling = " + Class9046.field38298);
        System.out.println("nsize = " + Class9046.field38291);
        System.out.println("sizes1D[] = " + Arrays.toString(Class9046.field38295));
        System.out.println("sizes2D[] = " + Arrays.toString(Class9046.field38296));
        System.out.println("sizes3D[] = " + Arrays.toString(Class9046.field38297));
    }
    
    public static void method32533() {
        final double[] array = new double[Class9046.field38291];
        final double[] array2 = new double[Class9046.field38291];
        for (int i = 0; i < Class9046.field38291; ++i) {
            System.out.println("Forward DHT 1D of size " + Class9046.field38295[i]);
            if (Class9046.field38294) {
                final Class6970 class6970 = new Class6970(Class9046.field38295[i]);
                final double[] array3 = new double[(int)Class9046.field38295[i]];
                Class7468.method23020(Class9046.field38295[i], array3);
                class6970.method21386(array3);
                Class7468.method23020(Class9046.field38295[i], array3);
                class6970.method21386(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class6970 class6971 = new Class6970(Class9046.field38295[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[] array4 = new double[(int)Class9046.field38295[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class9046.field38290; ++j) {
                Class7468.method23020(Class9046.field38295[i], array4);
                final long nanoTime2 = System.nanoTime();
                class6971.method21386(array4);
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
        Class7468.method23058("benchmarkDoubleForwardDHT_1D.txt", Class9046.field38289, Class9046.field38290, Class9046.field38294, Class9046.field38298, Class9046.field38295, array, array2);
    }
    
    public static void method32534() {
        final double[] array = new double[Class9046.field38291];
        final double[] array2 = new double[Class9046.field38291];
        for (int i = 0; i < Class9046.field38291; ++i) {
            System.out.println("Forward DHT 2D (input 1D) of size " + Class9046.field38296[i] + " x " + Class9046.field38296[i]);
            if (Class9046.field38294) {
                final Class8788 class8788 = new Class8788(Class9046.field38296[i], Class9046.field38296[i]);
                final Class17 class8789 = new Class17(Class9046.field38296[i] * Class9046.field38296[i], false);
                Class7468.method23026(Class9046.field38296[i], Class9046.field38296[i], class8789);
                class8788.method30593(class8789);
                Class7468.method23026(Class9046.field38296[i], Class9046.field38296[i], class8789);
                class8788.method30593(class8789);
            }
            final long nanoTime = System.nanoTime();
            final Class8788 class8790 = new Class8788(Class9046.field38296[i], Class9046.field38296[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class8791 = new Class17(Class9046.field38296[i] * Class9046.field38296[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class9046.field38290; ++j) {
                Class7468.method23026(Class9046.field38296[i], Class9046.field38296[i], class8791);
                final long nanoTime2 = System.nanoTime();
                class8790.method30593(class8791);
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
        Class7468.method23058("benchmarkDoubleForwardDHT_2D_input_1D.txt", Class9046.field38289, Class9046.field38290, Class9046.field38294, Class9046.field38298, Class9046.field38296, array, array2);
    }
    
    public static void method32535() {
        final double[] array = new double[Class9046.field38291];
        final double[] array2 = new double[Class9046.field38291];
        for (int i = 0; i < Class9046.field38291; ++i) {
            System.out.println("Forward DHT 2D (input 2D) of size " + Class9046.field38296[i] + " x " + Class9046.field38296[i]);
            if (Class9046.field38294) {
                final Class8788 class8788 = new Class8788(Class9046.field38296[i], Class9046.field38296[i]);
                final double[][] array3 = new double[(int)Class9046.field38296[i]][(int)Class9046.field38296[i]];
                Class7468.method23028(Class9046.field38296[i], Class9046.field38296[i], array3);
                class8788.method30594(array3);
                Class7468.method23028(Class9046.field38296[i], Class9046.field38296[i], array3);
                class8788.method30594(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class8788 class8789 = new Class8788(Class9046.field38296[i], Class9046.field38296[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][] array4 = new double[(int)Class9046.field38296[i]][(int)Class9046.field38296[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class9046.field38290; ++j) {
                Class7468.method23028(Class9046.field38296[i], Class9046.field38296[i], array4);
                final long nanoTime2 = System.nanoTime();
                class8789.method30594(array4);
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
        Class7468.method23058("benchmarkDoubleForwardDHT_2D_input_2D.txt", Class9046.field38289, Class9046.field38290, Class9046.field38294, Class9046.field38298, Class9046.field38296, array, array2);
    }
    
    public static void method32536() {
        final double[] array = new double[Class9046.field38291];
        final double[] array2 = new double[Class9046.field38291];
        for (int i = 0; i < Class9046.field38291; ++i) {
            System.out.println("Forward DHT 3D (input 1D) of size " + Class9046.field38297[i] + " x " + Class9046.field38297[i] + " x " + Class9046.field38297[i]);
            if (Class9046.field38294) {
                final Class5815 class5815 = new Class5815(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i]);
                final Class17 class5816 = new Class17(Class9046.field38297[i] * Class9046.field38297[i] * Class9046.field38297[i], false);
                Class7468.method23031(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i], class5816);
                class5815.method17477(class5816);
                Class7468.method23031(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i], class5816);
                class5815.method17477(class5816);
            }
            final long nanoTime = System.nanoTime();
            final Class5815 class5817 = new Class5815(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final Class17 class5818 = new Class17(Class9046.field38297[i] * Class9046.field38297[i] * Class9046.field38297[i], false);
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class9046.field38290; ++j) {
                Class7468.method23031(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i], class5818);
                final long nanoTime2 = System.nanoTime();
                class5817.method17477(class5818);
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
        Class7468.method23058("benchmarkDoubleForwardDHT_3D_input_1D.txt", Class9046.field38289, Class9046.field38290, Class9046.field38294, Class9046.field38298, Class9046.field38297, array, array2);
    }
    
    public static void method32537() {
        final double[] array = new double[Class9046.field38291];
        final double[] array2 = new double[Class9046.field38291];
        for (int i = 0; i < Class9046.field38291; ++i) {
            System.out.println("Forward DHT 3D (input 3D) of size " + Class9046.field38297[i] + " x " + Class9046.field38297[i] + " x " + Class9046.field38297[i]);
            if (Class9046.field38294) {
                final Class5815 class5815 = new Class5815(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i]);
                final double[][][] array3 = new double[(int)Class9046.field38297[i]][(int)Class9046.field38297[i]][(int)Class9046.field38297[i]];
                Class7468.method23034(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i], array3);
                class5815.method17478(array3);
                Class7468.method23034(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i], array3);
                class5815.method17478(array3);
            }
            final long nanoTime = System.nanoTime();
            final Class5815 class5816 = new Class5815(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i]);
            array2[i] = (System.nanoTime() - nanoTime) / 1000000.0;
            final double[][][] array4 = new double[(int)Class9046.field38297[i]][(int)Class9046.field38297[i]][(int)Class9046.field38297[i]];
            double n = Double.MAX_VALUE;
            for (int j = 0; j < Class9046.field38290; ++j) {
                Class7468.method23034(Class9046.field38297[i], Class9046.field38297[i], Class9046.field38297[i], array4);
                final long nanoTime2 = System.nanoTime();
                class5816.method17478(array4);
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
        Class7468.method23058("benchmarkDoubleForwardDHT_3D_input_3D.txt", Class9046.field38289, Class9046.field38290, Class9046.field38294, Class9046.field38298, Class9046.field38297, array, array2);
    }
    
    public static void main(final String[] array) {
        method32532(array);
        method32533();
        method32534();
        method32535();
        method32536();
        method32537();
        System.exit(0);
    }
    
    static {
        Class9046.field38289 = 8;
        Class9046.field38290 = 200;
        Class9046.field38291 = 16;
        Class9046.field38292 = 65636;
        Class9046.field38293 = 65636;
        Class9046.field38294 = true;
        Class9046.field38295 = new long[] { 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L };
        Class9046.field38296 = new long[] { 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L };
        Class9046.field38297 = new long[] { 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L };
        Class9046.field38298 = false;
    }
}
