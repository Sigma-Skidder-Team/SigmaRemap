// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Class8597
{
    private static String[] field36105;
    
    public static Object method29119(final Class<?> clazz, final String name) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return clazz.getDeclaredMethod(name, (Class<?>[])new Class[0]).invoke(null, new Object[0]);
    }
    
    public static Object method29120(final Object obj, final String name) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return obj.getClass().getDeclaredMethod(name, (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
    }
    
    public static <T> T method29121(final Class<?> clazz, final String name, final Class<T> clazz2) throws NoSuchFieldException, IllegalAccessException {
        final Field declaredField = clazz.getDeclaredField(name);
        declaredField.setAccessible(true);
        return (T)declaredField.get(null);
    }
    
    public static void method29122(final Class<?> clazz, final String name, final Object value) throws NoSuchFieldException, IllegalAccessException {
        final Field declaredField = clazz.getDeclaredField(name);
        declaredField.setAccessible(true);
        declaredField.set(null, value);
    }
    
    public static <T> T method29123(final Object obj, final String name, final Class<T> clazz) throws NoSuchFieldException, IllegalAccessException {
        final Field declaredField = obj.getClass().getSuperclass().getDeclaredField(name);
        declaredField.setAccessible(true);
        return (T)declaredField.get(obj);
    }
    
    public static <T> T method29124(final Object obj, final Class<?> clazz, final String name, final Class<T> clazz2) throws NoSuchFieldException, IllegalAccessException {
        final Field declaredField = clazz.getDeclaredField(name);
        declaredField.setAccessible(true);
        return (T)declaredField.get(obj);
    }
    
    public static <T> T method29125(final Object obj, final String name, final Class<T> clazz) throws NoSuchFieldException, IllegalAccessException {
        final Field declaredField = obj.getClass().getDeclaredField(name);
        declaredField.setAccessible(true);
        return (T)declaredField.get(obj);
    }
    
    public static <T> T method29126(final Object obj, final String name, final Class<T> clazz) throws NoSuchFieldException, IllegalAccessException {
        final Field field = obj.getClass().getField(name);
        field.setAccessible(true);
        return (T)field.get(obj);
    }
    
    public static void method29127(final Object obj, final String name, final Object value) throws NoSuchFieldException, IllegalAccessException {
        final Field declaredField = obj.getClass().getDeclaredField(name);
        declaredField.setAccessible(true);
        declaredField.set(obj, value);
    }
}
