// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1966 implements Class1967
{
    field10735(0, Class5260.field22289),
    field10736(1, Class5260.field22312),
    field10737(2, Class5260.field22302),
    field10738(3, Class5260.field22308),
    field10739(4, Class5260.field22308),
    field10740(5, Class5260.field22325),
    field10741(6, Class5260.field22334),
    field10742(7, Class5260.field22294),
    field10743(8, Class5260.field22320),
    field10744(9, Class5260.field22319),
    field10745(10, Class5260.field22327),
    field10746(11, Class5260.field22312),
    field10747(12, Class5260.field22324),
    field10748(13, Class5260.field22312),
    field10749(14, Class5260.field22322),
    field10750(15, Class8761.field36786),
    field10751(16, Class5260.field22332),
    field10752(17, Class5260.field22314),
    field10753(18, Class5260.field22312),
    field10754(99, null);
    
    private final int field10755;
    private final Class5260 field10756;
    
    public static Class1966 method7967(final int n) {
        return values()[n];
    }
    
    Class1966(final int field10755, final Class5260 field10756) {
        this.field10755 = field10755;
        this.field10756 = field10756;
    }
    
    @Override
    public int method7968() {
        return this.field10755;
    }
    
    @Override
    public Class5260 method7969() {
        return this.field10756;
    }
}
