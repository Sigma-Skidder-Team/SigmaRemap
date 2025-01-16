// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class Class86 implements IDoubleListMerger
{
    private static String[] field196;
    private final DoubleList field197;
    
    public Class86(final DoubleList field197) {
        this.field197 = field197;
    }
    
    @Override
    public boolean forMergedIndexes(final IConsumer class9015) {
        for (int i = 0; i <= this.field197.size(); ++i) {
            if (!class9015.merge(i, i, i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public DoubleList func_212435_a() {
        return this.field197;
    }
}
