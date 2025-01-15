// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class Class81 extends AbstractDoubleList
{
    private static String[] field181;
    private final int field182;
    
    public Class81(final int field182) {
        this.field182 = field182;
    }
    
    public double getDouble(final int n) {
        return n / (double)this.field182;
    }
    
    public int size() {
        return this.field182 + 1;
    }
}
