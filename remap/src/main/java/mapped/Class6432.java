// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class6432<R extends Class6631> extends Class6433
{
    void method19188(final long p0, final long p1);
    
    R method19194(final Class8610 p0);
    
    default R method19193(final Class8610 class8610, final R r) {
        return this.method19194(class8610);
    }
    
    default R method19192(final Class8610 class8610, final R r, final R r2) {
        return this.method19194(class8610);
    }
    
    default int method19195(final int n, final int n2) {
        return (this.method19189(2) != 0) ? n2 : n;
    }
    
    default int method19196(final int n, final int n2, final int n3, final int n4) {
        final int method19189 = this.method19189(4);
        if (method19189 == 0) {
            return n;
        }
        if (method19189 != 1) {
            return (method19189 != 2) ? n4 : n3;
        }
        return n2;
    }
}
