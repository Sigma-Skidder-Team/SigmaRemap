// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Class6502
{
    private static Class7363 field25874;
    private static Class7364 field25875;
    private static Class7364 field25876;
    
    public static boolean method19584(final Class1862 class1862) {
        return Class9570.method35829(class1862, Class6502.field25875, true);
    }
    
    public static boolean method19585(final Class1862 class1862) {
        return Class9570.method35829(class1862, Class6502.field25876, true);
    }
    
    private static Class7364 method19586(final String str, final BiConsumer<Class1862, Boolean> biConsumer) {
        try {
            final Class1862 class1862 = new Class1862(null, null, null);
            final ArrayList list = new ArrayList();
            final ArrayList list2 = new ArrayList();
            final Field[] declaredFields = Class1862.class.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; ++i) {
                final Field field = declaredFields[i];
                if (field.getType() == Boolean.TYPE) {
                    field.setAccessible(true);
                    list.add(field);
                    list2.add(field.get(class1862));
                }
            }
            biConsumer.accept(class1862, false);
            final ArrayList list3 = new ArrayList();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list3.add(((Field)iterator.next()).get(class1862));
            }
            biConsumer.accept(class1862, true);
            final ArrayList list4 = new ArrayList();
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                list4.add(((Field)iterator2.next()).get(class1862));
            }
            final ArrayList list5 = new ArrayList();
            for (int j = 0; j < list.size(); ++j) {
                final Field field2 = (Field)list.get(j);
                final Boolean b = (Boolean)list3.get(j);
                final Boolean b2 = (Boolean)list4.get(j);
                if (!b && b2) {
                    list5.add(field2);
                    field2.set(class1862, list2.get(j));
                }
            }
            if (list5.size() == 1) {
                return new Class7364((Field)list5.get(0));
            }
        }
        catch (final Exception ex) {
            Config.warn(ex.getClass().getName() + " " + ex.getMessage());
        }
        Config.warn("Error finding Chunk." + str);
        return new Class7364(new Class7363(Class1862.class), str);
    }
    
    static {
        Class6502.field25874 = new Class7363(Class1862.class);
        Class6502.field25875 = method19586("setHasEntities", Class1862::method7068);
        Class6502.field25876 = method19586("setLoaded", Class1862::method7064);
    }
}
