// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2088
{
    field12071(0, "Survival Mode"), 
    field12072(1, "Creative Mode"), 
    field12073(2, "Adventure Mode"), 
    field12074(3, "Spectator Mode");
    
    private final int field12075;
    private final String field12076;
    
    public static Class2088 method8205(final int n) {
        for (final Class2088 class2088 : values()) {
            if (class2088.method8206() == n) {
                return class2088;
            }
        }
        return null;
    }
    
    Class2088(final int field12075, final String field12076) {
        this.field12075 = field12075;
        this.field12076 = field12076;
    }
    
    public int method8206() {
        return this.field12075;
    }
    
    public String method8207() {
        return this.field12076;
    }
}
