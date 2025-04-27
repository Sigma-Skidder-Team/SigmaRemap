// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1971 implements Class1967
{
    field10815(0, Class5260.field22289),
    field10816(1, Class5260.field22312),
    field10817(2, Class5260.field22302),
    field10818(3, Class5260.field22308),
    field10819(4, Class5260.field22308),
    field10820(5, Class5260.field22328),
    field10821(6, Class5260.field22294),
    field10822(7, Class5260.field22320),
    field10823(8, Class5260.field22318),
    field10824(9, Class5260.field22326),
    field10825(10, Class5260.field22312),
    field10826(11, Class5260.field22324),
    field10827(12, Class5260.field22312),
    field10828(13, Class5260.field22322),
    field10829(99, null);
    
    private final int field10830;
    private final Class5260 field10831;
    
    public static Class1971 method7973(final int n) {
        return values()[n];
    }
    
    Class1971(final int field10830, final Class5260 field10831) {
        this.field10830 = field10830;
        this.field10831 = field10831;
    }
    
    @Override
    public int method7968() {
        return this.field10830;
    }
    
    @Override
    public Class5260 method7969() {
        return this.field10831;
    }
}
