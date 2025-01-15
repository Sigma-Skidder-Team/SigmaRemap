// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class284
{
    field1565("this", (Class7915<?>)Class6683.field26362), 
    field1566("killer", (Class7915<?>)Class6683.field26365), 
    field1567("killer_player", (Class7915<?>)Class6683.field26363), 
    field1568("block_entity", (Class7915<?>)Class6683.field26369);
    
    public final String field1569;
    public final Class7915<?> field1570;
    
    private Class284(final String field1569, final Class7915<?> field1570) {
        this.field1569 = field1569;
        this.field1570 = field1570;
    }
    
    public static Class284 method931(final String s) {
        for (final Class284 class284 : values()) {
            if (class284.field1569.equals(s)) {
                return class284;
            }
        }
        throw new IllegalArgumentException("Invalid name source " + s);
    }
}
