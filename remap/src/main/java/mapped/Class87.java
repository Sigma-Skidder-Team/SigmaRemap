// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class Class87 extends AbstractDoubleList
{
    private static String[] field198;
    private final DoubleList field199;
    private final double field200;
    
    public Class87(final DoubleList field199, final double field200) {
        this.field199 = field199;
        this.field200 = field200;
    }
    
    public double getDouble(final int n) {
        return this.field199.getDouble(n) + this.field200;
    }
    
    public int size() {
        return this.field199.size();
    }
}
