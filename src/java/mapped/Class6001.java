// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;

public class Class6001 implements Class5997
{
    public final /* synthetic */ Class6587 field24474;
    
    public Class6001(final Class6587 field24474) {
        this.field24474 = field24474;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        if (!class7576.method23852()) {
            return this.field24474.method20003((Class7575)class7576);
        }
        return this.field24474.field26132.containsKey(class7576) ? this.field24474.field26132.get(class7576) : this.field24474.method19988(((Class7575)class7576).method23835().size());
    }
    
    @Override
    public void method17923(final Class7576 obj, final Object o) {
        if (!obj.method23852()) {
            throw new Class2386("Unexpected recursive set structure. Node: " + obj);
        }
        this.field24474.method20006((Class7575)obj, (Set<Object>)o);
    }
}
