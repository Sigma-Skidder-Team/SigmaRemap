// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class195 extends Class194, Class196
{
    int method832(final Class6433 p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    default int method835(final Class6432<?> class6432, final Class6631 class6433, final int n, final int n2) {
        return this.method832(class6432, class6433.method20074(this.method839(n), this.method840(n2 + 2)), class6433.method20074(this.method839(n + 2), this.method840(n2 + 2)), class6433.method20074(this.method839(n + 2), this.method840(n2)), class6433.method20074(this.method839(n), this.method840(n2)), class6433.method20074(this.method839(n + 1), this.method840(n2 + 1)));
    }
}
