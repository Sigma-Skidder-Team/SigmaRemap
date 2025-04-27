// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.lang.reflect.Constructor;

public class Class7193<T extends Class5783>
{
    private static Class7193<?>[] field27947;
    public static final Class7193<Class5788> field27948;
    public static final Class7193<Class5786> field27949;
    public static final Class7193<Class5790> field27950;
    public static final Class7193<Class5787> field27951;
    public static final Class7193<Class5796> field27952;
    public static final Class7193<Class5793> field27953;
    public static final Class7193<Class5794> field27954;
    public static final Class7193<Class5792> field27955;
    public static final Class7193<Class5785> field27956;
    public static final Class7193<Class5789> field27957;
    public static final Class7193<Class5795> field27958;
    private final Class<? extends Class5783> field27959;
    private final int field27960;
    private final String field27961;
    
    private Class7193(final int field27960, final Class<? extends Class5783> field27961, final String field27962) {
        this.field27960 = field27960;
        this.field27959 = field27961;
        this.field27961 = field27962;
    }
    
    public Class5783 method22075(final Class852 class852) {
        try {
            return this.method22076().newInstance(class852);
        }
        catch (final Exception cause) {
            throw new Error(cause);
        }
    }
    
    public Constructor<? extends Class5783> method22076() throws NoSuchMethodException {
        return this.field27959.getConstructor(Class852.class);
    }
    
    public int method22077() {
        return this.field27960;
    }
    
    @Override
    public String toString() {
        return this.field27961 + " (#" + this.field27960 + ")";
    }
    
    public static Class7193<?> method22078(final int n) {
        return (n >= 0 && n < Class7193.field27947.length) ? Class7193.field27947[n] : Class7193.field27948;
    }
    
    public static int method22079() {
        return Class7193.field27947.length;
    }
    
    private static <T extends Class5783> Class7193<T> method22080(final Class<T> clazz, final String s) {
        final Class7193 class7193 = new Class7193(Class7193.field27947.length, clazz, s);
        Class7193.field27947 = Arrays.copyOf(Class7193.field27947, Class7193.field27947.length + 1);
        return (Class7193<T>)(Class7193.field27947[class7193.method22077()] = class7193);
    }
    
    static {
        Class7193.field27947 = new Class7193[0];
        field27948 = method22080(Class5788.class, "HoldingPattern");
        field27949 = method22080(Class5786.class, "StrafePlayer");
        field27950 = method22080(Class5790.class, "LandingApproach");
        field27951 = method22080(Class5787.class, "Landing");
        field27952 = method22080(Class5796.class, "Takeoff");
        field27953 = method22080(Class5793.class, "SittingFlaming");
        field27954 = method22080(Class5794.class, "SittingScanning");
        field27955 = method22080(Class5792.class, "SittingAttacking");
        field27956 = method22080(Class5785.class, "ChargingPlayer");
        field27957 = method22080(Class5789.class, "Dying");
        field27958 = method22080(Class5795.class, "Hover");
    }
}
