// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public enum Class1962
{
    field10704(new Class8859[] { new Class8859(Class6352.field25404, Class6352.field25403, Class6352.field25399, null), new Class8859(Class6352.field25404, Class6352.field25403, Class6352.field25402, null), new Class8859(Class6352.field25401, Class6352.field25403, Class6352.field25402, null), new Class8859(Class6352.field25401, Class6352.field25403, Class6352.field25399, null) }), 
    field10705(new Class8859[] { new Class8859(Class6352.field25404, Class6352.field25400, Class6352.field25402, null), new Class8859(Class6352.field25404, Class6352.field25400, Class6352.field25399, null), new Class8859(Class6352.field25401, Class6352.field25400, Class6352.field25399, null), new Class8859(Class6352.field25401, Class6352.field25400, Class6352.field25402, null) }), 
    field10706(new Class8859[] { new Class8859(Class6352.field25401, Class6352.field25400, Class6352.field25402, null), new Class8859(Class6352.field25401, Class6352.field25403, Class6352.field25402, null), new Class8859(Class6352.field25404, Class6352.field25403, Class6352.field25402, null), new Class8859(Class6352.field25404, Class6352.field25400, Class6352.field25402, null) }), 
    field10707(new Class8859[] { new Class8859(Class6352.field25404, Class6352.field25400, Class6352.field25399, null), new Class8859(Class6352.field25404, Class6352.field25403, Class6352.field25399, null), new Class8859(Class6352.field25401, Class6352.field25403, Class6352.field25399, null), new Class8859(Class6352.field25401, Class6352.field25400, Class6352.field25399, null) }), 
    field10708(new Class8859[] { new Class8859(Class6352.field25404, Class6352.field25400, Class6352.field25402, null), new Class8859(Class6352.field25404, Class6352.field25403, Class6352.field25402, null), new Class8859(Class6352.field25404, Class6352.field25403, Class6352.field25399, null), new Class8859(Class6352.field25404, Class6352.field25400, Class6352.field25399, null) }), 
    field10709(new Class8859[] { new Class8859(Class6352.field25401, Class6352.field25400, Class6352.field25399, null), new Class8859(Class6352.field25401, Class6352.field25403, Class6352.field25399, null), new Class8859(Class6352.field25401, Class6352.field25403, Class6352.field25402, null), new Class8859(Class6352.field25401, Class6352.field25400, Class6352.field25402, null) });
    
    private static final Class1962[] field10710;
    private final Class8859[] field10711;
    
    public static Class1962 method7951(final Direction class179) {
        return Class1962.field10710[class179.getIndex()];
    }
    
    private Class1962(final Class8859[] field10711) {
        this.field10711 = field10711;
    }
    
    public Class8859 method7952(final int n) {
        return this.field10711[n];
    }
    
    static {
        field10710 = Util.method27851(new Class1962[6], array -> {
            array[Class6352.field25403] = Class1962.field10704;
            array[Class6352.field25400] = Class1962.field10705;
            array[Class6352.field25402] = Class1962.field10706;
            array[Class6352.field25399] = Class1962.field10707;
            array[Class6352.field25404] = Class1962.field10708;
            array[Class6352.field25401] = Class1962.field10709;
        });
    }
}
