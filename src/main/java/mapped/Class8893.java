// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.math3.exception.DimensionMismatchException;
import java.io.PrintStream;

public class Class8893
{
    private static final long field37396 = 1073741824L;
    private static final double[] field37397;
    private static final double[][] field37398;
    private static final String field37399 = "    {";
    private static final String field37400 = "    };";
    
    private Class8893() {
    }
    
    private static void method31290(final double[] array, final double[] array2, final double[] array3, final double[] array4, final int n, final double[] array5, final double[] array6) {
        final double[] array7 = new double[2];
        for (int i = 0; i < 7; ++i) {
            final double n2 = i / 8.0;
            method31292(n2, array7);
            array[i] = array7[0];
            array2[i] = array7[1];
            method31291(n2, array7);
            array3[i] = array7[0];
            array4[i] = array7[1];
        }
        for (int j = 7; j < n; ++j) {
            final double[] array8 = new double[2];
            final double[] array9 = new double[2];
            final double[] array10 = new double[2];
            final double[] array11 = new double[2];
            final double[] array12 = new double[2];
            if ((j & 0x1) != 0x0) {
                array8[0] = array[j / 2];
                array8[1] = array2[j / 2];
                array9[0] = array3[j / 2];
                array9[1] = array4[j / 2];
                array10[0] = array[j / 2 + 1];
                array10[1] = array2[j / 2 + 1];
                array11[0] = array3[j / 2 + 1];
                array11[1] = array4[j / 2 + 1];
                method31296(array8, array11, array12);
                method31296(array9, array10, array7);
                method31297(array7, array12, array7);
                array[j] = array7[0];
                array2[j] = array7[1];
                method31296(array9, array11, array7);
                method31296(array8, array10, array12);
                array12[0] = -array12[0];
                array12[1] = -array12[1];
                method31297(array7, array12, array7);
                array3[j] = array7[0];
                array4[j] = array7[1];
            }
            else {
                array8[0] = array[j / 2];
                array8[1] = array2[j / 2];
                array9[0] = array3[j / 2];
                array9[1] = array4[j / 2];
                method31296(array8, array9, array7);
                array[j] = array7[0] * 2.0;
                array2[j] = array7[1] * 2.0;
                method31296(array9, array9, array10);
                method31296(array8, array8, array12);
                array12[0] = -array12[0];
                array12[1] = -array12[1];
                method31297(array10, array12, array7);
                array3[j] = array7[0];
                array4[j] = array7[1];
            }
        }
        for (int k = 0; k < n; ++k) {
            final double[] array13 = new double[2];
            final double[] array14 = new double[2];
            final double[] array15 = { array3[k], array4[k] };
            method31298(array15, array14);
            array13[0] = array[k];
            array13[1] = array2[k];
            method31296(array13, array14, array15);
            array5[k] = array15[0];
            array6[k] = array15[1];
        }
    }
    
    public static double method31291(final double n, final double[] array) {
        final double[] array2 = new double[2];
        final double[] array3 = new double[2];
        final double[] array4 = new double[2];
        final double[] array5 = new double[2];
        method31294(n, array2);
        array3[0] = (array3[1] = 0.0);
        for (int i = Class8893.field37397.length - 1; i >= 0; --i) {
            method31296(array2, array3, array5);
            array3[0] = array5[0];
            array3[1] = array5[1];
            if ((i & 0x1) == 0x0) {
                method31294(Class8893.field37397[i], array5);
                method31298(array5, array4);
                if ((i & 0x2) != 0x0) {
                    array4[0] = -array4[0];
                    array4[1] = -array4[1];
                }
                method31297(array3, array4, array5);
                array3[0] = array5[0];
                array3[1] = array5[1];
            }
        }
        if (array != null) {
            array[0] = array3[0];
            array[1] = array3[1];
        }
        return array3[0] + array3[1];
    }
    
    public static double method31292(final double n, final double[] array) {
        final double[] array2 = new double[2];
        final double[] array3 = new double[2];
        final double[] array4 = new double[2];
        final double[] array5 = new double[2];
        method31294(n, array2);
        array3[0] = (array3[1] = 0.0);
        for (int i = Class8893.field37397.length - 1; i >= 0; --i) {
            method31296(array2, array3, array5);
            array3[0] = array5[0];
            array3[1] = array5[1];
            if ((i & 0x1) != 0x0) {
                method31294(Class8893.field37397[i], array5);
                method31298(array5, array4);
                if ((i & 0x2) != 0x0) {
                    array4[0] = -array4[0];
                    array4[1] = -array4[1];
                }
                method31297(array3, array4, array5);
                array3[0] = array5[0];
                array3[1] = array5[1];
            }
        }
        if (array != null) {
            array[0] = array3[0];
            array[1] = array3[1];
        }
        return array3[0] + array3[1];
    }
    
