// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.PrintStream;
import org.apache.commons.math3.exception.MathArithmeticException;

public class Class7640
{
    public static final double field30283 = 3.141592653589793;
    public static final double field30284 = 2.718281828459045;
    public static final int field30285 = 750;
    public static final int field30286 = 1500;
    public static final int field30287 = 1024;
    public static final int field30288 = 1025;
    private static final double field30289;
    private static final boolean field30290 = false;
    private static final double field30291 = 0.6931470632553101;
    private static final double field30292 = 1.1730463525082348E-7;
    private static final double[][] field30293;
    private static final double[][] field30294;
    private static final int field30295 = 14;
    private static final double[] field30296;
    private static final double[] field30297;
    private static final double[] field30298;
    private static final double[] field30299;
    private static final double[] field30300;
    private static final double[] field30301;
    private static final long[] field30302;
    private static final long[] field30303;
    private static final double[] field30304;
    private static final double[] field30305;
    private static final long field30306 = 1073741824L;
    private static final long field30307 = -1073741824L;
    private static final int field30308 = Integer.MAX_VALUE;
    private static final long field30309 = Long.MAX_VALUE;
    private static final double field30310 = 4.503599627370496E15;
    private static final double field30311 = 9.007199254740992E15;
    private static final double field30312 = 0.3333333333333333;
    private static final double field30313 = 0.2;
    private static final double field30314 = 0.14285714285714285;
    private static final double field30315 = 0.1111111111111111;
    private static final double field30316 = 0.09090909090909091;
    private static final double field30317 = 0.07692307692307693;
    private static final double field30318 = 0.06666666666666667;
    private static final double field30319 = 0.058823529411764705;
    private static final double field30320 = 0.75;
    private static final double field30321 = 0.9375;
    private static final double field30322 = 0.9285714285714286;
    private static final double field30323 = 0.9166666666666666;
    private static final double field30324 = 0.9;
    private static final double field30325 = 0.875;
    private static final double field30326 = 0.8333333333333334;
    private static final double field30327 = 0.5;
    private static final double field30328 = 0.25;
    
    private Class7640() {
    }
    
    private static double method24070(final double n) {
        if (n > -Class9475.field40739 && n < Class9475.field40739) {
            return n;
        }
        return Double.longBitsToDouble(Double.doubleToRawLongBits(n) & 0xFFFFFFFFC0000000L);
    }
    
    public static double method24071(final double a) {
        return Math.sqrt(a);
    }
    
    public static double method24072(double n) {
        if (n != n) {
            return n;
        }
        if (n <= 20.0) {
            if (n >= -20.0) {
                final double[] array = new double[2];
                if (n < 0.0) {
                    n = -n;
                }
                method24086(n, 0.0, array);
                final double n2 = array[0] + array[1];
                final double n3 = -(n2 - array[0] - array[1]);
                final double n4 = n2 * 1.073741824E9;
                final double n5 = n2 + n4 - n4;
                final double n6 = n2 - n5;
                final double n7 = 1.0 / n2;
                final double n8 = n7 * 1.073741824E9;
                final double n9 = n7 + n8 - n8;
                final double n10 = n7 - n9;
                final double n11 = n10 + (1.0 - n5 * n9 - n5 * n10 - n6 * n9 - n6 * n10) * n7 + -n3 * n7 * n7;
                final double n12 = n2 + n9;
                final double n13 = n3 + -(n12 - n2 - n9);
                final double n14 = n12;
                final double n15 = n14 + n11;
                return (n15 + (n13 + -(n15 - n14 - n11))) * 0.5;
            }
            if (n > -Class7640.field30289) {
                return 0.5 * method24085(-n);
            }
            final double method24085 = method24085(-0.5 * n);
            return 0.5 * method24085 * method24085;
        }
        else {
            if (n < Class7640.field30289) {
                return 0.5 * method24085(n);
            }
            final double method24086 = method24085(0.5 * n);
            return 0.5 * method24086 * method24086;
        }
    }
    
    public static double method24073(double n) {
        boolean b = false;
        if (n != n) {
            return n;
        }
        if (n <= 20.0) {
            if (n >= -20.0) {
                if (n != 0.0) {
                    if (n < 0.0) {
                        n = -n;
                        b = true;
                    }
                    double n19;
                    if (n <= 0.25) {
                        final double[] array = new double[2];
                        method24088(n, array);
                        final double n2 = array[0] + array[1];
                        final double n3 = -(n2 - array[0] - array[1]);
                        final double n4 = 1.0 + n2;
                        final double n5 = 1.0 / n4;
                        final double n6 = -(n4 - 1.0 - n2) + n3;
                        final double n7 = n2 * n5;
                        final double n8 = n7 * 1.073741824E9;
                        final double n9 = n7 + n8 - n8;
                        final double n10 = n7 - n9;
                        final double n11 = n4 * 1.073741824E9;
                        final double n12 = n4 + n11 - n11;
                        final double n13 = n4 - n12;
                        final double n14 = n10 + (n2 - n12 * n9 - n12 * n10 - n13 * n9 - n13 * n10) * n5 + n3 * n5 + -n2 * n6 * n5 * n5;
                        final double n15 = n2 + n9;
                        final double n16 = n3 + -(n15 - n2 - n9);
                        final double n17 = n15;
                        final double n18 = n17 + n14;
                        n19 = (n18 + (n16 + -(n18 - n17 - n14))) * 0.5;
                    }
                    else {
                        final double[] array2 = new double[2];
                        method24086(n, 0.0, array2);
                        final double n20 = array2[0] + array2[1];
                        final double n21 = -(n20 - array2[0] - array2[1]);
                        final double n22 = n20 * 1.073741824E9;
                        final double n23 = n20 + n22 - n22;
                        final double n24 = n20 - n23;
                        final double n25 = 1.0 / n20;
                        final double n26 = n25 * 1.073741824E9;
                        final double n27 = n25 + n26 - n26;
                        final double n28 = n25 - n27;
                        final double n29 = n28 + (1.0 - n23 * n27 - n23 * n28 - n24 * n27 - n24 * n28) * n25 + -n21 * n25 * n25;
                        final double n30 = -n27;
                        final double n31 = -n29;
                        final double n32 = n20 + n30;
                        final double n33 = n21 + -(n32 - n20 - n30);
                        final double n34 = n32;
                        final double n35 = n34 + n31;
                        n19 = (n35 + (n33 + -(n35 - n34 - n31))) * 0.5;
                    }
                    if (b) {
                        n19 = -n19;
                    }
                    return n19;
                }
                return n;
            }
            else {
                if (n > -Class7640.field30289) {
                    return -0.5 * method24085(-n);
                }
                final double method24085 = method24085(-0.5 * n);
                return -0.5 * method24085 * method24085;
            }
        }
        else {
            if (n < Class7640.field30289) {
                return 0.5 * method24085(n);
            }
            final double method24086 = method24085(0.5 * n);
            return 0.5 * method24086 * method24086;
        }
    }
    
    public static double method24074(double n) {
        boolean b = false;
        if (n != n) {
            return n;
        }
        if (n > 20.0) {
            return 1.0;
        }
        if (n < -20.0) {
            return -1.0;
        }
        if (n != 0.0) {
            if (n < 0.0) {
                n = -n;
                b = true;
            }
            double n18;
            if (n < 0.5) {
                final double[] array = new double[2];
                method24088(n * 2.0, array);
                final double n2 = array[0] + array[1];
                final double n3 = -(n2 - array[0] - array[1]);
                final double n4 = n2;
                final double n5 = n3;
                final double n6 = 2.0 + n2;
                final double n7 = -(n6 - 2.0 - n2);
                final double n8 = n6 + n3;
                final double n9 = n7 + -(n8 - n6 - n3);
                final double n10 = n8;
                final double n11 = n10 * 1.073741824E9;
                final double n12 = n10 + n11 - n11;
                final double n13 = n10 - n12;
                final double n14 = n4 / n10;
                final double n15 = n14 * 1.073741824E9;
                final double n16 = n14 + n15 - n15;
                final double n17 = n14 - n16;
                n18 = n16 + (n17 + (n4 - n12 * n16 - n12 * n17 - n13 * n16 - n13 * n17) / n10 + n5 / n10 + -n9 * n4 / n10 / n10);
            }
            else {
                final double[] array2 = new double[2];
                method24086(n * 2.0, 0.0, array2);
                final double n19 = array2[0] + array2[1];
                final double n20 = -(n19 - array2[0] - array2[1]);
                final double n21 = -1.0 + n19;
                final double n22 = -(n21 + 1.0 - n19);
                final double n23 = n21 + n20;
                final double n24 = n22 + -(n23 - n21 - n20);
                final double n25 = n23;
                final double n26 = 1.0 + n19;
                final double n27 = -(n26 - 1.0 - n19);
                final double n28 = n26 + n20;
                final double n29 = n27 + -(n28 - n26 - n20);
                final double n30 = n28;
                final double n31 = n30 * 1.073741824E9;
                final double n32 = n30 + n31 - n31;
                final double n33 = n30 - n32;
                final double n34 = n25 / n30;
                final double n35 = n34 * 1.073741824E9;
                final double n36 = n34 + n35 - n35;
                final double n37 = n34 - n36;
                n18 = n36 + (n37 + (n25 - n32 * n36 - n32 * n37 - n33 * n36 - n33 * n37) / n30 + n24 / n30 + -n29 * n25 / n30 / n30);
            }
            if (b) {
                n18 = -n18;
            }
            return n18;
        }
        return n;
    }
    
    public static double method24075(final double n) {
        return method24089(n + method24071(n * n - 1.0));
    }
    
    public static double method24076(double n) {
        boolean b = false;
        if (n < 0.0) {
            b = true;
            n = -n;
        }
        double method24089;
        if (n <= 0.167) {
            final double n2 = n * n;
            if (n <= 0.097) {
                if (n <= 0.036) {
                    if (n <= 0.0036) {
                        method24089 = n * (1.0 - n2 * (0.3333333333333333 - n2 * 0.2 * 0.75) * 0.5);
                    }
                    else {
                        method24089 = n * (1.0 - n2 * (0.3333333333333333 - n2 * (0.2 - n2 * (0.14285714285714285 - n2 * 0.1111111111111111 * 0.875) * 0.8333333333333334) * 0.75) * 0.5);
                    }
                }
                else {
                    method24089 = n * (1.0 - n2 * (0.3333333333333333 - n2 * (0.2 - n2 * (0.14285714285714285 - n2 * (0.1111111111111111 - n2 * (0.09090909090909091 - n2 * 0.07692307692307693 * 0.9166666666666666) * 0.9) * 0.875) * 0.8333333333333334) * 0.75) * 0.5);
                }
            }
            else {
                method24089 = n * (1.0 - n2 * (0.3333333333333333 - n2 * (0.2 - n2 * (0.14285714285714285 - n2 * (0.1111111111111111 - n2 * (0.09090909090909091 - n2 * (0.07692307692307693 - n2 * (0.06666666666666667 - n2 * 0.058823529411764705 * 0.9375) * 0.9285714285714286) * 0.9166666666666666) * 0.9) * 0.875) * 0.8333333333333334) * 0.75) * 0.5);
            }
        }
        else {
            method24089 = method24089(method24071(n * n + 1.0) + n);
        }
        return b ? (-method24089) : method24089;
    }
    
