// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class8582
{
    private static String[] field36069;
    
    public static boolean method29049(final List<Class9052> list) {
        if (list.size() > 0) {
            final Class354 field38320 = list.get(0).field38320;
            final Class9052[] array = { new Class9052(field38320.method1141(), Class179.field514), new Class9052(field38320.method1147(), Class179.field515), new Class9052(field38320.method1143(), Class179.field513), new Class9052(field38320.method1145(), Class179.field516), new Class9052(field38320.method1139(), Class179.field512), new Class9052(field38320.method1137(), Class179.field511) };
            for (int length = array.length, i = 0; i < length; ++i) {
                if (Class4609.method13666(array[i].field38320) != Class7521.field29147) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static List<Class9052> method29050(final List<Class9052> list) {
        final ArrayList list2 = new ArrayList();
        for (int i = list.size() - 1; i >= 0; --i) {
            list2.add(list.get(i));
        }
        return list2;
    }
    
    public static List<Class9052> method29051(final Class3833 class3833, final Class354 class3834, final int n) {
        final ArrayList list = new ArrayList();
        if (class3834 == null || n < 0) {
            return list;
        }
        if (Class4609.method13668(class3833, class3834)) {
            final Class9052[] array2;
            final Class9052[] array = array2 = new Class9052[] { new Class9052(class3834.method1137(), Class179.field511), new Class9052(class3834.method1141(), Class179.field514), new Class9052(class3834.method1147(), Class179.field515), new Class9052(class3834.method1143(), Class179.field513), new Class9052(class3834.method1145(), Class179.field516), new Class9052(class3834.method1139(), Class179.field512) };
            for (final Class9052 class3835 : array2) {
                if (!Class4609.method13668(class3833, class3835.field38320)) {
                    list.add(class3835);
                    return list;
                }
            }
            for (int j = 1; j < n; ++j) {
                final Class9052[] array3 = array;
                for (int length2 = array3.length, k = 0; k < length2; ++k) {
                    final List<Class9052> method29051 = method29051(class3833, array3[k].field38320, j);
                    if (method29049(method29050(method29051))) {
                        list.addAll(method29051);
                        return (list.size() <= 1) ? list : method29050(list);
                    }
                }
            }
            return list;
        }
        return list;
    }
}
