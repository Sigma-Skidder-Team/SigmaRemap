// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1969 implements Class1967
{
    field10775(0, Class5260.field22289),
    field10776(1, Class5260.field22312),
    field10777(2, Class5260.field22302),
    field10778(3, Class5260.field22308),
    field10779(4, Class5260.field22308),
    field10780(5, Class5260.field22325),
    field10781(6, Class5260.field22333),
    field10782(7, Class5260.field22294),
    field10783(8, Class5260.field22320),
    field10784(9, Class5260.field22318),
    field10785(10, Class5260.field22326),
    field10786(11, Class5260.field22312),
    field10787(12, Class5260.field22324),
    field10788(13, Class5260.field22312),
    field10789(14, Class5260.field22322),
    field10790(15, Class8609.field36137),
    field10791(99, null);
    
    private final int field10792;
    private final Class5260 field10793;
    
    public static Class1969 method7971(final int n) {
        return values()[n];
    }
    
    Class1969(final int field10792, final Class5260 field10793) {
        this.field10792 = field10792;
        this.field10793 = field10793;
    }
    
    @Override
    public int method7968() {
        return this.field10792;
    }
    
    @Override
    public Class5260 method7969() {
        return this.field10793;
    }
}
