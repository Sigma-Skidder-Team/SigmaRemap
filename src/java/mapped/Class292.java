// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class292
{
    default <R extends Class6631> Class7538<R> method944(final Class6432<R> class6432) {
        return () -> class6432.method19194((n, n2) -> {
            class6432.method19188(n, n2);
            return this.method943(class6432, n, n2);
        });
    }
    
    int method943(final Class6433 p0, final int p1, final int p2);
}