    public static double method31293(final double n, final double[] array) {
        final double[] array2 = new double[2];
        final double[] array3 = new double[2];
        final double[] array4 = new double[2];
        final double[] array5 = new double[2];
        method31294(n, array2);
        array3[0] = (array3[1] = 0.0);
        for (int i = Class8893.field37397.length - 1; i >= 0; --i) {
            method31296(array2, array3, array5);
            array3[0] = array5[0];
            array3[1] = array5[1];
            method31294(Class8893.field37397[i], array5);
            method31298(array5, array4);
            method31297(array3, array4, array5);
            array3[0] = array5[0];
            array3[1] = array5[1];
        }
        if (array != null) {
            array[0] = array3[0];
            array[1] = array3[1];
        }
        return array3[0] + array3[1];
    }
    
    private static void method31294(final double n, final double[] array) {
        if (n < 8.0E298 && n > -8.0E298) {
            final double n2 = n * 1.073741824E9;
            array[0] = n + n2 - n2;
            array[1] = n - array[0];
        }
        else {
            array[0] = (n + n * 9.313225746154785E-10 - n) * 1.073741824E9;
            array[1] = n - array[0];
        }
    }
    
    private static void method31295(final double[] array) {
        final double n = array[0] + array[1];
        final double n2 = -(n - array[0] - array[1]);
        if (n < 8.0E298 && n > -8.0E298) {
            final double n3 = n * 1.073741824E9;
            array[0] = n + n3 - n3;
            array[1] = n - array[0] + n2;
        }
        else {
            array[0] = (n + n * 9.313225746154785E-10 - n) * 1.073741824E9;
            array[1] = n - array[0] + n2;
        }
    }
    
    private static void method31296(final double[] array, final double[] array2, final double[] array3) {
        array3[0] = array[0] * array2[0];
        array3[1] = array[0] * array2[1] + array[1] * array2[0] + array[1] * array2[1];
        method31295(array3);
    }
    
    private static void method31297(final double[] array, final double[] array2, final double[] array3) {
        array3[0] = array[0] + array2[0];
        array3[1] = array[1] + array2[1];
        method31295(array3);
    }
    
    public static void method31298(final double[] array, final double[] array2) {
        if (array[0] == 0.0) {
            array[0] = array[1];
            array[1] = 0.0;
        }
        array2[0] = 0.9999997615814209 / array[0];
        array2[1] = (2.384185791015625E-7 * array[0] - 0.9999997615814209 * array[1]) / (array[0] * array[0] + array[0] * array[1]);
        if (array2[1] != array2[1]) {
            array2[1] = 0.0;
        }
        method31295(array2);
        for (int i = 0; i < 2; ++i) {
            final double n = (1.0 - array2[0] * array[0] - array2[0] * array[1] - array2[1] * array[0] - array2[1] * array[1]) * (array2[0] + array2[1]);
            final int n2 = 1;
            array2[n2] += n;
        }
    }
    
    private static void method31299(final double[] array, final double[] array2, final double[] array3) {
        final double[] array4 = new double[2];
        final double[] array5 = new double[2];
        final double[] array6 = new double[2];
        method31294(array[0], array4);
        method31294(array2[0], array5);
        method31296(array4, array5, array6);
        array3[0] = array6[0];
        array3[1] = array6[1];
        method31294(array2[1], array5);
        method31296(array4, array5, array6);
        final double n = array3[0] + array6[0];
        final int n2 = 1;
        array3[n2] -= n - array3[0] - array6[0];
        array3[0] = n;
        final double n3 = array3[0] + array6[1];
        final int n4 = 1;
        array3[n4] -= n3 - array3[0] - array6[1];
        array3[0] = n3;
        method31294(array[1], array4);
        method31294(array2[0], array5);
        method31296(array4, array5, array6);
        final double n5 = array3[0] + array6[0];
        final int n6 = 1;
        array3[n6] -= n5 - array3[0] - array6[0];
        array3[0] = n5;
        final double n7 = array3[0] + array6[1];
        final int n8 = 1;
        array3[n8] -= n7 - array3[0] - array6[1];
        array3[0] = n7;
        method31294(array[1], array4);
        method31294(array2[1], array5);
        method31296(array4, array5, array6);
        final double n9 = array3[0] + array6[0];
        final int n10 = 1;
        array3[n10] -= n9 - array3[0] - array6[0];
        array3[0] = n9;
        final double n11 = array3[0] + array6[1];
        final int n12 = 1;
        array3[n12] -= n11 - array3[0] - array6[1];
        array3[0] = n11;
    }
    
