// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Deprecated
public class Class7967 extends Class7966
{
    private Method field32736;
    private Object field32737;
    
    private static boolean method25815(final Method method) {
        for (final Class<?> clazz : method.getParameterTypes()) {
            if (!clazz.isPrimitive() && clazz != String.class) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean method25816(final Method method) {
        return method.getDeclaringClass().isAnnotationPresent(Class6756.class) && method.isAnnotationPresent(Class6758.class) && method25815(method);
    }
    
    public Class7967(final Method field32736, final Object field32737) {
        this.field32736 = field32736;
        this.field32737 = field32737;
        final String method20571 = field32736.getAnnotation(Class6758.class).method20571();
        this.field32735 = method20571;
        if (Class8272.method27500(method20571)) {
            this.field32735 = field32736.getName();
        }
    }
    
    private Object method25817(final String[] array, final int n, final Class clazz) {
        if (n >= array.length) {
            return null;
        }
        if (clazz == Byte.TYPE) {
            return Byte.parseByte(array[n]);
        }
        if (clazz == Character.TYPE) {
            return array[n].charAt(0);
        }
        if (clazz == Short.TYPE) {
            return Short.parseShort(array[n]);
        }
        if (clazz == Integer.TYPE) {
            return Integer.parseInt(array[n]);
        }
        if (clazz == Long.TYPE) {
            return Long.parseLong(array[n]);
        }
        if (clazz == Float.TYPE) {
            return Float.parseFloat(array[n]);
        }
        if (clazz == Double.TYPE) {
            return Double.parseDouble(array[n]);
        }
        if (clazz != String.class && clazz != Object.class) {
            return null;
        }
        return array[n];
    }
    
    @Override
    public void method25811(final String s, final String... array) {
        try {
            if (array.length == 0) {
                this.field32736.invoke(this.field32737, new Object[0]);
            }
            else {
                final Object[] args = new Object[array.length];
                for (int i = 0; i < args.length; ++i) {
                    args[i] = this.method25817(array, i, this.field32736.getParameterTypes()[i]);
                }
                this.field32736.invoke(this.field32737, args);
            }
        }
        catch (final IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Class9463.method35173().method35187().method20242("Unable to invoke " + this.field32737.getClass().getName() + "::" + this.field32736.getName());
            ((Throwable)ex).printStackTrace();
        }
    }
    
    @Override
    public String method25813(final String str, final String... array) {
        final StringBuilder sb = new StringBuilder(str);
        int i;
        for (i = 0; i < array.length; ++i) {
            if (i >= this.field32736.getParameterCount()) {
                break;
            }
            sb.append(" ").append(array[i]);
        }
        while (i < this.field32736.getParameterCount()) {
            sb.append(" ").append(Class7965.method25812(this.field32736.getParameterTypes()[i]));
            ++i;
        }
        return sb.toString();
    }
}
