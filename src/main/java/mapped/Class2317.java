// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class2317 extends Random
{
    private static String[] field14046;
    private int field14047;
    
    public Class2317() {
    }
    
    public Class2317(final long seed) {
        super(seed);
    }
    
    public void method9436(final int n) {
        for (int i = 0; i < n; ++i) {
            this.next(1);
        }
    }
    
    public int next(final int bits) {
        ++this.field14047;
        return super.next(bits);
    }
    
    public long method9437(final int n, final int n2) {
        final long seed = n * 341873128712L + n2 * 132897987541L;
        this.setSeed(seed);
        return seed;
    }
    
    public long method9438(final long seed, final int n, final int n2) {
        this.setSeed(seed);
        final long seed2 = n * (this.nextLong() | 0x1L) + n2 * (this.nextLong() | 0x1L) ^ seed;
        this.setSeed(seed2);
        return seed2;
    }
    
    public long method9439(final long n, final int n2, final int n3) {
        final long seed = n + n2 + 10000 * n3;
        this.setSeed(seed);
        return seed;
    }
    
    public long method9440(final long seed, final int n, final int n2) {
        this.setSeed(seed);
        final long seed2 = n * this.nextLong() ^ n2 * this.nextLong() ^ seed;
        this.setSeed(seed2);
        return seed2;
    }
    
    public long method9441(final long n, final int n2, final int n3, final int n4) {
        final long seed = n2 * 341873128712L + n3 * 132897987541L + n + n4;
        this.setSeed(seed);
        return seed;
    }
    
    public static Random method9442(final int n, final int n2, final long n3, final long n4) {
        return new Random(n3 + n * n * 4987142 + n * 5947611 + n2 * n2 * 4392871L + n2 * 389711 ^ n4);
    }
}
