// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class DoubleRangeList extends AbstractDoubleList
{
    private final int field_197854_a;
    
    public DoubleRangeList(final int field_197854_a) {
        this.field_197854_a = field_197854_a;
    }
    
    public double getDouble(final int n) {
        return n / (double)this.field_197854_a;
    }
    
    public int size() {
        return this.field_197854_a + 1;
    }
}
