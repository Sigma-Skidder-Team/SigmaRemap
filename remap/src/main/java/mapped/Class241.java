// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class241
{
    field1181(Blocks.OAK_PLANKS, "oak"),
    field1182(Blocks.SPRUCE_PLANKS, "spruce"),
    field1183(Blocks.BIRCH_PLANKS, "birch"),
    field1184(Blocks.JUNGLE_PLANKS, "jungle"),
    field1185(Blocks.ACACIA_PLANKS, "acacia"),
    field1186(Blocks.DARK_OAK_PLANKS, "dark_oak");
    
    private final String field1187;
    private final Block field1188;
    
    private Class241(final Block field1188, final String field1189) {
        this.field1187 = field1189;
        this.field1188 = field1188;
    }
    
    public String method890() {
        return this.field1187;
    }
    
    public Block method891() {
        return this.field1188;
    }
    
    @Override
    public String toString() {
        return this.field1187;
    }
    
    public static Class241 method892(int n) {
        final Class241[] values = values();
        if (n < 0 || n >= values.length) {
            n = 0;
        }
        return values[n];
    }
    
    public static Class241 method893(final String anObject) {
        final Class241[] values = values();
        for (int i = 0; i < values.length; ++i) {
            if (values[i].method890().equals(anObject)) {
                return values[i];
            }
        }
        return values[0];
    }
}
