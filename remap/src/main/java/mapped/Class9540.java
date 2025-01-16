// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9540
{
    public static final int field41061 = 0;
    public static final int field41062 = 1;
    public static final int field41063 = 2;
    public static final int field41064 = 3;
    public static final int field41065 = 4;
    public static final int field41066 = 5;
    public static final int field41067 = 6;
    public static final int field41068 = 7;
    public static final int field41069 = 8;
    public static final int field41070 = 1;
    
    public static int method35615(String trim) {
        if (trim == null) {
            return 1;
        }
        trim = trim.toLowerCase().trim();
        if (trim.equals("alpha")) {
            return 0;
        }
        if (trim.equals("add")) {
            return 1;
        }
        if (trim.equals("subtract")) {
            return 2;
        }
        if (trim.equals("multiply")) {
            return 3;
        }
        if (trim.equals("dodge")) {
            return 4;
        }
        if (trim.equals("burn")) {
            return 5;
        }
        if (trim.equals("screen")) {
            return 6;
        }
        if (trim.equals("overlay")) {
            return 7;
        }
        if (!trim.equals("replace")) {
            Config.warn("Unknown blend: " + trim);
            return 1;
        }
        return 8;
    }
    
    public static void method35616(final int n, final float n2) {
        switch (n) {
            case 0: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(770, 771);
                Class8933.method31646(1.0f, 1.0f, 1.0f, n2);
                break;
            }
            case 1: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(770, 1);
                Class8933.method31646(1.0f, 1.0f, 1.0f, n2);
                break;
            }
            case 2: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(775, 0);
                Class8933.method31646(n2, n2, n2, 1.0f);
                break;
            }
            case 3: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(774, 771);
                Class8933.method31646(n2, n2, n2, n2);
                break;
            }
            case 4: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(1, 1);
                Class8933.method31646(n2, n2, n2, 1.0f);
                break;
            }
            case 5: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(0, 769);
                Class8933.method31646(n2, n2, n2, 1.0f);
                break;
            }
            case 6: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(1, 769);
                Class8933.method31646(n2, n2, n2, 1.0f);
                break;
            }
            case 7: {
                Class8933.method31502();
                Class8933.method31519();
                Class8933.method31520(774, 768);
                Class8933.method31646(n2, n2, n2, 1.0f);
                break;
            }
            case 8: {
                Class8933.method31503();
                Class8933.method31518();
                Class8933.method31646(1.0f, 1.0f, 1.0f, n2);
                break;
            }
        }
        Class8933.method31609();
    }
    
    public static void method35617(final float n) {
        Class8933.method31502();
        Class8933.method31519();
        Class8933.method31520(770, 1);
        Class8933.method31646(1.0f, 1.0f, 1.0f, n);
    }
}
