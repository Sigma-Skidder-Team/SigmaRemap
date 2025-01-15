// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Iterator;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Class6017 implements Class5997
{
    public final /* synthetic */ Class6589 field24493;
    
    public Class6017(final Class6589 field24493) {
        this.field24493 = field24493;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final Class7573 class7577 = (Class7573)class7576;
        if (Set.class.isAssignableFrom(class7576.method23849())) {
            if (class7576.method23852()) {
                throw new Class2386("Set cannot be recursive.");
            }
            return this.field24493.method19999(class7577);
        }
        else if (Collection.class.isAssignableFrom(class7576.method23849())) {
            if (class7576.method23852()) {
                return this.field24493.method19996(class7577);
            }
            return this.field24493.method19998(class7577);
        }
        else {
            if (!class7576.method23849().isArray()) {
                final ArrayList list = new ArrayList(class7577.method23835().size());
                for (final Constructor<?> constructor : class7576.method23849().getDeclaredConstructors()) {
                    if (class7577.method23835().size() == constructor.getParameterTypes().length) {
                        list.add((Object)constructor);
                    }
                }
                if (!list.isEmpty()) {
                    if (list.size() == 1) {
                        final Object[] initargs = new Object[class7577.method23835().size()];
                        final Constructor constructor2 = (Constructor)list.get(0);
                        int n = 0;
                        for (final Class7576 class7578 : class7577.method23835()) {
                            class7578.method23850(constructor2.getParameterTypes()[n]);
                            initargs[n++] = this.field24493.method19983(class7578);
                        }
                        try {
                            constructor2.setAccessible(true);
                            return constructor2.newInstance(initargs);
                        }
                        catch (final Exception ex) {
                            throw new Class2386(ex);
                        }
                    }
                    final List<?> method19998 = this.field24493.method19998(class7577);
                    final Class[] array = new Class[method19998.size()];
                    int n2 = 0;
                    final Iterator iterator2 = method19998.iterator();
                    while (iterator2.hasNext()) {
                        array[n2] = iterator2.next().getClass();
                        ++n2;
                    }
                    for (final Constructor constructor3 : list) {
                        final Class[] parameterTypes = constructor3.getParameterTypes();
                        boolean b = true;
                        for (int j = 0; j < parameterTypes.length; ++j) {
                            if (!this.method17930(parameterTypes[j]).isAssignableFrom(array[j])) {
                                b = false;
                                break;
                            }
                        }
                        if (b) {
                            try {
                                constructor3.setAccessible(true);
                                return constructor3.newInstance(method19998.toArray());
                            }
                            catch (final Exception ex2) {
                                throw new Class2386(ex2);
                            }
                        }
                    }
                }
                throw new Class2386("No suitable constructor with " + String.valueOf(class7577.method23835().size()) + " arguments found for " + class7576.method23849());
            }
            if (class7576.method23852()) {
                return this.field24493.method19990(class7576.method23849(), class7577.method23835().size());
            }
            return this.field24493.method20000(class7577);
        }
    }
    
    private final Class<?> method17930(final Class<?> obj) {
        if (!obj.isPrimitive()) {
            return obj;
        }
        if (obj == Integer.TYPE) {
            return Integer.class;
        }
        if (obj == Float.TYPE) {
            return Float.class;
        }
        if (obj == Double.TYPE) {
            return Double.class;
        }
        if (obj == Boolean.TYPE) {
            return Boolean.class;
        }
        if (obj == Long.TYPE) {
            return Long.class;
        }
        if (obj == Character.TYPE) {
            return Character.class;
        }
        if (obj == Short.TYPE) {
            return Short.class;
        }
        if (obj != Byte.TYPE) {
            throw new Class2386("Unexpected primitive " + obj);
        }
        return Byte.class;
    }
    
    @Override
    public void method17923(final Class7576 class7576, final Object o) {
        final Class7573 class7577 = (Class7573)class7576;
        if (!List.class.isAssignableFrom(class7576.method23849())) {
            if (!class7576.method23849().isArray()) {
                throw new Class2386("Immutable objects cannot be recursive.");
            }
            this.field24493.method20002(class7577, o);
        }
        else {
            this.field24493.method20001(class7577, (Collection<Object>)o);
        }
    }
}
