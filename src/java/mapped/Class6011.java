// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;

public class Class6011 extends Class6002
{
    public final /* synthetic */ Class6587 field24484;
    
    public Class6011(final Class6587 field24484) {
        this.field24484 = field24484;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        if (class7576 instanceof Class7573) {
            final Class7573 class7577 = (Class7573)class7576;
            final ArrayList list = new ArrayList(class7577.method23835().size());
            for (final Class7576 class7578 : class7577.method23835()) {
                if (!(class7578 instanceof Class7575)) {
                    throw new Class2390("while constructingpairs", class7576.method23847(), "expected a mapping of length 1, but found " + class7578.method23834(), class7578.method23847());
                }
                final Class7575 class7579 = (Class7575)class7578;
                if (class7579.method23835().size() != 1) {
                    throw new Class2390("while constructing pairs", class7576.method23847(), "expected a single mapping item, but found " + class7579.method23835().size() + " items", class7579.method23847());
                }
                list.add((Object)new Object[] { this.field24484.method19983(class7579.method23835().get(0).method35260()), this.field24484.method19983(class7579.method23835().get(0).method35261()) });
            }
            return list;
        }
        throw new Class2390("while constructing pairs", class7576.method23847(), "expected a sequence, but found " + class7576.method23834(), class7576.method23847());
    }
}
