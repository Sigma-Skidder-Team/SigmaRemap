// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

public abstract class Class7352
{
    public final Map<Class<?>, Class3398> field28372;
    public Class3398 field28373;
    public final Map<Class<?>, Class3398> field28374;
    public Class2031 field28375;
    public Class227 field28376;
    public final Map<Object, Class7576> field28377;
    public Object field28378;
    private Class5043 field28379;
    private boolean field28380;
    
    public Class7352() {
        this.field28372 = new HashMap<Class<?>, Class3398>();
        this.field28374 = new LinkedHashMap<Class<?>, Class3398>();
        this.field28375 = null;
        this.field28376 = Class227.field802;
        this.field28377 = new Class32(this);
        this.field28380 = false;
    }
    
    public Class7576 method22572(final Object o) {
        final Class7576 method22573 = this.method22573(o);
        this.field28377.clear();
        this.field28378 = null;
        return method22573;
    }
    
    public final Class7576 method22573(final Object field28378) {
        this.field28378 = field28378;
        if (this.field28377.containsKey(this.field28378)) {
            return this.field28377.get(this.field28378);
        }
        if (field28378 != null) {
            final Class<?> class1 = field28378.getClass();
            Class7576 class2;
            if (!this.field28372.containsKey(class1)) {
                for (final Class clazz : this.field28374.keySet()) {
                    if (clazz != null && clazz.isInstance(field28378)) {
                        return this.field28374.get(clazz).method10839(field28378);
                    }
                }
                if (!this.field28374.containsKey(null)) {
                    class2 = this.field28372.get(null).method10839(field28378);
                }
                else {
                    class2 = this.field28374.get(null).method10839(field28378);
                }
            }
            else {
                class2 = this.field28372.get(class1).method10839(field28378);
            }
            return class2;
        }
        return this.field28373.method10839(null);
    }
    
    public Class7576 method22574(final Class8542 class8542, final String s, Class2031 field28375) {
        if (field28375 == null) {
            field28375 = this.field28375;
        }
        return new Class7577(class8542, s, null, null, field28375);
    }
    
    public Class7576 method22575(final Class8542 class8542, final String s) {
        return this.method22574(class8542, s, null);
    }
    
    public Class7576 method22576(final Class8542 class8542, final Iterable<?> iterable, final Class227 class8543) {
        int size = 10;
        if (iterable instanceof List) {
            size = ((List)iterable).size();
        }
        final ArrayList list = new ArrayList<Class7577>(size);
        final Class7573 class8544 = new Class7573(class8542, (List<Class7576>)list, class8543);
        this.field28377.put(this.field28378, class8544);
        Class227 class8545 = Class227.field800;
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            final Class7576 method22573 = this.method22573(iterator.next());
            if (!(method22573 instanceof Class7577) || !((Class7577)method22573).method23857()) {
                class8545 = Class227.field801;
            }
            list.add(method22573);
        }
        if (class8543 == Class227.field802) {
            if (this.field28376 == Class227.field802) {
                class8544.method23838(class8545);
            }
            else {
                class8544.method23838(this.field28376);
            }
        }
        return class8544;
    }
    
    public Class7576 method22577(final Class8542 class8542, final Map<?, ?> map, final Class227 class8543) {
        final ArrayList list = new ArrayList(map.size());
        final Class7575 class8544 = new Class7575(class8542, list, class8543);
        this.field28377.put(this.field28378, class8544);
        Class227 class8545 = Class227.field800;
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            final Class7576 method22573 = this.method22573(entry.getKey());
            final Class7576 method22574 = this.method22573(entry.getValue());
            if (!(method22573 instanceof Class7577) || !((Class7577)method22573).method23857()) {
                class8545 = Class227.field801;
            }
            if (!(method22574 instanceof Class7577) || !((Class7577)method22574).method23857()) {
                class8545 = Class227.field801;
            }
            list.add(new Class9474(method22573, method22574));
        }
        if (class8543 == Class227.field802) {
            if (this.field28376 == Class227.field802) {
                class8544.method23838(class8545);
            }
            else {
                class8544.method23838(this.field28376);
            }
        }
        return class8544;
    }
    
    public void method22578(final Class2031 field28375) {
        this.field28375 = field28375;
    }
    
    public Class2031 method22579() {
        if (this.field28375 != null) {
            return this.field28375;
        }
        return Class2031.field11579;
    }
    
    public void method22580(final Class227 field28376) {
        this.field28376 = field28376;
    }
    
    public Class227 method22581() {
        return this.field28376;
    }
    
    public void method22582(final Class5043 field28379) {
        this.field28379 = field28379;
        this.field28380 = true;
    }
    
    public final Class5043 method22583() {
        if (this.field28379 == null) {
            this.field28379 = new Class5043();
        }
        return this.field28379;
    }
    
    public final boolean method22584() {
        return this.field28380;
    }
}
