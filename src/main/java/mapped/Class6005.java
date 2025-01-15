// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Class6005 extends Class6002
{
    public final /* synthetic */ Class6587 field24478;
    
    public Class6005(final Class6587 field24478) {
        this.field24478 = field24478;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (class7576 instanceof Class7573) {
            for (final Class7576 class7577 : ((Class7573)class7576).method23835()) {
                if (!(class7577 instanceof Class7575)) {
                    throw new Class2390("while constructing an ordered map", class7576.method23847(), "expected a mapping of length 1, but found " + class7577.method23834(), class7577.method23847());
                }
                final Class7575 class7578 = (Class7575)class7577;
                if (class7578.method23835().size() != 1) {
                    throw new Class2390("while constructing an ordered map", class7576.method23847(), "expected a single mapping item, but found " + class7578.method23835().size() + " items", class7578.method23847());
                }
                linkedHashMap.put(this.field24478.method19983(class7578.method23835().get(0).method35260()), this.field24478.method19983(class7578.method23835().get(0).method35261()));
            }
            return linkedHashMap;
        }
        throw new Class2390("while constructing an ordered map", class7576.method23847(), "expected a sequence, but found " + class7576.method23834(), class7576.method23847());
    }
}
