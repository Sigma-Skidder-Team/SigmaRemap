// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;

public abstract class Class1892 extends Class1891
{
    public Class1892(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    @Override
    public boolean method7300(final long n) {
        return n == ChunkPos.field32289;
    }
    
    @Override
    public void method7326(final long n, final int n2, final boolean b) {
        final ChunkPos class7859 = new ChunkPos(n);
        final int field32290 = class7859.field32290;
        final int field32291 = class7859.field32291;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                final long method25423 = ChunkPos.method25423(field32290 + i, field32291 + j);
                if (method25423 != n) {
                    this.method7322(n, method25423, n2, b);
                }
            }
        }
    }
    
    @Override
    public int method7301(final long n, final long n2, final int n3) {
        int n4 = n3;
        final ChunkPos class7859 = new ChunkPos(n);
        final int field32290 = class7859.field32290;
        final int field32291 = class7859.field32291;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                long n5 = ChunkPos.method25423(field32290 + i, field32291 + j);
                if (n5 == n) {
                    n5 = ChunkPos.field32289;
                }
                if (n5 != n2) {
                    final int method7305 = this.method7305(n5, n, this.method7302(n5));
                    if (n4 > method7305) {
                        n4 = method7305;
                    }
                    if (n4 == 0) {
                        return n4;
                    }
                }
            }
        }
        return n4;
    }
    
    @Override
    public int method7305(final long n, final long n2, final int n3) {
        return (n != ChunkPos.field32289) ? (n3 + 1) : this.method7328(n2);
    }
    
    public abstract int method7328(final long p0);
    
    public void method7329(final long n, final int n2, final boolean b) {
        this.method7320(ChunkPos.field32289, n, n2, b);
    }
}
