// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class258
{
    field1229(0), 
    field1230(1), 
    field1231(2);
    
    public int field1232;
    
    Class258(final int field1232) {
        this.field1232 = field1232;
    }
    
    public Class258 method896() {
        for (final Class258 class258 : values()) {
            if (class258.field1232 == this.field1232 + 1) {
                return class258;
            }
        }
        return Class258.field1229;
    }
    
    public static Class258 method897(final int n) {
        for (final Class258 class258 : values()) {
            if (class258.field1232 == n) {
                return class258;
            }
        }
        return Class258.field1230;
    }
}
