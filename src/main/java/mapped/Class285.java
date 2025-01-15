// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class285
{
    field1572((byte)0, false), 
    field1573((byte)1, true), 
    field1574((byte)2, true);
    
    private final byte field1575;
    private final boolean field1576;
    
    private Class285(final byte field1575, final boolean field1576) {
        this.field1575 = field1575;
        this.field1576 = field1576;
    }
    
    public byte method932() {
        return this.field1575;
    }
    
    public static Class285 method933(final byte b) {
        for (final Class285 class285 : values()) {
            if (b == class285.field1575) {
                return class285;
            }
        }
        return Class285.field1572;
    }
    
    public boolean method934() {
        return this.field1576;
    }
}
