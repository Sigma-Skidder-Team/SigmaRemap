// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;

public class Class8603
{
    private static String[] field36116;
    private final BitSet field36117;
    
    public Class8603() {
        this.field36117 = new BitSet();
    }
    
    public void method29170(final int fromIndex, final int n) {
        this.field36117.set(fromIndex, fromIndex + n);
    }
    
    public void method29171(final int fromIndex, final int n) {
        this.field36117.clear(fromIndex, fromIndex + n);
    }
    
    public int method29172(final int n) {
        int fromIndex = 0;
        int nextClearBit;
        while (true) {
            nextClearBit = this.field36117.nextClearBit(fromIndex);
            final int nextSetBit = this.field36117.nextSetBit(nextClearBit);
            if (nextSetBit == -1 || nextSetBit - nextClearBit >= n) {
                break;
            }
            fromIndex = nextSetBit;
        }
        this.method29170(nextClearBit, n);
        return nextClearBit;
    }
}
