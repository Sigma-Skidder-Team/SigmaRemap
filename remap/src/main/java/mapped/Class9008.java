// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Objects;

public class Class9008
{
    public static boolean method32231(final Object[] array, final Object o) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == o) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static int[] method32232(final int[] array, final int[] array2) {
        if (array != null && array2 != null) {
            final int length = array.length;
            final int[] array3 = new int[length + array2.length];
            System.arraycopy(array, 0, array3, 0, length);
            System.arraycopy(array2, 0, array3, 0 + length, array2.length);
            return array3;
        }
        throw new NullPointerException("The given array is NULL");
    }
    
    public static int[] method32233(final int[] array, final int n) {
        return method32232(array, new int[] { n });
    }
    
    public static Object[] method32234(final Object[] array, final Object[] array2) {
        if (array == null) {
            throw new NullPointerException("The given array is NULL");
        }
        if (array2.length != 0) {
            final int length = array.length;
            final Object[] array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + array2.length);
            System.arraycopy(array, 0, array3, 0, length);
            System.arraycopy(array2, 0, array3, length, array2.length);
            return array3;
        }
        return array;
    }
    
    public static Object[] method32235(final Object[] array, final Object o) {
        if (array != null) {
            final int length = array.length;
            final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + 1);
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = o;
            return array2;
        }
        throw new NullPointerException("The given array is NULL");
    }
    
    public static Object[] method32236(final Object[] a, final Object o, final int n) {
        final ArrayList list = new ArrayList(Arrays.asList(a));
        list.add(n, o);
        return list.toArray((Object[])Array.newInstance(a.getClass().getComponentType(), list.size()));
    }
    
    public static String method32237(final boolean[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final boolean b = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(b);
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method32238(final float[] array) {
        return method32239(array, ", ");
    }
    
    public static String method32239(final float[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final float f = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(f);
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method32240(final float[] array, final String str, final String format) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final float f = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.format(format, f));
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method32241(final int[] array) {
        return method32242(array, ", ");
    }
    
    public static String method32242(final int[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final int j = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(j);
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method32243(final int[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final int j = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append("0x");
                sb.append(Integer.toHexString(j));
            }
            return sb.toString();
        }
        return "";
    }
    
    public static String method32244(final Object[] array) {
        return method32245(array, ", ");
    }
    
    public static String method32245(final Object[] array, final String str) {
        if (array != null) {
            final StringBuffer sb = new StringBuffer(array.length * 5);
            for (int i = 0; i < array.length; ++i) {
                final Object obj = array[i];
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(obj);
            }
            return sb.toString();
        }
        return "";
    }
    
    public static Object[] method32246(final Collection collection, final Class clazz) {
        if (collection == null) {
            return null;
        }
        if (clazz == null) {
            return null;
        }
        if (!clazz.isPrimitive()) {
            return collection.toArray((Object[])Array.newInstance(clazz, collection.size()));
        }
        throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + clazz);
    }
    
    public static boolean method32247(final int n, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method32248(final Object o, final Object[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (equals(o, array[i])) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static boolean equals(final Object o, final Object obj) {
        return Objects.equals(o, obj);
    }
    
    public static boolean method32249(final Object o, final Object[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (o == array[i]) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static Object[] method32250(final Object[] a, final Object o) {
        final ArrayList list = new ArrayList(Arrays.asList(a));
        list.remove(o);
        return method32246(list, a.getClass().getComponentType());
    }
    
    public static int[] method32251(final Integer[] array) {
        if (array == null) {
            return null;
        }
        if (array.length != 0) {
            final int[] array2 = new int[array.length];
            for (int i = 0; i < array2.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return new int[0];
    }
}
