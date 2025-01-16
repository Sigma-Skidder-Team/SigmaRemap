// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public interface IDoubleListMerger
{
    DoubleList func_212435_a();
    
    boolean forMergedIndexes(final IConsumer p0);

    public interface IConsumer
    {
        boolean merge(int p_merge_1_, int p_merge_2_, int p_merge_3_);
    }
}
