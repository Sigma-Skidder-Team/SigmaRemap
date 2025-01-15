// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public final class Class386 extends Class385 implements AutoCloseable
{
    private static String[] field2242;
    private boolean field2243;
    private static final List<Class386> field2244;
    
    private Class386(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    public static Class386 method1296() {
        return method1299(0, 0, 0);
    }
    
    public static Class386 method1297(final Class399 class399) {
        return method1298(class399.method1938(), class399.method1941(), class399.method1945());
    }
    
    public static Class386 method1298(final double n, final double n2, final double n3) {
        return method1299(Class9546.method35644(n), Class9546.method35644(n2), Class9546.method35644(n3));
    }
    
    public static Class386 method1299(final int n, final int n2, final int n3) {
        synchronized (Class386.field2244) {
            if (!Class386.field2244.isEmpty()) {
                final Class386 class386 = Class386.field2244.remove(Class386.field2244.size() - 1);
                if (class386 != null && class386.field2243) {
                    class386.field2243 = false;
                    class386.method1300(n, n2, n3);
                    return class386;
                }
            }
        }
        return new Class386(n, n2, n3);
    }
    
    public Class386 method1300(final int n, final int n2, final int n3) {
        return (Class386)super.method1284(n, n2, n3);
    }
    
    public Class386 method1301(final Class399 class399) {
        return (Class386)super.method1285(class399);
    }
    
    public Class386 method1302(final double n, final double n2, final double n3) {
        return (Class386)super.method1286(n, n2, n3);
    }
    
    public Class386 method1303(final Class352 class352) {
        return (Class386)super.method1287(class352);
    }
    
    public Class386 method1304(final Class179 class179) {
        return (Class386)super.method1290(class179);
    }
    
    public Class386 method1305(final Class179 class179, final int n) {
        return (Class386)super.method1291(class179, n);
    }
    
    public Class386 method1306(final int n, final int n2, final int n3) {
        return (Class386)super.method1292(n, n2, n3);
    }
    
    @Override
    public void close() {
        synchronized (Class386.field2244) {
            if (Class386.field2244.size() < 100) {
                Class386.field2244.add(this);
            }
            this.field2243 = true;
        }
    }
    
    static {
        field2244 = Lists.newArrayList();
    }
}
