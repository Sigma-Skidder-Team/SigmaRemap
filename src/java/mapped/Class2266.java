// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.AbstractList;

public class Class2266 extends AbstractList<Object>
{
    private static String[] field13829;
    private final List<Object> field13830;
    public final /* synthetic */ Class604 field13831;
    
    private Class2266(final Class604 field13831) {
        this.field13831 = field13831;
        this.field13830 = Lists.newArrayList();
    }
    
    @Override
    public Class592 get(final int n) {
        return this.field13830.get(n);
    }
    
    @Override
    public int size() {
        return this.field13830.size();
    }
    
    public Class592 set(final int n, final Class592 class592) {
        final Class592 class593 = this.field13830.set(n, class592);
        class592.field3496 = this.field13831;
        return class593;
    }
    
    public void add(final int n, final Class592 class592) {
        this.field13830.add(n, class592);
        class592.field3496 = this.field13831;
    }
    
    @Override
    public Class592 remove(final int n) {
        return this.field13830.remove(n);
    }
}
