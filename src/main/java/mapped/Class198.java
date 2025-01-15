// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class198 extends Class205
{
    default <R extends Class6631> Class7538<R> method842(final Class6432<R> class6432, final Class7538<R> class6433, final Class7538<R> class6434) {
        return () -> {
            final Class6631 method23618 = class6433.method23618();
            final Class6631 method23619 = class6434.method23618();
            return class6432.method19192((n, n2) -> {
                class6432.method19188(n, n2);
                return this.method841(class6432, method23618, method23619, n, n2);
            }, method23618, method23619);
        };
    }
    
    int method841(final Class6433 p0, final Class6631 p1, final Class6631 p2, final int p3, final int p4);
}
