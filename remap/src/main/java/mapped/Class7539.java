// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class7539<T>
{
    private final Class<?> field29920;
    private final String field29921;
    private final Class[] field29922;
    
    public Class7539(final Class<?> field29920, final String field29921, final Class... field29922) {
        this.field29920 = field29920;
        this.field29921 = field29921;
        this.field29922 = field29922;
    }
    
    public boolean method23619(final T t) {
        return this.method23624(t.getClass()) != null;
    }
    
    public Object method23620(final T obj, final Object... args) throws InvocationTargetException {
        final Method method23624 = this.method23624(obj.getClass());
        if (method23624 == null) {
            return null;
        }
        try {
            return method23624.invoke(obj, args);
        }
        catch (final IllegalAccessException ex) {
            return null;
        }
    }
    
    public Object method23621(final T t, final Object... array) {
        Throwable targetException;
        try {
            return this.method23620(t, array);
        }
        catch (final InvocationTargetException ex) {
            targetException = ex.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw (RuntimeException)targetException;
            }
        }
        final AssertionError assertionError = new AssertionError("Unexpected exception");
        assertionError.initCause(targetException);
        throw assertionError;
    }
    
    public Object method23622(final T t, final Object... args) throws InvocationTargetException {
        final Method method23624 = this.method23624(t.getClass());
        if (method23624 == null) {
            throw new AssertionError("Method " + this.field29921 + " not supported for object " + t);
        }
        try {
            return method23624.invoke(t, args);
        }
        catch (final IllegalAccessException cause) {
            final AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + method23624);
            assertionError.initCause(cause);
            throw assertionError;
        }
    }
    
    public Object method23623(final T t, final Object... array) {
        Throwable targetException;
        try {
            return this.method23622(t, array);
        }
        catch (final InvocationTargetException ex) {
            targetException = ex.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw (RuntimeException)targetException;
            }
        }
        final AssertionError assertionError = new AssertionError("Unexpected exception");
        assertionError.initCause(targetException);
        throw assertionError;
    }
    
    private Method method23624(final Class<?> clazz) {
        Method method23625 = null;
        if (this.field29921 != null) {
            method23625 = method23625(clazz, this.field29921, this.field29922);
            if (method23625 != null) {
                if (this.field29920 != null) {
                    if (!this.field29920.isAssignableFrom(method23625.getReturnType())) {
                        method23625 = null;
                    }
                }
            }
        }
        return method23625;
    }
    
    private static Method method23625(final Class<?> clazz, final String name, final Class[] parameterTypes) {
        Method method = null;
        try {
            method = clazz.getMethod(name, parameterTypes);
            if ((method.getModifiers() & 0x1) == 0x0) {
                method = null;
            }
        }
        catch (final NoSuchMethodException ex) {}
        return method;
    }
}
