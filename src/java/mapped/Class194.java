// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class194 extends Class205
{
    default <R extends Class6631> Class7538<R> method836(final Class6432<R> class6432, final Class7538<R> class6433) {
        return () -> {
            final Class6631 method23618 = class6433.method23618();
            return class6432.method19193((n, n2) -> {
                class6432.method19188(n, n2);
                return this.method835(class6432, method23618, n, n2);
            }, method23618);
        };
    }
    
    int method835(final Class6432<?> p0, final Class6631 p1, final int p2, final int p3);
}
