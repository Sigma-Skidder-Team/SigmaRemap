// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Class7468
{
    private static final String field28842 = "%.4f";
    
    private Class7468() {
    }
    
    public static double method23010(final float n, final float n2) {
        final double n3 = n - n2;
        return Class7640.method24071(n3 * n3);
    }
    
    public static double method23011(final float[] array, final float[] array2) {
        if (array.length == array2.length) {
            double n = 0.0;
            for (int i = 0; i < array.length; ++i) {
                final double n2 = array[i] - array2[i];
                n += n2 * n2;
            }
            return Class7640.method24071(n / array.length);
        }
        throw new IllegalArgumentException("Arrays are not the same size");
    }
    
    public static double method23012(final Class22 class22, final Class22 class23) {
        if (class22.method118() == class23.method118()) {
            double n = 0.0;
            for (long n2 = 0L; n2 < class22.method118(); ++n2) {
                final double n3 = class22.method135(n2) - class23.method135(n2);
                n += n3 * n3;
            }
            return Class7640.method24071(n / class22.method118());
        }
        throw new IllegalArgumentException("Arrays are not the same size.");
    }
    
    public static double method23013(final float[][] array, final float[][] array2) {
        if (array.length == array2.length && array[0].length == array2[0].length) {
            double n = 0.0;
            for (int i = 0; i < array.length; ++i) {
                for (int j = 0; j < array[0].length; ++j) {
                    final double n2 = array[i][j] - array2[i][j];
                    n += n2 * n2;
                }
            }
            return Class7640.method24071(n / (array.length * array[0].length));
        }
        throw new IllegalArgumentException("Arrays are not the same size");
    }
    
    public static double method23014(final float[][][] array, final float[][][] array2) {
        if (array.length == array2.length) {
            if (array[0].length == array2[0].length) {
                if (array[0][0].length == array2[0][0].length) {
                    double n = 0.0;
                    for (int i = 0; i < array.length; ++i) {
                        for (int j = 0; j < array[0].length; ++j) {
                            for (int k = 0; k < array[0][0].length; ++k) {
                                final double n2 = array[i][j][k] - array2[i][j][k];
                                n += n2 * n2;
                            }
                        }
                    }
                    return Class7640.method24071(n / (array.length * array[0].length * array[0][0].length));
                }
            }
        }
        throw new IllegalArgumentException("Arrays are not the same size");
    }
    
    public static double method23015(final double n, final double n2) {
        final double n3 = n - n2;
        return Class7640.method24071(n3 * n3);
    }
    
    public static double method23016(final double[] array, final double[] array2) {
        if (array.length == array2.length) {
            double n = 0.0;
            for (int i = 0; i < array.length; ++i) {
                final double n2 = array[i] - array2[i];
                n += n2 * n2;
            }
            return Class7640.method24071(n / array.length);
        }
        throw new IllegalArgumentException("Arrays are not the same size");
    }
    
    public static double method23017(final Class17 class17, final Class17 class18) {
        if (class17.method118() == class18.method118()) {
            double n = 0.0;
            for (long n2 = 0L; n2 < class17.method118(); ++n2) {
                final double n3 = class17.method137(n2) - class18.method137(n2);
                n += n3 * n3;
            }
            return Class7640.method24071(n / class17.method118());
        }
        throw new IllegalArgumentException("Arrays are not the same size.");
    }
    
    public static double method23018(final double[][] array, final double[][] array2) {
        if (array.length == array2.length && array[0].length == array2[0].length) {
            double n = 0.0;
            for (int i = 0; i < array.length; ++i) {
                for (int j = 0; j < array[0].length; ++j) {
                    final double n2 = array[i][j] - array2[i][j];
                    n += n2 * n2;
                }
            }
            return Class7640.method24071(n / (array.length * array[0].length));
        }
        throw new IllegalArgumentException("Arrays are not the same size");
    }
    
    public static double method23019(final double[][][] array, final double[][][] array2) {
        if (array.length == array2.length) {
            if (array[0].length == array2[0].length) {
                if (array[0][0].length == array2[0][0].length) {
                    double n = 0.0;
                    for (int i = 0; i < array.length; ++i) {
                        for (int j = 0; j < array[0].length; ++j) {
                            for (int k = 0; k < array[0][0].length; ++k) {
                                final double n2 = array[i][j][k] - array2[i][j][k];
                                n += n2 * n2;
                            }
                        }
                    }
                    return Class7640.method24071(n / (array.length * array[0].length * array[0][0].length));
                }
            }
        }
        throw new IllegalArgumentException("Arrays are not the same size");
    }
    
    public static void method23020(final long n, final double[] array) {
        final Random random = new Random(2L);
        for (int n2 = 0; n2 < n; ++n2) {
            array[n2] = random.nextDouble();
        }
    }
    
    public static void method23021(final long n, final Class17 class17) {
        final Random random = new Random(2L);
        for (long n2 = 0L; n2 < n; ++n2) {
            class17.method171(n2, random.nextDouble());
        }
    }
    
    public static void method23022(final long n, final Class22 class22) {
        final Random random = new Random(2L);
        for (long n2 = 0L; n2 < n; ++n2) {
            class22.method171(n2, random.nextFloat());
        }
    }
    
    public static void method23023(final long n, final float[] array) {
        final Random random = new Random(2L);
        for (int n2 = 0; n2 < n; ++n2) {
            array[n2] = random.nextFloat();
        }
    }
    
    public static void method23024(final long n, final long n2, final double[] array) {
        final Random random = new Random(2L);
        for (int n3 = 0; n3 < n; ++n3) {
            for (int n4 = 0; n4 < n2; ++n4) {
                array[(int)(n3 * n2 + n4)] = random.nextDouble();
            }
        }
    }
    
    public static void method23025(final long n, final long n2, final Class22 class22) {
        final Random random = new Random(2L);
        for (long n3 = 0L; n3 < n; ++n3) {
            for (long n4 = 0L; n4 < n2; ++n4) {
                class22.method169(n3 * n2 + n4, random.nextFloat());
            }
        }
    }
    
    public static void method23026(final long n, final long n2, final Class17 class17) {
        final Random random = new Random(2L);
        for (long n3 = 0L; n3 < n; ++n3) {
            for (long n4 = 0L; n4 < n2; ++n4) {
                class17.method171(n3 * n2 + n4, random.nextDouble());
            }
        }
    }
    
    public static void method23027(final long n, final long n2, final float[] array) {
        final Random random = new Random(2L);
        for (int n3 = 0; n3 < n; ++n3) {
            for (int n4 = 0; n4 < n2; ++n4) {
                array[(int)(n3 * n2 + n4)] = random.nextFloat();
            }
        }
    }
    
    public static void method23028(final long n, final long n2, final double[][] array) {
        final Random random = new Random(2L);
        for (int n3 = 0; n3 < n; ++n3) {
            for (int n4 = 0; n4 < n2; ++n4) {
                array[n3][n4] = random.nextDouble();
            }
        }
    }
    
    public static void method23029(final long n, final long n2, final float[][] array) {
        final Random random = new Random(2L);
        for (int n3 = 0; n3 < n; ++n3) {
            for (int n4 = 0; n4 < n2; ++n4) {
                array[n3][n4] = random.nextFloat();
            }
        }
    }
    
    public static void method23030(final long n, final long n2, final long n3, final double[] array) {
        final Random random = new Random(2L);
        final long n4 = n2 * n3;
        for (int n5 = 0; n5 < n; ++n5) {
            for (int n6 = 0; n6 < n2; ++n6) {
                for (int n7 = 0; n7 < n3; ++n7) {
                    array[(int)(n5 * n4 + n6 * n3 + n7)] = random.nextDouble();
                }
            }
        }
    }
    
    public static void method23031(final long n, final long n2, final long n3, final Class17 class17) {
        final Random random = new Random(2L);
        final long n4 = n2 * n3;
        for (long n5 = 0L; n5 < n; ++n5) {
            for (long n6 = 0L; n6 < n2; ++n6) {
                for (long n7 = 0L; n7 < n3; ++n7) {
                    class17.method171(n5 * n4 + n6 * n3 + n7, random.nextDouble());
                }
            }
        }
    }
    
    public static void method23032(final long n, final long n2, final long n3, final Class22 class22) {
        final Random random = new Random(2L);
        final long n4 = n2 * n3;
        for (long n5 = 0L; n5 < n; ++n5) {
            for (long n6 = 0L; n6 < n2; ++n6) {
                for (long n7 = 0L; n7 < n3; ++n7) {
                    class22.method171(n5 * n4 + n6 * n3 + n7, random.nextFloat());
                }
            }
        }
    }
    
    public static void method23033(final long n, final long n2, final long n3, final float[] array) {
        final Random random = new Random(2L);
        final long n4 = n2 * n3;
        for (int n5 = 0; n5 < n; ++n5) {
            for (int n6 = 0; n6 < n2; ++n6) {
                for (int n7 = 0; n7 < n3; ++n7) {
                    array[(int)(n5 * n4 + n6 * n3 + n7)] = random.nextFloat();
                }
            }
        }
    }
    
    public static void method23034(final long n, final long n2, final long n3, final double[][][] array) {
        final Random random = new Random(2L);
        for (int n4 = 0; n4 < n; ++n4) {
            for (int n5 = 0; n5 < n2; ++n5) {
                for (int n6 = 0; n6 < n3; ++n6) {
                    array[n4][n5][n6] = random.nextDouble();
                }
            }
        }
    }
    
    public static void method23035(final long n, final long n2, final long n3, final float[][][] array) {
        final Random random = new Random(2L);
        for (int n4 = 0; n4 < n; ++n4) {
            for (int n5 = 0; n5 < n2; ++n5) {
                for (int n6 = 0; n6 < n3; ++n6) {
                    array[n4][n5][n6] = random.nextFloat();
                }
            }
        }
    }
    
    public static void method23036(final double[] array, final String x) {
        System.out.println(x);
        System.out.println("-------------------");
        for (int i = 0; i < array.length; i += 2) {
            if (array[i + 1] != 0.0) {
                if (array[i] != 0.0) {
                    if (array[i + 1] >= 0.0) {
                        System.out.println(String.format("%.4f", array[i]) + " + " + String.format("%.4f", array[i + 1]) + "i");
                    }
                    else {
                        System.out.println(String.format("%.4f", array[i]) + " - " + String.format("%.4f", -array[i + 1]) + "i");
                    }
                }
                else {
                    System.out.println(String.format("%.4f", array[i + 1]) + "i");
                }
            }
            else {
                System.out.println(String.format("%.4f", array[i]));
            }
        }
        System.out.println();
    }
    
    public static void method23037(final int i, final int j, final double[] array, final String str) {
        final StringBuilder sb = new StringBuilder(String.format(str + ": complex array 2D: %d rows, %d columns\n\n", i, j));
        for (int k = 0; k < i; ++k) {
            for (int l = 0; l < 2 * j; l += 2) {
                if (array[k * 2 * j + l + 1] != 0.0) {
                    if (array[k * 2 * j + l] != 0.0) {
                        if (array[k * 2 * j + l + 1] >= 0.0) {
                            sb.append(String.format("%.4f + %.4fi\t", array[k * 2 * j + l], array[k * 2 * j + l + 1]));
                        }
                        else {
                            sb.append(String.format("%.4f - %.4fi\t", array[k * 2 * j + l], -array[k * 2 * j + l + 1]));
                        }
                    }
                    else {
                        sb.append(String.format("%.4fi\t", array[k * 2 * j + l + 1]));
                    }
                }
                else {
                    sb.append(String.format("%.4f\t", array[k * 2 * j + l]));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    
    public static void method23038(final double[][] array, final String str) {
        final int length = array.length;
        final int length2 = array[0].length;
        final StringBuilder sb = new StringBuilder(String.format(str + ": complex array 2D: %d rows, %d columns\n\n", length, length2));
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length2; j += 2) {
                if (array[i][j + 1] != 0.0) {
                    if (array[i][j] != 0.0) {
                        if (array[i][j + 1] >= 0.0) {
                            sb.append(String.format("%.4f + %.4fi\t", array[i][j], array[i][j + 1]));
                        }
                        else {
                            sb.append(String.format("%.4f - %.4fi\t", array[i][j], -array[i][j + 1]));
                        }
                    }
                    else {
                        sb.append(String.format("%.4fi\t", array[i][j + 1]));
                    }
                }
                else {
                    sb.append(String.format("%.4f\t", array[i][j]));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    
    public static void method23039(final int n, final int n2, final int n3, final double[] array, final String x) {
        final int n4 = n2 * 2 * n3;
        final int n5 = 2 * n3;
        System.out.println(x);
        System.out.println("-------------------");
        for (int i = 0; i < 2 * n3; i += 2) {
            System.out.println("(:,:," + i / 2 + ")=\n");
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n2; ++k) {
                    if (array[j * n4 + k * n5 + i + 1] != 0.0) {
                        if (array[j * n4 + k * n5 + i] != 0.0) {
                            if (array[j * n4 + k * n5 + i + 1] >= 0.0) {
                                System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i]) + " + " + String.format("%.4f", array[j * n4 + k * n5 + i + 1]) + "i\t");
                            }
                            else {
                                System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i]) + " - " + String.format("%.4f", -array[j * n4 + k * n5 + i + 1]) + "i\t");
                            }
                        }
                        else {
                            System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i + 1]) + "i\t");
                        }
                    }
                    else {
                        System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i]) + "\t");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public static void method23040(final double[][][] array, final String x) {
        System.out.println(x);
        System.out.println("-------------------");
        final int length = array.length;
        final int length2 = array[0].length;
        for (int length3 = array[0][0].length, i = 0; i < length3; i += 2) {
            System.out.println("(:,:," + i / 2 + ")=\n");
            for (int j = 0; j < length; ++j) {
                for (int k = 0; k < length2; ++k) {
                    if (array[j][k][i + 1] != 0.0) {
                        if (array[j][k][i] != 0.0) {
                            if (array[j][k][i + 1] >= 0.0) {
                                System.out.print(String.format("%.4f", array[j][k][i]) + " + " + String.format("%.4f", array[j][k][i + 1]) + "i\t");
                            }
                            else {
                                System.out.print(String.format("%.4f", array[j][k][i]) + " - " + String.format("%.4f", -array[j][k][i + 1]) + "i\t");
                            }
                        }
                        else {
                            System.out.print(String.format("%.4f", array[j][k][i + 1]) + "i\t");
                        }
                    }
                    else {
                        System.out.print(String.format("%.4f", array[j][k][i]) + "\t");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public static void method23041(final int n, final int n2, final int n3, final float[] array, final String x) {
        final int n4 = n2 * 2 * n3;
        final int n5 = 2 * n3;
        System.out.println(x);
        System.out.println("-------------------");
        for (int i = 0; i < 2 * n3; i += 2) {
            System.out.println("(:,:," + i / 2 + ")=\n");
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n2; ++k) {
                    if (array[j * n4 + k * n5 + i + 1] != 0.0f) {
                        if (array[j * n4 + k * n5 + i] != 0.0f) {
                            if (array[j * n4 + k * n5 + i + 1] >= 0.0f) {
                                System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i]) + " + " + String.format("%.4f", array[j * n4 + k * n5 + i + 1]) + "i\t");
                            }
                            else {
                                System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i]) + " - " + String.format("%.4f", -array[j * n4 + k * n5 + i + 1]) + "i\t");
                            }
                        }
                        else {
                            System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i + 1]) + "i\t");
                        }
                    }
                    else {
                        System.out.print(String.format("%.4f", array[j * n4 + k * n5 + i]) + "\t");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public static void method23042(final double[] array, final String x) {
        System.out.println(x);
        System.out.println("-------------------");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(String.format("%.4f", array[i]));
        }
        System.out.println();
    }
    
    public static void method23043(final int n, final int n2, final double[] array, final String x) {
        System.out.println(x);
        System.out.println("-------------------");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                if (Class7640.method24116(array[i * n2 + j]) >= 5.0E-5) {
                    System.out.print(String.format("%.4f", array[i * n2 + j]) + "\t");
                }
                else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void method23044(final int n, final int n2, final int n3, final double[] array, final String x) {
        final int n4 = n2 * n3;
        System.out.println(x);
        System.out.println("-------------------");
        for (int i = 0; i < n3; ++i) {
            System.out.println();
            System.out.println("(:,:," + i + ")=\n");
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n2; ++k) {
                    if (Class7640.method24116(array[j * n4 + k * n3 + i]) > 5.0E-5) {
                        System.out.print(String.format("%.4f", array[j * n4 + k * n3 + i]) + "\t");
                    }
                    else {
                        System.out.print("0\t");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static void method23045(final double[][][] array, final String x) {
        System.out.println(x);
        System.out.println("-------------------");
        final int length = array.length;
        final int length2 = array[0].length;
        for (int length3 = array[0][0].length, i = 0; i < length3; ++i) {
            System.out.println();
            System.out.println("(:,:," + i + ")=\n");
            for (int j = 0; j < length; ++j) {
                for (int k = 0; k < length2; ++k) {
                    if (Class7640.method24116(array[j][k][i]) > 5.0E-5) {
                        System.out.print(String.format("%.4f", array[j][k][i]) + "\t");
                    }
                    else {
                        System.out.print("0\t");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static void method23046(final double[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < array.length; i += 2) {
                if (array[i + 1] == 0.0) {
                    bufferedWriter.write(String.format("%.4f", array[i]));
                    bufferedWriter.newLine();
                }
                else if (array[i] == 0.0) {
                    bufferedWriter.write(String.format("%.4f", array[i + 1]) + "i");
                    bufferedWriter.newLine();
                }
                else if (array[i + 1] < 0.0) {
                    bufferedWriter.write(String.format("%.4f", array[i]) + " - " + String.format("%.4f", -array[i + 1]) + "i");
                    bufferedWriter.newLine();
                }
                else {
                    bufferedWriter.write(String.format("%.4f", array[i]) + " + " + String.format("%.4f", array[i + 1]) + "i");
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23047(final float[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < array.length; i += 2) {
                if (array[i + 1] == 0.0f) {
                    bufferedWriter.write(String.format("%.4f", array[i]));
                    bufferedWriter.newLine();
                }
                else if (array[i] == 0.0f) {
                    bufferedWriter.write(String.format("%.4f", array[i + 1]) + "i");
                    bufferedWriter.newLine();
                }
                else if (array[i + 1] < 0.0f) {
                    bufferedWriter.write(String.format("%.4f", array[i]) + " - " + String.format("%.4f", -array[i + 1]) + "i");
                    bufferedWriter.newLine();
                }
                else {
                    bufferedWriter.write(String.format("%.4f", array[i]) + " + " + String.format("%.4f", array[i + 1]) + "i");
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23048(final int n, final int n2, final double[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 2 * n2; j += 2) {
                    if (Class7640.method24116(array[i * 2 * n2 + j]) < 5.0E-5 && Class7640.method24116(array[i * 2 * n2 + j + 1]) < 5.0E-5) {
                        if (array[i * 2 * n2 + j + 1] >= 0.0) {
                            bufferedWriter.write("0 + 0i\t");
                        }
                        else {
                            bufferedWriter.write("0 - 0i\t");
                        }
                    }
                    else if (Class7640.method24116(array[i * 2 * n2 + j + 1]) < 5.0E-5) {
                        if (array[i * 2 * n2 + j + 1] >= 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " + 0i\t");
                        }
                        else {
                            bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " - 0i\t");
                        }
                    }
                    else if (Class7640.method24116(array[i * 2 * n2 + j]) < 5.0E-5) {
                        if (array[i * 2 * n2 + j + 1] >= 0.0) {
                            bufferedWriter.write("0 + " + String.format("%.4f", array[i * 2 * n2 + j + 1]) + "i\t");
                        }
                        else {
                            bufferedWriter.write("0 - " + String.format("%.4f", -array[i * 2 * n2 + j + 1]) + "i\t");
                        }
                    }
                    else if (array[i * 2 * n2 + j + 1] < 0.0) {
                        bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " - " + String.format("%.4f", -array[i * 2 * n2 + j + 1]) + "i\t");
                    }
                    else {
                        bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " + " + String.format("%.4f", array[i * 2 * n2 + j + 1]) + "i\t");
                    }
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23049(final int n, final int n2, final float[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 2 * n2; j += 2) {
                    if (Class7640.method24115(array[i * 2 * n2 + j]) < 5.0E-5 && Class7640.method24115(array[i * 2 * n2 + j + 1]) < 5.0E-5) {
                        if (array[i * 2 * n2 + j + 1] >= 0.0) {
                            bufferedWriter.write("0 + 0i\t");
                        }
                        else {
                            bufferedWriter.write("0 - 0i\t");
                        }
                    }
                    else if (Class7640.method24115(array[i * 2 * n2 + j + 1]) < 5.0E-5) {
                        if (array[i * 2 * n2 + j + 1] >= 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " + 0i\t");
                        }
                        else {
                            bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " - 0i\t");
                        }
                    }
                    else if (Class7640.method24115(array[i * 2 * n2 + j]) < 5.0E-5) {
                        if (array[i * 2 * n2 + j + 1] >= 0.0) {
                            bufferedWriter.write("0 + " + String.format("%.4f", array[i * 2 * n2 + j + 1]) + "i\t");
                        }
                        else {
                            bufferedWriter.write("0 - " + String.format("%.4f", -array[i * 2 * n2 + j + 1]) + "i\t");
                        }
                    }
                    else if (array[i * 2 * n2 + j + 1] < 0.0f) {
                        bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " - " + String.format("%.4f", -array[i * 2 * n2 + j + 1]) + "i\t");
                    }
                    else {
                        bufferedWriter.write(String.format("%.4f", array[i * 2 * n2 + j]) + " + " + String.format("%.4f", array[i * 2 * n2 + j + 1]) + "i\t");
                    }
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23050(final double[][] array, final String fileName) {
        final int length = array.length;
        final int length2 = array[0].length;
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < length; ++i) {
                for (int j = 0; j < 2 * length2; j += 2) {
                    if (Class7640.method24116(array[i][j]) < 5.0E-5 && Class7640.method24116(array[i][j + 1]) < 5.0E-5) {
                        if (array[i][j + 1] >= 0.0) {
                            bufferedWriter.write("0 + 0i\t");
                        }
                        else {
                            bufferedWriter.write("0 - 0i\t");
                        }
                    }
                    else if (Class7640.method24116(array[i][j + 1]) < 5.0E-5) {
                        if (array[i][j + 1] >= 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[i][j]) + " + 0i\t");
                        }
                        else {
                            bufferedWriter.write(String.format("%.4f", array[i][j]) + " - 0i\t");
                        }
                    }
                    else if (Class7640.method24116(array[i][j]) < 5.0E-5) {
                        if (array[i][j + 1] >= 0.0) {
                            bufferedWriter.write("0 + " + String.format("%.4f", array[i][j + 1]) + "i\t");
                        }
                        else {
                            bufferedWriter.write("0 - " + String.format("%.4f", -array[i][j + 1]) + "i\t");
                        }
                    }
                    else if (array[i][j + 1] < 0.0) {
                        bufferedWriter.write(String.format("%.4f", array[i][j]) + " - " + String.format("%.4f", -array[i][j + 1]) + "i\t");
                    }
                    else {
                        bufferedWriter.write(String.format("%.4f", array[i][j]) + " + " + String.format("%.4f", array[i][j + 1]) + "i\t");
                    }
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23051(final int n, final int n2, final int n3, final double[] array, final String fileName) {
        final int n4 = n2 * n3 * 2;
        final int n5 = n3 * 2;
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < 2 * n3; i += 2) {
                bufferedWriter.newLine();
                bufferedWriter.write("(:,:," + i / 2 + ")=");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                for (int j = 0; j < n; ++j) {
                    for (int k = 0; k < n2; ++k) {
                        if (array[j * n4 + k * n5 + i + 1] == 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[j * n4 + k * n5 + i]) + "\t");
                        }
                        else if (array[j * n4 + k * n5 + i] == 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[j * n4 + k * n5 + i + 1]) + "i\t");
                        }
                        else if (array[j * n4 + k * n5 + i + 1] < 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[j * n4 + k * n5 + i]) + " - " + String.format("%.4f", -array[j * n4 + k * n5 + i + 1]) + "i\t");
                        }
                        else {
                            bufferedWriter.write(String.format("%.4f", array[j * n4 + k * n5 + i]) + " + " + String.format("%.4f", array[j * n4 + k * n5 + i + 1]) + "i\t");
                        }
                    }
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23052(final double[][][] array, final String fileName) {
        final int length = array.length;
        final int length2 = array[0].length;
        final int length3 = array[0][0].length;
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < 2 * length3; i += 2) {
                bufferedWriter.newLine();
                bufferedWriter.write("(:,:," + i / 2 + ")=");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                for (int j = 0; j < length; ++j) {
                    for (int k = 0; k < length2; ++k) {
                        if (array[j][k][i + 1] == 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[j][k][i]) + "\t");
                        }
                        else if (array[j][k][i] == 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[j][k][i + 1]) + "i\t");
                        }
                        else if (array[j][k][i + 1] < 0.0) {
                            bufferedWriter.write(String.format("%.4f", array[j][k][i]) + " - " + String.format("%.4f", -array[j][k][i + 1]) + "i\t");
                        }
                        else {
                            bufferedWriter.write(String.format("%.4f", array[j][k][i]) + " + " + String.format("%.4f", array[j][k][i + 1]) + "i\t");
                        }
                    }
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23053(final double[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < array.length; ++i) {
                bufferedWriter.write(String.format("%.4f", array[i]));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23054(final float[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < array.length; ++i) {
                bufferedWriter.write(String.format("%.4f", array[i]));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23055(final int n, final int n2, final double[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n2; ++j) {
                    if (Class7640.method24116(array[i * n2 + j]) < 5.0E-5) {
                        bufferedWriter.write("0\t");
                    }
                    else {
                        bufferedWriter.write(String.format("%.4f", array[i * n2 + j]) + "\t");
                    }
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23056(final int n, final int n2, final float[] array, final String fileName) {
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n2; ++j) {
                    if (Class7640.method24115(array[i * n2 + j]) < 5.0E-5) {
                        bufferedWriter.write("0\t");
                    }
                    else {
                        bufferedWriter.write(String.format("%.4f", array[i * n2 + j]) + "\t");
                    }
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23057(final int n, final int n2, final int n3, final double[] array, final String fileName) {
        final int n4 = n2 * n3;
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < n3; ++i) {
                bufferedWriter.newLine();
                bufferedWriter.write("(:,:," + i + ")=");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                for (int j = 0; j < n; ++j) {
                    for (int k = 0; k < n2; ++k) {
                        bufferedWriter.write(String.format("%.4f", array[j * n4 + k * n3 + i]) + "\t");
                    }
                    bufferedWriter.newLine();
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void method23058(final String fileName, final int i, final int j, final boolean b, final boolean b2, final long[] array, final double[] array2, final double[] array3) {
        final String[] array4 = { "os.name", "os.version", "os.arch", "java.vendor", "java.version" };
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false));
            bufferedWriter.write(new Date().toString());
            bufferedWriter.newLine();
            bufferedWriter.write("System properties:");
            bufferedWriter.newLine();
            bufferedWriter.write("\tos.name = " + System.getProperty(array4[0]));
            bufferedWriter.newLine();
            bufferedWriter.write("\tos.version = " + System.getProperty(array4[1]));
            bufferedWriter.newLine();
            bufferedWriter.write("\tos.arch = " + System.getProperty(array4[2]));
            bufferedWriter.newLine();
            bufferedWriter.write("\tjava.vendor = " + System.getProperty(array4[3]));
            bufferedWriter.newLine();
            bufferedWriter.write("\tjava.version = " + System.getProperty(array4[4]));
            bufferedWriter.newLine();
            bufferedWriter.write("\tavailable processors = " + Runtime.getRuntime().availableProcessors());
            bufferedWriter.newLine();
            bufferedWriter.write("Settings:");
            bufferedWriter.newLine();
            bufferedWriter.write("\tused processors = " + i);
            bufferedWriter.newLine();
            bufferedWriter.write("\tTHREADS_BEGIN_N_2D = " + Class9133.method33160());
            bufferedWriter.newLine();
            bufferedWriter.write("\tTHREADS_BEGIN_N_3D = " + Class9133.method33161());
            bufferedWriter.newLine();
            bufferedWriter.write("\tnumber of iterations = " + j);
            bufferedWriter.newLine();
            bufferedWriter.write("\twarm-up performed = " + b);
            bufferedWriter.newLine();
            bufferedWriter.write("\tscaling performed = " + b2);
            bufferedWriter.newLine();
            bufferedWriter.write("--------------------------------------------------------------------------------------------------");
            bufferedWriter.newLine();
            bufferedWriter.write("sizes=[");
            for (int k = 0; k < array.length; ++k) {
                bufferedWriter.write(Long.toString(array[k]));
                if (k < array.length - 1) {
                    bufferedWriter.write(", ");
                }
                else {
                    bufferedWriter.write("]");
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.write("times without constructor(in msec)=[");
            for (int l = 0; l < array2.length; ++l) {
                bufferedWriter.write(String.format("%.2f", array2[l]));
                if (l < array2.length - 1) {
                    bufferedWriter.write(", ");
                }
                else {
                    bufferedWriter.write("]");
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.write("times with constructor(in msec)=[");
            for (int n = 0; n < array2.length; ++n) {
                bufferedWriter.write(String.format("%.2f", array3[n]));
                if (n < array3.length - 1) {
                    bufferedWriter.write(", ");
                }
                else {
                    bufferedWriter.write("]");
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
}
