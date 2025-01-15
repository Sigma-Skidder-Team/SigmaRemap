// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class207 extends Class194, Class196
{
    int method845(final Class6433 p0, final int p1);
    
    default int method835(final Class6432<?> class6432, final Class6631 class6433, final int n, final int n2) {
        return this.method845(class6432, class6433.method20074(this.method839(n + 1), this.method840(n2 + 1)));
    }
}
