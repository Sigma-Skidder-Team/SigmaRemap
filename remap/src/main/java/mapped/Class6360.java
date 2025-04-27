// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class Class6360 extends Class6354
{
    private LongSet field25441;
    private LongSet field25442;
    
    public Class6360(final String s) {
        super(s);
        this.field25441 = new LongOpenHashSet();
        this.field25442 = new LongOpenHashSet();
    }
    
    @Override
    public void method18901(final CompoundNBT class51) {
        this.field25441 = new LongOpenHashSet(class51.method326("All"));
        this.field25442 = new LongOpenHashSet(class51.method326("Remaining"));
    }
    
    @Override
    public CompoundNBT method18902(final CompoundNBT class51) {
        class51.putLongArray("All", this.field25441.toLongArray());
        class51.putLongArray("Remaining", this.field25442.toLongArray());
        return class51;
    }
    
    public void method18943(final long n) {
        this.field25441.add(n);
        this.field25442.add(n);
    }
    
    public boolean method18944(final long n) {
        return this.field25441.contains(n);
    }
    
    public boolean method18945(final long n) {
        return this.field25442.contains(n);
    }
    
    public void method18946(final long n) {
        this.field25442.remove(n);
    }
    
    public LongSet method18947() {
        return this.field25441;
    }
}
