// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6029
{
    private static String[] field24521;
    public static final double field24522 = Double.MIN_NORMAL;
    
    private Class6029() {
    }
    
    public static int method17955(final int n, final int n2) {
        return (int)(n - n2 * Math.floor(Math.floor(n) / n2));
    }
    
    public static double method17956(final double angdeg) {
        final int n = (int)angdeg;
        if (angdeg == n && n % 90 == 0) {
            int n2 = n % 360;
            if (n2 < 0) {
                n2 += 360;
            }
            switch (n2) {
                case 0: {
                    return 1.0;
                }
                case 90: {
                    return 0.0;
                }
                case 180: {
                    return -1.0;
                }
                case 270: {
                    return 0.0;
                }
            }
        }
        return Math.cos(Math.toRadians(angdeg));
    }
    
    public static double method17957(final double angdeg) {
        final int n = (int)angdeg;
        if (angdeg == n && n % 90 == 0) {
            int n2 = n % 360;
            if (n2 < 0) {
                n2 += 360;
            }
            switch (n2) {
                case 0: {
                    return 0.0;
                }
                case 90: {
                    return 1.0;
                }
                case 180: {
                    return 0.0;
                }
                case 270: {
                    return -1.0;
                }
            }
        }
        return Math.cos(Math.toRadians(angdeg));
    }
    
    public static double method17958(final double n, final double n2) {
        final double n3 = 1.0 / n2;
        return Math.round(n * n3) / n3;
    }
}