    public static double method24077(double n) {
        boolean b = false;
        if (n < 0.0) {
            b = true;
            n = -n;
        }
        double n3;
        if (n <= 0.15) {
            final double n2 = n * n;
            if (n <= 0.087) {
                if (n <= 0.031) {
                    if (n <= 0.003) {
                        n3 = n * (1.0 + n2 * (0.3333333333333333 + n2 * 0.2));
                    }
                    else {
                        n3 = n * (1.0 + n2 * (0.3333333333333333 + n2 * (0.2 + n2 * (0.14285714285714285 + n2 * 0.1111111111111111))));
                    }
                }
                else {
                    n3 = n * (1.0 + n2 * (0.3333333333333333 + n2 * (0.2 + n2 * (0.14285714285714285 + n2 * (0.1111111111111111 + n2 * (0.09090909090909091 + n2 * 0.07692307692307693))))));
                }
            }
            else {
                n3 = n * (1.0 + n2 * (0.3333333333333333 + n2 * (0.2 + n2 * (0.14285714285714285 + n2 * (0.1111111111111111 + n2 * (0.09090909090909091 + n2 * (0.07692307692307693 + n2 * (0.06666666666666667 + n2 * 0.058823529411764705))))))));
            }
        }
        else {
            n3 = 0.5 * method24089((1.0 + n) / (1.0 - n));
        }
        return b ? (-n3) : n3;
    }
    
    public static double method24078(final double n) {
        return (n >= 0.0) ? ((n <= 0.0) ? n : 1.0) : -1.0;
    }
    
    public static float method24079(final float n) {
        return (n >= 0.0f) ? ((n <= 0.0f) ? n : 1.0f) : -1.0f;
    }
    
    public static double method24080(final double n) {
        return method24121(n, Double.POSITIVE_INFINITY);
    }
    
    public static float method24081(final float n) {
        return method24122(n, Double.POSITIVE_INFINITY);
    }
    
    public static double method24082(final double n) {
        return method24121(n, Double.NEGATIVE_INFINITY);
    }
    
    public static float method24083(final float n) {
        return method24122(n, Double.NEGATIVE_INFINITY);
    }
    
    public static double method24084() {
        return Math.random();
    }
    
    public static double method24085(final double n) {
        return method24086(n, 0.0, null);
    }
    
    private static double method24086(final double n, final double n2, final double[] array) {
        int n3 = (int)n;
        if (n >= 0.0) {
            if (n3 > 709) {
                if (array != null) {
                    array[0] = Double.POSITIVE_INFINITY;
                    array[1] = 0.0;
                }
                return Double.POSITIVE_INFINITY;
            }
        }
        else {
            if (n < -746.0) {
                if (array != null) {
                    array[1] = (array[0] = 0.0);
                }
                return 0.0;
            }
            if (n3 < -709) {
                final double n4 = method24086(n + 40.19140625, n2, array) / 2.8504009514401178E17;
                if (array != null) {
                    final int n5 = 0;
                    array[n5] /= 2.8504009514401178E17;
                    final int n6 = 1;
                    array[n6] /= 2.8504009514401178E17;
                }
                return n4;
            }
            if (n3 == -709) {
                final double n7 = method24086(n + 1.494140625, n2, array) / 4.455505956692757;
                if (array != null) {
                    final int n8 = 0;
                    array[n8] /= 4.455505956692757;
                    final int n9 = 1;
                    array[n9] /= 4.455505956692757;
                }
                return n7;
            }
            --n3;
        }
        final double n10 = Class8480.method28311()[750 + n3];
        final double n11 = Class8480.method28312()[750 + n3];
        final int n12 = (int)((n - n3) * 1024.0);
        final double n13 = Class7774.method24898()[n12];
        final double n14 = Class7774.method24899()[n12];
        final double n15 = n - (n3 + n12 / 1024.0);
        final double n16 = (((0.04168701738764507 * n15 + 0.1666666505023083) * n15 + 0.5000000000042687) * n15 + 1.0) * n15 - 3.940510424527919E-20;
        final double n17 = n10 * n13;
        final double n18 = n10 * n14 + n11 * n13 + n11 * n14;
        final double n19 = n18 + n17;
        double n20;
        if (n2 == 0.0) {
            n20 = n19 * n16 + n18 + n17;
        }
        else {
            n20 = n19 * n2 * n16 + n19 * n2 + n19 * n16 + n18 + n17;
        }
        if (array != null) {
            array[0] = n17;
            array[1] = n19 * n2 * n16 + n19 * n2 + n19 * n16 + n18;
        }
        return n20;
    }
    
    public static double method24087(final double n) {
        return method24088(n, null);
    }
    
    private static double method24088(double n, final double[] array) {
        if (n != n || n == 0.0) {
            return n;
        }
        if (n > -1.0 && n < 1.0) {
            int n2 = 0;
            if (n < 0.0) {
                n = -n;
                n2 = 1;
            }
            final int n3 = (int)(n * 1024.0);
            final double n4 = Class7774.method24898()[n3] - 1.0;
            final double n5 = Class7774.method24899()[n3];
            final double n6 = n4 + n5;
            final double n7 = -(n6 - n4 - n5);
            final double n8 = n6;
            final double n9 = n8 * 1.073741824E9;
            final double n10 = n8 + n9 - n9;
            final double n11 = n7 + (n8 - n10);
            final double n12 = n - n3 / 1024.0;
            final double n13 = (((0.008336750013465571 * n12 + 0.041666663879186654) * n12 + 0.16666666666745392) * n12 + 0.49999999999999994) * n12 * n12;
            final double n14 = n12;
            final double n15 = n14 + n13;
            final double n16 = -(n15 - n14 - n13);
            final double n17 = n15;
            final double n18 = n17 * 1.073741824E9;
            final double n19 = n17 + n18 - n18;
            final double n20 = n16 + (n17 - n19);
            final double n21 = n19;
            final double n22 = n21 * n10;
            final double n23 = n22 + n21 * n11;
            final double n24 = -(n23 - n22 - n21 * n11);
            final double n25 = n23;
            final double n26 = n25 + n20 * n10;
            final double n27 = n24 + -(n26 - n25 - n20 * n10);
            final double n28 = n26;
            final double n29 = n28 + n20 * n11;
            final double n30 = n27 + -(n29 - n28 - n20 * n11);
            final double n31 = n29;
            final double n32 = n31 + n10;
            final double n33 = n30 + -(n32 - n10 - n31);
            final double n34 = n32;
            final double n35 = n34 + n21;
            final double n36 = n33 + -(n35 - n34 - n21);
            final double n37 = n35;
            final double n38 = n37 + n11;
            final double n39 = n36 + -(n38 - n37 - n11);
            final double n40 = n38;
            final double n41 = n40 + n20;
            double n42 = n39 + -(n41 - n40 - n20);
            double n43 = n41;
            if (n2 != 0) {
                final double n44 = 1.0 + n43;
                final double n45 = 1.0 / n44;
                final double n46 = -(n44 - 1.0 - n43) + n42;
                final double n47 = n43 * n45;
                final double n48 = n47 * 1.073741824E9;
                final double n49 = n47 + n48 - n48;
                final double n50 = n47 - n49;
                final double n51 = n44 * 1.073741824E9;
                final double n52 = n44 + n51 - n51;
                final double n53 = n44 - n52;
                final double n54 = n50 + (n43 - n52 * n49 - n52 * n50 - n53 * n49 - n53 * n50) * n45 + n42 * n45 + -n43 * n46 * n45 * n45;
                n43 = -n49;
                n42 = -n54;
            }
            if (array != null) {
                array[0] = n43;
                array[1] = n42;
            }
            return n43 + n42;
        }
        final double[] array2 = new double[2];
        method24086(n, 0.0, array2);
        if (n <= 0.0) {
            final double n55 = -1.0 + array2[0];
            return n55 + (-(n55 + 1.0 - array2[0]) + array2[1]);
        }
        return -1.0 + array2[0] + array2[1];
    }
    
    public static double method24089(final double n) {
        return method24090(n, null);
    }
    
