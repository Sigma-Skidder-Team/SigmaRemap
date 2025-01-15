// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.TimeZone;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

public class Class7354 extends Class7353
{
    private static String[] field28384;
    public Map<Class<?>, Class8051> field28385;
    
    public Class7354() {
        this.field28385 = Collections.emptyMap();
        this.field28372.put(null, new Class3401(this));
    }
    
    public Class8051 method22589(final Class8051 class8051) {
        if (Collections.EMPTY_MAP == this.field28385) {
            this.field28385 = new HashMap<Class<?>, Class8051>();
        }
        if (class8051.method26402() != null) {
            this.method22586(class8051.method26405(), class8051.method26402());
        }
        class8051.method26417(this.method22583());
        return this.field28385.put(class8051.method26405(), class8051);
    }
    
    @Override
    public void method22582(final Class5043 class5043) {
        super.method22582(class5043);
        final Iterator<Class8051> iterator = this.field28385.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method26417(class5043);
        }
    }
    
    public Class7575 method22590(final Set<Class1935> set, final Object o) {
        final ArrayList list = new ArrayList(set.size());
        final Class8542 class8542 = this.field28381.get(o.getClass());
        final Class7575 class8543 = new Class7575((class8542 == null) ? new Class8542(o.getClass()) : class8542, list, Class227.field802);
        this.field28377.put(o, class8543);
        Class227 class8544 = Class227.field800;
        for (final Class1935 class8545 : set) {
            final Object method7827 = class8545.method7827(o);
            final Class9474 method7828 = this.method22591(o, class8545, method7827, (method7827 != null) ? this.field28381.get(method7827.getClass()) : null);
            if (method7828 != null) {
                if (!((Class7577)method7828.method35260()).method23857()) {
                    class8544 = Class227.field801;
                }
                final Class7576 method7829 = method7828.method35261();
                if (!(method7829 instanceof Class7577) || !((Class7577)method7829).method23857()) {
                    class8544 = Class227.field801;
                }
                list.add(method7828);
            }
        }
        if (this.field28376 == Class227.field802) {
            class8543.method23838(class8544);
        }
        else {
            class8543.method23838(this.field28376);
        }
        return class8543;
    }
    
    public Class9474 method22591(final Object o, final Class1935 class1935, final Object o2, final Class8542 class1936) {
        final Class7577 class1937 = (Class7577)this.method22573(class1935.method7823());
        final boolean containsKey = this.field28377.containsKey(o2);
        final Class7576 method22573 = this.method22573(o2);
        if (o2 != null) {
            if (!containsKey) {
                final Class2085 method22574 = method22573.method23834();
                if (class1936 == null) {
                    if (method22574 != Class2085.field12055) {
                        if (method22574 == Class2085.field12057) {
                            if (class1935.method7821() == o2.getClass()) {
                                if (!(o2 instanceof Map)) {
                                    if (!method22573.method23845().equals(Class8542.field35866)) {
                                        method22573.method23848(Class8542.field35877);
                                    }
                                }
                            }
                        }
                        this.method22592(class1935, method22573, o2);
                    }
                    else if (class1935.method7821() == o2.getClass()) {
                        if (o2 instanceof Enum) {
                            method22573.method23848(Class8542.field35875);
                        }
                    }
                }
            }
        }
        return new Class9474(class1937, method22573);
    }
    
    public void method22592(final Class1935 class1935, final Class7576 class1936, final Object o) {
        if (o.getClass().isArray() && o.getClass().getComponentType().isPrimitive()) {
            return;
        }
        final Class<?>[] method7822 = class1935.method7822();
        if (method7822 != null) {
            if (class1936.method23834() != Class2085.field12056) {
                if (!(o instanceof Set)) {
                    if (o instanceof Map) {
                        final Class<?> clazz = method7822[0];
                        final Class<?> clazz2 = method7822[1];
                        for (final Class9474 class1937 : ((Class7575)class1936).method23835()) {
                            this.method22593(clazz, class1937.method35260());
                            this.method22593(clazz2, class1937.method35261());
                        }
                    }
                }
                else {
                    final Class<?> clazz3 = method7822[0];
                    final Iterator<Class9474> iterator2 = ((Class7575)class1936).method23835().iterator();
                    for (final Object next : (Set)o) {
                        final Class7576 method7823 = iterator2.next().method35260();
                        if (!clazz3.equals(next.getClass())) {
                            continue;
                        }
                        if (method7823.method23834() != Class2085.field12057) {
                            continue;
                        }
                        method7823.method23848(Class8542.field35877);
                    }
                }
            }
            else {
                final Class<?> clazz4 = method7822[0];
                final Class7573 class1938 = (Class7573)class1936;
                Iterable<Object> iterable = Collections.EMPTY_LIST;
                if (!o.getClass().isArray()) {
                    if (o instanceof Iterable) {
                        iterable = (Iterable)o;
                    }
                }
                else {
                    iterable = Arrays.asList((Object[])o);
                }
                final Iterator<Object> iterator4 = iterable.iterator();
                if (iterator4.hasNext()) {
                    for (final Class7576 class1939 : class1938.method23835()) {
                        final Object next2 = iterator4.next();
                        if (next2 == null) {
                            continue;
                        }
                        if (!clazz4.equals(next2.getClass())) {
                            continue;
                        }
                        if (class1939.method23834() != Class2085.field12057) {
                            continue;
                        }
                        class1939.method23848(Class8542.field35877);
                    }
                }
            }
        }
    }
    
    private void method22593(final Class<?> clazz, final Class7576 class7576) {
        if (class7576.method23845().method28661(clazz)) {
            if (!Enum.class.isAssignableFrom(clazz)) {
                class7576.method23848(Class8542.field35877);
            }
            else {
                class7576.method23848(Class8542.field35875);
            }
        }
    }
    
    public Set<Class1935> method22594(final Class<?> clazz) {
        if (!this.field28385.containsKey(clazz)) {
            return this.method22583().method15352(clazz);
        }
        return this.field28385.get(clazz).method26420();
    }
}
