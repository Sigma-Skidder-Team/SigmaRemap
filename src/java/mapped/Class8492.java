// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8492
{
    private static boolean field34865;
    private static long field34866;
    private static int field34867;
    private static int field34868;
    private static boolean field34869;
    private static boolean field34870;
    private static final long field34871 = 3000L;
    private static final int field34872 = 10;
    
    public static void method28377() {
        Class8492.field34865 = true;
        if (Class8492.field34866 < 0L) {
            Class8492.field34866 = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > Class8492.field34866 + 3000L) {
            if (Class8492.field34868 > 0) {
                Class8571.method28850("Suppressed " + Class8492.field34867 + " OpenGL errors");
            }
            Class8492.field34869 = (Class8492.field34867 > 10);
            Class8492.field34866 = System.currentTimeMillis();
            Class8492.field34867 = 0;
            Class8492.field34868 = 0;
            Class8492.field34870 = true;
        }
    }
    
    public static boolean method28378(final int n) {
        if (!Class8492.field34865) {
            return true;
        }
        ++Class8492.field34867;
        if (!Class8492.field34870) {
            if (Class8492.field34869) {
                ++Class8492.field34868;
            }
            return !Class8492.field34869;
        }
        Class8492.field34870 = false;
        return true;
    }
    
    static {
        Class8492.field34865 = false;
        Class8492.field34866 = -1L;
        Class8492.field34867 = 0;
        Class8492.field34868 = 0;
        Class8492.field34869 = false;
        Class8492.field34870 = false;
    }
}
