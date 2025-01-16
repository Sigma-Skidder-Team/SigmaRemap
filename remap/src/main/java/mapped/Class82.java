// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class Class82 extends AbstractDoubleList implements IDoubleListMerger
{
    private static String[] field183;
    private final DoubleList field184;
    private final DoubleList field185;
    private final boolean field186;
    
    public Class82(final DoubleList field184, final DoubleList field185, final boolean field186) {
        this.field184 = field184;
        this.field185 = field185;
        this.field186 = field186;
    }
    
    public int size() {
        return this.field184.size() + this.field185.size();
    }
    
    public boolean forMergedIndexes(final IConsumer class9015) {
        return this.field186 ? this.method446((n, n2, n3) -> class9015.merge(n2, n, n3)) : this.method446(class9015);
    }
    
    private boolean method446(final IConsumer class9015) {
        final int n = this.field184.size() - 1;
        for (int i = 0; i < n; ++i) {
            if (!class9015.merge(i, -1, i)) {
                return false;
            }
        }
        if (class9015.merge(n, -1, n)) {
            for (int j = 0; j < this.field185.size(); ++j) {
                if (!class9015.merge(n, j, n + 1 + j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public double getDouble(final int n) {
        return (n >= this.field184.size()) ? this.field185.getDouble(n - this.field184.size()) : this.field184.getDouble(n);
    }
    
    public DoubleList func_212435_a() {
        return (DoubleList)this;
    }
}
