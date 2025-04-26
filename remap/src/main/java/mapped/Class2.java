// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.ref.WeakReference;

public final class Class2 extends WeakReference<StreamAllocation>
{
    private static String[] field1;
    public final Object field2;
    
    public Class2(final StreamAllocation referent, final Object field2) {
        super(referent);
        this.field2 = field2;
    }
}
