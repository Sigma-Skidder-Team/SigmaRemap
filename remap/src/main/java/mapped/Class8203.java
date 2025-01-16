// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.LongSupplier;

public class Class8203
{
    private static long field33729;
    private static LongSupplier field33730;
    private static LongSupplier field33731;
    
    public static long method27170() {
        return (Class8203.field33730 != null) ? Class8203.field33730.getAsLong() : -1L;
    }
    
    public static long method27171() {
        return (Class8203.field33731 != null) ? Class8203.field33731.getAsLong() : -1L;
    }
    
    public static synchronized void method27172(final Class1846 class1846) {
        Class8203.field33729 += class1846.method6676();
    }
    
    public static synchronized void method27173(final Class1846 class1846) {
        Class8203.field33729 -= class1846.method6676();
    }
    
    public static long method27174() {
        return Class8203.field33729;
    }
    
    private static LongSupplier method27175(final String[][] array) {
        final ArrayList list = new ArrayList();
        int i = 0;
        while (i < array.length) {
            final String[] array2 = array[i];
            try {
                return method27176(array2);
            }
            catch (final Throwable t) {
                list.add(t);
                ++i;
                continue;
            }
            break;
        }
        for (final Throwable t2 : list) {
            Config.warn("" + t2.getClass().getName() + ": " + t2.getMessage());
        }
        return null;
    }
    
    private static LongSupplier method27176(final String[] array) throws Exception {
        if (array.length >= 2) {
            Method method = Class.forName(array[0]).getMethod(array[1], (Class<?>[])new Class[0]);
            method.setAccessible(true);
            Object invoke = null;
            for (int i = 2; i < array.length; ++i) {
                final String name = array[i];
                invoke = method.invoke(invoke, new Object[0]);
                method = invoke.getClass().getMethod(name, (Class<?>[])new Class[0]);
                method.setAccessible(true);
            }
            return new Class7381(method, invoke);
        }
        return null;
    }
    
    static {
        Class8203.field33729 = 0L;
        Class8203.field33730 = method27175(new String[][] { { "sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed" }, { "jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed" } });
        Class8203.field33731 = method27175(new String[][] { { "sun.misc.VM", "maxDirectMemory" }, { "jdk.internal.misc.VM", "maxDirectMemory" } });
    }
}
