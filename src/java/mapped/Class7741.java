// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7741
{
    private static String[] field31639;
    private static long field31640;
    private static long field31641;
    private static long field31642;
    private static long field31643;
    private static boolean field31644;
    private static int field31645;
    private static long field31646;
    
    public static void method24700() {
        final long currentTimeMillis = System.currentTimeMillis();
        final long method24701 = method24701();
        if (Class7741.field31644 = (method24701 < Class7741.field31643)) {
            final int field31645 = (int)((Class7741.field31643 - Class7741.field31641) / ((Class7741.field31642 - Class7741.field31640) / 1000.0));
            if (field31645 > 0) {
                Class7741.field31645 = field31645;
            }
            Class7741.field31640 = currentTimeMillis;
            Class7741.field31641 = method24701;
        }
        Class7741.field31642 = currentTimeMillis;
        Class7741.field31643 = method24701;
    }
    
    private static long method24701() {
        final Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
    
    public static long method24702() {
        return Class7741.field31640;
    }
    
    public static long method24703() {
        return Class7741.field31641 / Class7741.field31646;
    }
    
    public static boolean method24704() {
        return Class7741.field31644;
    }
    
    public static long method24705() {
        return Class7741.field31645 / Class7741.field31646;
    }
    
    static {
        Class7741.field31640 = System.currentTimeMillis();
        Class7741.field31641 = method24701();
        Class7741.field31642 = Class7741.field31640;
        Class7741.field31643 = Class7741.field31641;
        Class7741.field31644 = false;
        Class7741.field31645 = 0;
        Class7741.field31646 = 1048576L;
    }
}
