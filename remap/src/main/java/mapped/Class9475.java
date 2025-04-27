// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathArithmeticException;
import java.math.BigDecimal;

public class Class9475
{
    public static final double field40738;
    public static final double field40739;
    private static final long field40740 = 1023L;
    private static final long field40741 = Long.MIN_VALUE;
    private static final int field40742 = Integer.MIN_VALUE;
    private static final double field40743 = 0.0;
    private static final long field40744;
    private static final long field40745;
    private static final int field40746;
    private static final int field40747;
    
    private Class9475() {
    }
    
    public static int method35262(final double n, final double n2, final double n3) {
        if (equals(n, n2, n3)) {
            return 0;
        }
        if (n >= n2) {
            return 1;
        }
        return -1;
    }
    
    public static int method35263(final double n, final double n2, final int n3) {
        if (equals(n, n2, n3)) {
            return 0;
        }
        if (n >= n2) {
            return 1;
        }
        return -1;
    }
    
    public static boolean equals(final float n, final float n2) {
        return equals(n, n2, 1);
    }
    
    public static boolean method35264(final float n, final float n2) {
        return (n == n && n2 == n2) ? equals(n, n2, 1) : ((n != n) == (n2 != n2));
    }
    
    public static boolean equals(final float n, final float n2, final float n3) {
        return equals(n, n2, 1) || Class7640.method24115(n2 - n) <= n3;
    }
    
    public static boolean method35265(final float n, final float n2, final float n3) {
        return method35264(n, n2) || Class7640.method24115(n2 - n) <= n3;
    }
    
    public static boolean equals(final float v, final float v2, final int n) {
        final int floatToRawIntBits = Float.floatToRawIntBits(v);
        final int floatToRawIntBits2 = Float.floatToRawIntBits(v2);
        boolean b;
        if (((floatToRawIntBits ^ floatToRawIntBits2) & Integer.MIN_VALUE) != 0x0) {
            int n2;
            int n3;
            if (floatToRawIntBits >= floatToRawIntBits2) {
                n2 = floatToRawIntBits - Class9475.field40746;
                n3 = floatToRawIntBits2 - Class9475.field40747;
            }
            else {
                n2 = floatToRawIntBits2 - Class9475.field40746;
                n3 = floatToRawIntBits - Class9475.field40747;
            }
            b = (n2 <= n && n3 <= n - n2);
        }
        else {
            b = (Class7640.method24113(floatToRawIntBits - floatToRawIntBits2) <= n);
        }
        if (b) {
            if (!Float.isNaN(v)) {
                return !Float.isNaN(v2);
            }
        }
        return false;
    }
    
    public static boolean method35266(final float n, final float n2, final int n3) {
        return (n == n && n2 == n2) ? equals(n, n2, n3) : ((n != n) == (n2 != n2));
    }
    
    public static boolean equals(final double n, final double n2) {
        return equals(n, n2, 1);
    }
    
    public static boolean method35267(final double n, final double n2) {
        return (n == n && n2 == n2) ? equals(n, n2, 1) : ((n != n) == (n2 != n2));
    }
    
    public static boolean equals(final double n, final double n2, final double n3) {
        return equals(n, n2, 1) || Class7640.method24116(n2 - n) <= n3;
    }
    
    public static boolean method35268(final double n, final double n2, final double n3) {
        return equals(n, n2, 1) || Class7640.method24116((n - n2) / Class7640.method24135(Class7640.method24116(n), Class7640.method24116(n2))) <= n3;
    }
    
    public static boolean method35269(final double n, final double n2, final double n3) {
        return method35267(n, n2) || Class7640.method24116(n2 - n) <= n3;
    }
    
    public static boolean equals(final double v, final double v2, final int n) {
        final long doubleToRawLongBits = Double.doubleToRawLongBits(v);
        final long doubleToRawLongBits2 = Double.doubleToRawLongBits(v2);
        boolean b;
        if (((doubleToRawLongBits ^ doubleToRawLongBits2) & Long.MIN_VALUE) != 0x0L) {
            long n2;
            long n3;
            if (doubleToRawLongBits >= doubleToRawLongBits2) {
                n2 = doubleToRawLongBits - Class9475.field40744;
                n3 = doubleToRawLongBits2 - Class9475.field40745;
            }
            else {
                n2 = doubleToRawLongBits2 - Class9475.field40744;
                n3 = doubleToRawLongBits - Class9475.field40745;
            }
            b = (n2 <= n && n3 <= n - n2);
        }
        else {
            b = (Class7640.method24114(doubleToRawLongBits - doubleToRawLongBits2) <= n);
        }
        if (b) {
            if (!Double.isNaN(v)) {
                return !Double.isNaN(v2);
            }
        }
        return false;
    }
    
