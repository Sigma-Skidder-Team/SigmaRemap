// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class5998 implements Class5997
{
    public final /* synthetic */ Class6587 field24470;
    
    public Class5998(final Class6587 field24470) {
        this.field24470 = field24470;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final Class7575 class7577 = (Class7575)class7576;
        if (!class7576.method23852()) {
            return this.field24470.method20004(class7577);
        }
        return this.field24470.method19989(class7577.method23835().size());
    }
    
    @Override
    public void method17923(final Class7576 obj, final Object o) {
        if (!obj.method23852()) {
            throw new Class2386("Unexpected recursive mapping structure. Node: " + obj);
        }
        this.field24470.method20005((Class7575)obj, (Map<Object, Object>)o);
    }
}
