// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

@Deprecated
public class Class6496
{
    private Map<Object, ArrayList<Class7966>> field25853;
    
    public Class6496() {
        this.field25853 = new HashMap<Object, ArrayList<Class7966>>();
    }
    
    public void method19537(final Object o, final Class7966 class7966) {
        ArrayList list = this.field25853.get(o);
        if (list == null) {
            this.field25853.put(o, list = new ArrayList());
        }
        if (!list.contains(class7966)) {
            list.add(class7966);
            return;
        }
        Client.getInstance().getLogger().warn("Registered the same method of the same instance twice. Was this intended?");
    }
    
    public void method19538(final Object o) {
        for (final Field field : o.getClass().getFields()) {
            if (Class7965.method25809(field)) {
                this.method19537(o, new Class7965(field, o));
            }
        }
        for (final Method method : o.getClass().getMethods()) {
            if (Class7967.method25816(method)) {
                this.method19537(o, new Class7967(method, o));
            }
        }
    }
    
    public void method19539(final String s, final String... array) {
        for (final Map.Entry<Object, V> entry : this.field25853.entrySet()) {
            if (!s.equalsIgnoreCase(entry.getKey().getClass().getAnnotation(Class6756.class).method20570())) {
                continue;
            }
            for (final Class7966 class7966 : (ArrayList)entry.getValue()) {
                if (!(class7966 instanceof Class7965)) {
                    if (!(class7966 instanceof Class7967)) {
                        class7966.method25811(s, array);
                    }
                    else {
                        if (array == null) {
                            continue;
                        }
                        if (array.length < 1) {
                            continue;
                        }
                        if (!array[0].equalsIgnoreCase(class7966.method25814())) {
                            continue;
                        }
                        final String string = s + " " + array[0];
                        final String[] array2 = new String[array.length - 1];
                        for (int i = 1; i < array.length; ++i) {
                            array2[i - 1] = array[i];
                        }
                        class7966.method25811(string, array2);
                    }
                }
                else {
                    if (array == null) {
                        continue;
                    }
                    if (array.length < 1) {
                        continue;
                    }
                    if (!array[0].equalsIgnoreCase("set")) {
                        continue;
                    }
                    if (array.length < 2) {
                        continue;
                    }
                    if (!array[1].equalsIgnoreCase(class7966.method25814())) {
                        continue;
                    }
                    final String string2 = s + " " + array[0] + " " + array[1];
                    final String[] array3 = new String[array.length - 2];
                    for (int j = 2; j < array.length; ++j) {
                        array3[j - 2] = array[j];
                    }
                    class7966.method25811(string2, array3);
                }
            }
        }
    }
    
    public String method19540(final String s, final String... array) {
        return null;
    }
    
    public ArrayList<String> method19541(final String str, final String... array) {
        final ArrayList list = new ArrayList();
        for (final Map.Entry<Object, V> entry : this.field25853.entrySet()) {
            if (!str.equalsIgnoreCase(entry.getKey().getClass().getAnnotation(Class6756.class).method20570())) {
                continue;
            }
            if (array != null) {
                if (array.length <= 0) {
                    list.add(str + " set");
                }
            }
            else {
                list.add(str + " set");
            }
            for (final Class7966 class7966 : (ArrayList)entry.getValue()) {
                if (!(class7966 instanceof Class7965)) {
                    if (!(class7966 instanceof Class7967)) {
                        list.add(class7966.method25813(str, array));
                    }
                    else if (array != null && array.length >= 1) {
                        if (!array[0].equalsIgnoreCase(class7966.method25814())) {
                            if (!class7966.method25814().toUpperCase().startsWith(array[0].toUpperCase())) {
                                continue;
                            }
                            list.add(str + " " + class7966.method25814());
                        }
                        else {
                            final String string = str + " " + array[0];
                            final String[] array2 = new String[array.length - 1];
                            for (int i = 1; i < array.length; ++i) {
                                array2[i - 1] = array[i];
                            }
                            list.add(class7966.method25813(string, array2));
                        }
                    }
                    else {
                        list.add(str + " " + class7966.method25814());
                    }
                }
                else {
                    if (array == null) {
                        continue;
                    }
                    if (array.length < 1) {
                        continue;
                    }
                    if (!array[0].equalsIgnoreCase("set")) {
                        if (!"set".startsWith(array[0].toLowerCase())) {
                            continue;
                        }
                        list.add(str + " set");
                    }
                    else if (array.length < 2) {
                        list.add(str + " set " + class7966.method25814());
                    }
                    else if (!array[1].equalsIgnoreCase(class7966.method25814())) {
                        if (!class7966.method25814().toUpperCase().startsWith(array[1].toUpperCase())) {
                            continue;
                        }
                        list.add(str + " set " + class7966.method25814());
                    }
                    else {
                        final String string2 = str + " " + array[0] + " " + array[1];
                        final String[] array3 = new String[array.length - 2];
                        for (int j = 2; j < array.length; ++j) {
                            array3[j - 2] = array[j];
                        }
                        list.add(class7966.method25813(string2, array3));
                    }
                }
            }
        }
        return list;
    }
    
    public void method19542(final Object o) {
        this.field25853.remove(o);
    }
    
    public Map<Object, ArrayList<Class7966>> method19543() {
        return this.field25853;
    }
}
