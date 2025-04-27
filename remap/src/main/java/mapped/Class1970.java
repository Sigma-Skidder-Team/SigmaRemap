// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1970 implements Class1967
{
    field10795(0, Class5260.field22289),
    field10796(1, Class5260.field22312),
    field10797(2, Class5260.field22302),
    field10798(3, Class5260.field22308),
    field10799(4, Class5260.field22308),
    field10800(5, Class5260.field22325),
    field10801(6, Class5260.field22334),
    field10802(7, Class5260.field22294),
    field10803(8, Class5260.field22320),
    field10804(9, Class5260.field22318),
    field10805(10, Class5260.field22326),
    field10806(11, Class5260.field22312),
    field10807(12, Class5260.field22324),
    field10808(13, Class5260.field22312),
    field10809(14, Class5260.field22322),
    field10810(15, Class7964.field32732),
    field10811(99, null);
    
    private final int field10812;
    private final Class5260 field10813;
    
    public static Class1970 method7972(final int n) {
        return values()[n];
    }
    
    Class1970(final int field10812, final Class5260 field10813) {
        this.field10812 = field10812;
        this.field10813 = field10813;
    }
    
    @Override
    public int method7968() {
        return this.field10812;
    }
    
    @Override
    public Class5260 method7969() {
        return this.field10813;
    }
}
