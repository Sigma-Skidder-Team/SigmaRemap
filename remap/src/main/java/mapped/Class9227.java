// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Method;

public final class Class9227
{
    private final Method field39572;
    private final Method field39573;
    private final Method field39574;
    
    public Class9227(final Method field39572, final Method field39573, final Method field39574) {
        this.field39572 = field39572;
        this.field39573 = field39573;
        this.field39574 = field39574;
    }
    
    public Object method34029(final String s) {
        if (this.field39572 != null) {
            try {
                final Object invoke = this.field39572.invoke(null, new Object[0]);
                this.field39573.invoke(invoke, s);
                return invoke;
            }
            catch (final Exception ex) {}
        }
        return null;
    }
    
    public boolean method34030(final Object obj) {
        boolean b = false;
        if (obj != null) {
            try {
                this.field39574.invoke(obj, new Object[0]);
                b = true;
            }
            catch (final Exception ex) {}
        }
        return b;
    }
    
    public static Class9227 method34031() {
        Method method;
        Method method2;
        Method method3;
        try {
            final Class<?> forName = Class.forName("dalvik.system.CloseGuard");
            method = forName.getMethod("get", (Class[])new Class[0]);
            method2 = forName.getMethod("open", String.class);
            method3 = forName.getMethod("warnIfOpen", (Class[])new Class[0]);
        }
        catch (final Exception ex) {
            method = null;
            method2 = null;
            method3 = null;
        }
        return new Class9227(method, method2, method3);
    }
}
