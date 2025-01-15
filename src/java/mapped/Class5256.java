// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Field;

public class Class5256
{
    private static String[] field22287;
    
    private Class5256() {
    }
    
    public static Field method16362(final Class clazz, final Class clazz2) {
        try {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; ++i) {
                final Field field = declaredFields[i];
                if (field.getType() == clazz2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            return null;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static Field[] method16363(final Class clazz, final Class clazz2) {
        try {
            return method16364(clazz.getDeclaredFields(), clazz2);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static Field[] method16364(final Field[] array, final Class clazz) {
        try {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < array.length; ++i) {
                final Field field = array[i];
                if (field.getType() == clazz) {
                    field.setAccessible(true);
                    list.add(field);
                }
            }
            return (Field[])list.toArray(new Field[list.size()]);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static Field[] method16365(final Class clazz, final Field field, final Class clazz2) {
        try {
            final List<Field> list = Arrays.asList(clazz.getDeclaredFields());
            final int index = list.indexOf(field);
            if (index < 0) {
                return new Field[0];
            }
            final List subList = list.subList(index + 1, list.size());
            return method16364((Field[])subList.toArray(new Field[subList.size()]), clazz2);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static Field[] method16366(final Object obj, final Field[] array, final Class clazz, final Object obj2) {
        try {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < array.length; ++i) {
                final Field field = array[i];
                if (field.getType() == clazz) {
                    final boolean static1 = Modifier.isStatic(field.getModifiers());
                    if ((obj != null || static1) && (obj == null || !static1)) {
                        field.setAccessible(true);
                        final Object value = field.get(obj);
                        if (value == obj2) {
                            list.add(field);
                        }
                        else if (value != null && obj2 != null && value.equals(obj2)) {
                            list.add(field);
                        }
                    }
                }
            }
            return (Field[])list.toArray(new Field[list.size()]);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static Field method16367(final Class clazz, final Class clazz2, final int n) {
        final Field[] method16363 = method16363(clazz, clazz2);
        return (n >= 0 && n < method16363.length) ? method16363[n] : null;
    }
    
    public static Field method16368(final Class clazz, final Field field, final Class clazz2, final int n) {
        final Field[] method16365 = method16365(clazz, field, clazz2);
        return (n >= 0 && n < method16365.length) ? method16365[n] : null;
    }
    
    public static Object method16369(final Object o, final Class clazz, final Class clazz2) {
        final Class7364 method16373 = method16373(clazz, clazz2);
        if (method16373 != null) {
            return method16373.method22634() ? Class9570.method35828(o, method16373) : null;
        }
        return null;
    }
    
    public static Object method16370(final Object o, final Class clazz, final Class clazz2, final int n) {
        final Class7364 method16374 = method16374(clazz, clazz2, n);
        if (method16374 != null) {
            return method16374.method22634() ? Class9570.method35828(o, method16374) : null;
        }
        return null;
    }
    
    public static boolean method16371(final Object o, final Class clazz, final Class clazz2, final Object o2) {
        final Class7364 method16373 = method16373(clazz, clazz2);
        return method16373 != null && method16373.method22634() && Class9570.method35837(o, method16373, o2);
    }
    
    public static boolean method16372(final Object o, final Class clazz, final Class clazz2, final int n, final Object o2) {
        final Class7364 method16374 = method16374(clazz, clazz2, n);
        return method16374 != null && method16374.method22634() && Class9570.method35837(o, method16374, o2);
    }
    
    public static Class7364 method16373(final Class clazz, final Class clazz2) {
        final Field method16362 = method16362(clazz, clazz2);
        if (method16362 != null) {
            return new Class7364(new Class7363(clazz), method16362.getName());
        }
        return null;
    }
    
    public static Class7364 method16374(final Class clazz, final Class clazz2, final int n) {
        final Field method16367 = method16367(clazz, clazz2, n);
        if (method16367 != null) {
            return new Class7364(new Class7363(clazz), method16367.getName());
        }
        return null;
    }
}
