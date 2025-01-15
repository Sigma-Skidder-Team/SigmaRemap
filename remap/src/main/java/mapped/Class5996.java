// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.List;

public class Class5996 implements Class5997
{
    public final /* synthetic */ Class6587 field24469;
    
    public Class5996(final Class6587 field24469) {
        this.field24469 = field24469;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final Class7573 class7577 = (Class7573)class7576;
        if (!class7576.method23852()) {
            return this.field24469.method19998(class7577);
        }
        return this.field24469.method19996(class7577);
    }
    
    @Override
    public void method17923(final Class7576 obj, final Object o) {
        if (!obj.method23852()) {
            throw new Class2386("Unexpected recursive sequence structure. Node: " + obj);
        }
        this.field24469.method20001((Class7573)obj, (Collection<Object>)o);
    }
}
