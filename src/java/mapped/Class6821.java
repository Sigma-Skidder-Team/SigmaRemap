// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import javax.annotation.Nullable;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;

public abstract class Class6821
{
    public final Map<Class8725, Class7619> field26774;
    public final Map<String, Class7619> field26775;
    public final Multimap<Class8725, Class8725> field26776;
    
    public Class6821() {
        this.field26774 = Maps.newHashMap();
        this.field26775 = new Class26<Class7619>();
        this.field26776 = (Multimap<Class8725, Class8725>)HashMultimap.create();
    }
    
    @Nullable
    public Class7619 method20879(final Class8725 class8725) {
        return this.field26774.get(class8725);
    }
    
    @Nullable
    public Class7619 method20878(final String s) {
        return this.field26775.get(s);
    }
    
    public Class7619 method20873(final Class8725 class8725) {
        if (!this.field26775.containsKey(class8725.method29978())) {
            final Class7619 method20874 = this.method20874(class8725);
            this.field26775.put(class8725.method29978(), method20874);
            this.field26774.put(class8725, method20874);
            for (Class8725 class8726 = class8725.method29982(); class8726 != null; class8726 = class8726.method29982()) {
                this.field26776.put((Object)class8726, (Object)class8725);
            }
            return method20874;
        }
        throw new IllegalArgumentException("Attribute is already registered!");
    }
    
    public abstract Class7619 method20874(final Class8725 p0);
    
    public Collection<Class7619> method20880() {
        return this.field26775.values();
    }
    
    public void method20875(final Class7619 class7619) {
    }
    
    public void method20881(final Multimap<String, Class7919> multimap) {
        for (final Map.Entry<String, V> entry : multimap.entries()) {
            final Class7619 method20878 = this.method20878(entry.getKey());
            if (method20878 == null) {
                continue;
            }
            method20878.method23947((Class7919)entry.getValue());
        }
    }
    
    public void method20882(final Multimap<String, Class7919> multimap) {
        for (final Map.Entry<String, V> entry : multimap.entries()) {
            final Class7619 method20878 = this.method20878(entry.getKey());
            if (method20878 == null) {
                continue;
            }
            method20878.method23947((Class7919)entry.getValue());
            method20878.method23946((Class7919)entry.getValue());
        }
    }
    
    public void method20883(final Class6821 class6821) {
        this.method20880().forEach(class6823 -> {
            class6822.method20879(class6823.method23939());
            final Class7619 class6824;
            if (class6824 != null) {
                class6823.method23951(class6824);
            }
        });
    }
}
