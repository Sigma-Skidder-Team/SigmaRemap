// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.util.Random;
import java.util.List;

public class Class7806 implements Class7805
{
    private static String[] field31973;
    private List<Class1912> field31974;
    public final /* synthetic */ Class1793 field31975;
    
    private Class7806(final Class1793 field31975) {
        this.field31975 = field31975;
    }
    
    @Override
    public Class1912 method25209(final int n, final int n2) {
        return this.field31974.get(n * (this.field31974.size() - 1) / n2);
    }
    
    @Override
    public Class1912 method25210(final Random random) {
        return this.field31974.get(random.nextInt(this.field31974.size()));
    }
    
    public void method25211(final List<Class1912> list) {
        this.field31974 = (List<Class1912>)ImmutableList.copyOf((Collection)list);
    }
}