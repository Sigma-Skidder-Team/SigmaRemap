// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.IntComparator;

public class Class4451 implements IntComparator
{
    private static String[] field19796;
    public final /* synthetic */ int[] field19797;
    public final /* synthetic */ int[] field19798;
    public final /* synthetic */ Class8134 field19799;
    
    public Class4451(final Class8134 field19799, final int[] field19800, final int[] field19801) {
        this.field19799 = field19799;
        this.field19797 = field19800;
        this.field19798 = field19801;
    }
    
    public int compare(final int n, final int n2) {
        return (this.field19797[n] != this.field19797[n2]) ? Integer.compare(this.field19797[n], this.field19797[n2]) : Integer.compare(this.field19798[n], this.field19798[n2]);
    }
    
    public int compare(final Integer n, final Integer n2) {
        return this.compare((int)n, (int)n2);
    }
}
