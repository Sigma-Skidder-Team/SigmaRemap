// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Collection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class Class1936 extends Class1935
{
    private static final Logger field10559;
    public Class<?> field10560;
    private final String field10561;
    private final String field10562;
    private transient Method field10563;
    private transient Method field10564;
    private Field field10565;
    public Class<?>[] field10566;
    private Class1935 field10567;
    private boolean field10568;
    
    public Class1936(final String s, final Class<?> clazz, final String field10561, final String field10562, final Class<?>... array) {
        super(s, clazz);
        this.field10561 = field10561;
        this.field10562 = field10562;
        this.method7830(array);
        this.field10568 = false;
    }
    
    public Class1936(final String s, final Class<?> clazz, final Class<?>... array) {
        this(s, clazz, null, (String)null, array);
    }
    
    @Override
    public Class<?>[] method7822() {
        if (this.field10566 == null && this.field10567 != null) {
            return this.field10567.method7822();
        }
        return this.field10566;
    }
    
    public void method7830(final Class<?>... field10566) {
        if (field10566 != null && field10566.length > 0) {
            this.field10566 = field10566;
        }
        else {
            this.field10566 = null;
        }
    }
    
    @Override
    public void method7826(final Object o, final Object value) throws Exception {
        if (this.field10564 == null) {
            if (this.field10565 == null) {
                if (this.field10567 == null) {
                    Class1936.field10559.warning("No setter/delegate for '" + this.method7823() + "' on object " + o);
                }
                else {
                    this.field10567.method7826(o, value);
                }
            }
            else {
                this.field10565.set(o, value);
            }
        }
        else if (this.field10568) {
            if (value != null) {
                if (!(value instanceof Collection)) {
                    if (!(value instanceof Map)) {
                        if (value.getClass().isArray()) {
                            for (int length = Array.getLength(value), i = 0; i < length; ++i) {
                                this.field10564.invoke(o, Array.get(value, i));
                            }
                        }
                    }
                    else {
                        for (final Map.Entry<Object, V> entry : ((Map)value).entrySet()) {
                            this.field10564.invoke(o, entry.getKey(), entry.getValue());
                        }
                    }
                }
                else {
                    final Iterator iterator2 = ((Collection)value).iterator();
                    while (iterator2.hasNext()) {
                        this.field10564.invoke(o, iterator2.next());
                    }
                }
            }
        }
        else {
            this.field10564.invoke(o, value);
        }
    }
    
    @Override
    public Object method7827(final Object o) {
        try {
            if (this.field10563 != null) {
                return this.field10563.invoke(o, new Object[0]);
            }
            if (this.field10565 != null) {
                return this.field10565.get(o);
            }
        }
        catch (final Exception obj) {
            throw new Class2386("Unable to find getter for property '" + this.method7823() + "' on object " + o + ":" + obj);
        }
        if (this.field10567 != null) {
            return this.field10567.method7827(o);
        }
        throw new Class2386("No getter or delegate for property '" + this.method7823() + "' on object " + o);
    }
    
    @Override
    public List<Annotation> method7828() {
        Annotation[] a = null;
        if (this.field10563 == null) {
            if (this.field10565 != null) {
                a = this.field10565.getAnnotations();
            }
        }
        else {
            a = this.field10563.getAnnotations();
        }
        return (a == null) ? this.field10567.method7828() : Arrays.asList(a);
    }
    
    @Override
    public <A extends Annotation> A method7829(final Class<A> clazz) {
        Annotation annotation;
        if (this.field10563 == null) {
            if (this.field10565 == null) {
                annotation = this.field10567.method7829(clazz);
            }
            else {
                annotation = this.field10565.getAnnotation(clazz);
            }
        }
        else {
            annotation = this.field10563.getAnnotation(clazz);
        }
        return (A)annotation;
    }
    
    public void method7831(final Class<?> field10560) {
        if (this.field10560 != field10560) {
            this.field10560 = field10560;
            final String method7823 = this.method7823();
            for (Class<?> superclass = field10560; superclass != null; superclass = superclass.getSuperclass()) {
                final Field[] declaredFields = superclass.getDeclaredFields();
                final int length = declaredFields.length;
                int i = 0;
                while (i < length) {
                    final Field field10561 = declaredFields[i];
                    if (!field10561.getName().equals(method7823)) {
                        ++i;
                    }
                    else {
                        final int modifiers = field10561.getModifiers();
                        if (Modifier.isStatic(modifiers)) {
                            break;
                        }
                        if (Modifier.isTransient(modifiers)) {
                            break;
                        }
                        field10561.setAccessible(true);
                        this.field10565 = field10561;
                        break;
                    }
                }
            }
            if (this.field10565 == null) {
                if (Class1936.field10559.isLoggable(Level.FINE)) {
                    Class1936.field10559.fine(String.format("Failed to find field for %s.%s", field10560.getName(), this.method7823()));
                }
            }
            if (this.field10561 != null) {
                this.field10563 = this.method7832(field10560, this.field10561, (Class<?>[])new Class[0]);
            }
            if (this.field10562 != null) {
                this.field10568 = false;
                this.field10564 = this.method7832(field10560, this.field10562, this.method7821());
                if (this.field10564 == null) {
                    if (this.field10566 != null) {
                        this.field10568 = true;
                        this.field10564 = this.method7832(field10560, this.field10562, this.field10566);
                    }
                }
            }
        }
    }
    
    private Method method7832(final Class<?> clazz, final String s, final Class<?>... array) {
        for (Class<?> superclass = clazz; superclass != null; superclass = superclass.getSuperclass()) {
            for (final Method method : superclass.getDeclaredMethods()) {
                if (s.equals(method.getName())) {
                    final Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == array.length) {
                        int n = 1;
                        for (int j = 0; j < parameterTypes.length; ++j) {
                            if (!parameterTypes[j].isAssignableFrom(array[j])) {
                                n = 0;
                            }
                        }
                        if (n != 0) {
                            method.setAccessible(true);
                            return method;
                        }
                    }
                }
            }
        }
        if (Class1936.field10559.isLoggable(Level.FINE)) {
            Class1936.field10559.fine(String.format("Failed to find [%s(%d args)] for %s.%s", s, array.length, this.field10560.getName(), this.method7823()));
        }
        return null;
    }
    
    @Override
    public String method7823() {
        final String method7823 = super.method7823();
        if (method7823 == null) {
            return (this.field10567 == null) ? null : this.field10567.method7823();
        }
        return method7823;
    }
    
    @Override
    public Class<?> method7821() {
        final Class<?> method7821 = super.method7821();
        if (method7821 == null) {
            return (this.field10567 == null) ? null : this.field10567.method7821();
        }
        return method7821;
    }
    
    @Override
    public boolean method7825() {
        if (this.field10563 == null) {
            if (this.field10565 == null) {
                if (this.field10567 == null || !this.field10567.method7825()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method7824() {
        if (this.field10564 == null) {
            if (this.field10565 == null) {
                if (this.field10567 == null || !this.field10567.method7824()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void method7833(final Class1935 field10567) {
        this.field10567 = field10567;
        if (this.field10562 != null) {
            if (this.field10564 == null) {
                if (!this.field10568) {
                    this.field10568 = true;
                    this.field10564 = this.method7832(this.field10560, this.field10562, this.method7822());
                }
            }
        }
    }
    
    static {
        field10559 = Logger.getLogger(Class1936.class.getPackage().getName());
    }
}
