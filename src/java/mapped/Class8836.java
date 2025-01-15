// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8836
{
    private static String[] field37136;
    private final long[] field37137;
    private int field37138;
    private int field37139;
    
    public Class8836(final int n) {
        this.field37137 = new long[n];
    }
    
    public long method30857(final long n) {
        if (this.field37138 < this.field37137.length) {
            ++this.field37138;
        }
        this.field37137[this.field37139] = n;
        this.field37139 = (this.field37139 + 1) % this.field37137.length;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long n2 = 0L;
        for (int i = 0; i < this.field37138; ++i) {
            final long n3 = this.field37137[i];
            n2 += n3;
            min = Math.min(min, n3);
            max = Math.max(max, n3);
        }
        if (this.field37138 <= 2) {
            return (n2 <= 0L) ? 0L : (this.field37138 / n2);
        }
        return (n2 - (min + max)) / (this.field37138 - 2);
    }
}
