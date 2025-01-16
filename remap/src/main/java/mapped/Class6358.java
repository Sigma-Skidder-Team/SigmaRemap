// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class Class6358 extends Class6354
{
    private LongSet field25437;
    
    public Class6358() {
        super("chunks");
        this.field25437 = (LongSet)new LongOpenHashSet();
    }
    
    @Override
    public void method18901(final CompoundNBT class51) {
        this.field25437 = (LongSet)new LongOpenHashSet(class51.method326("Forced"));
    }
    
    @Override
    public CompoundNBT method18902(final CompoundNBT class51) {
        class51.putLongArray("Forced", this.field25437.toLongArray());
        return class51;
    }
    
    public LongSet method18933() {
        return this.field25437;
    }
}
