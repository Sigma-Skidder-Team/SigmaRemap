// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class7673
{
    private static String[] field30468;
    
    public static List<Class7971> method24356(final List<Class7971> list, final Class225 class225, final String s, String lowerCase) {
        final List<Class7971> method24357 = method24357(list, class225, s);
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.length() != 0) {
            final ArrayList list2 = new ArrayList();
            final Iterator<Class7971> iterator = method24357.iterator();
            while (iterator.hasNext()) {
                final Class7971 class226 = iterator.next();
                if (!class226.method25889().toLowerCase().startsWith(lowerCase)) {
                    continue;
                }
                list2.add(class226);
                iterator.remove();
            }
            final Iterator<Class7971> iterator2 = method24357.iterator();
            while (iterator2.hasNext()) {
                final Class7971 class227 = iterator2.next();
                if (!class227.method25889().toLowerCase().contains(lowerCase)) {
                    continue;
                }
                list2.add(class227);
                iterator2.remove();
            }
            list2.addAll(method24357);
            return list2;
        }
        return method24357;
    }
    
    public static List<Class7971> method24357(final List<Class7971> c, final Class225 class225, final String s) {
        final ArrayList list = new ArrayList(c);
        switch (Class6748.field26542[class225.ordinal()]) {
            case 1: {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4465());
                break;
            }
            case 2: {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4440(s));
                break;
            }
            case 3: {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4446());
                break;
            }
            case 4: {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4444());
                break;
            }
            case 5: {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4432());
                break;
            }
        }
        return list;
    }
}
