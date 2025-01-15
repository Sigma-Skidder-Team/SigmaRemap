// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class Class2267 extends LongLinkedOpenHashSet
{
    private static String[] field13832;
    public final /* synthetic */ int field13833;
    public final /* synthetic */ Class1891 field13834;
    
    public Class2267(final Class1891 field13834, final int n, final float n2, final int field13835) {
        this.field13834 = field13834;
        this.field13833 = field13835;
        super(n, n2);
    }
    
    public void rehash(final int n) {
        if (n > this.field13833) {
            super.rehash(n);
        }
    }
}