    public static boolean method35270(final double n, final double n2, final int n3) {
        return (n == n && n2 == n2) ? equals(n, n2, n3) : ((n != n) == (n2 != n2));
    }
    
    public static double method35271(final double n, final int n2) {
        return method35272(n, n2, 4);
    }
    
    public static double method35272(final double n, final int newScale, final int roundingMode) {
        try {
            final double doubleValue = new BigDecimal(Double.toString(n)).setScale(newScale, roundingMode).doubleValue();
            return (doubleValue == 0.0) ? (0.0 * n) : doubleValue;
        }
        catch (final NumberFormatException ex) {
            if (Double.isInfinite(n)) {
                return n;
            }
        }
        return Double.NaN;
    }
    
    public static float method35273(final float n, final int n2) {
        return method35274(n, n2, 4);
    }
    
    public static float method35274(final float n, final int n2, final int n3) throws MathArithmeticException, MathIllegalArgumentException {
        final float method24154 = Class7640.method24154(1.0f, n);
        final float n4 = (float)Class7640.method24095(10.0, n2) * method24154;
        return (float)method35275(n * n4, method24154, n3) / n4;
    }
    
    private static double method35275(double n, final double n2, final int i) throws MathArithmeticException, MathIllegalArgumentException {
        switch (i) {
            case 2: {
                if (n2 == -1.0) {
                    n = Class7640.method24123(Class7640.method24121(n, Double.NEGATIVE_INFINITY));
                    break;
                }
                n = Class7640.method24124(Class7640.method24121(n, Double.POSITIVE_INFINITY));
                break;
            }
            case 1: {
                n = Class7640.method24123(Class7640.method24121(n, Double.NEGATIVE_INFINITY));
                break;
            }
            case 3: {
                if (n2 == -1.0) {
                    n = Class7640.method24124(Class7640.method24121(n, Double.POSITIVE_INFINITY));
                    break;
                }
                n = Class7640.method24123(Class7640.method24121(n, Double.NEGATIVE_INFINITY));
                break;
            }
            case 5: {
                n = Class7640.method24121(n, Double.NEGATIVE_INFINITY);
                if (n - Class7640.method24123(n) > 0.5) {
                    n = Class7640.method24124(n);
                    break;
                }
                n = Class7640.method24123(n);
                break;
            }
            case 6: {
                final double n3 = n - Class7640.method24123(n);
                if (n3 > 0.5) {
                    n = Class7640.method24124(n);
                    break;
                }
                if (n3 < 0.5) {
                    n = Class7640.method24123(n);
                    break;
                }
                if (Class7640.method24123(n) / 2.0 == Class7640.method24123(Class7640.method24123(n) / 2.0)) {
                    n = Class7640.method24123(n);
                    break;
                }
                n = Class7640.method24124(n);
                break;
            }
            case 4: {
                n = Class7640.method24121(n, Double.POSITIVE_INFINITY);
                if (n - Class7640.method24123(n) >= 0.5) {
                    n = Class7640.method24124(n);
                    break;
                }
                n = Class7640.method24123(n);
                break;
            }
            case 7: {
                if (n != Class7640.method24123(n)) {
                    throw new Class2376();
                }
                break;
            }
            case 0: {
                if (n != Class7640.method24123(n)) {
                    n = Class7640.method24124(Class7640.method24121(n, Double.POSITIVE_INFINITY));
                    break;
                }
                break;
            }
            default: {
                throw new Class2374(Class2189.field13110, i, "ROUND_CEILING", 2, "ROUND_DOWN", 1, "ROUND_FLOOR", 3, "ROUND_HALF_DOWN", 5, "ROUND_HALF_EVEN", 6, "ROUND_HALF_UP", 4, "ROUND_UNNECESSARY", 7, "ROUND_UP", 0);
            }
        }
        return n;
    }
    
    public static double method35276(final double n, final double n2) {
        return n + n2 - n;
    }
    
    static {
        field40744 = Double.doubleToRawLongBits(0.0);
        field40745 = Double.doubleToRawLongBits(-0.0);
        field40746 = Float.floatToRawIntBits(0.0f);
        field40747 = Float.floatToRawIntBits(-0.0f);
        field40738 = Double.longBitsToDouble(4368491638549381120L);
        field40739 = Double.longBitsToDouble(4503599627370496L);
    }
}
