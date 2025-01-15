// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.invoke.MethodHandles;
import org.lwjgl.system.Pointer;
import java.lang.invoke.MethodHandle;

public class Class7308
{
    private static final MethodHandle field28290;
    
    public static void method22414(final long n) {
        if (Class7308.field28290 != null) {
            try {
                Class7308.field28290.invoke(n);
            }
            catch (final Throwable cause) {
                throw new RuntimeException(cause);
            }
        }
    }
    
    public static void method22415(final Pointer pointer) {
        method22414(pointer.address());
    }
    
    static {
        field28290 = Class8543.method28674(() -> {
            try {
                MethodHandles.lookup();
                Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
                final Class clazz;
                clazz.getDeclaredMethod("untrack", Long.TYPE);
                final Method m;
                m.setAccessible(true);
                Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
                final Field field28291;
                field28291.setAccessible(true);
                final MethodHandles.Lookup lookup;
                return clazz.isInstance(field28291.get(null)) ? lookup.unreflect(m) : null;
            }
            catch (final NoSuchMethodException | NoSuchFieldException | IllegalAccessException | ClassNotFoundException cause) {
                throw new RuntimeException((Throwable)cause);
            }
        });
    }
}