    private static double method24090(final double n, final double[] array) {
        if (n == 0.0) {
            return Double.NEGATIVE_INFINITY;
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(n);
        if ((doubleToRawLongBits & Long.MIN_VALUE) != 0x0L || n != n) {
            if (n != 0.0) {
                if (array != null) {
                    array[0] = Double.NaN;
                }
                return Double.NaN;
            }
        }
        if (n != Double.POSITIVE_INFINITY) {
            int n2 = (int)(doubleToRawLongBits >> 52) - 1023;
            if ((doubleToRawLongBits & 0x7FF0000000000000L) == 0x0L) {
                if (n == 0.0) {
                    if (array != null) {
                        array[0] = Double.NEGATIVE_INFINITY;
                    }
                    return Double.NEGATIVE_INFINITY;
                }
                for (doubleToRawLongBits <<= 1; (doubleToRawLongBits & 0x10000000000000L) == 0x0L; doubleToRawLongBits <<= 1) {
                    --n2;
                }
            }
            if (n2 == -1 || n2 == 0) {
                if (n < 1.01) {
                    if (n > 0.99) {
                        if (array == null) {
                            final double n3 = n - 1.0;
                            final double n4 = n3 * 1.073741824E9;
                            final double n5 = n3 + n4 - n4;
                            final double n6 = n3 - n5;
                            final double n7 = n5;
                            final double n8 = n6;
                            final double[] array2 = Class7640.field30293[Class7640.field30293.length - 1];
                            double n9 = array2[0];
                            double n10 = array2[1];
                            for (int i = Class7640.field30293.length - 2; i >= 0; --i) {
                                final double n11 = n9 * n7;
                                final double n12 = n9 * n8 + n10 * n7 + n10 * n8;
                                final double n13 = n11 * 1.073741824E9;
                                final double n14 = n11 + n13 - n13;
                                final double n15 = n11 - n14 + n12;
                                final double[] array3 = Class7640.field30293[i];
                                final double n16 = n14 + array3[0];
                                final double n17 = n15 + array3[1];
                                final double n18 = n16 * 1.073741824E9;
                                n9 = n16 + n18 - n18;
                                n10 = n16 - n9 + n17;
                            }
                            final double n19 = n9 * n7;
                            final double n20 = n9 * n8 + n10 * n7 + n10 * n8;
                            final double n21 = n19 * 1.073741824E9;
                            final double n22 = n19 + n21 - n21;
                            return n22 + (n19 - n22 + n20);
                        }
                    }
                }
            }
            final double[] array4 = Class9113.method32966()[(int)((doubleToRawLongBits & 0xFFC0000000000L) >> 42)];
            final double n23 = (doubleToRawLongBits & 0x3FFFFFFFFFFL) / (4.503599627370496E15 + (doubleToRawLongBits & 0xFFC0000000000L));
            double n24 = 0.0;
            double n25;
            if (array == null) {
                n25 = (((((-0.16624882440418567 * n23 + 0.19999954120254515) * n23 - 0.2499999997677497) * n23 + 0.3333333333332802) * n23 - 0.5) * n23 + 1.0) * n23;
            }
            else {
                final double n26 = n23 * 1.073741824E9;
                final double n27 = n23 + n26 - n26;
                final double n28 = n23 - n27;
                final double n29 = n27;
                final double n30 = n28;
                final double n31 = (double)(doubleToRawLongBits & 0x3FFFFFFFFFFL);
                final double n32 = 4.503599627370496E15 + (doubleToRawLongBits & 0xFFC0000000000L);
                final double n33 = n30 + (n31 - n29 * n32 - n30 * n32) / n32;
                final double[] array5 = Class7640.field30294[Class7640.field30294.length - 1];
                double n34 = array5[0];
                double n35 = array5[1];
                for (int j = Class7640.field30294.length - 2; j >= 0; --j) {
                    final double n36 = n34 * n29;
                    final double n37 = n34 * n33 + n35 * n29 + n35 * n33;
                    final double n38 = n36 * 1.073741824E9;
                    final double n39 = n36 + n38 - n38;
                    final double n40 = n36 - n39 + n37;
                    final double[] array6 = Class7640.field30294[j];
                    final double n41 = n39 + array6[0];
                    final double n42 = n40 + array6[1];
                    final double n43 = n41 * 1.073741824E9;
                    n34 = n41 + n43 - n43;
                    n35 = n41 - n34 + n42;
                }
                final double n44 = n34 * n29;
                final double n45 = n34 * n33 + n35 * n29 + n35 * n33;
                n25 = n44 + n45;
                n24 = -(n25 - n44 - n45);
            }
            final double n46 = 0.6931470632553101 * n2;
            final double n47 = 0.0;
            final double n48 = n46 + array4[0];
            final double n49 = -(n48 - n46 - array4[0]);
            final double n50 = n48;
            final double n51 = n47 + n49;
            final double n52 = n50 + n25;
            final double n53 = -(n52 - n50 - n25);
            final double n54 = n52;
            final double n55 = n51 + n53;
            final double n56 = n54 + 1.1730463525082348E-7 * n2;
            final double n57 = -(n56 - n54 - 1.1730463525082348E-7 * n2);
            final double n58 = n56;
            final double n59 = n55 + n57;
            final double n60 = n58 + array4[1];
            final double n61 = -(n60 - n58 - array4[1]);
            final double n62 = n60;
            final double n63 = n59 + n61;
            final double n64 = n62 + n24;
            final double n65 = -(n64 - n62 - n24);
            final double n66 = n64;
            final double n67 = n63 + n65;
            if (array != null) {
                array[0] = n66;
                array[1] = n67;
            }
            return n66 + n67;
        }
        if (array != null) {
            array[0] = Double.POSITIVE_INFINITY;
        }
        return Double.POSITIVE_INFINITY;
    }
    
    public static double method24091(final double n) {
        if (n == -1.0) {
            return Double.NEGATIVE_INFINITY;
        }
        if (n == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        if (n <= 1.0E-6 && n >= -1.0E-6) {
            return ((n * 0.3333333333333333 - 0.5) * n + 1.0) * n;
        }
        final double n2 = 1.0 + n;
        final double n3 = -(n2 - 1.0 - n);
        final double[] array = new double[2];
        final double method24090 = method24090(n2, array);
        if (!Double.isInfinite(method24090)) {
            final double n4 = n3 / n2;
            return (0.5 * n4 + 1.0) * n4 + array[1] + array[0];
        }
        return method24090;
    }
    
    public static double method24092(final double n) {
        final double[] array = new double[2];
        final double method24090 = method24090(n, array);
        if (!Double.isInfinite(method24090)) {
            final double n2 = array[0] * 1.073741824E9;
            final double n3 = array[0] + n2 - n2;
            final double n4 = array[0] - n3 + array[1];
            return 1.9699272335463627E-8 * n4 + 1.9699272335463627E-8 * n3 + 0.4342944622039795 * n4 + 0.4342944622039795 * n3;
        }
        return method24090;
    }
    
    public static double method24093(final double n, final double n2) {
        return method24089(n2) / method24089(n);
    }
    
    public static double method24094(final double n, final double n2) {
        final double[] array = new double[2];
        if (n2 == 0.0) {
            return 1.0;
        }
        if (n != n) {
            return n;
        }
        if (n != 0.0) {
            if (n != Double.POSITIVE_INFINITY) {
                if (n2 != Double.POSITIVE_INFINITY) {
                    if (n == Double.NEGATIVE_INFINITY) {
                        if (n2 != n2) {
                            return n2;
                        }
                        if (n2 >= 0.0) {
                            if (n2 > 0.0) {
                                final long n3 = (long)n2;
                                if (n2 == n3 && (n3 & 0x1L) == 0x1L) {
                                    return Double.NEGATIVE_INFINITY;
                                }
                                return Double.POSITIVE_INFINITY;
                            }
                        }
                        else {
                            final long n4 = (long)n2;
                            if (n2 == n4 && (n4 & 0x1L) == 0x1L) {
                                return -0.0;
                            }
                            return 0.0;
                        }
                    }
                    if (n2 != Double.NEGATIVE_INFINITY) {
                        if (n >= 0.0) {
                            double n6;
                            double n7;
                            if (n2 < 8.0E298 && n2 > -8.0E298) {
                                final double n5 = n2 * 1.073741824E9;
                                n6 = n2 + n5 - n5;
                                n7 = n2 - n6;
                            }
                            else {
                                final double n8 = n2 * 9.313225746154785E-10;
                                n6 = (n8 + n8 * 9.313225746154785E-10 - n8) * 1.073741824E9 * 1.073741824E9;
                                n7 = n2 - n6;
                            }
                            final double method24090 = method24090(n, array);
                            if (!Double.isInfinite(method24090)) {
                                final double n9 = array[0];
                                final double n10 = array[1];
                                final double n11 = n9 * 1.073741824E9;
                                final double n12 = n9 + n11 - n11;
                                final double n13 = n10 + (n9 - n12);
                                final double n14 = n12;
                                final double n15 = n14 * n6;
                                final double n16 = n14 * n7 + n13 * n6 + n13 * n7;
                                final double n17 = n15 + n16;
                                final double n18 = -(n17 - n15 - n16);
                                return method24086(n17, ((((0.008333333333333333 * n18 + 0.041666666666666664) * n18 + 0.16666666666666666) * n18 + 0.5) * n18 + 1.0) * n18, null);
                            }
                            return method24090;
                        }
                        else {
                            if (n2 >= 9.007199254740992E15 || n2 <= -9.007199254740992E15) {
                                return method24094(-n, n2);
                            }
                            if (n2 != (long)n2) {
                                return Double.NaN;
                            }
                            return (((long)n2 & 0x1L) != 0x0L) ? (-method24094(-n, n2)) : method24094(-n, n2);
                        }
                    }
                    else {
                        if (n * n == 1.0) {
                            return Double.NaN;
                        }
                        if (n * n >= 1.0) {
                            return 0.0;
                        }
                        return Double.POSITIVE_INFINITY;
                    }
                }
                else {
                    if (n * n == 1.0) {
                        return Double.NaN;
                    }
                    if (n * n <= 1.0) {
                        return 0.0;
                    }
                    return Double.POSITIVE_INFINITY;
                }
            }
            else {
                if (n2 != n2) {
                    return n2;
                }
                if (n2 >= 0.0) {
                    return Double.POSITIVE_INFINITY;
                }
                return 0.0;
            }
        }
        else {
            if ((Double.doubleToRawLongBits(n) & Long.MIN_VALUE) != 0x0L) {
                final long n19 = (long)n2;
                if (n2 < 0.0) {
                    if (n2 == n19) {
                        if ((n19 & 0x1L) == 0x1L) {
                            return Double.NEGATIVE_INFINITY;
                        }
                    }
                }
                if (n2 > 0.0) {
                    if (n2 == n19) {
                        if ((n19 & 0x1L) == 0x1L) {
                            return -0.0;
                        }
                    }
                }
            }
            if (n2 < 0.0) {
                return Double.POSITIVE_INFINITY;
            }
            if (n2 <= 0.0) {
                return Double.NaN;
            }
            return 0.0;
        }
    }
    
    public static double method24095(double n, int i) {
        if (i != 0) {
            if (i < 0) {
                i = -i;
                n = 1.0 / n;
            }
            final double n2 = 1.34217729E8 * n;
            final double n3 = n2 - (n2 - n);
            final double n4 = n - n3;
            double n5 = 1.0;
            double n6 = 0.0;
            double n7 = n;
            double n8 = n3;
            double n9 = n4;
            while (i != 0) {
                if ((i & 0x1) != 0x0) {
                    final double n10 = n5 * n7;
                    final double n11 = 1.34217729E8 * n5;
                    final double n12 = n11 - (n11 - n5);
                    final double n13 = n5 - n12;
                    final double n14 = n13 * n9 - (n10 - n12 * n8 - n13 * n8 - n12 * n9);
                    n5 = n10;
                    n6 = n6 * n7 + n14;
                }
                final double n15 = n8 * n7;
                final double n16 = 1.34217729E8 * n8;
                final double n17 = n16 - (n16 - n8);
                final double n18 = n8 - n17;
                final double n19 = n18 * n9 - (n15 - n17 * n8 - n18 * n8 - n17 * n9);
                final double n20 = 1.34217729E8 * n15;
                n8 = n20 - (n20 - n15);
                n9 = n9 * n7 + n19 + (n15 - n8);
                n7 = n8 + n9;
                i >>= 1;
            }
            return n5 + n6;
        }
        return 1.0;
    }
    
    private static double method24096(final double n) {
        final double n2 = n * n;
        return (((2.7553817452272217E-6 * n2 - 1.9841269659586505E-4) * n2 + 0.008333333333329196) * n2 - 0.16666666666666666) * n2 * n;
    }
    
    private static double method24097(final double n) {
        final double n2 = n * n;
        return (((2.479773539153719E-5 * n2 - 0.0013888888689039883) * n2 + 0.041666666666621166) * n2 - 0.49999999999999994) * n2;
    }
    
    private static double method24098(final double n, final double n2) {
        final int n3 = (int)(n * 8.0 + 0.5);
        final double n4 = n - Class7640.field30304[n3];
        final double n5 = Class7640.field30296[n3];
        final double n6 = Class7640.field30297[n3];
        final double n7 = Class7640.field30298[n3];
        final double n8 = Class7640.field30299[n3];
        final double n9 = n4;
        final double method24096 = method24096(n4);
        final double method24097 = method24097(n4);
        final double n10 = n9 * 1.073741824E9;
        final double n11 = n9 + n10 - n10;
        final double n12 = method24096 + (n9 - n11);
        final double n13 = n11;
        final double n14 = 0.0;
        final double n15 = 0.0;
        final double n16 = n5;
        final double n17 = n14 + n16;
        final double n18 = -(n17 - n14 - n16);
        final double n19 = n17;
        final double n20 = n15 + n18;
        final double n21 = n7 * n13;
        final double n22 = n19 + n21;
        final double n23 = -(n22 - n19 - n21);
        double n24 = n22;
        double n25 = n20 + n23 + n5 * method24097 + n7 * n12 + n6 + n8 * n13 + n6 * method24097 + n8 * n12;
        if (n2 != 0.0) {
            final double n26 = ((n7 + n8) * (1.0 + method24097) - (n5 + n6) * (n13 + n12)) * n2;
            final double n27 = n24 + n26;
            final double n28 = -(n27 - n24 - n26);
            n24 = n27;
            n25 += n28;
        }
        return n24 + n25;
    }
    
    private static double method24099(final double n, final double n2) {
        final double n3 = 1.5707963267948966 - n;
        return method24098(n3, -(n3 - 1.5707963267948966 + n) + (6.123233995736766E-17 - n2));
    }
    
    private static double method24100(final double n, final double n2, final boolean b) {
        final int n3 = (int)(n * 8.0 + 0.5);
        final double n4 = n - Class7640.field30304[n3];
        final double n5 = Class7640.field30296[n3];
        final double n6 = Class7640.field30297[n3];
        final double n7 = Class7640.field30298[n3];
        final double n8 = Class7640.field30299[n3];
        final double n9 = n4;
        final double method24096 = method24096(n4);
        final double method24097 = method24097(n4);
        final double n10 = n9 * 1.073741824E9;
        final double n11 = n9 + n10 - n10;
        final double n12 = method24096 + (n9 - n11);
        final double n13 = n11;
        final double n14 = 0.0;
        final double n15 = 0.0;
        final double n16 = n5;
        final double n17 = n14 + n16;
        final double n18 = -(n17 - n14 - n16);
        final double n19 = n17;
        final double n20 = n15 + n18;
        final double n21 = n7 * n13;
        final double n22 = n19 + n21;
        final double n23 = -(n22 - n19 - n21);
        final double n24 = n22;
        final double n25 = n20 + n23 + (n5 * method24097 + n7 * n12) + (n6 + n8 * n13 + n6 * method24097 + n8 * n12);
        double n26 = n24 + n25;
        double n27 = -(n26 - n24 - n25);
        final double n29;
        final double n28 = n29 = 0.0;
        final double n30 = n7 * 1.0;
        final double n31 = n29 + n30;
        final double n32 = -(n31 - n29 - n30);
        final double n33 = n31;
        final double n34 = n28 + n32;
        final double n35 = -n5 * n13;
        final double n36 = n33 + n35;
        final double n37 = -(n36 - n33 - n35);
        final double n38 = n36;
        final double n39 = n34 + n37 + (n8 * 1.0 + n7 * method24097 + n8 * method24097) - (n6 * n13 + n5 * n12 + n6 * n12);
        double n40 = n38 + n39;
        double n41 = -(n40 - n38 - n39);
        if (b) {
            final double n42 = n40;
            n40 = n26;
            n26 = n42;
            final double n43 = n41;
            n41 = n27;
            n27 = n43;
        }
        final double n44 = n26 / n40;
        final double n45 = n44 * 1.073741824E9;
        final double n46 = n44 + n45 - n45;
        final double n47 = n44 - n46;
        final double n48 = n40 * 1.073741824E9;
        final double n49 = n40 + n48 - n48;
        final double n50 = n40 - n49;
        double n51 = (n26 - n46 * n49 - n46 * n50 - n47 * n49 - n47 * n50) / n40 + n27 / n40 + -n26 * n41 / n40 / n40;
        if (n2 != 0.0) {
            double n52 = n2 + n44 * n44 * n2;
            if (b) {
                n52 = -n52;
            }
            n51 += n52;
        }
        return n44 + n51;
    }
    
    private static void method24101(final double n, final double[] array) {
        final long doubleToRawLongBits = Double.doubleToRawLongBits(n);
        int n2 = (int)(doubleToRawLongBits >> 52 & 0x7FFL) - 1023;
        final long n3 = (doubleToRawLongBits & 0xFFFFFFFFFFFFFL) | 0x10000000000000L;
        ++n2;
        final long n4 = n3 << 11;
        final int n5 = n2 >> 6;
        final int n6 = n2 - (n5 << 6);
        long n7;
        long n8;
        long n9;
        if (n6 == 0) {
            n7 = ((n5 != 0) ? Class7640.field30302[n5 - 1] : 0L);
            n8 = Class7640.field30302[n5];
            n9 = Class7640.field30302[n5 + 1];
        }
        else {
            n7 = (((n5 != 0) ? (Class7640.field30302[n5 - 1] << n6) : 0L) | Class7640.field30302[n5] >>> 64 - n6);
            n8 = (Class7640.field30302[n5] << n6 | Class7640.field30302[n5 + 1] >>> 64 - n6);
            n9 = (Class7640.field30302[n5 + 1] << n6 | Class7640.field30302[n5 + 2] >>> 64 - n6);
        }
        final long n10 = n4 >>> 32;
        final long n11 = n4 & 0xFFFFFFFFL;
        final long n12 = n8 >>> 32;
        final long n13 = n8 & 0xFFFFFFFFL;
        final long n14 = n10 * n12;
        final long n15 = n11 * n13;
        final long n16 = n11 * n12;
        final long n17 = n10 * n13;
        final long n18 = n15 + (n17 << 32);
        long n19 = n14 + (n17 >>> 32);
        final boolean b = (n15 & Long.MIN_VALUE) != 0x0L;
        final boolean b2 = (n17 & 0x80000000L) != 0x0L;
        final boolean b3 = (n18 & Long.MIN_VALUE) != 0x0L;
        while (true) {
            Label_0377: {
                if (b && b2) {
                    break Label_0377;
                }
                if (b || b2) {
                    if (!b3) {
                        break Label_0377;
                    }
                }
                final boolean b4 = (n18 & Long.MIN_VALUE) != 0x0L;
                final boolean b5 = (n16 & 0x80000000L) != 0x0L;
                final long n20 = n18 + (n16 << 32);
                long n21 = n19 + (n16 >>> 32);
                final boolean b6 = (n20 & Long.MIN_VALUE) != 0x0L;
                while (true) {
                    Label_0554: {
                        if (b4 && b5) {
                            break Label_0554;
                        }
                        if (b4 || b5) {
                            if (!b6) {
                                break Label_0554;
                            }
                        }
                        final long n22 = n9 >>> 32;
                        final long n23 = n10 * n22 + (n11 * n22 + n10 * (n9 & 0xFFFFFFFFL) >>> 32);
                        final boolean b7 = (n20 & Long.MIN_VALUE) != 0x0L;
                        final boolean b8 = (n23 & Long.MIN_VALUE) != 0x0L;
                        final long n24 = n20 + n23;
                        final boolean b9 = (n24 & Long.MIN_VALUE) != 0x0L;
                        while (true) {
                            Label_0835: {
                                if (b7 && b8) {
                                    break Label_0835;
                                }
                                if (b7 || b8) {
                                    if (!b9) {
                                        break Label_0835;
                                    }
                                }
                                final long n25 = n7 >>> 32;
                                final long n26 = n7 & 0xFFFFFFFFL;
                                final long n27 = n21 + (n11 * n26 + (n11 * n25 + n10 * n26 << 32));
                                final int n28 = (int)(n27 >>> 62);
                                final long n29 = n27 << 2 | n24 >>> 62;
                                final long n30 = n24 << 2;
                                final long n31 = n29 >>> 32;
                                final long n32 = n29 & 0xFFFFFFFFL;
                                final long n33 = Class7640.field30303[0] >>> 32;
                                final long n34 = Class7640.field30303[0] & 0xFFFFFFFFL;
                                final long n35 = n31 * n33;
                                final long n36 = n32 * n34;
                                final long n37 = n32 * n33;
                                final long n38 = n31 * n34;
                                final long n39 = n36 + (n38 << 32);
                                long n40 = n35 + (n38 >>> 32);
                                final boolean b10 = (n36 & Long.MIN_VALUE) != 0x0L;
                                final boolean b11 = (n38 & 0x80000000L) != 0x0L;
                                final boolean b12 = (n39 & Long.MIN_VALUE) != 0x0L;
                                while (true) {
                                    Label_0943: {
                                        if (b10 && b11) {
                                            break Label_0943;
                                        }
                                        if (b10 || b11) {
                                            if (!b12) {
                                                break Label_0943;
                                            }
                                        }
                                        final boolean b13 = (n39 & Long.MIN_VALUE) != 0x0L;
                                        final boolean b14 = (n37 & 0x80000000L) != 0x0L;
                                        final long n41 = n39 + (n37 << 32);
                                        long n42 = n40 + (n37 >>> 32);
                                        final boolean b15 = (n41 & Long.MIN_VALUE) != 0x0L;
                                        while (true) {
                                            Label_1126: {
                                                if (b13 && b14) {
                                                    break Label_1126;
                                                }
                                                if (b13 || b14) {
                                                    if (!b15) {
                                                        break Label_1126;
                                                    }
                                                }
                                                final long n43 = Class7640.field30303[1] >>> 32;
                                                final long n44 = n31 * n43 + (n32 * n43 + n31 * (Class7640.field30303[1] & 0xFFFFFFFFL) >>> 32);
                                                final boolean b16 = (n41 & Long.MIN_VALUE) != 0x0L;
                                                final boolean b17 = (n44 & Long.MIN_VALUE) != 0x0L;
                                                final long n45 = n41 + n44;
                                                final boolean b18 = (n45 & Long.MIN_VALUE) != 0x0L;
                                                while (true) {
                                                    Label_1311: {
                                                        if (b16 && b17) {
                                                            break Label_1311;
                                                        }
                                                        if (b16 || b17) {
                                                            if (!b18) {
                                                                break Label_1311;
                                                            }
                                                        }
                                                        final long n46 = n30 >>> 32;
                                                        final long n47 = n30 & 0xFFFFFFFFL;
                                                        final long n48 = Class7640.field30303[0] >>> 32;
                                                        final long n49 = n46 * n48 + (n47 * n48 + n46 * (Class7640.field30303[0] & 0xFFFFFFFFL) >>> 32);
                                                        final boolean b19 = (n45 & Long.MIN_VALUE) != 0x0L;
                                                        final boolean b20 = (n49 & Long.MIN_VALUE) != 0x0L;
                                                        final long n50 = n45 + n49;
                                                        final boolean b21 = (n50 & Long.MIN_VALUE) != 0x0L;
                                                        while (true) {
                                                            Label_1492: {
                                                                if (b19 && b20) {
                                                                    break Label_1492;
                                                                }
                                                                if (b19 || b20) {
                                                                    if (!b21) {
                                                                        break Label_1492;
                                                                    }
                                                                }
                                                                final double n51 = (n42 >>> 12) / 4.503599627370496E15;
                                                                final double n52 = (((n42 & 0xFFFL) << 40) + (n50 >>> 24)) / 4.503599627370496E15 / 4.503599627370496E15;
                                                                final double n53 = n51 + n52;
                                                                final double n54 = -(n53 - n51 - n52);
                                                                array[0] = n28;
                                                                array[1] = n53 * 2.0;
                                                                array[2] = n54 * 2.0;
                                                                return;
                                                            }
                                                            ++n42;
                                                            continue;
                                                        }
                                                    }
                                                    ++n42;
                                                    continue;
                                                }
                                            }
                                            ++n42;
                                            continue;
                                        }
                                    }
                                    ++n40;
                                    continue;
                                }
                            }
                            ++n21;
                            continue;
                        }
                    }
                    ++n21;
                    continue;
                }
            }
            ++n19;
            continue;
        }
    }
    
    public static double method24102(final double n) {
        boolean b = false;
        int n2 = 0;
        double method29258 = 0.0;
        double method29259 = n;
        if (n < 0.0) {
            b = true;
            method29259 = -method29259;
        }
        if (method29259 == 0.0) {
            if (Double.doubleToRawLongBits(n) < 0L) {
                return -0.0;
            }
            return 0.0;
        }
        else {
            if (method29259 != method29259 || method29259 == Double.POSITIVE_INFINITY) {
                return Double.NaN;
            }
            if (method29259 > 3294198.0) {
                final double[] array = new double[3];
                method24101(method29259, array);
                n2 = ((int)array[0] & 0x3);
                method29259 = array[1];
                method29258 = array[2];
            }
            else if (method29259 > 1.5707963267948966) {
                final Class8620 class8620 = new Class8620(method29259);
                n2 = (class8620.method29256() & 0x3);
                method29259 = class8620.method29257();
                method29258 = class8620.method29258();
            }
            if (b) {
                n2 ^= 0x2;
            }
            switch (n2) {
                case 0: {
                    return method24098(method29259, method29258);
                }
                case 1: {
                    return method24099(method29259, method29258);
                }
                case 2: {
                    return -method24098(method29259, method29258);
                }
                case 3: {
                    return -method24099(method29259, method29258);
                }
                default: {
                    return Double.NaN;
                }
            }
        }
    }
    
    public static double method24103(final double n) {
        int n2 = 0;
        double method29257 = n;
        if (n < 0.0) {
            method29257 = -method29257;
        }
        if (method29257 != method29257 || method29257 == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        }
        double method29258 = 0.0;
        if (method29257 > 3294198.0) {
            final double[] array = new double[3];
            method24101(method29257, array);
            n2 = ((int)array[0] & 0x3);
            method29257 = array[1];
            method29258 = array[2];
        }
        else if (method29257 > 1.5707963267948966) {
            final Class8620 class8620 = new Class8620(method29257);
            n2 = (class8620.method29256() & 0x3);
            method29257 = class8620.method29257();
            method29258 = class8620.method29258();
        }
        switch (n2) {
            case 0: {
                return method24099(method29257, method29258);
            }
            case 1: {
                return -method24098(method29257, method29258);
            }
            case 2: {
                return -method24099(method29257, method29258);
            }
            case 3: {
                return method24098(method29257, method29258);
            }
            default: {
                return Double.NaN;
            }
        }
    }
    
    public static double method24104(final double n) {
        int n2 = 0;
        int n3 = 0;
        double method29257 = n;
        if (n < 0.0) {
            n2 = 1;
            method29257 = -method29257;
        }
        if (method29257 != 0.0) {
            if (method29257 == method29257 && method29257 != Double.POSITIVE_INFINITY) {
                double method29258 = 0.0;
                if (method29257 <= 3294198.0) {
                    if (method29257 > 1.5707963267948966) {
                        final Class8620 class8620 = new Class8620(method29257);
                        n3 = (class8620.method29256() & 0x3);
                        method29257 = class8620.method29257();
                        method29258 = class8620.method29258();
                    }
                }
                else {
                    final double[] array = new double[3];
                    method24101(method29257, array);
                    n3 = ((int)array[0] & 0x3);
                    method29257 = array[1];
                    method29258 = array[2];
                }
                if (method29257 > 1.5) {
                    final double n4 = 1.5707963267948966 - method29257;
                    final double n5 = -(n4 - 1.5707963267948966 + method29257) + (6.123233995736766E-17 - method29258);
                    method29257 = n4 + n5;
                    method29258 = -(method29257 - n4 - n5);
                    n3 ^= 0x1;
                    n2 ^= 0x1;
                }
                double method29259;
                if ((n3 & 0x1) != 0x0) {
                    method29259 = -method24100(method29257, method29258, true);
                }
                else {
                    method29259 = method24100(method29257, method29258, false);
                }
                if (n2 != 0) {
                    method29259 = -method29259;
                }
                return method29259;
            }
            return Double.NaN;
        }
        else {
            if (Double.doubleToRawLongBits(n) >= 0L) {
                return 0.0;
            }
            return -0.0;
        }
    }
    
    public static double method24105(final double n) {
        return method24106(n, 0.0, false);
    }
    
    private static double method24106(double n, double n2, final boolean b) {
        if (n == 0.0) {
            return b ? method24153(3.141592653589793, n) : n;
        }
        boolean b2;
        if (n >= 0.0) {
            b2 = false;
        }
        else {
            n = -n;
            n2 = -n2;
            b2 = true;
        }
        if (n <= 1.633123935319537E16) {
            int n4;
            if (n >= 1.0) {
                final double n3 = 1.0 / n;
                n4 = (int)(-((-1.7168146928204135 * n3 * n3 + 8.0) * n3) + 13.07);
            }
            else {
                n4 = (int)((-1.7168146928204135 * n * n + 8.0) * n + 0.5);
            }
            final double n5 = Class7640.field30300[n4];
            final double n6 = Class7640.field30301[n4];
            final double n7 = n - n5;
            final double n8 = -(n7 - n + n5) + (n2 - n6);
            final double n9 = n7 + n8;
            final double n10 = -(n9 - n7 - n8);
            final double n11 = n9;
            final double n12 = n * 1.073741824E9;
            final double n13 = n + n12 - n12;
            final double n14 = n2 + n - n13;
            n = n13;
            n2 += n14;
            double n23;
            double n30;
            if (n4 != 0) {
                final double n15 = n * n5;
                final double n16 = 1.0 + n15;
                final double n17 = -(n16 - 1.0 - n15);
                final double n18 = n2 * n5 + n * n6;
                final double n19 = n16 + n18;
                final double n20 = n17 + -(n19 - n16 - n18);
                final double n21 = n19;
                final double n22 = n20 + n2 * n6;
                n23 = n11 / n21;
                final double n24 = n23 * 1.073741824E9;
                final double n25 = n23 + n24 - n24;
                final double n26 = n23 - n25;
                final double n27 = n21 * 1.073741824E9;
                final double n28 = n21 + n27 - n27;
                final double n29 = n21 - n28;
                n30 = (n11 - n25 * n28 - n25 * n29 - n26 * n28 - n26 * n29) / n21 + -n11 * n22 / n21 / n21 + n10 / n21;
            }
            else {
                final double n31 = 1.0 / (1.0 + (n + n2) * (n5 + n6));
                n23 = n11 * n31;
                n30 = n10 * n31;
            }
            final double n32 = n23;
            final double n33 = n30;
            final double n34 = n32 * n32;
            final double n35 = (((((0.07490822288864472 * n34 - 0.09088450866185192) * n34 + 0.11111095942313305) * n34 - 0.1428571423679182) * n34 + 0.19999999999923582) * n34 - 0.33333333333333287) * n34 * n32;
            final double n36 = n32;
            final double n37 = n36 + n35;
            final double n38 = -(n37 - n36 - n35);
            final double n39 = n37;
            final double n40 = n38 + n33 / (1.0 + n32 * n32);
            final double n41 = Class7640.field30304[n4];
            final double n42 = n41 + n39;
            final double n43 = -(n42 - n41 - n39);
            final double n44 = n42 + n40;
            final double n45 = n43 + -(n44 - n42 - n40);
            final double n46 = n44;
            double n47 = n46 + n45;
            if (b) {
                final double n48 = -(n47 - n46 - n45);
                final double n49 = 3.141592653589793 - n47;
                n47 = n49 + (-(n49 - 3.141592653589793 + n47) + (1.2246467991473532E-16 - n48));
            }
            if (b2 ^ b) {
                n47 = -n47;
            }
            return n47;
        }
        return (b2 ^ b) ? -1.5707963267948966 : 1.5707963267948966;
    }
    
    public static double method24107(final double n, final double n2) {
        if (n2 != n2 || n != n) {
            return Double.NaN;
        }
        if (n != 0.0) {
            if (n != Double.POSITIVE_INFINITY) {
                if (n != Double.NEGATIVE_INFINITY) {
                    if (n2 == Double.POSITIVE_INFINITY) {
                        if (n > 0.0 || 1.0 / n > 0.0) {
                            return 0.0;
                        }
                        if (n < 0.0 || 1.0 / n < 0.0) {
                            return -0.0;
                        }
                    }
                    if (n2 == Double.NEGATIVE_INFINITY) {
                        if (n > 0.0 || 1.0 / n > 0.0) {
                            return 3.141592653589793;
                        }
                        if (n < 0.0 || 1.0 / n < 0.0) {
                            return -3.141592653589793;
                        }
                    }
                    if (n2 == 0.0) {
                        if (n > 0.0 || 1.0 / n > 0.0) {
                            return 1.5707963267948966;
                        }
                        if (n < 0.0 || 1.0 / n < 0.0) {
                            return -1.5707963267948966;
                        }
                    }
                    final double v = n / n2;
                    if (!Double.isInfinite(v)) {
                        final double method24070 = method24070(v);
                        final double n3 = v - method24070;
                        final double method24071 = method24070(n2);
                        final double n4 = n2 - method24071;
                        final double n5 = n3 + (n - method24070 * method24071 - method24070 * n4 - n3 * method24071 - n3 * n4) / n2;
                        final double n6 = method24070 + n5;
                        final double n7 = -(n6 - method24070 - n5);
                        double method24072 = n6;
                        if (method24072 == 0.0) {
                            method24072 = method24153(0.0, n);
                        }
                        return method24106(method24072, n7, n2 < 0.0);
                    }
                    return method24106(v, 0.0, n2 < 0.0);
                }
                else {
                    if (n2 == Double.POSITIVE_INFINITY) {
                        return -0.7853981633974483;
                    }
                    if (n2 != Double.NEGATIVE_INFINITY) {
                        return -1.5707963267948966;
                    }
                    return -2.356194490192345;
                }
            }
            else {
                if (n2 == Double.POSITIVE_INFINITY) {
                    return 0.7853981633974483;
                }
                if (n2 != Double.NEGATIVE_INFINITY) {
                    return 1.5707963267948966;
                }
                return 2.356194490192345;
            }
        }
        else {
            final double n8 = n2 * n;
            final double n9 = 1.0 / n2;
            final double n10 = 1.0 / n;
            if (n9 != 0.0) {
                if (n2 >= 0.0 && n9 >= 0.0) {
                    return n8;
                }
                if (n >= 0.0 && n10 >= 0.0) {
                    return 3.141592653589793;
                }
                return -3.141592653589793;
            }
            else {
                if (n2 <= 0.0) {
                    return method24153(3.141592653589793, n);
                }
                return n;
            }
        }
    }
    
    public static double method24108(final double n) {
        if (n != n) {
            return Double.NaN;
        }
        if (n > 1.0 || n < -1.0) {
            return Double.NaN;
        }
        if (n == 1.0) {
            return 1.5707963267948966;
        }
        if (n == -1.0) {
            return -1.5707963267948966;
        }
        if (n != 0.0) {
            final double n2 = n * 1.073741824E9;
            final double n3 = n + n2 - n2;
            final double n4 = n - n3;
            final double n5 = n3 * n3;
            final double n6 = n3 * n4 * 2.0 + n4 * n4;
            final double n7 = -n5;
            final double n8 = -n6;
            final double n9 = 1.0 + n7;
            final double n10 = -(n9 - 1.0 - n7);
            final double n11 = n9 + n8;
            final double n12 = n10 + -(n11 - n9 - n8);
            final double n13 = n11;
            final double method24071 = method24071(n13);
            final double n14 = method24071 * 1.073741824E9;
            final double n15 = method24071 + n14 - n14;
            final double n16 = method24071 - n15;
            final double n17 = n16 + (n13 - n15 * n15 - 2.0 * n15 * n16 - n16 * n16) / (2.0 * method24071);
            final double n18 = n12 / (2.0 * method24071);
            final double n19 = n / method24071;
            final double n20 = n19 * 1.073741824E9;
            final double n21 = n19 + n20 - n20;
            final double n22 = n19 - n21;
            final double n23 = n22 + (n - n21 * n15 - n21 * n17 - n22 * n15 - n22 * n17) / method24071 + -n * n18 / method24071 / method24071;
            final double n24 = n21 + n23;
            return method24106(n24, -(n24 - n21 - n23), false);
        }
        return n;
    }
    
    public static double method24109(final double n) {
        if (n != n) {
            return Double.NaN;
        }
        if (n > 1.0 || n < -1.0) {
            return Double.NaN;
        }
        if (n == -1.0) {
            return 3.141592653589793;
        }
        if (n == 1.0) {
            return 0.0;
        }
        if (n == 0.0) {
            return 1.5707963267948966;
        }
        final double n2 = n * 1.073741824E9;
        final double n3 = n + n2 - n2;
        final double n4 = n - n3;
        final double n5 = n3 * n3;
        final double n6 = n3 * n4 * 2.0 + n4 * n4;
        final double n7 = -n5;
        final double n8 = -n6;
        final double n9 = 1.0 + n7;
        final double n10 = -(n9 - 1.0 - n7);
        final double n11 = n9 + n8;
        final double n12 = n10 + -(n11 - n9 - n8);
        final double n13 = n11;
        final double method24071 = method24071(n13);
        final double n14 = method24071 * 1.073741824E9;
        final double n15 = method24071 + n14 - n14;
        final double n16 = method24071 - n15;
        final double n17 = n16 + (n13 - n15 * n15 - 2.0 * n15 * n16 - n16 * n16) / (2.0 * method24071) + n12 / (2.0 * method24071);
        final double n18 = n15 + n17;
        final double n19 = -(n18 - n15 - n17);
        final double v = n18 / n;
        if (!Double.isInfinite(v)) {
            final double method24072 = method24070(v);
            final double n20 = v - method24072;
            final double n21 = n20 + (n18 - method24072 * n3 - method24072 * n4 - n20 * n3 - n20 * n4) / n + n19 / n;
            final double n22 = method24072 + n21;
            return method24106(n22, -(n22 - method24072 - n21), n < 0.0);
        }
        return 1.5707963267948966;
    }
    
    public static double method24110(double n) {
        long n2 = Double.doubleToRawLongBits(n);
        int n3 = (int)(n2 >> 52 & 0x7FFL) - 1023;
        int n4 = 0;
        if (n3 == -1023) {
            if (n == 0.0) {
                return n;
            }
            n4 = 1;
            n *= 1.8014398509481984E16;
            n2 = Double.doubleToRawLongBits(n);
            n3 = (int)(n2 >> 52 & 0x7FFL) - 1023;
        }
        if (n3 != 1024) {
            final double longBitsToDouble = Double.longBitsToDouble((n2 & Long.MIN_VALUE) | (long)(n3 / 3 + 1023 & 0x7FF) << 52);
            final double longBitsToDouble2 = Double.longBitsToDouble((n2 & 0xFFFFFFFFFFFFFL) | 0x3FF0000000000000L);
            final double n5 = ((((-0.010714690733195933 * longBitsToDouble2 + 0.0875862700108075) * longBitsToDouble2 - 0.3058015757857271) * longBitsToDouble2 + 0.7249995199969751) * longBitsToDouble2 + 0.5039018405998233) * Class7640.field30305[n3 % 3 + 2];
            final double n6 = n / (longBitsToDouble * longBitsToDouble * longBitsToDouble);
            final double n7 = n5 + (n6 - n5 * n5 * n5) / (3.0 * n5 * n5);
            final double n8 = n7 + (n6 - n7 * n7 * n7) / (3.0 * n7 * n7);
            final double n9 = n8 * 1.073741824E9;
            final double n10 = n8 + n9 - n9;
            final double n11 = n8 - n10;
            final double n12 = n10 * n10;
            final double n13 = n10 * n11 * 2.0 + n11 * n11;
            final double n14 = n12 * 1.073741824E9;
            final double n15 = n12 + n14 - n14;
            final double n16 = n13 + (n12 - n15);
            final double n17 = n15;
            final double n18 = n17 * n11 + n10 * n16 + n16 * n11;
            final double n19 = n17 * n10;
            final double n20 = n6 - n19;
            double n21 = (n8 + (n20 + (-(n20 - n6 + n19) - n18)) / (3.0 * n8 * n8)) * longBitsToDouble;
            if (n4 != 0) {
                n21 *= 3.814697265625E-6;
            }
            return n21;
        }
        return n;
    }
    
    public static double method24111(final double v) {
        if (!Double.isInfinite(v) && v != 0.0) {
            final double method24070 = method24070(v);
            final double n = v - method24070;
            double n2 = n * 1.997844754509471E-9 + n * 0.01745329052209854 + method24070 * 1.997844754509471E-9 + method24070 * 0.01745329052209854;
            if (n2 == 0.0) {
                n2 *= v;
            }
            return n2;
        }
        return v;
    }
    
    public static double method24112(final double v) {
        if (!Double.isInfinite(v) && v != 0.0) {
            final double method24070 = method24070(v);
            final double n = v - method24070;
            return n * 3.145894820876798E-6 + n * 57.2957763671875 + method24070 * 3.145894820876798E-6 + method24070 * 57.2957763671875;
        }
        return v;
    }
    
    public static int method24113(final int n) {
        final int n2 = n >>> 31;
        return (n ^ ~n2 + 1) + n2;
    }
    
    public static long method24114(final long n) {
        final long n2 = n >>> 63;
        return (n ^ ~n2 + 1L) + n2;
    }
    
    public static float method24115(final float n) {
        return Float.intBitsToFloat(Integer.MAX_VALUE & Float.floatToRawIntBits(n));
    }
    
    public static double method24116(final double n) {
        return Double.longBitsToDouble(Long.MAX_VALUE & Double.doubleToRawLongBits(n));
    }
    
    public static double method24117(final double v) {
        if (!Double.isInfinite(v)) {
            return method24116(v - Double.longBitsToDouble(Double.doubleToRawLongBits(v) ^ 0x1L));
        }
        return Double.POSITIVE_INFINITY;
    }
    
    public static float method24118(final float n) {
        if (!Float.isInfinite(n)) {
            return method24115(n - Float.intBitsToFloat(Float.floatToIntBits(n) ^ 0x1));
        }
        return Float.POSITIVE_INFINITY;
    }
    
    public static double method24119(final double n, final int n2) {
        if (n2 > -1023 && n2 < 1024) {
            return n * Double.longBitsToDouble((long)(n2 + 1023) << 52);
        }
        if (!Double.isNaN(n)) {
            if (!Double.isInfinite(n)) {
                if (n != 0.0) {
                    if (n2 < -2098) {
                        return (n <= 0.0) ? -0.0 : 0.0;
                    }
                    if (n2 > 2097) {
                        return (n <= 0.0) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                    }
                    final long doubleToRawLongBits = Double.doubleToRawLongBits(n);
                    final long n3 = doubleToRawLongBits & Long.MIN_VALUE;
                    final int n4 = (int)(doubleToRawLongBits >>> 52) & 0x7FF;
                    long n5 = doubleToRawLongBits & 0xFFFFFFFFFFFFFL;
                    int n6 = n4 + n2;
                    if (n2 >= 0) {
                        if (n4 != 0) {
                            if (n6 >= 2047) {
                                return (n3 != 0L) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                            }
                            return Double.longBitsToDouble(n3 | (long)n6 << 52 | n5);
                        }
                        else {
                            while (n5 >>> 52 != 1L) {
                                n5 <<= 1;
                                --n6;
                            }
                            ++n6;
                            final long n7 = n5 & 0xFFFFFFFFFFFFFL;
                            if (n6 >= 2047) {
                                return (n3 != 0L) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                            }
                            return Double.longBitsToDouble(n3 | (long)n6 << 52 | n7);
                        }
                    }
                    else {
                        if (n6 > 0) {
                            return Double.longBitsToDouble(n3 | (long)n6 << 52 | n5);
                        }
                        if (n6 <= -53) {
                            return (n3 != 0L) ? -0.0 : 0.0;
                        }
                        final long n8 = n5 | 0x10000000000000L;
                        final long n9 = n8 & 1L << -n6;
                        long n10 = n8 >>> 1 - n6;
                        if (n9 != 0L) {
                            ++n10;
                        }
                        return Double.longBitsToDouble(n3 | n10);
                    }
                }
            }
        }
        return n;
    }
    
    public static float method24120(final float value, final int n) {
        if (n > -127 && n < 128) {
            return value * Float.intBitsToFloat(n + 127 << 23);
        }
        if (!Float.isNaN(value)) {
            if (!Float.isInfinite(value)) {
                if (value != 0.0f) {
                    if (n < -277) {
                        return (value <= 0.0f) ? -0.0f : 0.0f;
                    }
                    if (n > 276) {
                        return (value <= 0.0f) ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
                    }
                    final int floatToIntBits = Float.floatToIntBits(value);
                    final int n2 = floatToIntBits & Integer.MIN_VALUE;
                    final int n3 = floatToIntBits >>> 23 & 0xFF;
                    int n4 = floatToIntBits & 0x7FFFFF;
                    int n5 = n3 + n;
                    if (n >= 0) {
                        if (n3 != 0) {
                            if (n5 >= 255) {
                                return (n2 != 0) ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
                            }
                            return Float.intBitsToFloat(n2 | n5 << 23 | n4);
                        }
                        else {
                            while (n4 >>> 23 != 1) {
                                n4 <<= 1;
                                --n5;
                            }
                            ++n5;
                            final int n6 = n4 & 0x7FFFFF;
                            if (n5 >= 255) {
                                return (n2 != 0) ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
                            }
                            return Float.intBitsToFloat(n2 | n5 << 23 | n6);
                        }
                    }
                    else {
                        if (n5 > 0) {
                            return Float.intBitsToFloat(n2 | n5 << 23 | n4);
                        }
                        if (n5 <= -24) {
                            return (n2 != 0) ? -0.0f : 0.0f;
                        }
                        final int n7 = n4 | 0x800000;
                        final int n8 = n7 & 1 << -n5;
                        int n9 = n7 >>> 1 - n5;
                        if (n8 != 0) {
                            ++n9;
                        }
                        return Float.intBitsToFloat(n2 | n9);
                    }
                }
            }
        }
        return value;
    }
    
    public static double method24121(final double n, final double v) {
        if (Double.isNaN(n) || Double.isNaN(v)) {
            return Double.NaN;
        }
        if (n == v) {
            return v;
        }
        if (Double.isInfinite(n)) {
            return (n >= 0.0) ? Double.MAX_VALUE : -1.7976931348623157E308;
        }
        if (n == 0.0) {
            return (v >= 0.0) ? Double.MIN_VALUE : -4.9E-324;
        }
        final long doubleToRawLongBits = Double.doubleToRawLongBits(n);
        final long n2 = doubleToRawLongBits & Long.MIN_VALUE;
        if (!(v < n ^ n2 == 0L)) {
            return Double.longBitsToDouble(n2 | (doubleToRawLongBits & Long.MAX_VALUE) - 1L);
        }
        return Double.longBitsToDouble(n2 | (doubleToRawLongBits & Long.MAX_VALUE) + 1L);
    }
    
    public static float method24122(final float n, final double v) {
        if (Double.isNaN(n) || Double.isNaN(v)) {
            return Float.NaN;
        }
        if (n == v) {
            return (float)v;
        }
        if (Float.isInfinite(n)) {
            return (n >= 0.0f) ? Float.MAX_VALUE : -3.4028235E38f;
        }
        if (n == 0.0f) {
            return (v >= 0.0) ? Float.MIN_VALUE : -1.4E-45f;
        }
        final int floatToIntBits = Float.floatToIntBits(n);
        final int n2 = floatToIntBits & Integer.MIN_VALUE;
        if (!(v < n ^ n2 == 0)) {
            return Float.intBitsToFloat(n2 | (floatToIntBits & Integer.MAX_VALUE) - 1);
        }
        return Float.intBitsToFloat(n2 | (floatToIntBits & Integer.MAX_VALUE) + 1);
    }
    
    public static double method24123(final double n) {
        if (n != n) {
            return n;
        }
        if (n >= 4.503599627370496E15 || n <= -4.503599627370496E15) {
            return n;
        }
        long n2 = (long)n;
        if (n < 0.0) {
            if (n2 != n) {
                --n2;
            }
        }
        if (n2 != 0L) {
            return (double)n2;
        }
        return n * n2;
    }
    
    public static double method24124(final double n) {
        if (n != n) {
            return n;
        }
        final double method24123 = method24123(n);
        if (method24123 == n) {
            return method24123;
        }
        final double n2 = method24123 + 1.0;
        if (n2 != 0.0) {
            return n2;
        }
        return n * n2;
    }
    
    public static double method24125(final double n) {
        final double method24123 = method24123(n);
        final double n2 = n - method24123;
        if (n2 <= 0.5) {
            if (n2 >= 0.5) {
                return (((long)method24123 & 0x1L) != 0x0L) ? (method24123 + 1.0) : method24123;
            }
            return method24123;
        }
        else {
            if (method24123 != -1.0) {
                return method24123 + 1.0;
            }
            return -0.0;
        }
    }
    
    public static long method24126(final double n) {
        return (long)method24123(n + 0.5);
    }
    
    public static int method24127(final float n) {
        return (int)method24123(n + 0.5f);
    }
    
    public static int method24128(final int n, final int n2) {
        return (n > n2) ? n2 : n;
    }
    
    public static long method24129(final long n, final long n2) {
        return (n > n2) ? n2 : n;
    }
    
    public static float method24130(final float n, final float n2) {
        if (n > n2) {
            return n2;
        }
        if (n < n2) {
            return n;
        }
        if (n != n2) {
            return Float.NaN;
        }
        if (Float.floatToRawIntBits(n) != Integer.MIN_VALUE) {
            return n2;
        }
        return n;
    }
    
    public static double method24131(final double n, final double n2) {
        if (n > n2) {
            return n2;
        }
        if (n < n2) {
            return n;
        }
        if (n != n2) {
            return Double.NaN;
        }
        if (Double.doubleToRawLongBits(n) != Long.MIN_VALUE) {
            return n2;
        }
        return n;
    }
    
    public static int method24132(final int n, final int n2) {
        return (n > n2) ? n : n2;
    }
    
    public static long method24133(final long n, final long n2) {
        return (n > n2) ? n : n2;
    }
    
    public static float method24134(final float n, final float n2) {
        if (n > n2) {
            return n;
        }
        if (n < n2) {
            return n2;
        }
        if (n != n2) {
            return Float.NaN;
        }
        if (Float.floatToRawIntBits(n) != Integer.MIN_VALUE) {
            return n;
        }
        return n2;
    }
    
    public static double method24135(final double n, final double n2) {
        if (n > n2) {
            return n;
        }
        if (n < n2) {
            return n2;
        }
        if (n != n2) {
            return Double.NaN;
        }
        if (Double.doubleToRawLongBits(n) != Long.MIN_VALUE) {
            return n;
        }
        return n2;
    }
    
    public static double method24136(final double n, final double n2) {
        if (Double.isInfinite(n) || Double.isInfinite(n2)) {
            return Double.POSITIVE_INFINITY;
        }
        if (Double.isNaN(n) || Double.isNaN(n2)) {
            return Double.NaN;
        }
        final int method24155 = method24155(n);
        final int method24156 = method24155(n2);
        if (method24155 > method24156 + 27) {
            return method24116(n);
        }
        if (method24156 <= method24155 + 27) {
            final int n3 = (method24155 + method24156) / 2;
            final double method24157 = method24119(n, -n3);
            final double method24158 = method24119(n2, -n3);
            return method24119(method24071(method24157 * method24157 + method24158 * method24158), n3);
        }
        return method24116(n2);
    }
    
    public static double method24137(final double f1, final double f2) {
        return StrictMath.IEEEremainder(f1, f2);
    }
    
    public static int method24138(final long n) throws MathArithmeticException {
        if (n >= -2147483648L && n <= 2147483647L) {
            return (int)n;
        }
        throw new Class2376(Class2189.field13251, new Object[0]);
    }
    
    public static int method24139(final int i) throws MathArithmeticException {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new Class2376(Class2189.field13253, new Object[] { i, 1 });
    }
    
    public static long method24140(final long l) throws MathArithmeticException {
        if (l != Long.MAX_VALUE) {
            return l + 1L;
        }
        throw new Class2376(Class2189.field13253, new Object[] { l, 1 });
    }
    
    public static int method24141(final int i) throws MathArithmeticException {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new Class2376(Class2189.field13254, new Object[] { i, 1 });
    }
    
    public static long method24142(final long l) throws MathArithmeticException {
        if (l != Long.MIN_VALUE) {
            return l - 1L;
        }
        throw new Class2376(Class2189.field13254, new Object[] { l, 1 });
    }
    
    public static int method24143(final int i, final int j) throws MathArithmeticException {
        final int n = i + j;
        if ((i ^ j) >= 0 && (n ^ j) < 0) {
            throw new Class2376(Class2189.field13253, new Object[] { i, j });
        }
        return n;
    }
    
    public static long method24144(final long l, final long i) throws MathArithmeticException {
        final long n = l + i;
        if ((l ^ i) >= 0L && (n ^ i) < 0L) {
            throw new Class2376(Class2189.field13253, new Object[] { l, i });
        }
        return n;
    }
    
    public static int method24145(final int i, final int j) {
        final int n = i - j;
        if ((i ^ j) < 0 && (n ^ j) >= 0) {
            throw new Class2376(Class2189.field13254, new Object[] { i, j });
        }
        return n;
    }
    
    public static long method24146(final long l, final long i) {
        final long n = l - i;
        if ((l ^ i) < 0L && (n ^ i) >= 0L) {
            throw new Class2376(Class2189.field13254, new Object[] { l, i });
        }
        return n;
    }
    
    public static int method24147(final int i, final int j) {
        if (j > 0) {
            if (i > Integer.MAX_VALUE / j) {
                throw new Class2376(Class2189.field13255, new Object[] { i, j });
            }
            if (i < Integer.MIN_VALUE / j) {
                throw new Class2376(Class2189.field13255, new Object[] { i, j });
            }
        }
        if (j < -1) {
            if (i > Integer.MIN_VALUE / j) {
                throw new Class2376(Class2189.field13255, new Object[] { i, j });
            }
            if (i < Integer.MAX_VALUE / j) {
                throw new Class2376(Class2189.field13255, new Object[] { i, j });
            }
        }
        if (j != -1 || i != Integer.MIN_VALUE) {
            return i * j;
        }
        throw new Class2376(Class2189.field13255, new Object[] { i, j });
    }
    
    public static long method24148(final long l, final long i) {
        if (i > 0L) {
            if (l > Long.MAX_VALUE / i) {
                throw new Class2376(Class2189.field13255, new Object[] { l, i });
            }
            if (l < Long.MIN_VALUE / i) {
                throw new Class2376(Class2189.field13255, new Object[] { l, i });
            }
        }
        if (i < -1L) {
            if (l > Long.MIN_VALUE / i) {
                throw new Class2376(Class2189.field13255, new Object[] { l, i });
            }
            if (l < Long.MAX_VALUE / i) {
                throw new Class2376(Class2189.field13255, new Object[] { l, i });
            }
        }
        if (i != -1L || l != Long.MIN_VALUE) {
            return l * i;
        }
        throw new Class2376(Class2189.field13255, new Object[] { l, i });
    }
    
    public static int method24149(final int n, final int n2) throws MathArithmeticException {
        if (n2 == 0) {
            throw new Class2376(Class2189.field13316, new Object[0]);
        }
        final int n3 = n % n2;
        if ((n ^ n2) < 0 && n3 != 0) {
            return n / n2 - 1;
        }
        return n / n2;
    }
    
    public static long method24150(final long n, final long n2) throws MathArithmeticException {
        if (n2 == 0L) {
            throw new Class2376(Class2189.field13316, new Object[0]);
        }
        final long n3 = n % n2;
        if ((n ^ n2) < 0L && n3 != 0L) {
            return n / n2 - 1L;
        }
        return n / n2;
    }
    
    public static int method24151(final int n, final int n2) throws MathArithmeticException {
        if (n2 == 0) {
            throw new Class2376(Class2189.field13316, new Object[0]);
        }
        final int n3 = n % n2;
        if ((n ^ n2) < 0 && n3 != 0) {
            return n2 + n3;
        }
        return n3;
    }
    
    public static long method24152(final long n, final long n2) {
        if (n2 == 0L) {
            throw new Class2376(Class2189.field13316, new Object[0]);
        }
        final long n3 = n % n2;
        if ((n ^ n2) < 0L && n3 != 0L) {
            return n2 + n3;
        }
        return n3;
    }
    
    public static double method24153(final double n, final double n2) {
        if ((Double.doubleToRawLongBits(n) ^ Double.doubleToRawLongBits(n2)) < 0L) {
            return -n;
        }
        return n;
    }
    
    public static float method24154(final float n, final float n2) {
        if ((Float.floatToRawIntBits(n) ^ Float.floatToRawIntBits(n2)) < 0) {
            return -n;
        }
        return n;
    }
    
    public static int method24155(final double n) {
        return (int)(Double.doubleToRawLongBits(n) >>> 52 & 0x7FFL) - 1023;
    }
    
    public static int method24156(final float n) {
        return (Float.floatToRawIntBits(n) >>> 23 & 0xFF) - 127;
    }
    
    public static void main(final String[] array) {
        final PrintStream out = System.out;
        Class8893.method31303(out, "EXP_INT_TABLE_A", 1500, Class8480.method28311());
        Class8893.method31303(out, "EXP_INT_TABLE_B", 1500, Class8480.method28312());
        Class8893.method31303(out, "EXP_FRAC_TABLE_A", 1025, Class7774.method24898());
        Class8893.method31303(out, "EXP_FRAC_TABLE_B", 1025, Class7774.method24899());
        Class8893.method31302(out, "LN_MANT", 1024, Class9113.method32966());
        Class8893.method31303(out, "SINE_TABLE_A", 14, Class7640.field30296);
        Class8893.method31303(out, "SINE_TABLE_B", 14, Class7640.field30297);
        Class8893.method31303(out, "COSINE_TABLE_A", 14, Class7640.field30298);
        Class8893.method31303(out, "COSINE_TABLE_B", 14, Class7640.field30299);
        Class8893.method31303(out, "TANGENT_TABLE_A", 14, Class7640.field30300);
        Class8893.method31303(out, "TANGENT_TABLE_B", 14, Class7640.field30301);
    }
    
    static {
        field30289 = StrictMath.log(Double.MAX_VALUE);
        field30293 = new double[][] { { 1.0, 5.669184079525E-24 }, { -0.25, -0.25 }, { 0.3333333134651184, 1.986821492305628E-8 }, { -0.25, -6.663542893624021E-14 }, { 0.19999998807907104, 1.1921056801463227E-8 }, { -0.1666666567325592, -7.800414592973399E-9 }, { 0.1428571343421936, 5.650007086920087E-9 }, { -0.12502530217170715, -7.44321345601866E-11 }, { 0.11113807559013367, 9.219544613762692E-9 } };
        field30294 = new double[][] { { 1.0, -6.032174644509064E-23 }, { -0.25, -0.25 }, { 0.3333333134651184, 1.9868161777724352E-8 }, { -0.2499999701976776, -2.957007209750105E-8 }, { 0.19999954104423523, 1.5830993332061267E-10 }, { -0.16624879837036133, -2.6033824355191673E-8 } };
        field30296 = new double[] { 0.0, 0.1246747374534607, 0.24740394949913025, 0.366272509098053, 0.4794255495071411, 0.5850973129272461, 0.6816387176513672, 0.7675435543060303, 0.8414709568023682, 0.902267575263977, 0.9489846229553223, 0.9808930158615112, 0.9974949359893799, 0.9985313415527344 };
        field30297 = new double[] { 0.0, -4.068233003401932E-9, 9.755392680573412E-9, 1.9987994582857286E-8, -1.0902938113007961E-8, -3.9986783938944604E-8, 4.23719669792332E-8, -5.207000323380292E-8, 2.800552834259E-8, 1.883511811213715E-8, -3.5997360512765566E-9, 4.116164446561962E-8, 5.0614674548127384E-8, -1.0129027912496858E-9 };
        field30298 = new double[] { 1.0, 0.9921976327896118, 0.9689123630523682, 0.9305076599121094, 0.8775825500488281, 0.8109631538391113, 0.7316888570785522, 0.6409968137741089, 0.5403022766113281, 0.4311765432357788, 0.3153223395347595, 0.19454771280288696, 0.07073719799518585, -0.05417713522911072 };
        field30299 = new double[] { 0.0, 3.4439717236742845E-8, 5.865827662008209E-8, -3.7999795083850525E-8, 1.184154459111628E-8, -3.43338934259355E-8, 1.1795268640216787E-8, 4.438921624363781E-8, 2.925681159240093E-8, -2.6437112632041807E-8, 2.2860509143963117E-8, -4.813899778443457E-9, 3.6725170580355583E-9, 2.0217439756338078E-10 };
        field30300 = new double[] { 0.0, 0.1256551444530487, 0.25534194707870483, 0.3936265707015991, 0.5463024377822876, 0.7214844226837158, 0.9315965175628662, 1.1974215507507324, 1.5574076175689697, 2.092571258544922, 3.0095696449279785, 5.041914939880371, 14.101419448852539, -18.430862426757812 };
        field30301 = new double[] { 0.0, -7.877917738262007E-9, -2.5857668567479893E-8, 5.2240336371356666E-9, 5.206150291559893E-8, 1.8307188599677033E-8, -5.7618793749770706E-8, 7.848361555046424E-8, 1.0708593250394448E-7, 1.7827257129423813E-8, 2.893485277253286E-8, 3.1660099222737955E-7, 4.983191803254889E-7, -3.356118100840571E-7 };
        field30302 = new long[] { 2935890503282001226L, 9154082963658192752L, 3952090531849364496L, 9193070505571053912L, 7910884519577875640L, 113236205062349959L, 4577762542105553359L, -5034868814120038111L, 4208363204685324176L, 5648769086999809661L, 2819561105158720014L, -4035746434778044925L, -302932621132653753L, -2644281811660520851L, -3183605296591799669L, 6722166367014452318L, -3512299194304650054L, -7278142539171889152L };
        field30303 = new long[] { -3958705157555305932L, -4267615245585081135L };
        field30304 = new double[] { 0.0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0, 1.125, 1.25, 1.375, 1.5, 1.625 };
        field30305 = new double[] { 0.6299605249474366, 0.7937005259840998, 1.0, 1.2599210498948732, 1.5874010519681994 };
    }
}
