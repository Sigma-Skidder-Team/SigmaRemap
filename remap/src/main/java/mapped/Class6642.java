// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import com.google.common.collect.Sets;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Map;

public class Class6642 extends Class6635 implements Class6640
{
    private static String[] field26266;
    private final Map<Integer, Class2137> field26267;
    private final Set<Integer> field26268;
    
    public Class6642(final Class6108 class6108) {
        super(class6108);
        this.field26267 = new ConcurrentHashMap<Integer, Class2137>();
        this.field26268 = Sets.newConcurrentHashSet();
    }
    
    public void method20165(final int i) {
        this.field26267.remove(i);
        if (this.method20170(i)) {
            this.method20171(i);
        }
    }
    
    public void method20166(final int i, final Class2137 class2137) {
        if (class2137 != null && this.field26267 != null) {
            this.field26267.put(i, class2137);
        }
    }
    
    public boolean method20167(final int i) {
        return this.field26267.containsKey(i);
    }
    
    public Optional<Class2137> method20168(final int i) {
        return (Optional<Class2137>)Optional.fromNullable((Object)this.field26267.get(i));
    }
    
    public void method20169(final int i) {
        this.field26268.add(i);
    }
    
    public boolean method20170(final int i) {
        return this.field26268.contains(i);
    }
    
    public void method20171(final int i) {
        this.field26268.remove(i);
    }
    
    @Override
    public void method20099(final int i) {
        this.field26267.put(i, Class2137.field12568);
    }
}
