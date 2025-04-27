// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1972 implements Class1967
{
    field10833(0, Class5260.field22289),
    field10834(1, Class5260.field22304),
    field10835(2, Class5260.field22296),
    field10836(3, Class5260.field22302),
    field10837(4, Class5260.field22308),
    field10838(5, Class5260.field22328),
    field10839(6, Class5260.field22321),
    field10840(7, Class5260.field22320),
    field10841(-1, Class5260.field22317);
    
    private final int field10842;
    private final Class5260 field10843;
    
    public static Class1972 method7974(final int n) {
        return values()[n];
    }
    
    Class1972(final int field10842, final Class5260 field10843) {
        this.field10842 = field10842;
        this.field10843 = field10843;
    }
    
    @Override
    public int method7968() {
        return this.field10842;
    }
    
    @Override
    public Class5260 method7969() {
        return this.field10843;
    }
}
