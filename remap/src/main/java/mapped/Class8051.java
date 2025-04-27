// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Constructor;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Class8051
{
    private static final Logger field33128;
    private final Class<?> field33129;
    private Class<?> field33130;
    private Class8542 field33131;
    private transient Set<Class1935> field33132;
    private transient Class5043 field33133;
    private transient boolean field33134;
    private Map<String, Class1936> field33135;
    public Set<String> field33136;
    public String[] field33137;
    public Class2175 field33138;
    
    public Class8051(final Class<?> clazz, final Class8542 class8542) {
        this(clazz, class8542, null);
    }
    
    public Class8051(final Class<?> field33129, final Class8542 field33130, final Class<?> field33131) {
        this.field33135 = Collections.emptyMap();
        this.field33136 = Collections.emptySet();
        this.field33137 = null;
        this.field33129 = field33129;
        this.field33131 = field33130;
        this.field33130 = field33131;
        this.field33138 = null;
    }
    
    public Class8051(final Class<?> clazz, final String s) {
        this(clazz, new Class8542(s), null);
    }
    
    public Class8051(final Class<?> clazz) {
        this(clazz, null, null);
    }
    
    public Class8051(final Class<?> clazz, final Class<?> clazz2) {
        this(clazz, null, clazz2);
    }
    
    public Class8542 method26402() {
        return this.field33131;
    }
    
    public void method26403(final Class8542 field33131) {
        this.field33131 = field33131;
    }
    
    public void method26404(final String s) {
        this.method26403(new Class8542(s));
    }
    
    public Class<?> method26405() {
        return this.field33129;
    }
    
    @Deprecated
    public void method26406(final String s, final Class<?> clazz) {
        this.method26411(s, clazz);
    }
    
    @Deprecated
    public Class<?> method26407(final String s) {
        if (this.field33135.containsKey(s)) {
            final Class<?>[] method7822 = this.field33135.get(s).method7822();
            if (method7822 != null) {
                if (method7822.length > 0) {
                    return method7822[0];
                }
            }
        }
        return null;
    }
    
    @Deprecated
    public void method26408(final String s, final Class<?> clazz, final Class<?> clazz2) {
        this.method26411(s, clazz, clazz2);
    }
    
    @Deprecated
    public Class<?> method26409(final String s) {
        if (this.field33135.containsKey(s)) {
            final Class<?>[] method7822 = this.field33135.get(s).method7822();
            if (method7822 != null) {
                if (method7822.length > 0) {
                    return method7822[0];
                }
            }
        }
        return null;
    }
    
    @Deprecated
    public Class<?> method26410(final String s) {
        if (this.field33135.containsKey(s)) {
            final Class<?>[] method7822 = this.field33135.get(s).method7822();
            if (method7822 != null) {
                if (method7822.length > 1) {
                    return method7822[1];
                }
            }
        }
        return null;
    }
    
    public void method26411(final String s, final Class<?>... array) {
        if (this.field33135.containsKey(s)) {
            this.field33135.get(s).method7830(array);
        }
        else {
            this.method26415(s, null, null, null, array);
        }
    }
    
    @Override
    public String toString() {
        return "TypeDescription for " + this.method26405() + " (tag='" + this.method26402() + "')";
    }
    
    private void method26412() {
        for (final Class1936 class1936 : this.field33135.values()) {
            try {
                class1936.method7833(this.method26413(class1936.method7823()));
            }
            catch (final Class2386 class1937) {}
        }
        this.field33134 = true;
    }
    
    private Class1935 method26413(final String s) {
        if (this.field33133 == null) {
            return null;
        }
        if (this.field33138 != null) {
            return this.field33133.method15356(this.field33129, s, this.field33138);
        }
        return this.field33133.method15355(this.field33129, s);
    }
    
    public Class1935 method26414(final String s) {
        if (!this.field33134) {
            this.method26412();
        }
        return this.field33135.containsKey(s) ? this.field33135.get(s) : this.method26413(s);
    }
    
    public void method26415(final String s, final Class<?> clazz, final String s2, final String s3, final Class<?>... array) {
        this.method26416(new Class1936(s, clazz, s2, s3, array));
    }
    
    public void method26416(final Class1936 class1936) {
        if (Collections.EMPTY_MAP == this.field33135) {
            this.field33135 = new LinkedHashMap<String, Class1936>();
        }
        class1936.method7831(this.field33129);
        this.field33135.put(class1936.method7823(), class1936);
    }
    
    public void method26417(final Class5043 field33133) {
        this.field33133 = field33133;
    }
    
    public void method26418(final String... array) {
        this.field33137 = (array != null && array.length > 0) ? array : null;
    }
    
    public void method26419(final String... array) {
        if (array != null && array.length > 0) {
            this.field33136 = new HashSet<String>();
            for (int length = array.length, i = 0; i < length; ++i) {
                this.field33136.add(array[i]);
            }
        }
        else {
            this.field33136 = Collections.emptySet();
        }
    }
    
    public Set<Class1935> method26420() {
        if (this.field33132 != null) {
            return this.field33132;
        }
        if (this.field33133 == null) {
            return null;
        }
        if (this.field33137 != null) {
            this.field33132 = new LinkedHashSet<Class1935>();
            for (final String s : this.field33137) {
                if (!this.field33136.contains(s)) {
                    this.field33132.add(this.method26414(s));
                }
            }
            return this.field33132;
        }
        final Set<Class1935> field33138 = (this.field33138 != null) ? this.field33133.method15353(this.field33129, this.field33138) : this.field33133.method15352(this.field33129);
        if (!this.field33135.isEmpty()) {
            if (!this.field33134) {
                this.method26412();
            }
            this.field33132 = new LinkedHashSet<Class1935>();
            for (final Class1935 class1935 : this.field33135.values()) {
                if (this.field33136.contains(class1935.method7823())) {
                    continue;
                }
                if (!class1935.method7825()) {
                    continue;
                }
                this.field33132.add(class1935);
            }
            for (final Class1935 class1936 : field33138) {
                if (this.field33136.contains(class1936.method7823())) {
                    continue;
                }
                this.field33132.add(class1936);
            }
            return this.field33132;
        }
        if (!this.field33136.isEmpty()) {
            this.field33132 = new LinkedHashSet<Class1935>();
            for (final Class1935 class1937 : field33138) {
                if (this.field33136.contains(class1937.method7823())) {
                    continue;
                }
                this.field33132.add(class1937);
            }
            return this.field33132;
        }
        return this.field33132 = field33138;
    }
    
    public boolean method26421(final String s, final Class7576 class7576) {
        return false;
    }
    
    public boolean method26422(final Object o, final String s, final Object o2) throws Exception {
        return false;
    }
    
    public Object method26423(final Class7576 class7576) {
        if (this.field33130 != null) {
            try {
                final Constructor<?> declaredConstructor = this.field33130.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance();
            }
            catch (final Exception ex) {
                Class8051.field33128.fine(ex.getLocalizedMessage());
                this.field33130 = null;
            }
        }
        return null;
    }
    
    public Object method26424(final String s, final Class7576 class7576) {
        return null;
    }
    
    public Object method26425(final Object o) {
        return o;
    }
    
    static {
        field33128 = Logger.getLogger(Class8051.class.getPackage().getName());
    }
}
