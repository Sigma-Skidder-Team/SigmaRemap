// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1955
{
    field10639(-3), 
    field10640(-2), 
    field10641(-1), 
    field10642(0), 
    field10643(1), 
    field10644(2), 
    field10645(3);
    
    private final int field10646;
    
    Class1955(final int field10646) {
        this.field10646 = field10646;
    }
    
    public static Class1955 method7940(final int n) {
        for (final Class1955 class1955 : values()) {
            if (class1955.field10646 == n) {
                return class1955;
            }
        }
        return (n >= Class1955.field10639.field10646) ? Class1955.field10645 : Class1955.field10639;
    }
    
    public int method7941() {
        return this.field10646;
    }
}
