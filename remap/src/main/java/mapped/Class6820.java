// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

public class Class6820 extends Class6821
{
    private static String[] field26771;
    private final Set<Class7619> field26772;
    public final Map<String, Class7619> field26773;
    
    public Class6820() {
        this.field26772 = Sets.newHashSet();
        this.field26773 = new Class26<Class7619>();
    }
    
    public Class7620 method20871(final Class8725 class8725) {
        return (Class7620)super.method20879(class8725);
    }
    
    public Class7620 method20872(final String s) {
        Class7619 method20878 = super.method20878(s);
        if (method20878 == null) {
            method20878 = this.field26773.get(s);
        }
        return (Class7620)method20878;
    }
    
    @Override
    public Class7619 method20873(final Class8725 class8725) {
        final Class7619 method20873 = super.method20873(class8725);
        if (class8725 instanceof Class8723) {
            if (((Class8723)class8725).method29976() != null) {
                this.field26773.put(((Class8723)class8725).method29976(), method20873);
            }
        }
        return method20873;
    }
    
    @Override
    public Class7619 method20874(final Class8725 class8725) {
        return new Class7620(this, class8725);
    }
    
    @Override
    public void method20875(final Class7619 class7619) {
        if (class7619.method23939().method29980()) {
            this.field26772.add(class7619);
        }
        final Iterator iterator = this.field26776.get(class7619.method23939()).iterator();
        while (iterator.hasNext()) {
            final Class7620 method20871 = this.method20871((Class8725)iterator.next());
            if (method20871 == null) {
                continue;
            }
            method20871.method23952();
        }
    }
    
    public Set<Class7619> method20876() {
        return this.field26772;
    }
    
    public Collection<Class7619> method20877() {
        final HashSet hashSet = Sets.newHashSet();
        for (final Class7619 class7619 : this.method20880()) {
            if (!class7619.method23939().method29980()) {
                continue;
            }
            hashSet.add(class7619);
        }
        return hashSet;
    }
}
