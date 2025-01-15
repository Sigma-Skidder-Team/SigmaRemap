// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;
import com.google.common.collect.Maps;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Map;

public final class Class7273
{
    private static String[] field28172;
    private final Class<?> field28173;
    private final Map<String, Field> field28174;
    private final Map<String, Method> field28175;
    
    public Class7273(final Class<?> clazz) {
        this(clazz, true);
    }
    
    public Class7273(final Class<?> field28173, final boolean b) {
        this.field28174 = Maps.newConcurrentMap();
        this.field28175 = Maps.newConcurrentMap();
        this.method22284(this.field28173 = field28173, b);
        this.method22285(field28173, b);
    }
    
    private void method22284(final Class<?> clazz, final boolean b) {
        if (clazz.getSuperclass() != null) {
            if (b) {
                this.method22284(clazz.getSuperclass(), true);
            }
        }
        for (final Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            this.field28174.put(field.getName(), field);
        }
    }
    
    private void method22285(final Class<?> clazz, final boolean b) {
        if (clazz.getSuperclass() != null) {
            if (b) {
                this.method22285(clazz.getSuperclass(), true);
            }
        }
        for (final Method method : clazz.getDeclaredMethods()) {
            method.setAccessible(true);
            this.field28175.put(method.getName(), method);
        }
    }
    
    public Object method22286() throws IllegalAccessException, InstantiationException {
        return this.field28173.newInstance();
    }
    
    public Field method22287(final String s) {
        return this.field28174.get(s);
    }
    
    public void method22288(final String s, final Object obj, final Object value) throws IllegalAccessException {
        this.method22287(s).set(obj, value);
    }
    
    public <T> T method22289(final String s, final Object obj, final Class<T> clazz) throws IllegalAccessException {
        return clazz.cast(this.method22287(s).get(obj));
    }
    
    public <T> T method22290(final Class<T> clazz, final String s, final Object obj, final Object... args) throws InvocationTargetException, IllegalAccessException {
        return clazz.cast(this.method22291(s).invoke(obj, args));
    }
    
    public Method method22291(final String s) {
        return this.field28175.get(s);
    }
    
    public Collection<Field> method22292() {
        return Collections.unmodifiableCollection((Collection<? extends Field>)this.field28174.values());
    }
    
    public Collection<Method> method22293() {
        return Collections.unmodifiableCollection((Collection<? extends Method>)this.field28175.values());
    }
}
