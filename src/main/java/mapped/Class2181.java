// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2181
{
    field12917, 
    field12918, 
    field12919;
    
    public int method8343(final int n, final int n2) {
        final int n3 = n2 / 2;
        final int n4 = (n > n3) ? (n - n2) : n;
        switch (Class7913.field32493[this.ordinal()]) {
            case 1: {
                return (n2 - n4) % n2;
            }
            case 2: {
                return (n3 - n4 + n2) % n2;
            }
            default: {
                return n;
            }
        }
    }
    
    public Class2052 method8344(final Class179 class179) {
        final Class111 method790 = class179.method790();
        return ((this != Class2181.field12918 || method790 != Class111.field353) && (this != Class2181.field12919 || method790 != Class111.field351)) ? Class2052.field11707 : Class2052.field11709;
    }
    
    public Class179 method8345(final Class179 class179) {
        if (this == Class2181.field12919 && class179.method790() == Class111.field351) {
            return class179.method782();
        }
        return (this == Class2181.field12918 && class179.method790() == Class111.field353) ? class179.method782() : class179;
    }
}
