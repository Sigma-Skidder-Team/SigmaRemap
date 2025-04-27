// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1983
{
    field10981("red", Blocks.RED_MUSHROOM.getDefaultState()),
    field10982("brown", Blocks.BROWN_MUSHROOM.getDefaultState());
    
    private final String field10983;
    private final BlockState field10984;
    
    Class1983(final String field10983, final BlockState field10984) {
        this.field10983 = field10983;
        this.field10984 = field10984;
    }
    
    public BlockState method7992() {
        return this.field10984;
    }
    
    private static Class1983 method7993(final String anObject) {
        for (final Class1983 class1983 : values()) {
            if (class1983.field10983.equals(anObject)) {
                return class1983;
            }
        }
        return Class1983.field10981;
    }
}
