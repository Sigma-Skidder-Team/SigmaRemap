// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.List;

public class Class9150
{
    private static String[] field38779;
    
    private Class9150() {
    }
    
    public static <E> List<E> method33410(final E[] array) {
        return (array.length != 0) ? new Class2264<E>(array) : Collections.emptyList();
    }
    
    public static <E> List<E> method33411(final E[] array, final E[] array2) {
        List<E> list;
        if (array.length != 0) {
            if (array2.length != 0) {
                list = new Class2263<E>(array, array2);
            }
            else {
                list = method33410(array);
            }
        }
        else {
            list = method33410(array2);
        }
        return list;
    }
}