    public static double method31300(int i, final double[] array) {
        final double[] array2 = new double[2];
        final double[] array3 = new double[2];
        final double[] array4 = new double[2];
        array2[0] = 2.718281828459045;
        array2[1] = 1.4456468917292502E-16;
        method31294(1.0, array4);
        while (i > 0) {
            if ((i & 0x1) != 0x0) {
                method31299(array4, array2, array3);
                array4[0] = array3[0];
                array4[1] = array3[1];
            }
            method31299(array2, array2, array3);
            array2[0] = array3[0];
            array2[1] = array3[1];
            i >>= 1;
        }
        if (array != null) {
            array[0] = array4[0];
            array[1] = array4[1];
            method31295(array);
        }
        return array4[0] + array4[1];
    }
    
    public static double[] method31301(final double n) {
        final double[] array = new double[2];
        final double[] array2 = new double[2];
        final double[] array3 = new double[2];
        final double[] array4 = new double[2];
        method31294(n, array);
        final double[] array5 = array;
        final int n2 = 0;
        ++array5[n2];
        method31295(array);
        method31298(array, array4);
        final double[] array6 = array;
        final int n3 = 0;
        array6[n3] -= 2.0;
        method31295(array);
        method31296(array, array4, array3);
        array[0] = array3[0];
        array[1] = array3[1];
        method31296(array, array, array2);
        array3[0] = Class8893.field37398[Class8893.field37398.length - 1][0];
        array3[1] = Class8893.field37398[Class8893.field37398.length - 1][1];
        for (int i = Class8893.field37398.length - 2; i >= 0; --i) {
            method31296(array3, array2, array4);
            array3[0] = array4[0];
            array3[1] = array4[1];
            method31297(array3, Class8893.field37398[i], array4);
            array3[0] = array4[0];
            array3[1] = array4[1];
        }
        method31296(array3, array, array4);
        array3[0] = array4[0];
        array3[1] = array4[1];
        return array3;
    }
    
    public static void method31302(final PrintStream printStream, final String x, final int n, final double[][] array) {
        printStream.println(x);
        method31305(n, array.length);
        printStream.println("    { ");
        int n2 = 0;
        for (final double[] array2 : array) {
            printStream.print("        {");
            final double[] array3 = array2;
            for (int length2 = array3.length, j = 0; j < length2; ++j) {
                printStream.printf("%-25.25s", method31304(array3[j]));
            }
            printStream.println("}, // " + n2++);
        }
        printStream.println("    };");
    }
    
    public static void method31303(final PrintStream printStream, final String str, final int n, final double[] array) {
        printStream.println(str + "=");
        method31305(n, array.length);
        printStream.println("    {");
        for (int length = array.length, i = 0; i < length; ++i) {
            printStream.printf("        %s%n", method31304(array[i]));
        }
        printStream.println("    };");
    }
    
    public static String method31304(final double d) {
        if (d == d) {
            return ((d < 0.0) ? "" : "+") + Double.toString(d) + "d,";
        }
        return "Double.NaN,";
    }
    
    private static void method31305(final int n, final int n2) throws DimensionMismatchException {
        if (n == n2) {
            return;
        }
        throw new Class2378(n2, n);
    }
    
    static {
        field37397 = new double[] { 1.0, 1.0, 2.0, 6.0, 24.0, 120.0, 720.0, 5040.0, 40320.0, 362880.0, 3628800.0, 3.99168E7, 4.790016E8, 6.2270208E9, 8.71782912E10, 1.307674368E12, 2.0922789888E13, 3.55687428096E14, 6.402373705728E15, 1.21645100408832E17 };
        field37398 = new double[][] { { 2.0, 0.0 }, { 0.6666666269302368, 3.9736429850260626E-8 }, { 0.3999999761581421, 2.3841857910019882E-8 }, { 0.2857142686843872, 1.7029898543501842E-8 }, { 0.2222222089767456, 1.3245471311735498E-8 }, { 0.1818181574344635, 2.4384203044354907E-8 }, { 0.1538461446762085, 9.140260083262505E-9 }, { 0.13333332538604736, 9.220590270857665E-9 }, { 0.11764700710773468, 1.2393345855018391E-8 }, { 0.10526403784751892, 8.251545029714408E-9 }, { 0.0952233225107193, 1.2675934823758863E-8 }, { 0.08713622391223907, 1.1430250008909141E-8 }, { 0.07842259109020233, 2.404307984052299E-9 }, { 0.08371849358081818, 1.176342548272881E-8 }, { 0.030589580535888672, 1.2958646899018938E-9 }, { 0.14982303977012634, 1.225743062930824E-8 } };
    }
}
