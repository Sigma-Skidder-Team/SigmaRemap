// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6882
{
    private static String[] field26966;
    
    private static double method21084(double n) {
        n %= 6.283185307179586;
        if (Math.abs(n) > 3.141592653589793) {
            n -= 6.283185307179586;
        }
        if (Math.abs(n) > 1.5707963267948966) {
            n = 3.141592653589793 - n;
        }
        return n;
    }
    
    public static double method21085(double method21084) {
        method21084 = method21084(method21084);
        if (Math.abs(method21084) > 0.7853981633974483) {
            return Math.cos(1.5707963267948966 - method21084);
        }
        return Math.sin(method21084);
    }
    
    public static double method21086(final double n) {
        return method21085(n + 1.5707963267948966);
    }
}
