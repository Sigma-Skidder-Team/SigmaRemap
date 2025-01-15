// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class Class86 implements Class83
{
    private static String[] field196;
    private final DoubleList field197;
    
    public Class86(final DoubleList field197) {
        this.field197 = field197;
    }
    
    @Override
    public boolean method445(final Class9015 class9015) {
        for (int i = 0; i <= this.field197.size(); ++i) {
            if (!class9015.method32279(i, i, i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public DoubleList method447() {
        return this.field197;
    }
}
