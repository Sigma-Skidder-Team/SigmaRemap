// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Field;

public class Class6946 implements Class6943
{
    private Field field27202;
    
    public Class6946(final Class clazz, final Class[] a, final Class clazz2, final Class[] a2, final String s) {
        this.field27202 = null;
        final Field[] declaredFields = clazz.getDeclaredFields();
        final ArrayList source = new ArrayList();
        for (int i = 0; i < declaredFields.length; ++i) {
            source.add(declaredFields[i].getType());
        }
        final ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(a));
        list.add(clazz2);
        list.addAll(Arrays.asList(a2));
        final int indexOfSubList = Collections.indexOfSubList(source, list);
        if (indexOfSubList >= 0) {
            if (Collections.indexOfSubList(source.subList(indexOfSubList + 1, source.size()), list) < 0) {
                this.field27202 = declaredFields[indexOfSubList + a.length];
            }
            else {
                Class7497.method23338("(Reflector) More than one match found for field: " + s);
            }
        }
        else {
            Class7497.method23338("(Reflector) Field not found: " + s);
        }
    }
    
    @Override
    public Field method21325() {
        return this.field27202;
    }
}
